package org.sunflow.core.shader;

import org.sunflow.SunflowAPI;
import org.sunflow.core.LightSample;
import org.sunflow.core.ParameterList;
import org.sunflow.core.Ray;
import org.sunflow.core.Shader;
import org.sunflow.core.ShadingState;
import org.sunflow.core.Texture;
import org.sunflow.core.TextureCache;
import org.sunflow.image.Color;
import org.sunflow.math.Point3;
import org.sunflow.math.Vector3;

public class FogShader implements Shader{
	private float scatter;
	private float absorption;
	
	public boolean update(ParameterList pl, SunflowAPI api) {
		scatter = pl.getFloat("scatter", scatter);
		absorption = pl.getFloat("absorption", absorption);
        return true;
    }

	public Color getRadiance(ShadingState state) {
		Color sum = new Color(0f);
		Point3 hitP = new Point3(state.getPoint());
		Vector3 dir = state.getRay().getDirection();
		Point3 PP = new Point3(hitP.x + 0.01f * dir.x, hitP.y + 0.01f * dir.y, hitP.z + 0.01f * dir.z);

		Ray ray = new Ray(PP, dir);
		float path = state.traceDepth(ray).getLuminance();
		float total = 0;

		while (path != 0) {
			total += path;
			Point3 dest = new Point3();
			ray.getPoint(dest);
			PP = new Point3(dest.x + 0.01f * dir.x, dest.y + 0.01f * dir.y, dest.z + 0.01f * dir.z);
			ray = new Ray(PP, dir);
			path = state.traceDepth(ray).getLuminance();
			sum.add(state.objectColor(ray));
		}

		float so = 0, si = 0;
		float extinction = scatter + absorption;
		float sampleX, sampleY, sampleZ;
		float x = 1f;
		
		float deltaX = total / x;
		for (float i = 1; i <= x; i++) {
			so = deltaX * (i - 0.5f);
			sampleX = hitP.x + dir.x * so;
			sampleY = hitP.y + dir.y * so;
			sampleZ = hitP.z + dir.z * so;
			Point3 sampleP = new Point3(sampleX, sampleY, sampleZ);
			state.setPoint(sampleP);
			state.initLightSamples();

			float count = 0f;
			Color temp = new Color(0f);
			for (LightSample sample : state) {
				//Vector3 dirP = sample.getShadowRay().getDirection();
				//Point3 P = new Point3(sampleP.x + 0.01f * dir.x, sampleP.y + 0.01f * dir.y, sampleP.z + 0.01f * dir.z);
				//si = state.traceDepth(new Ray(P, dirP)).getLuminance();
				si = sampleP.distanceTo(sample.getCenter());
				Color sampleR = new Color(sample.getDiffuseRadiance());
				float index = (-extinction * (so + si) / 1000f);
				float dx = deltaX / 1000f;
				sampleR.mul((float) (scatter * Math.exp(index)) * dx);
				temp.add(sampleR);
				count++;

			}
			//if (count != 0)
				//temp.div(new Color(count));
			sum.add(temp);
		}
		state.setPoint(hitP);

		return sum;
	}

    public void scatterPhoton(ShadingState state, Color power) {
    }
}
