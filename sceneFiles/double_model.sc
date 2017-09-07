image {
  resolution 512 384
  aa 0 1
}

shader {
name constantShader
type constant
color 0.2f 0.6f 0.8f
}

light {
type spherical
color { "sRGB nonlinear" 0.8 0.8 0.48 }
radiance 40
center 0 0 0
radius 20
samples 4
}

camera {
  type pinhole
  eye    0 1000 0
  target 0 0 0
  up     0 0 1
  fov    60
  aspect 1.333333
}

shader {
name fogShader
type fog
scatter 1
absorption 1
}

object {
  shader fogShader
  type mesh
  name fog
  8 12
  v -600 50 -500 0.196149 0.124835 0.972595 0 0
  v -600 50 500 0.196149 0.124835 0.972595 0 0
  v 600 50 -500 0.196149 0.124835 0.972595 0 0
  v 600 50 500 0.196149 0.124835 0.972595 0 0
  v -600 -50 -500 0.196149 0.124835 0.972595 0 0
  v -600 -50 500 0.196149 0.124835 0.972595 0 0
  v 600 -50 -500 0.196149 0.124835 0.972595 0 0
  v 600 -50 500 0.196149 0.124835 0.972595 0 0
  t 0 1 3
  t 0 3 2
  t 0 4 2
  t 4 2 6
  t 0 1 5
  t 0 5 4
  t 2 3 6
  t 3 6 7
  t 1 3 5
  t 3 5 7
  t 4 5 7
  t 4 6 7
}

light {
type spherical
color { "sRGB nonlinear" 0.9225489 0.9225489 0.9225489 }
radiance 8.486975
center 355.12292 0 112.995544
radius 0.8779842853546143
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41752416 0.41752416 0.41752416 }
radiance 8.244823
center -512.83417 0 276.10345
radius 0.6684041023254395
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7693745 0.7693745 0.7693745 }
radiance 13.975073
center 416.4792 0 -423.06436
radius 4.270693778991699
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5792942 0.5792942 0.5792942 }
radiance 11.867997
center 14.396606 0 101.78937
radius 1.2529187202453613
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.82052255 0.82052255 0.82052255 }
radiance 13.854378
center -399.25037 0 -49.105225
radius 2.70550274848938
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4070948 0.4070948 0.4070948 }
radiance 15.772764
center -213.93613 0 -101.68283
radius 0.6173946857452393
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.90806484 0.90806484 0.90806484 }
radiance 14.132064
center -151.80737 0 35.490356
radius 2.1945481300354004
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7218747 0.7218747 0.7218747 }
radiance 5.4330854
center -256.44522 0 74.945984
radius 4.351257085800171
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.68994266 0.68994266 0.68994266 }
radiance 15.965241
center 124.91553 0 50.678223
radius 3.974027156829834
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.54019195 0.54019195 0.54019195 }
radiance 9.3718195
center 270.7126 0 23.14862
radius 2.1156628131866455
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.65055525 0.65055525 0.65055525 }
radiance 7.1877933
center -505.01984 0 -103.739136
radius 0.8156204223632812
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9743284 0.9743284 0.9743284 }
radiance 9.270065
center -585.9137 0 -305.2801
radius 2.383213520050049
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.67786825 0.67786825 0.67786825 }
radiance 6.2555876
center 41.163086 0 312.33075
radius 3.8319525718688965
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.62606996 0.62606996 0.62606996 }
radiance 4.8322763
center -445.2351 0 110.93524
radius 4.381709814071655
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4682153 0.4682153 0.4682153 }
radiance 13.6498575
center -527.41504 0 210.84503
radius 2.318636655807495
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41602194 0.41602194 0.41602194 }
radiance 12.877031
center 535.8535 0 314.9171
radius 2.7677552700042725
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7761816 0.7761816 0.7761816 }
radiance 13.854335
center 545.74316 0 -176.67746
radius 1.7505898475646973
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8947282 0.8947282 0.8947282 }
radiance 9.659741
center 497.47937 0 83.89789
radius 0.711557149887085
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.78473127 0.78473127 0.78473127 }
radiance 8.505192
center 451.78772 0 253.92108
radius 1.601834774017334
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4407984 0.4407984 0.4407984 }
radiance 7.55968
center -305.212 0 438.16608
radius 2.2328600883483887
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.89902353 0.89902353 0.89902353 }
radiance 9.787806
center -526.60547 0 422.05878
radius 3.1217997074127197
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9572594 0.9572594 0.9572594 }
radiance 5.630547
center 299.2411 0 375.38287
radius 1.2799441814422607
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4869222 0.4869222 0.4869222 }
radiance 13.912545
center 111.111206 0 172.48438
radius 2.116299629211426
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.62073547 0.62073547 0.62073547 }
radiance 7.1626706
center 383.7398 0 2.96109
radius 3.5750203132629395
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.62633395 0.62633395 0.62633395 }
radiance 11.493771
center 392.7909 0 -308.82288
radius 0.7730679512023926
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.90067315 0.90067315 0.90067315 }
radiance 7.405158
center 373.10748 0 -346.2541
radius 1.178650140762329
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.60170186 0.60170186 0.60170186 }
radiance 11.776652
center -400.32092 0 433.53412
radius 4.44432520866394
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.67399323 0.67399323 0.67399323 }
radiance 7.468608
center 427.2423 0 -14.937042
radius 4.178365468978882
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5291337 0.5291337 0.5291337 }
radiance 11.7353525
center 92.588196 0 455.50165
radius 3.287120819091797
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.97998834 0.97998834 0.97998834 }
radiance 4.418675
center 346.25177 0 -446.90173
radius 2.397045612335205
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6592989 0.6592989 0.6592989 }
radiance 12.278964
center 136.27405 0 478.38623
radius 3.3974454402923584
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5650949 0.5650949 0.5650949 }
radiance 4.427329
center -386.3709 0 122.24628
radius 4.393344163894653
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7437812 0.7437812 0.7437812 }
radiance 5.041235
center 280.59625 0 252.1095
radius 4.207498073577881
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44041348 0.44041348 0.44041348 }
radiance 7.6722217
center 178.47223 0 -28.06549
radius 2.867570161819458
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8166076 0.8166076 0.8166076 }
radiance 6.4722404
center 455.45935 0 -129.8294
radius 2.159691333770752
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6388191 0.6388191 0.6388191 }
radiance 5.421047
center -69.03546 0 439.3919
radius 1.4420077800750732
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.72336596 0.72336596 0.72336596 }
radiance 14.580542
center -13.188293 0 439.43854
radius 3.4433422088623047
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8764462 0.8764462 0.8764462 }
radiance 10.987818
center 324.0285 0 -66.81073
radius 3.9788665771484375
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.720885 0.720885 0.720885 }
radiance 15.881426
center 456.87817 0 323.12988
radius 0.5010406970977783
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7482486 0.7482486 0.7482486 }
radiance 4.0215335
center -557.0204 0 -408.41275
radius 2.299828290939331
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4452967 0.4452967 0.4452967 }
radiance 11.875496
center -499.26468 0 -119.5426
radius 3.8009493350982666
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4314147 0.4314147 0.4314147 }
radiance 15.127293
center -495.60858 0 -126.97858
radius 3.533639907836914
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8483151 0.8483151 0.8483151 }
radiance 5.477785
center 291.59167 0 134.96686
radius 4.211638450622559
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46169305 0.46169305 0.46169305 }
radiance 8.520211
center 532.0242 0 427.25763
radius 0.5704445838928223
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9250934 0.9250934 0.9250934 }
radiance 4.2360554
center 485.74182 0 -430.01712
radius 2.7436044216156006
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.73265123 0.73265123 0.73265123 }
radiance 11.950662
center 314.51764 0 36.116882
radius 2.968893527984619
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8735088 0.8735088 0.8735088 }
radiance 14.854968
center 59.464233 0 485.1471
radius 1.6868019104003906
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.749247 0.749247 0.749247 }
radiance 9.556436
center -448.29285 0 -483.0873
radius 1.2686569690704346
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45395777 0.45395777 0.45395777 }
radiance 10.127625
center -20.129456 0 19.551697
radius 2.3039371967315674
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301277 0.8301277 0.8301277 }
radiance 9.852025
center -164.39038 0 -59.895203
radius 1.4565119743347168
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41078568 0.41078568 0.41078568 }
radiance 12.40901
center 561.9325 0 -49.03763
radius 1.4191200733184814
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8513224 0.8513224 0.8513224 }
radiance 10.691662
center -539.28955 0 -264.7
radius 3.7781076431274414
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.962481 0.962481 0.962481 }
radiance 4.091223
center 68.892944 0 232.8053
radius 0.846987247467041
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46194375 0.46194375 0.46194375 }
radiance 9.689787
center 258.51135 0 -298.25153
radius 1.1350207328796387
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.48509523 0.48509523 0.48509523 }
radiance 11.3346
center -351.64606 0 -317.6098
radius 2.2082228660583496
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.98080695 0.98080695 0.98080695 }
radiance 7.8976502
center -458.6174 0 -393.0222
radius 3.446499824523926
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.51227057 0.51227057 0.51227057 }
radiance 10.446005
center 475.5475 0 362.23914
radius 4.078906059265137
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.97471356 0.97471356 0.97471356 }
radiance 7.091427
center 596.68994 0 442.60498
radius 2.014281749725342
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45102987 0.45102987 0.45102987 }
radiance 15.310552
center -193.67087 0 227.1073
radius 2.4351820945739746
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5173066 0.5173066 0.5173066 }
radiance 13.906088
center -332.56116 0 198.19202
radius 2.081141710281372
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4739638 0.4739638 0.4739638 }
radiance 4.7095633
center 400.65674 0 -365.68558
radius 3.7989275455474854
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.74225837 0.74225837 0.74225837 }
radiance 9.396766
center -579.8209 0 -487.18793
radius 1.624007225036621
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43175182 0.43175182 0.43175182 }
radiance 5.80704
center 195.42773 0 -354.77985
radius 1.9978630542755127
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6136271 0.6136271 0.6136271 }
radiance 12.337392
center 344.54474 0 -94.55151
radius 3.981321334838867
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.83006346 0.83006346 0.83006346 }
radiance 13.0494
center -495.20645 0 -320.5552
radius 3.00661563873291
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.77507234 0.77507234 0.77507234 }
radiance 5.605711
center -313.5443 0 444.1209
radius 1.313283920288086
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8681254 0.8681254 0.8681254 }
radiance 12.030089
center -97.95584 0 -167.87683
radius 2.181765556335449
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.97870934 0.97870934 0.97870934 }
radiance 12.300821
center 554.7396 0 -8.245514
radius 2.5471503734588623
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6269964 0.6269964 0.6269964 }
radiance 11.584773
center -557.1482 0 -380.43063
radius 3.9361069202423096
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7812577 0.7812577 0.7812577 }
radiance 10.302648
center 88.68964 0 320.09845
radius 1.7743945121765137
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.53311306 0.53311306 0.53311306 }
radiance 13.859429
center 478.57263 0 -431.1483
radius 4.0241172313690186
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6045762 0.6045762 0.6045762 }
radiance 8.576834
center -266.11096 0 -257.70468
radius 4.3473289012908936
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4476995 0.4476995 0.4476995 }
radiance 4.194249
center -369.7976 0 395.7621
radius 3.208004951477051
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43514317 0.43514317 0.43514317 }
radiance 14.171369
center -17.926453 0 367.33594
radius 1.4288368225097656
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6230628 0.6230628 0.6230628 }
radiance 15.984388
center 317.16058 0 360.04028
radius 4.072457313537598
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5313866 0.5313866 0.5313866 }
radiance 8.883806
center 231.82098 0 -269.26285
radius 2.8505754470825195
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5051155 0.5051155 0.5051155 }
radiance 9.441246
center -77.368774 0 339.51813
radius 2.9976894855499268
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.86942816 0.86942816 0.86942816 }
radiance 5.1530113
center 66.2879 0 355.74548
radius 0.7199234962463379
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.62825596 0.62825596 0.62825596 }
radiance 14.529839
center 424.8235 0 -127.1261
radius 1.4385836124420166
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4433816 0.4433816 0.4433816 }
radiance 9.535789
center -256.6213 0 -394.13635
radius 2.538782835006714
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7234708 0.7234708 0.7234708 }
radiance 6.432935
center 598.2927 0 151.55798
radius 3.756636142730713
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9075594 0.9075594 0.9075594 }
radiance 9.844623
center 545.2888 0 -129.39285
radius 3.3466379642486572
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.76348287 0.76348287 0.76348287 }
radiance 12.618813
center 164.93658 0 -441.84912
radius 2.9456703662872314
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.61802936 0.61802936 0.61802936 }
radiance 11.133524
center 416.01526 0 174.25714
radius 1.1612439155578613
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4414777 0.4414777 0.4414777 }
radiance 15.578963
center -277.39935 0 332.56732
radius 2.6421797275543213
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.891968 0.891968 0.891968 }
radiance 15.718479
center -399.818 0 266.26562
radius 3.2868220806121826
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.61556625 0.61556625 0.61556625 }
radiance 13.992594
center -399.73138 0 -464.07544
radius 2.994985818862915
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.69788843 0.69788843 0.69788843 }
radiance 11.631009
center -581.0013 0 -88.86331
radius 1.0975337028503418
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8635874 0.8635874 0.8635874 }
radiance 4.6001663
center -255.25497 0 -452.85278
radius 3.918715476989746
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6573076 0.6573076 0.6573076 }
radiance 6.246045
center -293.9457 0 315.08075
radius 0.6606783866882324
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7062217 0.7062217 0.7062217 }
radiance 11.692532
center 478.80273 0 100.86572
radius 1.3772387504577637
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9462515 0.9462515 0.9462515 }
radiance 6.606675
center -57.462646 0 -26.828705
radius 1.5012879371643066
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.76914203 0.76914203 0.76914203 }
radiance 9.876723
center 483.74463 0 469.46997
radius 0.8535356521606445
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8858866 0.8858866 0.8858866 }
radiance 10.249849
center 383.64917 0 76.89636
radius 3.2766661643981934
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6021065 0.6021065 0.6021065 }
radiance 9.819962
center -386.367 0 -437.9702
radius 1.2052960395812988
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.86001873 0.86001873 0.86001873 }
radiance 7.0448246
center 291.14838 0 34.52118
radius 2.38193678855896
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49765706 0.49765706 0.49765706 }
radiance 9.419657
center -205.17468 0 67.03241
radius 3.16013240814209
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49540502 0.49540502 0.49540502 }
radiance 13.727043
center 376.4651 0 -104.4458
radius 0.5942277908325195
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8073571 0.8073571 0.8073571 }
radiance 5.0774517
center -199.00131 0 464.35352
radius 3.9166500568389893
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.93225217 0.93225217 0.93225217 }
radiance 12.903839
center 295.49927 0 425.98352
radius 1.951695442199707
samples 1
}


light {
type spherical
color { "sRGB nonlinear" 0.5094543603415522 0.4868666752478519 0.9 }
radiance 23
center 366.5826110839844 0 29.888322830200195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.815101746120422 0.3163228431864436 0.8594189364091416 }
radiance 24
center 477.3931884765625 0 31.788164138793945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8870642496543211 0.4271665423500107 0.9113942345903651 }
radiance 28
center 450.6799011230469 0 -4.341894149780273
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9774574225295516 0.4384204232675063 0.8420681261705636 }
radiance 18
center 472.2799987792969 0 76.20063781738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4248309328689882 0.8354270713356733 }
radiance 26
center 474.2622375488281 0 123.31119537353516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8839823180379924 0.3575200335028897 0.9630003471231685 }
radiance 16
center 440.2853088378906 0 14.356051445007324
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9748748610715772 0.30628441395468414 0.84438648389142 }
radiance 21
center 448.1757507324219 0 120.5459976196289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7095544989645028 0.3225081504135036 0.9 }
radiance 16
center 474.0168151855469 0 22.055980682373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.412678048079244 0.38825540264068986 0.9 }
radiance 24
center 420.4319152832031 0 116.80025482177734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9448965831943725 0.44140007713829554 0.8074388642520645 }
radiance 29
center 450.7130432128906 0 72.3258056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9620420552214937 0.4120945675823048 0.981922333460594 }
radiance 31
center 458.2266540527344 0 111.6933364868164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9379139793312468 0.38188647460218744 0.9910404664800683 }
radiance 17
center 452.1022644042969 0 80.52133178710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7654223098705732 0.3465855427046568 0.9 }
radiance 31
center 411.5152893066406 0 57.88258743286133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44290159364891846 0.526691079267675 }
radiance 23
center 438.7197570800781 0 30.500917434692383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5373577700616612 0.35982942006743995 0.9 }
radiance 23
center 397.18292236328125 0 111.53865051269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7095482992545734 0.4256498518622218 0.9 }
radiance 27
center 468.2721862792969 0 61.66498565673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8219069637232563 0.42629429804718655 0.8512686025019446 }
radiance 25
center 389.7503662109375 0 9.733768463134766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5978424052016603 0.3971417590756193 0.9 }
radiance 19
center 365.8177490234375 0 65.21269226074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.887409076807255 0.43463941442135445 0.9160658066987579 }
radiance 22
center 495.9436950683594 0 91.370849609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9849495011949119 0.41545112599119527 0.9594904872655947 }
radiance 25
center 375.91986083984375 0 -6.988531112670898
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8367501788594471 0.3724420617917653 0.9289719233946646 }
radiance 29
center 450.3945617675781 0 90.87161254882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9445383722003522 0.32453636527982016 0.9891929968468482 }
radiance 29
center 477.22113037109375 0 126.01817321777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3998763264985667 0.8995608089255812 }
radiance 17
center 376.2468566894531 0 75.3522720336914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9602866583908944 0.4467109026681554 0.8204758719260173 }
radiance 24
center 417.0650939941406 0 48.11972427368164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9037017050800374 0.3703039645881411 0.9855997583761944 }
radiance 22
center 393.8932800292969 0 53.8685188293457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8608873664137013 0.43864553147530877 0.9 }
radiance 28
center 448.78961181640625 0 92.3570785522461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998155753462787 0.3047036995420809 0.8646259233730696 }
radiance 17
center 436.0368957519531 0 126.45658874511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9094933752831122 0.45747917174755504 0.9914859253503842 }
radiance 31
center 377.7601623535156 0 14.12716293334961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.335297650041964 0.5604316121458134 }
radiance 22
center 480.559814453125 0 55.46969985961914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3939117188287051 0.4060069899912997 }
radiance 21
center 376.8705749511719 0 30.87824058532715
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9354608329915228 0.40827799997048486 0.9086688828839199 }
radiance 20
center 431.3497314453125 0 15.914996147155762
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8614301976502827 0.3659397191056607 0.8218630103873323 }
radiance 22
center 487.9188232421875 0 74.78086853027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7900557231766666 0.318097826586421 0.9 }
radiance 27
center 464.7159118652344 0 97.47737121582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33347813922783454 0.613439952806608 }
radiance 31
center 402.49114990234375 0 34.64095687866211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8555302460803541 0.30051139105646923 0.8248611112065001 }
radiance 30
center 445.9547424316406 0 105.66349792480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9056788407854014 0.3047640547440861 0.8336294035399153 }
radiance 31
center 403.88165283203125 0 26.959585189819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3728979896862076 0.6743759691605843 }
radiance 17
center 474.9725341796875 0 67.10951232910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9151897287437791 0.4357644495971148 0.9330413211862264 }
radiance 22
center 419.6426696777344 0 116.00321960449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46690807421941094 0.4329977358036485 0.9 }
radiance 26
center 478.6038513183594 0 117.37811279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3797976195634489 0.654660369357005 }
radiance 30
center 371.7715759277344 0 102.92906188964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9457027534609108 0.33572454151765796 0.8169472447765382 }
radiance 16
center 456.128662109375 0 105.4597396850586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8204198710401651 0.32327250351784986 0.933897413578122 }
radiance 22
center 377.62591552734375 0 143.13816833496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8861229070005865 0.4060638177128717 0.8679215136365745 }
radiance 20
center 462.44921875 0 54.18015670776367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9136584202099413 0.43805910100671197 0.9643082186809754 }
radiance 19
center 454.10650634765625 0 60.67221450805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8114072749194485 0.3729831651638444 0.9745457814814422 }
radiance 22
center 369.93231201171875 0 157.3131866455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9600158653259209 0.39189442975050526 0.9568680495665175 }
radiance 25
center 358.01373291015625 0 78.24703979492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9339808490834903 0.43509504885294503 0.8926978217659972 }
radiance 29
center 442.2340087890625 0 133.83880615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4534997391716524 0.5735039036126985 }
radiance 24
center 424.9554748535156 0 59.71582794189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9996051058189478 0.49188689141223607 0.8915513871413984 }
radiance 18
center 394.3392333984375 0 119.84663391113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4455211628570007 0.630477890268675 }
radiance 25
center 366.1927795410156 0 56.121273040771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.822472788831679 0.4459161952212602 0.948992607866647 }
radiance 22
center 477.5003967285156 0 87.1111831665039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8664391777572593 0.30665242627648714 0.8763061603959629 }
radiance 21
center 425.7533264160156 0 136.68606567382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8006070055810793 0.4603510149056105 0.8468114241115778 }
radiance 18
center 392.09637451171875 0 68.67019653320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4997222143983144 0.8651832039612404 }
radiance 29
center 392.73089599609375 0 135.6131591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.852211498830989 0.48492731462652905 0.961449929690458 }
radiance 23
center 439.396240234375 0 54.243873596191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8499342251885185 0.4224147690597574 0.9144744689530698 }
radiance 25
center 366.0250549316406 0 104.6473388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8536417168178007 0.39543299105714014 0.8793824895815301 }
radiance 31
center 374.6544189453125 0 110.1572036743164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9592184514162114 0.40041333141983193 0.8987567954673044 }
radiance 17
center 395.1758117675781 0 46.03703689575195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8280040677181815 0.40002439655633115 0.8787667499672889 }
radiance 28
center 461.3121337890625 0 118.00835418701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8522026750189196 0.36505951207890525 0.9 }
radiance 22
center 390.26361083984375 0 34.26010513305664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9243030675078518 0.4941939159759254 0.8265481900795223 }
radiance 29
center 473.5719909667969 0 115.94100189208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8466337270043883 0.30902540918850013 0.8526013244786242 }
radiance 23
center 379.1342468261719 0 97.95954132080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30948156301088814 0.7015783723532307 }
radiance 28
center 446.2231750488281 0 92.38267517089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3567130553424847 0.8278424648621662 }
radiance 30
center 372.45062255859375 0 156.0716552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5643001720913575 0.319778801730208 0.9 }
radiance 30
center 365.95587158203125 0 81.23383331298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8433655399292791 0.34949512470002647 0.9019642151728453 }
radiance 17
center 416.5190734863281 0 135.18682861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5102797869554662 0.3372966947580374 0.9 }
radiance 27
center 464.32366943359375 0 59.73735427856445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9222093805315421 0.3518535865846398 0.8966833315552415 }
radiance 19
center 464.9543762207031 0 90.02314758300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9845268677051306 0.45129103787225566 0.9526672266131669 }
radiance 26
center 440.5245666503906 0 65.99850463867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33774030378177694 0.5704191633743813 }
radiance 25
center 405.54290771484375 0 125.03733825683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38970649356741477 0.4222741687694176 }
radiance 21
center 467.29803466796875 0 102.07915496826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9800406598423412 0.4375063757573916 0.8478525026920692 }
radiance 30
center 392.41796875 0 162.7699737548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43650589915741084 0.4921889787594118 }
radiance 16
center 450.27984619140625 0 132.79684448242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9565028783704524 0.3649720936746689 0.9595124663928545 }
radiance 17
center 474.5295104980469 0 79.46257781982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.48691992837302156 0.4840430212370215 0.9 }
radiance 23
center 476.9049987792969 0 122.25778198242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8889954507329574 0.437128948772297 0.8983700697736503 }
radiance 24
center 358.7635498046875 0 138.967041015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8105228819241712 0.3905490299208062 0.8576065994313631 }
radiance 24
center 385.9388122558594 0 55.49742126464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8697534030534222 0.3900657800467868 0.8359492702357201 }
radiance 27
center 422.31207275390625 0 170.65953063964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9457605472132631 0.39469625180757467 0.9360271472048118 }
radiance 21
center 365.3213806152344 0 155.933837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8410313116333079 0.3219307062308848 0.9633410416492525 }
radiance 28
center 413.0950927734375 0 144.8789520263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9277285372065206 0.4077694237537381 0.8061424533574966 }
radiance 28
center 453.3339538574219 0 141.1192626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8789652488911633 0.4514210451049018 0.9174581115623 }
radiance 28
center 462.4267272949219 0 137.13079833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8250074118297163 0.39192261918892723 0.8974443181655889 }
radiance 21
center 379.7063903808594 0 189.670166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9832249423866721 0.4788446213984989 0.8927967628216841 }
radiance 21
center 364.1066589355469 0 94.99418640136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8594352317764403 0.34380663415759677 0.8034845373228261 }
radiance 28
center 405.77899169921875 0 174.08163452148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8488867366132211 0.4411272741997191 0.9791463478095489 }
radiance 16
center 392.3961181640625 0 139.80555725097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8110398252559112 0.45952248834502385 0.9239103768308147 }
radiance 16
center 463.156005859375 0 84.45435333251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8467724405002209 0.4097646439365651 0.9262892856418303 }
radiance 23
center 454.81036376953125 0 160.3134307861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8872160311522286 0.30423023509575153 0.8287459482102919 }
radiance 20
center 469.85040283203125 0 128.87411499023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8481433872891111 0.436537686767386 0.9444506594174014 }
radiance 21
center 353.93121337890625 0 180.55653381347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.954985482100804 0.45514564172124333 0.9174853070882513 }
radiance 21
center 444.5934753417969 0 200.99539184570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8376416248777548 0.42064453204895663 0.9901756874605233 }
radiance 20
center 439.1539001464844 0 185.5240936279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9303296241832757 0.3869097631834245 0.8633447993091422 }
radiance 31
center 434.9178466796875 0 133.76602172851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8386579401552883 0.3934946841582154 0.9831673054448137 }
radiance 22
center 399.4284362792969 0 94.923095703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445333089782394 0.4485408944094373 0.8953226083509813 }
radiance 21
center 349.0558776855469 0 160.4823455810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38701016735822036 0.5727451881914499 }
radiance 26
center 457.8677673339844 0 81.60311889648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8026371096184404 0.3768611350789899 0.8603325325084986 }
radiance 25
center 355.458740234375 0 180.84335327148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8244075303000037 0.3262924508022272 0.9 }
radiance 20
center 424.8510437011719 0 96.78446960449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9500121962007226 0.4938873333358522 0.9627793390642101 }
radiance 24
center 390.5824279785156 0 201.7488555908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8009814469004837 0.4816251202573577 0.958315214051003 }
radiance 24
center 363.65179443359375 0 83.80714416503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4474837231743134 0.6125633104239241 }
radiance 17
center 424.5883483886719 0 116.69340515136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9018801457949173 0.3395016116044403 0.8322652946813218 }
radiance 27
center 460.05816650390625 0 132.9414520263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3621364151925883 0.4623193861422754 }
radiance 22
center 390.7237548828125 0 198.46615600585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8835943831573996 0.4701897849686736 0.9725980147532388 }
radiance 19
center 340.3411865234375 0 124.33975219726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41053853416153324 0.8941530520122983 }
radiance 28
center 436.82952880859375 0 170.44595336914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8804769958483902 0.32620676113158065 0.9693116460262527 }
radiance 29
center 352.962890625 0 177.0460205078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9886856381969935 0.4529058404160506 0.9244007984393164 }
radiance 29
center 435.4223327636719 0 136.0574188232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.877700707585292 0.4169250056257441 0.8290852299354435 }
radiance 28
center 363.47833251953125 0 107.85197448730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8161400502410314 0.30654448320882377 0.9813755299922907 }
radiance 17
center 432.13543701171875 0 128.89393615722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8693268926241962 0.36637757968412443 0.9893995308767005 }
radiance 22
center 352.3113708496094 0 173.93409729003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8045957642334127 0.30217534943101904 0.8912938245984956 }
radiance 27
center 422.01324462890625 0 132.72891235351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9919231849480792 0.37840364263881965 0.8223690561244184 }
radiance 18
center 338.70562744140625 0 114.72573852539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3194378224569162 0.4970990562303398 }
radiance 20
center 384.61322021484375 0 152.4390106201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9511219401255349 0.32151560293482984 0.8500236494283897 }
radiance 27
center 390.747802734375 0 104.83384704589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9875970957269301 0.3992434070438746 0.8598682941072541 }
radiance 17
center 384.7481384277344 0 189.61428833007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.899356988682575 0.42417341743235804 0.8728018470098466 }
radiance 17
center 450.7438049316406 0 208.060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.981741578705497 0.32492619467031925 0.8388251778925085 }
radiance 25
center 355.1164245605469 0 148.1825714111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.862643770169273 0.468674321362738 0.9753355854821495 }
radiance 27
center 390.48846435546875 0 192.4716339111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9200145669063584 0.36304994222639553 0.8816575278256702 }
radiance 30
center 371.82550048828125 0 110.3316879272461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7356966829968258 0.4917926464602279 0.9 }
radiance 24
center 414.65802001953125 0 170.51844787597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9758317763468175 0.4655244500336661 0.9571865553884218 }
radiance 22
center 354.3033447265625 0 169.51304626464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8989057951385945 0.3176326696908144 0.8207587601528198 }
radiance 29
center 354.07318115234375 0 179.38868713378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9252235978945852 0.451774746464382 0.8310863722837224 }
radiance 30
center 339.8711242675781 0 130.26905822753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8814326747974404 0.45001555909413926 0.8228783307086351 }
radiance 16
center 330.7042236328125 0 223.82943725585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4552440004393623 0.4011764390618128 }
radiance 17
center 435.94549560546875 0 217.87948608398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9913017381932312 0.3373524682423619 0.8340117202781838 }
radiance 27
center 325.4397277832031 0 220.29254150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6192334420640625 0.4576574523160892 0.9 }
radiance 20
center 333.75238037109375 0 196.80316162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.940371520273873 0.44267909058646426 0.9818421133072349 }
radiance 18
center 438.3951416015625 0 191.69827270507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7962228449616792 0.44651769942802505 0.9 }
radiance 28
center 440.62664794921875 0 148.0599822998047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9046108508772628 0.3318381062593985 0.8186088943402017 }
radiance 20
center 415.00872802734375 0 146.17657470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8181837630251324 0.3060350971074973 0.9799347463232482 }
radiance 17
center 387.9692077636719 0 141.69088745117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9664809074302464 0.3212614372747791 0.9758628944678651 }
radiance 22
center 393.19903564453125 0 221.1708526611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9190181357372358 0.35404432606022734 0.8179396293940234 }
radiance 21
center 417.1081237792969 0 205.25167846679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9805677206271592 0.4586607454627347 0.9719578290679587 }
radiance 25
center 330.9160461425781 0 148.5817413330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6132428493275546 0.41625325635674215 0.9 }
radiance 20
center 400.1403503417969 0 125.31249237060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8939296426777841 0.44659803515276875 0.9428492662913577 }
radiance 17
center 389.1974182128906 0 169.1673126220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8002193928340945 0.3441762606877829 0.9356645389384449 }
radiance 19
center 434.6560974121094 0 212.04336547851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.941526663500792 0.4323263434527233 0.8719252629023152 }
radiance 19
center 413.3341979980469 0 203.77207946777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866916301838182 0.46318002613457465 0.9404947027002452 }
radiance 18
center 430.1341552734375 0 215.4951934814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4447596813015776 0.6411320060775706 }
radiance 19
center 371.5152893066406 0 241.17434692382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49104345399587623 0.8076993923046826 }
radiance 27
center 394.7366943359375 0 183.4838104248047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8330253081329453 0.34450053764439653 0.9367100563114731 }
radiance 31
center 428.8944091796875 0 241.55577087402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8314818210598023 0.33743809100706984 0.9306333219987655 }
radiance 29
center 360.02056884765625 0 266.6395263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9511368178427 0.4148006396779529 0.8842109705181052 }
radiance 19
center 418.6158447265625 0 164.21810913085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4451396701961212 0.7309183203879277 }
radiance 21
center 399.72662353515625 0 169.9604949951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4086343054349233 0.3444363602938788 0.9 }
radiance 21
center 318.543212890625 0 164.33995056152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9554531837701531 0.42103932092899266 0.939440104278507 }
radiance 27
center 332.7470703125 0 256.6513671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9202132811471394 0.45088888234719504 0.9005894108119197 }
radiance 25
center 324.2518615722656 0 246.3404998779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9651357144169866 0.3755158562219225 0.8470774931669436 }
radiance 31
center 388.19512939453125 0 211.53692626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.958921515265616 0.4853221812290797 0.8103022668648486 }
radiance 27
center 323.6416015625 0 237.92930603027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.820072331521758 0.47153149134153355 0.8877895453693909 }
radiance 24
center 313.1178283691406 0 268.1377258300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8637510219921835 0.39802810385269527 0.8113026410055856 }
radiance 18
center 369.6340026855469 0 232.91070556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9435815934187485 0.36523043679341316 0.838890280526106 }
radiance 20
center 378.86956787109375 0 197.71798706054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8137000565717059 0.3222296921280344 0.8049018865201353 }
radiance 21
center 401.88323974609375 0 228.69615173339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9515945942638562 0.4213016607783311 0.9568327861729359 }
radiance 23
center 434.0533752441406 0 225.30982971191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30766662009614404 0.8672051545827458 }
radiance 31
center 348.058349609375 0 257.4596862792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8786698738366661 0.4009757611216225 0.9463954686811514 }
radiance 28
center 317.4891052246094 0 214.18179321289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8927366404716214 0.4975754362778241 0.8231021501152239 }
radiance 25
center 384.733154296875 0 202.12493896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.476099934109019 0.438418477908864 }
radiance 31
center 318.2854309082031 0 169.38626098632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8482596288640754 0.4593531537228791 0.9085879807903694 }
radiance 28
center 345.2501220703125 0 165.02659606933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.469531713356666 0.5239033623616337 }
radiance 21
center 329.1537780761719 0 256.32342529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8171460857060953 0.4984185111392114 0.906087264383001 }
radiance 21
center 417.81683349609375 0 268.2168884277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8295363551735767 0.35445427069325125 0.9504758684963791 }
radiance 16
center 394.9146423339844 0 267.13800048828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45312321673270695 0.6183831736719543 }
radiance 22
center 420.63299560546875 0 213.85000610351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8264911273393379 0.4037282104877526 0.8058713042254542 }
radiance 24
center 376.79705810546875 0 277.7502746582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9619176371893464 0.35649232280156695 0.8922789851293452 }
radiance 16
center 348.5301208496094 0 260.58233642578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8033110362221187 0.3366273814979222 0.9577490475078358 }
radiance 31
center 386.93695068359375 0 229.15289306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9453173595179334 0.3167701431996205 0.9077849548686201 }
radiance 18
center 339.8019104003906 0 270.1803283691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9827737912747253 0.4975089921495971 0.9763975183218552 }
radiance 23
center 316.48785400390625 0 172.38018798828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4209270068475883 0.4699227585735546 0.9 }
radiance 20
center 315.8587951660156 0 259.2803955078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.716048438976751 0.38028117420386 0.9 }
radiance 21
center 388.0457458496094 0 275.3706359863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8235822799087047 0.3072623483372729 0.9 }
radiance 16
center 310.68310546875 0 179.84458923339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8491744023778051 0.31716625578465424 0.9568552246378 }
radiance 27
center 315.72161865234375 0 260.8093566894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.968403118606443 0.34910734263792137 0.8026426760611952 }
radiance 25
center 367.35345458984375 0 200.04087829589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49881639020311486 0.3750929809595638 0.9 }
radiance 30
center 373.7192687988281 0 269.84222412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9049633895381038 0.38964326882934597 0.809617826466792 }
radiance 29
center 343.96966552734375 0 192.10105895996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9119728013587616 0.46708628326627893 0.9606915823781752 }
radiance 23
center 381.59442138671875 0 254.6403350830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8535088874572485 0.4960894826922142 0.888485080136759 }
radiance 19
center 367.1561279296875 0 259.436279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8825747155445165 0.4178203273851566 0.8779540384937947 }
radiance 31
center 420.9002990722656 0 168.57420349121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8162207373843795 0.3995541483437308 0.8427721787679621 }
radiance 31
center 385.120849609375 0 259.57293701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.838031524573471 0.401744467871067 0.8648537874452997 }
radiance 23
center 356.6059875488281 0 228.881591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8229986294637541 0.4448182732068186 0.9174508834701022 }
radiance 25
center 285.5487365722656 0 275.58734130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9721886375736393 0.44970977810438273 0.9039025342258897 }
radiance 30
center 387.3330383300781 0 190.69195556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.482596441828262 0.6458489845304929 }
radiance 28
center 292.71771240234375 0 298.7279052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9523651719427819 0.32197905901865154 0.840422699356645 }
radiance 25
center 304.8374328613281 0 241.2808074951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9260914389918946 0.3149997962895572 0.9687578908649118 }
radiance 26
center 325.88519287109375 0 305.0257873535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9483603645086642 0.41669409122086754 0.878794633377023 }
radiance 29
center 322.259521484375 0 253.7435760498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9120416971803929 0.4656308968457991 0.8386674150978983 }
radiance 22
center 285.54296875 0 301.09869384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40832133167612716 0.8275883896882549 }
radiance 27
center 314.3006591796875 0 271.15570068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.881224943976051 0.4873606731762247 0.8661294888809304 }
radiance 27
center 371.6394958496094 0 229.12118530273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39041201234208944 0.8563914197507341 }
radiance 23
center 385.8329162597656 0 256.56427001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9893456058519566 0.3770245367005175 0.8113763604102338 }
radiance 21
center 348.9166564941406 0 242.04539489746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8992313814097329 0.30903227687056045 0.835292205415884 }
radiance 27
center 284.38128662109375 0 254.6073455810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4290141486958474 0.43509499951331976 }
radiance 30
center 341.8614501953125 0 226.91246032714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9629095099608593 0.3541041675712562 0.8869570492379517 }
radiance 25
center 336.1725769042969 0 234.39117431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8733785035499799 0.36769552593862154 0.8150969990081515 }
radiance 26
center 317.2142639160156 0 279.3570861816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9835312571291415 0.3460377034568252 0.8965677096948207 }
radiance 28
center 369.5655212402344 0 300.6354675292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8634906956789963 0.3728887879767184 0.988597270389282 }
radiance 20
center 307.0914001464844 0 233.51739501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.770935754077011 0.3675085696305258 0.9 }
radiance 25
center 332.6278991699219 0 206.8910675048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8831666440310526 0.35737860425526485 0.9746125694600105 }
radiance 23
center 283.4583435058594 0 276.4819030761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9923224528762121 0.3015567269768586 0.8292160015256892 }
radiance 18
center 329.11077880859375 0 256.6459655761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9539493779860384 0.37582079471516217 0.9335305254847719 }
radiance 26
center 291.7996826171875 0 282.07183837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8022037867194536 0.4804800587409452 0.9 }
radiance 30
center 300.33892822265625 0 203.95101928710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32669782728825186 0.40262283660249865 }
radiance 31
center 333.84161376953125 0 308.7208251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.710655183840498 0.42885476834842995 0.9 }
radiance 27
center 335.566650390625 0 280.9725646972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9633335819737461 0.4391860573495347 0.8231555521644154 }
radiance 25
center 315.7325744628906 0 235.24388122558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9646850108083326 0.33303107504325363 0.9728953721474782 }
radiance 26
center 330.21490478515625 0 300.58074951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4118793907408814 0.564547276132502 }
radiance 25
center 321.5537109375 0 200.7066192626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8633819204891963 0.44097047593533945 0.9000440451670936 }
radiance 23
center 291.3454284667969 0 238.6929473876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7567805279654203 0.41634087184333046 0.9 }
radiance 16
center 291.2056884765625 0 309.27801513671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8558211101705367 0.383423691297214 0.9432905572207846 }
radiance 19
center 324.2145690917969 0 219.3265380859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9753504860502463 0.41532445735383583 0.9320035080472846 }
radiance 27
center 326.0923156738281 0 278.7826232910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8270635377666918 0.4811898437671903 0.93931222097641 }
radiance 26
center 354.7186584472656 0 272.4834899902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8709344406325835 0.34802098084261834 0.9 }
radiance 26
center 378.18548583984375 0 292.6250915527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5146470337377217 0.3329298914369487 0.9 }
radiance 24
center 320.7846984863281 0 270.0205383300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992133881278762 0.3620277245750952 0.8315266526138367 }
radiance 31
center 265.2355041503906 0 230.12979125976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9302412248518453 0.3346358776321451 0.9138501629413494 }
radiance 27
center 340.193115234375 0 278.7341613769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49285432552028297 0.7233226893113451 }
radiance 16
center 295.9851379394531 0 244.80303955078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8207301112964935 0.41796692569404403 0.9897179506806022 }
radiance 25
center 370.17822265625 0 268.2520751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8000155901736119 0.4598318526880076 0.9 }
radiance 23
center 367.6978759765625 0 317.1521911621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4987157104989759 0.3163933441587024 0.9 }
radiance 30
center 316.6783447265625 0 307.6014709472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3291927788039944 0.8050110781748676 }
radiance 16
center 355.68853759765625 0 251.3745574951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.643445263065484 0.33286527607105093 0.9 }
radiance 28
center 307.0091247558594 0 280.03955078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9019433328295093 0.34309526817569935 0.9798797177112484 }
radiance 16
center 298.728271484375 0 312.25750732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8598780636991794 0.3750586621352682 0.9570127620361362 }
radiance 16
center 301.27825927734375 0 312.6178283691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8330311657076733 0.43456054107294956 0.971451681654596 }
radiance 21
center 321.6366882324219 0 305.09576416015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45229570608286906 0.7219340671202513 }
radiance 21
center 355.5709533691406 0 268.2812805175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38352335066745225 0.6439988366780295 }
radiance 20
center 282.0540771484375 0 216.13368225097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8699938555379533 0.32353796822619113 0.9 }
radiance 18
center 363.6116638183594 0 326.77069091796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9356612145663588 0.3400482677864673 0.8896756760536687 }
radiance 16
center 269.89447021484375 0 303.0379638671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9269740663035213 0.4734628134642466 0.8107155722344392 }
radiance 30
center 277.4815673828125 0 230.88624572753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39085785147260327 0.7402623480982669 }
radiance 26
center 260.6663818359375 0 280.86395263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4197716565625793 0.5313588213663581 }
radiance 18
center 256.8963623046875 0 249.54762268066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9330419429678163 0.4187061134126126 0.98813982052509 }
radiance 31
center 312.33465576171875 0 257.44873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9938483863392051 0.45122403767778463 0.8811565126504943 }
radiance 22
center 313.2126159667969 0 251.9988555908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9716667226761162 0.48783525697450564 0.9883180890591402 }
radiance 18
center 322.2722473144531 0 252.45384216308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8529918640502026 0.4940711789526443 0.8022863647030427 }
radiance 31
center 349.015869140625 0 263.0045471191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8856470485748302 0.35790350776405483 0.9943894892758764 }
radiance 22
center 325.5529479980469 0 218.56723022460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8885097286383915 0.3533396740091151 0.9679224739599093 }
radiance 22
center 328.7311096191406 0 288.4625549316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.354179077812355 0.82852148637782 }
radiance 18
center 288.3551025390625 0 229.03488159179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5789599365110801 0.35394620248340797 0.9 }
radiance 18
center 271.3235778808594 0 245.4215850830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8446385053546916 0.33031056072263726 0.8591908069985201 }
radiance 30
center 302.19256591796875 0 247.34080505371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4577650893590647 0.7612090745678105 }
radiance 18
center 259.25360107421875 0 242.60372924804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4486215044001711 0.3579712397944618 0.9 }
radiance 28
center 240.53977966308594 0 305.36199951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9427472956764401 0.44429655163927806 0.8561288649078611 }
radiance 26
center 263.77569580078125 0 268.8927917480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8109496953983831 0.41334031575321184 0.9941715872519974 }
radiance 19
center 236.8882598876953 0 309.14105224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9064584272766667 0.3351085143004805 0.8934160666658535 }
radiance 29
center 275.5894470214844 0 339.2468566894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8317576238549393 0.4151141076433391 0.932929247346664 }
radiance 29
center 274.91864013671875 0 337.7345886230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9924430611474302 0.38252421475065823 0.8496732068460332 }
radiance 27
center 351.1127624511719 0 293.5246887207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4457176814509545 0.624055813787018 }
radiance 28
center 304.1915588378906 0 341.6238708496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8406670120495141 0.3199832829614675 0.8955008424415184 }
radiance 27
center 314.023193359375 0 297.6045227050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603668700552233 0.4217130499090644 0.8526412716015519 }
radiance 24
center 308.9247741699219 0 294.0606994628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9573632180985268 0.4486816147846465 0.894513665672793 }
radiance 23
center 286.0758972167969 0 342.17779541015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9310734977961139 0.4618796503129573 0.9393802752409436 }
radiance 26
center 290.3268127441406 0 291.18218994140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8807017985085448 0.3634200166859999 0.868971310321153 }
radiance 17
center 282.4596862792969 0 299.4148254394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.868048473492201 0.47439462226808427 0.9764397718063929 }
radiance 30
center 308.2589111328125 0 307.3682556152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8152782499638668 0.46764989409934155 0.8781275839558126 }
radiance 19
center 255.31126403808594 0 237.4137725830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.873138539874001 0.4672606783874859 0.9 }
radiance 19
center 351.759521484375 0 344.0169677734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8885006358462333 0.32018172882545193 0.8162887712283131 }
radiance 21
center 312.9299011230469 0 346.858642578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4436256920372327 0.5184648860774075 }
radiance 17
center 352.0069274902344 0 236.3041534423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5895741430598862 0.33071223578465087 0.9 }
radiance 20
center 230.05767822265625 0 340.1392822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9720334195534079 0.4818524980788623 0.9251684563001741 }
radiance 18
center 267.9535217285156 0 363.58941650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9190375668469193 0.3770483760668901 0.9663127415526723 }
radiance 19
center 291.54400634765625 0 300.84539794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9234890777290461 0.31594910655411396 0.882151349364388 }
radiance 24
center 248.38623046875 0 310.96746826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6812906942662789 0.35879806611570625 0.9 }
radiance 30
center 308.13629150390625 0 273.56805419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8501282854451504 0.4235024564490407 0.9965275618072784 }
radiance 22
center 290.0295104980469 0 252.21705627441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9562545845700845 0.3704658817792983 0.9818991143146253 }
radiance 26
center 292.3041687011719 0 291.4437561035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9069666234579556 0.34952597008366615 0.82340504252211 }
radiance 16
center 234.9838409423828 0 246.02969360351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9816775735899581 0.4817526737149054 0.9162772528057378 }
radiance 29
center 278.3141784667969 0 246.90670776367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9359706184365093 0.45900570314391165 0.8171446016903864 }
radiance 30
center 225.21990966796875 0 345.1676025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8438245700274769 0.4412760439441442 0.9177748699214142 }
radiance 25
center 212.91241455078125 0 251.07139587402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9313636454132509 0.48203091903271605 0.865942355084884 }
radiance 28
center 224.7234344482422 0 271.650634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9702177732166503 0.4632297230629191 0.8924300312219341 }
radiance 19
center 289.6136474609375 0 353.72393798828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8808094258693758 0.4329178073386972 0.8257869632222749 }
radiance 28
center 289.2274169921875 0 330.05755615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8204280406512865 0.34790774682167896 0.8963521742241619 }
radiance 19
center 322.91436767578125 0 305.0587463378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9719550251491762 0.33300728502952176 0.9571446649165088 }
radiance 24
center 327.32171630859375 0 334.5076599121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9195986219699015 0.35444061794269954 0.8960092019329986 }
radiance 21
center 277.1313171386719 0 314.979248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.408605551360978 0.5088665894848192 }
radiance 22
center 270.78863525390625 0 264.102294921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9662045999327433 0.3927681024324442 0.9648639366131126 }
radiance 22
center 304.2767333984375 0 337.7453918457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9475060585207 0.4812001881806217 0.9482271817140998 }
radiance 21
center 255.33938598632812 0 276.0570983886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8969328772328178 0.44135864620422494 0.9600721939306793 }
radiance 17
center 284.6701354980469 0 348.13812255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8381937640574038 0.409848000937629 0.8833851773741177 }
radiance 17
center 301.9138488769531 0 345.6882629394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131538629123395 0.3676921280868177 0.9463544642049465 }
radiance 19
center 201.10585021972656 0 261.87957763671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9857841095840512 0.4212397171635708 0.9031447004235358 }
radiance 25
center 287.8861083984375 0 352.0149841308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8581197052622185 0.46848706738499857 0.9625336713845275 }
radiance 16
center 239.6553955078125 0 262.748291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8431837369202781 0.3729613612650062 0.9846793642525073 }
radiance 18
center 297.8831481933594 0 289.3109436035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9950360029096788 0.42450235037153855 0.9006662344099299 }
radiance 22
center 287.1178894042969 0 268.85406494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9334050132774004 0.3116492506373145 0.8131111730427141 }
radiance 16
center 196.56179809570312 0 314.58251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.902444978359126 0.46581057014642635 0.8884407190511481 }
radiance 19
center 200.2033233642578 0 362.5660095214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.921324506072743 0.37742157025393186 0.9776851397866122 }
radiance 16
center 220.6422576904297 0 338.71771240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.900090476269179 0.44877622470822515 0.9834793529174042 }
radiance 25
center 291.7185363769531 0 316.6250305175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3921933628244588 0.6531173858261934 }
radiance 20
center 208.5960693359375 0 325.3502502441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4862821161544928 0.5710273251763123 }
radiance 23
center 278.91259765625 0 378.9914855957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9573578598498913 0.39813070251870775 0.8558773622638165 }
radiance 27
center 306.9524230957031 0 314.7802429199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9376181992940228 0.35015273462329094 0.8022132885097624 }
radiance 24
center 202.97169494628906 0 305.87835693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7671937338823425 0.3393827775747452 0.9 }
radiance 18
center 292.78997802734375 0 278.53253173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8618613331106831 0.31975905535251564 0.9055742679592601 }
radiance 25
center 302.4350280761719 0 350.5138244628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8310764605872286 0.3529725342846056 0.821304893560153 }
radiance 26
center 232.9532012939453 0 349.16546630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.853657139121361 0.34550146071968585 0.9891474506423493 }
radiance 23
center 264.6754455566406 0 294.57958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9459247174958122 0.365510107300315 0.8880262412923822 }
radiance 24
center 200.3001251220703 0 301.0100402832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8715054662670351 0.34069437857882073 0.8420915515252665 }
radiance 25
center 190.61419677734375 0 382.03778076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9507990884331176 0.4218683189457667 0.8478154988336977 }
radiance 27
center 252.5343475341797 0 355.69873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3173888473908157 0.7368757481940102 }
radiance 20
center 190.82769775390625 0 372.3504943847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8785123255405396 0.31244710121046565 0.8703515367058504 }
radiance 16
center 197.82862854003906 0 354.8366394042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9164835675208564 0.433367908228389 0.880184467262533 }
radiance 21
center 188.22964477539062 0 294.75146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33454604472434474 0.709727803133944 }
radiance 29
center 180.35943603515625 0 328.7158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9521617541610219 0.470906599159617 0.9774758857684823 }
radiance 31
center 199.3511199951172 0 275.4319763183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9624896670457631 0.4830269048137183 0.8760619354402636 }
radiance 19
center 265.1007080078125 0 334.162353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8013069413693329 0.4901499260258446 0.9 }
radiance 28
center 291.875732421875 0 282.9627990722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4384303409614749 0.43171012642381124 }
radiance 26
center 268.6789855957031 0 377.4598693847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9691835911505786 0.4619874272154554 0.8004028076609733 }
radiance 27
center 205.1372528076172 0 381.06243896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7816617029635106 0.44298970167895346 0.9 }
radiance 22
center 268.097900390625 0 387.19110107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844596280743356 0.4100104732367602 0.993387922877509 }
radiance 18
center 273.0045471191406 0 341.7037353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.808555497707487 0.3530406994657554 0.8780839763781214 }
radiance 28
center 177.13487243652344 0 354.0516662597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8701677581597642 0.31112592052298377 0.8170233522530478 }
radiance 27
center 256.8305358886719 0 299.50054931640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.95454269553427 0.3190565610772398 0.9706125324567141 }
radiance 19
center 279.27728271484375 0 369.8443298339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43204127776240964 0.3475644327995284 0.9 }
radiance 29
center 267.92333984375 0 370.58984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9350443624130075 0.3473893934795769 0.9207022644696132 }
radiance 21
center 270.7142028808594 0 280.0973205566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7869571754410004 0.4530111477841494 0.9 }
radiance 21
center 262.4513854980469 0 289.6791076660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.909432178709592 0.3757584917032638 0.8270967596408173 }
radiance 18
center 267.06072998046875 0 270.9090881347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.750699835640585 0.4847552308042523 0.9 }
radiance 29
center 214.20291137695312 0 382.2154235839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8895396286853369 0.3239815643535105 0.89140095092649 }
radiance 30
center 204.3563995361328 0 378.37445068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9749888840802291 0.38371348676568207 0.8728884174168403 }
radiance 30
center 218.9436798095703 0 393.7914123535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39771395712188773 0.4349620248679229 }
radiance 17
center 244.16224670410156 0 389.5682067871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411775200448316 0.3371038352533936 0.8711836248309619 }
radiance 20
center 176.12106323242188 0 386.2164306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.920038117347152 0.43335360462724415 0.9101190681090907 }
radiance 23
center 257.3573913574219 0 373.293701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9616259047000509 0.426854621870729 0.9616316076191549 }
radiance 27
center 211.61935424804688 0 350.1065368652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8463209981117411 0.39188174443948154 0.9726471806986517 }
radiance 20
center 157.24781799316406 0 388.3687744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7873083743128599 0.3289967389801514 0.9 }
radiance 18
center 173.86465454101562 0 384.42950439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8911173528113973 0.4255645400459759 0.9584476022251638 }
radiance 26
center 217.0233154296875 0 372.63818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9979227694357773 0.31390825758511426 0.9632037815841604 }
radiance 20
center 176.4985809326172 0 290.99945068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411755486600968 0.41375268332695603 0.9 }
radiance 22
center 236.15066528320312 0 310.6334533691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35632770653813683 0.49723924597191693 }
radiance 16
center 218.16302490234375 0 282.2296447753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.812443376915009 0.46934957819383516 0.8618532544084284 }
radiance 19
center 173.7078094482422 0 340.3248291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9434188963240513 0.40217512304748637 0.8648379677664289 }
radiance 27
center 178.04302978515625 0 284.6398620605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130239658320922 0.45188188353259195 0.9368467214409488 }
radiance 30
center 266.55743408203125 0 341.8628234863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5633158696321218 0.3221107854455291 0.9 }
radiance 24
center 190.171875 0 308.2134704589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.83325931369876 0.37428185582266915 0.8722041149692177 }
radiance 20
center 245.1208953857422 0 281.9219970703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9468460215228053 0.4082406338304124 0.981956143179409 }
radiance 23
center 169.13186645507812 0 372.75494384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.830264327658238 0.3329450030848476 0.914015547841965 }
radiance 23
center 164.6767120361328 0 297.24371337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3444927269255012 0.8454508765863827 }
radiance 23
center 166.47608947753906 0 335.2000427246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9629469804364578 0.40855546130580067 0.8068998771435096 }
radiance 25
center 173.920166015625 0 300.3647155761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8094110693969873 0.3052475340251633 0.9237050443647539 }
radiance 30
center 243.9945068359375 0 316.8681335449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8302001892606026 0.36583749044364744 0.8404637586913517 }
radiance 31
center 190.91384887695312 0 318.9163818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8450745593942091 0.30794744222617476 0.8338356102739023 }
radiance 25
center 250.7676239013672 0 369.2645568847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9332240288504613 0.35453203250416243 0.9287896405567644 }
radiance 29
center 245.0274658203125 0 358.5855712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4129275448096118 0.4754137387816709 }
radiance 16
center 167.62120056152344 0 291.4775695800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9364267399151427 0.4301938527268613 0.8289337199395335 }
radiance 31
center 216.04185485839844 0 354.5378723144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9312079479625361 0.43125180939658847 0.9599503587123063 }
radiance 19
center 248.56394958496094 0 337.3974304199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9649287356445786 0.44099484076570405 0.8904668702936138 }
radiance 16
center 163.3392791748047 0 349.78411865234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3956306358073345 0.5442237633811715 }
radiance 18
center 154.4718475341797 0 348.4834289550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8470851040618219 0.395083487604858 0.9428632609794753 }
radiance 25
center 176.925048828125 0 301.9401550292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8729102992744868 0.3734357223670801 0.8680113407321537 }
radiance 16
center 171.578369140625 0 296.2752380371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3356502223302314 0.5933930331889284 }
radiance 20
center 166.1755828857422 0 401.25341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9905402045886835 0.3543291798529561 0.8994710046613754 }
radiance 27
center 251.48126220703125 0 297.5004577636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35903566226029293 0.5130660548662056 }
radiance 18
center 224.9152069091797 0 324.97119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9360335974825897 0.47152430827520003 0.8057392564571486 }
radiance 24
center 133.57009887695312 0 373.1680603027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8405077792932063 0.32462325251353763 0.8280620755594263 }
radiance 20
center 175.0246124267578 0 312.5731506347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9323544400791721 0.3628725901694555 0.9706815650305769 }
radiance 18
center 233.3965606689453 0 302.1875915527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5695402731262421 0.354383721104917 0.9 }
radiance 22
center 173.53553771972656 0 390.4140930175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8929020825439908 0.3928551398015905 0.9071504719020225 }
radiance 22
center 126.84293365478516 0 396.6806640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8123722102351381 0.3296947445542802 0.8640070847130144 }
radiance 30
center 159.24273681640625 0 313.382568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7333857126570839 0.3777810501376416 0.9 }
radiance 22
center 144.72059631347656 0 360.1955871582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.388461308641588 0.6302042863238534 }
radiance 16
center 191.49444580078125 0 365.50042724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8002086094502293 0.373445925471135 0.8302136831724528 }
radiance 30
center 141.9651641845703 0 379.0564880371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9684934228916353 0.492656386081915 0.8697585760432159 }
radiance 26
center 187.07809448242188 0 334.64385986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3289949150586476 0.6642642976106304 }
radiance 17
center 144.8488006591797 0 404.524658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8324522105602146 0.3663198369080984 0.9779376829560236 }
radiance 17
center 151.3660888671875 0 379.5716552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4146474905870878 0.7550489954902384 }
radiance 17
center 181.90696716308594 0 378.49847412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3265650588302927 0.5408166852212442 }
radiance 30
center 124.6915054321289 0 338.7019348144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8367989909182612 0.3556636536186916 0.9 }
radiance 29
center 150.6328125 0 299.22845458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9446512659689215 0.43765882356209873 0.8298645302967034 }
radiance 27
center 158.468505859375 0 344.3182067871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47330109272611776 0.40876079937625787 }
radiance 23
center 199.52389526367188 0 303.60546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8588652170454621 0.42985837544772076 0.824227601626957 }
radiance 30
center 167.8893585205078 0 398.4606628417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4734900210309125 0.4582526417814783 }
radiance 20
center 142.0634307861328 0 361.96826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.816790865181182 0.30573644563699653 0.9 }
radiance 21
center 136.66285705566406 0 338.4286804199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9154990040318927 0.4033862616373738 0.8682704542235855 }
radiance 23
center 228.92791748046875 0 324.3912658691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8015333526206476 0.32882050961820136 0.9390868551904106 }
radiance 22
center 118.0002670288086 0 386.4960632324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8734506980093637 0.3504612922626189 0.837579589234555 }
radiance 19
center 198.0532989501953 0 299.31475830078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8800953614698046 0.4633083538531654 0.8209686325377474 }
radiance 28
center 147.4885711669922 0 372.8200378417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8689780646482931 0.39799144747313964 0.9081990817477263 }
radiance 20
center 188.31686401367188 0 327.95458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3686236050583211 0.4278790328831803 }
radiance 20
center 182.26239013671875 0 304.4888000488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9812964774642041 0.30935315216357695 0.8256043194800893 }
radiance 22
center 96.6589584350586 0 358.7216491699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8895405023386659 0.34667105573803425 0.9648703757854894 }
radiance 30
center 146.28330993652344 0 333.33941650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9513902950704828 0.4334975527659377 0.8093437943014932 }
radiance 27
center 196.54513549804688 0 356.0771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8556789485310405 0.40066251943467235 0.8578294735344865 }
radiance 21
center 178.01585388183594 0 413.37652587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9771779499591223 0.31912855058394723 0.8782213936557952 }
radiance 22
center 174.53253173828125 0 386.3638000488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9600463067943297 0.4435264163738576 0.9279605333433363 }
radiance 18
center 119.67110443115234 0 409.91326904296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8677095236405615 0.42305858960095044 0.9858737019792362 }
radiance 30
center 95.76185607910156 0 341.53118896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4403845613235512 0.69148737890716 }
radiance 18
center 117.66006469726562 0 411.40350341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4331088316992088 0.8594203138852917 }
radiance 26
center 97.7898178100586 0 345.2638854980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9813234941058421 0.469041125277873 0.8101952336911514 }
radiance 25
center 173.3103485107422 0 309.74017333984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8941584786247547 0.38733209826260895 0.9406400746026042 }
radiance 26
center 167.58859252929688 0 368.3194885253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6939024840348619 0.4262713026507655 0.9 }
radiance 25
center 176.53530883789062 0 393.7901306152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9426090963895637 0.4618627914256803 0.9462759798601837 }
radiance 26
center 159.87196350097656 0 327.29376220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31804759193961885 0.46052946467514966 }
radiance 26
center 142.19285583496094 0 352.15283203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9719437006765659 0.36737085533199954 0.9611400628964677 }
radiance 19
center 191.30062866210938 0 381.33856201171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8683395165443604 0.3636439713055939 0.8673231048450453 }
radiance 31
center 154.09054565429688 0 356.9526672363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9301794863637345 0.4925538163820018 0.9378143937672012 }
radiance 29
center 140.45143127441406 0 345.2609558105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9534334636927847 0.3245883248262345 0.8492696962105967 }
radiance 26
center 94.12430572509766 0 413.2257995605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8483333505108583 0.43654909208795106 0.844633002744653 }
radiance 30
center 178.38687133789062 0 319.1457214355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9818534255163908 0.4230891680720281 0.9394160991187668 }
radiance 29
center 143.5585174560547 0 422.6082763671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30826382974528405 0.41303167911341876 }
radiance 30
center 114.31349182128906 0 351.8179931640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3434353097875411 0.5947682710451467 }
radiance 20
center 75.34068298339844 0 416.5429992675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3079016112983456 0.7990343083375754 }
radiance 24
center 160.72235107421875 0 421.258544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9002456810734879 0.41833024523120843 0.9390114389761908 }
radiance 17
center 101.81983184814453 0 326.13922119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.495964835181155 0.4556452816994022 }
radiance 31
center 164.29835510253906 0 367.6026916503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44009910656824286 0.40499996180738973 }
radiance 31
center 81.49758911132812 0 335.26507568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8388154074628796 0.3387804631588966 0.812694667781754 }
radiance 23
center 151.42572021484375 0 357.45965576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.841778904770798 0.4363631154590082 0.9382074154771197 }
radiance 18
center 147.90689086914062 0 355.07415771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8240288395652158 0.32186840942324774 0.9471828641410394 }
radiance 24
center 101.73863983154297 0 341.58740234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4802554298670708 0.8224317242157653 }
radiance 30
center 140.54986572265625 0 416.0809326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8158240857387818 0.44541811747164356 0.8328427667420967 }
radiance 19
center 136.95687866210938 0 325.3475341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.962894329312885 0.38834927873461267 0.9196254021770991 }
radiance 25
center 142.16465759277344 0 393.6805419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5127804417926277 0.34561216086349456 0.9 }
radiance 21
center 117.58062744140625 0 364.2249755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9955045938148657 0.45942384848359036 0.8552117240608212 }
radiance 19
center 70.29367065429688 0 353.4540100097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8335055851457103 0.40710996854357406 0.9769071222394328 }
radiance 28
center 185.55792236328125 0 316.17327880859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9379801536531549 0.3508358003178756 0.8994004947337844 }
radiance 26
center 151.9435272216797 0 386.8187255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8174266659028946 0.33872984483695995 0.8695260825817275 }
radiance 22
center 171.3708953857422 0 343.6531982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9428270765840947 0.3804548478672648 0.8271029824109396 }
radiance 17
center 75.69908905029297 0 335.52471923828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.417255928140458 0.3000258403408088 0.9 }
radiance 20
center 134.09739685058594 0 368.4657287597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8269015041164091 0.4573295063810471 0.9 }
radiance 31
center 61.46523666381836 0 400.0456237792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8258563078701187 0.48003093143674586 0.8841770838595446 }
radiance 26
center 156.3359375 0 404.4954833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5135613386776382 0.394387219060645 0.9 }
radiance 27
center 113.32083892822266 0 415.0939025878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5852439106167037 0.3873752087929587 0.9 }
radiance 18
center 148.5012664794922 0 361.17425537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30288251458043125 0.7361043579924557 }
radiance 23
center 56.64993667602539 0 334.49957275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31878160530473043 0.8689092175319122 }
radiance 24
center 88.61749267578125 0 314.50238037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9078173114900927 0.31414242546308746 0.8392384158928137 }
radiance 31
center 141.2379608154297 0 410.7126159667969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8056318202171397 0.32451430190118635 0.8324071084451339 }
radiance 23
center 125.81436920166016 0 398.30889892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8744658375139875 0.4141983327488773 0.9998840523853811 }
radiance 17
center 81.75083923339844 0 366.95953369140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9173694875843802 0.46985668161347904 0.8356494708182995 }
radiance 30
center 160.0443115234375 0 387.1236877441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9344459992713366 0.4079789765004095 0.9999160495050387 }
radiance 18
center 76.35758209228516 0 398.78521728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8705035532648647 0.3392814601813781 0.812550766419524 }
radiance 31
center 65.78202819824219 0 337.9986267089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5894646040906184 0.43012256612931016 0.9 }
radiance 27
center 64.43790435791016 0 384.9739074707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8289641423166134 0.3209032085190916 0.8573376599258782 }
radiance 21
center 149.9617156982422 0 405.039794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8183730108212987 0.4408660886470436 0.9211443178359914 }
radiance 23
center 141.09567260742188 0 423.45306396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8386552489708707 0.49410531923569734 0.8928504987862399 }
radiance 25
center 158.4582061767578 0 413.3509216308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.988307001949833 0.48877597284095775 0.9732932831542165 }
radiance 25
center 161.76100158691406 0 425.82122802734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3331955944149158 0.4502981318654883 }
radiance 25
center 131.23841857910156 0 372.0862731933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4771422239235287 0.5207630480598012 }
radiance 28
center 87.73063659667969 0 362.781982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4607703573332122 0.5372997779893686 }
radiance 18
center 114.50584411621094 0 325.947509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5352311714985416 0.49507891896463163 0.9 }
radiance 31
center 128.0372772216797 0 340.6974792480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8379908536676115 0.3944289040484874 0.816040022150708 }
radiance 16
center 108.39250183105469 0 318.2124328613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8249013276942846 0.3779273320628764 0.8296799390187541 }
radiance 17
center 37.522857666015625 0 375.0351867675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.928772812453062 0.3447734557135336 0.9271923792078642 }
radiance 25
center 107.22571563720703 0 325.9605407714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9298244420444293 0.432621987999092 0.9138722556211132 }
radiance 30
center 135.43344116210938 0 324.41168212890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3453022763691015 0.694471516469868 }
radiance 24
center 91.21835327148438 0 363.3292541503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9379955813361905 0.448735531665442 0.8900966309740966 }
radiance 27
center 58.46366500854492 0 414.0213928222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9914284673316253 0.4492456100102703 0.863708316488554 }
radiance 24
center 140.43421936035156 0 382.36346435546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8882681550762181 0.32132375518440043 0.915341470516064 }
radiance 23
center 74.3050537109375 0 392.2565612792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9470599184480948 0.4586838241824708 0.9672981445932541 }
radiance 19
center 51.34893798828125 0 352.060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6556380582156287 0.36461811910417763 0.9 }
radiance 31
center 100.6009521484375 0 353.2601013183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9473927591329955 0.3616237070930528 0.8323353865014973 }
radiance 18
center 91.75157165527344 0 324.0388488769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8064290397229565 0.4446685444779001 0.9609328477078387 }
radiance 24
center 62.67324447631836 0 324.5613098144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8720027096361945 0.34793456198135936 0.8636001361544541 }
radiance 27
center 68.90458679199219 0 360.9183349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9880758551180501 0.49689999521876216 0.8581750565295879 }
radiance 30
center 141.33795166015625 0 429.5374755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42242626116234516 0.42030711422718336 }
radiance 27
center 140.89259338378906 0 426.6744384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8901692877220012 0.45768126137460524 0.8541259276954178 }
radiance 19
center 31.843809127807617 0 420.0746154785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9710582572035211 0.3881411544480233 0.8697477632396386 }
radiance 21
center 32.07602310180664 0 423.9906005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9918598261552644 0.31954923871025265 0.9838904832012287 }
radiance 31
center 71.80804443359375 0 334.4967041015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5076644377283712 0.482000781333288 0.9 }
radiance 22
center 98.39047241210938 0 317.0716247558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39921385347408933 0.7059334071414854 }
radiance 16
center 108.89604187011719 0 412.57342529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7087242798470378 0.32589798866555436 0.9 }
radiance 20
center 109.2616958618164 0 337.7797546386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9346105163574627 0.40359284826743397 0.9778491486310965 }
radiance 30
center 79.09935760498047 0 348.6524963378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8559342399633325 0.48454715954203226 0.9725033944671784 }
radiance 17
center 70.66011810302734 0 372.5501403808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9637364987576136 0.3651752701947051 0.8911861821767377 }
radiance 25
center 26.755088806152344 0 354.54779052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9687917196021585 0.3206302012862373 0.8562457305517289 }
radiance 31
center 79.11566925048828 0 348.37939453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9581916818516972 0.36213451366045896 0.9040298225173329 }
radiance 21
center 23.752099990844727 0 337.1935729980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9504115712631931 0.43349907250412867 0.9718976314635521 }
radiance 25
center 44.47749328613281 0 425.1880798339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9806115863331493 0.48255952671426783 0.8089804616394558 }
radiance 23
center 33.35755920410156 0 410.6795349121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8969596585620486 0.4146996451135638 0.8874653972450486 }
radiance 31
center 98.74140167236328 0 416.7768859863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9506272337618327 0.3332932415589443 0.9588541893071363 }
radiance 17
center 40.97762680053711 0 410.22607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4600165454352333 0.3215557158564158 0.9 }
radiance 19
center 58.59462356567383 0 411.4685363769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9466616684243065 0.4696684538527368 0.9962461386265222 }
radiance 24
center 62.707916259765625 0 388.4094543457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8429649566310511 0.4739997393249714 0.9828838397114233 }
radiance 21
center 56.27508544921875 0 389.8475341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8120413077996453 0.34178932221757796 0.8081124694567033 }
radiance 18
center 34.17011642456055 0 343.0920104980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8537027737410208 0.3699833600850334 0.8479779277491594 }
radiance 18
center 56.90589904785156 0 362.8989562988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.820925905679161 0.4814459904619088 0.9371397341339337 }
radiance 17
center 70.84774780273438 0 318.1795959472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8372532093770282 0.4919978417597163 0.9008293097337412 }
radiance 29
center 14.39616584777832 0 396.0445556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38449636903190143 0.7718805887420804 }
radiance 17
center 115.89519500732422 0 346.22967529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3285773658730309 0.6094259375147123 }
radiance 25
center 72.62781524658203 0 370.7118835449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4090323446483799 0.3521135088777264 0.9 }
radiance 17
center -8.749917984008789 0 344.8833923339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9100680581520657 0.31758391463400937 0.8423691371008046 }
radiance 18
center 46.60153579711914 0 376.16180419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9303199122945791 0.3493769438882484 0.9350248789837474 }
radiance 18
center 61.543460845947266 0 350.2580871582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4559031021461415 0.6475533305198277 }
radiance 19
center 48.96522521972656 0 403.7300720214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9136318465617095 0.39326287378653657 0.9114297545996436 }
radiance 21
center 23.80140495300293 0 373.7788391113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9169130529922553 0.43923471878160125 0.8271338455780596 }
radiance 28
center 35.64577102661133 0 360.1319580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3431093285242558 0.71314894176898 }
radiance 22
center -4.6901936531066895 0 421.978271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4039335011247215 0.44434665949123253 }
radiance 17
center 96.26673889160156 0 423.79693603515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49523160334859784 0.5651683273545762 }
radiance 26
center 41.01268005371094 0 365.5101623535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9192336800796475 0.3411959838244467 0.9987700616073 }
radiance 21
center 41.667884826660156 0 399.17132568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8685825448045046 0.34431955841409556 0.8480176712904984 }
radiance 30
center 88.88030242919922 0 417.1177062988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8504278929725044 0.33500657171059095 0.8028873585753435 }
radiance 19
center 47.25715255737305 0 420.302734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.425623133479056 0.7752818796730256 }
radiance 28
center 89.72563934326172 0 342.5172119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33655774610579553 0.8183131218078293 }
radiance 28
center 18.818567276000977 0 427.2510681152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43140445919885606 0.4600475897003967 0.9 }
radiance 25
center 53.642642974853516 0 414.4045104980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8854603051347988 0.3696873884788582 0.8656629416663625 }
radiance 17
center 60.41865158081055 0 413.4563293457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7687022869085925 0.4247495812617966 0.9 }
radiance 17
center 39.185630798339844 0 332.05792236328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35428406079033764 0.47685832737660827 }
radiance 28
center 59.970367431640625 0 334.4477844238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8681580699155456 0.3832006824145837 0.9698158571516886 }
radiance 20
center 41.541812896728516 0 340.89862060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8949659680473353 0.45614555894653475 0.9642098780808814 }
radiance 31
center 42.69751739501953 0 362.36407470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8072844867653355 0.4179176300137438 0.8093130949238394 }
radiance 25
center -10.591645240783691 0 396.45758056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9994287025535135 0.333977490246062 0.9022121749124852 }
radiance 17
center 50.894615173339844 0 358.2711181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9387549903729959 0.48957174067678894 0.9294384148765087 }
radiance 22
center 73.6927261352539 0 359.309326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8176338736640119 0.4707659015033711 0.9257620073262032 }
radiance 30
center 58.08237838745117 0 379.8605041503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.822417927946199 0.4229228205570525 0.8813736392946572 }
radiance 17
center 72.53294372558594 0 346.93927001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6097720321426984 0.3879839133220408 0.9 }
radiance 20
center 74.96269226074219 0 424.2828063964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9193128057998396 0.3506323282268408 0.907926347357045 }
radiance 17
center 30.8765811920166 0 323.4039306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9012050744794828 0.34056473296818 0.8581623081711618 }
radiance 21
center -1.0839496850967407 0 402.1634521484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9449838220228303 0.3502324634103537 0.9384624318128779 }
radiance 31
center 3.5710926055908203 0 348.7662048339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.320222704097838 0.43596746129535224 }
radiance 26
center -7.405122756958008 0 414.2079772949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4472138976178008 0.6944546247967721 }
radiance 25
center -27.66496467590332 0 315.63555908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8255444577588672 0.429032119214234 0.9159737125014442 }
radiance 28
center 39.53033447265625 0 425.4924621582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4553782573563253 0.7452140467404259 }
radiance 28
center 71.13835906982422 0 314.5115966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8332816680001394 0.4166493568583986 0.8821739816936378 }
radiance 19
center 32.01491928100586 0 326.9617614746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8011940474192975 0.3040906826985203 0.8478785919385264 }
radiance 25
center 45.01521682739258 0 423.0826721191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9824696450521043 0.4423493310279901 0.8221848800645661 }
radiance 31
center 30.941570281982422 0 395.626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8270739751600761 0.4595575250012553 0.8247553464283999 }
radiance 26
center 38.379798889160156 0 395.4453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9215855322257243 0.36845282021925696 0.965418007054155 }
radiance 23
center -33.450931549072266 0 380.8592529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35368724607877927 0.48589915637626946 }
radiance 26
center 18.49248504638672 0 342.3006896972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40132613635307 0.4431252837781298 0.9 }
radiance 17
center 14.790142059326172 0 329.6209411621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.782597959351301 0.385540639512677 0.9 }
radiance 30
center -31.907821655273438 0 365.7796936035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9840291645416792 0.35412838231037297 0.9087887118921434 }
radiance 21
center 47.92216110229492 0 338.33892822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5924308501009907 0.4917524675608965 0.9 }
radiance 30
center 21.8177547454834 0 331.9024658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8891666232806105 0.4828833815372686 0.8820120290316781 }
radiance 18
center -38.23082733154297 0 408.9438171386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47047006909067146 0.7877028980412991 }
radiance 28
center 4.629458427429199 0 326.2135314941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5810912499091521 0.35307940508862823 0.9 }
radiance 27
center 41.984989166259766 0 400.5499267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9348329345427983 0.49771555701880144 0.8205220749391949 }
radiance 24
center -45.055931091308594 0 335.814208984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4376155226909022 0.4625520578183426 0.9 }
radiance 21
center -31.62451934814453 0 404.3179016113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8252964019728377 0.43649997655957573 0.8513755367484399 }
radiance 25
center 22.80353546142578 0 355.509521484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33437917338036 0.515337788791078 }
radiance 19
center 25.927589416503906 0 412.9739685058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9891583587475059 0.4495792543509207 0.8717561708521352 }
radiance 22
center 9.880315780639648 0 331.0731506347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9753204560414271 0.4858498640651964 0.8801483016774733 }
radiance 25
center -13.75456428527832 0 337.08990478515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4521490723172348 0.4900967473848016 }
radiance 30
center 42.865840911865234 0 419.77392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8298089167196079 0.39799294520247896 0.908948416606051 }
radiance 31
center 29.75049591064453 0 331.95623779296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8791460064790155 0.45816656022692487 0.8846515185887175 }
radiance 24
center -39.10599899291992 0 410.19940185546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9874333659028061 0.44922694883563463 0.8297801410985184 }
radiance 28
center 7.3068437576293945 0 388.4549560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8701143850120021 0.46961055696308707 0.9592580396958308 }
radiance 27
center 16.685829162597656 0 323.4306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32778010368719995 0.603531928916073 }
radiance 28
center -10.589461326599121 0 386.8785705566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9308759226491338 0.44583307693024093 0.8611537269920475 }
radiance 28
center -57.711551666259766 0 412.579345703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8735021786650632 0.3108286982548267 0.9738843603985179 }
radiance 23
center -15.420706748962402 0 399.55029296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4671642282508226 0.3729968772116467 0.9 }
radiance 18
center -11.188485145568848 0 313.9172058105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9216398679001927 0.41558912104973283 0.8060184444254775 }
radiance 29
center 2.2819888591766357 0 341.232666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9108873924991053 0.4339050443056296 0.8167056791880045 }
radiance 21
center -58.19915008544922 0 312.5132751464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8909994350043571 0.303359511314953 0.8626772467754896 }
radiance 16
center -52.66402053833008 0 398.5513000488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4350179648456518 0.4472548812903012 }
radiance 29
center -26.353792190551758 0 371.7364196777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7855714851593224 0.4507422617760825 0.9 }
radiance 20
center -18.933143615722656 0 311.8518981933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447507161539555 0.4354059479105501 0.9732192180130235 }
radiance 30
center -4.826443195343018 0 317.9413757324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9337431812808024 0.34938728169445993 0.8684120350252698 }
radiance 22
center 30.666048049926758 0 335.4344482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131641910134734 0.3402703588870988 0.9127197517306849 }
radiance 27
center -73.64439392089844 0 337.826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9481510200375696 0.37537653447362634 0.9993604037609243 }
radiance 20
center -33.997650146484375 0 343.09014892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9311831669120546 0.32455187356594734 0.8134161562334787 }
radiance 31
center 21.080089569091797 0 403.6063232421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9220923848196334 0.4367496786598243 0.9554114507815061 }
radiance 25
center -59.313899993896484 0 404.48138427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3203929482633226 0.7562813114025112 }
radiance 29
center 0.5891544818878174 0 354.3403625488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8757205621865366 0.3406019528854315 0.9260115442541972 }
radiance 24
center 24.4835147857666 0 311.3538818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9498235214298543 0.3426379631649344 0.820366779193091 }
radiance 20
center 22.32069969177246 0 380.15521240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4109316904450204 0.5891818756614243 }
radiance 22
center -58.32246780395508 0 352.5797424316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9594466323058601 0.4014097470583157 0.8177286768936204 }
radiance 30
center 3.9367430210113525 0 338.68719482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9673771419025003 0.3540206859400528 0.884864068154862 }
radiance 27
center -74.90782928466797 0 345.01776123046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8628067844315466 0.48596890931295395 0.8181763148895407 }
radiance 27
center -7.858645439147949 0 391.6595458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.783283462512309 0.33450798826766875 0.9 }
radiance 25
center -99.34736633300781 0 398.7372741699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8218373841799524 0.39562533936815514 0.9097215211122129 }
radiance 20
center -22.057279586791992 0 304.7055358886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40070560904729535 0.7404074860748391 }
radiance 26
center -67.16168975830078 0 314.3701477050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8287795904007823 0.4077875533819375 0.8909729262944283 }
radiance 18
center -76.00001525878906 0 319.3791809082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9671310062283156 0.4341219652815266 0.802319140557517 }
radiance 18
center -15.866111755371094 0 342.68402099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9038885924560205 0.4085648523643318 0.9602007439741356 }
radiance 18
center 6.213815212249756 0 356.6811828613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6039093276244131 0.3843097163693614 0.9 }
radiance 23
center -68.78643798828125 0 342.3518981933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8354561452328952 0.4133098488194291 0.9909418465592855 }
radiance 16
center -76.26866912841797 0 397.60089111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3091078539479009 0.677040747024421 }
radiance 18
center -94.4085464477539 0 354.7283630371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.847196516310095 0.4102604188658344 0.8311597146145259 }
radiance 30
center 5.093960285186768 0 400.4000244140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8119667947471629 0.35195711251840733 0.9 }
radiance 25
center -37.62733459472656 0 344.9436950683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8222984742969865 0.4938751374719891 0.9807823899203907 }
radiance 25
center 1.8883578777313232 0 320.0008850097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49904020740598887 0.8188879847053562 }
radiance 31
center -87.08710479736328 0 299.7274475097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9142847838356929 0.4270319550267804 0.8288142995339111 }
radiance 21
center -92.37548065185547 0 339.2771911621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9513309087226194 0.4801510781176137 0.8484382418362995 }
radiance 22
center -1.383744239807129 0 313.9231262207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3801601629499497 0.6188247366897245 }
radiance 28
center -21.964733123779297 0 339.3319396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8691536874106638 0.38801856322583944 0.8579475329509855 }
radiance 17
center -53.76048278808594 0 333.86175537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8830259999462189 0.44453674432760104 0.9382370381696967 }
radiance 30
center -30.009586334228516 0 344.7687072753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6963167298218631 0.49820002617106274 0.9 }
radiance 23
center -9.767755508422852 0 374.2944641113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9724281818480377 0.46245098751418023 0.907814247139838 }
radiance 30
center -15.415745735168457 0 380.02069091796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9094936747386972 0.31374189133770763 0.8934911235205387 }
radiance 29
center -84.73229217529297 0 377.5772705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4432805987019063 0.3110859451567998 0.9 }
radiance 31
center -93.33787536621094 0 319.93951416015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8813248194605995 0.4022635858134238 0.9930065661264927 }
radiance 22
center -71.63679504394531 0 297.5406188964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47972363346237507 0.5074199033491439 }
radiance 20
center -13.238116264343262 0 369.1014099121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7165941155689944 0.4663070432422496 0.9 }
radiance 24
center -31.363025665283203 0 319.56024169921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844250039195689 0.4504116031526467 0.8224850522715011 }
radiance 27
center -31.202598571777344 0 315.2657470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.899902182949909 0.36322282889988045 0.86763600000349 }
radiance 25
center -19.585878372192383 0 313.28497314453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34556643710081036 0.8829287768305903 }
radiance 31
center -55.19804382324219 0 398.6121826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7219737221412263 0.3150529816213194 0.9 }
radiance 20
center -48.47060012817383 0 295.6604309082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6435005312370676 0.37255302399438606 0.9 }
radiance 29
center -30.01504135131836 0 338.1809997558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9738213692165454 0.4416000607922219 0.845771136692861 }
radiance 17
center -37.48632049560547 0 382.10369873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8377964709116772 0.3370961281352205 0.9102878465687244 }
radiance 24
center -19.187454223632812 0 376.10589599609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445197751052289 0.46003809790314615 0.9896688908559266 }
radiance 31
center -108.46138000488281 0 291.56622314453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9240758116360094 0.4960678767797254 0.8795552023428123 }
radiance 30
center -16.364774703979492 0 362.064697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9513002365270873 0.3475956194489902 0.8237522919215334 }
radiance 19
center -79.62211608886719 0 351.4039306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8542073282593319 0.46616923644650365 0.8580720361447813 }
radiance 25
center -18.860082626342773 0 315.20501708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9759816771240042 0.47942333739498577 0.8641395524418695 }
radiance 26
center -40.70608139038086 0 365.7344055175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.958702541124285 0.3915424198767319 0.8113770147809024 }
radiance 20
center -37.1282844543457 0 291.6788024902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8154515344825312 0.4632087185012107 0.9086944297524653 }
radiance 21
center -114.60594940185547 0 356.9490966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8768804150053436 0.3535084658757582 0.8517119319853971 }
radiance 18
center -59.074275970458984 0 375.4017028808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9546460308612865 0.355504490603703 0.9861023946340889 }
radiance 28
center -56.21440505981445 0 302.6445007324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48332019527559933 0.6128084639661342 }
radiance 18
center -39.162071228027344 0 364.6159362792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8085725595889781 0.30126471613252803 0.9030510067582953 }
radiance 23
center -36.65076446533203 0 306.049072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3823091750142459 0.7646172389928678 }
radiance 30
center -52.7138557434082 0 350.4176025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7208572728456571 0.38864379698531737 0.9 }
radiance 23
center -100.9222412109375 0 356.6575622558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9003009042370473 0.4635805262060966 0.8723158613036102 }
radiance 19
center -43.035892486572266 0 354.0103759765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9198139309048257 0.4257491319448796 0.9925050040863687 }
radiance 18
center -77.8182373046875 0 385.0180358886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8075595071147991 0.4464280422150707 0.814367845063072 }
radiance 24
center -85.85018920898438 0 373.691650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4661339852731218 0.359780213063317 0.9 }
radiance 24
center -107.53660583496094 0 313.6246337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36100643003629423 0.6423007090121755 }
radiance 29
center -116.33952331542969 0 356.01123046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3208176857464698 0.6447025070518835 }
radiance 29
center -137.96380615234375 0 336.68194580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4349336473844223 0.8207055757542261 }
radiance 20
center -104.40936279296875 0 342.4425964355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8977189191448537 0.4962596371318311 0.9314326008556338 }
radiance 16
center -121.76500701904297 0 306.1366882324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5220095539939488 0.3968307748212532 0.9 }
radiance 25
center -128.57066345214844 0 329.02850341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9001639995666482 0.34174821409335093 0.9444112186060389 }
radiance 30
center -123.65838623046875 0 348.64605712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8251605159223077 0.4395278244126901 0.9130781887041228 }
radiance 23
center -66.19412231445312 0 363.9395446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44162919107926374 0.4596513282718113 }
radiance 17
center -42.28797149658203 0 392.1878967285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8163428589969699 0.3862765924935132 0.9688124057058585 }
radiance 18
center -108.37060546875 0 366.01214599609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4578436517919563 0.37667009659122125 0.9 }
radiance 25
center -54.12852096557617 0 320.6410827636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9872468303503595 0.4897058905362667 0.845531743090763 }
radiance 23
center -121.43356323242188 0 325.80194091796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8408467174399958 0.3817313223834235 0.9194615457457679 }
radiance 29
center -70.70711517333984 0 364.6154479980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5359934971446926 0.3101948431939024 0.9 }
radiance 21
center -50.338043212890625 0 280.5777587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5038690649978931 0.3116838737701953 0.9 }
radiance 21
center -149.13490295410156 0 305.6387634277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42359599648360424 0.4660655636621587 0.9 }
radiance 21
center -102.53638458251953 0 294.1497497558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8277352943295337 0.351777304737349 0.9780989476729038 }
radiance 30
center -64.58927917480469 0 362.1687927246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37873906333957874 0.4245932724226801 }
radiance 31
center -107.22762298583984 0 326.594482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.652569880697369 0.390510325366323 0.9 }
radiance 27
center -110.41477966308594 0 339.6426696777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9081019678455873 0.42619070431663986 0.9313494487056562 }
radiance 19
center -48.557350158691406 0 274.0411071777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5045692467656299 0.4512989828054158 0.9 }
radiance 24
center -145.3913116455078 0 378.06756591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8691463382099527 0.4646464298417351 0.9407684148417919 }
radiance 28
center -150.28219604492188 0 299.9254150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.923539331916523 0.487668487629088 0.9435710581572272 }
radiance 21
center -117.85922241210938 0 327.28271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8646086464942229 0.3212344035255338 0.9060408888966475 }
radiance 22
center -128.78857421875 0 329.3039245605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8679016980640925 0.4046384027839749 0.9560798504121558 }
radiance 18
center -122.649169921875 0 285.7881774902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.95587574393936 0.3234047655526196 0.9541604416026398 }
radiance 30
center -86.56187438964844 0 335.8336181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8195234711829301 0.47936222385883676 0.8267771322591806 }
radiance 19
center -97.97928619384766 0 310.0962219238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8036024817949281 0.46970912584228053 0.9077271390072056 }
radiance 25
center -70.81511688232422 0 290.7193908691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8024035434261069 0.4626080691676647 0.8015924966549794 }
radiance 23
center -85.95504760742188 0 325.6650695800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8395157961286411 0.40236719893845 0.9174894695266226 }
radiance 26
center -102.59281158447266 0 321.3659973144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47080679824907623 0.4640235129069752 }
radiance 27
center -103.9614028930664 0 331.1107482910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844740305995146 0.39574329127202057 0.9553940173504943 }
radiance 23
center -122.15496826171875 0 345.3553161621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8783918323586286 0.35518865643397884 0.916066237487162 }
radiance 16
center -164.2308349609375 0 357.2384033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.828444382124003 0.4204697427382338 0.9419100703673786 }
radiance 31
center -142.81602478027344 0 366.74041748046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8664475686186044 0.34007020290266315 0.9638726960370587 }
radiance 25
center -81.85194396972656 0 312.00360107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8290245698608831 0.35984788499347875 0.8306874995423417 }
radiance 25
center -117.83155822753906 0 331.9927978515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41981923801236176 0.49427393215935383 0.9 }
radiance 24
center -167.07713317871094 0 311.33203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9403598760301566 0.49232529144975656 0.9165548942255723 }
radiance 30
center -139.9639129638672 0 289.6553649902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8119608112847927 0.3930197620226341 0.8347113140121997 }
radiance 28
center -112.99427032470703 0 287.6112060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4471527882886025 0.7829586556743144 }
radiance 18
center -172.0068817138672 0 297.16632080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8391125904535616 0.3155328326575289 0.9551726375774428 }
radiance 28
center -71.99903869628906 0 310.46044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9937390887476849 0.39138631312761335 0.9657516144364948 }
radiance 28
center -155.34315490722656 0 298.2732238769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8972048354008976 0.3574347180280771 0.9748808885156621 }
radiance 16
center -145.55386352539062 0 271.2911376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9627940110721641 0.3401707385286133 0.8143370066564269 }
radiance 31
center -105.08307647705078 0 305.3343811035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8321007179482534 0.4676059515448987 0.8802009272483705 }
radiance 26
center -84.97592163085938 0 282.8448791503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9529984033958957 0.4050713101941542 0.9950206204599715 }
radiance 21
center -99.82392883300781 0 368.7495422363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8042670898749373 0.36125659320217923 0.9536773572011692 }
radiance 22
center -129.29454040527344 0 287.35693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8047382378841649 0.3497344087635018 0.9415272353423132 }
radiance 19
center -155.76119995117188 0 330.7671203613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9623930663603734 0.4845139106395441 0.8840369420192646 }
radiance 27
center -125.76344299316406 0 323.3815612792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8216295397961996 0.49308575151843137 0.9020780389131695 }
radiance 26
center -128.9144744873047 0 265.6800842285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9382704267349062 0.4371872935663792 0.932754485698882 }
radiance 28
center -85.2446517944336 0 331.3567810058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8759018614784959 0.43907972314452376 0.8486252940385202 }
radiance 28
center -101.2478256225586 0 276.1094055175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8920400930843957 0.47674641327572 0.871316192307482 }
radiance 19
center -131.4768524169922 0 330.75634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212962578834967 0.4613158646794075 0.9 }
radiance 27
center -187.0343780517578 0 253.27171325683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8851215075739086 0.4260228994457288 0.9680697589072148 }
radiance 22
center -89.13188934326172 0 315.70794677734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4098868502805859 0.42840805903005846 0.9 }
radiance 20
center -108.4585189819336 0 252.42822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4406169844091623 0.8334972952507115 }
radiance 29
center -134.8922119140625 0 357.4477844238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8984263023965186 0.49883162496901096 0.9205407123059554 }
radiance 24
center -188.55191040039062 0 287.3072509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9289689888082561 0.3824340075490633 0.8274425116134327 }
radiance 29
center -101.32734680175781 0 317.83758544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7926571982902031 0.3152348522868291 0.9 }
radiance 30
center -162.5716094970703 0 257.6358947753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34702725638807935 0.6081289964685627 }
radiance 23
center -126.70386505126953 0 316.3209533691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8383581366366136 0.439815355242552 0.8624511317375361 }
radiance 27
center -134.84828186035156 0 348.5025939941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5412990214565347 0.310002267624994 0.9 }
radiance 16
center -113.70990753173828 0 353.5814514160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3795582411060349 0.8779213963665136 }
radiance 24
center -108.03694915771484 0 301.8548583984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9344936088843643 0.37051695488031855 0.8132208202363973 }
radiance 27
center -146.55918884277344 0 270.1527099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8133364578076915 0.34466388695962863 0.8107532766653552 }
radiance 24
center -187.50656127929688 0 255.84803771972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.855295974234708 0.3278959534080497 0.9681621541561356 }
radiance 19
center -149.62661743164062 0 257.28070068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8361243545442096 0.48479807288269905 0.8109443378711271 }
radiance 31
center -189.478271484375 0 295.0247802734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9606740624327748 0.4264136156481041 0.9186788020905989 }
radiance 30
center -165.14187622070312 0 344.7052001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.862169953908446 0.3152079230118245 0.8781181249743053 }
radiance 22
center -185.6017303466797 0 272.8009948730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40569609206627366 0.4859616814540364 0.9 }
radiance 20
center -138.7084197998047 0 252.18743896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8990758227998958 0.4568056257165104 0.8980780795365986 }
radiance 16
center -180.7954559326172 0 349.22601318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.942760254228125 0.4141443401097924 0.9781330818845709 }
radiance 26
center -159.79872131347656 0 332.861572265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.920528646186441 0.47246407565296233 0.9935221259651787 }
radiance 17
center -153.8048858642578 0 332.7970275878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.943931564111452 0.4867084634295553 0.9737990487545549 }
radiance 21
center -156.2552490234375 0 338.0193176269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9760192124180073 0.32906270304034807 0.9315255728939554 }
radiance 16
center -189.31427001953125 0 306.4436340332031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4954006436155821 0.47930075052914833 }
radiance 24
center -154.21942138671875 0 319.547119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9986644954015668 0.4541224123540898 0.9553380011051404 }
radiance 20
center -138.98313903808594 0 278.3551940917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6956051287105439 0.41644166448391007 0.9 }
radiance 18
center -178.66026306152344 0 284.0644226074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8256822999537329 0.4171443807381935 0.9417895253816844 }
radiance 26
center -183.0195770263672 0 293.32098388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8487933495554515 0.30007503090762194 0.816306249243106 }
radiance 21
center -175.01736450195312 0 313.7533874511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4475461443134333 0.5019611619917224 }
radiance 19
center -199.33261108398438 0 330.5209045410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9748946238316023 0.46653838987443075 0.8787351447916489 }
radiance 18
center -146.00270080566406 0 300.7960205078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8660332366354944 0.3223646902761375 0.8802527575079158 }
radiance 17
center -147.4950714111328 0 277.9554138183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834466862373012 0.41466025160142317 0.8667428951334706 }
radiance 27
center -113.51042938232422 0 258.8346252441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.959288556350065 0.47872400653325775 0.8024539437860374 }
radiance 30
center -102.66212463378906 0 292.1958923339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.905676872131294 0.3206703962769786 0.9762679440822568 }
radiance 27
center -142.7896270751953 0 304.5456848144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866499695052132 0.3850822624170732 0.9190995268165325 }
radiance 28
center -193.7906951904297 0 305.2882080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4142593038954713 0.5054427357468735 }
radiance 27
center -126.50507354736328 0 264.8508605957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9582055781074104 0.42714342706301756 0.9085227901098345 }
radiance 28
center -163.6631317138672 0 259.2932434082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8625881634493752 0.4310524096000039 0.9087741541754333 }
radiance 31
center -117.18385314941406 0 343.26763916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8913407847054217 0.47766557517067576 0.9659433507383316 }
radiance 23
center -121.19164276123047 0 280.77398681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8912641799454201 0.3383467418826333 0.9763522689256963 }
radiance 16
center -132.3162078857422 0 257.4698486328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3432001676673649 0.7765233247684983 }
radiance 31
center -186.7421417236328 0 261.591064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3949506635154023 0.7998610293847901 }
radiance 22
center -209.90040588378906 0 241.3617401123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6923572181218308 0.44880296935021147 0.9 }
radiance 17
center -120.2232894897461 0 247.43170166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9380251927325037 0.3782955403494183 0.8436298015481709 }
radiance 25
center -135.9525146484375 0 313.8267822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8773052288032028 0.3652922770278623 0.9254880501735447 }
radiance 21
center -190.7678680419922 0 250.32431030273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8531078104061889 0.3350378861036813 0.8749312033710414 }
radiance 16
center -133.62142944335938 0 330.1176452636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9468380954945337 0.3645673918140921 0.9820626329116273 }
radiance 31
center -155.4365234375 0 332.57958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4118398814643215 0.4711142145975251 0.9 }
radiance 19
center -154.89256286621094 0 243.90878295898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8708699907373119 0.49964871572123415 0.985496060795484 }
radiance 21
center -220.20167541503906 0 323.8691101074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8829880148448335 0.4521956969799727 0.8466869743221883 }
radiance 18
center -194.52293395996094 0 243.17271423339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8343153185354917 0.4763792453799093 0.8372961588942661 }
radiance 26
center -122.7563705444336 0 296.8975524902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8556924059977983 0.4567846954388102 0.970278909009362 }
radiance 27
center -192.0795440673828 0 258.08209228515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9423598666124077 0.4627210897816031 0.959187512153096 }
radiance 30
center -165.8749237060547 0 259.3824462890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4589418952411699 0.8371413582499176 }
radiance 30
center -175.65338134765625 0 279.31463623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9426180468525912 0.4444381768733986 0.8947907084076063 }
radiance 18
center -205.46873474121094 0 307.2727355957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.863290193514033 0.4535157466327401 0.8634315402200762 }
radiance 31
center -157.98355102539062 0 257.5972595214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4628258226222206 0.3677334029352812 0.9 }
radiance 18
center -187.13949584960938 0 292.23529052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9580089937208942 0.40884719541740344 0.9120622949960249 }
radiance 25
center -144.31137084960938 0 262.2315368652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9618537214796627 0.40111360917236827 0.933393217218436 }
radiance 27
center -186.18359375 0 279.1396179199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9709191532338846 0.3343008883581596 0.9547767005082738 }
radiance 24
center -182.95054626464844 0 295.2162780761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8268056419145491 0.4072893723390496 0.8134944606084469 }
radiance 16
center -169.08901977539062 0 252.17723083496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8940975191817805 0.3178362259643639 0.9116660335930227 }
radiance 27
center -165.3899688720703 0 243.2103271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8935019537807248 0.39688876636993764 0.8866594697413868 }
radiance 30
center -233.67840576171875 0 296.36566162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8708828344101751 0.3414315774489396 0.9604479298174446 }
radiance 19
center -203.04286193847656 0 266.4914245605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4540717790741821 0.7258600991017163 }
radiance 21
center -199.22584533691406 0 287.1770324707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8417340915067308 0.3111371361786726 0.9254666055677756 }
radiance 22
center -165.84536743164062 0 275.39764404296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46592349072160855 0.7552164982898459 }
radiance 30
center -167.1600799560547 0 272.6567687988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9971217017977418 0.31852582331726936 0.9744067606478701 }
radiance 28
center -149.43466186523438 0 276.39947509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412197512789681 0.44668274124100316 0.8590074942481998 }
radiance 16
center -160.45091247558594 0 317.811279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.841979247749034 0.3088111669472322 0.9659778116955042 }
radiance 28
center -146.59312438964844 0 310.9833679199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4170871419360376 0.6683040423875574 }
radiance 20
center -141.7617950439453 0 301.72216796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9093278918403167 0.3904490216743185 0.9410699415049585 }
radiance 18
center -224.59483337402344 0 289.9643249511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9639443362793085 0.3688198610531652 0.962955151716473 }
radiance 23
center -231.8308563232422 0 215.72299194335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4988193231818556 0.3075799373727209 0.9 }
radiance 19
center -172.4156494140625 0 295.96697998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8668636284400318 0.3769186438105722 0.9759804180103326 }
radiance 17
center -151.85870361328125 0 230.28884887695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9715313892547035 0.32248513456030964 0.9454284069128023 }
radiance 29
center -215.6373748779297 0 242.44317626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5689439642813799 0.46353575462875907 0.9 }
radiance 28
center -230.4442138671875 0 264.5335693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.71300189320443 0.31542918126763403 0.9 }
radiance 29
center -159.1575927734375 0 270.88641357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40230251884632184 0.43204258684664776 }
radiance 20
center -185.74945068359375 0 228.22921752929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8348655239992858 0.34366456427790076 0.9950078974797436 }
radiance 24
center -190.01560974121094 0 244.9879608154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3035574811768167 0.4237181792178991 }
radiance 23
center -172.40611267089844 0 289.07891845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9405491958892318 0.4420728631165882 0.8866513143143242 }
radiance 17
center -145.8949737548828 0 225.84458923339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.574018031614936 0.47770336494432286 0.9 }
radiance 20
center -213.07847595214844 0 228.05177307128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.811281012099633 0.4781952158829933 0.9382838451364423 }
radiance 19
center -228.16978454589844 0 205.880859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9884972974222622 0.4579994731732494 0.9061001136282661 }
radiance 16
center -237.5391387939453 0 262.2724304199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8992229265060647 0.41593064473633123 0.9788015143914788 }
radiance 29
center -184.5124053955078 0 248.7345428466797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9035815239626552 0.32503564436485693 0.8183003788225395 }
radiance 16
center -233.5828857421875 0 202.3105926513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8056305868917307 0.45858829414296143 0.8423887121007908 }
radiance 26
center -221.91424560546875 0 203.9710235595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8551009694075293 0.4734312281639811 0.9 }
radiance 25
center -212.01388549804688 0 238.51856994628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8293896325317387 0.36501115617185276 0.8247436541530714 }
radiance 21
center -206.2064666748047 0 272.5914001464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4278392795006303 0.49435352656883813 }
radiance 24
center -199.77139282226562 0 233.59262084960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5404185287680005 0.4913504968502691 0.9 }
radiance 21
center -221.66590881347656 0 255.9407958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9516661665643463 0.4698612818174073 0.8459335829852694 }
radiance 16
center -190.22161865234375 0 209.58505249023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47708766460023594 0.7192786031377638 }
radiance 29
center -220.32504272460938 0 239.38497924804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8127606204482961 0.44432372505368223 0.9873097130235867 }
radiance 20
center -243.119873046875 0 299.9493713378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9752640999203837 0.4488004615953157 0.8475153125062252 }
radiance 21
center -211.0774688720703 0 236.58538818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9429421136328874 0.42272347570208624 0.9407517740454313 }
radiance 25
center -150.78692626953125 0 263.0675354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6696493467065211 0.3069180198825343 0.9 }
radiance 27
center -222.7236328125 0 215.3843231201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5440906098663092 0.4587187127064053 0.9 }
radiance 16
center -209.31983947753906 0 210.04676818847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9005078112998361 0.311201123060368 0.9896946792442367 }
radiance 16
center -245.24185180664062 0 258.4795837402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9172160226009531 0.3226653121452768 0.9517097536221807 }
radiance 20
center -162.5216522216797 0 214.130615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9989551140171522 0.47347350052900133 0.9355079578093396 }
radiance 20
center -199.2841796875 0 197.2687530517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8954247845993557 0.38584274873864577 0.8800574222662715 }
radiance 28
center -231.38157653808594 0 271.0951843261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9886489528941286 0.42828113751702895 0.916139730096199 }
radiance 31
center -181.39401245117188 0 196.500244140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8783773336617265 0.3504363791849921 0.9 }
radiance 20
center -178.44444274902344 0 261.645751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9363192296771118 0.4591510853476043 0.9158720437293423 }
radiance 27
center -198.72653198242188 0 273.3249816894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8621983645202826 0.39456757813974774 0.9377755528578937 }
radiance 23
center -237.87661743164062 0 228.70481872558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9228873822112643 0.43560339120862746 0.9634457311582473 }
radiance 29
center -228.77532958984375 0 223.2897491455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9856314070003711 0.46028244946765673 0.9844095245690369 }
radiance 22
center -222.5809326171875 0 188.37664794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9500253927616256 0.3237280258155749 0.9268589435464756 }
radiance 20
center -179.71731567382812 0 221.92958068847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5402633353637573 0.34186511557263827 0.9 }
radiance 21
center -211.99208068847656 0 231.6356964111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8306876444333011 0.4743488349120175 0.9109490373926409 }
radiance 26
center -179.4346923828125 0 274.9317626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9119374035223864 0.40499274244029926 0.8198523023381064 }
radiance 19
center -157.38592529296875 0 214.11570739746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8093094744952216 0.41355440727544124 0.886419103032958 }
radiance 31
center -236.8262939453125 0 205.96461486816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8895509673526087 0.3641043765656724 0.9683645253411001 }
radiance 18
center -221.64920043945312 0 262.1212158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8924615511973305 0.49722043368788327 0.872750957352242 }
radiance 24
center -255.05824279785156 0 233.0626983642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9429220356024091 0.3598635716416922 0.80476482941771 }
radiance 25
center -177.39547729492188 0 243.258544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3741768399511296 0.6640637136698084 }
radiance 28
center -197.2096710205078 0 281.9030456542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9283963110237381 0.43154343454448074 0.9994650129375315 }
radiance 23
center -248.9873504638672 0 210.73828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3146260654206292 0.8031876691270697 }
radiance 28
center -205.93907165527344 0 231.52305603027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8126843987897213 0.3083441994733696 0.8976009016381072 }
radiance 31
center -168.9017791748047 0 218.47203063964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7158541364053085 0.4469675744985137 0.9 }
radiance 19
center -185.5086669921875 0 207.4473419189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5794615195312571 0.4515244035377679 0.9 }
radiance 25
center -265.9090881347656 0 268.3060607910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8452226625792578 0.3391246542204223 0.9 }
radiance 29
center -168.7003173828125 0 251.0390167236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8688566855122072 0.43587552928524564 0.8095243354636099 }
radiance 19
center -237.78302001953125 0 217.57797241210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5035536167637192 0.4999626057868448 0.9 }
radiance 22
center -256.0097961425781 0 234.57762145996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205876745718747 0.4191760235058743 0.8557454091725933 }
radiance 26
center -176.953369140625 0 261.80596923828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9504285000993733 0.3255531570981878 0.8147716359803095 }
radiance 31
center -250.75930786132812 0 213.48410034179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5170004890460685 0.31217822744319634 0.9 }
radiance 16
center -241.85879516601562 0 244.88487243652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9555149722714432 0.4314744685923838 0.9735399245963989 }
radiance 28
center -227.56204223632812 0 208.17483520507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8358225274821625 0.337185838058268 0.9826275544237653 }
radiance 23
center -259.7149658203125 0 167.85023498535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9930630751725256 0.32759100997549856 0.8097693769605436 }
radiance 28
center -201.3354949951172 0 253.30484008789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.988282150895539 0.3127627962114797 0.849771871899751 }
radiance 16
center -224.11477661132812 0 262.34332275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37540768778699485 0.49737988988895554 }
radiance 22
center -194.6648406982422 0 235.71527099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7682596944797279 0.32813300793901773 0.9 }
radiance 21
center -197.67864990234375 0 257.0543518066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9593789634081221 0.37211834684362016 0.8766016946780484 }
radiance 19
center -189.54896545410156 0 235.0807342529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6413897565716866 0.4933723624475651 0.9 }
radiance 30
center -229.57852172851562 0 212.43052673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8946805139731413 0.30437253536361686 0.8367434824179879 }
radiance 25
center -251.09764099121094 0 223.68397521972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4133352987395551 0.3760080739025826 0.9 }
radiance 19
center -251.92039489746094 0 228.4017791748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31972057096146334 0.5038079662122787 }
radiance 25
center -250.5633544921875 0 160.72207641601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9480915208927267 0.31413772096140263 0.9871825101096879 }
radiance 26
center -239.61305236816406 0 227.49977111816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9038151645479393 0.4527983548483424 0.9771735402761355 }
radiance 23
center -277.7318115234375 0 210.62693786621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.96421035941573 0.41043786615669386 0.8416200273804654 }
radiance 17
center -266.8074035644531 0 209.21347045898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8835571506229009 0.35958571200829903 0.9 }
radiance 28
center -214.197998046875 0 235.9722137451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9077000141627974 0.38086568675993887 0.9996044129918873 }
radiance 30
center -220.59280395507812 0 156.68333435058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9057266416231934 0.40480655516303177 0.8220685821180194 }
radiance 30
center -279.7281494140625 0 182.91510009765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448196938195995 0.313035365689379 0.9 }
radiance 20
center -203.15542602539062 0 246.4097137451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8338988272879765 0.3436274112094215 0.8913028572449035 }
radiance 28
center -188.448486328125 0 159.1652374267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9887127304219379 0.33060058551673227 0.9651231678921883 }
radiance 28
center -210.4092559814453 0 216.2671356201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8095761343603761 0.49720268572699283 0.9147718036064303 }
radiance 16
center -189.24256896972656 0 219.43394470214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9332205051445648 0.30449905315336273 0.8951563568646508 }
radiance 17
center -221.4311065673828 0 224.34439086914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9578140568867914 0.4949241043360245 0.8083259853347364 }
radiance 24
center -260.9270935058594 0 216.43594360351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4331871447264938 0.4528522986482735 }
radiance 23
center -208.33145141601562 0 203.51339721679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8480983916891343 0.4937939946910667 0.805900637075532 }
radiance 20
center -198.86375427246094 0 189.9614715576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8755803315840731 0.4029315347168149 0.8316856985798554 }
radiance 20
center -228.95867919921875 0 226.27198791503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8871855299081475 0.3713791493270295 0.9669228056963212 }
radiance 31
center -219.11605834960938 0 161.27975463867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8188479698589466 0.3914214322543704 0.8981586904468658 }
radiance 18
center -205.79762268066406 0 156.55015563964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4938200181947088 0.5210322240528061 }
radiance 23
center -218.9983367919922 0 183.70046997070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9476897329121144 0.358271968947751 0.8877542864571806 }
radiance 21
center -191.8395233154297 0 214.72470092773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8634726830481231 0.4463509975333943 0.8520728549830836 }
radiance 24
center -233.43411254882812 0 158.86398315429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9009680681579343 0.3675852930608159 0.80172033474691 }
radiance 16
center -201.8485870361328 0 209.74180603027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31677536340438633 0.8682952069166293 }
radiance 25
center -237.90667724609375 0 193.80307006835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45011412278515167 0.8477596202773147 }
radiance 16
center -285.7601318359375 0 142.5587158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8846204716754603 0.49447056594553573 0.8231412754595357 }
radiance 18
center -228.4491424560547 0 133.31845092773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4265770981905225 0.7507980115034523 }
radiance 16
center -238.28321838378906 0 200.7515869140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8632796590132115 0.3226239536434777 0.9875103500316547 }
radiance 17
center -249.3316650390625 0 203.8050079345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47356903543069373 0.5328652122422232 }
radiance 31
center -276.43731689453125 0 167.74911499023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9743489559180449 0.39198709918944763 0.9369056242572785 }
radiance 19
center -241.78526306152344 0 188.51837158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9211503597092672 0.3224571777030461 0.9557025127154903 }
radiance 25
center -222.42828369140625 0 186.76663208007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9481587723649656 0.35076041018860393 0.9582684914584063 }
radiance 18
center -229.22702026367188 0 138.55825805664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.987372305897273 0.42740027843232686 0.9965509700368922 }
radiance 26
center -242.85580444335938 0 155.7191925048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9487607486455336 0.4643273717708405 0.8444868777661366 }
radiance 26
center -286.9320373535156 0 146.80397033691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7907647958949741 0.37634832966657433 0.9 }
radiance 27
center -191.7872314453125 0 142.21656799316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8788992104927633 0.42162324277360885 0.9226414060329559 }
radiance 24
center -248.64137268066406 0 218.96551513671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3524318249436882 0.6268468832835568 }
radiance 21
center -226.97862243652344 0 188.63047790527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3234865815804628 0.5421769844207207 }
radiance 30
center -242.63043212890625 0 147.778076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.981194060757913 0.47062777368917674 0.9246654658482096 }
radiance 30
center -275.2930908203125 0 217.1895294189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.89726088492226 0.4489126952888533 0.9003787574054838 }
radiance 28
center -264.5962829589844 0 232.2511749267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9314057580028217 0.4802829992849922 0.8983805115271921 }
radiance 31
center -232.37867736816406 0 167.61793518066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8327789524888368 0.33028838885642176 0.9214807171650438 }
radiance 24
center -210.52639770507812 0 196.22557067871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46641000867175414 0.7413038909714303 }
radiance 22
center -268.4142761230469 0 162.13572692871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9680541455228487 0.42171401456386537 0.9040515237492238 }
radiance 31
center -196.54373168945312 0 119.33705139160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.882582446715745 0.36212609751938246 0.9062281164509436 }
radiance 20
center -239.82913208007812 0 178.96722412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9763774217385525 0.4718579855716142 0.8443771899581705 }
radiance 22
center -277.9894714355469 0 174.82318115234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8393481729597707 0.4327292909864895 0.8904331690012072 }
radiance 31
center -226.31887817382812 0 129.40646362304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9379961269727943 0.4249018116457679 0.9147013099253711 }
radiance 31
center -224.02865600585938 0 131.18614196777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8946402593215559 0.36360878546421666 0.9320011093067668 }
radiance 31
center -255.3685302734375 0 169.10169982910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.978646407424288 0.3124467741222639 0.9248408206162237 }
radiance 24
center -291.4063415527344 0 151.37530517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8610793409242123 0.44668880203598793 0.9147374239338903 }
radiance 18
center -216.84014892578125 0 142.88035583496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9445315506801242 0.42356047899001936 0.8518642468110273 }
radiance 20
center -243.4822235107422 0 136.92886352539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.992135001895674 0.3025165733020698 0.9087282778567738 }
radiance 22
center -297.25146484375 0 175.5643768310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8903554338301142 0.36661392705649654 0.9559043892517377 }
radiance 20
center -291.3110656738281 0 192.00938415527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.884537877927638 0.30612015326908215 0.9811714725269653 }
radiance 29
center -253.91421508789062 0 126.33659362792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8455204564187007 0.34000900123208655 0.9 }
radiance 31
center -232.95419311523438 0 134.2182159423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9934692039162244 0.3329260932006432 0.8194086290081586 }
radiance 22
center -207.33331298828125 0 213.46127319335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9151638158000831 0.4761958610922459 0.809475893224699 }
radiance 19
center -256.6877746582031 0 194.52565002441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8550238423405491 0.3864750543039243 0.8893696270374498 }
radiance 19
center -215.0194091796875 0 181.39697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8726915588696504 0.4554595148585298 0.9 }
radiance 26
center -291.3050231933594 0 155.12559509277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7661102159147168 0.38429343956479567 0.9 }
radiance 30
center -289.5651550292969 0 177.96177673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.864289853535988 0.34958923376975487 0.9669078132100489 }
radiance 16
center -280.3187561035156 0 187.3055419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8791094865798964 0.39870171006872124 0.8700327095221692 }
radiance 27
center -261.6751708984375 0 101.50886535644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3151089502294912 0.4760193419498021 }
radiance 18
center -259.8835754394531 0 165.99453735351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40082811624650233 0.5780794423303347 }
radiance 19
center -217.02464294433594 0 134.7547607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8575261602425984 0.37781222744462106 0.8470480710716104 }
radiance 25
center -228.64952087402344 0 154.80067443847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38316015941620285 0.44446218313731334 }
radiance 29
center -231.9115447998047 0 172.54202270507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9725204978283224 0.3453625202791514 0.9091463159063244 }
radiance 18
center -231.34707641601562 0 162.6069793701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47921754431639385 0.6818863630413888 }
radiance 19
center -296.53515625 0 122.16899108886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8541075508612874 0.3448213982270789 0.9924843547467399 }
radiance 26
center -284.23345947265625 0 124.01622772216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8294626792383344 0.37098330567976734 0.8982996766430345 }
radiance 23
center -273.6783142089844 0 101.06253051757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8079080344537038 0.4861979404504606 0.9432725385711929 }
radiance 26
center -218.66229248046875 0 153.118408203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8519185199544431 0.3764258504017709 0.8924282768958776 }
radiance 21
center -234.72402954101562 0 128.330810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9204690220092466 0.4724736638096494 0.8824890755067745 }
radiance 28
center -287.4637145996094 0 118.89714813232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4382703665783393 0.6215939547777548 }
radiance 21
center -243.69358825683594 0 111.01496887207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9747592654988428 0.3596841321438989 0.8015524753181523 }
radiance 29
center -266.3011474609375 0 120.09449005126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9020324531426074 0.3780644305536023 0.8333362152835233 }
radiance 17
center -222.67404174804688 0 139.9416961669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38407470347574046 0.6162694346585205 }
radiance 30
center -271.0083312988281 0 125.10582733154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9422341407307118 0.3882856878663995 0.8071669175168299 }
radiance 20
center -280.84246826171875 0 110.47505187988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9430523056324549 0.4277121278643342 0.8542582425754564 }
radiance 18
center -273.054931640625 0 138.60202026367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9514925441401291 0.47565292422898775 0.8626690883069372 }
radiance 22
center -263.9217529296875 0 192.58912658691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8008701580059017 0.36730497732852435 0.989608367753588 }
radiance 23
center -247.54913330078125 0 143.8785858154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205997689826074 0.4786404981780369 0.9782267915579907 }
radiance 24
center -218.94407653808594 0 81.97869873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130843861389683 0.4127516258092718 0.8260259839139841 }
radiance 21
center -274.160888671875 0 140.48370361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9889586926601763 0.42982308879703435 0.8972487042039625 }
radiance 29
center -304.88372802734375 0 95.32172393798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9465892397183714 0.4261333243174201 0.9412490528881243 }
radiance 25
center -297.7864074707031 0 93.60807037353516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8096777077754181 0.4717917396526534 0.9 }
radiance 31
center -215.04750061035156 0 107.21509552001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5508456144503929 0.4084989285756011 0.9 }
radiance 18
center -235.81082153320312 0 144.44866943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5701288934269596 0.4980829385405673 0.9 }
radiance 21
center -297.1062927246094 0 126.40364074707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8286860983278453 0.4706625924551372 0.8474534338229917 }
radiance 18
center -217.17489624023438 0 114.48336029052734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9042731248050447 0.3351727448351076 0.8913196270894556 }
radiance 24
center -208.90621948242188 0 107.19361114501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9461115626516963 0.39247520237576294 0.8553533418221017 }
radiance 24
center -259.6749267578125 0 81.41899871826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9075670849927644 0.41315573254560267 0.8302015036439099 }
radiance 28
center -290.20263671875 0 156.69361877441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7328424844927255 0.3775112003223839 0.9 }
radiance 27
center -211.63946533203125 0 87.86225891113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8892034425482096 0.31894204339046334 0.9640576584204422 }
radiance 20
center -259.47747802734375 0 135.6352996826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6990360764857965 0.4843500988572495 0.9 }
radiance 28
center -222.72061157226562 0 98.98162841796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9384939166585743 0.3522815695149869 0.8915060736979717 }
radiance 30
center -260.9320373535156 0 83.84441375732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9358407086402957 0.461775360361118 0.806921872220511 }
radiance 28
center -253.15931701660156 0 79.82819366455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8707530961099663 0.3297376124859803 0.9748570956190065 }
radiance 28
center -304.7210998535156 0 113.50831604003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.586853427020093 0.3353590771068978 0.9 }
radiance 20
center -299.9581298828125 0 155.99220275878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.847533587310958 0.4162197524971164 0.8999609845428868 }
radiance 22
center -300.6958923339844 0 80.41241455078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9221684397104172 0.419467991709699 0.9430402802526403 }
radiance 22
center -261.5033264160156 0 138.0323486328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8405789866904607 0.42213499360975026 0.8027875744088 }
radiance 29
center -284.33990478515625 0 131.35995483398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9272722803210766 0.44285989233927747 0.918179783691034 }
radiance 30
center -266.094482421875 0 134.56944274902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7108611888462201 0.32082370312657577 0.9 }
radiance 22
center -308.00201416015625 0 64.22095489501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8620584094595469 0.41429045847353174 0.8674032695639913 }
radiance 23
center -273.8034362792969 0 145.84580993652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9129142551722251 0.3773266813133034 0.815958303217637 }
radiance 25
center -273.1711120605469 0 85.34683990478516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9531553211718142 0.4515520799367957 0.98923035969502 }
radiance 24
center -291.6677551269531 0 74.01396179199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9590205219644374 0.32203587945986933 0.8600439316777081 }
radiance 27
center -257.9919738769531 0 146.61744689941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8254317689320807 0.37519554649127995 0.9976253563557849 }
radiance 24
center -263.0868835449219 0 82.3496322631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9316400520395972 0.49168847816961014 0.8400863166200538 }
radiance 21
center -299.9109802246094 0 145.9751739501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.915243307312758 0.30296469288547573 0.9874887347250955 }
radiance 27
center -291.0726013183594 0 155.98965454101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8028774146847569 0.3082539388647168 0.9745634099446752 }
radiance 24
center -309.68670654296875 0 122.22664642333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9323361673756779 0.39002690255547584 0.9841277266510022 }
radiance 28
center -269.61212158203125 0 115.62376403808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35264461352641513 0.8535925641088241 }
radiance 30
center -224.7231903076172 0 135.78005981445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9733377593012963 0.3474270258280081 0.8707304958263483 }
radiance 25
center -304.2049865722656 0 132.98316955566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9149240772911799 0.3312753669448929 0.8847159229856878 }
radiance 18
center -278.5906066894531 0 138.5716552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6379272305550885 0.3241087349044974 0.9 }
radiance 19
center -299.1141662597656 0 129.12057495117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9668851057854615 0.49147435461411104 0.8076676585007802 }
radiance 27
center -254.76199340820312 0 134.05853271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9063175685307592 0.48058630138509184 0.9899179863166243 }
radiance 21
center -309.3423156738281 0 138.8154754638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9645662668305466 0.36945031175509907 0.9442949788594088 }
radiance 27
center -228.5696563720703 0 117.10115051269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8410447069898995 0.30604479334102763 0.9115706490911556 }
radiance 22
center -303.3279113769531 0 89.91654205322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38755491161033395 0.46495193861992967 }
radiance 23
center -281.0871276855469 0 61.030784606933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8082805449540549 0.400555138471403 0.9229995688804151 }
radiance 18
center -233.32899475097656 0 77.88994598388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9627968416052828 0.3450658414242019 0.973307763082442 }
radiance 24
center -222.70069885253906 0 41.392730712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8327426630556664 0.3101710681027919 0.8146540864956988 }
radiance 22
center -216.30230712890625 0 116.11934661865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9966423807448412 0.3608100148794347 0.8880294567868283 }
radiance 17
center -257.71038818359375 0 78.81779479980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.308378884135771 0.5444093730287225 }
radiance 25
center -275.5709533691406 0 46.77461242675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37748354838101617 0.809759126780502 }
radiance 25
center -276.3514709472656 0 71.04248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8604288072350768 0.337262973555238 0.8658845764880458 }
radiance 18
center -278.3302307128906 0 110.04132843017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.919638039176699 0.3782466771992731 0.9565985676797576 }
radiance 31
center -284.59588623046875 0 83.38029479980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9243746726760603 0.30332845258921687 0.9712989450404701 }
radiance 31
center -236.66885375976562 0 89.10920715332031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8707673531388491 0.33413506059746717 0.9619528288394967 }
radiance 26
center -247.80953979492188 0 135.62977600097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4147466686047948 0.4685223463846146 0.9 }
radiance 27
center -295.8839111328125 0 133.9875946044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9977027695460342 0.3334972903915971 0.9684772219129493 }
radiance 26
center -223.2581024169922 0 117.12689208984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.927028866710693 0.31894321186090413 0.8208110251069309 }
radiance 22
center -247.38925170898438 0 112.81041717529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9703920885270112 0.32998647020577826 0.8120804644240176 }
radiance 18
center -226.9075469970703 0 91.9201431274414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.830658121346349 0.4856594697967894 0.9396765974394585 }
radiance 19
center -247.2194061279297 0 98.96776580810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8245871571290968 0.3786829543258898 0.9634775290821582 }
radiance 22
center -310.9627685546875 0 139.22335815429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8701201225914874 0.3467786191937124 0.8451988371593708 }
radiance 29
center -238.36630249023438 0 136.38795471191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5688223789917576 0.41539835539230074 0.9 }
radiance 22
center -294.57489013671875 0 136.56668090820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8244464248011155 0.40901972498556705 0.9881971715110535 }
radiance 24
center -235.687255859375 0 101.6613998413086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34697699438865104 0.5804552693997836 }
radiance 29
center -283.8792724609375 0 38.94562530517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8540863369126616 0.3597043150983998 0.8810089740388312 }
radiance 22
center -284.5205383300781 0 87.22364044189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8130884428278474 0.3332442422256713 0.9480158832558151 }
radiance 17
center -229.57994079589844 0 105.90424346923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9214621741877904 0.31490664599395013 0.9298988143163981 }
radiance 18
center -231.392822265625 0 48.69035339355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9051218322364493 0.43748956559380037 0.9017509049191155 }
radiance 20
center -237.6343231201172 0 71.58724975585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8623880193239268 0.448312274511087 0.9463400888094686 }
radiance 17
center -244.30508422851562 0 42.03885269165039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8967221715383141 0.3441519205331806 0.9981984908613226 }
radiance 21
center -311.1732482910156 0 87.03778839111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4087197639936525 0.35997047623253653 0.9 }
radiance 29
center -264.3346862792969 0 49.503448486328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8592904335464766 0.4546319154016034 0.9445018347738288 }
radiance 21
center -267.6944274902344 0 119.57866668701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8289224804570663 0.4930261982354095 0.871244157006775 }
radiance 16
center -275.3609924316406 0 96.74220275878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8816777764760688 0.35870598700859385 0.8391182735162057 }
radiance 24
center -236.74859619140625 0 84.37089538574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8184926319861086 0.306263155974072 0.9543224627205417 }
radiance 21
center -294.14190673828125 0 65.06979370117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8751859332176766 0.44897583888587533 0.8367292094220526 }
radiance 20
center -254.04910278320312 0 50.741981506347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9986943702474014 0.36423073905783687 0.8961792917253327 }
radiance 22
center -285.5376892089844 0 50.18389892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8446084470136836 0.36496663291469755 0.8777020030643132 }
radiance 20
center -275.61419677734375 0 108.40192413330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9700837847752515 0.45317062040252554 0.9774109385444232 }
radiance 25
center -237.13360595703125 0 86.39596557617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8245678282046628 0.31101624318618026 0.861399760392394 }
radiance 28
center -257.80596923828125 0 25.746129989624023
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4458753732078554 0.3461449638262329 0.9 }
radiance 24
center -279.141357421875 0 99.85289764404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9840069749612256 0.4450766695211349 0.9815276357736588 }
radiance 23
center -263.8157043457031 0 95.41754150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9604941425440275 0.3459363564387513 0.8061039170437766 }
radiance 24
center -302.89288330078125 0 32.72469711303711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9097565149177673 0.40988864610735964 0.8245853391893934 }
radiance 23
center -222.57473754882812 0 81.40830993652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6646538202651102 0.42898257251073935 0.9 }
radiance 17
center -298.19140625 0 4.154887676239014
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8691757891721719 0.3173082115454489 0.9107098651745213 }
radiance 18
center -290.51251220703125 0 17.203502655029297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5269371087458562 0.4466570096981798 0.9 }
radiance 29
center -286.4726867675781 0 95.9061279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9194147539976931 0.31160919970565915 0.9629702963649887 }
radiance 30
center -223.03562927246094 0 29.201217651367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8018050873864608 0.39255381232387443 0.9474931667448732 }
radiance 21
center -243.1216278076172 0 36.20296859741211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8069787076615681 0.4568143552627396 0.8857885695661161 }
radiance 20
center -317.0517883300781 0 56.153831481933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45920316863201316 0.38522357791771666 0.9 }
radiance 24
center -234.5625457763672 0 35.58967208862305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9812014567625817 0.3197952401263261 0.9053072676142737 }
radiance 31
center -251.35997009277344 0 6.710205554962158
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8466974803099003 0.3214368493892862 0.9449994057279775 }
radiance 22
center -247.69140625 0 54.88076400756836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32068587347190053 0.596668319102592 }
radiance 28
center -247.6712188720703 0 71.03141021728516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9875147989534633 0.4027401221563609 0.9981378469937843 }
radiance 18
center -229.99403381347656 0 39.04637908935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8677937292517193 0.4872603590160762 0.8096397976127148 }
radiance 16
center -303.8851013183594 0 39.03929901123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.906628988322016 0.35601443563230545 0.8752622993147596 }
radiance 18
center -224.34078979492188 0 29.519397735595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9212515512939097 0.30119634834203535 0.9877430537347268 }
radiance 18
center -226.4752655029297 0 100.0986099243164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8403395683575763 0.33629522967870834 0.8758293978896454 }
radiance 19
center -245.2386932373047 0 8.677885055541992
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.81218507366689 0.46165006449278634 0.9888818195053508 }
radiance 27
center -306.7107849121094 0 66.02803802490234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8519724930240362 0.3688498457869499 0.8593382205259809 }
radiance 17
center -269.2693176269531 0 76.50634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44574435068445173 0.7089464094960773 }
radiance 30
center -285.4381103515625 0 76.58921813964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8947307560791861 0.3052020348189187 0.823440749989451 }
radiance 30
center -303.3387145996094 0 31.153156280517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3986565940253346 0.7922726404096159 }
radiance 31
center -293.3893737792969 0 57.68540954589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9836420466362042 0.3188964030717839 0.8648725483059844 }
radiance 20
center -263.6083068847656 0 41.61412048339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8899001870650813 0.4170528712122261 0.9270083549086241 }
radiance 17
center -310.0986022949219 0 24.586414337158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9089223665435748 0.32048118756293414 0.9187641155028947 }
radiance 25
center -315.2096252441406 0 65.65453338623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5714901800601594 0.3986840464077158 0.9 }
radiance 31
center -293.24725341796875 0 27.468164443969727
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717660761690319 0.48463013758877244 0.9006554593687943 }
radiance 30
center -224.08154296875 0 27.282421112060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8952897537404148 0.43111901644368544 0.8744532925435062 }
radiance 20
center -313.20098876953125 0 15.083703994750977
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9334961901260224 0.3043574182050887 0.9685628527851075 }
radiance 18
center -225.1668701171875 0 36.465171813964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3614525215932341 0.5175293707629548 }
radiance 25
center -245.54440307617188 0 50.84849548339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8917441347113293 0.34022207928368237 0.8663962806116929 }
radiance 25
center -232.345947265625 0 43.619258880615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.81301878897702 0.39474864782386143 0.8391854590156894 }
radiance 30
center -260.8314208984375 0 2.0767388343811035
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8099863056409964 0.37285832242347616 0.9743043531535205 }
radiance 28
center -291.26629638671875 0 33.13678741455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9074825581570011 0.44787540832302175 0.9813827713214218 }
radiance 25
center -244.6298065185547 0 -10.609833717346191
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8041775465888555 0.4032994230279223 0.9070570214855487 }
radiance 18
center -313.5629577636719 0 -4.712869644165039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8588176312945783 0.48443525272267396 0.8425932515502083 }
radiance 19
center -223.36032104492188 0 33.89639663696289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5293320594642934 0.3589443470711516 0.9 }
radiance 23
center -272.586181640625 0 65.94805908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9986131454709536 0.43723039592890134 0.8200150098614042 }
radiance 25
center -222.07899475097656 0 32.148277282714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9508964838447892 0.4502774812928819 0.836043544447556 }
radiance 23
center -288.6532287597656 0 66.11304473876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8703921928355 0.4333386733021175 0.9628502965576268 }
radiance 28
center -258.8368225097656 0 54.526268005371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46738690753776657 0.8881486891485258 }
radiance 17
center -274.6746520996094 0 -15.526358604431152
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8123911943256811 0.34603237394034736 0.9184115307775417 }
radiance 22
center -301.0336608886719 0 -4.1668701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9288475593211784 0.38392749647177193 0.8079931913016498 }
radiance 26
center -302.6881408691406 0 -18.74393653869629
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7285437564238466 0.3024528966083543 0.9 }
radiance 17
center -273.5444030761719 0 -1.0968977212905884
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8731156542038654 0.48854450578744574 0.9761673530292431 }
radiance 24
center -226.400390625 0 -11.568601608276367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9306138643411601 0.32567193896016966 0.8429968898953645 }
radiance 30
center -303.1656799316406 0 8.996785163879395
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.800530405628628 0.4177644987351358 0.852821604260393 }
radiance 29
center -305.81396484375 0 44.26145935058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9638500651156667 0.31497581677129977 0.8821698954394827 }
radiance 31
center -249.89794921875 0 -17.88530158996582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9211966777137179 0.45798710272299437 0.8848400440091914 }
radiance 22
center -260.42803955078125 0 16.886722564697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9335953988854688 0.302266664219833 0.9795067658850445 }
radiance 31
center -231.76499938964844 0 50.912506103515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9572899253068083 0.49616242104811026 0.9141971017598887 }
radiance 21
center -239.50413513183594 0 54.09169006347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8832880516583191 0.4553646133825323 0.8998956053292241 }
radiance 29
center -312.02435302734375 0 26.715362548828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9116298886045956 0.42872244415102323 0.891624650997451 }
radiance 26
center -278.20892333984375 0 57.90968322753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8019644969697017 0.34764964947425697 0.8667355647746298 }
radiance 21
center -285.2341003417969 0 -18.412307739257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8042167002051677 0.4043306058322437 0.9876069498622833 }
radiance 21
center -284.5774230957031 0 32.009674072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.457089742406054 0.5784459706573304 }
radiance 20
center -300.40374755859375 0 26.179840087890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7748986251138121 0.3415607740250995 0.9 }
radiance 16
center -313.3736877441406 0 61.22300338745117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603054126462989 0.43456014418786426 0.9 }
radiance 24
center -266.51263427734375 0 12.601186752319336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9281519023127165 0.44442433436541207 0.9835617496128696 }
radiance 19
center -298.2497253417969 0 20.621204376220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9915235679327199 0.49584873907037785 0.8215761169377552 }
radiance 18
center -247.87242126464844 0 -1.2969939708709717
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8082575446277542 0.33650868700432 0.9194562779922039 }
radiance 25
center -299.42529296875 0 31.709684371948242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8004503278142024 0.37987740352195354 0.9160862424686305 }
radiance 16
center -262.4631042480469 0 -41.52480697631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4124698419260122 0.3473602278376321 0.9 }
radiance 16
center -260.0347595214844 0 -50.877403259277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5109916247347124 0.37188940389041925 0.9 }
radiance 21
center -275.0771484375 0 38.33634948730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8617582175078332 0.3142303460381231 0.8703665393338836 }
radiance 20
center -298.6070556640625 0 20.471311569213867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9129014171930765 0.3190706209491426 0.8219445572781702 }
radiance 24
center -276.1462707519531 0 34.371620178222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.88946218323696 0.3803361403893233 0.9 }
radiance 22
center -252.50430297851562 0 -5.178765773773193
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9382693243363773 0.32257120041260184 0.8737235029001877 }
radiance 27
center -217.50381469726562 0 -3.4943833351135254
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9650502749445672 0.4309805824574665 0.9075723670071392 }
radiance 19
center -290.4124450683594 0 0.04788319766521454
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8549966567653373 0.3312052049588013 0.8082003956967788 }
radiance 21
center -244.35421752929688 0 40.27933120727539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9899078434996633 0.44614744618825686 0.8505854019060087 }
radiance 22
center -228.42791748046875 0 23.260433197021484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8720481021403548 0.33141127322297054 0.859205782632502 }
radiance 25
center -309.3338317871094 0 -21.059946060180664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7213582359293244 0.45435146995418746 0.9 }
radiance 29
center -242.92831420898438 0 -42.132450103759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9265340154961564 0.4598672002117228 0.8933602109018682 }
radiance 16
center -241.0852813720703 0 5.899876117706299
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9858609769798495 0.34639562109367067 0.9052085571923928 }
radiance 18
center -288.929443359375 0 17.451730728149414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8610093381215858 0.4217079423067562 0.8701665635276414 }
radiance 31
center -258.8765869140625 0 -16.316852569580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6928858246046105 0.35968123879618835 0.9 }
radiance 27
center -303.6967468261719 0 25.779848098754883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8849695038912978 0.45465143486948345 0.922547274939793 }
radiance 27
center -310.4460144042969 0 34.98245620727539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3827558003021512 0.5433682996780623 }
radiance 18
center -216.6181640625 0 -9.875471115112305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9094706942746831 0.3259318587118555 0.8184648862130111 }
radiance 26
center -260.64752197265625 0 25.86913299560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9377965954699571 0.3403801205937903 0.9805932151138554 }
radiance 22
center -285.1997375488281 0 -13.884499549865723
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8778930479898532 0.3890251797599633 0.821678303754085 }
radiance 31
center -304.6689453125 0 25.22294807434082
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.857270804907137 0.3571323943383054 0.9826831616246863 }
radiance 31
center -285.1911926269531 0 19.222736358642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8553735804495163 0.35006561787485696 0.9 }
radiance 16
center -298.1966857910156 0 -62.59514617919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8275731729747476 0.39837021873546374 0.8349371720923264 }
radiance 25
center -240.28909301757812 0 3.164045572280884
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.815093162468273 0.3631332949242811 0.9 }
radiance 26
center -254.27330017089844 0 0.9816250205039978
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41615240255501573 0.6503094727062362 }
radiance 30
center -280.70135498046875 0 -62.62430191040039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8764949022399718 0.3436802646964075 0.8816220876800834 }
radiance 19
center -282.30181884765625 0 7.955565452575684
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.848496606602609 0.4152598108836083 0.8795748667436185 }
radiance 18
center -255.99403381347656 0 3.1357271671295166
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9802816632852154 0.37659095681478383 0.919818643154295 }
radiance 16
center -297.43719482421875 0 -6.73869514465332
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872121691578062 0.3448046191360075 0.8670399081649078 }
radiance 16
center -232.13414001464844 0 -36.945648193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4845544311971637 0.6566141720757989 }
radiance 26
center -235.13099670410156 0 -60.900726318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9919986221689568 0.37555466049592257 0.90317078034736 }
radiance 18
center -298.013916015625 0 -24.988082885742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3418685317071338 0.7802410017682667 }
radiance 29
center -277.33380126953125 0 7.551393508911133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.826484106847409 0.33596527662500153 0.9562051156314648 }
radiance 30
center -254.26309204101562 0 -8.58704662322998
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9712489942835627 0.38365123598338297 0.808089220017457 }
radiance 31
center -286.5893249511719 0 21.542165756225586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41735747751260854 0.3358817361232911 0.9 }
radiance 27
center -298.25531005859375 0 -15.928095817565918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8190916450830796 0.3457125474549549 0.9155254258594766 }
radiance 28
center -236.00479125976562 0 -45.686824798583984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.885406403716068 0.37697655273589936 0.9199565141159509 }
radiance 21
center -300.33294677734375 0 -19.69683074951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9522685287039319 0.36711276304617246 0.8993205058578816 }
radiance 22
center -241.63693237304688 0 -54.103092193603516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9248101215933413 0.4132037402199036 0.8194535307920215 }
radiance 19
center -219.90138244628906 0 -3.231381893157959
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867154453800194 0.48796409094766524 0.8418293141869749 }
radiance 28
center -256.67926025390625 0 -15.413435935974121
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8008956323564848 0.4862197623422789 0.9979733982223198 }
radiance 31
center -298.428955078125 0 -63.76420593261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8648958618596478 0.41618369359685675 0.8486501692736914 }
radiance 21
center -251.38027954101562 0 -25.859533309936523
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9414507876430707 0.46992056930705406 0.8842722334022047 }
radiance 21
center -211.57420349121094 0 -63.12540054321289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9668769423840414 0.43169949663885565 0.8256005273390926 }
radiance 20
center -209.30194091796875 0 7.276257514953613
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.662308176734209 0.4937804897575716 0.9 }
radiance 24
center -300.85467529296875 0 -62.946815490722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.950126719993273 0.33850255994790507 0.8822655690705002 }
radiance 18
center -268.3512878417969 0 -61.88482666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.854247055297894 0.43581653940243015 0.94636579879345 }
radiance 29
center -244.26097106933594 0 -10.54992961883545
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8897905868596556 0.36489207523341993 0.9057331943728968 }
radiance 21
center -289.5351867675781 0 1.5611252784729004
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8999839840522954 0.3697150005835763 0.8667948084220225 }
radiance 28
center -241.0007781982422 0 7.158015251159668
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9782483883649147 0.4772781236568928 0.8970713739974485 }
radiance 16
center -277.7407531738281 0 -23.83324432373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9041086952231199 0.45465999712135086 0.8019560038450578 }
radiance 27
center -276.4444580078125 0 -84.12950134277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8913970740901921 0.3067941695629881 0.9725569792964193 }
radiance 26
center -235.53099060058594 0 -32.07276916503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9562678511214893 0.43650536317049937 0.8764432549430248 }
radiance 26
center -245.31788635253906 0 -11.828948020935059
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9787750193594184 0.35205259862313026 0.9566471473514787 }
radiance 20
center -259.5535583496094 0 -20.65319061279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.314196335434027 0.6136996882544569 }
radiance 18
center -297.6250915527344 0 -49.0439567565918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8986073695611141 0.36814560047601214 0.9624008437386382 }
radiance 28
center -281.52496337890625 0 -14.229442596435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8288491525953924 0.41418387007953106 0.9143878037455413 }
radiance 20
center -211.15826416015625 0 -29.888639450073242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9585325214717529 0.483552746480532 0.8235369682439676 }
radiance 29
center -281.1049499511719 0 -38.64438247680664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.949487562806117 0.32263867430084314 0.8126904798067816 }
radiance 16
center -269.12847900390625 0 -77.37515258789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6492224360621244 0.339075911183684 0.9 }
radiance 26
center -204.20062255859375 0 -20.278335571289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9470940316246702 0.3123844011727523 0.8512360558772487 }
radiance 25
center -279.76971435546875 0 -27.524953842163086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34847708074505335 0.6404448274777516 }
radiance 28
center -272.80963134765625 0 -11.490087509155273
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8546639336193996 0.4322684948115676 0.8427256659714659 }
radiance 24
center -294.8706970214844 0 -76.14188385009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9597290682393187 0.3468071795940433 0.8766476049756771 }
radiance 17
center -280.0231018066406 0 -81.70526123046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8526419551616746 0.42669950576382404 0.9 }
radiance 27
center -274.3750915527344 0 -46.723575592041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8340267545295055 0.3048951594957769 0.9 }
radiance 28
center -269.1910400390625 0 -99.54059600830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8415234745664015 0.4213117913770005 0.9395003718596855 }
radiance 31
center -209.376220703125 0 -49.222930908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45375739704138796 0.6785639379682185 }
radiance 27
center -251.63424682617188 0 -94.71681213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9874552140780356 0.3047896111495019 0.8221303463430986 }
radiance 30
center -279.93890380859375 0 -15.126683235168457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8592504188086533 0.4796116352652159 0.9128512251813605 }
radiance 27
center -274.2414245605469 0 -36.42710494995117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9695470124922939 0.3131313001258533 0.8168034405985063 }
radiance 30
center -243.64723205566406 0 -66.5653076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8047530590998065 0.45508401574498436 0.8732499868300889 }
radiance 29
center -266.00750732421875 0 -29.475215911865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9823000413710685 0.4372180887203462 0.9213086075314052 }
radiance 25
center -245.3034210205078 0 -74.2243881225586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9153162820525717 0.34335195208959274 0.8601759524843646 }
radiance 18
center -204.3939666748047 0 -59.84006118774414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9831187105328448 0.38812915312266194 0.8915528284983568 }
radiance 23
center -288.72412109375 0 -41.79563522338867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.807412573338109 0.3305399245375089 0.8720443095872854 }
radiance 17
center -266.490478515625 0 -90.09417724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5316587897149071 0.3294232582194621 0.9 }
radiance 21
center -295.070556640625 0 -8.358887672424316
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9438411895607579 0.4687599482182593 0.9318739304830024 }
radiance 20
center -237.5601348876953 0 -95.8281478881836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8018069039080477 0.4021118188334156 0.9214900465527476 }
radiance 17
center -240.51060485839844 0 -49.553260803222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8087053466516375 0.4910953951587834 0.8942503108130042 }
radiance 29
center -207.80941772460938 0 -82.77430725097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5420770032998651 0.375552202775139 0.9 }
radiance 16
center -268.879638671875 0 -95.98519134521484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9913903147782626 0.340155387424379 0.8155493157310024 }
radiance 17
center -218.95498657226562 0 -96.86396789550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.942097651237863 0.3433859523772312 0.942894582953593 }
radiance 28
center -255.3489532470703 0 -91.24043273925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9309457367900736 0.32501336293042526 0.8478500119862038 }
radiance 25
center -283.4896545410156 0 -84.67438507080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35529117283653033 0.8464996785493129 }
radiance 18
center -202.6788787841797 0 -65.16439056396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9426909264509463 0.32915314235111476 0.9011449115159799 }
radiance 27
center -241.41653442382812 0 -94.56575012207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8340881263431703 0.48203529849483806 0.8992474616693663 }
radiance 25
center -203.9993896484375 0 -82.87200927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8887929639372515 0.48675294174713535 0.8981873506815904 }
radiance 26
center -209.52061462402344 0 -68.45022583007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8114063147974921 0.4377303331225064 0.9792670301604555 }
radiance 24
center -283.69573974609375 0 -25.847427368164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9798370047823395 0.4050729666223818 0.9714827719239518 }
radiance 23
center -204.8736572265625 0 -98.38411712646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8333827217285424 0.30830643840180033 0.8210122553161431 }
radiance 30
center -283.8062438964844 0 -83.61083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8563395785614774 0.495823822833918 0.9995598747176775 }
radiance 24
center -194.68907165527344 0 -116.9404296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8799051627620843 0.4887632811530238 0.9134312629098004 }
radiance 27
center -259.61572265625 0 -109.84742736816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8497060126252555 0.3286049809419697 0.9535534353823698 }
radiance 25
center -228.3801727294922 0 -35.83814239501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9900819628678509 0.3538495892678381 0.8700787792684858 }
radiance 27
center -282.1878967285156 0 -68.11492156982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9106881143888316 0.3595697182008273 0.9212867942645525 }
radiance 30
center -275.81121826171875 0 -61.508731842041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9113053555864369 0.36557354202793535 0.8525282912392053 }
radiance 18
center -230.036865234375 0 -93.55509948730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4963744108175274 0.4779271652676019 }
radiance 20
center -274.6058654785156 0 -39.14946365356445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.934468686453515 0.37359870600328604 0.9837170791527885 }
radiance 27
center -225.31692504882812 0 -106.60568237304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9105230513813364 0.42810744869316353 0.8998678049588673 }
radiance 22
center -269.6709289550781 0 -42.802860260009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533397834664366 0.3780754032407261 0.9236232048964339 }
radiance 24
center -269.2317810058594 0 -94.92749786376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9980179361027235 0.34684923795694333 0.9827830978418844 }
radiance 20
center -201.7899932861328 0 -77.16268920898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.998505431355853 0.3249744244599045 0.935387722974267 }
radiance 31
center -197.69073486328125 0 -124.0293197631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6536606649964976 0.3248670963905914 0.9 }
radiance 30
center -245.03378295898438 0 -79.90509796142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9504137344216774 0.3463265536320986 0.9569732983779167 }
radiance 21
center -244.59686279296875 0 -42.144683837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9470747867337864 0.34590535904944836 0.8320750080715733 }
radiance 23
center -245.04385375976562 0 -133.23602294921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.901619997246762 0.39544402212400825 0.8507592864263026 }
radiance 21
center -274.25372314453125 0 -79.4031982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8697990583094217 0.30824458382067565 0.9153677077868192 }
radiance 21
center -200.9336395263672 0 -74.2107925415039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46969725439196414 0.46776384814549854 }
radiance 27
center -235.41152954101562 0 -47.21002960205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9011668627843896 0.4985462064891254 0.8958079162679015 }
radiance 16
center -205.06201171875 0 -115.65097045898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8646999187331029 0.4498189167747659 0.8386134325318105 }
radiance 19
center -239.5438690185547 0 -117.74002075195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9659420504188005 0.46531030194434875 0.8711899127287771 }
radiance 27
center -220.87789916992188 0 -90.05135345458984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.456979683417002 0.31879329192705713 0.9 }
radiance 28
center -248.67059326171875 0 -114.45204162597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.937709900386353 0.43234893359399396 0.9376013937984476 }
radiance 18
center -247.61660766601562 0 -78.05372619628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47291131026549127 0.41343817129586335 }
radiance 23
center -216.08375549316406 0 -86.30939483642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.931660221404318 0.30578419075161417 0.8591236634463384 }
radiance 18
center -213.0515899658203 0 -72.10016632080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7901102791667755 0.4199511740209584 0.9 }
radiance 21
center -214.38511657714844 0 -126.72808074951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37304662124873855 0.7741970925810553 }
radiance 24
center -190.23826599121094 0 -122.58897399902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9724472766373067 0.4259462859959037 0.8188606239508792 }
radiance 20
center -227.37057495117188 0 -85.25293731689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9211752292451787 0.46700345545712957 0.8848440359214834 }
radiance 22
center -231.2932586669922 0 -125.4762191772461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9625871247346302 0.4888081753473009 0.8346202141905252 }
radiance 19
center -196.34970092773438 0 -107.02018737792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9455392752566778 0.419011741171478 0.8156919530623638 }
radiance 16
center -217.37193298339844 0 -123.99246978759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8792235148112926 0.4752726289973511 0.8252662742535213 }
radiance 23
center -257.24859619140625 0 -142.46572875976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9287374528780351 0.3899704087362518 0.805013922805581 }
radiance 16
center -263.6492614746094 0 -103.63072967529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9951275754718294 0.39815605150236116 0.8513667642355649 }
radiance 31
center -267.64617919921875 0 -92.7064208984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8903229203293406 0.4557399409390876 0.8688032870765146 }
radiance 16
center -220.8887939453125 0 -89.47398376464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8327844879454338 0.4830277188264752 0.8474493404296908 }
radiance 20
center -219.67868041992188 0 -74.38854217529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8668065380956052 0.4611035066405189 0.8947214838879468 }
radiance 17
center -248.6204376220703 0 -82.1195297241211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9419688442123626 0.33957194833340615 0.9433983849153074 }
radiance 28
center -211.7534637451172 0 -104.30233001708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4703214354465809 0.7740910760618447 }
radiance 22
center -214.48568725585938 0 -115.6935043334961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8169913227693223 0.4194642180532031 0.9 }
radiance 25
center -204.68716430664062 0 -82.51093292236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8529119118552264 0.34418096225910355 0.9863334885397863 }
radiance 28
center -254.5908966064453 0 -93.5113754272461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8260564264341537 0.45556928558332926 0.847668502482318 }
radiance 28
center -245.989013671875 0 -138.4949493408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4328986527636912 0.4120876289469705 }
radiance 27
center -218.97589111328125 0 -60.19832229614258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9870319305180737 0.45693189438060866 0.9017741867755411 }
radiance 23
center -192.58721923828125 0 -137.85195922851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8285801923406533 0.3087925124172316 0.8608415535412923 }
radiance 25
center -225.1403350830078 0 -82.01338195800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3671738367307289 0.4334131958875279 }
radiance 18
center -263.2890319824219 0 -77.22355651855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8712841216900125 0.43924812056791057 0.896985933857912 }
radiance 21
center -249.85906982421875 0 -87.53468322753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8001929475749381 0.35622142927130424 0.9750024400739327 }
radiance 27
center -217.70672607421875 0 -161.86752319335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9686303320659798 0.4339245711515698 0.8868246715543094 }
radiance 23
center -179.44140625 0 -107.5114517211914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.910411885207428 0.3825344854758496 0.8538735295821674 }
radiance 18
center -250.1302490234375 0 -103.18751525878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8087628325053904 0.47139153900511566 0.8432673906531052 }
radiance 18
center -228.6607208251953 0 -78.55581665039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9704095732431928 0.42804546577209523 0.9961878079869692 }
radiance 31
center -247.36575317382812 0 -98.61479187011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7672597664435474 0.4635320254308358 0.9 }
radiance 25
center -196.30142211914062 0 -143.9630889892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7344537862559634 0.32599943683640525 0.9 }
radiance 17
center -237.6307830810547 0 -107.33344268798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9956995751192032 0.34533294411836724 0.8352124235821797 }
radiance 29
center -179.53102111816406 0 -122.6557846069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.772615348400206 0.4770824921216933 0.9 }
radiance 23
center -214.73068237304688 0 -163.29086303710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8333044785633664 0.43075182993530825 0.8350950881164656 }
radiance 26
center -176.0492401123047 0 -141.2061004638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8256603077519638 0.3512033110432695 0.8323953623119857 }
radiance 18
center -220.94703674316406 0 -158.7086944580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33846362074996833 0.8245235587404088 }
radiance 18
center -170.38697814941406 0 -123.39298248291016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4766561760816854 0.5762319543132008 }
radiance 16
center -250.5881805419922 0 -128.57254028320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8665637496954328 0.46050115005500425 0.9408578984765905 }
radiance 26
center -229.45040893554688 0 -153.36880493164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6233231169962351 0.4522995714869639 0.9 }
radiance 26
center -207.7946014404297 0 -76.67210388183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35299406021352175 0.5462424511684878 }
radiance 16
center -188.9867706298828 0 -72.7679672241211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9454431616395473 0.3764433132231583 0.9218321075244584 }
radiance 19
center -206.8405303955078 0 -90.30274200439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8618766286948719 0.3769959164114992 0.9615645950696172 }
radiance 29
center -207.77099609375 0 -113.32585906982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9870223630377828 0.3110538866912553 0.9382359347216158 }
radiance 27
center -256.70672607421875 0 -102.0245590209961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9809822717004297 0.477258772010958 0.8823016981643892 }
radiance 22
center -199.12733459472656 0 -78.20393371582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4634708508279386 0.8464262109802891 }
radiance 22
center -244.90390014648438 0 -97.2054214477539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8877142976657683 0.30154433079897347 0.8629862125933329 }
radiance 17
center -204.14968872070312 0 -90.27198028564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4941316107938247 0.81164988757762 }
radiance 16
center -241.79434204101562 0 -117.46808624267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9259034940741618 0.43269135034824924 0.8356554961435003 }
radiance 22
center -163.50599670410156 0 -107.70125579833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9004287248620184 0.4674938434257682 0.9466105359633875 }
radiance 24
center -236.15963745117188 0 -120.63702392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.857638543718599 0.39932140395736904 0.9 }
radiance 31
center -175.55133056640625 0 -138.80516052246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4270993585688071 0.4994698948197933 0.9 }
radiance 31
center -233.92617797851562 0 -97.87958526611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8045480415686412 0.4780179860292546 0.8365889535138351 }
radiance 16
center -202.6188201904297 0 -168.11903381347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8727413319404188 0.4308951421158831 0.813848761527016 }
radiance 23
center -201.13539123535156 0 -171.75169372558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9069028273794824 0.39970141612477694 0.961018446484307 }
radiance 19
center -175.5916290283203 0 -140.4015350341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8545459276550668 0.37602356063616327 0.9 }
radiance 28
center -215.7457733154297 0 -134.81088256835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8089850151000562 0.41937944631712093 0.8155865072617863 }
radiance 18
center -192.012939453125 0 -142.92166137695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5757806347572295 0.33014248785404815 0.9 }
radiance 18
center -238.72669982910156 0 -145.49107360839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38996108371990096 0.77320112811653 }
radiance 25
center -186.1434326171875 0 -134.1307373046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4759689223605854 0.8644799839011985 }
radiance 28
center -249.36868286132812 0 -165.09542846679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8224337236841567 0.3519343401405991 0.8759292659760678 }
radiance 18
center -204.01853942871094 0 -159.11602783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9464842485194459 0.39468608648639036 0.868469436936607 }
radiance 22
center -195.112060546875 0 -93.42748260498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8173617179260089 0.3604217169138167 0.9166728351236738 }
radiance 19
center -182.4592742919922 0 -134.4666290283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.989224173337085 0.4509674949879827 0.9052651114472794 }
radiance 26
center -176.9283905029297 0 -97.57228088378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4302014699499138 0.5101522147923161 }
radiance 28
center -235.9116668701172 0 -147.6517333984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.835107783843689 0.41267694180148873 0.9934100960988769 }
radiance 20
center -168.63436889648438 0 -114.92928314208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8426513865359521 0.44203786657184807 0.8414700903916517 }
radiance 24
center -234.21267700195312 0 -115.62813568115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4756873748398288 0.5835260086841876 }
radiance 23
center -214.12789916992188 0 -184.51025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9965967179074635 0.3209008081960311 0.8900291010213315 }
radiance 22
center -209.1021270751953 0 -175.8638916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.998193387631878 0.39928072399096415 0.9494233551798688 }
radiance 24
center -202.8433074951172 0 -154.96340942382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8821702840653017 0.41395683542795814 0.918023975963931 }
radiance 21
center -199.36561584472656 0 -149.79928588867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9756755564302897 0.3070475932935884 0.8388712118015937 }
radiance 26
center -161.84898376464844 0 -100.355224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8545486119412271 0.3278166844056863 0.9563989187347889 }
radiance 18
center -230.47674560546875 0 -119.11856842041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8015175889443881 0.4046541020303328 0.9238724912370736 }
radiance 26
center -164.34814453125 0 -158.1817626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.887969349740395 0.327917664439555 0.808819981470478 }
radiance 25
center -152.56044006347656 0 -130.27035522460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9640632831263827 0.4733534120943547 0.9211868157181818 }
radiance 16
center -176.1894989013672 0 -190.10971069335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8867918819996012 0.4382568430195234 0.8069390249943456 }
radiance 21
center -178.07957458496094 0 -158.9984588623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9001307572135084 0.3923002913035184 0.8651604800037367 }
radiance 25
center -229.74700927734375 0 -178.72264099121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8377026891660206 0.35245534401633044 0.859781652356676 }
radiance 20
center -219.62083435058594 0 -126.36307525634766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8623845997580197 0.32591077642130284 0.8181658379448318 }
radiance 28
center -181.24179077148438 0 -102.41475677490234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32591529017583704 0.7528666617885307 }
radiance 20
center -208.34796142578125 0 -126.91932678222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9492617167899305 0.4305092666868299 0.9913373486777328 }
radiance 28
center -230.62350463867188 0 -137.8760223388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8919430651836989 0.30637844275308473 0.9321931852172542 }
radiance 18
center -206.11801147460938 0 -171.90048217773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.925427741345629 0.32756097381520266 0.8053162691299546 }
radiance 21
center -197.57095336914062 0 -161.23289489746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9763140953432132 0.44092185635585834 0.8669172170014227 }
radiance 26
center -186.73388671875 0 -109.24764251708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8999851075479397 0.38696519181003786 0.853009994231841 }
radiance 19
center -143.17706298828125 0 -176.01327514648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8839046350042535 0.49866743726687857 0.9 }
radiance 17
center -145.84774780273438 0 -175.5592803955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8488130257550155 0.4741517519218054 0.9399509178897297 }
radiance 17
center -219.91038513183594 0 -161.7812957763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9973951457948774 0.3212755013488841 0.973240119096173 }
radiance 22
center -204.04800415039062 0 -126.6570816040039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8294431567770537 0.4910082309867434 0.928333467396214 }
radiance 24
center -216.46908569335938 0 -164.2301025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9142339743237543 0.43482197671178957 0.9344606741200155 }
radiance 27
center -141.81491088867188 0 -143.27366638183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8388766393669724 0.4565197011304291 0.9062601375784813 }
radiance 29
center -216.061279296875 0 -162.34115600585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39191970093363493 0.6732709087583302 }
radiance 24
center -154.4827880859375 0 -152.34158325195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8030484735848916 0.45002882497478003 0.8742687435405485 }
radiance 27
center -180.4257049560547 0 -158.76695251464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8736088780185638 0.4579994082093665 0.9752643448539371 }
radiance 23
center -136.96055603027344 0 -176.04457092285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43089433322205306 0.5387864654813632 }
radiance 29
center -218.4967041015625 0 -160.89825439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4009689081699417 0.4432673088525788 0.9 }
radiance 26
center -181.52264404296875 0 -131.27548217773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8878455023673121 0.35292033700294595 0.817847687143888 }
radiance 16
center -215.05868530273438 0 -178.87696838378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4017930890379915 0.5445972523434528 }
radiance 26
center -137.9571533203125 0 -163.1144561767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8136336427078922 0.4896135739809976 0.8279971775603904 }
radiance 25
center -223.77317810058594 0 -175.42832946777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9601725577791929 0.4142632459535358 0.996611397275215 }
radiance 16
center -208.37066650390625 0 -137.79983520507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8261679020622268 0.33899466236909886 0.9341978764389697 }
radiance 28
center -147.61566162109375 0 -170.82752990722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9202924852839413 0.407106395555037 0.9037942313341035 }
radiance 26
center -213.1707763671875 0 -163.90753173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9022910541197501 0.33973754117550725 0.8126123700059487 }
radiance 29
center -136.53179931640625 0 -159.53033447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.982080451623093 0.3768814482257792 0.9226811667580013 }
radiance 16
center -171.53932189941406 0 -186.66818237304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8120927454983418 0.3178320783168314 0.8517679737076931 }
radiance 19
center -173.3594512939453 0 -132.5770721435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8335193534773313 0.47972616950916724 0.8181977142174787 }
radiance 26
center -130.7406463623047 0 -130.69198608398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8672099499899723 0.3132507551713044 0.9645137050602867 }
radiance 20
center -176.49407958984375 0 -207.70748901367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9399673988917362 0.32179154035383817 0.8838993786274597 }
radiance 22
center -140.4120330810547 0 -202.85902404785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9827366072549701 0.48020230071307857 0.9821637105939054 }
radiance 17
center -171.46717834472656 0 -148.02552795410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9491243553382369 0.375820678955592 0.8449018336456946 }
radiance 23
center -137.50999450683594 0 -198.03770446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6960037097587555 0.47219741301506 0.9 }
radiance 16
center -203.81475830078125 0 -139.02511596679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3198767730869276 0.8339605801789494 }
radiance 30
center -153.33526611328125 0 -190.32907104492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.806752410630797 0.36376741759957254 0.9564373848789738 }
radiance 28
center -177.9088897705078 0 -141.22116088867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9197386792531038 0.3635735079584267 0.9457443472280356 }
radiance 27
center -167.197021484375 0 -157.90963745117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9962641384584193 0.4583450470361953 0.8846924154364566 }
radiance 16
center -157.71575927734375 0 -200.7220001220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9997208915133877 0.38297221533067016 0.9997694396376893 }
radiance 26
center -124.0889892578125 0 -153.64781188964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8250569050614545 0.45443617891372357 0.8228801361548594 }
radiance 26
center -173.51058959960938 0 -129.40072631835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7086041486167998 0.4275932364989299 0.9 }
radiance 29
center -175.78765869140625 0 -178.12380981445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9144796178389507 0.35027596647185355 0.9292605401140999 }
radiance 16
center -209.6201171875 0 -124.18352508544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6445285766156227 0.3558230274874948 0.9 }
radiance 16
center -133.40809631347656 0 -129.9905548095703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9620892457287553 0.40095808976569763 0.9551327684265472 }
radiance 27
center -162.70677185058594 0 -210.12103271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44305767587556777 0.39863819177599347 0.9 }
radiance 25
center -179.99449157714844 0 -131.05801391601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8801525546322634 0.42719513218529903 0.9 }
radiance 24
center -194.79373168945312 0 -167.2306671142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8386188171910541 0.4734015527031684 0.9189588385718139 }
radiance 30
center -128.57591247558594 0 -181.99192810058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.819156058136062 0.4052267808000706 0.9691264723558588 }
radiance 30
center -169.31504821777344 0 -169.45457458496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.963108668812303 0.3361388148177572 0.9167620726254585 }
radiance 30
center -158.09988403320312 0 -178.68675231933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8125325495367317 0.4637226618786734 0.9269053065610643 }
radiance 21
center -179.4856414794922 0 -199.82919311523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5061324568036029 0.4626703398730161 0.9 }
radiance 20
center -145.32369995117188 0 -160.48118591308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9885488877347101 0.40997225841658963 0.9392210698323765 }
radiance 30
center -192.29782104492188 0 -206.27191162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9855171497695719 0.4669813152615182 0.8202107414731794 }
radiance 26
center -126.90848541259766 0 -216.21188354492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9168257519296342 0.3161759544999368 0.8113592075241725 }
radiance 25
center -175.27691650390625 0 -142.28448486328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.826936058966005 0.4420118030794292 0.8162612075558897 }
radiance 21
center -153.74815368652344 0 -152.51504516601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39004249734505425 0.8775843397267892 }
radiance 28
center -181.85494995117188 0 -150.2364501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8190424165761653 0.46698439147823856 0.9965064817659887 }
radiance 18
center -197.4617156982422 0 -142.37025451660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8616582684257866 0.34427164277289707 0.9956197481556448 }
radiance 31
center -134.07542419433594 0 -193.34976196289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3605607876341096 0.7515492833061459 }
radiance 21
center -123.49129486083984 0 -193.50819396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9890680936375136 0.4891732248831121 0.9980531928765666 }
radiance 17
center -114.1063461303711 0 -145.45919799804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8288155014997001 0.31552762916952887 0.8566150266230963 }
radiance 18
center -162.56324768066406 0 -213.46246337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8564809188335698 0.47457370110557306 0.881986217746118 }
radiance 26
center -167.70338439941406 0 -154.4859619140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8632019971297874 0.3953044570465595 0.8861072188096244 }
radiance 28
center -189.66937255859375 0 -209.4468536376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6070205030313248 0.43365144314678183 0.9 }
radiance 28
center -126.17605590820312 0 -189.0410919189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212718218166798 0.3455427730971842 0.946417961171692 }
radiance 16
center -142.30447387695312 0 -222.6427001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49484172374559177 0.41657983425315803 0.9 }
radiance 31
center -143.4517364501953 0 -161.74598693847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8262826930738296 0.4140605572412397 0.84011395533949 }
radiance 18
center -179.2804718017578 0 -165.03709411621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8253477080203657 0.3360444397599601 0.991054605774837 }
radiance 20
center -113.3714828491211 0 -230.20606994628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49952004290141694 0.842203447566786 }
radiance 16
center -164.7611846923828 0 -181.98756408691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8703518460622996 0.36442548677263165 0.8856227482872168 }
radiance 22
center -127.03933715820312 0 -147.41067504882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9580130441891448 0.36372867623419136 0.9405019862988193 }
radiance 27
center -139.41529846191406 0 -188.0968475341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9159504318240372 0.3479833907990038 0.9397412547600539 }
radiance 25
center -108.70123291015625 0 -227.7953338623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9075427806077432 0.4176049067591914 0.8569179354430027 }
radiance 17
center -126.41560363769531 0 -208.92173767089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7468342392585668 0.3549678644261905 0.9 }
radiance 28
center -104.89306640625 0 -217.649658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9373981097052826 0.47715617676417205 0.8621454678168226 }
radiance 20
center -141.7563018798828 0 -213.5281524658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9577780675430132 0.4606144038692679 0.912057937612116 }
radiance 20
center -157.61061096191406 0 -222.93824768066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9081169357726591 0.38916235657524795 0.8783218261187407 }
radiance 29
center -102.55552673339844 0 -190.0338592529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9134724940898451 0.41121293491926014 0.807993532593294 }
radiance 23
center -166.4427947998047 0 -209.71258544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.898581832405449 0.3009059484422057 0.8522903979165862 }
radiance 30
center -124.70893859863281 0 -153.5146942138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8365692639245026 0.3974399737576436 0.91670984562861 }
radiance 20
center -110.38919067382812 0 -167.23373413085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8999534047347837 0.3737122435614315 0.8761931532439922 }
radiance 18
center -176.5774688720703 0 -159.406494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.924271740702435 0.33067533468706295 0.8785089213710031 }
radiance 21
center -106.49226379394531 0 -153.48648071289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9847305520239826 0.4341587499499494 0.8217636077053917 }
radiance 18
center -98.11847686767578 0 -161.48997497558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9572281412269895 0.3316612287833894 0.9418563749230224 }
radiance 29
center -147.53677368164062 0 -216.26568603515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9517848722495932 0.4265753438233172 0.8935425203789679 }
radiance 28
center -105.03702545166016 0 -171.90260314941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9858835187675884 0.38725756962402186 0.8517266574118969 }
radiance 21
center -105.55671691894531 0 -224.0800018310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9928072078828739 0.4177852427750921 0.9107863924549182 }
radiance 18
center -134.1967010498047 0 -220.65597534179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9241402999897071 0.35668323555498344 0.8644535578310397 }
radiance 27
center -157.75782775878906 0 -195.49510192871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9850796935253894 0.33154577914701144 0.9305844596259665 }
radiance 24
center -109.64633178710938 0 -196.03411865234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45054652025399267 0.5900008249338087 }
radiance 20
center -111.45890045166016 0 -202.75662231445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8665976971784749 0.4251550684217199 0.9748087019749855 }
radiance 24
center -138.43429565429688 0 -153.8173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9273198690720382 0.3666751927797296 0.8365843632527866 }
radiance 26
center -161.4639434814453 0 -202.82394409179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8176321307087651 0.36382226494174497 0.9869619881862253 }
radiance 31
center -131.30288696289062 0 -175.86683654785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8602686628984824 0.4685706825609731 0.9442012746494853 }
radiance 23
center -101.51243591308594 0 -226.5960693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8765019451212179 0.34327356498665074 0.8462378530619706 }
radiance 17
center -153.45314025878906 0 -188.62863159179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8672853518077865 0.3022198695436076 0.9135358355651837 }
radiance 24
center -119.16058349609375 0 -166.2667694091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8429857479460041 0.4517494508555355 0.9 }
radiance 26
center -81.71253204345703 0 -224.89520263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9948509426479295 0.3919478202993295 0.9514630643497852 }
radiance 18
center -99.7336196899414 0 -194.29730224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9612052409179959 0.33916701076788586 0.9165252729923249 }
radiance 29
center -130.09481811523438 0 -196.22740173339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34887471360082595 0.7527128215368392 }
radiance 25
center -148.46775817871094 0 -231.39793395996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3909199993432008 0.47039413328083246 }
radiance 27
center -149.66900634765625 0 -183.70700073242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8062139420651333 0.4625844336417936 0.8834916769406753 }
radiance 20
center -115.97884368896484 0 -206.72201538085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3973630123808909 0.7550400224056387 }
radiance 17
center -87.1688003540039 0 -198.36807250976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35105785442307946 0.8010718748221186 }
radiance 25
center -113.60260772705078 0 -208.1662139892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8032647155021337 0.359074172924265 0.9333594408107071 }
radiance 24
center -117.51006317138672 0 -240.2654266357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9659903923163985 0.3143964237444721 0.8455341343041286 }
radiance 27
center -119.7901611328125 0 -178.0396728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8674425522320737 0.44601551306849213 0.9 }
radiance 21
center -128.95350646972656 0 -206.20034790039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43597919874334756 0.7156833181991914 }
radiance 22
center -107.55680847167969 0 -211.02755737304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3898127742828491 0.5456269171171095 }
radiance 22
center -131.35809326171875 0 -248.0076141357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38037582249048396 0.5028897341224219 }
radiance 16
center -150.3611602783203 0 -168.91688537597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4135473193385557 0.40861896988382396 0.9 }
radiance 20
center -70.96690368652344 0 -243.8240203857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9830527421107711 0.4062640968722129 0.9461718791646729 }
radiance 30
center -121.32474517822266 0 -176.40374755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6444857099093397 0.46796324046054705 0.9 }
radiance 25
center -140.89544677734375 0 -205.4824676513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8569810207962442 0.3476981653625638 0.802778505498643 }
radiance 20
center -77.68164825439453 0 -244.84927368164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4591360317507379 0.6311712365905865 }
radiance 20
center -72.33148193359375 0 -200.07415771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9329353868298502 0.4848980204459664 0.9934701880514121 }
radiance 20
center -131.92872619628906 0 -170.52792358398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8114427052949185 0.40845349169518574 0.8687183092353378 }
radiance 20
center -134.29855346679688 0 -168.74652099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8592052056167092 0.3769653423658481 0.9707246485330708 }
radiance 18
center -124.00282287597656 0 -230.86642456054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8819015910550426 0.3283348256169785 0.9937343920035351 }
radiance 25
center -96.27407836914062 0 -247.45169067382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3919728717507404 0.40378749017038673 }
radiance 26
center -116.30379486083984 0 -200.5884246826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5667233295506314 0.4084692955268471 0.9 }
radiance 22
center -76.25070190429688 0 -179.96820068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.695227421692517 0.43870680099199 0.9 }
radiance 30
center -152.34341430664062 0 -175.781005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9270001654242216 0.35325267929385545 0.8192185513918063 }
radiance 26
center -144.10455322265625 0 -232.09494018554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5501305252277887 0.4968743669534651 0.9 }
radiance 31
center -94.70497131347656 0 -217.16563415527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6104735209612754 0.481220285221439 0.9 }
radiance 26
center -114.13833618164062 0 -200.81838989257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9427529245326854 0.37070875533416814 0.839706172010833 }
radiance 27
center -137.87356567382812 0 -239.0585174560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8994792221491068 0.43249963697887517 0.9798219624236135 }
radiance 29
center -137.00222778320312 0 -211.455810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5856994315604062 0.3014274317462081 0.9 }
radiance 26
center -101.0963134765625 0 -224.74972534179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4986854263895808 0.4487936739352312 }
radiance 25
center -80.6750717163086 0 -249.70782470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46105577055348734 0.33587732005705195 0.9 }
radiance 22
center -138.4675750732422 0 -225.6234893798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8581053479264694 0.43223688057309695 0.8443909327225795 }
radiance 26
center -110.28430938720703 0 -186.35531616210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6266509047320705 0.3569651011886831 0.9 }
radiance 25
center -133.18682861328125 0 -237.79820251464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.913299533078018 0.31509140361962595 0.8690400935149688 }
radiance 25
center -129.44503784179688 0 -200.3797149658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8132652698969622 0.42472145568980313 0.9969115389633069 }
radiance 25
center -85.93234252929688 0 -181.78793334960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9842518567290743 0.3722703436518441 0.8721428344000547 }
radiance 26
center -101.278564453125 0 -249.97833251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.728664266037769 0.4515004119504229 0.9 }
radiance 31
center -70.18047332763672 0 -194.70394897460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8475269471966266 0.45260779374450405 0.9317262206456518 }
radiance 30
center -94.42726135253906 0 -224.1182861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844650443105432 0.36222631736873023 0.8999911771446104 }
radiance 29
center -55.3196907043457 0 -238.73663330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9543145459246479 0.31541319870378665 0.9857051220776325 }
radiance 17
center -70.64691162109375 0 -169.20033264160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533713262411304 0.30140552100308604 0.9712188576105005 }
radiance 18
center -123.91048431396484 0 -176.4649658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.404095345764671 0.680460839278526 }
radiance 17
center -53.35825729370117 0 -247.7085723876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9212778923424605 0.4568356607356989 0.9612126324484864 }
radiance 29
center -135.6591796875 0 -248.39361572265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8166180952934793 0.34853893322943025 0.8080237540369369 }
radiance 19
center -130.67703247070312 0 -185.9306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8221920905699343 0.4594299126801057 0.9130693446940981 }
radiance 21
center -113.34494018554688 0 -229.29519653320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8518158717532831 0.44651828496565055 0.8772617356227904 }
radiance 29
center -121.76239776611328 0 -217.5430908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9737040698590553 0.48160620925645914 0.8002139995864934 }
radiance 23
center -82.30622863769531 0 -202.48988342285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6560607918667077 0.4180487479106229 0.9 }
radiance 25
center -138.3355255126953 0 -252.8037872314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8052548175686807 0.3122755924737038 0.9399241384414477 }
radiance 22
center -42.34202575683594 0 -214.03086853027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9072410721880032 0.4175697502935144 0.9026204955888655 }
radiance 24
center -83.15546417236328 0 -206.10293579101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6307466940763636 0.3132829325303757 0.9 }
radiance 18
center -90.86570739746094 0 -219.9951629638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8274370017150093 0.49433702148160463 0.9622683767726576 }
radiance 30
center -66.75064086914062 0 -219.14613342285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4979601435879828 0.7695563298103195 }
radiance 28
center -111.62336730957031 0 -223.08815002441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9299035948363126 0.48495011957321177 0.9397987702563696 }
radiance 21
center -53.328163146972656 0 -240.93441772460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8188838800146743 0.3878383684315221 0.8862753410013958 }
radiance 26
center -113.21060943603516 0 -198.9197998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9486810397089408 0.45585296692854904 0.9884636168409381 }
radiance 23
center -44.24192810058594 0 -175.0047607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8171591635299215 0.43116482563365477 0.9438262021061803 }
radiance 30
center -39.985015869140625 0 -239.78213500976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4446974384364446 0.48388088020445075 }
radiance 22
center -118.36447143554688 0 -228.34657287597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8449579449256578 0.43548474449371927 0.8495444490256013 }
radiance 17
center -121.25074768066406 0 -248.78761291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43016725124289623 0.4569924446300354 }
radiance 16
center -77.49156951904297 0 -253.611328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9324400024329216 0.36329273840810405 0.9609437490507453 }
radiance 29
center -78.59066009521484 0 -237.29510498046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49436543487464235 0.6220666087836374 }
radiance 24
center -86.95561981201172 0 -201.96197509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.807474207095712 0.39262206417654094 0.8131938546425623 }
radiance 24
center -89.92037963867188 0 -205.33322143554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8304173711267956 0.31122363727654606 0.904620632998977 }
radiance 26
center -50.20771026611328 0 -236.7279815673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9526856703468403 0.4115409632061604 0.819250789044624 }
radiance 24
center -69.62862396240234 0 -236.9842071533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9594532742374642 0.37619306819062504 0.9095435143814515 }
radiance 27
center -51.860206604003906 0 -227.5572509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8788800582349672 0.3765302319002243 0.8782950962299202 }
radiance 17
center -120.75267028808594 0 -257.88665771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9473191820508076 0.32829865019441246 0.9701250451609659 }
radiance 27
center -91.24715423583984 0 -240.28060913085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8807855646094663 0.3559741868810699 0.9485522356142218 }
radiance 28
center -42.016666412353516 0 -204.94503784179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9378696000614055 0.44931113106522313 0.9619590942875373 }
radiance 20
center -43.993499755859375 0 -206.70919799804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9522817794597246 0.36154586945089273 0.9013566949187505 }
radiance 26
center -90.37269592285156 0 -250.35296630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6330919087515284 0.34570082791461615 0.9 }
radiance 19
center -95.77588653564453 0 -228.53289794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9716737361846085 0.34820729183890653 0.8785695073747827 }
radiance 23
center -74.70211029052734 0 -217.55685424804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8991797979122989 0.30207031572536863 0.9411584810965842 }
radiance 24
center -65.06513214111328 0 -231.2707061767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.954010329591656 0.3515991246636144 0.9836687937770999 }
radiance 17
center -53.18885040283203 0 -186.04542541503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9635912383558962 0.3099324303905791 0.8743466177293151 }
radiance 18
center -57.59130096435547 0 -251.6175079345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8615791537560049 0.35485719496761203 0.8371956158245645 }
radiance 22
center -80.77909851074219 0 -260.8856506347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9030345557702526 0.4412101119953461 0.8398755316695835 }
radiance 22
center -51.09453201293945 0 -184.50228881835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9776408147015152 0.31418712818307887 0.8643844873472495 }
radiance 30
center -95.02133178710938 0 -205.28677368164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9289997593774709 0.4843799513116389 0.8870268277265081 }
radiance 20
center -103.59275817871094 0 -199.2478790283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39081428233645676 0.5214648030230115 }
radiance 24
center -96.44937896728516 0 -205.83763122558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49564301730487204 0.35280556276084624 0.9 }
radiance 28
center -24.55548858642578 0 -251.1843719482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8821261737305428 0.3569410307282907 0.9262518818176161 }
radiance 27
center -76.2131576538086 0 -222.85244750976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9690727607801332 0.3364047447661776 0.9808646378360003 }
radiance 22
center -69.25841522216797 0 -185.1644744873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6479626407506704 0.47700759814373794 0.9 }
radiance 31
center -46.294071197509766 0 -236.26673889160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6446759784355146 0.490450959032143 0.9 }
radiance 22
center -40.9332160949707 0 -192.47531127929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445035000785941 0.33615810465281964 0.8430671154504928 }
radiance 28
center -54.63864517211914 0 -225.4256591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30672961045469904 0.8332621253557945 }
radiance 24
center -80.12816619873047 0 -210.2576446533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9530952067956873 0.44836446298596344 0.8106762862009703 }
radiance 30
center -41.39432144165039 0 -203.71458435058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8030810393784301 0.3329166394697522 0.9 }
radiance 30
center -37.45683288574219 0 -240.8804473876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8756687796828145 0.36121775767016145 0.9 }
radiance 31
center -45.871612548828125 0 -258.5827941894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49221286909635564 0.42928989069979817 }
radiance 21
center -85.28346252441406 0 -231.19949340820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8678851036658751 0.3159101932336345 0.8934355669042445 }
radiance 16
center -31.009136199951172 0 -242.362548828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8091453795585501 0.45228910194661276 0.861720254626771 }
radiance 21
center -41.26531982421875 0 -259.02813720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9985248578003288 0.4053331864267952 0.9004285088719266 }
radiance 25
center -31.493431091308594 0 -192.13668823242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9528717468497994 0.45246963362672743 0.9059337014249406 }
radiance 28
center -33.39071273803711 0 -188.80426025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8633421206698596 0.3225195503864708 0.8985673028727119 }
radiance 23
center -14.946127891540527 0 -193.49693298339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9467052694023903 0.393570353606311 0.89937081987205 }
radiance 16
center -64.54106903076172 0 -264.1837463378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8326559927069854 0.4126415057903684 0.833565336487954 }
radiance 18
center -33.88031768798828 0 -245.82508850097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46020278155850985 0.556539402024786 }
radiance 31
center -29.16888999938965 0 -212.40113830566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9478778507560235 0.3932745739296897 0.9518269788626119 }
radiance 25
center -72.69896697998047 0 -183.77540588378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.83089125408967 0.3315461607765931 0.9330093075102128 }
radiance 25
center -9.47074031829834 0 -198.9168243408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9909728680749137 0.38478691689740696 0.9567360773579278 }
radiance 22
center -71.02777862548828 0 -257.7076110839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8333683009758444 0.31766994909937823 0.9509635891005469 }
radiance 29
center -16.734394073486328 0 -262.3370056152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.960390637666238 0.4655815084838714 0.8866969023020173 }
radiance 23
center -87.51404571533203 0 -189.70321655273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8801611341826434 0.3894017128498659 0.8743341538217375 }
radiance 18
center -16.96155548095703 0 -221.1864776611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9839515208198308 0.39244404177774256 0.8651734174930963 }
radiance 19
center -86.9813461303711 0 -226.20358276367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9508024925610173 0.3494686840773961 0.9850504539159979 }
radiance 26
center -17.96438980102539 0 -255.73431396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8310523109034703 0.4457929287700053 0.9 }
radiance 27
center -12.198756217956543 0 -193.64068603515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108918556816195 0.4653022289549005 0.8816890755066993 }
radiance 21
center -32.02631759643555 0 -209.07220458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9566993742624363 0.3152012941074949 0.995567397601386 }
radiance 25
center -63.44121551513672 0 -241.62435913085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7785709655407707 0.3628237299172129 0.9 }
radiance 29
center -1.6751223802566528 0 -242.13723754882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8444962128365239 0.4434510313805099 0.8306214729312471 }
radiance 18
center -64.35311126708984 0 -216.67735290527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9220347299021502 0.3397712511075942 0.9026548991166201 }
radiance 30
center -53.62956619262695 0 -258.50103759765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9502004896059492 0.4273275567756429 0.9312271890525436 }
radiance 19
center -1.8892133235931396 0 -230.4580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8905404725681887 0.41791228169296846 0.9 }
radiance 31
center -34.336727142333984 0 -229.156494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4097838175095089 0.45309552100126504 0.9 }
radiance 23
center -19.922361373901367 0 -267.3746643066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9555551550254443 0.4528756706591641 0.9701724080389827 }
radiance 23
center -23.647167205810547 0 -188.7037811279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8757333492887723 0.357876305298007 0.8002576923138531 }
radiance 25
center -3.3156025409698486 0 -264.0132751464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4678651954779246 0.32493742124989666 0.9 }
radiance 25
center -34.60397720336914 0 -187.09092712402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8706463793346652 0.3086170248401729 0.9785476612151274 }
radiance 22
center -14.60329818725586 0 -230.91201782226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5613355892949651 0.37897159532808466 0.9 }
radiance 19
center -49.26606750488281 0 -232.7318878173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9289249597957521 0.4562282394625645 0.9059702306083919 }
radiance 22
center -30.95741081237793 0 -258.6878662109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8604229867935174 0.35338407694495716 0.8035973086407172 }
radiance 19
center -3.9101672172546387 0 -267.36224365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9073461677502888 0.3045491194049549 0.9643232023591157 }
radiance 22
center 1.5939315557479858 0 -244.71475219726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9320266900567498 0.3407277074510607 0.9577931038820153 }
radiance 22
center -27.36347198486328 0 -253.7947540283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8636560465714063 0.33083518369674253 0.8069025351404624 }
radiance 20
center -47.556941986083984 0 -204.21864318847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.893685661843137 0.30413189195037243 0.8484069033615889 }
radiance 16
center -48.77476501464844 0 -249.28475952148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8878811523723008 0.4894509472445256 0.808281887470649 }
radiance 19
center 1.9137818813323975 0 -258.1392517089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4401470427811247 0.4193494388238187 }
radiance 30
center 12.91740894317627 0 -215.13140869140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9723991548404598 0.43305680622883447 0.9783976364001785 }
radiance 20
center -52.05130386352539 0 -215.69915771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8243211023010346 0.30248051870106957 0.9132068234027273 }
radiance 31
center -29.76294708251953 0 -252.113037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9865789463783065 0.4215694631296045 0.9459342223579527 }
radiance 20
center 20.317581176757812 0 -250.24310302734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8765883522649236 0.4453074433842065 0.8090656232612858 }
radiance 21
center -39.266082763671875 0 -240.16033935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844343952909724 0.3761601561560415 0.9696643188832771 }
radiance 22
center 6.004741191864014 0 -220.2407684326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8897971930234173 0.4928267623743554 0.9177183115870589 }
radiance 29
center 17.603946685791016 0 -221.6317596435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8907238228002713 0.30894389035172976 0.9594360278532047 }
radiance 18
center 19.967966079711914 0 -209.12417602539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8886201005309105 0.44182001195265785 0.8729854549539354 }
radiance 17
center 19.619665145874023 0 -270.1759033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9232891817584495 0.4408651780257773 0.8697578019911122 }
radiance 29
center 22.12885093688965 0 -210.37530517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8512028067867584 0.3077544780774502 0.9 }
radiance 24
center 7.199228763580322 0 -222.79739379882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9454640263118903 0.32254898666306403 0.9225080256257534 }
radiance 21
center -11.5236177444458 0 -219.87158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.992525309772301 0.41674071065764634 0.8202698116051805 }
radiance 27
center 2.233299732208252 0 -197.70529174804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7432515698519768 0.3311824875226557 0.9 }
radiance 18
center 16.409038543701172 0 -245.50540161132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9497285010115275 0.42130010694302766 0.9155628573799575 }
radiance 27
center -56.29719161987305 0 -225.74221801757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9179782260559178 0.35090073852762194 0.8397310129886331 }
radiance 25
center 7.455090522766113 0 -269.9601135253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9412529974573811 0.31992634908943984 0.9845244769278497 }
radiance 19
center -44.094783782958984 0 -208.6796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9349378866152354 0.3647394679696403 0.9968356206213914 }
radiance 25
center 8.997694969177246 0 -234.78201293945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8381220380731877 0.3385288435999918 0.9368633445853567 }
radiance 31
center -19.52890968322754 0 -232.85723876953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8211476394005778 0.45414863201444033 0.9627159676455452 }
radiance 19
center -31.320619583129883 0 -244.74295043945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9160979187943941 0.42722147882351325 0.973421470899787 }
radiance 25
center 37.68058776855469 0 -236.47308349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8823805853572535 0.4412522889281793 0.9 }
radiance 25
center -1.7999502420425415 0 -237.55490112304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9837609879310667 0.46625399919677346 0.9849945306371914 }
radiance 22
center -10.330199241638184 0 -219.20005798339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717589577880769 0.4766661416311819 0.8245032686588116 }
radiance 16
center 28.186439514160156 0 -227.33474731445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3333747562157002 0.5810160320697658 }
radiance 24
center 31.553943634033203 0 -253.5480499267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4394430730596759 0.4841117677336193 }
radiance 16
center -24.887313842773438 0 -261.03680419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8346032928652304 0.41734165981359583 0.913082126913366 }
radiance 22
center -31.93331527709961 0 -233.7244873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8693043970281007 0.49919914131825127 0.9280691869101859 }
radiance 31
center -34.54676055908203 0 -191.0550994873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9579342965175864 0.41110882708052543 0.8316890817236158 }
radiance 31
center -27.421964645385742 0 -227.703857421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8207618626967702 0.44529931762925334 0.8171122903972485 }
radiance 23
center 28.179779052734375 0 -266.5171203613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9458034755328079 0.36005260239820164 0.9506406585533574 }
radiance 23
center 9.380647659301758 0 -207.66790771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8740534374491133 0.40059824240789815 0.9885929874082806 }
radiance 30
center 18.511844635009766 0 -266.4555969238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9621283309107217 0.312679027422431 0.87449801234366 }
radiance 19
center -42.19041061401367 0 -208.33543395996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9339371244352531 0.3515025894317749 0.9801790997339984 }
radiance 21
center -43.21878433227539 0 -264.4664001464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8006572482392302 0.39732102898926763 0.9097197269655335 }
radiance 27
center 26.95761489868164 0 -266.8844299316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8346267733746118 0.3243667368199073 0.8167776372640176 }
radiance 27
center -36.98451614379883 0 -256.0615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8080184082761276 0.4033280562044135 0.8483049816669652 }
radiance 19
center -31.14556312561035 0 -250.75779724121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9220150047060581 0.4697293801583648 0.9267323096710393 }
radiance 16
center -29.168846130371094 0 -227.184326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8007728004686492 0.4271684410988831 0.9442998668120022 }
radiance 19
center 12.578995704650879 0 -231.00732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447976852019176 0.36987500523453515 0.8254113434178554 }
radiance 17
center -13.661388397216797 0 -216.681884765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.88691751143789 0.36661740297121115 0.9845174559338399 }
radiance 24
center -25.93977928161621 0 -243.27194213867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9514598763756217 0.3760009359609293 0.9575647434076455 }
radiance 23
center -24.211837768554688 0 -202.12973022460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7222073957697954 0.4690378177539435 0.9 }
radiance 27
center 25.70377540588379 0 -265.2375793457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308830118315428 0.31996706829590127 0.8346305312125629 }
radiance 21
center 3.3453238010406494 0 -201.8256072998047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8710542516910362 0.46329019905169777 0.9350462267728918 }
radiance 22
center -11.368796348571777 0 -255.65444946289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9737570941780022 0.4575182182163211 0.9241263458567319 }
radiance 26
center 47.5777702331543 0 -263.1665344238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4131423654706181 0.6516859698481855 }
radiance 21
center -10.332911491394043 0 -236.66282653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9261511211878474 0.37696378899604355 0.8034352001205576 }
radiance 23
center -2.929823637008667 0 -206.8607635498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8420564444366998 0.4771734645753999 0.9313461089974739 }
radiance 21
center -17.49422264099121 0 -233.35430908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5702935074298572 0.46517254549510945 0.9 }
radiance 26
center 25.469404220581055 0 -236.51156616210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7749636784204514 0.34954360047217753 0.9 }
radiance 16
center -20.448789596557617 0 -206.67518615722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8991600308103441 0.35853278786764436 0.9164547003159714 }
radiance 31
center 43.488792419433594 0 -220.1067352294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4167638143220709 0.6689307800725423 }
radiance 27
center 50.115760803222656 0 -190.32498168945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.927702241221364 0.4611425676383571 0.8253718374462905 }
radiance 20
center 12.835168838500977 0 -230.09095764160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8642752605740887 0.45619923902207005 0.9646485356616327 }
radiance 25
center 11.818631172180176 0 -247.53469848632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9101224374378392 0.3337009102014954 0.8708922322987264 }
radiance 17
center -8.923974990844727 0 -252.79086303710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8991593529622347 0.3141515208335861 0.8312515358739588 }
radiance 27
center 53.11650848388672 0 -259.63519287109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30997424692170794 0.7621856088628566 }
radiance 30
center 55.09136962890625 0 -252.6630096435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4900239229601312 0.4833463151040056 0.9 }
radiance 26
center -4.002137184143066 0 -228.26112365722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9816096203441057 0.42660534154843177 0.8115320612594024 }
radiance 18
center 12.865377426147461 0 -196.8988800048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.91648596583386 0.4819337693253749 0.8444058747450529 }
radiance 26
center 31.466432571411133 0 -195.7725067138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33189587771806744 0.6201539822759948 }
radiance 25
center 50.379737854003906 0 -214.34291076660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42188960947814386 0.7427614536516866 }
radiance 16
center -7.744264125823975 0 -232.75485229492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6459972863512737 0.4876293831790959 0.9 }
radiance 29
center 17.300722122192383 0 -265.63592529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38731095001244464 0.7373814390309634 }
radiance 30
center 67.34696960449219 0 -248.1859130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8656559812108722 0.42801646264677456 0.9624634384143987 }
radiance 18
center 67.9670639038086 0 -255.20730590820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3050929436826704 0.8681622873044779 }
radiance 31
center -0.5412940382957458 0 -250.20330810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9019299051033192 0.3390726301869661 0.9931666189535918 }
radiance 29
center 28.80843734741211 0 -243.07858276367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5372294143863137 0.38113851653350783 0.9 }
radiance 24
center 49.09172439575195 0 -259.9745178222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9592779703122799 0.44235981898955123 0.8004540221095844 }
radiance 23
center -10.506309509277344 0 -193.3238067626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8973706169344444 0.43655183738796655 0.868784146909764 }
radiance 30
center 52.378292083740234 0 -189.65782165527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8318831418302727 0.46058896907289626 0.868456546730455 }
radiance 24
center 0.6045028567314148 0 -265.7682189941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8008963437967065 0.4167754537728723 0.9 }
radiance 23
center 9.086463928222656 0 -251.33319091796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4328499981545292 0.32065225012306 0.9 }
radiance 16
center 8.484698295593262 0 -209.44508361816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32704338353535856 0.7685571117849691 }
radiance 25
center 27.893407821655273 0 -245.4244384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8372139098703022 0.30704192890749016 0.8367636285585373 }
radiance 25
center 57.362422943115234 0 -214.614501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5020497068834459 0.41754142335073985 0.9 }
radiance 21
center 0.11381007730960846 0 -264.571533203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9691800771370789 0.4802208780229882 0.8006319804391486 }
radiance 30
center 56.09133529663086 0 -250.13259887695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.443504347930325 0.33986373213020576 0.9 }
radiance 20
center 42.86751937866211 0 -212.2071533203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9746875202305051 0.3925891123634637 0.8381953594015946 }
radiance 22
center 55.9615592956543 0 -233.4877471923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8237229344502248 0.40642655116574755 0.8354866331966799 }
radiance 16
center 80.17313385009766 0 -235.85009765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.565576633017248 0.4834746569258894 0.9 }
radiance 29
center 44.08102798461914 0 -193.195068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.858337710666221 0.4646640475547984 0.8113106834863123 }
radiance 21
center 84.14576721191406 0 -249.65191650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.883652976972601 0.48198064683189557 0.9000420783858787 }
radiance 26
center 10.051619529724121 0 -197.58995056152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8484069272637527 0.4003947408277883 0.9290805252177481 }
radiance 23
center 78.21339416503906 0 -226.66371154785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49152566272097764 0.8124288704895177 }
radiance 26
center 15.15314769744873 0 -263.46807861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8579524964336326 0.3703007396452068 0.8249392199683385 }
radiance 19
center 83.81588745117188 0 -265.20123291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8650773038592847 0.44038647145492105 0.8391079446489762 }
radiance 19
center 51.221221923828125 0 -251.77142333984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.861517563615633 0.49667004142010396 0.8326010824271162 }
radiance 20
center 84.2054672241211 0 -216.43247985839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30179531345775734 0.43310793765221267 }
radiance 16
center 73.79029083251953 0 -230.54713439941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998137326622337 0.36039819887404095 0.9032272858065582 }
radiance 29
center 52.27344512939453 0 -262.1245422363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8540926776928227 0.4707553104144852 0.9099451544997755 }
radiance 18
center 42.90652847290039 0 -264.1273193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9677239985016687 0.4864097139767607 0.906415377330664 }
radiance 19
center 54.46851348876953 0 -218.37330627441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842870715212254 0.3663283244255926 0.9727362698330856 }
radiance 31
center 49.9656867980957 0 -245.6520233154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8922418558367093 0.3434622726495062 0.8417991625386835 }
radiance 19
center 41.6317024230957 0 -263.8750305175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6658538819087304 0.4024914681338534 0.9 }
radiance 27
center 7.003652095794678 0 -252.81468200683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.323559710099536 0.7096433150886695 }
radiance 16
center 80.82675170898438 0 -193.55453491210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9515081444831375 0.30099246951534475 0.9472564348310143 }
radiance 29
center 78.93540954589844 0 -246.4460906982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9752470214539112 0.4767938737927421 0.9152059240245188 }
radiance 23
center 6.88236665725708 0 -217.2364044189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9339623567403126 0.47061337468318526 0.9037964674760729 }
radiance 25
center 84.78143310546875 0 -210.93478393554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9364707995356147 0.4796093740184617 0.8134491641384576 }
radiance 25
center 22.18589973449707 0 -234.98611450195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9566231544768291 0.3300944568270023 0.9644366162749349 }
radiance 22
center 56.4985466003418 0 -186.90760803222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9668992023800658 0.3372119847790816 0.8075444623084268 }
radiance 17
center 37.06644058227539 0 -249.59754943847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.815762377718263 0.3489566434006653 0.9387573471103032 }
radiance 18
center 61.44599151611328 0 -229.78353881835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.463106664664034 0.4263329759584914 }
radiance 18
center 91.68284606933594 0 -211.04991149902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8659188723534259 0.458309376982733 0.8571396512999072 }
radiance 25
center 81.7166976928711 0 -184.70578002929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9280854935408372 0.31257159229671944 0.9159706289631074 }
radiance 27
center 20.457035064697266 0 -196.5029754638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9454470438210464 0.44818888242320515 0.9605946490212083 }
radiance 23
center 35.853294372558594 0 -192.42355346679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7084214433779604 0.457210966335603 0.9 }
radiance 19
center 46.37263870239258 0 -187.66876220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3284319524044621 0.5289923186012253 }
radiance 18
center 25.231407165527344 0 -203.16395568847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9170063872543993 0.31779840702555345 0.8323787281451074 }
radiance 25
center 29.686582565307617 0 -243.36581420898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7032293013151244 0.4928320100433766 0.9 }
radiance 21
center 30.54163932800293 0 -196.2796630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.852642183635805 0.34318722008452407 0.8685675414018696 }
radiance 21
center 86.62483978271484 0 -192.97865295410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8097928211254165 0.374983178534384 0.912407059126907 }
radiance 19
center 30.016447067260742 0 -219.86349487304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9793433843723334 0.4353678014587309 0.8757099773238254 }
radiance 24
center 31.386455535888672 0 -216.50494384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8861512537072196 0.30315010651597174 0.8304808747072038 }
radiance 16
center 93.20457458496094 0 -245.77557373046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9162250732137456 0.359875172115366 0.8730474090208987 }
radiance 22
center 28.355989456176758 0 -220.7736358642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8316444508354758 0.45229491569632396 0.8917856601361376 }
radiance 31
center 37.293434143066406 0 -195.0553436279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8611841786061205 0.3142082778599774 0.8227638883568354 }
radiance 25
center 75.91343688964844 0 -213.76165771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.930626991122109 0.3026342991071569 0.8493714605102101 }
radiance 17
center 112.56694793701172 0 -182.49974060058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8456508554272317 0.3293108840378088 0.8022524027816259 }
radiance 24
center 58.780296325683594 0 -243.5063934326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9073574496688044 0.4895586316872912 0.821968797676955 }
radiance 27
center 46.921302795410156 0 -206.15281677246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8389866180502579 0.3313388452794709 0.9870351062336647 }
radiance 30
center 47.4488525390625 0 -227.71470642089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.821566838047425 0.38813734461777516 0.9 }
radiance 29
center 93.1270751953125 0 -244.5582275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9880456949707539 0.3017509088501014 0.9459442463367482 }
radiance 24
center 69.72920989990234 0 -188.21771240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46570285417625035 0.43119225138611894 }
radiance 27
center 36.169246673583984 0 -195.65838623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8253759154610965 0.34062100782964855 0.9645815312687585 }
radiance 30
center 47.9636116027832 0 -243.21717834472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9496420095952608 0.3785353867779182 0.806439837158646 }
radiance 16
center 75.81293487548828 0 -226.8331298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8036871060549242 0.487332356072401 0.8043749307978357 }
radiance 23
center 35.98393630981445 0 -245.57595825195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9934362609737657 0.42185606237879236 0.8476045513921354 }
radiance 17
center 74.70435333251953 0 -244.83050537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9055398688572528 0.3977492945407394 0.8702286456420858 }
radiance 24
center 99.50980377197266 0 -240.8737335205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9060764262503386 0.3749672626650093 0.8276425292159896 }
radiance 23
center 77.17914581298828 0 -181.00387573242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9460267070536411 0.4157142137395947 0.9350865351409843 }
radiance 26
center 42.080406188964844 0 -195.7510528564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6843348032473396 0.3564877821434438 0.9 }
radiance 29
center 82.97679901123047 0 -193.6082000732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8163947448775016 0.3298671201106039 0.8272403922724643 }
radiance 28
center 102.52953338623047 0 -193.4371795654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34889344900298097 0.638460650294242 }
radiance 16
center 41.15716552734375 0 -210.76890563964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9666877903854191 0.3159584222587331 0.849896740649753 }
radiance 27
center 115.84098815917969 0 -181.9209442138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9443975107166174 0.3355155369577681 0.8668651586692675 }
radiance 26
center 85.15473937988281 0 -239.92642211914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8259965580577463 0.31732149043185115 0.9426509915456226 }
radiance 29
center 78.06936645507812 0 -252.60032653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9394392375599054 0.4862353141689756 0.8102759378612556 }
radiance 29
center 83.99488830566406 0 -222.22303771972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8064575306660771 0.3571042872732715 0.8865560997372675 }
radiance 18
center 70.13223266601562 0 -202.21661376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5688622085684494 0.30422424225011235 0.9 }
radiance 16
center 65.67484283447266 0 -245.7306365966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9843156672899528 0.44920999043522514 0.8282793207858702 }
radiance 31
center 82.75460052490234 0 -231.4341278076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.912159759400817 0.43489436374885504 0.9909514495078238 }
radiance 31
center 103.79544830322266 0 -214.99462890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6140178283682428 0.49048212115255896 0.9 }
radiance 28
center 86.47193145751953 0 -228.66053771972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8333427041261185 0.3357894605522021 0.9455749909241101 }
radiance 31
center 85.93392944335938 0 -244.69790649414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35304359358394916 0.799298041604193 }
radiance 16
center 122.63726806640625 0 -172.75848388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.884106010607431 0.47251299914108225 0.8090371866899064 }
radiance 19
center 53.6806755065918 0 -201.63864135742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4371343848053495 0.7316749548290125 }
radiance 17
center 74.34436798095703 0 -193.68821716308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9732144936024683 0.4440512661179916 0.8927125781389865 }
radiance 25
center 127.65936279296875 0 -227.52456665039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.838251227739936 0.42134785731801555 0.860254499777215 }
radiance 31
center 58.572906494140625 0 -207.49349975585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8046302903370457 0.36999287629450517 0.9099873310930396 }
radiance 17
center 112.40132141113281 0 -179.42034912109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9488444721438898 0.4854161704027651 0.9201250238846674 }
radiance 16
center 80.87616729736328 0 -242.43812561035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48611476235172724 0.6324404327150586 }
radiance 29
center 95.54291534423828 0 -193.8551025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9242903132517308 0.3863740888173509 0.8034239236661573 }
radiance 23
center 60.45189666748047 0 -250.21774291992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8871869903370918 0.3590359838083286 0.8531630401207785 }
radiance 28
center 108.03544616699219 0 -208.93936157226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9949850935138008 0.42250742728963897 0.9459281483105648 }
radiance 22
center 108.73282623291016 0 -176.65744018554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.931591500081082 0.32640858626878966 0.9123823442195481 }
radiance 31
center 120.42896270751953 0 -177.3938446044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8069087928945492 0.35685931403693527 0.918779375572298 }
radiance 22
center 75.26760864257812 0 -218.4021759033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9427815748525322 0.36109490680940676 0.9412904825803177 }
radiance 18
center 89.98375701904297 0 -179.97671508789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9612503544318125 0.49453233047309236 0.877188127391704 }
radiance 24
center 84.2248306274414 0 -246.45269775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9462247896481046 0.30086011085837794 0.9660061700576011 }
radiance 31
center 93.48839569091797 0 -224.7862548828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8491272382801835 0.443987786243543 0.8722697767645269 }
radiance 24
center 121.5164794921875 0 -183.97525024414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8923905668068383 0.3426730955966513 0.8276357848181469 }
radiance 26
center 72.43103790283203 0 -227.98696899414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9631703187229261 0.42438479523308126 0.9808684627503659 }
radiance 22
center 80.36936950683594 0 -246.456298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8878925014287256 0.4466631733901647 0.8498666063160629 }
radiance 17
center 105.84801483154297 0 -194.68020629882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9476799669514163 0.3188780214702329 0.8105846217350787 }
radiance 30
center 112.71942138671875 0 -234.4573516845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.909769540536224 0.43052057262291443 0.826578856421774 }
radiance 30
center 115.91446685791016 0 -201.61715698242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5777816130988999 0.3661696852561751 0.9 }
radiance 29
center 73.81446838378906 0 -244.8863983154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8952735835775039 0.48810759462425723 0.8946208701923701 }
radiance 20
center 108.8648681640625 0 -220.3917236328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8195195512397083 0.4641932254904433 0.8089281273736074 }
radiance 27
center 88.64303588867188 0 -244.17523193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8178755124126552 0.32344791738181805 0.9 }
radiance 23
center 93.20744323730469 0 -174.4011993408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8104617480578021 0.3843332373939716 0.9974908680785255 }
radiance 23
center 107.80706024169922 0 -187.49591064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49673851790908324 0.8046177410263015 }
radiance 24
center 121.0447769165039 0 -206.2543487548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9621572294870394 0.35101773566879585 0.9947888480212381 }
radiance 19
center 91.09600067138672 0 -223.72256469726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8057493492579755 0.36816027602090384 0.9529070960704137 }
radiance 23
center 92.28873443603516 0 -230.68446350097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8787615977051373 0.4764902403956903 0.8043814978553678 }
radiance 30
center 130.3489990234375 0 -231.4542999267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30586774419665724 0.7828671781738725 }
radiance 30
center 127.56369018554688 0 -233.94325256347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5109879664875832 0.3362610511211456 0.9 }
radiance 30
center 114.47341918945312 0 -178.45823669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6091444463831748 0.3134210224368147 0.9 }
radiance 23
center 126.81346893310547 0 -206.322509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4592424771467296 0.5668790250603706 }
radiance 25
center 109.05757141113281 0 -198.92434692382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8064776662154256 0.4442690106936035 0.9311252821628263 }
radiance 17
center 99.1033935546875 0 -168.7034454345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9451228946991915 0.49219214187724625 0.9978702728235048 }
radiance 21
center 122.47944641113281 0 -184.17425537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.902376381903449 0.3931531636593715 0.8981943495407655 }
radiance 18
center 155.97509765625 0 -177.91183471679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9892860301220778 0.4323545653021329 0.9787985848520148 }
radiance 24
center 155.0257110595703 0 -184.68138122558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9579432553476657 0.380459981710346 0.8965149910006697 }
radiance 22
center 131.2190704345703 0 -180.22776794433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42989540236833357 0.6927189656223262 }
radiance 22
center 135.6600799560547 0 -194.3977508544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9061316693317351 0.4656774431409847 0.8466691064113958 }
radiance 25
center 136.81057739257812 0 -187.199951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9832628280530191 0.4925923989999239 0.9200604546599335 }
radiance 25
center 109.06552124023438 0 -164.0909881591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8639486207569959 0.3757121219881293 0.9762931336373164 }
radiance 30
center 150.55543518066406 0 -212.85833740234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9644423564841603 0.40723209673526173 0.8739360262445611 }
radiance 30
center 150.12257385253906 0 -197.37916564941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44212901020148354 0.42408446484674334 }
radiance 31
center 155.5238037109375 0 -224.42144775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9254909012957062 0.47846567044449356 0.8493926514158802 }
radiance 22
center 88.43269348144531 0 -179.52955627441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8121319377808252 0.4248152289510322 0.957568925742726 }
radiance 25
center 88.13388061523438 0 -220.88262939453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9028518005426234 0.41641555226493876 0.9669990756021992 }
radiance 22
center 129.13453674316406 0 -185.64706420898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8576127671408964 0.31738923497391275 0.8239161071259825 }
radiance 31
center 89.67147064208984 0 -173.71188354492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3190918841072717 0.6282263208898708 }
radiance 19
center 154.64218139648438 0 -177.56564331054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9996649267520498 0.4809073899755856 0.9034818793328752 }
radiance 29
center 114.90480041503906 0 -208.36270141601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9535368285785766 0.49075287481807606 0.8634817342414522 }
radiance 22
center 96.51944732666016 0 -225.9915313720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4607312390013229 0.7751767532896677 }
radiance 27
center 153.068115234375 0 -179.86874389648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8629390554798527 0.388468451541956 0.974840086533045 }
radiance 30
center 123.719970703125 0 -196.75271606445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.880794648553818 0.42421479606931295 0.8846959832444974 }
radiance 24
center 146.1485595703125 0 -215.13958740234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9306128878540921 0.3215739758011223 0.9557399197187486 }
radiance 20
center 106.5305404663086 0 -193.0442657470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9673970834092547 0.4382069913586366 0.8897713095673615 }
radiance 31
center 95.05496978759766 0 -169.4407501220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8658553373218574 0.46340582978390876 0.8992693189131677 }
radiance 19
center 105.44532012939453 0 -197.8287811279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8193035615883647 0.31263930400270457 0.9425465403047444 }
radiance 26
center 104.21868896484375 0 -229.6854705810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9345153338625168 0.4268229778223513 0.9055655759362556 }
radiance 28
center 112.5333251953125 0 -173.715576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7504739827488738 0.31429917327196116 0.9 }
radiance 27
center 131.16001892089844 0 -156.83396911621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4353496678466414 0.41692678681030537 }
radiance 20
center 167.72274780273438 0 -156.17176818847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49444533201799556 0.80199781914452 }
radiance 19
center 138.5959014892578 0 -229.89852905273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9482747168990313 0.3804198089408857 0.9009577599813381 }
radiance 20
center 131.28504943847656 0 -165.91433715820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8164376883475467 0.43144464766233764 0.881235136352561 }
radiance 31
center 142.0695037841797 0 -217.3738250732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8002730728633813 0.3374630063272526 0.9419419430824213 }
radiance 20
center 148.45062255859375 0 -229.8192901611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8349778869594836 0.4026044132365333 0.9793018357901208 }
radiance 17
center 93.99879455566406 0 -174.39358520507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9190424780102606 0.462598789002183 0.9120443922145458 }
radiance 22
center 112.33477020263672 0 -178.60513305664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9794947189529903 0.39212003142752294 0.9950521861626345 }
radiance 21
center 136.1549072265625 0 -201.8197021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9498173134850525 0.45476554362182964 0.8409631927485677 }
radiance 21
center 112.01396179199219 0 -184.37457275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212630321687651 0.31172037764330174 0.8400300558353704 }
radiance 22
center 142.8388214111328 0 -197.36785888671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9652954488176115 0.39415506305030057 0.8333340996578021 }
radiance 25
center 128.84910583496094 0 -157.05467224121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.802123389128468 0.4228140674152585 0.9245607379794888 }
radiance 27
center 173.1259002685547 0 -147.86134338378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3237297528674804 0.7547940540016607 }
radiance 17
center 153.9396514892578 0 -157.20948791503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.885266585857506 0.32771480091147187 0.9301770464955447 }
radiance 19
center 117.5968017578125 0 -188.09793090820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40678578074852945 0.45037943242910006 0.9 }
radiance 19
center 145.6891632080078 0 -154.76116943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9659666148568955 0.3878123936050747 0.9231396198380412 }
radiance 16
center 157.9066925048828 0 -155.126708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3794688325570885 0.4680143277262173 }
radiance 20
center 164.4669189453125 0 -215.38548278808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8696714169034163 0.48399666187519463 0.8771000943338789 }
radiance 20
center 113.09252166748047 0 -147.93202209472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8967623315137313 0.3919119517870798 0.8582038358090114 }
radiance 19
center 138.5402374267578 0 -161.07513427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.905223911275342 0.4465737277614851 0.9608411525610074 }
radiance 27
center 113.30421447753906 0 -211.784912109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9022185791199882 0.3228117479430826 0.8156646314421667 }
radiance 19
center 127.2020263671875 0 -181.36471557617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108563259255245 0.49850119647263824 0.9624276902733364 }
radiance 30
center 178.6221923828125 0 -151.72210693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9171962426801821 0.46825386650152456 0.8334321718350972 }
radiance 30
center 151.10003662109375 0 -205.2566680908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34918765636798516 0.7312542204300304 }
radiance 17
center 168.9514923095703 0 -177.3690948486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45930599947980255 0.47737890385238146 0.9 }
radiance 18
center 113.15887451171875 0 -147.47508239746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9383558580522352 0.42278902347529307 0.8845287915535448 }
radiance 16
center 160.2439727783203 0 -153.15423583984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.888805816272383 0.3640693075999357 0.836853320457849 }
radiance 21
center 126.55744934082031 0 -205.73696899414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8260222206829515 0.457859041922687 0.8462710959269018 }
radiance 21
center 149.08274841308594 0 -153.0572052001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9800967590691104 0.36648451341671645 0.939396945495149 }
radiance 21
center 173.3946533203125 0 -205.14955139160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9961414384971035 0.33083132406968696 0.9093455642882095 }
radiance 27
center 146.5377960205078 0 -195.8401336669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.873043217546768 0.34154899889905727 0.9773602482773837 }
radiance 26
center 151.22293090820312 0 -154.923095703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3479228248231164 0.4840924189228485 }
radiance 30
center 178.11952209472656 0 -150.8304901123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4863034998134602 0.43106176117270567 }
radiance 29
center 192.3062286376953 0 -159.53997802734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9522847033908851 0.36814167243116525 0.9578411776972794 }
radiance 19
center 147.0827178955078 0 -142.296630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9191098282354245 0.4957523544259608 0.9774325014042314 }
radiance 27
center 189.27650451660156 0 -202.30917358398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8561925748545582 0.43715350563223476 0.9054678532036741 }
radiance 24
center 167.7117919921875 0 -152.54580688476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9947192326465276 0.3905937231149778 0.9844459392108007 }
radiance 24
center 176.59469604492188 0 -139.35350036621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6539874745102853 0.4083681166706912 0.9 }
radiance 23
center 154.51904296875 0 -150.7145233154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6589260290347416 0.3979425486821193 0.9 }
radiance 30
center 180.39833068847656 0 -176.8553924560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9646128497730753 0.47594097543259717 0.9623417675185575 }
radiance 17
center 185.03387451171875 0 -149.76707458496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8107411255920003 0.3691294409028837 0.9824547196811152 }
radiance 19
center 186.57139587402344 0 -182.0643768310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108761265675434 0.3450063327173283 0.8579792714988529 }
radiance 30
center 150.44570922851562 0 -182.7281951904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8516770998804388 0.4208694694784034 0.8521449997905921 }
radiance 22
center 121.57382202148438 0 -194.13589477539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34242620941230517 0.8029518647246572 }
radiance 29
center 142.6864471435547 0 -159.28443908691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8514227274647291 0.38931249988764466 0.8171603430745048 }
radiance 24
center 120.04827880859375 0 -197.7322540283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9802212132408881 0.46767995573743393 0.9226468013812814 }
radiance 24
center 153.40606689453125 0 -197.03099060058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8851474227004554 0.346082903394569 0.838007429006168 }
radiance 28
center 144.65408325195312 0 -211.53640747070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9759948441883601 0.3859829454317215 0.947296379860082 }
radiance 22
center 146.3873748779297 0 -183.56765747070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.830523396146308 0.3078509667260898 0.9939594994763267 }
radiance 20
center 158.7423858642578 0 -139.8177032470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9483140576504094 0.4605387772797871 0.9755203862150069 }
radiance 26
center 181.7200164794922 0 -174.3900146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8606870538740883 0.43470383014181957 0.8609168279556121 }
radiance 31
center 160.45761108398438 0 -179.8653564453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8731415067892836 0.4483775027451885 0.998927173037109 }
radiance 27
center 138.98728942871094 0 -166.8350067138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.914328627180532 0.41762407985543226 0.8170202268562855 }
radiance 20
center 193.8758544921875 0 -158.06517028808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8956960364164527 0.4712888026357285 0.9733577131376965 }
radiance 22
center 172.2305908203125 0 -133.80494689941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9112350135914337 0.4415092588864934 0.8163897975607567 }
radiance 31
center 153.27500915527344 0 -134.9253692626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40590878806387937 0.7956321968486265 }
radiance 24
center 148.49887084960938 0 -140.75320434570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3495712834676288 0.8000505578983135 }
radiance 18
center 158.135498046875 0 -137.89596557617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5230218329751578 0.46858283643878024 0.9 }
radiance 21
center 142.30918884277344 0 -153.830810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9892483418809095 0.37141445833989917 0.9881511084430588 }
radiance 26
center 183.0751953125 0 -133.73805236816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9272184643515654 0.34187708414865847 0.9430119596558851 }
radiance 26
center 168.21209716796875 0 -196.93453979492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8378745111386984 0.31446810779688866 0.8846932547969706 }
radiance 25
center 132.1165771484375 0 -183.6385955810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8919100411430964 0.35559293379217155 0.9057486948696993 }
radiance 21
center 157.41078186035156 0 -169.41629028320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9569483488065208 0.46028501809456895 0.9921071041223899 }
radiance 21
center 139.95529174804688 0 -129.53468322753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8687614263280639 0.30189530634335987 0.8753731100710573 }
radiance 30
center 196.46139526367188 0 -200.06748962402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.995553764573686 0.3245983508838253 0.9697060598197795 }
radiance 26
center 201.3837432861328 0 -148.77015686035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30614169284957343 0.46732404390809645 }
radiance 27
center 190.36627197265625 0 -136.7045440673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8875411567428741 0.32990424320027417 0.8067641833083106 }
radiance 23
center 146.63137817382812 0 -169.97520446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8021595261632344 0.3595665763344861 0.8832752794343192 }
radiance 30
center 161.43588256835938 0 -186.47125244140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9988096175147112 0.3349980968757831 0.9920412490022328 }
radiance 24
center 200.94422912597656 0 -152.3675537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9471008500577216 0.3982724810836582 0.9077488709901137 }
radiance 20
center 191.02273559570312 0 -173.25
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8369807328539316 0.36405812871659493 0.96216307107441 }
radiance 19
center 193.73329162597656 0 -184.7124786376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8463460489315788 0.4625365740890539 0.9522865099285795 }
radiance 25
center 179.95037841796875 0 -151.96463012695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4574301123294753 0.7761585548032307 }
radiance 16
center 210.8988494873047 0 -136.54100036621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8078337209305076 0.4962589329935384 0.8146108601204946 }
radiance 27
center 193.57044982910156 0 -176.21804809570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8940947774039486 0.4454909928437356 0.8546857601091947 }
radiance 28
center 207.26138305664062 0 -152.2547149658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8714411487740601 0.43245998222152504 0.8917945927428933 }
radiance 25
center 157.78260803222656 0 -164.94607543945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.992206071669749 0.3366465129142953 0.8852066817690749 }
radiance 20
center 192.585693359375 0 -152.82815551757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8041559133126834 0.35187882334737286 0.8492366553996135 }
radiance 19
center 187.26773071289062 0 -184.52212524414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8462852258512871 0.43716579576402836 0.9 }
radiance 22
center 167.485107421875 0 -136.6385498046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4388498964728331 0.8735882525914951 }
radiance 16
center 188.0418701171875 0 -164.03543090820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9566582716070542 0.37311324635766585 0.8074166491307531 }
radiance 23
center 199.0345001220703 0 -189.04029846191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9815543118181281 0.4227241364428572 0.9995747680340143 }
radiance 28
center 184.4403076171875 0 -164.09547424316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9384030001802048 0.3865605932035222 0.9745471208950557 }
radiance 30
center 187.19554138183594 0 -166.4862060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8352691023793432 0.46094711264106647 0.9376538502120311 }
radiance 20
center 191.38768005371094 0 -137.2598419189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9814430130497731 0.39903142104479417 0.8099045874069051 }
radiance 28
center 138.49632263183594 0 -117.64633178710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8974335839074032 0.3739223788716099 0.9163393282899839 }
radiance 27
center 187.43930053710938 0 -177.7034149169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8586898893516463 0.4778857253588046 0.8375500760539358 }
radiance 20
center 211.01446533203125 0 -133.8872833251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5243873084605349 0.4223123290508243 0.9 }
radiance 20
center 188.2390899658203 0 -147.2555694580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8502205616885696 0.42129676533642124 0.9797889391854023 }
radiance 16
center 175.8270263671875 0 -140.2173614501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43682372148409787 0.7499878257600923 }
radiance 31
center 170.333984375 0 -139.26406860351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.902517461411707 0.3356044986141636 0.8645431643626134 }
radiance 20
center 148.41200256347656 0 -136.83273315429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7279386724558636 0.4156374482134957 0.9 }
radiance 29
center 156.2523956298828 0 -109.5173568725586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8711841729663354 0.4252096146859664 0.8690660044497182 }
radiance 20
center 207.909912109375 0 -144.7073516845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9163117533127302 0.3567468353027861 0.9817761483360417 }
radiance 30
center 152.48721313476562 0 -128.5994110107422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4410701943244175 0.7219880054952686 }
radiance 26
center 156.37733459472656 0 -130.12147521972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8039588761501402 0.4928172589226224 0.8104376761685517 }
radiance 18
center 180.31021118164062 0 -124.27224731445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8470781824474918 0.46900634099474914 0.9 }
radiance 28
center 219.1993865966797 0 -161.67803955078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9040939935149322 0.3422268299457023 0.9935121010682866 }
radiance 22
center 158.63214111328125 0 -161.4937744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37585943416786005 0.5823678823339566 }
radiance 21
center 163.58653259277344 0 -108.85613250732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9283929564712866 0.31900630226009574 0.870735908563999 }
radiance 19
center 200.439453125 0 -129.42591857910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.809358855963743 0.4724887347335566 0.9606467715139602 }
radiance 17
center 163.67962646484375 0 -151.0033721923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42273788997565376 0.6859550018255725 }
radiance 23
center 156.7707977294922 0 -172.4593963623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9263150904226207 0.4217233674377465 0.8148841372362847 }
radiance 22
center 168.582763671875 0 -142.8973388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9601344246478508 0.3212720486199726 0.8965367955410596 }
radiance 26
center 169.80686950683594 0 -129.9518585205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9967013018346017 0.3877488197073179 0.9948278785347486 }
radiance 27
center 193.60479736328125 0 -136.7753448486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8099629840453962 0.3601925719968585 0.9523740075085891 }
radiance 26
center 168.6377410888672 0 -155.27317810058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9185052642123681 0.47572420940949056 0.9635040633200344 }
radiance 25
center 176.333984375 0 -155.2394256591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.789766327550762 0.4466764853566267 0.9 }
radiance 21
center 160.5079345703125 0 -114.3738784790039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9739236813565058 0.49683019487713564 0.8715635006698436 }
radiance 17
center 151.95912170410156 0 -123.7930908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4542171241574151 0.8853893603525751 }
radiance 25
center 162.23355102539062 0 -142.33734130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9264225194073246 0.4222622629842979 0.923804060032088 }
radiance 24
center 160.42657470703125 0 -163.56016540527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8858197130266973 0.38613468453237443 0.8333374700891547 }
radiance 18
center 174.09048461914062 0 -149.2655792236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9569563799456315 0.4414508152557568 0.9193977522049239 }
radiance 20
center 166.44561767578125 0 -161.92840576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8877646089419508 0.33203351312116164 0.9013169087271926 }
radiance 21
center 223.53224182128906 0 -108.36417388916016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9203528889259788 0.3300827374646543 0.9904321528925646 }
radiance 22
center 208.4226531982422 0 -164.94924926757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8933938819640995 0.3319301751667301 0.872170893022532 }
radiance 27
center 187.2664031982422 0 -103.50164031982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39498165085756004 0.5189269072574965 }
radiance 31
center 192.8926544189453 0 -121.1178207397461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8232016568146449 0.4224081431027033 0.879800012188694 }
radiance 24
center 219.2567138671875 0 -143.82591247558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8021133024510003 0.3785659850968878 0.9511469811991835 }
radiance 26
center 179.67214965820312 0 -129.4278106689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6703185021372391 0.40182256804335437 0.9 }
radiance 26
center 227.60940551757812 0 -169.84539794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4894988827954976 0.6050619503991543 }
radiance 20
center 218.6306915283203 0 -146.58180236816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5721712777574783 0.425342781288393 0.9 }
radiance 28
center 217.11146545410156 0 -165.97525024414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9471470554545784 0.375551342804159 0.8095408999915976 }
radiance 22
center 193.67010498046875 0 -137.51734924316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9825400643507642 0.43627911403479525 0.9122421820705363 }
radiance 20
center 190.21408081054688 0 -160.19491577148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9457463623090056 0.3488181345652102 0.9085570565679286 }
radiance 29
center 198.06390380859375 0 -105.17178344726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.879956491537373 0.48002614924616144 0.9781427048358629 }
radiance 29
center 206.89987182617188 0 -103.01689910888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9499672887025776 0.48274683259481854 0.975174145199682 }
radiance 28
center 164.55783081054688 0 -107.35391998291016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9804099044288406 0.3204996476274414 0.9748631754458796 }
radiance 22
center 207.7717742919922 0 -144.9530792236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9615457450593923 0.46360940643206616 0.8938566370278705 }
radiance 24
center 179.8467254638672 0 -163.1800537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30775030762433936 0.6050133106967511 }
radiance 21
center 174.71685791015625 0 -154.8265380859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9077996124082274 0.4528549741193637 0.9331968087097471 }
radiance 28
center 223.31097412109375 0 -148.55059814453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.980827676143158 0.4377647380652638 0.8214386534483378 }
radiance 24
center 216.1340789794922 0 -121.25374603271484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3875861392876936 0.4047131417639075 }
radiance 25
center 238.7845458984375 0 -103.01748657226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46967798511686726 0.48935348886007224 }
radiance 31
center 189.89515686035156 0 -145.85202026367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7143843906584864 0.35971549850809986 0.9 }
radiance 21
center 179.4287567138672 0 -141.3938751220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9627819690696322 0.4018591834057965 0.9936341699202794 }
radiance 21
center 177.08753967285156 0 -157.790283203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8653099465177168 0.47466018212500105 0.9416844680520893 }
radiance 28
center 204.84567260742188 0 -111.54129028320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8418755842040502 0.3702068046638687 0.9444492952619301 }
radiance 30
center 191.89955139160156 0 -93.8803939819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3595275270635845 0.553675967355438 }
radiance 16
center 179.61766052246094 0 -99.56146240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9613810735671717 0.4424352296080713 0.8496313630174803 }
radiance 29
center 173.9300537109375 0 -117.68766021728516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9406864835338141 0.39363861073586137 0.9474771284666069 }
radiance 17
center 222.78895568847656 0 -155.56396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3458531531114837 0.6226868451258462 }
radiance 27
center 169.43740844726562 0 -145.16529846191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.818961269533238 0.45153108348950044 0.8237963087914828 }
radiance 30
center 230.02877807617188 0 -150.3332061767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32926171316237446 0.6205428270231341 }
radiance 19
center 173.1318359375 0 -103.11066436767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9958687466756388 0.42882371688444504 0.8347323295792259 }
radiance 27
center 180.20286560058594 0 -129.982666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8317917519135113 0.4861211403640928 0.842298642883284 }
radiance 18
center 221.5479736328125 0 -98.33352661132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3350578934287004 0.5123262654420723 }
radiance 17
center 195.27560424804688 0 -95.90829467773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9977357733010428 0.480345501779273 0.8625461495566435 }
radiance 29
center 200.4832763671875 0 -135.26394653320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9758806328948767 0.40368514030848635 0.9811719601780298 }
radiance 24
center 171.90972900390625 0 -83.47147369384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9686468370194931 0.41695976559550163 0.8611246961844078 }
radiance 16
center 232.69728088378906 0 -90.8020248413086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206008623633815 0.35681510671261946 0.9880888884641563 }
radiance 21
center 202.14820861816406 0 -151.64222717285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9134389738017096 0.44976469609620157 0.9211304324898362 }
radiance 30
center 184.92796325683594 0 -85.45391082763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4908394617412777 0.4008128335028305 }
radiance 25
center 203.25399780273438 0 -121.4996337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7461532308566562 0.305816961746687 0.9 }
radiance 20
center 227.11563110351562 0 -119.64080047607422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8543210071822331 0.4060286630379677 0.9633282530945799 }
radiance 29
center 197.57308959960938 0 -123.74586486816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45108860121019856 0.49494612823823736 }
radiance 21
center 225.32760620117188 0 -117.91698455810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4678472236589647 0.5538366967634674 }
radiance 22
center 235.3116912841797 0 -89.78915405273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992224198493938 0.39169878855251605 0.9079941725153248 }
radiance 23
center 240.48028564453125 0 -101.73209381103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.971161556895578 0.4095369274392477 0.8300536985381074 }
radiance 25
center 219.56236267089844 0 -145.4646453857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9928801602961606 0.44420378469865307 0.8172566246773322 }
radiance 21
center 225.22674560546875 0 -93.7064437866211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992813684748715 0.41064977655417256 0.9334628482966354 }
radiance 30
center 240.37173461914062 0 -130.84786987304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9942663768527676 0.3942746841978495 0.8989539384208431 }
radiance 21
center 173.34519958496094 0 -126.04266357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9840707599235685 0.47478328771501244 0.9929383985469701 }
radiance 28
center 213.8603515625 0 -109.81597900390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44936146027440294 0.7460682392344323 }
radiance 24
center 222.18775939941406 0 -130.58619689941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3690935615278907 0.4224824760619369 }
radiance 18
center 202.6396484375 0 -93.78878784179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8330750853747313 0.4019593532676133 0.8129405702421258 }
radiance 31
center 229.72618103027344 0 -103.47972869873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3518989500988613 0.48696750611223893 }
radiance 19
center 212.80250549316406 0 -143.3575439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9177468495942992 0.3252257017128005 0.8302168515292603 }
radiance 18
center 215.03587341308594 0 -92.32185363769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4762930535906475 0.6493466414222486 }
radiance 22
center 231.10226440429688 0 -138.43418884277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.625959893720509 0.4827120243907121 0.9 }
radiance 31
center 175.3714141845703 0 -124.06521606445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8662451907279428 0.3696031338342316 0.9369827731265928 }
radiance 27
center 185.6197509765625 0 -102.7280502319336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6483284167125717 0.38401199177437884 0.9 }
radiance 26
center 224.55726623535156 0 -119.75755310058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8612053846636794 0.4180693338593414 0.9918871439145968 }
radiance 30
center 193.55810546875 0 -119.85551452636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4713487448523964 0.381137510126968 0.9 }
radiance 22
center 244.68307495117188 0 -129.3359832763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8927396304814893 0.4983324450253034 0.894544125754704 }
radiance 22
center 183.691650390625 0 -91.5000228881836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4896972570297904 0.6224096968948557 }
radiance 23
center 225.1835174560547 0 -94.9441146850586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9945933874230016 0.4772879254898431 0.8549968880447119 }
radiance 21
center 212.14646911621094 0 -107.75887298583984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9655291273202711 0.32991132601094103 0.8659883496251509 }
radiance 18
center 227.79620361328125 0 -103.44532012939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8670472255893266 0.37655346824221103 0.9926367058751213 }
radiance 26
center 188.00765991210938 0 -70.04379272460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9356757496165174 0.3216312860555042 0.9366708105574651 }
radiance 29
center 209.13592529296875 0 -120.52497100830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3682487090236741 0.7160769876581103 }
radiance 30
center 248.63011169433594 0 -69.56277465820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998094352789801 0.4747506408775386 0.9032985412347156 }
radiance 31
center 187.28433227539062 0 -105.14485931396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9283621889802391 0.3053415875893151 0.984372363978455 }
radiance 27
center 244.63734436035156 0 -66.60267639160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8567026711365204 0.4530530680958282 0.9607284860606001 }
radiance 31
center 236.3548126220703 0 -106.51358795166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9086250147468454 0.40807382292715433 0.8935603281864614 }
radiance 22
center 241.78292846679688 0 -119.50514221191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9637342071481054 0.3747757637131148 0.8290456152359993 }
radiance 22
center 196.61676025390625 0 -83.1565933227539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.650045840151577 0.39921927835653326 0.9 }
radiance 21
center 251.37765502929688 0 -63.15703201293945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39268985264658063 0.4950120281497843 }
radiance 17
center 179.5497283935547 0 -71.57687377929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5756625280074598 0.3591034720160789 0.9 }
radiance 20
center 226.88211059570312 0 -114.26858520507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9757966749495416 0.41751763577251333 0.8820825771829065 }
radiance 26
center 223.2226104736328 0 -104.19010925292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8054952246980104 0.3904704740216194 0.8859986309840673 }
radiance 16
center 247.35821533203125 0 -127.12199401855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7155229276490087 0.4568320758269583 0.9 }
radiance 26
center 210.18162536621094 0 -82.0615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6919533958900614 0.30666836776005485 0.9 }
radiance 19
center 209.9060516357422 0 -90.63713836669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9129944823295114 0.3854373345497126 0.8264572788323932 }
radiance 23
center 198.58213806152344 0 -75.38715362548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8280182845938624 0.47979946113904454 0.8681659619997962 }
radiance 16
center 194.00335693359375 0 -50.502685546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3681564442513615 0.8478767174547608 }
radiance 25
center 230.59754943847656 0 -49.98067855834961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6865131170812048 0.3638317932678913 0.9 }
radiance 26
center 223.21620178222656 0 -115.23985290527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8551464710661133 0.3047796331997626 0.8693046183343495 }
radiance 24
center 197.11448669433594 0 -104.54170227050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8284309076114728 0.3904323987158084 0.9 }
radiance 27
center 202.93148803710938 0 -87.65403747558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8709385426044852 0.4190335283951593 0.9860460647790125 }
radiance 16
center 238.69107055664062 0 -75.17900848388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4754996323519477 0.410761685933301 }
radiance 26
center 215.14393615722656 0 -57.74396896362305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8284710302942457 0.30646913389048236 0.963053152997912 }
radiance 21
center 218.22708129882812 0 -68.46749114990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4847968191552483 0.8371193517817443 }
radiance 24
center 190.55154418945312 0 -109.92325592041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4500124401297451 0.4384314788874957 }
radiance 24
center 230.47610473632812 0 -98.35153198242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5330478812439503 0.46812544770077413 0.9 }
radiance 29
center 255.1988067626953 0 -64.70523071289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.80789499622275 0.44902212624803695 0.8802069377175763 }
radiance 27
center 202.8952178955078 0 -119.85814666748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9221394730932788 0.3470026672857324 0.8322101729500297 }
radiance 21
center 246.94259643554688 0 -96.77792358398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8853825256383678 0.47060342394442406 0.8373498619407802 }
radiance 23
center 207.51095581054688 0 -78.094482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7377237349056284 0.3078606525461289 0.9 }
radiance 16
center 206.55941772460938 0 -81.7147445678711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8226218404864033 0.3485474459800394 0.9968963768438676 }
radiance 29
center 199.51095581054688 0 -102.0533676147461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8067876756365011 0.40115446829534784 0.8013090501401955 }
radiance 31
center 241.37948608398438 0 -94.2236099243164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40300322764800967 0.7014482823449911 }
radiance 19
center 255.88079833984375 0 -37.21492004394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8093105348771237 0.42045819437079446 0.9673720425406115 }
radiance 22
center 240.03802490234375 0 -78.58169555664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9763310203250951 0.3177865573803664 0.8923473176739909 }
radiance 24
center 223.24867248535156 0 -47.68509292602539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7385495860430292 0.33766992754243597 0.9 }
radiance 17
center 202.43594360351562 0 -102.39517974853516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8939586877473924 0.4607695109503438 0.8762350339272227 }
radiance 27
center 206.40846252441406 0 -43.17514419555664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4340802082767551 0.3450200776985007 0.9 }
radiance 16
center 220.434326171875 0 -84.45048522949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8196711903246212 0.3173951751962474 0.8086858526087859 }
radiance 31
center 221.48121643066406 0 -73.51556396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9726822214868358 0.4185242169312865 0.9347430097549017 }
radiance 24
center 254.81427001953125 0 -56.94905090332031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8930889204363919 0.4721591457334193 0.9863891542225244 }
radiance 31
center 240.58189392089844 0 -95.70649719238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5378727657993945 0.42070703203761733 0.9 }
radiance 19
center 191.08670043945312 0 -46.1992301940918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9084951111179859 0.3847451140611231 0.9841467401804511 }
radiance 21
center 237.61524963378906 0 -52.10764694213867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8488834781213511 0.3702312050064607 0.9458309022099738 }
radiance 28
center 257.7203063964844 0 -102.43425750732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9119380502451658 0.3092438536484683 0.9045087322035827 }
radiance 30
center 214.9104766845703 0 -47.361167907714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9170103132003554 0.47935032122577337 0.835293295895979 }
radiance 27
center 208.08006286621094 0 -40.79305648803711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44664181611485054 0.7284718143683597 }
radiance 25
center 187.650146484375 0 -69.898681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8403313036283488 0.4700392242581731 0.8667103607301123 }
radiance 31
center 192.24342346191406 0 -61.2008056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8203116088910221 0.3702725420017029 0.8369750044075488 }
radiance 27
center 247.59706115722656 0 -55.97435760498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9728725181320996 0.3280827294433864 0.9427605078803231 }
radiance 19
center 232.78782653808594 0 -44.87507629394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8771801583734637 0.37927494407315276 0.8954014000805051 }
radiance 16
center 255.0797119140625 0 -63.15761184692383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8214232051796592 0.31750489558386324 0.9725360959202946 }
radiance 24
center 211.08633422851562 0 -62.12837219238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9063862625941027 0.33204399792997935 0.895759301850053 }
radiance 25
center 216.7332305908203 0 -67.40150451660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4819764965515778 0.5182066254726677 }
radiance 25
center 231.03343200683594 0 -40.841697692871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.85583401771739 0.3356394818189954 0.9543782678145553 }
radiance 17
center 235.07102966308594 0 -88.3209457397461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9949206997158571 0.45973953974440457 0.8982964193225742 }
radiance 21
center 262.69232177734375 0 -50.482852935791016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4921351736338483 0.3813683757261368 0.9 }
radiance 31
center 229.02828979492188 0 -25.567609786987305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8527990448849263 0.32727795457174375 0.9455948567406736 }
radiance 22
center 196.96371459960938 0 -85.8199462890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9364479633900539 0.4813069303814339 0.9339516056151467 }
radiance 17
center 248.22735595703125 0 -33.535789489746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8506171731090792 0.46117880220721186 0.8605641786120976 }
radiance 25
center 220.6150665283203 0 -71.78067016601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9314042467772626 0.4540384601176567 0.9327132831283416 }
radiance 16
center 247.75613403320312 0 -52.17832565307617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8257661098280019 0.31685502911160873 0.935122900340866 }
radiance 24
center 199.31256103515625 0 -55.05305862426758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9140756600348677 0.38348496071064764 0.8695905330562126 }
radiance 23
center 238.24571228027344 0 -73.32328796386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45985056835836136 0.7279774511103451 }
radiance 22
center 199.1813201904297 0 -72.94544982910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9567391371209577 0.37526997698310705 0.8126841494577862 }
radiance 23
center 264.53125 0 -92.92597198486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9263067688066898 0.4582827415329817 0.9315736894694335 }
radiance 16
center 220.1177215576172 0 -29.560922622680664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8095101663547501 0.48134703313260013 0.8010277111720013 }
radiance 26
center 211.10232543945312 0 -88.49323272705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9654250096614954 0.34772150425328735 0.818909855446299 }
radiance 27
center 225.08628845214844 0 -71.68267822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9694031308448866 0.3535540419142419 0.856466096103486 }
radiance 20
center 205.58413696289062 0 -59.916629791259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9615886063790714 0.4788841167803417 0.8635397606198985 }
radiance 27
center 205.9063720703125 0 -44.783729553222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8439170565432695 0.3167022469368991 0.9856622856216424 }
radiance 26
center 237.46018981933594 0 -74.93482971191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7591957996667765 0.36589304003148915 0.9 }
radiance 28
center 218.89178466796875 0 -70.05690002441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9330957699055011 0.4549583215952217 0.9263585922341403 }
radiance 25
center 251.85409545898438 0 -34.89809036254883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8227921988010679 0.38794923113437274 0.8449477246664172 }
radiance 22
center 206.35455322265625 0 -40.58228302001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9542899205744215 0.3724004233076972 0.8275159945558922 }
radiance 18
center 223.76644897460938 0 -72.29097747802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8311654148358343 0.37010947935556515 0.8239568001248985 }
radiance 26
center 227.15451049804688 0 -37.14983367919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8575572656170989 0.46691842270313283 0.8751919821949524 }
radiance 28
center 256.3793029785156 0 -49.41830062866211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9189912853409233 0.36602098677850115 0.821546873506823 }
radiance 26
center 218.5428924560547 0 -37.27106475830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9227727943125124 0.3642667300347002 0.9862234643734036 }
radiance 27
center 197.80108642578125 0 -48.51838684082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8823362399784168 0.4382142750439319 0.9764601836572934 }
radiance 22
center 245.336669921875 0 -9.488748550415039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9807870937336456 0.4866662839157722 0.8534518666222085 }
radiance 28
center 257.13824462890625 0 -68.19569396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8347465944772694 0.474700424928882 0.9789939421961309 }
radiance 27
center 224.32733154296875 0 -30.835050582885742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9670226834470977 0.4235122978958644 0.8219388289960106 }
radiance 25
center 250.5735321044922 0 -23.179407119750977
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8303249658766869 0.4010425136165454 0.8709974051327658 }
radiance 27
center 253.18740844726562 0 -47.45258331298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9667367280448167 0.4052383186301428 0.8189849298854399 }
radiance 24
center 245.34437561035156 0 -20.40781593322754
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9392963399997009 0.3809252991686386 0.9705080063179001 }
radiance 18
center 255.46173095703125 0 -45.683006286621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4484961551080212 0.7629618922233091 }
radiance 31
center 202.1507110595703 0 -13.1029052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.825501833738744 0.41994514775622793 0.861249812666091 }
radiance 31
center 262.6481628417969 0 -22.848310470581055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4990240583544352 0.42863490116851966 }
radiance 23
center 219.23121643066406 0 -47.84992599487305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9163229874560276 0.4887043044445971 0.8211679873226427 }
radiance 19
center 214.17144775390625 0 -47.722511291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8203252027895761 0.44665253743302114 0.8939019226416962 }
radiance 20
center 209.23776245117188 0 -17.560062408447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9987484521325862 0.4144258941484307 0.8148269753626193 }
radiance 25
center 230.5477752685547 0 -8.66805648803711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33782294469337415 0.5528689212044635 }
radiance 18
center 252.04937744140625 0 -64.23899841308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8112879548990714 0.47598717122193557 0.8543663866138702 }
radiance 17
center 256.0135192871094 0 -46.425941467285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8460419076414086 0.383338935024051 0.8652959818170456 }
radiance 19
center 238.97914123535156 0 -30.880125045776367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9017093242875368 0.36054101456023435 0.9450621589953414 }
radiance 20
center 218.04762268066406 0 -10.433664321899414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5799411746509255 0.31496816429833613 0.9 }
radiance 26
center 201.31336975097656 0 -19.110347747802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3750049599680654 0.8089523038791369 }
radiance 20
center 243.268310546875 0 -7.556008338928223
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9910192007349021 0.3902573029160644 0.9421126657108005 }
radiance 25
center 202.17994689941406 0 -55.696815490722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5425006951395422 0.4356533575425192 0.9 }
radiance 16
center 210.21324157714844 0 -59.068687438964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8952009547907787 0.4124685252549831 0.8354658280820945 }
radiance 22
center 246.0068817138672 0 4.815966606140137
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7455451933211311 0.4058154188439983 0.9 }
radiance 16
center 239.44442749023438 0 -3.8564679622650146
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8805886913395928 0.3978850618953162 0.9756833262803614 }
radiance 21
center 218.71815490722656 0 -20.347200393676758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9218185452102833 0.4553654546193143 0.8656274628478715 }
radiance 22
center 220.8358612060547 0 3.658268451690674
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4659138545571462 0.42957922909529644 }
radiance 19
center 229.12924194335938 0 -47.59143829345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8678425857499408 0.4851389487635547 0.8634835296545972 }
radiance 29
center 238.27464294433594 0 -4.934031963348389
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46346444329835734 0.8158261204052782 }
radiance 24
center 258.9913635253906 0 -23.64751434326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8840808075666817 0.353455186308099 0.8978147954380363 }
radiance 20
center 230.13116455078125 0 -23.512239456176758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8478872798822965 0.4146315962900608 0.9171113668683052 }
radiance 24
center 235.54600524902344 0 -57.23310470581055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7823449999021822 0.35342725042790935 0.9 }
radiance 19
center 259.14801025390625 0 -35.464725494384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8850205023686004 0.30633139434502343 0.8815957140878222 }
radiance 22
center 198.0994415283203 0 -33.24057388305664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5402661235034849 0.32914749592854725 0.9 }
radiance 16
center 217.01791381835938 0 2.298013925552368
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892313486400668 0.4862010800522405 0.9605650820705934 }
radiance 20
center 261.2667541503906 0 -29.51029396057129
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8836949033498989 0.4540130367101871 0.9663289908726633 }
radiance 21
center 229.05567932128906 0 -39.81930160522461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717335310718288 0.37345817810983495 0.8073973427063558 }
radiance 30
center 250.06581115722656 0 -6.667996883392334
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9152837323836783 0.4617515835761662 0.967799747982706 }
radiance 16
center 210.94178771972656 0 3.0711734294891357
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8314972852484477 0.3715278704838576 0.8360701313521057 }
radiance 28
center 210.70315551757812 0 -20.204259872436523
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8981824802486609 0.4083151782952041 0.8191587403055132 }
radiance 24
center 262.1441345214844 0 -7.723105430603027
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3563650606920914 0.6799009769335131 }
radiance 22
center 216.28443908691406 0 -19.89677619934082
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.951921389003527 0.3911081243720217 0.8400505636630612 }
radiance 16
center 264.600830078125 0 -38.014183044433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9036983304765916 0.4110703377873127 0.8169638886787872 }
radiance 23
center 249.79476928710938 0 -34.835208892822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8820870439609294 0.31660265254556463 0.9513879502367368 }
radiance 18
center 214.75106811523438 0 1.691998839378357
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9384688446962051 0.4501538495508368 0.903356231260533 }
radiance 20
center 238.9385986328125 0 -50.104251861572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8110348665371506 0.3957681629862091 0.9 }
radiance 24
center 258.1649169921875 0 5.1082305908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9696646519153282 0.3860180416214597 0.9699113545274188 }
radiance 25
center 250.1388397216797 0 -1.377232551574707
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4019083527878653 0.8246339066179668 }
radiance 24
center 216.14541625976562 0 -40.97645950317383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36891181275658735 0.41148220233030197 }
radiance 24
center 214.82337951660156 0 -2.935784101486206
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7769586939500339 0.4006368977433602 0.9 }
radiance 23
center 261.1444396972656 0 -29.22442054748535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9273237848564219 0.47225286783026843 0.9926550689349223 }
radiance 26
center 203.775390625 0 -19.98126220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9057220638592345 0.47524314534283285 0.8102038041622777 }
radiance 20
center 260.654541015625 0 -28.125696182250977
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8065281605873886 0.4425935797427633 0.9 }
radiance 16
center 223.7606201171875 0 -14.29544734954834
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8622235297055529 0.3006419889904806 0.8700501758996981 }
radiance 30
center 230.9822998046875 0 -5.680964946746826
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8369350478448688 0.39563266858069324 0.872451471259264 }
radiance 19
center 239.89247131347656 0 16.31538200378418
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9263560371093728 0.43458896071943964 0.9015700942277886 }
radiance 25
center 203.93795776367188 0 29.485382080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9073265406265876 0.3961713690634572 0.9549359873478594 }
radiance 17
center 245.47061157226562 0 12.334226608276367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.873554515671302 0.44102186469571536 0.8635681856897643 }
radiance 20
center 208.37689208984375 0 -2.9075894355773926
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8996072346576585 0.4359931415973717 0.9494207160459294 }
radiance 28
center 268.971923828125 0 -30.704755783081055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9360088082633046 0.38616729813225764 0.8720843345334179 }
radiance 23
center 206.22540283203125 0 -9.175601959228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9052929070484526 0.44596250970326323 0.8199454928796153 }
radiance 20
center 240.3756866455078 0 6.237790107727051
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8504311377108043 0.44553443870973813 0.8832156913607849 }
radiance 19
center 248.49554443359375 0 30.295917510986328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43804338031105905 0.893788500490109 }
radiance 21
center 230.52447509765625 0 -24.587690353393555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9989366843518408 0.48962182790830455 0.8330954519619276 }
radiance 24
center 269.5899353027344 0 9.288440704345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9982026133968203 0.33759799926478623 0.9662680003824576 }
radiance 31
center 213.9725341796875 0 -15.244285583496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8446261694858553 0.3882274341305358 0.8665140185758702 }
radiance 24
center 233.67369079589844 0 -10.143499374389648
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8179126354783393 0.35498637460625565 0.8380268815601404 }
radiance 19
center 226.07803344726562 0 25.392208099365234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.340747510310751 0.7789276198081939 }
radiance 18
center 212.84100341796875 0 -10.304259300231934
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8530175945961692 0.39048027563247134 0.9346444005908688 }
radiance 30
center 250.8672332763672 0 -31.204505920410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8172863954449472 0.3593886835091023 0.9 }
radiance 24
center 262.53350830078125 0 12.410365104675293
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8741564300782629 0.4917101927900378 0.9 }
radiance 31
center 223.74122619628906 0 -6.2889251708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8293751102192998 0.47334351721720325 0.8903521476969004 }
radiance 17
center 207.80780029296875 0 3.81195068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9692128510899075 0.38797957663841487 0.9327728526215087 }
radiance 25
center 250.4752197265625 0 -24.80387306213379
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5047507500098884 0.4341801832258835 0.9 }
radiance 19
center 268.8288879394531 0 -15.66431999206543
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49412769783526156 0.6610507944610009 }
radiance 31
center 258.41595458984375 0 -6.072144508361816
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.905018732227176 0.31551513372103684 0.9644047438348076 }
radiance 20
center 211.1524200439453 0 18.884401321411133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8389099827320545 0.46070472232206894 0.9 }
radiance 26
center 212.01141357421875 0 -7.3080620765686035
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9840952887088459 0.3661622759275879 0.8480889125616269 }
radiance 24
center 212.5266876220703 0 -11.955208778381348
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8163556313025317 0.4800349118827566 0.8362782200452705 }
radiance 20
center 199.4446258544922 0 7.245662689208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9064078976755803 0.3682113840571757 0.8363471360663122 }
radiance 21
center 225.72193908691406 0 45.34646987915039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.992173831233657 0.4437054678620098 0.9986214692304894 }
radiance 26
center 213.6319122314453 0 -9.833677291870117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9517659741451683 0.3346422850503964 0.8835893864934715 }
radiance 18
center 229.15061950683594 0 -24.54158592224121
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.908448568372429 0.36046180815655593 0.8509897830292168 }
radiance 17
center 237.20352172851562 0 40.446014404296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8462093248658185 0.4367810398391786 0.9 }
radiance 27
center 250.23458862304688 0 -24.122364044189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.948012790448433 0.488517744037714 0.9134254431143226 }
radiance 31
center 205.62564086914062 0 39.08427047729492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9197138463742923 0.4519721721646388 0.9016443069141051 }
radiance 26
center 235.10552978515625 0 14.090337753295898
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8746335151260606 0.42636344998307607 0.8952747171248161 }
radiance 21
center 205.13665771484375 0 -12.071673393249512
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8154266392180749 0.37782012218686045 0.9677166583996673 }
radiance 28
center 229.80300903320312 0 -12.597951889038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8572614193217094 0.4200181808577838 0.8867006810720157 }
radiance 16
center 258.191650390625 0 22.268367767333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9036999778101948 0.36058640686110444 0.8683668038925139 }
radiance 24
center 225.22003173828125 0 22.154247283935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8421789871741798 0.43832289411982667 0.9 }
radiance 30
center 223.5900421142578 0 22.0589542388916
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8514326222002802 0.4713021592910993 0.9072923405373619 }
radiance 31
center 231.8121795654297 0 18.268613815307617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9087666033794646 0.42356885084589735 0.8617889457638976 }
radiance 23
center 219.2872314453125 0 -14.040853500366211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34091551952016996 0.6245220632635242 }
radiance 26
center 203.65277099609375 0 -16.524585723876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7958321045434694 0.4386660957973824 0.9 }
radiance 19
center 261.76190185546875 0 10.34961986541748
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9142812122011525 0.49586685381261364 0.982538998057169 }
radiance 28
center 210.58987426757812 0 10.861987113952637
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8307752560851955 0.37357131126399085 0.8093126755646608 }
radiance 24
center 239.94033813476562 0 12.751435279846191
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9461668517131423 0.4079468302706914 0.839355674632341 }
radiance 31
center 245.0335693359375 0 30.308401107788086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9452502015725117 0.4842477713740058 0.8875044523582782 }
radiance 27
center 208.81947326660156 0 -1.8101409673690796
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7167101430556658 0.31915201997186443 0.9 }
radiance 21
center 217.65597534179688 0 7.037667274475098
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8868105317144168 0.3107342419470666 0.8809333132322611 }
radiance 25
center 221.72837829589844 0 48.64352035522461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8067977976076793 0.3707929707471185 0.9033223673779102 }
radiance 18
center 231.05718994140625 0 24.732898712158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8606887017975245 0.3940769811883861 0.9486211878695813 }
radiance 30
center 215.16552734375 0 12.700397491455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8252376033178849 0.40852428740825175 0.9 }
radiance 19
center 232.47891235351562 0 15.9932279586792
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8933293380692056 0.4624935774972281 0.8742533445315727 }
radiance 31
center 201.62803649902344 0 55.73463439941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9713670878823473 0.4351152535259397 0.8912019158349909 }
radiance 18
center 217.0432586669922 0 8.020600318908691
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3950623846089125 0.6065655694802685 }
radiance 29
center 241.8572540283203 0 36.629512786865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9897073139861987 0.4629208255103964 0.8881553775395007 }
radiance 30
center 237.68260192871094 0 58.78194808959961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9000147275946984 0.4854803191368078 0.8758878693297728 }
radiance 19
center 262.96044921875 0 24.718515396118164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9257355624963686 0.3749434453242233 0.8046923268156376 }
radiance 30
center 199.83132934570312 0 5.336569309234619
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4834960689099266 0.8743554230919395 }
radiance 24
center 246.53639221191406 0 -6.051898002624512
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8215687621971749 0.4224852988711144 0.967116509649838 }
radiance 31
center 240.06520080566406 0 10.146547317504883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9074851578462371 0.362753772657057 0.9764082497394303 }
radiance 27
center 202.06695556640625 0 11.505369186401367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99391697858875 0.3141609954082814 0.9372954496166696 }
radiance 22
center 201.6028594970703 0 15.885940551757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8414449571950626 0.30486630346736254 0.9849328249475316 }
radiance 25
center 217.10113525390625 0 64.32425689697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9577330021775914 0.44010636570205575 0.8779752374997285 }
radiance 22
center 263.8684997558594 0 45.85816192626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8234806223896161 0.3712226349875953 0.9027589333263991 }
radiance 28
center 212.70977783203125 0 52.517311096191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9659614251559768 0.4738966975324299 0.8060312987711755 }
radiance 22
center 244.32977294921875 0 66.2820816040039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9005570506286649 0.3185060230066641 0.9803145778501291 }
radiance 23
center 248.73898315429688 0 17.03350257873535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9316332278332091 0.3185094254337499 0.9195295103863111 }
radiance 30
center 199.5797576904297 0 20.093339920043945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8414072437823452 0.3969221684609196 0.911975806259262 }
radiance 18
center 263.7815856933594 0 36.73939895629883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9302642965465231 0.4253268582505483 0.8523304151775697 }
radiance 22
center 236.516357421875 0 61.2117919921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9924042004344418 0.45162067793741156 0.9104013141464191 }
radiance 29
center 214.87147521972656 0 14.01181697845459
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8095884313454128 0.41958681717126023 0.9055385343876452 }
radiance 19
center 239.5395050048828 0 15.864599227905273
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4379119137484485 0.7491451653606108 }
radiance 21
center 214.8672332763672 0 27.03209114074707
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42160692260460814 0.8841039029631642 }
radiance 26
center 237.49948120117188 0 5.333006381988525
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5242796967037668 0.4422781304284715 0.9 }
radiance 25
center 228.40904235839844 0 40.275177001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.898596425312161 0.35675850083563104 0.9245744609865068 }
radiance 20
center 233.68109130859375 0 71.44341278076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9735300899100997 0.3804725305379113 0.9823059411998899 }
radiance 27
center 217.6559295654297 0 7.659860134124756
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8452357894087834 0.380305381099203 0.9238378686899834 }
radiance 18
center 199.50936889648438 0 51.56548309326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8579324945411212 0.31938992093075397 0.9622375249232273 }
radiance 24
center 265.16815185546875 0 29.243988037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998836582963491 0.34598282706479033 0.9578075988525421 }
radiance 30
center 250.3612060546875 0 63.40684127807617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9474655318977572 0.4925232698859283 0.9672900290290148 }
radiance 17
center 227.8121337890625 0 2.5063304901123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9388666723294445 0.47948707599158913 0.8482504597698899 }
radiance 24
center 260.8148498535156 0 38.3235969543457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3505891161522408 0.7723172282485974 }
radiance 30
center 218.05601501464844 0 58.70236587524414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9791277511865908 0.39354090627053107 0.9996907846545922 }
radiance 16
center 197.7722625732422 0 76.38357543945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.992028209527395 0.3558935745551456 0.9309840156062199 }
radiance 26
center 253.01409912109375 0 85.37187194824219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8730273133855679 0.3116387078428786 0.9748782569560468 }
radiance 29
center 199.0008544921875 0 62.22483825683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5629601196456533 0.328388317828356 0.9 }
radiance 26
center 211.6697998046875 0 23.038928985595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9287017852651991 0.3614614059377635 0.9213328579874728 }
radiance 26
center 218.9622802734375 0 36.82733917236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40149113557002647 0.6548880063155587 }
radiance 19
center 194.3743896484375 0 28.10075569152832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9043126889909195 0.35422566969652025 0.9637565275338379 }
radiance 25
center 232.78488159179688 0 41.8553466796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8689189892601059 0.49572125072583795 0.9807043945922888 }
radiance 21
center 254.76498413085938 0 34.43980407714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9385615241094258 0.4679983014157354 0.8107816137410814 }
radiance 20
center 257.9589538574219 0 72.28636932373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3331389308709529 0.4807533260715152 }
radiance 22
center 214.78993225097656 0 21.663593292236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6393088744225911 0.4102544770065703 0.9 }
radiance 26
center 192.08804321289062 0 45.78948211669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9541353698322415 0.37320079254435934 0.9918326283238896 }
radiance 16
center 254.51248168945312 0 80.2266845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9714759957763353 0.45380361829940996 0.9163153489487694 }
radiance 28
center 209.8289337158203 0 54.55030059814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7858401693240732 0.401292505088705 0.9 }
radiance 25
center 209.23843383789062 0 35.20192337036133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8078027288325739 0.42808403148854124 0.8988884894892479 }
radiance 23
center 260.2631530761719 0 43.83607864379883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7279908326602353 0.40320949708915016 0.9 }
radiance 25
center 247.2117462158203 0 45.31108856201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.815947739625311 0.4061812692505048 0.9424577898959565 }
radiance 28
center 246.387939453125 0 62.017093658447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38401736711922924 0.5429380664037893 }
radiance 18
center 237.2157745361328 0 71.87493133544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40333324123697645 0.664084458049513 }
radiance 31
center 207.27601623535156 0 69.23665618896484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8600568655273148 0.3685487479002465 0.9 }
radiance 20
center 219.73899841308594 0 46.9321174621582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.894272223441706 0.48189796205308066 0.8690193394790431 }
radiance 26
center 239.28952026367188 0 80.10078430175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8582809471301625 0.425717737130588 0.8339385470281528 }
radiance 20
center 224.4090576171875 0 33.641178131103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8523626421132107 0.4205034285066769 0.8538764254198025 }
radiance 20
center 201.21914672851562 0 60.72443389892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8300015085225017 0.3859079860428113 0.8957751494442444 }
radiance 19
center 203.6968536376953 0 64.17936706542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8261304769297113 0.3190782075804844 0.8160933783516255 }
radiance 29
center 237.32672119140625 0 73.59031677246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9443388578874915 0.44594635967536583 0.910040868104588 }
radiance 27
center 229.66555786132812 0 52.39177703857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9091406506502202 0.36210780868736503 0.8783884312380995 }
radiance 22
center 215.04017639160156 0 85.78465270996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8340850391639267 0.4743937407590644 0.9629647283417198 }
radiance 23
center 225.2259063720703 0 44.22154998779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9816203376780207 0.4987046062960593 0.9917652640016476 }
radiance 22
center 226.28749084472656 0 76.59393310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6147268012870755 0.3312913751338026 0.9 }
radiance 22
center 196.08042907714844 0 73.22759246826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9692995879950723 0.4553148157758756 0.8504141854988411 }
radiance 21
center 198.0316162109375 0 49.91242980957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4622371397852311 0.5916661754262517 }
radiance 17
center 215.83035278320312 0 44.36984634399414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9928500648602325 0.40160072856676265 0.9041345127242724 }
radiance 18
center 252.76507568359375 0 90.1318130493164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9348768736771523 0.3377024452658807 0.8071551204839802 }
radiance 21
center 244.4778289794922 0 56.40586471557617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8274766690423194 0.4932300668244255 0.9860241863802178 }
radiance 31
center 236.6426239013672 0 55.11511993408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.825126395966596 0.4167036792194616 0.8052329696726988 }
radiance 17
center 190.86239624023438 0 76.55242156982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9440241893685599 0.32214775971335635 0.8072610349036733 }
radiance 16
center 191.42999267578125 0 53.636322021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.877596148325163 0.38404149386936637 0.9930870067114272 }
radiance 23
center 243.6753692626953 0 47.5449333190918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46718553410951136 0.38991236952625763 0.9 }
radiance 25
center 223.0414581298828 0 33.694454193115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8155423031213047 0.3639093069790138 0.9916464306839439 }
radiance 18
center 218.28451538085938 0 96.22679901123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.578821269217091 0.4888622118368132 0.9 }
radiance 20
center 232.5277557373047 0 81.31492614746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42817356751357466 0.7824216803935324 }
radiance 27
center 230.6181182861328 0 45.39533615112305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8296422173796091 0.35241039348340175 0.9680953437767266 }
radiance 18
center 222.3253631591797 0 53.15079879760742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9618002877899293 0.39230414130820923 0.9558471172079381 }
radiance 20
center 236.02163696289062 0 106.29269409179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9502866117386587 0.37781389316386016 0.9145720794792718 }
radiance 17
center 226.709716796875 0 55.43853759765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44296227887183615 0.48065255987610833 0.9 }
radiance 21
center 221.08694458007812 0 47.6872444152832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.84171977440415 0.3488595556978738 0.8986503492630772 }
radiance 26
center 231.79476928710938 0 107.10330200195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9241038280907183 0.4479096995903915 0.9449567649764345 }
radiance 31
center 245.87319946289062 0 53.80035400390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9972809009738213 0.3078622017770714 0.8040195462037002 }
radiance 25
center 189.17172241210938 0 70.53327178955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9593903320906882 0.4539241890658757 0.996770737996745 }
radiance 19
center 233.18495178222656 0 57.09981918334961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9805820640440269 0.33972157625982735 0.9607420087454315 }
radiance 24
center 228.40383911132812 0 43.256011962890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9721297299158054 0.31600006931664665 0.9659553613334366 }
radiance 22
center 226.439697265625 0 108.65133666992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9063576423585628 0.336915181989434 0.8760735926975127 }
radiance 20
center 223.6456298828125 0 102.53616333007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8954750628619788 0.3283041845588733 0.8071307512049344 }
radiance 20
center 191.74609375 0 108.1279525756836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8147808167780339 0.4396133461561066 0.8676997592389736 }
radiance 25
center 221.5321807861328 0 88.21668243408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8055386823898802 0.4837948017361091 0.8193055647871363 }
radiance 28
center 212.9488525390625 0 99.87519836425781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9942015319558145 0.4803391560694625 0.9048945035633928 }
radiance 28
center 238.56349182128906 0 108.74319458007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47699685601518094 0.41688939876102904 }
radiance 23
center 186.5054473876953 0 60.46562576293945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7652361908527086 0.4082326627720452 0.9 }
radiance 31
center 207.29544067382812 0 42.58642578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41231624699257297 0.38137366561977737 0.9 }
radiance 20
center 185.5572967529297 0 78.19839477539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.954746930349833 0.46136418013141023 0.9283357232309392 }
radiance 17
center 216.1718292236328 0 60.61555099487305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9292956143827956 0.30148170149523 0.8230674084989515 }
radiance 26
center 193.7914276123047 0 97.96196746826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9908389238130517 0.4287197587689915 0.9629536838920927 }
radiance 28
center 201.5117950439453 0 68.45370483398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8323891766860703 0.3884234379168129 0.8657830019235205 }
radiance 20
center 222.49122619628906 0 90.75757598876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4280941724983003 0.6695588913914738 }
radiance 22
center 208.70697021484375 0 65.05593872070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.465966542673194 0.69209980204639 }
radiance 23
center 207.17440795898438 0 73.569580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8926368108716878 0.49321915962720214 0.9244187328535504 }
radiance 24
center 208.94207763671875 0 102.90860748291016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9987276819116133 0.3718396240554426 0.8972330838349031 }
radiance 20
center 219.24949645996094 0 81.49947357177734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5518874036842504 0.35568055292231393 0.9 }
radiance 26
center 196.0519561767578 0 107.8128433227539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8768986353436576 0.4099417523275015 0.9 }
radiance 16
center 193.6640167236328 0 53.37943649291992
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6390389273113696 0.49719891030380436 0.9 }
radiance 28
center 245.5124053955078 0 77.50090789794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9729846115109244 0.4319749307931084 0.9091520373458924 }
radiance 21
center 210.60064697265625 0 80.19402313232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8535599317077384 0.4967477970228594 0.867067870734891 }
radiance 24
center 240.11538696289062 0 88.8600845336914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.802142026666854 0.46611177918547647 0.8539074998462681 }
radiance 26
center 234.1791534423828 0 68.42375183105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9266091261583165 0.3033586269693333 0.8766323571020702 }
radiance 17
center 189.36155700683594 0 75.29878234863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.884634151225481 0.4935482724271576 0.8504344990877534 }
radiance 27
center 247.51876831054688 0 75.32789611816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.963890295778266 0.48731201456957185 0.9865517332042311 }
radiance 25
center 244.43014526367188 0 102.289306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8401899890174079 0.30477712300049575 0.9359006135824394 }
radiance 26
center 208.19760131835938 0 53.39664077758789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8849539597537242 0.3907060758242699 0.9519823614542581 }
radiance 24
center 206.7863311767578 0 61.3452033996582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8910723351113281 0.4508281900209312 0.9665217978136902 }
radiance 23
center 214.22613525390625 0 123.70584106445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717449020610488 0.48050414598597746 0.8184449090254831 }
radiance 22
center 194.25291442871094 0 127.38461303710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9721226516581127 0.30804608795204846 0.9110994901306084 }
radiance 28
center 215.9713592529297 0 127.51264953613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445664666124553 0.40594592965722365 0.831248360306656 }
radiance 25
center 224.42054748535156 0 110.92725372314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43430276860087924 0.44240304655039875 0.9 }
radiance 22
center 190.98193359375 0 99.06864166259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9913588554184893 0.4093646318885151 0.8716146041994209 }
radiance 17
center 231.38211059570312 0 125.4449234008789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3400930260366739 0.5158301792268293 }
radiance 27
center 184.74429321289062 0 132.0382843017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8862863668663667 0.38060719329127524 0.8618596399728674 }
radiance 21
center 175.9047393798828 0 98.69908142089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8586247817660108 0.32996974772003285 0.8077955501337333 }
radiance 22
center 175.95663452148438 0 110.77940368652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.882589241833981 0.3358118876698883 0.9777155483411566 }
radiance 19
center 194.39974975585938 0 111.56208801269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8854553027024639 0.33040147230707 0.8870314529873546 }
radiance 20
center 211.01513671875 0 72.32408142089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8465766417835928 0.38214022694029903 0.8448438391034686 }
radiance 30
center 180.7793731689453 0 97.94401550292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9317005886992459 0.36858441171308975 0.9227587418004911 }
radiance 24
center 210.48802185058594 0 111.28752899169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.908669562616231 0.46388999416496624 0.9766544668772942 }
radiance 16
center 178.0938720703125 0 112.36270904541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4135946557498661 0.4179525253110543 }
radiance 30
center 173.65089416503906 0 109.9770736694336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38686431660230514 0.4387282668041339 }
radiance 24
center 195.47872924804688 0 111.68903350830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9675927011145995 0.49931909694164023 0.8859791921255792 }
radiance 21
center 221.0679168701172 0 95.32957458496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8801998392817861 0.3639912250659733 0.9154503702060577 }
radiance 23
center 218.65206909179688 0 64.92636108398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9941896729405935 0.48498445709772986 0.9484446850816847 }
radiance 16
center 236.06011962890625 0 111.89253234863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8719137624614844 0.4620754632639121 0.882406590137571 }
radiance 20
center 176.3829803466797 0 82.50215148925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8762978413792681 0.4190420033200841 0.8663805211636674 }
radiance 22
center 190.17703247070312 0 78.11829376220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9558466151787257 0.45984003413088653 0.9640479101609182 }
radiance 17
center 182.7530517578125 0 121.52139282226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9283321555213138 0.44211982655171367 0.8669843716246531 }
radiance 27
center 210.33596801757812 0 111.84227752685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9200607724607601 0.36006117402865595 0.9560934079704834 }
radiance 26
center 191.43600463867188 0 91.54405212402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8000343214345341 0.4685867525153402 0.9 }
radiance 20
center 177.58660888671875 0 127.20629119873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9922559011235036 0.3276785482194185 0.9245781823225414 }
radiance 29
center 188.76861572265625 0 83.093017578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5081171174933197 0.3838526481971408 0.9 }
radiance 26
center 197.32394409179688 0 111.97537994384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.72219749482417 0.3721797872901278 0.9 }
radiance 29
center 176.35049438476562 0 86.02597045898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8330053642449653 0.48963814879124845 0.8694798840555229 }
radiance 30
center 227.20254516601562 0 134.04058837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834333555798155 0.48964041704342876 0.8041776360329252 }
radiance 24
center 218.43991088867188 0 124.04461669921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8430759278721575 0.3524912334310866 0.840761073457931 }
radiance 17
center 227.5243377685547 0 80.5400161743164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8555912301378434 0.4493418692509099 0.9150446741824944 }
radiance 19
center 177.79867553710938 0 98.5113525390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8534885449568679 0.4917662149867986 0.8861331278344304 }
radiance 16
center 184.9583740234375 0 86.17048645019531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7931552407135345 0.458692007007645 0.9 }
radiance 27
center 229.85986328125 0 131.46585083007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44148187133704775 0.4586787089005128 0.9 }
radiance 27
center 186.90916442871094 0 78.37147521972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4124059841297278 0.8908825446855964 }
radiance 30
center 173.8646697998047 0 94.55853271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8027535596500457 0.37601868558289275 0.9268478752763364 }
radiance 24
center 168.9593963623047 0 128.74327087402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6634538500199512 0.4397721038896686 0.9 }
radiance 31
center 199.84439086914062 0 102.32264709472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9318417571896322 0.3349550794116046 0.9559849508638998 }
radiance 16
center 191.21275329589844 0 122.13907623291016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8342246843078099 0.36761447957494603 0.827394079240096 }
radiance 16
center 223.12351989746094 0 94.66116333007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9550483982477553 0.32233363527496484 0.9335162026993964 }
radiance 23
center 192.52896118164062 0 89.1246109008789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8673765506913281 0.4082560776995168 0.9664841323750722 }
radiance 27
center 179.49749755859375 0 124.25473022460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4263606938786588 0.40560387494443173 }
radiance 28
center 195.01205444335938 0 149.5220184326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9947521655378354 0.43051435946806094 0.9092256990603177 }
radiance 26
center 223.05726623535156 0 111.522216796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9139221111671171 0.46061579792838314 0.883931787302469 }
radiance 23
center 198.2963409423828 0 121.4826889038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.852989986865332 0.47977398121720166 0.8916207026770827 }
radiance 26
center 163.03839111328125 0 143.95982360839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9590458380778324 0.35347547759014436 0.8468172735885614 }
radiance 21
center 194.8220977783203 0 109.61349487304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8853493541004427 0.45099456297282636 0.8150007188794353 }
radiance 28
center 174.77967834472656 0 151.82933044433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9435900029528016 0.49647878426248016 0.8388221963933588 }
radiance 29
center 221.09498596191406 0 124.18775939941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8726539766711839 0.35376406034113894 0.9653091926677225 }
radiance 22
center 164.11444091796875 0 94.73268127441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8239560626803142 0.4713649205791818 0.9 }
radiance 27
center 218.67059326171875 0 135.2020721435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9390817867954862 0.3491292709562985 0.8034847167524913 }
radiance 30
center 174.7860107421875 0 97.8152847290039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9888953133990553 0.3487985218387678 0.9241525925541499 }
radiance 24
center 190.54534912109375 0 149.1702117919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8316027265533377 0.3208204973316547 0.8213753194319636 }
radiance 31
center 184.51390075683594 0 144.73936462402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9943659920848751 0.31480892615015 0.8735916916767117 }
radiance 27
center 186.64955139160156 0 113.9258804321289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35724849726073354 0.48498626242638065 }
radiance 26
center 166.69564819335938 0 91.37153625488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8312214685177758 0.45877874329242785 0.9393342041676028 }
radiance 16
center 218.10755920410156 0 96.10458374023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9912231130912287 0.32027519764779755 0.9095283599055409 }
radiance 19
center 198.61866760253906 0 98.774658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8156727568860815 0.40273877118958323 0.8835088020639887 }
radiance 23
center 187.65939331054688 0 104.85004425048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9623371636959498 0.4838029689076946 0.9216210722933564 }
radiance 22
center 206.87046813964844 0 92.58323669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3253812591163046 0.4923628704255568 }
radiance 16
center 176.3808135986328 0 146.331298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8217211017367269 0.3591483350120939 0.9573365605089532 }
radiance 25
center 210.9787139892578 0 154.5040283203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9504148063055017 0.36125832184099554 0.824922581093142 }
radiance 24
center 162.7042236328125 0 162.56369018554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9126215573568524 0.43724783529154476 0.9842907029986958 }
radiance 20
center 195.2877960205078 0 133.16934204101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8257725016958816 0.30975908129658275 0.9149700096822246 }
radiance 20
center 198.54730224609375 0 123.5687255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.955108493699902 0.3312126851305293 0.9550888635464984 }
radiance 16
center 168.282470703125 0 157.68170166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9595144709696098 0.3921180830690527 0.9499724166915172 }
radiance 17
center 183.7285919189453 0 110.51467895507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4255970444611079 0.38860249383767814 0.9 }
radiance 25
center 218.20469665527344 0 133.52947998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8869512243292978 0.3150378505292641 0.8182466663667248 }
radiance 24
center 196.93685913085938 0 148.8208770751953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8298720592950241 0.4480985306533802 0.9 }
radiance 29
center 208.249755859375 0 123.0311279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8163328005920907 0.4126363291905504 0.8796558340523952 }
radiance 17
center 178.65394592285156 0 116.42305755615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9409220361687597 0.4199420091443089 0.9539571495622936 }
radiance 20
center 210.6204376220703 0 97.77336883544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8381353858290087 0.4444474964408013 0.924891328215018 }
radiance 27
center 177.018798828125 0 127.86341094970703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9620646724381141 0.45573256220740976 0.9522769851110514 }
radiance 20
center 166.1162109375 0 113.37117004394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130026777010187 0.34056774877970414 0.8513433787805499 }
radiance 19
center 214.36181640625 0 152.08615112304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8752155964834483 0.32336191256907065 0.8359597282096821 }
radiance 20
center 185.28225708007812 0 156.2200927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9184480642085402 0.3614327456308269 0.9955355344221452 }
radiance 21
center 208.3499298095703 0 105.54808807373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8253486197842415 0.4814633321509425 0.9407107636447769 }
radiance 27
center 170.72329711914062 0 143.88095092773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9982207557382012 0.4312974846147768 0.9174540316968288 }
radiance 26
center 197.8868408203125 0 161.77381896972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8438059736150694 0.4185787295330694 0.9172772820388417 }
radiance 22
center 216.49148559570312 0 133.917236328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.897340736180111 0.40483132365464164 0.8084687957473383 }
radiance 17
center 188.135986328125 0 110.61381530761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8245625127686929 0.4215511109271177 0.9977234960891862 }
radiance 18
center 192.3930206298828 0 170.647705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8313273869140945 0.35543318048613326 0.9892952163884018 }
radiance 23
center 184.97129821777344 0 118.01107025146484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3439580386732 0.5352397781431943 }
radiance 22
center 193.1264190673828 0 164.26507568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8306044247340578 0.37874783669363754 0.9050338687638688 }
radiance 22
center 181.69522094726562 0 130.04757690429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8741072964391132 0.3610926150877168 0.8856919168033952 }
radiance 25
center 162.90435791015625 0 108.0005874633789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9614632342519884 0.4966713801944848 0.8052089010280148 }
radiance 28
center 148.8633270263672 0 149.67637634277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8371164444766455 0.4464734309841655 0.8839153521647871 }
radiance 20
center 146.308837890625 0 145.745361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8787042921050607 0.44081010499676254 0.8910863376364573 }
radiance 31
center 170.35601806640625 0 122.09832000732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.902817068135406 0.3563075325833951 0.9719820821430885 }
radiance 27
center 209.0204315185547 0 169.05101013183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9310525071213255 0.40677354217393813 0.8460070672733708 }
radiance 18
center 205.1660919189453 0 164.70787048339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6363772198429186 0.31704585248574035 0.9 }
radiance 31
center 146.5671844482422 0 137.0249786376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9184522370183842 0.3043807481357305 0.9167284448531143 }
radiance 30
center 156.85733032226562 0 125.93283081054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9933193226321437 0.4576606544201235 0.8269610955640051 }
radiance 26
center 154.9486541748047 0 148.53114318847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9020881709055608 0.37720338047262136 0.9722624074108415 }
radiance 20
center 156.37477111816406 0 168.07803344726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6606010466859192 0.38580606819317004 0.9 }
radiance 19
center 181.66055297851562 0 138.631591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48750241172749775 0.7916480975596029 }
radiance 20
center 204.1216583251953 0 154.1390380859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9995276102680783 0.43512661854521206 0.9681105427457487 }
radiance 24
center 161.0625762939453 0 125.97216033935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6841453754457837 0.3457685383143418 0.9 }
radiance 20
center 187.42198181152344 0 129.61373901367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5392151616866295 0.32425419424380175 0.9 }
radiance 29
center 181.7162322998047 0 123.78587341308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8710419484643241 0.4519598461127131 0.8522361675774156 }
radiance 20
center 173.8721160888672 0 138.1874237060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30038508776539913 0.6334522968436768 }
radiance 24
center 165.35621643066406 0 168.338623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8222317910657756 0.4769982210756347 0.851433145337349 }
radiance 22
center 196.86778259277344 0 127.0149154663086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36346266771937663 0.825220877267583 }
radiance 30
center 162.94754028320312 0 139.5115966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48803825684367985 0.8876900889513095 }
radiance 27
center 151.89617919921875 0 180.71177673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3215506110253721 0.5950318970551921 }
radiance 24
center 175.0146942138672 0 141.03468322753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9511216552413134 0.40882613921334277 0.9732910653933958 }
radiance 20
center 147.85086059570312 0 146.05113220214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8273807213726477 0.40337649628380257 0.8662533531695328 }
radiance 19
center 184.1263427734375 0 170.15284729003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8041750187441759 0.3473586187292235 0.9232763317553707 }
radiance 18
center 152.0344696044922 0 133.1298370361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4101718843871761 0.49403655342761177 }
radiance 29
center 184.7200927734375 0 143.70187377929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47811109576800637 0.6587501146480365 }
radiance 25
center 145.85496520996094 0 160.0171356201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8840845467776175 0.4404921273816884 0.9127539685113258 }
radiance 27
center 149.84170532226562 0 161.99114990234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.580022991761185 0.4017710058572936 0.9 }
radiance 25
center 195.6039276123047 0 136.35452270507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4566598315085199 0.705355061509443 }
radiance 18
center 145.38206481933594 0 135.0456085205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9768279023218486 0.42912478492904504 0.891159732414607 }
radiance 30
center 191.49916076660156 0 178.66453552246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8429825419308992 0.48503990220463233 0.9371965648387578 }
radiance 22
center 168.2173614501953 0 171.98155212402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34797875000805845 0.7773123048649409 }
radiance 29
center 144.06700134277344 0 121.33889770507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3312005486571023 0.7086598602812006 }
radiance 30
center 153.6781768798828 0 119.99601745605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5904019996929855 0.441739939567091 0.9 }
radiance 29
center 141.618408203125 0 148.33079528808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8230421834585286 0.442340379338782 0.8635114124307329 }
radiance 16
center 194.61744689941406 0 131.9079132080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8982518174866907 0.3459761798601616 0.9788549637360521 }
radiance 24
center 131.1359405517578 0 139.22268676757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8836513895362902 0.3266409926359922 0.8851398540844602 }
radiance 16
center 125.77464294433594 0 172.6936492919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8927808041126796 0.4024716041399087 0.9402416553587464 }
radiance 30
center 183.87844848632812 0 189.786865234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6435908555955554 0.38068738354778486 0.9 }
radiance 23
center 120.62235260009766 0 179.83013916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9311162724653634 0.38691559621860494 0.9962500611057317 }
radiance 31
center 176.76063537597656 0 147.33441162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.848656915313801 0.31496586619925904 0.9626459364132283 }
radiance 20
center 122.74456024169922 0 145.67056274414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.878498499015629 0.49136161336848416 0.8708760074786946 }
radiance 22
center 181.8955535888672 0 184.92054748535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8085539824184904 0.46843945635058937 0.8398612417405837 }
radiance 23
center 179.38430786132812 0 185.2876434326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9139038085352508 0.3844310511240403 0.8962322617029349 }
radiance 31
center 164.73956298828125 0 155.45582580566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3109174291165124 0.693937068216392 }
radiance 20
center 148.7679443359375 0 129.4184112548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8964236935474075 0.34142999559733306 0.9 }
radiance 24
center 180.55186462402344 0 160.16775512695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9117226799938513 0.4508939404013367 0.8697108467583992 }
radiance 30
center 180.77500915527344 0 148.61117553710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9684088509321048 0.4560260535601205 0.9456713034263127 }
radiance 31
center 126.09490966796875 0 189.83328247070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9530848073816053 0.35524126174759263 0.8633781238925422 }
radiance 26
center 142.62704467773438 0 133.95770263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8033366927194819 0.3554780521738118 0.8980098784640299 }
radiance 30
center 130.92735290527344 0 172.82765197753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8127918047426206 0.452571587947058 0.9614188039746328 }
radiance 22
center 142.4095916748047 0 185.2469482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8516043342678481 0.3952323539098175 0.9 }
radiance 26
center 168.97926330566406 0 185.9635467529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.85208847909035 0.46145425453628797 0.9563898633522696 }
radiance 24
center 155.1999053955078 0 136.28897094726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8360825930263458 0.4940376847516529 0.8879303133850976 }
radiance 19
center 171.30975341796875 0 169.18536376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9382430382767804 0.46773809058188265 0.8912735264384166 }
radiance 17
center 184.01382446289062 0 173.9020538330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9083939716114688 0.49236942259287136 0.9820647594408047 }
radiance 22
center 159.03294372558594 0 181.0584716796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9254362951024837 0.42156314370633197 0.943651157950081 }
radiance 30
center 157.90377807617188 0 185.47073364257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9647460109260932 0.32410749520664056 0.8267296408497938 }
radiance 31
center 110.65337371826172 0 179.31956481933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8892870451018579 0.43861304365857545 0.8028464756255697 }
radiance 19
center 123.09001922607422 0 202.34918212890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7015163540245531 0.3208671288087886 0.9 }
radiance 26
center 117.45370483398438 0 160.54605102539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9209496003176391 0.31870532539186686 0.8101867837536185 }
radiance 19
center 136.3435516357422 0 152.55029296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9966055359180206 0.400107302333211 0.9913580788826782 }
radiance 26
center 142.31790161132812 0 144.37542724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8601791570812505 0.3573278614456331 0.888824616660086 }
radiance 26
center 160.7042999267578 0 149.48748779296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9208647654613056 0.39343311594453856 0.8446106586135157 }
radiance 19
center 115.35614776611328 0 151.28469848632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47699800138077986 0.8000816182421379 }
radiance 18
center 150.875732421875 0 157.02618408203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9167683197334656 0.38960435774312424 0.9461788742022397 }
radiance 19
center 151.4974822998047 0 155.94920349121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9029236476337792 0.4435280595563702 0.8787623953881556 }
radiance 27
center 113.79357147216797 0 167.8509979248047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8807629453234566 0.42877625103853323 0.9 }
radiance 25
center 111.1716079711914 0 183.7530517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8154138712756799 0.32608177971037594 0.9019452218696938 }
radiance 27
center 164.5260772705078 0 166.86398315429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9408299029046048 0.4599571194706412 0.9865757128365374 }
radiance 19
center 122.37516784667969 0 179.67718505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9679595045618382 0.35997732140031086 0.8379610726401171 }
radiance 19
center 159.09014892578125 0 163.5054473876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8158585730387263 0.44882641507074117 0.8621905059491679 }
radiance 22
center 140.83287048339844 0 194.15011596679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34139975186641885 0.546046278607045 }
radiance 31
center 164.97579956054688 0 178.58197021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9388302769439694 0.43606449402281344 0.8997953999887252 }
radiance 26
center 109.47730255126953 0 192.04949951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9207743024866027 0.44559188890694124 0.9706766426916933 }
radiance 18
center 153.88510131835938 0 162.3612060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8556665486064182 0.4903484805801803 0.8993247314629077 }
radiance 27
center 118.90215301513672 0 159.591064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8066920659565593 0.42853768161449723 0.9316530750122258 }
radiance 27
center 147.3314666748047 0 199.31610107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6461050399590749 0.3809555839595835 0.9 }
radiance 28
center 135.46070861816406 0 198.15406799316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.932277014814156 0.4165014318769178 0.958789393313484 }
radiance 30
center 146.7347412109375 0 200.50852966308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5859044682776208 0.42722389634798785 0.9 }
radiance 19
center 148.20851135253906 0 158.15969848632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.902754954863028 0.30365489566526094 0.9956173298363393 }
radiance 30
center 126.16275787353516 0 180.85032653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.982565170457031 0.37008807822794204 0.9742526908403327 }
radiance 22
center 122.42972564697266 0 177.48619079589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9253196082269856 0.4192282424401107 0.8540673562263057 }
radiance 24
center 101.95223236083984 0 191.85369873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8188013838622463 0.4486037958805954 0.8646672921577664 }
radiance 29
center 125.40943908691406 0 174.78549194335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7108807018991604 0.3205745854845336 0.9 }
radiance 26
center 150.4045867919922 0 194.41539001464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3324291306404071 0.6140389835753737 }
radiance 25
center 115.97013092041016 0 167.57896423339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4557560867398097 0.36175503648588125 0.9 }
radiance 16
center 109.77002716064453 0 169.52064514160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8389018196665516 0.36032415471128104 0.9784281682913186 }
radiance 18
center 145.2501678466797 0 165.7158966064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8785775861946318 0.4753410000510594 0.8217189344654339 }
radiance 26
center 131.9520721435547 0 186.56565856933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.886247151690507 0.43802634754513553 0.9283227231106755 }
radiance 16
center 153.50466918945312 0 210.0175323486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46410889490506824 0.48123330757700455 }
radiance 17
center 95.14879608154297 0 168.73831176757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6326104484847819 0.4095462645101051 0.9 }
radiance 19
center 136.36373901367188 0 205.01480102539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3004897330115586 0.766168879751794 }
radiance 29
center 142.3828125 0 152.34747314453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9767235695704972 0.41899111990798493 0.8938926041591844 }
radiance 20
center 136.78219604492188 0 158.1253662109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8572385316821594 0.3132843578876084 0.8973761604928473 }
radiance 19
center 132.60675048828125 0 149.8923797607422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4597735357944134 0.577472740065762 }
radiance 28
center 117.74981689453125 0 215.75753784179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3457931185543221 0.6910940794664439 }
radiance 23
center 116.69639587402344 0 163.36317443847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4967257886901286 0.5940292550450904 }
radiance 30
center 104.73561096191406 0 168.00123596191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8017136237352204 0.4550587344038518 0.8403068404971255 }
radiance 19
center 101.63227081298828 0 174.15972900390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3879605906542597 0.552898706849292 }
radiance 30
center 109.65933227539062 0 177.91989135742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8266427730786007 0.4091756470436182 0.9151754807345731 }
radiance 28
center 109.92575073242188 0 185.22366333007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8637333138820051 0.42844773496501776 0.9182248173427993 }
radiance 24
center 85.10060119628906 0 180.63902282714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9672311739649989 0.3032445291149597 0.865709421508952 }
radiance 30
center 96.66452026367188 0 156.40769958496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.694221863616607 0.3752808684397382 0.9 }
radiance 30
center 120.25872802734375 0 161.10284423828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7466515006294691 0.4974256998406014 0.9 }
radiance 31
center 117.91458892822266 0 186.96115112304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8158603590307167 0.46973332537055934 0.8399458249411526 }
radiance 31
center 105.44351196289062 0 191.86679077148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9552479805839712 0.42213008724583556 0.982773878375456 }
radiance 26
center 136.4922332763672 0 172.5338897705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8396279188811608 0.4527774059421459 0.9133712763397195 }
radiance 23
center 128.7096710205078 0 175.35064697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9859949146332452 0.3022678036392951 0.8568229380647743 }
radiance 24
center 130.81597900390625 0 158.22425842285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4702006471098107 0.779174276607713 }
radiance 31
center 75.08055114746094 0 188.119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33013829463306926 0.7837053510738722 }
radiance 27
center 134.95626831054688 0 196.69284057617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.929016731069372 0.4470406184626 0.8876247196170695 }
radiance 25
center 130.25958251953125 0 215.08462524414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9093270737721599 0.3764054557052794 0.9170139732209213 }
radiance 21
center 91.67504119873047 0 211.43798828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8890487281461016 0.3657841045108343 0.88980218283243 }
radiance 16
center 129.02622985839844 0 155.49278259277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8750805635051753 0.42115755688657097 0.9216463182245299 }
radiance 25
center 86.77954864501953 0 183.09490966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7894733112137637 0.36943460801119954 0.9 }
radiance 30
center 76.63725280761719 0 169.5852813720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8059624328031081 0.3614116226367054 0.954423783166601 }
radiance 30
center 78.20272064208984 0 167.8302459716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9815398638432432 0.4626420612102301 0.9107003833237994 }
radiance 16
center 81.4697036743164 0 181.08595275878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39607943593148576 0.7708942439839933 }
radiance 21
center 68.02177429199219 0 183.62745666503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8626790799026115 0.48703351132648914 0.9578216366445116 }
radiance 23
center 104.84821319580078 0 199.00636291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6190951186057785 0.3763074939976087 0.9 }
radiance 26
center 62.631561279296875 0 217.38731384277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.314997536334053 0.4302695010056803 }
radiance 22
center 105.31865692138672 0 170.56494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33010202312812514 0.673897907669905 }
radiance 18
center 62.16508865356445 0 174.51571655273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9857716409078359 0.41643370220833287 0.8385040895109106 }
radiance 26
center 108.53701782226562 0 161.794189453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9195201578618403 0.46227037281096783 0.870454868434202 }
radiance 20
center 61.104434967041016 0 189.26739501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4391333790251083 0.6157063254084987 }
radiance 30
center 60.9010124206543 0 216.98190307617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.856465095786821 0.33658140399029485 0.9781712530887294 }
radiance 19
center 62.7650260925293 0 216.38392639160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8871778403168755 0.3018030714366758 0.8670439304091933 }
radiance 22
center 78.73744201660156 0 193.48733520507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8319730756235597 0.33845330666766454 0.9519047923310135 }
radiance 17
center 62.86040496826172 0 182.88864135742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36507798203976616 0.5157060500867675 }
radiance 24
center 104.68968963623047 0 179.79083251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8904338708203898 0.360519135941098 0.8214461979694405 }
radiance 29
center 67.05696105957031 0 189.06236267089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9379833245865099 0.37970304571039915 0.9653964541939821 }
radiance 22
center 102.3219223022461 0 162.5494842529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9489066757935896 0.4207961991133402 0.8994465921947472 }
radiance 19
center 101.50511932373047 0 212.6470947265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9165564408254695 0.3494626979452773 0.9277488461399089 }
radiance 24
center 118.7044906616211 0 173.09352111816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5775075700057184 0.3470223809480603 0.9 }
radiance 27
center 70.54257202148438 0 162.7935791015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.802237651660009 0.35138598008474703 0.9050025509235591 }
radiance 31
center 95.34305572509766 0 182.71665954589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9393159621830003 0.3179548278213731 0.9983539918575389 }
radiance 18
center 49.288597106933594 0 202.9241180419922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9338096347011664 0.4399042230377394 0.8455519996314228 }
radiance 28
center 94.19866180419922 0 204.6223602294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8282718450148052 0.4697233020200783 0.8370680230154355 }
radiance 30
center 63.2132568359375 0 185.25999450683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8141452223156335 0.351945739669769 0.8959066917778704 }
radiance 26
center 69.9227294921875 0 189.27621459960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8230171593200167 0.41343184560654167 0.9446989473386719 }
radiance 24
center 57.1762809753418 0 190.0845489501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9208838956419185 0.4733228073069695 0.8213399622627819 }
radiance 22
center 87.89019775390625 0 204.3130645751953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8735265528845141 0.3861439682179564 0.9362960249088805 }
radiance 19
center 71.21852111816406 0 168.04420471191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9220041431413952 0.3463277496899775 0.9787198362642588 }
radiance 21
center 83.39753723144531 0 219.60267639160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8956068646924779 0.416200071059187 0.9247830267656819 }
radiance 17
center 98.42096710205078 0 178.77462768554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8063563137532175 0.43573872178012163 0.8353921600577602 }
radiance 24
center 86.87671661376953 0 200.04832458496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8255042589981114 0.31739339011099515 0.9985307927229421 }
radiance 28
center 57.3995475769043 0 194.5769805908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3938048089442703 0.7600872677726193 }
radiance 28
center 70.91018676757812 0 202.9565887451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4693554537389162 0.3400686232776408 0.9 }
radiance 28
center 99.92642211914062 0 174.87637329101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8438025621128993 0.42733488057775704 0.9512703972517293 }
radiance 22
center 101.19771575927734 0 167.4889373779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44623283811095693 0.6233515874547647 }
radiance 26
center 40.51235580444336 0 171.6690216064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.933931822717142 0.3013054477400697 0.8471582209039958 }
radiance 25
center 53.11786651611328 0 168.36080932617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9576955041587367 0.41201367156152835 0.8240103366922009 }
radiance 27
center 53.3118896484375 0 184.96548461914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9851312833933887 0.3230325563536491 0.8826035681665532 }
radiance 18
center 88.92153930664062 0 206.1394805908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8111804531895449 0.3552144737858577 0.9959264454387986 }
radiance 23
center 59.194210052490234 0 211.45069885253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46744765774619296 0.5249941361229417 }
radiance 19
center 41.83821487426758 0 189.0268096923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9706216111629947 0.35862520326027975 0.8043492116661817 }
radiance 28
center 50.175846099853516 0 208.26156616210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8051626614904807 0.44285910225787173 0.8432282305894845 }
radiance 17
center 66.76498413085938 0 181.4110107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9307595751151123 0.4739778128839306 0.874406031404084 }
radiance 16
center 45.8768196105957 0 173.91445922851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8821988174320645 0.40537306845486165 0.8831041979138927 }
radiance 22
center 66.078369140625 0 180.63742065429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9971657551296766 0.38168556871702397 0.8880566577721601 }
radiance 25
center 40.841121673583984 0 218.29322814941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9597752866757212 0.3104395777435052 0.9389055630512713 }
radiance 25
center 43.09015655517578 0 212.5840606689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7949243644207368 0.32026882094650067 0.9 }
radiance 21
center 32.308937072753906 0 179.51278686523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9951876082672371 0.32697434058294234 0.8941621885557514 }
radiance 28
center 71.82371520996094 0 216.77137756347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9708529906301702 0.32894937771306504 0.961678660351033 }
radiance 31
center 40.71522903442383 0 170.86965942382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7503331466227462 0.3526083025368046 0.9 }
radiance 18
center 30.96001625061035 0 227.40635681152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.877028448824743 0.46846213217041377 0.9264839936133544 }
radiance 19
center 21.91761589050293 0 178.80567932128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7036679236758496 0.3384699387510105 0.9 }
radiance 18
center 35.01459884643555 0 198.044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9137896843807185 0.3001518583877288 0.9005813346890303 }
radiance 28
center 72.71290588378906 0 183.64340209960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9213239470194681 0.48573410671329453 0.8757925016577451 }
radiance 21
center 71.54232788085938 0 208.75619506835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43269426987702764 0.4201677339478488 }
radiance 24
center 23.900915145874023 0 207.0832061767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31259831467053206 0.40967944783392085 }
radiance 31
center 34.34510040283203 0 193.53924560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9520875217894076 0.4064123295101887 0.9537424565157917 }
radiance 19
center 26.952009201049805 0 189.3113250732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8327519195678478 0.4303366041524749 0.8396120934306125 }
radiance 24
center 32.272701263427734 0 180.39767456054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8669941594467496 0.4531979440914017 0.9502332372417474 }
radiance 31
center 51.35307693481445 0 181.2224578857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44924039193976306 0.44877618389812546 }
radiance 16
center 22.8756103515625 0 203.23619079589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8176501611980316 0.35892875643303107 0.9 }
radiance 31
center 24.802644729614258 0 227.73336791992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44488296533043437 0.49329582212541545 0.9 }
radiance 27
center 24.46493148803711 0 208.21641540527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7757363735608316 0.4124840114210184 0.9 }
radiance 26
center 38.686279296875 0 209.118896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205247464867485 0.3849587101906417 0.9070067799788996 }
radiance 27
center 21.85492706298828 0 187.97645568847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9399837687339927 0.4970896498143009 0.8379689014067383 }
radiance 26
center 16.23183250427246 0 179.6824188232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9142573606396008 0.321845645768752 0.8729809499656263 }
radiance 27
center 26.836790084838867 0 173.52708435058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9749076831894656 0.4752240822163324 0.958389091213812 }
radiance 17
center 27.568649291992188 0 173.63247680664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7984464609029571 0.44446772795007183 0.9 }
radiance 16
center 55.359954833984375 0 201.8468475341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8582360560177296 0.3912367306513198 0.9 }
radiance 19
center 12.527298927307129 0 217.988525390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9810342176068827 0.3612246719628811 0.9941683367230104 }
radiance 27
center 53.040687561035156 0 195.1804962158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.855140207498694 0.34429726648027936 0.8426817012305896 }
radiance 17
center 60.85177993774414 0 227.31478881835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8724368939816891 0.3853006874920022 0.8817703432533968 }
radiance 24
center 30.892927169799805 0 189.8180389404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3022358547927278 0.6712106431184486 }
radiance 22
center 52.86174774169922 0 209.08331298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5310769062090096 0.3264417837073732 0.9 }
radiance 24
center 12.610108375549316 0 181.3348388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9810734717054339 0.4732694690654742 0.9120029622680381 }
radiance 25
center 30.494449615478516 0 172.94692993164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9624154594417973 0.4329798989134965 0.8880985402017433 }
radiance 23
center 15.091695785522461 0 177.41409301757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9736806140140911 0.49754096087246563 0.8698161307514325 }
radiance 18
center 11.785667419433594 0 188.69190979003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9279789131175429 0.43171284491574624 0.90017715073386 }
radiance 31
center 49.38020706176758 0 228.29507446289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3149695167140877 0.6393123297968495 }
radiance 21
center 11.0640869140625 0 187.04306030273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9218995700771085 0.45381218418979785 0.9440650569250368 }
radiance 30
center -2.0503551959991455 0 169.7388916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9825643625581449 0.432139490390349 0.949444365231331 }
radiance 24
center 6.599468231201172 0 209.30955505371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4714651671641308 0.3266324572195478 0.9 }
radiance 31
center 33.206722259521484 0 203.66896057128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8526352485509763 0.39339789866816066 0.9253713764320343 }
radiance 16
center 35.602542877197266 0 198.12435913085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8747081080433394 0.4924989496068032 0.8505022392218512 }
radiance 28
center 44.28458023071289 0 176.79360961914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32685651607877647 0.6278224248124455 }
radiance 21
center 32.09014129638672 0 173.80615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5057097439735359 0.44263948358361216 0.9 }
radiance 22
center 13.101282119750977 0 191.04840087890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8225080802083493 0.3318570500326702 0.9187373004175164 }
radiance 16
center 25.991243362426758 0 198.80711364746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8186931047199799 0.3125436948260798 0.8383743682441473 }
radiance 20
center 22.866342544555664 0 209.08529663085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.88184157837844 0.36299314911172564 0.9518121520105347 }
radiance 26
center 6.728953838348389 0 216.10385131835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8694833739946148 0.4853527455926167 0.8973115905162496 }
radiance 16
center 38.31015396118164 0 172.6855926513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717950617334005 0.3468813248148113 0.8261131104798298 }
radiance 28
center 8.9591703414917 0 188.45144653320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.495358270713834 0.3182885037123554 0.9 }
radiance 19
center 46.91590118408203 0 210.4943084716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8585767904719604 0.41381435314599657 0.9627406500149323 }
radiance 18
center 43.34036636352539 0 207.08612060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8982927589200977 0.35269706351259 0.9683324325462537 }
radiance 17
center -10.93246841430664 0 206.18118286132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4278626844514539 0.33127098518462256 0.9 }
radiance 17
center 36.33071517944336 0 214.56312561035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8219206939770523 0.36593992413633214 0.8246479269086325 }
radiance 21
center -4.576966762542725 0 190.93650817871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8873947974321893 0.4111442770725463 0.9224874617466526 }
radiance 26
center -3.148468255996704 0 204.7301483154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8471672550140688 0.3165664113591576 0.9735392337840552 }
radiance 27
center 24.308073043823242 0 183.14398193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9834218437751848 0.4102207652409571 0.9923400053230843 }
radiance 29
center 16.29041290283203 0 174.32090759277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9112839346740901 0.30364021413036635 0.8947911504412107 }
radiance 20
center -14.302824020385742 0 205.40658569335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9897808326288813 0.3397641772443174 0.8090094697375645 }
radiance 23
center 10.853930473327637 0 209.91734313964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9409629834281261 0.37550940936149985 0.9475481082656559 }
radiance 25
center 5.17961311340332 0 187.1879425048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7140240531033994 0.41320732245531433 0.9 }
radiance 17
center -6.3501176834106445 0 174.4281005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8819986952389607 0.49357224134120087 0.9 }
radiance 19
center 6.111033916473389 0 173.65794372558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5711155000116712 0.4683682737293301 0.9 }
radiance 20
center 7.5314507484436035 0 179.72755432128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33039809568669076 0.47402017012992337 }
radiance 23
center 0.3585463762283325 0 218.9723358154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9959376038676325 0.4109630287554614 0.8949255459464449 }
radiance 26
center -1.1727948188781738 0 201.6552276611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8968175091556985 0.4318741267112416 0.9388975026033959 }
radiance 31
center -22.174631118774414 0 208.95094299316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8979039209604615 0.37132150465462405 0.994098595981447 }
radiance 19
center -24.174413681030273 0 195.44265747070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8761081151470911 0.3901018084408071 0.8550854362916223 }
radiance 31
center 19.947389602661133 0 189.83840942382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8849957847962333 0.4513134093597875 0.9 }
radiance 27
center -16.853042602539062 0 224.88616943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3966568651317035 0.5694470157406399 }
radiance 20
center 21.690603256225586 0 166.43106079101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5677252404690039 0.3769857808288055 0.9 }
radiance 16
center -1.476309061050415 0 214.26800537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8453072514221165 0.4591995885635276 0.9367428578359902 }
radiance 23
center -20.68454360961914 0 199.15496826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3186713550614976 0.8465089903368336 }
radiance 28
center 6.150605201721191 0 181.8187713623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8568706139527703 0.4686445261557399 0.80593270097599 }
radiance 24
center -20.59756088256836 0 218.83216857910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8646726526591145 0.4202307787303194 0.960016219779991 }
radiance 21
center 1.6375904083251953 0 215.45179748535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9345044849672925 0.3715451999557924 0.8618554739575613 }
radiance 25
center 22.52566909790039 0 220.04266357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3806630663156702 0.4003285112549031 }
radiance 16
center 5.820622444152832 0 192.8564910888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9056255244172908 0.39398894301498577 0.9137800069788022 }
radiance 16
center -38.246246337890625 0 211.6605682373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4677699217247475 0.33396488880029257 0.9 }
radiance 26
center -41.166893005371094 0 202.43069458007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8428536468154523 0.4963807949940819 0.8193093440605109 }
radiance 28
center -5.047484874725342 0 207.09397888183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4493053028250781 0.748424621562498 }
radiance 28
center 10.99833869934082 0 188.26919555664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4475557451661385 0.41611604327015506 0.9 }
radiance 26
center -21.2723388671875 0 220.39712524414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9244274413322663 0.3263393907934892 0.8876590294769414 }
radiance 27
center -16.351558685302734 0 218.04782104492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8860189694402008 0.4632021181746454 0.9051520284755432 }
radiance 24
center -43.665138244628906 0 178.6611785888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49260671486950824 0.8675784555945727 }
radiance 23
center -29.141496658325195 0 204.90481567382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9644409821709645 0.332067571321149 0.9974126850858142 }
radiance 22
center -27.199005126953125 0 170.1037139892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4872073254810573 0.47140473051208465 }
radiance 27
center -23.646799087524414 0 184.58273315429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8745629494883085 0.46697277850250285 0.9931499835100883 }
radiance 23
center -9.591431617736816 0 180.61288452148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7687749670697541 0.4585359246488865 0.9 }
radiance 23
center 2.9017951488494873 0 220.0958251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5568039476240364 0.3818699764145941 0.9 }
radiance 22
center -7.655667781829834 0 168.58621215820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6452251866396193 0.31122018315630345 0.9 }
radiance 21
center -4.539501667022705 0 189.65689086914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46625906999621725 0.3670778703521826 0.9 }
radiance 16
center -26.07109260559082 0 195.4879913330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9079880523968874 0.4770377458706051 0.8557902647153253 }
radiance 16
center -10.833197593688965 0 218.27545166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9550214956656411 0.3129637931559192 0.933029475527503 }
radiance 22
center -35.17267990112305 0 213.15505981445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4298540250574007 0.6454742000052441 }
radiance 19
center -34.532928466796875 0 180.5643768310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9951332723408469 0.3486480748756585 0.9054110919489418 }
radiance 27
center -10.838563919067383 0 206.4158935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.935624910570275 0.3227920461815471 0.8581723184949569 }
radiance 17
center -31.687660217285156 0 217.11573791503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9603991142839735 0.42767286764926027 0.9741239296338334 }
radiance 19
center -59.668113708496094 0 162.2350311279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9308397953564492 0.38370930897179617 0.8683899058958976 }
radiance 19
center -23.940340042114258 0 161.65093994140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.861833236302898 0.43902550706677723 0.8340309569539243 }
radiance 28
center -50.976600646972656 0 169.4393768310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4320137606605134 0.5658568125033866 }
radiance 23
center -38.23938751220703 0 212.41358947753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8147275094927494 0.4942422192463255 0.9047915130196568 }
radiance 25
center -53.604007720947266 0 210.03759765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.87096511995177 0.3948664614634104 0.8627752492423744 }
radiance 17
center -14.533439636230469 0 174.16058349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8493430458370459 0.47479670708391764 0.870047122559049 }
radiance 26
center -10.85447883605957 0 207.8529052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8007616417585667 0.46632809614812165 0.8111801921333628 }
radiance 18
center -58.186073303222656 0 193.34967041015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9562160461712268 0.4880437198843388 0.8239283092151242 }
radiance 18
center -4.99493408203125 0 182.88673400878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8443112603475567 0.31555539427283735 0.9803522331932757 }
radiance 24
center -4.321037292480469 0 204.68402099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.967742445068678 0.3434040018141689 0.9340547371294406 }
radiance 29
center -48.34165954589844 0 160.34706115722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4259458422365895 0.44952334542157557 }
radiance 31
center -19.788984298706055 0 164.8529815673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9329549901659437 0.3444948136345258 0.910684203999921 }
radiance 18
center -52.12715148925781 0 161.87205505371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45074910387488776 0.47404065937393014 0.9 }
radiance 21
center -44.300987243652344 0 191.4052276611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9582821948221216 0.4442008772783266 0.96584398524537 }
radiance 21
center -25.464454650878906 0 213.1749267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33396433886148197 0.6481364893046979 }
radiance 23
center -19.373754501342773 0 161.5146942138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4610799709661221 0.4507932504691291 }
radiance 18
center -48.83071517944336 0 178.82550048828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8953864738670696 0.33568820773834435 0.8668226214909861 }
radiance 23
center -20.674415588378906 0 201.0504913330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.883971832041504 0.3944818955450652 0.8478073104740627 }
radiance 22
center -40.129493713378906 0 203.48048400878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47285736563981995 0.6366285001959353 }
radiance 20
center -58.46419143676758 0 187.55255126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108270934445071 0.4274716693735443 0.9123706329792481 }
radiance 21
center -32.43513870239258 0 167.24513244628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9158985668687456 0.3965394947479317 0.8375518738732083 }
radiance 24
center -24.185321807861328 0 164.9425506591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9017671517109112 0.3011238158681257 0.8804245493131901 }
radiance 28
center -31.977951049804688 0 196.9279327392578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6413198639694955 0.42926027993471005 0.9 }
radiance 16
center -23.75269317626953 0 196.18695068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8404367903544753 0.3921140623720374 0.9092158921934906 }
radiance 18
center -58.89845657348633 0 156.95338439941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4460576053431877 0.5964136021092264 }
radiance 25
center -20.921287536621094 0 167.85511779785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41011103788045933 0.7210981524098 }
radiance 25
center -62.54841232299805 0 166.8310089111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9049890151283972 0.43834069512311963 0.8214345445295305 }
radiance 22
center -29.40812110900879 0 202.3763427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8323133052424838 0.4598013639528735 0.810101779184867 }
radiance 18
center -74.13274383544922 0 165.40838623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7754184440745817 0.3611366316158971 0.9 }
radiance 22
center -21.968740463256836 0 166.6873016357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8770569755587777 0.4692637523999982 0.8039492086668166 }
radiance 25
center -65.38823699951172 0 178.69110107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8005958674569005 0.3413649482177511 0.8774081541448244 }
radiance 22
center -33.8624153137207 0 157.6542205810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8977898223418331 0.4211741750216988 0.9450563219800934 }
radiance 22
center -51.25484085083008 0 152.50491333007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9246855921060454 0.3060223675839493 0.9429537460373728 }
radiance 24
center -69.0204086303711 0 184.0886993408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9576347334499072 0.45616119502174257 0.8286931015582486 }
radiance 22
center -19.044837951660156 0 200.87387084960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4223535476739012 0.3572298087126956 0.9 }
radiance 25
center -27.079030990600586 0 168.95213317871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9109524689654459 0.4094160036696298 0.8657373391553493 }
radiance 21
center -74.58171844482422 0 206.52947998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8400880884616388 0.4714044103558794 0.8887758067751864 }
radiance 31
center -30.080385208129883 0 148.72573852539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.869036662346707 0.30200706373059105 0.9 }
radiance 28
center -49.53462600708008 0 203.0375213623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9603732611072381 0.380080091922564 0.9058963886143071 }
radiance 28
center -61.20935821533203 0 155.60350036621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3772781307190435 0.8440451494732464 }
radiance 31
center -87.11172485351562 0 186.81683349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4292576314869773 0.8486528484917135 }
radiance 25
center -65.6412353515625 0 143.2761993408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.818699895681345 0.4606039027914441 0.8931669533656239 }
radiance 18
center -86.9678726196289 0 152.9280242919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9377424858057155 0.33935374989513734 0.8215032686125419 }
radiance 18
center -35.821781158447266 0 186.63851928710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8582131943486105 0.39391610165287017 0.9500732321079464 }
radiance 20
center -67.84225463867188 0 172.96507263183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6804584435969344 0.4714825830310531 0.9 }
radiance 25
center -57.93494415283203 0 178.9281463623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8167663066649858 0.32045727992131473 0.8842364856679553 }
radiance 25
center -77.6743392944336 0 194.28944396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9849133647456235 0.462081715204985 0.9940013448791626 }
radiance 26
center -73.1998519897461 0 155.96963500976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8808442762262316 0.3800517667024206 0.952591032610381 }
radiance 25
center -38.69916915893555 0 170.8497314453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9047949081267795 0.30961709529793274 0.8143824958187893 }
radiance 22
center -40.24582290649414 0 189.43321228027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7128805880105704 0.40852185112212525 0.9 }
radiance 22
center -63.13070297241211 0 189.23428344726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9087602205369187 0.43110193710270894 0.9974918333849377 }
radiance 28
center -84.59220123291016 0 196.04486083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99180380799408 0.4502684544306206 0.9435557031120442 }
radiance 27
center -55.69855499267578 0 150.75216674804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3046787181162308 0.5957832489121833 }
radiance 16
center -43.55919647216797 0 191.941162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9121600048782753 0.428627315656521 0.9428417587089732 }
radiance 25
center -49.60322189331055 0 174.02867126464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35625386001489284 0.5356469148242072 }
radiance 23
center -42.077552795410156 0 182.4465789794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9698214101030806 0.44982917099359976 0.9184753134538017 }
radiance 21
center -73.78888702392578 0 154.55899047851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8285785956302927 0.437457936864026 0.9760320101952058 }
radiance 25
center -82.58218383789062 0 159.0472869873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49060240747478645 0.7767504871323373 }
radiance 22
center -56.14328384399414 0 168.41749572753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8286692619190358 0.4231480594875774 0.927749778451876 }
radiance 25
center -51.03345489501953 0 156.64390563964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8370582849833421 0.34931361538263317 0.8618143136296559 }
radiance 29
center -85.7585678100586 0 135.90170288085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3655314512261476 0.6501694596499675 }
radiance 27
center -102.24343872070312 0 179.0462188720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9808200756736379 0.49596197293680044 0.8367032984820806 }
radiance 27
center -78.36778259277344 0 169.57150268554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8075861087737972 0.35069333325572905 0.9424333214898056 }
radiance 22
center -81.65071868896484 0 184.057861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9175346048300134 0.43760021933303855 0.8091562974440601 }
radiance 28
center -103.23545837402344 0 188.08494567871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9577911584095287 0.30925237509628145 0.824461055438919 }
radiance 25
center -55.58250427246094 0 132.66929626464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.492844206805638 0.7877756759405197 }
radiance 29
center -64.53079223632812 0 177.99310302734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8661169972516296 0.48887997295508917 0.8257390917936911 }
radiance 19
center -78.4464340209961 0 135.62710571289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9042599379344904 0.33361656277406004 0.9614429177473687 }
radiance 24
center -98.27302551269531 0 160.2042694091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3853993605773296 0.7592029060431642 }
radiance 25
center -67.56277465820312 0 161.6690216064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7233210681850447 0.30386044037683624 0.9 }
radiance 25
center -89.98736572265625 0 142.8870391845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9660159177458211 0.36503229254197656 0.8370405422444929 }
radiance 18
center -99.79357147216797 0 178.12637329101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411555811496008 0.38958541036914973 0.8229457110265287 }
radiance 31
center -68.63345336914062 0 148.9384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8513298076172165 0.3669952481804048 0.9078184238323943 }
radiance 23
center -70.8658676147461 0 181.21458435058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8207115664240063 0.34781251744964037 0.9285173534490182 }
radiance 27
center -63.12587356567383 0 152.34765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9783224802897703 0.4234679165530679 0.8547266855610377 }
radiance 25
center -80.28485870361328 0 179.7025146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9963842040808926 0.42941170229553516 0.9413040169160519 }
radiance 31
center -81.63159942626953 0 140.27305603027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35499905863163744 0.8616874395503862 }
radiance 24
center -56.94274139404297 0 178.636474609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8243377594631229 0.349668462308346 0.8018461736457336 }
radiance 31
center -101.71626281738281 0 181.5065460205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8243343381448301 0.3746109375012596 0.8143019416800343 }
radiance 26
center -58.107791900634766 0 150.14633178710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9312315274425617 0.3103542363142828 0.834788185039735 }
radiance 19
center -103.66427612304688 0 129.10678100585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8273587630259702 0.48692132616135797 0.824492604531927 }
radiance 18
center -94.06514739990234 0 145.927490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44964988326697664 0.8796604729972443 }
radiance 19
center -110.62108612060547 0 138.40963745117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9750436513860579 0.47805362152158515 0.9150847327342975 }
radiance 21
center -93.87210845947266 0 137.14584350585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8631989431069568 0.4431652771048019 0.9165512896876915 }
radiance 24
center -68.1220703125 0 172.97467041015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3575975632211823 0.8255357100344588 }
radiance 26
center -86.86186218261719 0 163.7284393310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412211827152721 0.36380159929558714 0.953385796189033 }
radiance 24
center -78.14759826660156 0 151.74868774414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4072578081187087 0.3193607614236118 0.9 }
radiance 16
center -95.16366577148438 0 155.1345672607422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9074819293512286 0.48625459948290056 0.8362198072443326 }
radiance 24
center -66.90032196044922 0 152.4559783935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31198546160247315 0.4780864930909662 }
radiance 22
center -70.18572998046875 0 160.5316619873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8705968747692215 0.47355698293767234 0.9497539584837684 }
radiance 18
center -100.15621185302734 0 147.39707946777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9350199544452955 0.37526200428394585 0.8154421774541879 }
radiance 23
center -73.92181396484375 0 140.02914428710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9735140779538094 0.46596258377266986 0.9131512991769088 }
radiance 16
center -85.83463287353516 0 125.1314926147461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.975078922380667 0.31750426847454644 0.8361224409460546 }
radiance 27
center -96.86780548095703 0 164.45498657226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5316036130571967 0.3729217913373094 0.9 }
radiance 22
center -62.51837158203125 0 169.15960693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8930932838018903 0.43304375474029766 0.8166690860367588 }
radiance 24
center -88.85316467285156 0 120.8622055053711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8780581917020316 0.4489256286566847 0.9894747969519562 }
radiance 24
center -70.46665954589844 0 120.9914321899414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8256707553091291 0.4390048164306314 0.9292755379810163 }
radiance 30
center -75.54170989990234 0 165.1871795654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9779665278889947 0.43497441603361303 0.9220457499127976 }
radiance 27
center -88.18101501464844 0 128.80636596679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8963963601992939 0.3368970329327976 0.9149574224651352 }
radiance 29
center -72.26435089111328 0 135.92196655273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9819545663738702 0.348148267155071 0.8371060639937109 }
radiance 17
center -125.44342041015625 0 120.1678237915039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7639869051470598 0.49890141591401965 0.9 }
radiance 29
center -98.25436401367188 0 120.00530242919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6586789667322701 0.45207397979574615 0.9 }
radiance 29
center -92.41520690917969 0 162.1337127685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8988242288829517 0.37540133219964555 0.8520164344569986 }
radiance 26
center -101.66061401367188 0 112.74817657470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8961272750248916 0.3182354478863765 0.9280988433718931 }
radiance 26
center -88.06305694580078 0 148.25831604003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411454247919831 0.33288750274534623 0.9301839049555443 }
radiance 25
center -104.36034393310547 0 137.1443634033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9354787116069833 0.4252594533857986 0.8225279521903637 }
radiance 21
center -77.16248321533203 0 154.62762451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40217729215886744 0.40918387829467634 0.9 }
radiance 25
center -82.3387451171875 0 125.93961334228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5584975638174489 0.3023855314244648 0.9 }
radiance 29
center -98.74321746826172 0 109.67308807373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8631747079629207 0.4918916802723102 0.9984878281624243 }
radiance 19
center -90.95293426513672 0 114.41515350341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8090280084428186 0.32086701321656297 0.9 }
radiance 27
center -126.64199829101562 0 159.90740966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3338698858972111 0.6755232006208111 }
radiance 16
center -92.98497772216797 0 109.89678192138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8593109841256354 0.47264681466667724 0.9 }
radiance 16
center -96.77387237548828 0 125.17616271972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9322633759902613 0.43370265397720187 0.987315546489338 }
radiance 30
center -98.32147979736328 0 127.76079559326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37197795769042047 0.4271537697788793 }
radiance 23
center -76.23088073730469 0 109.45147705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5924202340491748 0.3735735343766212 0.9 }
radiance 21
center -115.47325134277344 0 141.69342041015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.990932351692678 0.4311100877636147 0.8373106596996052 }
radiance 22
center -114.28477478027344 0 162.84278869628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8408796119550052 0.355619909019975 0.9 }
radiance 20
center -72.43919372558594 0 163.93312072753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8092529039668162 0.32436622295808637 0.8720939680505416 }
radiance 30
center -98.9198989868164 0 136.10142517089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8538829466492067 0.36048152743087414 0.8535823762879744 }
radiance 18
center -124.68589782714844 0 155.84921264648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.993894156596921 0.3294369304098858 0.8086687928922289 }
radiance 26
center -121.42101287841797 0 122.29998016357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8422590130366392 0.4761397136169422 0.9872604789258941 }
radiance 20
center -99.03939819335938 0 123.19879150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8616347447874364 0.43847418951477746 0.8858189066431201 }
radiance 16
center -135.5441131591797 0 107.79083251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44557824930469736 0.3154682945117262 0.9 }
radiance 22
center -92.45706939697266 0 97.3275146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8483978016540665 0.3574042813708148 0.8598996695094967 }
radiance 21
center -82.41098022460938 0 126.01067352294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9494579195615356 0.3326524485910522 0.9900789298647169 }
radiance 31
center -134.9359893798828 0 115.55854034423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8535029144730772 0.42306761119723835 0.9 }
radiance 16
center -99.63389587402344 0 122.6303939819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.402551305699676 0.49900685280034573 }
radiance 18
center -95.27971649169922 0 123.83727264404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8057169449525602 0.3654559486894053 0.8198830561060351 }
radiance 20
center -98.81008911132812 0 142.15579223632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7765946743109124 0.47394769465232456 0.9 }
radiance 20
center -107.83056640625 0 141.99301147460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6275807277363268 0.4854345510656619 0.9 }
radiance 20
center -109.06550598144531 0 132.71080017089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6356717021368988 0.4052274293579664 0.9 }
radiance 19
center -131.68377685546875 0 131.06356811523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8715170724817848 0.36480467332251204 0.9534975512737736 }
radiance 22
center -86.8999252319336 0 110.2930679321289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8698169072689583 0.40260599788344253 0.8623086970622361 }
radiance 23
center -91.02600860595703 0 152.59425354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8707915900483297 0.46729655091065503 0.8843067840597334 }
radiance 19
center -133.21412658691406 0 110.23321533203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9165586887158741 0.4481886168082283 0.9699314906562821 }
radiance 27
center -101.83321380615234 0 113.9370346069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8470873061083372 0.449936815544643 0.8710329927643087 }
radiance 16
center -115.49105834960938 0 134.7858123779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8312317350385106 0.49456364331482994 0.8533884161663613 }
radiance 20
center -130.5799560546875 0 103.85513305664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9031348169291828 0.31998198747996726 0.8751266225866667 }
radiance 23
center -132.04812622070312 0 105.47620391845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7098910012673414 0.4557646988223697 0.9 }
radiance 20
center -115.0439682006836 0 120.61088562011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9858103018962027 0.30267924383590056 0.9478235568120615 }
radiance 17
center -117.1321792602539 0 119.99211120605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8865107586407026 0.3667637542939082 0.9 }
radiance 28
center -100.27645874023438 0 88.29984283447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8390879974023078 0.47172536584271396 0.9 }
radiance 23
center -120.75979614257812 0 103.78265380859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8318276512540933 0.4414233104061315 0.9 }
radiance 27
center -116.12554168701172 0 89.61715698242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8473123581428306 0.4199550669384055 0.9732480170479796 }
radiance 16
center -114.19505310058594 0 83.92523193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8069574492361373 0.44688286478762906 0.985723716913543 }
radiance 31
center -107.07755279541016 0 120.83322143554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9461231391132428 0.40886752715355124 0.8222143122133874 }
radiance 25
center -114.6486587524414 0 138.5609130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9521431660388521 0.35081288830663865 0.8336111948178817 }
radiance 19
center -128.86233520507812 0 119.95053100585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8221488274926048 0.4929175618518997 0.8372280012997706 }
radiance 21
center -101.80948638916016 0 114.55926513671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4503523562454018 0.6764797058732946 }
radiance 19
center -109.51370239257812 0 126.41277313232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9487703814300985 0.4896332351197248 0.918189254719429 }
radiance 22
center -103.41527557373047 0 104.5813217163086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8809053037950396 0.3227921005601192 0.83382230945822 }
radiance 24
center -121.81246948242188 0 118.66500091552734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6040424491558567 0.4286120217478112 0.9 }
radiance 17
center -109.48230743408203 0 129.80911254882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4574141830334044 0.4999158881974334 0.9 }
radiance 16
center -141.8048095703125 0 133.44639587402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8208585139481401 0.4801142892025745 0.8349488833498919 }
radiance 16
center -143.07333374023438 0 94.72586822509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8012190260243958 0.3542439086681522 0.9703554606612939 }
radiance 23
center -137.30088806152344 0 83.72927856445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4768907756443227 0.4690020692268818 0.9 }
radiance 28
center -136.7528839111328 0 85.56759643554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8842796027859996 0.4913936372234353 0.8274581554229437 }
radiance 21
center -124.83899688720703 0 100.58989715576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8780546301464304 0.3696177556654848 0.8508753607977647 }
radiance 22
center -104.57489013671875 0 97.2817153930664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9888916016014504 0.3237506524690459 0.8548733864841218 }
radiance 23
center -122.82958221435547 0 84.21749114990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9420291585523933 0.41076890803760324 0.811150629783476 }
radiance 27
center -123.53726959228516 0 106.96659088134766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9405175716152607 0.4584863555545059 0.8507179548631972 }
radiance 16
center -133.91175842285156 0 111.44652557373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9178195033287377 0.431696285045466 0.9816622072464873 }
radiance 28
center -151.6750030517578 0 98.56420135498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9781962653935977 0.34650330689690817 0.9878259634586012 }
radiance 23
center -142.22195434570312 0 116.83403778076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4024012196898289 0.4295825172457743 0.9 }
radiance 17
center -130.67478942871094 0 106.96131134033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.871739197661443 0.40826371548478424 0.8858908592397715 }
radiance 31
center -140.3024444580078 0 114.46956634521484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9226759256193009 0.35316925024407475 0.8447102637428572 }
radiance 17
center -133.31004333496094 0 106.27582550048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8543893629913288 0.33571609115168766 0.8684832612929647 }
radiance 23
center -110.05853271484375 0 72.08085632324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.413262372806266 0.40713130652214136 0.9 }
radiance 16
center -126.83256530761719 0 121.2778091430664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8237735665699277 0.37259993147191184 0.8305930800017072 }
radiance 29
center -110.40972137451172 0 106.06936645507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9439522610910283 0.45790666540355174 0.8402840340950178 }
radiance 23
center -135.10728454589844 0 92.99475860595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8621399336203553 0.3739868532270445 0.9544733707496919 }
radiance 24
center -132.47764587402344 0 101.5685806274414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8370026979522028 0.47030494126250727 0.8384733070420343 }
radiance 17
center -116.9678726196289 0 94.91437530517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9814501019707066 0.37811844668242955 0.9560204908159989 }
radiance 23
center -120.13988494873047 0 109.21385192871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8361179260994462 0.3847440353790843 0.9590462101581747 }
radiance 24
center -102.02140808105469 0 111.74693298339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8856336316410263 0.31229510924657605 0.8402433889998964 }
radiance 28
center -147.8460693359375 0 105.73007202148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9326563897449632 0.335501545466284 0.820336697592581 }
radiance 31
center -129.71728515625 0 79.50906372070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8522973842481615 0.449156522635631 0.8812754412643391 }
radiance 24
center -129.47486877441406 0 106.40357208251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8712739167157164 0.45977479505474983 0.9427219207398474 }
radiance 17
center -104.69132995605469 0 114.94049835205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43569616512311193 0.3100883531294285 0.9 }
radiance 16
center -121.33152770996094 0 96.16387939453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7236985168305052 0.4426529802117884 0.9 }
radiance 18
center -114.61714172363281 0 91.9266357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.954507048557744 0.350122518215295 0.97418221534546 }
radiance 17
center -123.66507720947266 0 68.82745361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.899470879829263 0.38982891136173614 0.9951819916092115 }
radiance 29
center -140.8581085205078 0 61.80830764770508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9034343664272124 0.42366025996094825 0.9203764562906318 }
radiance 17
center -148.39166259765625 0 78.57084655761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8056904645598615 0.37900833703400605 0.8456951587435251 }
radiance 23
center -130.62059020996094 0 100.86922454833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9645666015043967 0.3527327853375355 0.9396044791479017 }
radiance 21
center -114.85725402832031 0 98.10157775878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9797107499005759 0.42501496808775563 0.8959940498200258 }
radiance 31
center -117.56977844238281 0 86.0853271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9631945901402778 0.48829167427995934 0.9119158167258448 }
radiance 16
center -149.1315155029297 0 109.40032958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4866792209553522 0.3631302328288743 0.9 }
radiance 16
center -105.87171173095703 0 85.02763366699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8912731938032444 0.472007234236119 0.8883719196387571 }
radiance 16
center -112.96492004394531 0 69.84872436523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872040387654879 0.4881406235386234 0.9258259791145129 }
radiance 28
center -157.2890625 0 56.28273391723633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7458996816828329 0.3847281281133397 0.9 }
radiance 21
center -128.53640747070312 0 105.28105926513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.50266362265553 0.3238795938709141 0.9 }
radiance 24
center -154.0489501953125 0 106.15727233886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8145399448193378 0.3464188469507717 0.9477977860556941 }
radiance 30
center -138.95587158203125 0 71.06360626220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9334504029438033 0.4694168929699509 0.9774862220750966 }
radiance 17
center -124.0146713256836 0 75.83078002929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9999709889732695 0.3354408307914474 0.8758104749686093 }
radiance 24
center -111.97708892822266 0 107.8763427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4176403457207151 0.7260157698859523 }
radiance 30
center -107.16934967041016 0 67.81417846679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308946699471713 0.3422407892085993 0.9 }
radiance 21
center -144.70721435546875 0 100.70040893554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9521839142268841 0.4666781138558518 0.8193852429931099 }
radiance 17
center -150.95848083496094 0 62.10425567626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301559891055771 0.3362109926465403 0.8151675534746632 }
radiance 19
center -150.7589111328125 0 71.70391845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6644306423410412 0.3589819317690351 0.9 }
radiance 29
center -144.56417846679688 0 81.44967651367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4335225020915844 0.8410774200816789 }
radiance 30
center -125.62651824951172 0 89.45899200439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.536246630800169 0.3710848977034315 0.9 }
radiance 16
center -138.4294891357422 0 45.0436897277832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9496621264690555 0.4271264779333756 0.8921735336590098 }
radiance 18
center -129.4036407470703 0 77.7950668334961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9979131724902832 0.3317722847644939 0.9113883346263766 }
radiance 22
center -161.1970977783203 0 80.31098937988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866365564520859 0.46775616561694233 0.868617244395522 }
radiance 19
center -134.66822814941406 0 67.49990844726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866631680805628 0.4260521689306407 0.8350478639791366 }
radiance 24
center -158.33090209960938 0 91.82830810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8631646071885409 0.4636245970134586 0.9485855046130032 }
radiance 18
center -126.03840637207031 0 42.7006950378418
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9240539196403481 0.40127754541977134 0.9144678185878664 }
radiance 23
center -117.87311553955078 0 70.98162841796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9609519621846525 0.466552182506367 0.8948020861835506 }
radiance 22
center -151.1100311279297 0 84.74600982666016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43198038538730893 0.707007840297611 }
radiance 22
center -126.32402038574219 0 69.04776763916016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99048955437757 0.4516991591623847 0.9589463229280702 }
radiance 21
center -138.52151489257812 0 63.40415573120117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9331741138231615 0.30350433305770497 0.9943629833589871 }
radiance 31
center -158.17666625976562 0 76.41282653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8318096392392585 0.43210217130479045 0.8128224984134974 }
radiance 20
center -121.71861267089844 0 56.33052444458008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9416272040339763 0.3313498291495268 0.9492661340458342 }
radiance 21
center -113.94525909423828 0 59.55818176269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5844569462796129 0.420737244016349 0.9 }
radiance 19
center -118.1182632446289 0 88.97529602050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.833587226106408 0.37436498316730893 0.9684296636547243 }
radiance 18
center -125.30707550048828 0 81.20745086669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9876432075543168 0.4866641666028171 0.8882314315440399 }
radiance 27
center -146.3868865966797 0 90.45268249511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48393422724041013 0.7565228448052141 }
radiance 23
center -118.95613861083984 0 57.10197067260742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8864456817183 0.4703250729411257 0.8952703761391255 }
radiance 19
center -143.8804168701172 0 54.3745231628418
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9198902183109365 0.3520980893279599 0.9682872102599382 }
radiance 18
center -152.61842346191406 0 27.162622451782227
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.363232032356008 0.5602939261668505 }
radiance 23
center -146.36778259277344 0 74.74208068847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9241018450369256 0.4333335100895658 0.888635123830595 }
radiance 17
center -143.39520263671875 0 32.73330307006836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8862733931859152 0.41372668150196046 0.8421534253407046 }
radiance 23
center -117.07479095458984 0 29.501611709594727
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9204661793011775 0.30627418090314423 0.9688435447549308 }
radiance 19
center -143.43116760253906 0 30.03327751159668
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45268505236898593 0.3135993059675732 0.9 }
radiance 29
center -131.96864318847656 0 73.9508056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9163236331921985 0.35692446015891877 0.9441376685606782 }
radiance 23
center -159.03668212890625 0 42.52415084838867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8617920523548568 0.3400083092385649 0.8842845858781667 }
radiance 27
center -121.58921813964844 0 79.3432388305664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8940854058587646 0.46665494945975916 0.846007594477275 }
radiance 31
center -141.955810546875 0 45.8701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7797416340042091 0.45878851620269456 0.9 }
radiance 26
center -161.564208984375 0 75.52774047851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8572662566625107 0.4682158497798453 0.9317571903730872 }
radiance 17
center -163.4796600341797 0 27.131752014160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9120369967742953 0.4483534892963914 0.8403533453671541 }
radiance 25
center -137.88328552246094 0 68.95922088623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8331622394499916 0.4876611591984056 0.9892439764075691 }
radiance 22
center -160.83938598632812 0 42.13812255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9677730007653935 0.417086083964227 0.9539791578054073 }
radiance 16
center -120.11730194091797 0 77.31830596923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7524642344642394 0.3353025378309093 0.9 }
radiance 31
center -151.63836669921875 0 54.09912109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31271071250055077 0.4231863215759598 }
radiance 22
center -163.6340789794922 0 68.24502563476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9532112066986548 0.42697299874725503 0.8116333146857931 }
radiance 20
center -136.74537658691406 0 66.99173736572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9822117017261716 0.4411192451173459 0.9862347154864063 }
radiance 19
center -126.32999420166016 0 47.14082336425781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9552834486992041 0.3370270616643884 0.8582099907334163 }
radiance 23
center -142.5106658935547 0 77.73961639404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6742625585965454 0.42102065138415873 0.9 }
radiance 19
center -115.04646301269531 0 78.6029281616211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6658149061769759 0.3303016348462107 0.9 }
radiance 19
center -133.34080505371094 0 31.939895629882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8636998263896172 0.4187957839161517 0.9960641081742012 }
radiance 19
center -132.1421356201172 0 38.423683166503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9237340787888096 0.4874089045397547 0.920255559353552 }
radiance 25
center -147.10443115234375 0 31.040761947631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9636964468209327 0.43711648314520024 0.8334677302449816 }
radiance 31
center -146.52981567382812 0 54.2410774230957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9978782851908969 0.45540895425171213 0.8088182505758318 }
radiance 29
center -124.06135559082031 0 26.814945220947266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9677593147148047 0.38922294183893014 0.9138426537882358 }
radiance 21
center -162.5533905029297 0 52.55756378173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9315624212089583 0.474818453196822 0.8256038153473209 }
radiance 17
center -131.64378356933594 0 14.90774154663086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9248581997515891 0.4957099999288912 0.9382874180491698 }
radiance 17
center -145.38519287109375 0 15.231760025024414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6860595374422649 0.3075091521071658 0.9 }
radiance 17
center -119.63896179199219 0 55.400264739990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301031621762187 0.305720806174344 0.8104348617135844 }
radiance 24
center -130.2514190673828 0 54.80423355102539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8046281159688702 0.3192326222566522 0.8093364708511949 }
radiance 27
center -153.98973083496094 0 57.254276275634766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8620605121352352 0.3397701088063419 0.9268261728829676 }
radiance 21
center -135.54620361328125 0 48.0632438659668
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8010253855805907 0.3444373702467985 0.8203798332181503 }
radiance 18
center -165.5237579345703 0 37.63069152832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5400014703294577 0.34979171215757315 0.9 }
radiance 18
center -119.80088806152344 0 32.918888092041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3927153658331365 0.6572293891739681 }
radiance 27
center -147.39950561523438 0 49.06110763549805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.748437109874947 0.32212138705866744 0.9 }
radiance 30
center -141.3798828125 0 20.441051483154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8123618281681058 0.4526383180473217 0.9292501226729877 }
radiance 30
center -146.03746032714844 0 19.02499008178711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8004670035969564 0.3940275953747946 0.9229154384485844 }
radiance 22
center -139.5222625732422 0 57.432289123535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8064815849906977 0.4425020525804433 0.891522651969259 }
radiance 27
center -148.56251525878906 0 27.016796112060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8429805933894128 0.4570402321522964 0.8089489572761683 }
radiance 20
center -128.70057678222656 0 63.255760192871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43712366977610373 0.4949147151902089 0.9 }
radiance 29
center -136.94253540039062 0 6.622089862823486
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8746553355387545 0.3800840131132867 0.8958627532746256 }
radiance 21
center -134.4055633544922 0 22.479848861694336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.784644817481972 0.465690294803764 0.9 }
radiance 18
center -139.9355010986328 0 44.76625061035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3302329689750961 0.8068767939964122 }
radiance 19
center -122.83008575439453 0 -1.4778677225112915
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9632671741983072 0.34865924177507046 0.9108147114201832 }
radiance 19
center -142.40467834472656 0 -0.4666700065135956
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35642381880303553 0.6614978745134275 }
radiance 22
center -118.5443115234375 0 20.38555908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9107678722992724 0.3142329203451422 0.9546678003700222 }
radiance 21
center -152.58848571777344 0 43.21152114868164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834499187079623 0.48053975829120243 0.8896840946640754 }
radiance 26
center -157.3915557861328 0 26.672439575195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7644188882736922 0.4838675746229268 0.9 }
radiance 18
center -148.26536560058594 0 15.332783699035645
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45157658343548546 0.4993071393245109 0.9 }
radiance 31
center -143.7027587890625 0 21.54152488708496
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7803205413821678 0.43337513788890913 0.9 }
radiance 27
center -120.84017944335938 0 2.796651601791382
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9256138999969882 0.3292158530690347 0.9826651952983394 }
radiance 27
center -127.36309051513672 0 1.0131155252456665
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.924820626289329 0.3600527464674946 0.9028340420085406 }
radiance 26
center -144.64462280273438 0 1.4107524156570435
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37422459031033517 0.4275711764158088 }
radiance 24
center -165.9918975830078 0 38.061100006103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8030013837404897 0.47632958143594917 0.9106830491495006 }
radiance 30
center -160.82821655273438 0 45.233741760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.683844052878246 0.413964660506263 0.9 }
radiance 25
center -144.7549285888672 0 17.585002899169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8570223476215 0.3685235610379486 0.8779848179274164 }
radiance 25
center -120.05387115478516 0 20.35056495666504
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6329190545962213 0.432925153760066 0.9 }
radiance 19
center -149.3180389404297 0 9.404098510742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42659783544557317 0.8983696004988646 }
radiance 18
center -164.433837890625 0 20.07887840270996
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8124607640352675 0.4095548790791107 0.9175871030948493 }
radiance 27
center -144.82008361816406 0 11.911053657531738
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8120545435964098 0.47004804365686814 0.9577900404364171 }
radiance 20
center -156.1013946533203 0 6.592442989349365
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9618577719798181 0.48147671574407136 0.9117991556602423 }
radiance 27
center -145.69969177246094 0 -8.569332122802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9031659021810228 0.3551861776186719 0.9137671157437355 }
radiance 17
center -119.75680541992188 0 -14.402288436889648
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9350539788342089 0.45225401904772145 0.8227775101297476 }
radiance 24
center -143.14820861816406 0 9.14102840423584
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9462541279935597 0.43228872899260506 0.9304952911986192 }
radiance 24
center -117.30968475341797 0 19.602907180786133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4103583148838422 0.4258492604969366 0.9 }
radiance 23
center -124.5179214477539 0 32.565670013427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31663210778394907 0.45331038257992484 }
radiance 23
center -162.1574249267578 0 8.084202766418457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9940590919808876 0.4134644810578116 0.8974823448187226 }
radiance 27
center -165.0124053955078 0 5.640058994293213
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9881601852491497 0.4584484598547004 0.8613910086392764 }
radiance 29
center -140.34698486328125 0 -12.500168800354004
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9224556045880724 0.4232589746192842 0.8562276419337485 }
radiance 26
center -145.2694091796875 0 1.7254493236541748
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9200653746556834 0.31750406019670674 0.8510147859575586 }
radiance 17
center -134.23031616210938 0 -14.280949592590332
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8404611496182429 0.35543568596900466 0.9298158989814316 }
radiance 24
center -131.95166015625 0 -2.695783853530884
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48161984884740944 0.7703707685234705 }
radiance 29
center -163.09837341308594 0 33.84420394897461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42422205391343626 0.6833170832966736 }
radiance 20
center -139.81594848632812 0 -2.7652761936187744
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8770427047494058 0.3501588377622365 0.810520883075427 }
radiance 21
center -125.930908203125 0 15.339191436767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9617003885841761 0.4264241736128353 0.9398596144216619 }
radiance 19
center -156.18707275390625 0 30.732242584228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5294536236375033 0.44343875062285226 0.9 }
radiance 17
center -159.2146759033203 0 12.405312538146973
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5968636037226389 0.41439785863383477 0.9 }
radiance 21
center -164.64515686035156 0 -12.281708717346191
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4762422270998359 0.6773421190420216 }
radiance 30
center -150.1419219970703 0 8.282129287719727
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8895916455543766 0.4705655152551593 0.9734773704137671 }
radiance 27
center -142.71128845214844 0 0.3996226191520691
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8335040214290341 0.3134955233228032 0.9176246683197663 }
radiance 21
center -119.02350616455078 0 -31.493305206298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41252291081807924 0.6408032939933993 }
radiance 24
center -132.30145263671875 0 16.443859100341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4770426611850931 0.8878389221242629 }
radiance 28
center -143.9139404296875 0 11.259057998657227
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.89988279035172 0.41090857431370187 0.892586124795429 }
radiance 30
center -154.27774047851562 0 14.915761947631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8251079185400295 0.3643061240744256 0.9251706944224787 }
radiance 23
center -148.49514770507812 0 15.393708229064941
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9062321257778951 0.48299783268833996 0.977296960338954 }
radiance 31
center -149.34539794921875 0 10.595762252807617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7741171299426598 0.44979192341573404 0.9 }
radiance 25
center -117.9854965209961 0 3.493732213973999
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9915515483024863 0.3147592278879148 0.8784412792892871 }
radiance 28
center -114.87722778320312 0 -21.68279457092285
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8859981457749849 0.4052826253246584 0.9166593661264697 }
radiance 29
center -160.5951385498047 0 -13.926175117492676
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.824756870611107 0.39364437744551956 0.8683817149694388 }
radiance 27
center -143.63307189941406 0 2.757570266723633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.325867867769059 0.5790058709024497 }
radiance 24
center -147.80926513671875 0 8.231398582458496
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8261782771417041 0.4745846293613103 0.8932009774565896 }
radiance 20
center -143.885498046875 0 -12.735167503356934
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7190629512981588 0.31151517070386436 0.9 }
radiance 18
center -146.06825256347656 0 -25.85399627685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8815160810393385 0.41492311927475867 0.8936545327238092 }
radiance 27
center -125.70335388183594 0 -29.416479110717773
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8324068621209669 0.35030084388676924 0.8627833673322347 }
radiance 19
center -152.0488739013672 0 14.986397743225098
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8572986356164762 0.3406337541081928 0.9671150424641309 }
radiance 18
center -144.362548828125 0 -29.417322158813477
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8152844200857998 0.4578606847169053 0.9889310591245066 }
radiance 26
center -141.89686584472656 0 4.312027931213379
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.898611958657358 0.44438663450977556 0.8261881910591228 }
radiance 19
center -155.06982421875 0 -4.022181034088135
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9424184772991446 0.4615261647204142 0.8098471405149328 }
radiance 24
center -132.66921997070312 0 -9.026518821716309
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5583749498595675 0.45605538883293006 0.9 }
radiance 20
center -122.93055725097656 0 -2.4860384464263916
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8096367746791703 0.4862831839321634 0.8638339744545083 }
radiance 21
center -117.3895263671875 0 -44.65391540527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9093514801501841 0.36969326893013454 0.8140269349817467 }
radiance 24
center -137.5716094970703 0 -15.471257209777832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8807437516338806 0.406988613538334 0.9 }
radiance 16
center -136.1243896484375 0 0.1982715129852295
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9930336452529678 0.3716624616776604 0.8780144213052353 }
radiance 25
center -137.6522674560547 0 -37.6050910949707
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8593229173426024 0.3161913610589703 0.9008517093453988 }
radiance 18
center -129.72433471679688 0 -24.456104278564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9307068755329357 0.46205768058720387 0.9917282893764551 }
radiance 20
center -133.2618408203125 0 -8.504966735839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9108912424877559 0.40816964026068403 0.9555732568292024 }
radiance 28
center -117.15839385986328 0 -1.88152015209198
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8513831481008679 0.41686619994906676 0.8060930774841273 }
radiance 18
center -122.36811828613281 0 -32.80069351196289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4384181464194067 0.4613991661008085 0.9 }
radiance 31
center -141.27944946289062 0 -20.671802520751953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3440101568666214 0.5001120234297289 }
radiance 16
center -130.218994140625 0 -14.192102432250977
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8251158213112255 0.4291948096563646 0.9049022196628457 }
radiance 16
center -123.75822448730469 0 -9.608201026916504
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447677114882212 0.48033235047347467 0.9983766422183424 }
radiance 23
center -151.44252014160156 0 -19.92251205444336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9724872980452468 0.3106275957208633 0.9455370231559563 }
radiance 17
center -112.22748565673828 0 -32.18860626220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8527202290492409 0.46667577920004166 0.8212878590890431 }
radiance 20
center -115.10674285888672 0 -33.80558395385742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8115655577101153 0.3261625704416156 0.9880580102654632 }
radiance 25
center -145.31781005859375 0 -9.800786018371582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3450220607219244 0.8060582982557384 }
radiance 17
center -131.39366149902344 0 -39.68967056274414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32105067568988843 0.5312397663860879 }
radiance 29
center -141.93748474121094 0 -27.171377182006836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9478412449735482 0.4942506414171207 0.9836339101554942 }
radiance 29
center -113.98662567138672 0 -8.4725923538208
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9381204717342827 0.4833766558954231 0.9057562812479014 }
radiance 21
center -111.76651763916016 0 -40.731231689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9837849182021028 0.42447664161432885 0.9749932838957724 }
radiance 26
center -129.62376403808594 0 -25.967832565307617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.80548652976957 0.4899182192850864 0.9809435131180685 }
radiance 25
center -121.99649047851562 0 -11.62338924407959
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9827603734527841 0.35580130544341876 0.801190892819795 }
radiance 30
center -128.29087829589844 0 -43.813175201416016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8805805156533995 0.3209217320061323 0.9455268122984695 }
radiance 28
center -120.50694274902344 0 -13.599095344543457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4243613627445637 0.6151129675117678 }
radiance 27
center -134.706298828125 0 -44.767173767089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9100837179137699 0.3288405708343498 0.9526474449788846 }
radiance 27
center -120.06092071533203 0 -8.920287132263184
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9381645405089738 0.39540716931880027 0.8804398337644752 }
radiance 16
center -127.938232421875 0 -58.81978988647461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8885998517564633 0.3039692684618591 0.9061509615747743 }
radiance 23
center -138.4355010986328 0 -38.32035827636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9854345804710564 0.3726974068428104 0.9769989377886144 }
radiance 16
center -126.93977355957031 0 -14.733478546142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.864886122722511 0.3823586639470251 0.9356573427530309 }
radiance 18
center -146.2362823486328 0 -43.03196334838867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7997578752098546 0.4094887628646635 0.9 }
radiance 27
center -123.27912902832031 0 -31.178407669067383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8134769317130661 0.3916818484685218 0.870036088853284 }
radiance 19
center -151.4757080078125 0 -16.521371841430664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9383793948783754 0.33504652036325827 0.8831778746439396 }
radiance 23
center -126.62300872802734 0 -51.88998794555664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.945573152928834 0.4057688470780554 0.8261081529867169 }
radiance 17
center -151.23089599609375 0 -57.44530487060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9451752052876103 0.4711163056645359 0.9860491200387633 }
radiance 25
center -142.28753662109375 0 -16.83725357055664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6384699751716436 0.3120741988995623 0.9 }
radiance 22
center -115.96919250488281 0 -27.5743465423584
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9144434425881894 0.3770615572805862 0.8558724766168935 }
radiance 23
center -148.474853515625 0 -45.93571090698242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3738389719849126 0.5427433440360658 }
radiance 31
center -127.25828552246094 0 -30.642818450927734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4419007126371383 0.5509583297936345 }
radiance 18
center -150.0078582763672 0 -44.134986877441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8264296181116019 0.3560409115949381 0.8757840523168001 }
radiance 16
center -145.0943145751953 0 -39.33660888671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9464726358997116 0.3398884402985756 0.9610417940107865 }
radiance 27
center -123.7308120727539 0 -39.675392150878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9679420596364656 0.3452476383219789 0.948752025188045 }
radiance 17
center -143.35081481933594 0 -53.27622604370117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9131133686204723 0.47795003756884913 0.8556976559666092 }
radiance 16
center -98.99537658691406 0 -63.63988494873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.971087054699631 0.4611590852821498 0.8070665119118969 }
radiance 19
center -110.14620971679688 0 -50.378074645996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42860649063135314 0.8200197955595173 }
radiance 31
center -140.10276794433594 0 -46.23984909057617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8062219960953191 0.4344221886418631 0.8339754069984247 }
radiance 19
center -131.01318359375 0 -39.38352966308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3110247538897506 0.5920809929269328 }
radiance 30
center -141.60397338867188 0 -58.51765441894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8475350432885043 0.4464442041464224 0.9483577788552578 }
radiance 18
center -140.56349182128906 0 -25.368942260742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8792331329294982 0.30479381875229244 0.9872070482186316 }
radiance 20
center -145.19432067871094 0 -30.456188201904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8927235469028542 0.38861264064561307 0.9385293283173002 }
radiance 31
center -115.05538940429688 0 -52.089420318603516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.425299264718206 0.3489936101901807 0.9 }
radiance 23
center -96.87847137451172 0 -29.634140014648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.837144052424565 0.35467131661528917 0.8322046497187394 }
radiance 30
center -136.56265258789062 0 -64.2172622680664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.943327190634047 0.4949078677601466 0.9312159567507425 }
radiance 23
center -110.40535736083984 0 -33.2853889465332
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7299995422470966 0.3115318565039884 0.9 }
radiance 22
center -126.97543334960938 0 -61.74323272705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8645378822403704 0.37363149805062273 0.9 }
radiance 19
center -111.8498306274414 0 -70.81114959716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9356163612731835 0.49660910898808674 0.8871056051555544 }
radiance 26
center -137.56643676757812 0 -64.93916320800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8812052004414397 0.4483576398486323 0.9693409064417952 }
radiance 18
center -123.47091674804688 0 -36.15257263183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9213735450111871 0.41501939386283326 0.9665509531292276 }
radiance 20
center -118.18457794189453 0 -40.15949630737305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.773802730802605 0.4148223721899713 0.9 }
radiance 21
center -143.2086181640625 0 -61.99322509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40929089531539753 0.48958252289718374 0.9 }
radiance 30
center -144.61622619628906 0 -54.47929000854492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32147009067529714 0.4395090519329763 }
radiance 28
center -110.19292449951172 0 -31.308839797973633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9676192015149103 0.4527215340883723 0.8059473488588145 }
radiance 18
center -112.54606628417969 0 -76.81021118164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9928883065333491 0.4884590140801526 0.9954158777623863 }
radiance 26
center -125.38819885253906 0 -39.808013916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9155243366857031 0.47693959899740646 0.8544351117816519 }
radiance 29
center -98.73756408691406 0 -41.894371032714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9446888807649393 0.4752476278937132 0.8269174344780928 }
radiance 19
center -130.6608428955078 0 -61.87458038330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9314019170996414 0.45091763469059803 0.9715052305589394 }
radiance 27
center -103.9610824584961 0 -65.47195434570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5173424093372756 0.46865268824376083 0.9 }
radiance 24
center -105.72551727294922 0 -79.9538345336914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36618745309234546 0.8229628671071606 }
radiance 26
center -119.59976196289062 0 -66.5848617553711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9890041563393479 0.37994568176859767 0.9324655191934841 }
radiance 23
center -132.822509765625 0 -60.94853591918945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8363028612706664 0.45478529642212595 0.944915384274238 }
radiance 20
center -127.84323120117188 0 -73.53433227539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9207985039131433 0.4047076547023389 0.8848599788315901 }
radiance 21
center -116.90113067626953 0 -36.88493728637695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5588355340477683 0.3341548825436125 0.9 }
radiance 26
center -131.77978515625 0 -57.78851318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.869836422162408 0.4549261286912553 0.8849663258566196 }
radiance 30
center -120.69361114501953 0 -63.246849060058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8897149011640336 0.47364790150266334 0.8185698589102496 }
radiance 16
center -122.80477905273438 0 -44.09817123413086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3969959811390155 0.8640541926676555 }
radiance 17
center -95.07328796386719 0 -81.23471069335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8952964267733416 0.36382018760450896 0.8950780601183574 }
radiance 27
center -121.1593246459961 0 -79.15811920166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9511376687139367 0.49335047036279134 0.9590695964712829 }
radiance 24
center -94.08267211914062 0 -71.3912124633789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9897684920322787 0.38620265304512746 0.9994298580989627 }
radiance 22
center -116.80021667480469 0 -35.478057861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6425301289575942 0.39523914391233594 0.9 }
radiance 23
center -110.84884643554688 0 -42.808876037597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.483052338515495 0.8387837848478228 }
radiance 18
center -105.04851531982422 0 -51.28866195678711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9615520823720837 0.41604333303100516 0.8883106506714288 }
radiance 19
center -106.37931060791016 0 -48.770606994628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8824267749838435 0.40505431542038295 0.8807138153439933 }
radiance 30
center -117.89461517333984 0 -84.74649047851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8650738513056141 0.4335674440253108 0.9634610998855093 }
radiance 16
center -98.25000762939453 0 -64.49986267089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4097143309523934 0.6834423867710205 }
radiance 20
center -109.55308532714844 0 -84.09628295898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.835808247291471 0.35004860713798874 0.8090557942514531 }
radiance 22
center -101.74311065673828 0 -79.01095581054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9248976382020175 0.4610326215544932 0.8558942799751628 }
radiance 24
center -128.7992401123047 0 -77.15249633789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8777754664931935 0.37229665169312653 0.813528012977121 }
radiance 18
center -120.19214630126953 0 -88.32183837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7340679387349982 0.3754138339969848 0.9 }
radiance 31
center -115.501220703125 0 -78.21954345703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8401657663735673 0.4847292015115587 0.9855253621113873 }
radiance 27
center -101.37763977050781 0 -59.949302673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5885028613166196 0.45331106970376006 0.9 }
radiance 24
center -82.1176528930664 0 -61.42967224121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9556727471078683 0.49659132261263966 0.9058522152542813 }
radiance 26
center -124.41915893554688 0 -87.41918182373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8897988611773893 0.36932884822945067 0.9772488831019673 }
radiance 21
center -109.57638549804688 0 -64.82011413574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8059427278500362 0.41714887965579284 0.9341407730948452 }
radiance 16
center -99.74108123779297 0 -58.31404113769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.545358142660293 0.49496816599909754 0.9 }
radiance 21
center -93.6031494140625 0 -64.3495864868164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6902980369372853 0.38154807988685174 0.9 }
radiance 28
center -111.68354797363281 0 -75.26726531982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9301984058202182 0.4769658697762388 0.8109857990218663 }
radiance 23
center -123.3966293334961 0 -60.92062759399414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42060867835262883 0.8654188306352016 }
radiance 30
center -99.5069808959961 0 -55.752750396728516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9841221598210681 0.42400897381284863 0.8236046733456246 }
radiance 28
center -87.41775512695312 0 -68.34606170654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5951474354405765 0.4692013189954437 0.9 }
radiance 30
center -96.59142303466797 0 -58.49835205078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9816892319825491 0.4094642825193619 0.9051784245327058 }
radiance 21
center -109.0928726196289 0 -74.95030975341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8349448337894705 0.3279178154468733 0.9261420560873174 }
radiance 20
center -121.99365997314453 0 -80.04253387451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9161202480903134 0.49508407251120146 0.9603240591117401 }
radiance 25
center -105.24977111816406 0 -74.48025512695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5145448642761081 0.3505443762905199 0.9 }
radiance 30
center -90.7177505493164 0 -58.613040924072266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8263079806438758 0.3899810180026601 0.8271340567847005 }
radiance 27
center -89.18861389160156 0 -100.94380950927734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9220454851006162 0.32650555403166137 0.8891747790830882 }
radiance 26
center -75.39175415039062 0 -78.41978454589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6652283615200189 0.36248399074869353 0.9 }
radiance 23
center -109.32686614990234 0 -58.80662155151367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9019766475716247 0.37535538898036214 0.88773826219211 }
radiance 30
center -77.53532409667969 0 -61.68244171142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8559026963269087 0.4117385760928308 0.8221032570773311 }
radiance 18
center -100.68183135986328 0 -69.31056213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31814523598229344 0.7347752360400234 }
radiance 20
center -114.90055084228516 0 -71.27505493164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8424771924722139 0.4647727429435743 0.9272622560945725 }
radiance 21
center -111.9200439453125 0 -58.3465461730957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9559640886297491 0.41902759074105 0.9861555128302872 }
radiance 30
center -101.3991470336914 0 -73.63217163085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42998168960511174 0.3773136633307004 0.9 }
radiance 25
center -106.33626556396484 0 -99.08739471435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8136569028339009 0.3103207877411605 0.8830448489605893 }
radiance 18
center -111.15237426757812 0 -66.21669006347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9038099633466767 0.35506942466299907 0.8483449108326341 }
radiance 28
center -110.53672790527344 0 -81.70122528076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9661897163034516 0.38271347831234265 0.9530915960527497 }
radiance 24
center -81.00051879882812 0 -104.77354431152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8216058366259967 0.3523351368948963 0.841567944473222 }
radiance 16
center -86.1208724975586 0 -79.26769256591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9576750675426494 0.47788540751130215 0.8104095534972917 }
radiance 18
center -102.96586608886719 0 -66.36029052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.908884874569321 0.48539325016190593 0.886789937714475 }
radiance 21
center -100.00003814697266 0 -58.43933868408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9450142846863969 0.4880318673874504 0.8551155101105304 }
radiance 20
center -111.89765930175781 0 -84.33213806152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.952067268139298 0.47425069226735195 0.9216079834857065 }
radiance 22
center -104.5866928100586 0 -91.14982604980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.457329446556743 0.7240904066880516 }
radiance 27
center -79.11685943603516 0 -91.93578338623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9797979719395659 0.40234527050645025 0.8088671576730502 }
radiance 30
center -75.93387603759766 0 -67.85839080810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8913269779527354 0.3990913317559168 0.8842010887082905 }
radiance 16
center -67.29383087158203 0 -94.09329223632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9090849073843617 0.34077130078827167 0.9050444509364924 }
radiance 26
center -104.14942169189453 0 -79.51712036132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30172194905956123 0.7439499981927665 }
radiance 30
center -93.3824691772461 0 -73.4737319946289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8521023978662079 0.329108374074516 0.971353554514406 }
radiance 17
center -76.99662780761719 0 -94.97698974609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9363049472434929 0.4907771092642741 0.8421733124555655 }
radiance 24
center -102.01145935058594 0 -79.30651092529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44650757529213936 0.3552936050672714 0.9 }
radiance 23
center -63.6250114440918 0 -74.76334381103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3514437022287649 0.4938483260769242 }
radiance 18
center -109.614501953125 0 -72.72989654541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9749060036978543 0.47814625958322254 0.9209316160657561 }
radiance 30
center -88.52130889892578 0 -87.76463317871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9068629804788402 0.4208193145849747 0.827638484873316 }
radiance 18
center -77.8121337890625 0 -78.09764862060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3626855485986038 0.6859048990553203 }
radiance 17
center -74.56328582763672 0 -67.36290740966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30655468034740657 0.5307871427607044 }
radiance 25
center -84.15311431884766 0 -78.69621276855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8600643526228025 0.4163430153314329 0.8194593741892108 }
radiance 23
center -90.29369354248047 0 -66.30438995361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6499198518376187 0.4745987380603154 0.9 }
radiance 18
center -70.98446655273438 0 -91.62158966064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8457587501083823 0.3760868931549822 0.9438431186115888 }
radiance 16
center -68.31900787353516 0 -77.45437622070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9820262376393458 0.4224671928963939 0.9142001955225483 }
radiance 17
center -97.34613037109375 0 -79.72825622558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40232363807450383 0.5478752030344195 }
radiance 16
center -73.03502655029297 0 -66.83258056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4509532667165129 0.631669446750546 }
radiance 21
center -76.44580078125 0 -93.29065704345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412797615038954 0.33854327368338116 0.8800983657395802 }
radiance 20
center -69.66626739501953 0 -78.02720642089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9668061839845787 0.3383572595068242 0.8129024794963016 }
radiance 24
center -99.12165069580078 0 -68.53884887695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9096979494314725 0.41411329747916675 0.9004517434232588 }
radiance 19
center -99.0237808227539 0 -93.63966369628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8300895390277507 0.4048768996813019 0.8069382980149845 }
radiance 24
center -62.896148681640625 0 -120.28856658935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8089494636586478 0.41776553505568303 0.9 }
radiance 26
center -67.91565704345703 0 -97.86907196044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.980069375795174 0.44079847174819875 0.9316618487035826 }
radiance 30
center -75.11583709716797 0 -115.97632598876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9564776525899146 0.41364079251381475 0.8801603201838654 }
radiance 24
center -82.83668518066406 0 -115.9913330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.688292651446282 0.3134854007378337 0.9 }
radiance 23
center -68.61632537841797 0 -112.27375030517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8905913984877685 0.35424599227965736 0.9461800669544738 }
radiance 19
center -73.0271987915039 0 -96.93090057373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44575678801247065 0.4623523838052598 0.9 }
radiance 26
center -61.83778762817383 0 -101.59513854980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7543060118444735 0.3403981188734538 0.9 }
radiance 29
center -82.19978332519531 0 -110.79454803466797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9513091824287108 0.3070283327072882 0.9478784197234509 }
radiance 27
center -52.95134735107422 0 -81.50076293945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.380067759611941 0.758025793992213 }
radiance 17
center -87.69901275634766 0 -85.07520294189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8809706738540122 0.33635854511783075 0.9276287291837979 }
radiance 22
center -55.48185348510742 0 -99.99739074707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8192743349468463 0.3148616925288536 0.9906173514031382 }
radiance 30
center -64.04400634765625 0 -120.76988220214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9973346343546946 0.33077951591446964 0.8274910202567699 }
radiance 31
center -99.38640594482422 0 -121.4863510131836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.95965339994306 0.4344652928428204 0.9406537328753953 }
radiance 16
center -70.144287109375 0 -94.67044830322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9904872865620494 0.38293958612878687 0.9615533957585906 }
radiance 23
center -83.36641693115234 0 -119.33963775634766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9134068262599342 0.43254344421377944 0.878120335421255 }
radiance 16
center -64.77046203613281 0 -103.28626251220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3637500840459632 0.515327401793492 }
radiance 24
center -82.837158203125 0 -121.18605041503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9207437276032483 0.4384585314837338 0.8498098725327703 }
radiance 17
center -61.601844787597656 0 -98.23130798339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8333222675931738 0.40486360552706835 0.8573044036647717 }
radiance 29
center -55.803585052490234 0 -78.18966674804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8342695404222801 0.43669309011838664 0.894686101063392 }
radiance 23
center -84.115966796875 0 -114.35360717773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9640324059753261 0.3041107734941022 0.960699280049091 }
radiance 25
center -76.53844451904297 0 -105.89167785644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8120804455805158 0.49489967855772765 0.9832075835291887 }
radiance 19
center -41.372188568115234 0 -92.07546997070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9552727913780065 0.37123847335391436 0.9910704582207392 }
radiance 20
center -46.30427932739258 0 -108.89649963378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9100853817211586 0.4614998735287305 0.8566541667658096 }
radiance 19
center -79.81385803222656 0 -92.40777587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.893634996516097 0.4591987432770359 0.898598768063422 }
radiance 29
center -63.249019622802734 0 -122.30555725097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9198623907562138 0.4245523082496059 0.8871124345934361 }
radiance 25
center -48.44050598144531 0 -102.27192687988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4077315354611406 0.8787359665662248 }
radiance 29
center -59.60548782348633 0 -97.3115005493164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9995326523467379 0.49124753280016564 0.8350013916950432 }
radiance 22
center -75.03924560546875 0 -91.05764770507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8193000220162563 0.3475801092366122 0.9944127957559735 }
radiance 18
center -68.01630401611328 0 -92.55818939208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4257841561087884 0.4189410400056698 0.9 }
radiance 22
center -76.40315246582031 0 -104.05380249023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9543472916797211 0.3628813416125303 0.8521367259142038 }
radiance 25
center -46.26190185546875 0 -120.00657653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8934051601153178 0.4772860068600182 0.8302358921550321 }
radiance 18
center -43.52812194824219 0 -125.06217956542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9967478258606063 0.413248713655302 0.9373057820178466 }
radiance 27
center -51.50911331176758 0 -106.86257934570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7777792849736002 0.3802933829293306 0.9 }
radiance 31
center -70.26660919189453 0 -89.90657806396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9154604952612992 0.37965243219268985 0.878832523560604 }
radiance 27
center -42.86996841430664 0 -125.73470306396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5443027918742134 0.44401462721834317 0.9 }
radiance 19
center -87.139892578125 0 -109.798828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8973591276904366 0.3772899600268885 0.9 }
radiance 23
center -56.65663528442383 0 -114.0858154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3878859757869544 0.7480155401392551 }
radiance 19
center -47.49773025512695 0 -104.99674987792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7653362580310465 0.4174056852330465 0.9 }
radiance 16
center -49.883235931396484 0 -115.3454360961914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9701101936717191 0.373898409703909 0.9393999827076861 }
radiance 22
center -53.75810623168945 0 -116.10631561279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8869319262114592 0.4679517387587341 0.93829554963678 }
radiance 20
center -52.841896057128906 0 -100.72284698486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4327350806845913 0.38597273280973243 0.9 }
radiance 25
center -40.002464294433594 0 -122.68380737304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4896337587621754 0.654569153548862 }
radiance 23
center -32.747737884521484 0 -129.25927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533063217983562 0.48099425973266274 0.8998831111731768 }
radiance 27
center -54.90040588378906 0 -98.68028259277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5488516500348106 0.3459163409281472 0.9 }
radiance 25
center -59.5820426940918 0 -93.57755279541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5997798831511488 0.4965613569835503 0.9 }
radiance 31
center -54.161407470703125 0 -97.62200927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9151160012393238 0.3412596861491664 0.8814001511441047 }
radiance 20
center -65.48882293701172 0 -109.30696868896484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8119852728096306 0.470544187623243 0.9077952920429291 }
radiance 26
center -67.96926879882812 0 -90.17098999023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49369268790882515 0.4421608549289211 }
radiance 19
center -55.7893180847168 0 -128.7733917236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8591142001686564 0.34009772350979894 0.9699430200465258 }
radiance 27
center -36.56736755371094 0 -116.82081604003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7890053959159044 0.47813599049717925 0.9 }
radiance 24
center -53.41861343383789 0 -99.8101806640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4817099466868242 0.7465789360236265 }
radiance 30
center -72.08355712890625 0 -99.14749145507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9895176081689101 0.472903360568814 0.9492452600614191 }
radiance 22
center -74.79501342773438 0 -100.33977508544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8654853271877271 0.39223060059811243 0.8356899722064114 }
radiance 17
center -33.58208465576172 0 -126.27071380615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9107191160153228 0.3813954038173837 0.862803685000196 }
radiance 29
center -46.154422760009766 0 -101.75720977783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4391290295546685 0.5557403786240914 }
radiance 27
center -59.57709884643555 0 -89.19076538085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8841638842270002 0.3330924969813681 0.9541088317845219 }
radiance 20
center -32.79723358154297 0 -133.29205322265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8579179854118761 0.39022351340153216 0.9724528950768694 }
radiance 20
center -44.1640739440918 0 -121.34649658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8383464972757426 0.30950937071016166 0.9968345372902401 }
radiance 23
center -46.56687927246094 0 -103.45793914794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8262863283475302 0.398750938975187 0.8049509132679808 }
radiance 17
center -41.80121612548828 0 -125.620361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41475030892947906 0.40760647822413343 0.9 }
radiance 30
center -25.332719802856445 0 -120.29092407226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9327169536734059 0.46752888525895586 0.9093559766101641 }
radiance 16
center -22.592945098876953 0 -100.03826141357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9217152997048077 0.49390040590992784 0.8109483795185732 }
radiance 28
center -31.52276611328125 0 -115.87760162353516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31978717623398445 0.41625532418373457 }
radiance 25
center -32.16931915283203 0 -131.13638305664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4536544906548118 0.558809750336195 }
radiance 28
center -43.48509216308594 0 -134.76332092285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8922080419914384 0.3320477003389772 0.8027940432223452 }
radiance 30
center -27.64455795288086 0 -116.80785369873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7460898552993978 0.3522479944093468 0.9 }
radiance 17
center -48.9979248046875 0 -123.7060775756836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40523410198124593 0.5542991017192703 }
radiance 26
center -21.206741333007812 0 -119.71723175048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8361240450844845 0.46037059665911473 0.8900082843875088 }
radiance 31
center -59.856048583984375 0 -96.21410369873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8332505109968095 0.37886248540086764 0.9286844349678012 }
radiance 26
center -38.96186828613281 0 -129.62709045410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8413074096624882 0.4161138323310025 0.9018310281646793 }
radiance 21
center -32.63088607788086 0 -123.4070053100586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3208327655953396 0.40358622351837714 }
radiance 29
center -41.121639251708984 0 -106.17910766601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8975312188472452 0.3726993447678624 0.8081379483672064 }
radiance 21
center -56.310482025146484 0 -115.89596557617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447510736768447 0.33181591579456526 0.9402321278971107 }
radiance 23
center -36.306129455566406 0 -124.21856689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4371908879672427 0.6072986476828023 }
radiance 28
center -63.09218215942383 0 -116.18141174316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3933646387115832 0.5194824737542375 }
radiance 26
center -56.930389404296875 0 -115.389892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9522319243073829 0.36563243272601 0.8621224935958808 }
radiance 29
center -55.82146453857422 0 -129.73179626464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.889696460317661 0.3287726714313438 0.8807804266518252 }
radiance 20
center -28.59137725830078 0 -124.8165512084961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9733374018101644 0.4707096714404743 0.9436812514141111 }
radiance 21
center -48.19984817504883 0 -116.96784210205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43068316074546675 0.6703481797432101 }
radiance 27
center -39.08494186401367 0 -131.4775848388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.855824385556835 0.446331398878797 0.8581100426066144 }
radiance 28
center -47.32575607299805 0 -113.95801544189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4572476879485158 0.32239604457105375 0.9 }
radiance 19
center -39.72238540649414 0 -105.68376159667969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8266016645030924 0.3328705529851986 0.8222126253918989 }
radiance 24
center -31.519790649414062 0 -129.22164916992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992924709310955 0.4793306506088769 0.918836056061316 }
radiance 24
center -20.274076461791992 0 -121.78795623779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8686721072537493 0.41972343185057515 0.8861793020890835 }
radiance 22
center -22.08598518371582 0 -101.65811157226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8629296899644645 0.31227130908198203 0.8963893946624517 }
radiance 26
center -35.31668472290039 0 -114.57327270507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9271070386749949 0.46695542058794626 0.8285657153088568 }
radiance 31
center -27.515546798706055 0 -139.93475341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4739990222676642 0.6116243561035469 }
radiance 29
center -20.796546936035156 0 -105.69605255126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9337326295262007 0.4388912646911173 0.9992318158968064 }
radiance 21
center -28.07259750366211 0 -106.56890106201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9043710079771372 0.39235543791755956 0.8424982730277734 }
radiance 20
center -11.539729118347168 0 -105.50538635253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9335894089685385 0.32512262147514553 0.9365683807852679 }
radiance 19
center -46.911277770996094 0 -131.88754272460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8901856777034626 0.46340533558305136 0.8463525084844173 }
radiance 25
center -46.6629524230957 0 -129.18939208984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8067932253263737 0.3019347872808365 0.8334925819214549 }
radiance 31
center -46.436405181884766 0 -127.6761245727539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4999323875080026 0.6544482718955873 }
radiance 21
center -9.537720680236816 0 -129.64315795898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.649745451144904 0.4454982291083196 0.9 }
radiance 28
center -10.441267013549805 0 -107.63717651367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8113460559884903 0.3803801657053705 0.803859988154079 }
radiance 16
center -35.599403381347656 0 -126.24226379394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3446282798509564 0.7258175482348187 }
radiance 25
center -34.30398941040039 0 -126.31425476074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9554013277895999 0.41954077680481755 0.934050289528833 }
radiance 30
center -35.83341598510742 0 -98.78458404541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3439549898821062 0.8143384298679595 }
radiance 19
center -26.014230728149414 0 -137.2584991455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4906496261073038 0.43930754296792496 }
radiance 19
center -18.91485595703125 0 -111.81304168701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49471976180636446 0.8206851887163116 }
radiance 23
center -9.959979057312012 0 -110.37635803222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8155236805855903 0.48595023647344326 0.9 }
radiance 24
center -16.07358741760254 0 -103.28582763671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7146622548173799 0.390137020414313 0.9 }
radiance 24
center -18.65450668334961 0 -110.31083679199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9957340285508568 0.46109482904963117 0.8978270697190406 }
radiance 21
center -12.246413230895996 0 -134.7775421142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8723840715984624 0.44204332881685693 0.9209148704045992 }
radiance 16
center -5.724493980407715 0 -119.3050308227539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9435019941725593 0.3181293904356842 0.8556167342546908 }
radiance 31
center -23.0782470703125 0 -126.31971740722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7009806158913212 0.30033530676718595 0.9 }
radiance 24
center -28.353565216064453 0 -107.91758728027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4610267503329384 0.6951019673018805 }
radiance 25
center -7.780399799346924 0 -129.73768615722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9176917385153436 0.46990813426559364 0.8873739888641565 }
radiance 23
center -28.750812530517578 0 -139.7726593017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8612940197430556 0.42546303053287204 0.8271864342064508 }
radiance 19
center -21.003246307373047 0 -117.11709594726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5889492731299655 0.3910220348790001 0.9 }
radiance 16
center 1.9783220291137695 0 -128.0038299560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4814189711197102 0.33436455961095585 0.9 }
radiance 23
center -19.680192947387695 0 -131.64364624023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36688372842973993 0.7184949926010209 }
radiance 23
center -3.00459885597229 0 -103.85221099853516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9640364613209486 0.39745411358318705 0.9674188814089191 }
radiance 24
center -0.4172896146774292 0 -141.6158447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8609703653755036 0.4670386016540055 0.9919486625503765 }
radiance 29
center -35.831825256347656 0 -133.84182739257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4034002161737861 0.6635222711545963 }
radiance 19
center -1.288886547088623 0 -106.2788314819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.982688018617188 0.40943474584491313 0.8840615219708977 }
radiance 17
center -25.06361961364746 0 -143.4388427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9703316570503507 0.30051521471820536 0.8972385564002918 }
radiance 16
center -33.00171661376953 0 -108.02833557128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4305231027229822 0.6332882988642121 }
radiance 26
center 6.404747486114502 0 -102.56539916992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9958183267660972 0.3991562365821426 0.92245096818134 }
radiance 24
center -19.2819881439209 0 -103.9267349243164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49004584771903403 0.3589484886230964 0.9 }
radiance 24
center -22.16791534423828 0 -124.72032928466797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.708677294772824 0.4239530737958961 0.9 }
radiance 25
center -20.128040313720703 0 -144.00927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44693108800926273 0.6767087764144658 }
radiance 25
center 18.368850708007812 0 -109.81495666503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8434586463505929 0.35223561390108105 0.8195172532542615 }
radiance 30
center -7.063503742218018 0 -103.2911148071289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9631914191118545 0.3364644637895213 0.9710600734556911 }
radiance 25
center -22.56501579284668 0 -102.54216003417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8809363437926038 0.47303775312006646 0.8420296608618068 }
radiance 31
center 3.3376247882843018 0 -137.97279357910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8247237690314743 0.33442940294268236 0.8943855545212281 }
radiance 16
center -15.678666114807129 0 -104.76116180419922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8392087078643422 0.31006353983806295 0.9943812343000237 }
radiance 23
center -14.136027336120605 0 -136.1478271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4116713233949807 0.8914130187932844 }
radiance 28
center -8.330957412719727 0 -103.07758331298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43287788659943 0.7625061535782178 }
radiance 26
center 6.272208213806152 0 -115.2223129272461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9693840721725702 0.38454639121794654 0.9646919430664928 }
radiance 26
center -2.7148144245147705 0 -110.51663970947266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9103934670734228 0.39803570166393965 0.9315784757675964 }
radiance 23
center 16.709440231323242 0 -126.86954498291016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8587968397627075 0.4574922476858988 0.9360793662964318 }
radiance 19
center 2.621295213699341 0 -134.26138305664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8674245239616561 0.466859783681224 0.941081535435343 }
radiance 31
center 4.2791008949279785 0 -129.51849365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34150909830906767 0.7681768490072474 }
radiance 26
center -14.472829818725586 0 -117.68867492675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8180796364866023 0.42820424680090274 0.9404489299940647 }
radiance 29
center 7.160797595977783 0 -127.55885314941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9476550094805026 0.33429198357368667 0.8589365235179417 }
radiance 25
center -21.369731903076172 0 -111.28148651123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8157108560653851 0.4253008487728579 0.9 }
radiance 27
center 3.3712470531463623 0 -116.57032012939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4393026574307576 0.3182370145343427 0.9 }
radiance 18
center -23.73405647277832 0 -111.60480499267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5841996118837184 0.4620998220259951 0.9 }
radiance 16
center 21.74942970275879 0 -123.32542419433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8303597049059825 0.4956765253926565 0.8276578355433355 }
radiance 20
center 31.201942443847656 0 -120.54463195800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8154220593606514 0.3451216802526866 0.9676329206987558 }
radiance 27
center 10.149724960327148 0 -132.2836151123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8666647564457439 0.3995618914599999 0.9502395496713982 }
radiance 19
center 31.644222259521484 0 -109.65805053710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8171376044872531 0.3606015974612234 0.919304523666937 }
radiance 20
center 4.150110244750977 0 -126.4745864868164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.875778790876383 0.48924403467838723 0.8842868600824616 }
radiance 22
center 31.441152572631836 0 -130.85330200195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3009834182555393 0.4043010722414647 }
radiance 18
center 0.3310367166996002 0 -106.75743865966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9839728843602163 0.3306061882822926 0.914479973295312 }
radiance 22
center 18.853336334228516 0 -126.72881317138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8361532051034636 0.440242853028109 0.9 }
radiance 18
center 18.145980834960938 0 -122.97380065917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7093137086937461 0.31776812223013184 0.9 }
radiance 19
center 10.483738899230957 0 -105.4096450805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9950005022100105 0.48044998691509233 0.8538155519974584 }
radiance 19
center 19.425724029541016 0 -115.00775146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8285825464976885 0.47411691215155005 0.9 }
radiance 29
center 12.689751625061035 0 -113.18018341064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9993207261818107 0.4529213743120266 0.8718726615903365 }
radiance 31
center 0.5382953882217407 0 -128.69520568847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9480639363647496 0.4167309597730562 0.906022108927053 }
radiance 29
center 1.2105177640914917 0 -141.1244659423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9506300669604029 0.47588635395821643 0.9150371383083021 }
radiance 19
center -3.3732194900512695 0 -123.3554458618164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9882244103972402 0.3577512135723274 0.8958642215613457 }
radiance 23
center 8.327505111694336 0 -104.59529876708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8243201569865672 0.3157595392685632 0.9388442657186975 }
radiance 26
center 22.84694480895996 0 -138.15777587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8889601538057632 0.390120843425602 0.8542941155858759 }
radiance 22
center 18.313465118408203 0 -100.60137176513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4692490785061515 0.4946746377670437 0.9 }
radiance 18
center 29.944326400756836 0 -139.26007080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.877987444247279 0.34533166917284036 0.9 }
radiance 17
center 6.11935567855835 0 -135.58349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7278377665373557 0.3330154003524314 0.9 }
radiance 23
center 21.433513641357422 0 -125.06324005126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9943303806973557 0.4474378738834776 0.8226877001882926 }
radiance 27
center 35.164878845214844 0 -131.2640380859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9361695240881804 0.4398903101840581 0.8111214641011456 }
radiance 22
center 39.66987228393555 0 -103.89259338378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8752053278479814 0.49701612638909254 0.8470486015956937 }
radiance 19
center 14.001752853393555 0 -115.95742797851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4265144376739085 0.4392684302909776 0.9 }
radiance 30
center 9.943379402160645 0 -105.0842056274414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8725691689980979 0.31318669053488024 0.9 }
radiance 26
center 21.009037017822266 0 -136.48388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37813494114562485 0.40767987793218163 }
radiance 23
center 4.941121578216553 0 -107.17534637451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8055875776537319 0.4523703292301282 0.9077887108979588 }
radiance 24
center 28.294376373291016 0 -128.92694091796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.919662454533736 0.4263622807398969 0.840876515560529 }
radiance 27
center 17.034467697143555 0 -100.01445770263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8843339085728976 0.4027790868289318 0.8209877266513724 }
radiance 21
center 19.546775817871094 0 -122.56049346923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9816237041711773 0.4255796349853723 0.9553963114309765 }
radiance 19
center 36.766536712646484 0 -140.92788696289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.882355936798604 0.3799424646605413 0.951897961723341 }
radiance 26
center 28.49338722229004 0 -108.76399993896484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.895956832491385 0.3647287763771726 0.9500556192597303 }
radiance 16
center 2.221919059753418 0 -137.92703247070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9315118856810573 0.3948078556433292 0.9530411231899127 }
radiance 18
center 12.07924747467041 0 -115.62297058105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9239752693657459 0.3198907387028919 0.8292328970855916 }
radiance 28
center 2.5598981380462646 0 -131.6896514892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.805867659294956 0.38625153850195815 0.9185746839946092 }
radiance 29
center 43.684844970703125 0 -99.25799560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9233877865276255 0.37394121624067156 0.9630066858587902 }
radiance 30
center 20.46154022216797 0 -126.16395568847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3647982313348346 0.4651954891209996 }
radiance 17
center 10.723739624023438 0 -104.03885650634766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37105301709917804 0.47029183225834015 }
radiance 31
center 8.664366722106934 0 -138.65451049804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9945898901919799 0.46176687131307 0.8387347739107001 }
radiance 26
center 25.559110641479492 0 -118.5724105834961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8826646784327347 0.4609206321427123 0.9194061557042394 }
radiance 31
center 53.223453521728516 0 -131.9767608642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8584712088896562 0.43821859401313135 0.8195000510648678 }
radiance 22
center 26.8714656829834 0 -120.99067687988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9952164166848062 0.4177772770654702 0.9806364636644807 }
radiance 29
center 38.31168746948242 0 -132.47621154785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6595625726549887 0.35284358378500036 0.9 }
radiance 31
center 38.09806823730469 0 -124.19833374023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.329892821313174 0.6864918931414518 }
radiance 24
center 22.626605987548828 0 -118.36454772949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9457300113565851 0.37781136818307304 0.9100573512602536 }
radiance 19
center 56.97169876098633 0 -107.56999969482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8318375704240784 0.3697607571508972 0.9 }
radiance 24
center 45.85693359375 0 -116.994873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4028196779739732 0.4542806679994771 }
radiance 19
center 42.11532974243164 0 -134.06402587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30498897262239827 0.44474274991342455 }
radiance 24
center 36.49507522583008 0 -126.47319030761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8249813019482964 0.3359366542253728 0.8215518018007903 }
radiance 31
center 40.95309829711914 0 -116.14462280273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8951967840207856 0.3917037721180549 0.996949314985877 }
radiance 24
center 20.897018432617188 0 -124.23560333251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.895138373037707 0.44908996390966077 0.9015011843074068 }
radiance 20
center 54.44853210449219 0 -135.84783935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8364942797860162 0.3912401377282724 0.9121558557971455 }
radiance 18
center 28.385793685913086 0 -126.08452606201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9688233423572277 0.31747914075162115 0.9903219564880107 }
radiance 29
center 27.92033576965332 0 -137.03001403808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8627775510596235 0.47244661645555286 0.8838226885090585 }
radiance 21
center 55.80386734008789 0 -136.77525329589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4919283460997834 0.34985444099977814 0.9 }
radiance 28
center 44.38102722167969 0 -123.91453552246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41051642025084284 0.4813376640412309 }
radiance 22
center 18.697858810424805 0 -127.81602478027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9788639533723344 0.48498030574255735 0.929982808557605 }
radiance 19
center 59.31150817871094 0 -119.92632293701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8783852235656238 0.3961260039306932 0.8749434895317942 }
radiance 21
center 40.84984588623047 0 -115.99664306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8969674658230306 0.33819036451478807 0.8959728648318616 }
radiance 20
center 47.50562286376953 0 -138.22137451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4913831913695542 0.4033815552317641 }
radiance 26
center 56.480812072753906 0 -117.65634155273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9584553782889554 0.31528075833536384 0.9235039573453145 }
radiance 21
center 48.54970932006836 0 -92.96134948730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9074130778913624 0.3332837185945215 0.9246890549099166 }
radiance 17
center 38.71531295776367 0 -114.92687225341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8679817149301592 0.4589585446571282 0.8715706323982015 }
radiance 30
center 36.368934631347656 0 -97.5792465209961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8046095246685178 0.43765513007818607 0.8176683299401672 }
radiance 17
center 68.67794036865234 0 -125.43706512451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4113009599736933 0.476571332844432 0.9 }
radiance 20
center 70.99458312988281 0 -120.25325012207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8647688969735785 0.4387555761346532 0.9028934456194786 }
radiance 25
center 33.44652557373047 0 -100.56784057617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9745831279234907 0.4892411836060474 0.9584166116528897 }
radiance 31
center 51.72815704345703 0 -131.5082550048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33579384712902094 0.48227830944206673 }
radiance 28
center 48.137229919433594 0 -123.27873992919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206298767684293 0.3127239692691101 0.8672899273756011 }
radiance 27
center 66.63233184814453 0 -94.02608489990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9727440400964353 0.39641625627973487 0.8326294286228875 }
radiance 18
center 72.949951171875 0 -105.8756332397461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9058615173684327 0.4190458153917104 0.991913575404562 }
radiance 19
center 70.62092590332031 0 -110.0382080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6899087662470524 0.32130369759419364 0.9 }
radiance 25
center 38.682010650634766 0 -90.62315368652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8318393323206754 0.4498416650184228 0.8042624484608127 }
radiance 22
center 69.63971710205078 0 -96.16063690185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.964792189827792 0.37873355971958844 0.8421044258435015 }
radiance 26
center 46.0865364074707 0 -125.60060119628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8884947180729781 0.41521679561343733 0.803578405615758 }
radiance 25
center 62.0665168762207 0 -125.29883575439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6131854432756177 0.3522747422235942 0.9 }
radiance 18
center 39.745994567871094 0 -126.87396240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9474947169012835 0.3528484603199192 0.8287270876426897 }
radiance 30
center 50.24320602416992 0 -94.00166320800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8421997261858867 0.32452586430364444 0.8436380966214869 }
radiance 21
center 48.717323303222656 0 -107.7358169555664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9898754038696327 0.34828308094558225 0.9840990751279686 }
radiance 24
center 39.56716537475586 0 -106.49668884277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8033698987872375 0.3122850968554396 0.9812714131606298 }
radiance 28
center 66.01624298095703 0 -98.56707000732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9178280790889072 0.3518276985585545 0.8050269404008317 }
radiance 31
center 68.21183013916016 0 -88.78034973144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.856014796167085 0.3793004112350006 0.8463958531670259 }
radiance 29
center 75.59202575683594 0 -120.69499206542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9483516426437579 0.3317531250732873 0.9895281569535178 }
radiance 17
center 48.727928161621094 0 -114.21516418457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4994687412150858 0.4451839115428901 0.9 }
radiance 20
center 82.03173828125 0 -107.5698471069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7472891048748085 0.45212812094282695 0.9 }
radiance 29
center 63.36201095581055 0 -118.61518859863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3502007290617772 0.8058407863904555 }
radiance 18
center 89.24632263183594 0 -110.72956848144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.863893212380882 0.33555345779222884 0.935536028299286 }
radiance 28
center 85.18192291259766 0 -91.2447280883789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3767357159725841 0.827404720036857 }
radiance 30
center 55.89958190917969 0 -117.1269760131836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8689371545900495 0.48178410471714916 0.9782169009749055 }
radiance 28
center 59.977474212646484 0 -100.56851959228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8665803128812339 0.39149712323223795 0.9836297360182519 }
radiance 16
center 48.272891998291016 0 -120.54061126708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9082306449297429 0.35501015324279256 0.9274352112842363 }
radiance 28
center 61.195255279541016 0 -110.02306365966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9746363310705133 0.4537905555006254 0.9959479054926437 }
radiance 19
center 87.30167388916016 0 -95.98118591308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8627061468227188 0.3907017515715919 0.8689482639613151 }
radiance 20
center 53.82925033569336 0 -94.66895294189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9132012870018418 0.3482717042600385 0.9331014880242977 }
radiance 24
center 84.02708435058594 0 -125.23954010009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40026146731683954 0.31894807948848297 0.9 }
radiance 20
center 89.18218994140625 0 -85.9189224243164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8587964879351793 0.48153701718515873 0.806528934949411 }
radiance 17
center 64.27061462402344 0 -94.25617218017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9370542607156682 0.47427214535649154 0.8451572470753121 }
radiance 24
center 77.152099609375 0 -94.95841217041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9837904999754156 0.454812500536285 0.994491890758951 }
radiance 17
center 64.10584259033203 0 -104.84806060791016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411144960454473 0.4395548511160534 0.8312993603483199 }
radiance 20
center 66.1150894165039 0 -116.24748229980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9503510382317146 0.36102104298005855 0.9888058774966527 }
radiance 18
center 95.69694519042969 0 -114.17862701416016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7879705856522138 0.35169480509946066 0.9 }
radiance 31
center 63.78898239135742 0 -98.54960632324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9399190451032446 0.36340009530676526 0.9736664235057992 }
radiance 23
center 95.12091827392578 0 -116.31460571289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8106605973271641 0.44806396361037293 0.9352717392839064 }
radiance 31
center 86.2021255493164 0 -97.67047882080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9847621020347941 0.44144892305896666 0.8373475287179892 }
radiance 20
center 88.022705078125 0 -116.08345794677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9312686097078334 0.42617943119822405 0.8324721352856568 }
radiance 21
center 62.24296188354492 0 -109.48115539550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8211882990978687 0.39613200001144366 0.9993171777013125 }
radiance 21
center 83.72319793701172 0 -77.51276397705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9183772722176513 0.3759447330344362 0.8291462274173205 }
radiance 16
center 96.63340759277344 0 -106.4281997680664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8580364701784781 0.34461192680116565 0.8279922550434391 }
radiance 17
center 82.72894287109375 0 -113.6527328491211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.575657133379404 0.3391326813790635 0.9 }
radiance 25
center 90.03040313720703 0 -112.40186309814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5080197616801203 0.3534850754532988 0.9 }
radiance 25
center 69.13788604736328 0 -78.13512420654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9375133799017517 0.33231927627171964 0.8712687940888134 }
radiance 30
center 62.5927734375 0 -90.2168197631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9052146838442408 0.39422157586334217 0.8964597326556369 }
radiance 31
center 71.37351989746094 0 -112.64031982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8517694703815717 0.4271069387469774 0.9 }
radiance 23
center 77.93696594238281 0 -100.4156494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8609323628886936 0.4212057946347105 0.9 }
radiance 20
center 87.15283966064453 0 -87.84493255615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.988033581219408 0.475781478783841 0.8881083846284143 }
radiance 23
center 101.73805236816406 0 -116.51605987548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40662401640030366 0.7177352597441222 }
radiance 26
center 61.72230911254883 0 -90.59072875976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8710896240858793 0.4741200719066254 0.9463932762523928 }
radiance 24
center 96.72380065917969 0 -93.09160614013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8891874297409799 0.3566342959768047 0.8895293375705675 }
radiance 28
center 80.05319213867188 0 -103.83856964111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8782127169604229 0.42138961026316346 0.861100890865526 }
radiance 31
center 78.20281982421875 0 -109.13130187988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4316529348802226 0.5010545208277057 }
radiance 20
center 76.60155487060547 0 -94.64261627197266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6428625176665702 0.49841398447543706 0.9 }
radiance 24
center 77.15374755859375 0 -74.78556060791016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9240023157768897 0.45698748197099637 0.9558956348194534 }
radiance 28
center 75.02777862548828 0 -68.40165710449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9062789248827001 0.4735104099223729 0.8625179540838922 }
radiance 23
center 76.47767639160156 0 -75.83576965332031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3192978470513363 0.833145156444277 }
radiance 17
center 106.78944396972656 0 -67.52017974853516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8578009540219907 0.4660722465351638 0.9276131054666963 }
radiance 21
center 92.81340026855469 0 -69.40681457519531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.861059207940639 0.3665688164313108 0.9363777791779992 }
radiance 19
center 100.52971649169922 0 -88.42715454101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43238661622848595 0.8971873355224821 }
radiance 21
center 89.72498321533203 0 -92.93275451660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.367374523673353 0.5796970953237226 }
radiance 16
center 96.91233825683594 0 -91.7922592163086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9451614165377815 0.4577558703845833 0.9332304801404487 }
radiance 20
center 84.22366333007812 0 -92.08758544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41155150171698485 0.615354494447028 }
radiance 28
center 75.35493469238281 0 -75.10352325439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9884428410260812 0.3997814709515381 0.8823878327915957 }
radiance 27
center 110.77651977539062 0 -98.7039794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44810970157554664 0.7416052820978896 }
radiance 19
center 96.62455749511719 0 -93.87432098388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.898404566406465 0.3613388789259064 0.9390678603437186 }
radiance 27
center 97.0671157836914 0 -92.91726684570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998727016303661 0.45324205883585045 0.9854927620773255 }
radiance 24
center 94.98298645019531 0 -72.09874725341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7579378968981808 0.4023672939466596 0.9 }
radiance 31
center 89.19554901123047 0 -100.75535583496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8311337682445102 0.47730071050866485 0.9133770974733652 }
radiance 24
center 103.3563461303711 0 -92.33387756347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.955647816143421 0.4658531887063739 0.9134461547682573 }
radiance 30
center 80.72380065917969 0 -88.1553726196289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9118285270842218 0.4725198138945239 0.9851875218578394 }
radiance 28
center 88.32566833496094 0 -91.49503326416016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33834495382852287 0.7534199815300906 }
radiance 26
center 80.40281677246094 0 -81.5298080444336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9815157120287793 0.31328505289309666 0.8288232315561903 }
radiance 26
center 113.84866333007812 0 -72.27568817138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8400974344122452 0.4545467299312373 0.8017182218402304 }
radiance 29
center 121.69792938232422 0 -73.99785614013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49435865683235497 0.6573055296140831 }
radiance 17
center 90.15994262695312 0 -93.11210632324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8829441531283455 0.38499561500201485 0.9847383959959901 }
radiance 30
center 89.41387176513672 0 -84.9350814819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8427213887140993 0.3012631839465065 0.8929722616428876 }
radiance 22
center 106.02845001220703 0 -91.1895751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9438998363859327 0.400142873356946 0.9863072612692715 }
radiance 20
center 90.4662094116211 0 -76.708740234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5573139258379385 0.3398190347766184 0.9 }
radiance 23
center 93.10418701171875 0 -78.6242904663086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.605432532856133 0.41569151893714684 0.9 }
radiance 24
center 96.60847473144531 0 -69.24757385253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8012497914406306 0.35369885711019694 0.8686778040641876 }
radiance 18
center 114.020751953125 0 -84.06206512451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5343911581460542 0.37870718722272867 0.9 }
radiance 17
center 86.25701141357422 0 -90.50164031982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8699493088192624 0.433832917907857 0.9165142358613961 }
radiance 20
center 102.39340209960938 0 -77.57585144042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8277322941941001 0.4361493247856442 0.8773631668432568 }
radiance 27
center 86.20856475830078 0 -56.925968170166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8800996701144281 0.47094465751176295 0.8853369476911126 }
radiance 20
center 118.5804443359375 0 -60.81132888793945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5601917052382251 0.39580640828826663 0.9 }
radiance 20
center 84.66419219970703 0 -63.27598190307617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.652760413871221 0.40696225470495 0.9 }
radiance 28
center 107.02955627441406 0 -74.52931213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9556090302945989 0.42397340455010013 0.9060809096395797 }
radiance 18
center 103.92267608642578 0 -89.72138214111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6236369953172052 0.33709567733297335 0.9 }
radiance 31
center 95.51888275146484 0 -67.85342407226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.894257146214988 0.33537282672001084 0.9865942041290463 }
radiance 19
center 96.67888641357422 0 -67.66978454589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9773110579885236 0.41431465054060734 0.8104491682259478 }
radiance 30
center 97.52442169189453 0 -74.60733032226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9905304810438775 0.39836592553172573 0.9835495136609282 }
radiance 26
center 87.73772430419922 0 -65.150146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8514915750202892 0.47169311738195474 0.8361854155966041 }
radiance 31
center 93.56149291992188 0 -79.71923065185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9522678050451064 0.38546797578796754 0.8623082285983764 }
radiance 19
center 93.22711944580078 0 -52.84355163574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44538471733912494 0.41780773372484015 }
radiance 30
center 112.98098754882812 0 -80.6331558227539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.912264769238716 0.42440366486998304 0.9082879422721486 }
radiance 25
center 94.16596221923828 0 -64.59678649902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6669707878147496 0.35338021496315253 0.9 }
radiance 29
center 126.70500946044922 0 -68.49951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41590055129893017 0.7414384151758675 }
radiance 21
center 125.2960433959961 0 -65.7880630493164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5651499760714751 0.46233890442860714 0.9 }
radiance 25
center 97.05211639404297 0 -62.3839225769043
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8811500870493312 0.3851947139819349 0.9438249693348315 }
radiance 25
center 124.51176452636719 0 -78.5555648803711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4487138661467108 0.8735142144382232 }
radiance 29
center 103.87650299072266 0 -78.29727172851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9944820474111243 0.42573886718856796 0.8152345086909498 }
radiance 27
center 102.81828308105469 0 -62.79112243652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9848794521434279 0.4505561428459259 0.9463152310869823 }
radiance 23
center 125.753173828125 0 -81.26559448242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8206284293926922 0.45910995625323736 0.8297246320471838 }
radiance 24
center 111.29722595214844 0 -43.84037399291992
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9560219273105052 0.3293908816430228 0.8200175303251843 }
radiance 18
center 112.53873443603516 0 -58.58182907104492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7149553553432647 0.32332040708957765 0.9 }
radiance 22
center 131.65765380859375 0 -48.987754821777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5077837832050246 0.48910580655047 0.9 }
radiance 30
center 93.36972045898438 0 -77.36713409423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35209328581131777 0.6054651642782302 }
radiance 16
center 125.02284240722656 0 -76.42153930664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9414362797232325 0.45407874114058255 0.8698612258515381 }
radiance 16
center 110.37820434570312 0 -60.591697692871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38503733976135823 0.8433428841810019 }
radiance 20
center 117.10194396972656 0 -68.22624969482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8801956616126202 0.3555192790963924 0.9301473327371024 }
radiance 16
center 126.11526489257812 0 -59.895362854003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3505943946710704 0.8079487573683597 }
radiance 18
center 106.99726867675781 0 -56.676231384277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5342435141679892 0.4413908056308246 0.9 }
radiance 28
center 124.78215789794922 0 -55.792579650878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9711828680015292 0.3189767058926775 0.9236645667407434 }
radiance 22
center 122.46937561035156 0 -58.34458541870117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9972600822186286 0.4724128022313312 0.93415068883544 }
radiance 21
center 127.53430938720703 0 -48.64247131347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8310092218695446 0.4419409527148698 0.8956578061253077 }
radiance 26
center 132.81295776367188 0 -31.521013259887695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9280092182722955 0.4718132893403939 0.8739423056461022 }
radiance 20
center 114.94209289550781 0 -59.22743225097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4171761738232932 0.7545106637017135 }
radiance 26
center 130.28729248046875 0 -58.06195831298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3670863018505026 0.41701854300957863 }
radiance 25
center 105.12028503417969 0 -43.17231369018555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8920623199712887 0.3036712868112927 0.8554523061057052 }
radiance 17
center 113.66770935058594 0 -35.38705825805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8207872937566105 0.3158355627349295 0.8437263904282819 }
radiance 25
center 126.6337661743164 0 -64.96844482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3599354519397269 0.6257106260413501 }
radiance 20
center 117.18787384033203 0 -49.34271240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9986958304651371 0.31834536507955835 0.8660309958479615 }
radiance 29
center 127.80593872070312 0 -29.50486183166504
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8972721065355216 0.4289615531976252 0.8790037812552498 }
radiance 16
center 113.88365936279297 0 -56.59389877319336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9469286638279311 0.47599263635607425 0.9633315223770966 }
radiance 19
center 122.97305297851562 0 -53.697017669677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411481565916532 0.47596972625944395 0.8506535458897728 }
radiance 30
center 103.61231231689453 0 -32.25565719604492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8574053887909865 0.34729107506241635 0.9013511906423434 }
radiance 28
center 133.0616455078125 0 -42.62566375732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4434503673753295 0.3048527511609817 0.9 }
radiance 31
center 109.47715759277344 0 -60.686100006103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8535373670772808 0.42708066592355365 0.9815745944452885 }
radiance 30
center 130.05052185058594 0 -63.23386764526367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8551044616698285 0.48292266469780476 0.8158143124095911 }
radiance 31
center 101.40592193603516 0 -62.79661560058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.464078012661127 0.41238637752007956 0.9 }
radiance 29
center 102.5221176147461 0 -50.76885223388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8076777927837098 0.36117585126732227 0.9 }
radiance 28
center 113.15499114990234 0 -65.5711441040039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.933288719338944 0.4016923036293915 0.922428566797246 }
radiance 17
center 138.22372436523438 0 -15.96259880065918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9556808379749293 0.30837811780295776 0.970985087199851 }
radiance 22
center 110.19654083251953 0 -41.2541389465332
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9999806669815583 0.3294891202685988 0.8527540239988025 }
radiance 26
center 141.49697875976562 0 -34.73585510253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9880567297173537 0.3370347127606638 0.8012097173095762 }
radiance 17
center 119.30176544189453 0 -43.420799255371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7485177162127119 0.47942724051749674 0.9 }
radiance 20
center 127.65042877197266 0 -44.674747467041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8273178302560069 0.3905753411224146 0.9350117120157925 }
radiance 20
center 117.49661254882812 0 -42.31669235229492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8431440250690941 0.4618291335083705 0.9271432187639089 }
radiance 26
center 122.22431945800781 0 -38.638092041015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8590861894192846 0.46956958646784164 0.8649241633717932 }
radiance 16
center 111.87104034423828 0 -46.59627151489258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9383593274161355 0.35349307165396915 0.872496621595023 }
radiance 16
center 112.81476593017578 0 -16.316410064697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3206880080467609 0.5399735881001966 }
radiance 31
center 120.26065063476562 0 -40.86952209472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9796568218345882 0.36252127930211153 0.839124947731278 }
radiance 27
center 112.99429321289062 0 -23.336132049560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8490275941738425 0.48493707799127883 0.9633868007756874 }
radiance 20
center 108.8813247680664 0 -34.666053771972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8169949229902244 0.4029587648861658 0.8352538406915827 }
radiance 30
center 135.91107177734375 0 -34.25389862060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8824782519045867 0.395022144373959 0.8938411096470584 }
radiance 18
center 138.27774047851562 0 -36.83235168457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.914060713283655 0.46471687547111573 0.9887603030668441 }
radiance 17
center 132.52687072753906 0 -50.60807418823242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.869160183205201 0.37214731268842727 0.9259655207055714 }
radiance 19
center 123.42411041259766 0 -29.189538955688477
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8214375276771918 0.43132941712558726 0.8042752622836853 }
radiance 27
center 110.53370666503906 0 -16.762109756469727
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8563668709717078 0.34263420135156203 0.9 }
radiance 30
center 106.68903350830078 0 -27.47541618347168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9905001567931246 0.3543039121281759 0.9244602722422153 }
radiance 26
center 133.97915649414062 0 -45.35416030883789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.993650980231404 0.3210141531277597 0.9175789948444768 }
radiance 30
center 120.05134582519531 0 -22.513978958129883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8709096099669384 0.450074768056534 0.9233376566850966 }
radiance 27
center 107.61268615722656 0 -15.027009963989258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6525834119511692 0.4673344581454428 0.9 }
radiance 29
center 142.7608184814453 0 -18.578786849975586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5701719947340228 0.4247319793436324 0.9 }
radiance 22
center 130.84849548339844 0 -12.058716773986816
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9592017678226388 0.3426949454737681 0.9842115763150022 }
radiance 22
center 112.44622039794922 0 -21.672895431518555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8935316906510904 0.39751776419029466 0.865712325514363 }
radiance 24
center 145.16065979003906 0 -28.14383888244629
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9824227104829736 0.4446347123702967 0.8608772635773387 }
radiance 28
center 127.7601089477539 0 -6.507105350494385
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9428419574799708 0.40993945886879146 0.8315908595270057 }
radiance 17
center 120.0728988647461 0 -25.828041076660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9428610840523863 0.49241095513327215 0.8986431652365219 }
radiance 26
center 140.9710693359375 0 -33.28702163696289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8899433350180072 0.4564904524109299 0.9922159104834315 }
radiance 31
center 111.26878356933594 0 -16.550323486328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9652861989920977 0.4491747831972782 0.9045424668922581 }
radiance 19
center 126.88931274414062 0 -8.841470718383789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8936739923790491 0.31928312010571924 0.8803757642788335 }
radiance 24
center 108.27169799804688 0 -12.60256290435791
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834871459514257 0.47111751711788963 0.9798859173229982 }
radiance 20
center 138.51315307617188 0 -15.061453819274902
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4000208281434763 0.36785330398754645 0.9 }
radiance 25
center 144.3612060546875 0 -26.526391983032227
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8790702438508256 0.33186077714997864 0.9112938676138618 }
radiance 29
center 130.66619873046875 0 -3.452716588973999
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842915986515395 0.30784060602540625 0.847553817392126 }
radiance 30
center 141.4110565185547 0 -24.356197357177734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9005183117907699 0.4499348322237947 0.8653536540913805 }
radiance 30
center 115.08486938476562 0 -5.157786846160889
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.845515513637327 0.41840070457390766 0.9 }
radiance 19
center 116.19816589355469 0 -38.759891510009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8023526590721729 0.37665539884140026 0.8360055495897942 }
radiance 30
center 132.2604522705078 0 -29.221864700317383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8020645504434697 0.45060608659504875 0.8070268918994051 }
radiance 18
center 144.529052734375 0 0.09221110492944717
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9037893392747847 0.4674747839951145 0.9077175428666827 }
radiance 19
center 127.330810546875 0 -4.664420127868652
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.840120710646843 0.4886735736246526 0.863638461930431 }
radiance 21
center 128.18418884277344 0 4.095783233642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4753593937801939 0.4385620873520111 0.9 }
radiance 26
center 143.38014221191406 0 9.21824836730957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9891388085220044 0.3522250774878966 0.9745209797092446 }
radiance 22
center 110.79806518554688 0 -21.789566040039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9912471368815845 0.4406552330759492 0.839748034544634 }
radiance 25
center 111.77799987792969 0 -4.382948398590088
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8857526180458396 0.451091391194841 0.9519160879563437 }
radiance 31
center 110.56126403808594 0 -10.744763374328613
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8655537089936163 0.472245008730924 0.9 }
radiance 17
center 141.9844512939453 0 -10.006561279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8636678478169418 0.3813200621571956 0.8652417110902627 }
radiance 28
center 115.1683349609375 0 -3.4156928062438965
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8872694372325853 0.39379955128143784 0.9 }
radiance 21
center 138.82745361328125 0 13.293414115905762
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9175444085337143 0.31300849992284135 0.8653350658537086 }
radiance 25
center 115.34708404541016 0 -23.372657775878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5330005773683013 0.4820949224325338 0.9 }
radiance 22
center 125.00188446044922 0 5.956160545349121
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9275231818463197 0.42423243749144146 0.963532159249813 }
radiance 30
center 122.78218078613281 0 -19.524686813354492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6917956797974878 0.4079190324523764 0.9 }
radiance 27
center 120.06150817871094 0 7.984342098236084
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6276896450700208 0.300969829394318 0.9 }
radiance 19
center 141.29299926757812 0 0.4008632302284241
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205296803312275 0.3856294610279961 0.8264122534003764 }
radiance 28
center 111.96451568603516 0 -9.216994285583496
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.396580477661135 0.8252765030050394 }
radiance 29
center 134.256591796875 0 3.962118625640869
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8475307332093778 0.42629157648115124 0.9642451125894255 }
radiance 29
center 131.4881134033203 0 -7.556077003479004
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8833333412139123 0.4404555931316627 0.9615003228493841 }
radiance 19
center 121.03773498535156 0 -9.968013763427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8094664622495279 0.3423468651892877 0.9 }
radiance 18
center 109.20511627197266 0 12.171011924743652
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8368746665525643 0.30302687033032766 0.8740359195652435 }
radiance 17
center 126.65866088867188 0 7.696475028991699
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4391801307852143 0.6183813864467592 }
radiance 22
center 119.1578369140625 0 -14.115617752075195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8013016209857136 0.495869223889179 0.8500160880533534 }
radiance 19
center 141.40884399414062 0 -5.8446831703186035
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4598419218486053 0.4542597981386156 }
radiance 19
center 137.05059814453125 0 15.486047744750977
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9044653781031909 0.3705226635356037 0.8384665510477217 }
radiance 22
center 134.26734924316406 0 5.843578815460205
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9754558471559339 0.4422715551635886 0.8602765913612819 }
radiance 28
center 110.8173828125 0 16.537321090698242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9686573821920165 0.47441602842562103 0.9182362480335095 }
radiance 18
center 141.16519165039062 0 3.1789462566375732
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.901356310760386 0.4743678852247201 0.9018326785681934 }
radiance 28
center 143.7284393310547 0 19.647483825683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9177832651614041 0.3461142208104857 0.9714789821924237 }
radiance 21
center 125.31224822998047 0 -8.873262405395508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44332678545767834 0.6661321595603397 }
radiance 24
center 127.95660400390625 0 22.41159439086914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8253897383374121 0.4840013085153456 0.9577740185521469 }
radiance 20
center 118.90534210205078 0 0.8200318813323975
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.819016223072563 0.49459235633677506 0.8020941935471696 }
radiance 16
center 122.37279510498047 0 13.782958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.983099803287385 0.44297828413092527 0.8564530492920871 }
radiance 20
center 123.11784362792969 0 8.544903755187988
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8509766653474451 0.34156667844702576 0.899473966838803 }
radiance 29
center 146.0272216796875 0 26.155216217041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9753328916467866 0.4742157286296653 0.9940601116311014 }
radiance 26
center 119.8851318359375 0 4.8567328453063965
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9186934809036551 0.3151575760767616 0.8116605915956042 }
radiance 17
center 119.60802459716797 0 -3.4338510036468506
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9152607890890351 0.4625966856240471 0.8671011689502639 }
radiance 24
center 110.37998962402344 0 15.599726676940918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37421622646255026 0.5426257122635535 }
radiance 19
center 127.45771026611328 0 1.9902114868164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9275630824154897 0.4607151832028663 0.9833620725150499 }
radiance 22
center 130.45826721191406 0 -9.384093284606934
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8808596248586874 0.4773993951107524 0.9284498410584079 }
radiance 29
center 109.46900939941406 0 7.1412034034729
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7164353499299246 0.3989757688454004 0.9 }
radiance 30
center 118.1428451538086 0 -6.228207588195801
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8194347234594163 0.49585281639242573 0.9401564152638304 }
radiance 28
center 133.20753479003906 0 -6.998785972595215
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.870604244267916 0.4700522323456528 0.8348954686392628 }
radiance 30
center 111.56582641601562 0 22.587982177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8319855656782169 0.43391331968319147 0.8098219748054857 }
radiance 26
center 134.3305206298828 0 6.037285327911377
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9655961501654904 0.46930976468387975 0.9826164694321072 }
radiance 16
center 106.97114562988281 0 9.268902778625488
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8096564585137647 0.4669228105100881 0.8498356723046281 }
radiance 19
center 109.47598266601562 0 11.0777006149292
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.810371854068132 0.46885092527979244 0.9980346259411839 }
radiance 17
center 110.85979461669922 0 11.313525199890137
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9494683796807385 0.45551700293302966 0.9554480254215265 }
radiance 24
center 133.83743286132812 0 15.372264862060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.88146148966849 0.3766710198222895 0.9202875763117293 }
radiance 18
center 140.67337036132812 0 42.1953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.885650922653373 0.33374434307672535 0.9171506514339666 }
radiance 30
center 140.77456665039062 0 16.619930267333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8772651886785162 0.4970506864986364 0.8459295592226206 }
radiance 23
center 140.84825134277344 0 32.38666915893555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8499002395818414 0.49109040028440665 0.9926865751533172 }
radiance 20
center 114.15852355957031 0 32.644203186035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9550168717532486 0.3582122946238773 0.8981994870656989 }
radiance 30
center 120.10083770751953 0 5.546796798706055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8678647002568131 0.3371621675434492 0.9825252747504605 }
radiance 24
center 137.32911682128906 0 18.799074172973633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8676632468791944 0.38801227303580144 0.922674834650171 }
radiance 20
center 108.07284545898438 0 13.684296607971191
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301369138523049 0.3409115750397909 0.9441355928877513 }
radiance 18
center 138.99545288085938 0 40.1127815246582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7073135647523294 0.33222560326147477 0.9 }
radiance 18
center 116.04719543457031 0 9.036749839782715
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41952220937721785 0.7307825337284984 }
radiance 20
center 120.6363525390625 0 22.707767486572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8470035955238452 0.49406538066923184 0.9873189381330445 }
radiance 28
center 129.87628173828125 0 14.956997871398926
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9454184472080518 0.397535144294947 0.9789893350064999 }
radiance 22
center 112.06925201416016 0 7.2992777824401855
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47118151557859356 0.391889800306384 0.9 }
radiance 26
center 127.54452514648438 0 38.094482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5154244672898216 0.49938215235137073 0.9 }
radiance 28
center 130.13845825195312 0 11.751734733581543
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8462258680100095 0.43174167965972593 0.9283481295524922 }
radiance 18
center 115.651611328125 0 45.5150146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8863672013733679 0.49805657249463475 0.9561147158884773 }
radiance 25
center 104.98419189453125 0 26.07201385498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8993733540540993 0.3319071041411297 0.8533712649498526 }
radiance 28
center 127.70297241210938 0 49.95579528808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8394808706392713 0.4151505148777048 0.9633698178264123 }
radiance 31
center 130.9718780517578 0 42.18962097167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8555621860552584 0.3590635837486579 0.9896083404246808 }
radiance 17
center 104.46478271484375 0 42.96577835083008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9788358351659658 0.37627792409610045 0.9173301851152624 }
radiance 24
center 136.0903778076172 0 47.51701354980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4197069844718383 0.8090883299664923 }
radiance 25
center 103.48268127441406 0 31.076723098754883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9212994862735988 0.3688231638015649 0.9150605874438449 }
radiance 21
center 137.39317321777344 0 44.665828704833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.957259767658434 0.4396783734735701 0.8880002386715952 }
radiance 22
center 114.48247528076172 0 31.222301483154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8532628544728156 0.3883281030979271 0.9308746938540662 }
radiance 16
center 111.03052520751953 0 31.10746955871582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9196083808948965 0.4651777605836581 0.9847637159291494 }
radiance 23
center 114.14820861816406 0 34.26021194458008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8493775734689132 0.45212227717139475 0.9996543765857342 }
radiance 28
center 130.01055908203125 0 31.867244720458984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.913613340905412 0.35059321164490825 0.9567811347558648 }
radiance 31
center 126.44631958007812 0 32.29283905029297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8999848664475768 0.3121784968117576 0.8562880547144271 }
radiance 30
center 124.837158203125 0 21.36224937438965
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8646528192814417 0.31235980752251424 0.819766804235933 }
radiance 25
center 123.76901245117188 0 46.383819580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9701457045654682 0.31129700268891736 0.8831136395330041 }
radiance 29
center 127.97704315185547 0 30.202802658081055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9100839531021521 0.4074308299435454 0.9660429292765799 }
radiance 26
center 127.32289123535156 0 47.10809326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9343040469163013 0.4695148111569941 0.9263307922647628 }
radiance 19
center 124.39508056640625 0 32.784156799316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6560778238847506 0.32387875526463455 0.9 }
radiance 27
center 116.21772766113281 0 32.0567741394043
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9074378323027155 0.4489839629475987 0.9046986414047785 }
radiance 28
center 122.2198715209961 0 37.705867767333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8995353728619965 0.44116474804533745 0.9116200068137924 }
radiance 31
center 119.40153503417969 0 42.812767028808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.959533492876836 0.3619195416164583 0.9312922470266854 }
radiance 29
center 123.41270446777344 0 48.67914962768555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8322793320821448 0.385017773489885 0.8270013305622244 }
radiance 18
center 110.43192291259766 0 56.84132385253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45715277209598826 0.8386697412402465 }
radiance 25
center 123.91664123535156 0 48.128849029541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3670620192190428 0.7300994806383208 }
radiance 31
center 125.47660827636719 0 48.89354705810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34775877614336576 0.8445710457148407 }
radiance 17
center 123.96253204345703 0 47.12669372558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6646949358380192 0.4108171046371893 0.9 }
radiance 25
center 115.04215240478516 0 52.20316696166992
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9493934260352279 0.42525733559581735 0.8810024850813964 }
radiance 29
center 130.65916442871094 0 64.2085952758789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36361818683748764 0.5482632280198942 }
radiance 22
center 122.92095184326172 0 47.45384216308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9196998202234162 0.4106457138589409 0.9691707125446365 }
radiance 24
center 98.32109069824219 0 34.24156951904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43770457210795843 0.683413992326543 }
radiance 31
center 112.26300811767578 0 52.8690071105957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7705817822260701 0.49050555199993373 0.9 }
radiance 30
center 131.35983276367188 0 39.756439208984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8989608576658855 0.4860519980983149 0.9947879934859538 }
radiance 17
center 99.0105972290039 0 64.9103775024414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9402515979543641 0.4883155530857112 0.8581256858392272 }
radiance 20
center 109.24214935302734 0 47.232547760009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9099750950125084 0.4431299048713966 0.8313230278897658 }
radiance 30
center 112.79647064208984 0 56.77023696899414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9283126223770064 0.32030359555148796 0.916030946440779 }
radiance 19
center 118.06008911132812 0 65.94515991210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9962285076220175 0.32963456308421285 0.8678896738065095 }
radiance 18
center 133.42189025878906 0 55.733787536621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4505608803108154 0.8369060366454822 }
radiance 25
center 112.36404418945312 0 49.28604507446289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6880788532134403 0.36810244000558 0.9 }
radiance 20
center 114.06481170654297 0 37.82391357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9875808222510275 0.3967133032618011 0.8703741359778567 }
radiance 21
center 101.89102935791016 0 31.726957321166992
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9028710053129692 0.3539326591057892 0.9462222208658627 }
radiance 20
center 118.94320678710938 0 45.70424270629883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9006057236958287 0.4558591683552379 0.9391387802215024 }
radiance 31
center 106.37504577636719 0 62.7908935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9570182430559 0.3198676065859558 0.8660876996807418 }
radiance 19
center 104.34693145751953 0 62.310211181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.805790164820253 0.3588855770463618 0.9499243850672364 }
radiance 20
center 107.43318939208984 0 58.760555267333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9316942535129189 0.44137765138404594 0.9319825257483575 }
radiance 17
center 101.87820434570312 0 58.28328323364258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9972178638653563 0.3959095275276564 0.987989342535563 }
radiance 30
center 100.25232696533203 0 51.04047775268555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48302471940161607 0.496970660556427 }
radiance 21
center 109.8217544555664 0 56.49393844604492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8407991775832375 0.3499041338064784 0.990220978019109 }
radiance 27
center 107.30326080322266 0 51.08418655395508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8230119558087634 0.36139039095090914 0.9329728936441086 }
radiance 27
center 103.98106384277344 0 68.00527954101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8490376339992255 0.33000338487761793 0.8274195850797947 }
radiance 22
center 116.78780364990234 0 52.03323745727539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4779210157353815 0.353582665440079 0.9 }
radiance 27
center 118.58881378173828 0 50.79199981689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8284918196064217 0.32703517389466435 0.8233725580735731 }
radiance 28
center 109.3019790649414 0 62.68571472167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5145424147289371 0.30758034090818165 0.9 }
radiance 25
center 110.52855682373047 0 64.78602600097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4776578732042217 0.30888020446335723 0.9 }
radiance 28
center 122.35081481933594 0 54.90657043457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9855810762656808 0.40054326851213073 0.8484196022510869 }
radiance 28
center 102.76282501220703 0 63.83759689331055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9546603083945067 0.4755988325830036 0.9540534876765194 }
radiance 26
center 90.36663055419922 0 54.33144760131836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8391725173100391 0.34833987333526584 0.9456721501193567 }
radiance 17
center 108.59603881835938 0 61.499794006347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.953749910530794 0.43011049381268673 0.876890599776649 }
radiance 31
center 99.61840057373047 0 72.42886352539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35451770687913975 0.6010892654754477 }
radiance 28
center 123.0779037475586 0 64.60218811035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6085548360537554 0.43559560759961824 0.9 }
radiance 19
center 97.37295532226562 0 79.00845336914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8478686581035004 0.3082291658163046 0.8621318199687453 }
radiance 31
center 103.75080108642578 0 77.57369232177734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.813402318226935 0.44019645974228067 0.8997510228948566 }
radiance 18
center 94.31084442138672 0 83.20633697509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41737324806261533 0.83648956264753 }
radiance 16
center 104.11646270751953 0 68.88124084472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9412227083119926 0.46770277534489746 0.8535255938875504 }
radiance 29
center 81.86351013183594 0 88.36660766601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8204724138877526 0.44800914381661266 0.8009056363449553 }
radiance 23
center 103.25883483886719 0 81.78289031982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6744327282978997 0.3396922936618093 0.9 }
radiance 24
center 94.87385559082031 0 55.03587341308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4076123730986012 0.7453989586022127 }
radiance 28
center 95.48168182373047 0 75.89134216308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8427512338038664 0.3304332517308856 0.958088939283834 }
radiance 17
center 88.35475158691406 0 78.23216247558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8529681602417958 0.4842552385622575 0.9401479758949773 }
radiance 31
center 95.278564453125 0 57.251041412353516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7586285686158348 0.3004481278422424 0.9 }
radiance 20
center 106.72443389892578 0 86.95464324951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8905701724693553 0.31472444489094625 0.8294132104422804 }
radiance 23
center 83.73355865478516 0 77.69883728027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8350240375553617 0.36419074369940896 0.9322205418341762 }
radiance 29
center 84.42742156982422 0 80.38040161132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4146471523049894 0.4284980217398707 0.9 }
radiance 23
center 112.0108642578125 0 73.82195281982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41244356707356755 0.5438775182574235 }
radiance 19
center 99.19326782226562 0 71.451904296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9790454547897463 0.33707836818623815 0.8323762033771427 }
radiance 19
center 115.212158203125 0 76.00345611572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5756615218901332 0.4095417251746466 0.9 }
radiance 26
center 83.02735900878906 0 68.37531280517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9936329499934902 0.39292451277378915 0.954031271556848 }
radiance 16
center 116.92510223388672 0 68.90652465820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9050801601488104 0.3531098168785265 0.9775986524256971 }
radiance 23
center 91.9384536743164 0 56.48474884033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.873356822879249 0.3034412278465914 0.8020641940531503 }
radiance 20
center 88.21221923828125 0 60.07170486450195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9056290870124526 0.4954393115668367 0.9634760287419141 }
radiance 17
center 107.06840515136719 0 67.7162857055664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40364456824634154 0.5370861071361683 }
radiance 22
center 92.00537109375 0 76.8404769897461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35086984041519936 0.5244550710702167 }
radiance 19
center 97.47803497314453 0 95.1603775024414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3003766758259611 0.5659158331470211 }
radiance 25
center 83.83995056152344 0 69.65989685058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8856754381174226 0.4607464879896903 0.920007663149887 }
radiance 18
center 92.5124740600586 0 78.07450866699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8080842928758103 0.3672804035513465 0.992524118562931 }
radiance 29
center 102.5118408203125 0 94.81745910644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8606184480136497 0.36237982241654604 0.9606553273087198 }
radiance 28
center 96.37503814697266 0 80.75194549560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8069248508208198 0.3488177002759936 0.9667348352998282 }
radiance 24
center 104.23721313476562 0 75.42754364013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9434327875161853 0.3452487660390285 0.8758775918103988 }
radiance 27
center 98.66232299804688 0 82.40453338623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8610703428036526 0.4113031531334902 0.8215669695783291 }
radiance 19
center 81.5427474975586 0 82.42909240722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9021814042507763 0.4443038308107897 0.8410298344314082 }
radiance 25
center 83.193359375 0 88.23956298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9530121632103049 0.38233516809485857 0.9652116281470806 }
radiance 25
center 91.81353759765625 0 65.74221801757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6933453561889785 0.3304145661146567 0.9 }
radiance 25
center 79.81454467773438 0 97.71675872802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8380275228825266 0.37966343691442583 0.9227640934282192 }
radiance 30
center 80.18618774414062 0 85.85814666748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9360156765029612 0.4168141279654204 0.9881976373938653 }
radiance 18
center 83.93907928466797 0 89.03648376464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8792354115356951 0.3877957414694834 0.9590226713779999 }
radiance 20
center 101.076171875 0 91.1491928100586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44712588494193783 0.44185797294514884 }
radiance 18
center 90.12451934814453 0 79.68675231933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8367392649505899 0.4895494661670434 0.9 }
radiance 28
center 74.08422088623047 0 76.47697448730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9738952282788845 0.46085717646463337 0.8840196966525138 }
radiance 23
center 88.02667236328125 0 92.68783569335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9256238585511767 0.3314232809978544 0.9363929515647405 }
radiance 19
center 88.32754516601562 0 76.90911102294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5434360574996182 0.4417035621073311 0.9 }
radiance 19
center 80.87921905517578 0 83.67118072509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8053492856943774 0.3969344654010407 0.9816423110030557 }
radiance 23
center 83.86801147460938 0 73.32764434814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8653588586362456 0.372023870234041 0.8375791568527103 }
radiance 22
center 82.60362243652344 0 75.72432708740234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6461176419075125 0.33014103342324097 0.9 }
radiance 30
center 72.58737182617188 0 76.74532318115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.916777206464697 0.48317865817320915 0.917260307386456 }
radiance 21
center 76.93521118164062 0 78.37641906738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5002418755108615 0.32672626410663 0.9 }
radiance 16
center 95.01005554199219 0 106.19065856933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8191297996204882 0.42990721607277116 0.8452106072754351 }
radiance 21
center 71.04547119140625 0 82.51568603515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6588553069685468 0.3995356397152613 0.9 }
radiance 22
center 84.9017105102539 0 100.62000274658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8024786022224102 0.48818303458026285 0.9931756984053282 }
radiance 27
center 66.2288818359375 0 92.18310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9985619373503887 0.3298066228322998 0.9260417513941996 }
radiance 24
center 72.0201187133789 0 75.86258697509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8532277876593005 0.42639976793099366 0.8008347910875304 }
radiance 18
center 79.10649871826172 0 76.1452407836914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.471776896529879 0.49023284065691675 0.9 }
radiance 19
center 79.54582977294922 0 75.8147964477539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8457297174854497 0.3304237515604627 0.9 }
radiance 21
center 84.78182983398438 0 93.4854507446289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40693471291174776 0.7559059967276934 }
radiance 20
center 67.69019317626953 0 94.12850189208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5362514037649697 0.4917008823402131 0.9 }
radiance 21
center 88.24236297607422 0 104.95194244384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8956191028762999 0.46403454412437894 0.9980139905983985 }
radiance 29
center 72.91883850097656 0 85.82781982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9543072192186723 0.3950619747526471 0.9906807361586978 }
radiance 29
center 63.37212371826172 0 74.17826080322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9368975962657465 0.3852083198880464 0.9373961672575885 }
radiance 24
center 86.19902801513672 0 74.08092498779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205107838796774 0.48892450968487267 0.9657826278453154 }
radiance 16
center 87.08633422851562 0 86.16070556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.475605011200927 0.6968446371346512 }
radiance 26
center 73.5376205444336 0 72.31206512451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8929472448768406 0.3401176960611923 0.8707324354177434 }
radiance 20
center 63.46235275268555 0 79.26251220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8332240253186135 0.4282991980865937 0.8579854056171115 }
radiance 30
center 74.5590591430664 0 106.4971694946289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3460659912625133 0.510747756521919 }
radiance 17
center 52.56296920776367 0 112.53386688232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5846044198455448 0.3868097990727335 0.9 }
radiance 24
center 81.36338806152344 0 83.77718353271484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3973335416313339 0.8953801199570961 }
radiance 16
center 61.47685623168945 0 98.7845230102539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44009872103504477 0.7182167974359085 }
radiance 18
center 73.57569885253906 0 81.8636245727539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4189442366038198 0.7257800904285966 }
radiance 22
center 77.25067901611328 0 99.60172271728516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4072100414132997 0.8876310671567091 }
radiance 18
center 56.99987030029297 0 84.5511474609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.996711772354781 0.43221497107637785 0.9803919124426654 }
radiance 18
center 76.07882690429688 0 86.79025268554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448757401565592 0.4887352915876033 0.9933297933549512 }
radiance 18
center 56.30326461791992 0 80.7020034790039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8087878570871155 0.30364116650078943 0.9504591740089485 }
radiance 28
center 58.03268814086914 0 111.4436264038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892180885735278 0.3672504390260629 0.9 }
radiance 20
center 52.24274444580078 0 79.62288665771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8712390928741353 0.3972340146023591 0.9694662508324545 }
radiance 17
center 62.04411697387695 0 93.28022003173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8649951982738965 0.4671158998385778 0.8784626276482463 }
radiance 16
center 71.05257415771484 0 83.96074676513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7852715807190497 0.4767716807246467 0.9 }
radiance 27
center 55.48571014404297 0 87.33814239501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8402424306335499 0.4657848518422611 0.9823297208363667 }
radiance 18
center 85.14892578125 0 103.65476989746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9883641248759286 0.306958453433857 0.8479972996131812 }
radiance 17
center 70.69747161865234 0 94.92093658447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8316164484977022 0.3253117590129266 0.8528044209433769 }
radiance 19
center 56.29296875 0 110.71868133544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4404138796031398 0.8525436262492352 }
radiance 30
center 70.76644134521484 0 109.4518814086914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8261831544131724 0.33984712411619056 0.8456417638422404 }
radiance 22
center 63.06475067138672 0 97.26486206054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8065090099742838 0.36590613568475927 0.8295633677860109 }
radiance 27
center 53.10125732421875 0 108.67237091064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8681812837888365 0.35077492707611607 0.9738625063071294 }
radiance 23
center 68.39141082763672 0 108.52799224853516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8147348753572231 0.4174962834110569 0.8789984971309416 }
radiance 26
center 52.496620178222656 0 101.40396881103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3215669678094325 0.6328256629150621 }
radiance 28
center 68.2659683227539 0 102.27925109863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8315370219227854 0.4298175090717253 0.912632687546553 }
radiance 19
center 62.3131217956543 0 108.39484405517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6705600891070939 0.4132869548046371 0.9 }
radiance 17
center 50.00727844238281 0 116.11341857910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8720820712015802 0.39076502944111846 0.8280450581680985 }
radiance 30
center 67.48514556884766 0 87.68092346191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9951781815138344 0.40617320910919097 0.9620247759325127 }
radiance 29
center 58.570430755615234 0 108.98291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8438847263959423 0.4558593421707189 0.9483577057650987 }
radiance 19
center 58.505882263183594 0 106.66510009765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4180270915859212 0.3446095715413712 0.9 }
radiance 31
center 42.8289909362793 0 108.64629364013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43377636064518144 0.8514926899612153 }
radiance 17
center 64.33661651611328 0 91.47796630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9625109670288482 0.3049089179825258 0.8999950714387022 }
radiance 16
center 42.32701110839844 0 89.95854187011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5437418710335584 0.4815089372998529 0.9 }
radiance 21
center 40.94038391113281 0 100.9851303100586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8921555221191158 0.41009988003540354 0.9410832438434791 }
radiance 30
center 66.72706604003906 0 90.7846450805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9289794043311543 0.32357121954543483 0.9865684877831215 }
radiance 17
center 52.07400894165039 0 93.93939971923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412687201979909 0.4125094406915334 0.8286448556386439 }
radiance 18
center 54.44490432739258 0 83.89444732666016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9549676352943147 0.39947655352018047 0.9098053257598634 }
radiance 16
center 45.077415466308594 0 93.93428039550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5860249249529406 0.4594652250935052 0.9 }
radiance 30
center 40.7384147644043 0 109.86369323730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6292712672524369 0.4577904142833824 0.9 }
radiance 23
center 39.20845413208008 0 108.33492279052734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8017969896726415 0.42058048554441035 0.8257493860645131 }
radiance 28
center 39.51805114746094 0 102.95833587646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9453075219657933 0.3768576675344823 0.8787638671057414 }
radiance 29
center 68.86502075195312 0 93.79484558105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9342593436100151 0.35431947575752276 0.915563559231595 }
radiance 20
center 59.41520690917969 0 111.76484680175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34098744045217233 0.8598435496907213 }
radiance 27
center 38.57597351074219 0 97.22339630126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8832685062059734 0.4898108957255978 0.9313007980828938 }
radiance 24
center 34.94926834106445 0 117.82131958007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9713361025745242 0.39997974262195324 0.9566063032005042 }
radiance 23
center 51.29182815551758 0 103.92324829101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44159546390919296 0.6182261138018621 }
radiance 24
center 59.74186325073242 0 95.40377807617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9224621018036097 0.4574791145442011 0.8614460744932723 }
radiance 17
center 52.528663635253906 0 97.21932983398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46876540581185144 0.5990345378012923 }
radiance 18
center 42.79927062988281 0 92.0315933227539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9424196376866684 0.3107886714355985 0.9150672374176089 }
radiance 18
center 58.527034759521484 0 88.607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8346640552235807 0.41945522726952333 0.8006058113594251 }
radiance 30
center 28.96913719177246 0 109.11570739746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8724170597556217 0.39877410602060903 0.888887016650211 }
radiance 20
center 56.09721374511719 0 89.484130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8287045087082782 0.4402952825629584 0.9082032666154822 }
radiance 28
center 41.38560485839844 0 95.26870727539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9939905197414399 0.37041339855518884 0.8888936056027964 }
radiance 21
center 36.875465393066406 0 107.68368530273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9007135693917169 0.4196787904648118 0.9121581188686423 }
radiance 25
center 28.749052047729492 0 112.06169128417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41791771078734996 0.5596833718370845 }
radiance 19
center 51.154937744140625 0 97.93780517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8685683052276314 0.3194082537056065 0.8177221730840909 }
radiance 23
center 50.03550720214844 0 99.205810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9722225170971824 0.4441385675819878 0.9304418985682128 }
radiance 31
center 27.483375549316406 0 112.75559997558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44496638224887475 0.854074220910787 }
radiance 31
center 31.568500518798828 0 113.6471176147461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8113886165384641 0.429906019525258 0.8828952479973284 }
radiance 22
center 38.933753967285156 0 119.63444519042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8379607845926161 0.48635352181970637 0.8428778290558528 }
radiance 17
center 28.4298038482666 0 115.95470428466797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.990364619346072 0.3181616924435643 0.9434449116601237 }
radiance 23
center 42.28340148925781 0 96.27201080322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9046357740733072 0.4717529328338805 0.8383581247043826 }
radiance 18
center 38.704551696777344 0 117.36579132080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9003829145199658 0.38345212535565765 0.9435285859785815 }
radiance 25
center 28.818397521972656 0 113.14265441894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.968168903091406 0.31987232819363487 0.8492730848669234 }
radiance 16
center 26.52618980407715 0 121.69053649902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9421353668224686 0.38713989983882935 0.9977521233556076 }
radiance 26
center 23.37957191467285 0 98.18372344970703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.812983498921241 0.391286580514574 0.9494727573167862 }
radiance 23
center 37.00730514526367 0 118.67919921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4829472422777729 0.7670714537396791 }
radiance 27
center 22.23390769958496 0 109.79447174072266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45510553009459537 0.5302558571514301 }
radiance 19
center 44.028831481933594 0 89.17888641357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8020109877879129 0.49663142662963494 0.8259349546470842 }
radiance 20
center 20.026866912841797 0 113.2909927368164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3392598553180012 0.7638550690590518 }
radiance 16
center 20.829607009887695 0 116.4101791381836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5812032070883296 0.35100831052964176 0.9 }
radiance 20
center 41.37046432495117 0 113.54952239990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842175268202354 0.48618136070656726 0.9319147873072609 }
radiance 26
center 47.60804748535156 0 98.33318328857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9060502650334582 0.32783715277169834 0.8706747855918939 }
radiance 21
center 40.28829574584961 0 113.8680419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8306181442174397 0.4435249262061586 0.8145974845233874 }
radiance 29
center 29.55046844482422 0 93.65667724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5340607207353164 0.486002200402638 0.9 }
radiance 30
center 45.202266693115234 0 113.16597747802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6679605471364742 0.359374632813539 0.9 }
radiance 25
center 22.085783004760742 0 97.63690948486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9059601005157785 0.4362771146634391 0.9330605619208588 }
radiance 19
center 26.88441276550293 0 112.68744659423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3617323988072996 0.4276715026523492 }
radiance 30
center 20.82021713256836 0 99.04487609863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9606665376857801 0.43629492586047236 0.9168438921061839 }
radiance 21
center 28.221385955810547 0 90.02782440185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9297151319749636 0.44063461116996394 0.9822086521511859 }
radiance 20
center 42.25474166870117 0 102.38179016113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6741670011556767 0.43717608493433047 0.9 }
radiance 24
center 29.23276138305664 0 99.71937561035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4619734707624835 0.7251227517218883 }
radiance 25
center 11.974300384521484 0 101.40421295166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9701077929811563 0.48522568998130533 0.9535769533589631 }
radiance 18
center 20.032825469970703 0 98.1648941040039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8585954882212029 0.3781684461819498 0.9505470609349403 }
radiance 24
center 17.7681827545166 0 93.33724212646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.925331061556799 0.3466993506478114 0.819247425085426 }
radiance 28
center 29.964618682861328 0 103.16938781738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8681147002607346 0.41060141899334945 0.8257441263902092 }
radiance 31
center 2.4798197746276855 0 109.27119445800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3375699819753879 0.8736582411112959 }
radiance 17
center 24.659334182739258 0 94.78876495361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3172154459761949 0.5626522472278572 }
radiance 23
center 13.711946487426758 0 115.9820785522461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44911075914062315 0.3642625613565619 0.9 }
radiance 31
center 5.108140468597412 0 116.98163604736328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3687600268087772 0.7688432145004952 }
radiance 23
center 6.8453521728515625 0 119.61195373535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8967116996672957 0.354398061138783 0.8895396923187857 }
radiance 21
center 24.930065155029297 0 91.5537338256836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8660130164351523 0.36933155610810653 0.8094855311893553 }
radiance 27
center 29.112070083618164 0 113.69161987304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.973715977175375 0.4897898018926403 0.8436188391325932 }
radiance 22
center 1.5530976057052612 0 98.49750518798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9020193254113257 0.38340014844561054 0.8173189205840099 }
radiance 18
center 30.467487335205078 0 112.19939422607422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47198061728377394 0.6773958906764472 }
radiance 28
center 25.13032341003418 0 99.62855529785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8523129962198547 0.4019568474528931 0.8502002715507635 }
radiance 21
center 9.546402931213379 0 107.61610412597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.850711624535337 0.3769499175503137 0.9694645831572102 }
radiance 24
center 18.83499526977539 0 112.82894897460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8403647340357028 0.3938404718946149 0.9008708149984785 }
radiance 17
center 18.708974838256836 0 116.24849700927734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6621033142432904 0.35262485883061573 0.9 }
radiance 31
center 10.282465934753418 0 109.61763763427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9521601965741677 0.3095377252140093 0.9295820853267691 }
radiance 25
center 10.147628784179688 0 91.4935073852539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9859840083042611 0.32888668133161597 0.9752258189657738 }
radiance 29
center 5.8814849853515625 0 116.6883773803711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9684379222110379 0.4069833604736136 0.9848313765904453 }
radiance 31
center -12.573719024658203 0 99.81243896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5640587139737401 0.32730676680154885 0.9 }
radiance 30
center -1.7749524116516113 0 109.44287109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47849242164888406 0.4764733265045965 }
radiance 23
center 15.154399871826172 0 101.45404052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8016389590149822 0.37185302409080356 0.8722600699387555 }
radiance 17
center 11.973447799682617 0 114.0877456665039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3859329097258787 0.5387134969764074 }
radiance 16
center -11.384831428527832 0 115.73200225830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8267968872018994 0.30132820447347136 0.9855788936757455 }
radiance 22
center 0.31863656640052795 0 115.86339569091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603335735893999 0.3103543676232752 0.9160860582870031 }
radiance 28
center 12.638016700744629 0 109.93650817871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8196005207372168 0.49957794614968787 0.8477440039054489 }
radiance 30
center -9.197328567504883 0 116.05741882324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8576169072689102 0.4030123377246981 0.8998593723784657 }
radiance 21
center 5.22869873046875 0 102.28055572509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8691717222115065 0.34772906118962427 0.8313304958744376 }
radiance 21
center -13.697161674499512 0 118.63340759277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8675897512319561 0.39710712099091716 0.9912031699483919 }
radiance 26
center 10.542963027954102 0 100.56674194335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.959534979109284 0.39026770739515515 0.8826146900315366 }
radiance 23
center 7.901029586791992 0 111.00331115722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9897538667197137 0.45715904446105804 0.8916648599608354 }
radiance 25
center 6.833023548126221 0 101.98177337646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8224978078190599 0.3357595378604146 0.8069724994257843 }
radiance 22
center 1.3779329061508179 0 87.47726440429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8274220784624973 0.4295489688771982 0.8925931884747367 }
radiance 28
center 6.886268138885498 0 111.20628356933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8654707613776065 0.3934232752156818 0.9491568461832426 }
radiance 22
center -7.864708423614502 0 116.00035095214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9076853898402913 0.3891113908988012 0.9383431388721499 }
radiance 19
center -8.990650177001953 0 94.45462799072266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.904563548747898 0.3044626989662474 0.9259481405296031 }
radiance 31
center -12.285679817199707 0 94.90772247314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34060092541415693 0.894018571320194 }
radiance 24
center 6.655731201171875 0 90.35982513427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9507970816206108 0.33007895541428317 0.9088666149257225 }
radiance 28
center -4.385383605957031 0 94.12538146972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3565731739994232 0.7896136566826257 }
radiance 27
center -26.79084014892578 0 109.5525894165039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3450370554806635 0.6691471403371065 }
radiance 21
center -14.140711784362793 0 88.01988983154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8402631056010391 0.43872192984282 0.9125132179117499 }
radiance 21
center -2.1146647930145264 0 91.89515686035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8303929804040044 0.39610054053934207 0.8812985645147531 }
radiance 23
center -18.353668212890625 0 98.4885482788086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.919153630597416 0.3620046675112496 0.8726873211195125 }
radiance 30
center -20.848613739013672 0 86.96650695800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8328229512360639 0.42079971189010656 0.9366415316891561 }
radiance 19
center -4.200395107269287 0 96.48250579833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8141608923585103 0.3632016320071504 0.8318309506330027 }
radiance 26
center -0.22062774002552032 0 109.98499298095703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8714048558569213 0.3550850620834653 0.9 }
radiance 23
center -8.747376441955566 0 88.4001693725586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3739863635905284 0.8147740259623936 }
radiance 26
center -16.71092987060547 0 102.31761169433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8010896587430991 0.47446350715373903 0.8259646590059453 }
radiance 26
center -5.193766117095947 0 100.05388641357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3707486532584669 0.7169601879341341 }
radiance 29
center 1.0657861232757568 0 103.49762725830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9262364791461343 0.3281173202459378 0.8519779145209002 }
radiance 25
center -0.2184302657842636 0 104.52915954589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9502513219714055 0.4883257475570033 0.8884283596004057 }
radiance 16
center -17.334049224853516 0 87.58104705810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9924603389747779 0.3189480199121001 0.8601149269663775 }
radiance 22
center -6.831615924835205 0 104.5892105102539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.625396689370832 0.3145430001250615 0.9 }
radiance 20
center -28.416475296020508 0 85.10783386230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32967720730170413 0.5202374581566667 }
radiance 31
center -29.077983856201172 0 111.70125579833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9474507701625663 0.43024346895713006 0.9949277653927056 }
radiance 31
center 1.6587265729904175 0 106.13560485839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4523215506685968 0.7681125431074334 }
radiance 21
center -20.614065170288086 0 103.97942352294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9088174920303432 0.3015839469089085 0.9890751014900451 }
radiance 19
center -3.705792188644409 0 110.7780532836914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9172255445316149 0.4101336119799001 0.9439837993183993 }
radiance 24
center -22.354148864746094 0 105.29850769042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8719725423564078 0.4271953832407227 0.8041642370230363 }
radiance 29
center -14.223433494567871 0 78.43682098388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9996153060972683 0.48223713607910934 0.9688173818433234 }
radiance 29
center -35.464378356933594 0 94.68536376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8329091164516909 0.3387195951201452 0.9427078681579426 }
radiance 18
center -35.81050109863281 0 98.00601196289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9386613412575473 0.49672825840477675 0.8235219249575144 }
radiance 18
center -22.13043975830078 0 102.98867797851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3514078715360629 0.8865051420459612 }
radiance 30
center -39.47968673706055 0 84.9438705444336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3016753513227206 0.41776529110713834 }
radiance 21
center -29.301830291748047 0 81.59001159667969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8955723264804452 0.4951559365001368 0.9 }
radiance 17
center -32.85953903198242 0 107.36065673828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9571985199183997 0.3777761766499711 0.8546936111204351 }
radiance 24
center -14.503151893615723 0 88.27874755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8898770364853712 0.48257729532107557 0.8853808358374262 }
radiance 17
center -22.89537239074707 0 91.47994232177734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8953427206514224 0.42536961399218537 0.9935214116955179 }
radiance 20
center -11.853092193603516 0 107.16835021972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33725327752722994 0.6276317442594306 }
radiance 18
center -26.258878707885742 0 105.58187866210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8845501022792681 0.3313421953318756 0.9608352639415637 }
radiance 26
center -20.913677215576172 0 99.16480255126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8664255849687834 0.4373518551071482 0.9 }
radiance 28
center -35.76993942260742 0 98.9553451538086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39782683170029354 0.4714960312567328 }
radiance 22
center -26.56330680847168 0 85.2601089477539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8211358738265676 0.4593418401226157 0.9 }
radiance 27
center -23.90467643737793 0 86.9643325805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8669159179101367 0.39088039118774687 0.8738555010590946 }
radiance 23
center -14.496790885925293 0 89.52447509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7297007162448045 0.45707142243384313 0.9 }
radiance 26
center -20.854578018188477 0 94.97659301757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8779516235399476 0.3693871815594648 0.8942535523693468 }
radiance 17
center -27.455963134765625 0 85.25753021240234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9772730906115584 0.4555301674350451 0.8839712258079492 }
radiance 27
center -20.04248809814453 0 80.7721939086914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9641150857861576 0.49906238414402204 0.8131552958088083 }
radiance 31
center -16.859365463256836 0 99.33099365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9737172758285396 0.498543539876807 0.9879051485302144 }
radiance 31
center -49.7490119934082 0 82.71574401855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9509642566009532 0.43455635701237927 0.9102782930938752 }
radiance 30
center -31.1997013092041 0 89.65789794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8299380082400398 0.42727944397662543 0.8129327872559007 }
radiance 30
center -46.3534049987793 0 81.8247299194336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998857014154495 0.3869925115738453 0.9575000253862936 }
radiance 28
center -52.13518524169922 0 94.76910400390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8492981755329124 0.3402644607049027 0.8726183807421555 }
radiance 19
center -37.08765411376953 0 73.7673568725586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4400145278731503 0.8903399170080228 }
radiance 24
center -36.413612365722656 0 77.9362564086914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42076538546008957 0.4471683969116571 }
radiance 21
center -37.294525146484375 0 92.18573760986328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8083707614696576 0.4426105226766838 0.841605151480673 }
radiance 21
center -51.53644943237305 0 93.7882080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35417801379627417 0.4329500624923839 }
radiance 20
center -51.27333068847656 0 70.84716796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8589332423054796 0.4621032924588684 0.8953629275119993 }
radiance 18
center -48.197479248046875 0 82.94237518310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8726719636416904 0.4007293287994208 0.925478422465682 }
radiance 19
center -33.382911682128906 0 90.29230499267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9795594274909125 0.45382534962435284 0.8176561170994354 }
radiance 31
center -29.084415435791016 0 96.84873962402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8324488160079587 0.46541463633638575 0.8160495679914226 }
radiance 23
center -35.1696662902832 0 74.48865509033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8964767676049165 0.33437209663115325 0.8327483781201583 }
radiance 27
center -30.56114387512207 0 72.29981231689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9034453687877746 0.3289321149410049 0.8533180030434179 }
radiance 22
center -51.83277130126953 0 75.89630889892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9461863866754029 0.3630550461347971 0.8699131453688537 }
radiance 26
center -30.217723846435547 0 79.62029266357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8811106498028196 0.39256502137251087 0.9692184516277775 }
radiance 31
center -50.1956672668457 0 83.37852478027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9623686732023162 0.3682766478463253 0.8783757660016411 }
radiance 27
center -46.882511138916016 0 72.88396453857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9398669992035303 0.38376660011502567 0.8713653235179079 }
radiance 18
center -42.25102996826172 0 79.1611557006836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8986068875185175 0.3880887277564062 0.8923759839245529 }
radiance 25
center -36.3167610168457 0 68.48492431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.853587424664344 0.4489810981013629 0.9578035281578074 }
radiance 16
center -54.10469436645508 0 77.10071563720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9355882753009711 0.44341195114592197 0.9437718580394713 }
radiance 18
center -39.81354522705078 0 74.88806915283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8909858918476785 0.34375054595791404 0.9 }
radiance 17
center -59.3094596862793 0 68.75025177001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9828730245742102 0.48890063078508983 0.9319927304807193 }
radiance 19
center -40.66517639160156 0 88.30670928955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.841851137464318 0.30634384767703815 0.808089082545815 }
radiance 27
center -44.91608810424805 0 76.08995056152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9215934488306508 0.470494879108564 0.965683829193148 }
radiance 27
center -64.43364715576172 0 74.33000183105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9834214669254189 0.3925757336631156 0.8394692011759921 }
radiance 23
center -56.844093322753906 0 64.86852264404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9924504129966056 0.42513530870518546 0.9427244884813217 }
radiance 28
center -45.69931411743164 0 71.289794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36821303615553147 0.7991677125760848 }
radiance 28
center -46.316165924072266 0 69.2620620727539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8748805120974712 0.3596358374116195 0.9710179465723445 }
radiance 21
center -40.91118621826172 0 62.75156784057617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8962221879662737 0.39903665558926193 0.8757497937426321 }
radiance 20
center -36.11027526855469 0 72.65840148925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.891520442284632 0.3276352388472986 0.965931894221444 }
radiance 23
center -53.670372009277344 0 62.04362106323242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8063489685435179 0.4049160101628395 0.9 }
radiance 19
center -53.305137634277344 0 78.58690643310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9157610705544719 0.4466114212876455 0.9360927416494403 }
radiance 30
center -39.47066879272461 0 84.4747314453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8859783166706343 0.3678544705060344 0.8481364802033797 }
radiance 31
center -56.4281120300293 0 84.88462829589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9720394456711104 0.3348133730222809 0.9682380326106367 }
radiance 20
center -34.861183166503906 0 66.53878784179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9394202916980166 0.41214294454470524 0.8473208749819637 }
radiance 27
center -39.19492721557617 0 70.52670288085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9671335282057122 0.3274140592156581 0.8816931763092745 }
radiance 20
center -52.490848541259766 0 70.63915252685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8304759392255634 0.3425727545181711 0.9451255508208001 }
radiance 27
center -63.766571044921875 0 62.570396423339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9577743395965992 0.49918163466305954 0.9199618736763792 }
radiance 26
center -40.4683723449707 0 60.32086944580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867906561430996 0.48425118491024505 0.9572204867451598 }
radiance 18
center -69.15010833740234 0 70.87277221679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9630372065073804 0.36262317698816093 0.9813315708145978 }
radiance 24
center -58.06614685058594 0 65.6041488647461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6505296058357936 0.31773971786243316 0.9 }
radiance 22
center -57.25446319580078 0 54.9777946472168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8400846220787849 0.4755066417776118 0.8524162690045244 }
radiance 19
center -68.47064208984375 0 47.77140426635742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9372372576867681 0.32113415494475095 0.9606901972615517 }
radiance 29
center -65.08231353759766 0 71.21265411376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9895957310910952 0.4338342097053516 0.8752656422522225 }
radiance 18
center -61.42688751220703 0 56.282310485839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9432682357376665 0.39339967138407794 0.9616101518152411 }
radiance 24
center -49.26632308959961 0 49.62712478637695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8772679974406591 0.4742374200753065 0.8677946128749625 }
radiance 19
center -46.40763473510742 0 75.54801940917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.812811081299767 0.38358663099070495 0.9571557839415789 }
radiance 29
center -46.842010498046875 0 73.24828338623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8024501181799095 0.31621244626423306 0.9202131117506047 }
radiance 28
center -66.46211242675781 0 51.418853759765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8548285802445421 0.3159331377742418 0.811812418981176 }
radiance 25
center -49.566768646240234 0 71.64012145996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99021096500493 0.41908452691044473 0.8495839941001487 }
radiance 20
center -67.07221984863281 0 54.89632797241211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.629333270532028 0.41508660523732754 0.9 }
radiance 30
center -69.65735626220703 0 74.48450469970703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6553058482822274 0.4802134243894767 0.9 }
radiance 20
center -63.59931564331055 0 63.0108757019043
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447695803358819 0.44214631601794685 0.8003852015577634 }
radiance 30
center -60.77753829956055 0 61.58849334716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9891740288160283 0.36760805302223715 0.80847924987269 }
radiance 19
center -72.78744506835938 0 75.49034118652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9643549505782812 0.30018140087233947 0.9100761796418919 }
radiance 18
center -59.11872100830078 0 56.2202033996582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9723839966537621 0.45414354698819087 0.8186614111838126 }
radiance 31
center -57.092777252197266 0 57.641937255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8009719502220182 0.4797576105413085 0.9078110582797716 }
radiance 23
center -50.510711669921875 0 72.95928192138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8240072553327341 0.3242333154612667 0.9122678449098852 }
radiance 30
center -69.846435546875 0 63.232906341552734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32256439053721647 0.5523104887321711 }
radiance 20
center -69.68360137939453 0 49.59535217285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8796381238036738 0.39319380929377357 0.9 }
radiance 21
center -66.5146484375 0 41.065635681152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.701484245465198 0.408268134338968 0.9 }
radiance 30
center -58.69557571411133 0 60.062679290771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8681676643233994 0.32791768969931845 0.852810370170326 }
radiance 17
center -66.12850952148438 0 59.93012237548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30788020655202947 0.6367732302241298 }
radiance 24
center -70.821044921875 0 46.96445083618164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9833054356119711 0.3463286944275622 0.8757570043224578 }
radiance 30
center -71.23945617675781 0 60.80964660644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4948065250911673 0.7877414021029203 }
radiance 20
center -65.56582641601562 0 51.078609466552734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9804643408438002 0.4861363277422985 0.969295527840913 }
radiance 17
center -72.09105682373047 0 46.125640869140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8012390006329458 0.4484824111443092 0.9845392063304474 }
radiance 29
center -57.13689041137695 0 41.34517288208008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31727416688933624 0.48547210796140494 }
radiance 16
center -58.70078659057617 0 58.59490203857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8491466477647822 0.3433593791870851 0.9 }
radiance 27
center -52.3214111328125 0 58.847354888916016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4445648407940367 0.48063679482614907 0.9 }
radiance 22
center -63.38630676269531 0 52.14405822753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8423675651722288 0.3890469847627749 0.9490940213253798 }
radiance 31
center -58.29985046386719 0 54.31011962890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9261789828109397 0.36066735053034216 0.8199105136674583 }
radiance 18
center -77.08704376220703 0 53.54500198364258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8537165142495787 0.440522468101973 0.8752193468332272 }
radiance 28
center -52.067420959472656 0 35.098567962646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9767034404521827 0.3526034519401701 0.8358325645843637 }
radiance 28
center -62.855567932128906 0 57.42827224731445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8928619920113398 0.3208141831170325 0.8848582094816827 }
radiance 16
center -71.2867202758789 0 43.01149368286133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4244089512136806 0.36054784877460766 0.9 }
radiance 16
center -58.41819763183594 0 39.06684112548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.924863185783961 0.32343791121184334 0.8584203290483806 }
radiance 22
center -69.92890930175781 0 43.21632385253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8951113971361432 0.4124581482947667 0.9 }
radiance 27
center -67.96894836425781 0 54.36626052856445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9935557016526659 0.46000200828986726 0.890728625898401 }
radiance 22
center -61.08633804321289 0 42.91641616821289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8272756163896868 0.45212810023339317 0.8763970313438513 }
radiance 16
center -56.24993896484375 0 47.35306167602539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5596033440586686 0.49573069464660646 0.9 }
radiance 24
center -75.57591247558594 0 40.68389892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8596782342105531 0.3873585748971503 0.9133342130916114 }
radiance 20
center -72.00846099853516 0 48.38589096069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9304067824480439 0.40287206159005917 0.9645712843892792 }
radiance 27
center -78.46658325195312 0 30.055784225463867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5965254916132707 0.3443607019657454 0.9 }
radiance 30
center -55.36320495605469 0 26.53470230102539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3103419583801943 0.8028477292793615 }
radiance 21
center -66.35440063476562 0 38.627254486083984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8080981525071538 0.38782689259590175 0.8138033913766771 }
radiance 20
center -59.74150085449219 0 23.856176376342773
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8404920849852124 0.4721452146527567 0.8009910202849827 }
radiance 28
center -59.72858810424805 0 29.757617950439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.830870651373945 0.407269821892984 0.8686383721132601 }
radiance 22
center -56.888145446777344 0 45.43837356567383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9890674353591193 0.43505244317682223 0.9648400327476795 }
radiance 31
center -81.3066177368164 0 26.216203689575195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8196204786905299 0.37451090545004123 0.9379338109983141 }
radiance 20
center -77.9441909790039 0 33.61807632446289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3404589765152834 0.750156392012523 }
radiance 23
center -75.94639587402344 0 48.8802604675293
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9794741178389079 0.30721243745074933 0.9238793254813666 }
radiance 24
center -56.8762321472168 0 49.87197494506836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8828101445116889 0.4387170601048831 0.8288871920281018 }
radiance 17
center -74.79216003417969 0 32.597599029541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36901375019712307 0.5895711967514363 }
radiance 22
center -58.142791748046875 0 26.5565128326416
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8205792187870861 0.44880673456313036 0.8104496862034192 }
radiance 27
center -66.78044891357422 0 44.5450439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4323807397505478 0.4530163215947103 }
radiance 19
center -60.346343994140625 0 45.13996505737305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8581371373016504 0.41201275647940805 0.9507905122739995 }
radiance 18
center -64.36038970947266 0 23.043806076049805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3995843741575782 0.8015652375460005 }
radiance 28
center -83.21939086914062 0 25.678791046142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.977674480679239 0.36419830356756216 0.8222206998099095 }
radiance 16
center -62.53348922729492 0 22.207645416259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4685833225592596 0.8332067921677008 }
radiance 25
center -65.18425750732422 0 15.204946517944336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9040611162572013 0.42962392480095024 0.8860854105434874 }
radiance 16
center -69.30683898925781 0 20.4045352935791
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308191804447302 0.43302115968246685 0.8257625547799924 }
radiance 30
center -75.18347930908203 0 32.12554168701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8797793883192238 0.49054830567068564 0.9495174607495633 }
radiance 18
center -79.9753646850586 0 23.152938842773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9187349270770566 0.46969154608642033 0.9099881985039932 }
radiance 30
center -80.81307220458984 0 32.331207275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9927139974999281 0.4632829919210114 0.9208911597583176 }
radiance 16
center -84.19791412353516 0 16.24089813232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8924557467870111 0.3293119230114179 0.957948135483268 }
radiance 16
center -57.628761291503906 0 10.988892555236816
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9911686421786003 0.4825632566790413 0.9265109824695368 }
radiance 18
center -81.94991302490234 0 21.6552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9590572101988522 0.4840926811528118 0.9475098044038461 }
radiance 31
center -64.02420043945312 0 11.971025466918945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8884780021455916 0.4400943917719979 0.8220081593488836 }
radiance 29
center -79.3388900756836 0 23.514362335205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8482208589615075 0.4813828560803287 0.9833102166349132 }
radiance 19
center -81.0462646484375 0 12.69620132446289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8114749897690232 0.46851933397411416 0.8280515068638203 }
radiance 24
center -62.43135070800781 0 10.082228660583496
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9699423853080255 0.3140335876111633 0.9375213958265731 }
radiance 21
center -79.93484497070312 0 14.115410804748535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9514064935895457 0.46443629675187376 0.9234858942544576 }
radiance 17
center -81.90699768066406 0 27.144386291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9278118787568165 0.30894581793975556 0.883204150151076 }
radiance 23
center -71.807861328125 0 11.75275707244873
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8516936185340683 0.38634814209573587 0.9552726839250777 }
radiance 18
center -69.56573486328125 0 17.37360191345215
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.838636710165283 0.4437762414212691 0.9694186231012458 }
radiance 29
center -79.67082214355469 0 25.167097091674805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9030151087891856 0.48612803187346865 0.9539519020136417 }
radiance 21
center -84.85894012451172 0 33.9090461730957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4397590116694205 0.7393359137931117 }
radiance 23
center -68.58365631103516 0 22.46727752685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9894690154258563 0.34830571600678667 0.9977161829282146 }
radiance 31
center -75.88593292236328 0 20.909494400024414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8440689826117244 0.31892044470060893 0.931495115845214 }
radiance 30
center -72.52713775634766 0 4.095597743988037
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9893885588841387 0.47345311016763625 0.9269549865659333 }
radiance 26
center -75.53475952148438 0 21.180910110473633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4639723192069315 0.6139231261696768 }
radiance 20
center -83.92564392089844 0 20.92398452758789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8979860900947817 0.351253388335141 0.8750080249268457 }
radiance 27
center -74.69721221923828 0 15.168587684631348
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9132951333820585 0.3192000194644045 0.8256776417426883 }
radiance 27
center -72.03765106201172 0 22.825252532958984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9544996733413129 0.468327942782962 0.8030017847882542 }
radiance 24
center -64.24781799316406 0 6.575893402099609
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.485601056097729 0.8561940429988195 }
radiance 20
center -62.46253967285156 0 9.228130340576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36197153052775805 0.4483380399199396 }
radiance 31
center -84.087646484375 0 2.170332908630371
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872886628201063 0.40046754053257916 0.8468827691632933 }
radiance 16
center -65.35568237304688 0 5.242436408996582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9689727571029241 0.448296734965522 0.852481369269321 }
radiance 29
center -65.6243896484375 0 8.47492504119873
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8635857431064333 0.4151814999265522 0.8287359208696092 }
radiance 31
center -73.39513397216797 0 3.8245279788970947
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9855027561146832 0.4149415521322868 0.91881690201662 }
radiance 26
center -60.79047393798828 0 1.967394471168518
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6833128776269224 0.312233740555729 0.9 }
radiance 22
center -82.66436767578125 0 0.11070550233125687
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37766889994259045 0.8380884965207224 }
radiance 30
center -81.61946105957031 0 7.743738174438477
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8668935110058987 0.3868677749201418 0.8271035441990104 }
radiance 24
center -74.40263366699219 0 8.417468070983887
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4990496895514419 0.31078811476510837 0.9 }
radiance 23
center -57.63548278808594 0 1.3367427587509155
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9529268973956344 0.4514189077047104 0.8178203081209727 }
radiance 17
center -84.42501831054688 0 -3.299776077270508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4810310542428903 0.4694519892925794 0.9 }
radiance 20
center -69.87054443359375 0 6.7876057624816895
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8608147017871784 0.44816838431324413 0.8151073185686339 }
radiance 16
center -58.819847106933594 0 4.330721855163574
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8417433787017007 0.39700412399729956 0.9158795073181459 }
radiance 21
center -489.459228515625 0 -35.21648406982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3018631350835837 0.7374549430865199 }
radiance 26
center -464.73065185546875 0 -12.911959648132324
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.956507221635978 0.37909961744193493 0.9388621582596848 }
radiance 19
center -438.9066467285156 0 -4.302583694458008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9425244751650738 0.47957280328595775 0.9508042173995105 }
radiance 30
center -421.89501953125 0 1.0395421981811523
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49183756812864554 0.3290845088760041 0.9 }
radiance 25
center -437.3238220214844 0 -121.5536880493164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9231405111273392 0.37646270758406086 0.8162343452359391 }
radiance 16
center -404.6943359375 0 -85.77449035644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31554910835890587 0.5129216633664274 }
radiance 25
center -436.13836669921875 0 -16.415756225585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8809501829535862 0.4744549807863665 0.9208401356013557 }
radiance 18
center -441.1844482421875 0 -63.81222915649414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49201642960466296 0.48246315863037015 0.9 }
radiance 21
center -474.9274597167969 0 -55.100257873535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5823610069601087 0.452963999706242 0.9 }
radiance 29
center -462.1591796875 0 -85.0805435180664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9680165082691194 0.4009061897763208 0.9823716102864921 }
radiance 18
center -449.09625244140625 0 -21.69064712524414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8977413572268824 0.32183370871973416 0.8305123694107506 }
radiance 29
center -474.9621887207031 0 -77.76351165771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9186798592837171 0.3146376376702388 0.9888318177010822 }
radiance 29
center -452.3650817871094 0 -34.408912658691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4851182768496427 0.5538304666156055 }
radiance 25
center -383.9975891113281 0 -33.56394577026367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108138883651794 0.44806256744085887 0.8416988251391887 }
radiance 16
center -396.9542541503906 0 -8.110030174255371
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8942989901686512 0.33328463765543065 0.997561532658526 }
radiance 25
center -483.5688171386719 0 -80.7263412475586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9150038827660169 0.46645751900034826 0.869079520257577 }
radiance 27
center -378.4256591796875 0 -36.4603385925293
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4862113515621953 0.5656631705860924 }
radiance 18
center -479.3604431152344 0 -81.2888412475586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8723624281946321 0.46007313168037456 0.8605549237993972 }
radiance 31
center -453.9678039550781 0 -43.407047271728516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44207466972325626 0.31504491397503787 0.9 }
radiance 27
center -435.6350402832031 0 -31.965450286865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5103657412723084 0.4849380547658303 0.9 }
radiance 22
center -425.4503479003906 0 -95.64472198486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46698803193977245 0.36229760341728917 0.9 }
radiance 30
center -411.8133544921875 0 -13.436897277832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9474237177263978 0.37672886373483205 0.8826881568685903 }
radiance 24
center -382.2833557128906 0 -108.12916564941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8376639807609968 0.4307535915256766 0.8746804509048274 }
radiance 22
center -451.7897033691406 0 -104.474365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8650769225108814 0.3436596995043352 0.863845382616931 }
radiance 21
center -398.32037353515625 0 -111.31727600097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8126788300762842 0.45680693509794557 0.817366852248007 }
radiance 29
center -487.0582580566406 0 -115.21968078613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8066472720272558 0.33445127889691784 0.8912124174544835 }
radiance 28
center -481.43243408203125 0 -92.40543365478516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9251673220832688 0.3834498178114495 0.8677683602244957 }
radiance 27
center -464.2041320800781 0 -121.08245849609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4821985420120565 0.7941177530794303 }
radiance 21
center -432.7754821777344 0 -39.587432861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30565349359396116 0.7509040094582309 }
radiance 30
center -435.1564025878906 0 -47.52440643310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9020421988212644 0.44221999904678183 0.984165686282418 }
radiance 16
center -427.80169677734375 0 -78.07975006103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40801269024684794 0.6021034474474384 }
radiance 21
center -455.493408203125 0 -53.3724365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9629549441469667 0.41298353464880244 0.8433441285495283 }
radiance 24
center -482.0626220703125 0 -38.97321701049805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32452376408511213 0.8519874012721255 }
radiance 25
center -390.8194885253906 0 -27.21501922607422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4052834068897515 0.3927547865174412 0.9 }
radiance 21
center -384.05291748046875 0 -17.034706115722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9273381467137486 0.47195115607076643 0.8296434594826977 }
radiance 18
center -428.2105712890625 0 -61.157798767089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47431525228456084 0.8750131972325585 }
radiance 25
center -368.2432556152344 0 -70.03438568115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8119661197280458 0.41922761778828144 0.9451887682604031 }
radiance 31
center -404.6373291015625 0 -89.88327026367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9462583144821726 0.3261816899118783 0.892296074762737 }
radiance 19
center -421.5880126953125 0 -16.725910186767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8016005816869319 0.38206753533895355 0.9146504329992754 }
radiance 20
center -460.2461853027344 0 -24.165910720825195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9165950353028689 0.4367474063235789 0.8252499364167506 }
radiance 18
center -390.8918762207031 0 -156.84962463378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8298498288892823 0.3260891819076344 0.8600790961424589 }
radiance 17
center -475.2139892578125 0 -62.98713684082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6264948958915576 0.3551693526210745 0.9 }
radiance 26
center -407.09429931640625 0 -146.86398315429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33518594093682325 0.794906027133208 }
radiance 24
center -476.004638671875 0 -125.65496826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4697413075082334 0.8319305395750922 }
radiance 22
center -435.2483215332031 0 -153.7344970703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4531937327681126 0.4049519550764267 0.9 }
radiance 24
center -414.8486633300781 0 -49.39883804321289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36343767608615185 0.7838177199072814 }
radiance 31
center -433.97442626953125 0 -133.44619750976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8109522494129937 0.34803272455734563 0.8973099246084619 }
radiance 26
center -386.4742126464844 0 -157.54473876953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8773751977000563 0.4167446636101939 0.8793549474474124 }
radiance 26
center -444.78564453125 0 -153.20628356933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8383624732534305 0.4654637135356436 0.8587638099352198 }
radiance 24
center -413.9217834472656 0 -41.655982971191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9026978925738447 0.44179152385192183 0.9608330815517767 }
radiance 24
center -413.5146484375 0 -147.74644470214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5427898338208882 0.30236679065469335 0.9 }
radiance 19
center -417.4895935058594 0 -76.44532012939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3285560283130401 0.5739275251711591 }
radiance 30
center -474.5589904785156 0 -35.34939193725586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8507402677123449 0.416943112171122 0.8723524289947798 }
radiance 20
center -455.48577880859375 0 -100.4760513305664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.938737272915771 0.3017007658298156 0.8211251777861751 }
radiance 22
center -443.4575500488281 0 -112.92049407958984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3875864026515057 0.8490775749321843 }
radiance 26
center -363.80377197265625 0 -46.23967742919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9661983142465431 0.47490892521105643 0.8956288228456287 }
radiance 23
center -483.14654541015625 0 -45.77994918823242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9789654714625533 0.4057037054943039 0.9666476226635482 }
radiance 21
center -417.0562438964844 0 -51.673011779785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9381564213645446 0.39336550912325297 0.9265488678780731 }
radiance 30
center -453.5434875488281 0 -53.002357482910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41681187734502523 0.785434872752781 }
radiance 18
center -486.6459655761719 0 -94.94364929199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.85122394903132 0.3685779179911046 0.8480400837203832 }
radiance 26
center -449.0553283691406 0 -102.69583892822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42764714852058583 0.8417260984148609 }
radiance 30
center -478.84637451171875 0 -123.62300109863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.856586767723869 0.4392784779157324 0.8376914198669232 }
radiance 27
center -456.6033630371094 0 -161.2499542236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9196894182522412 0.47662438762576476 0.8119497110057972 }
radiance 29
center -416.8822937011719 0 -168.5067901611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8952753543147762 0.4652654720805218 0.9560452444287054 }
radiance 21
center -388.62640380859375 0 -157.39093017578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8972423929489635 0.4598258117807983 0.8026115367654704 }
radiance 16
center -362.4986267089844 0 -157.96466064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8711479125899768 0.4425501466060705 0.9873732164596839 }
radiance 22
center -364.591552734375 0 -99.17150115966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6097391442840366 0.38715512510114236 0.9 }
radiance 22
center -372.9240417480469 0 -113.31283569335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33695052044807183 0.42930769617471976 }
radiance 27
center -394.7602844238281 0 -177.27386474609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6986265641233512 0.30636796056782944 0.9 }
radiance 19
center -355.28240966796875 0 -145.99203491210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7546189160899975 0.49797620749854915 0.9 }
radiance 26
center -472.610595703125 0 -82.54359436035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9963259368768322 0.42033275984011753 0.9092071774137989 }
radiance 22
center -451.4119567871094 0 -85.66851043701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9844662001798339 0.4429732061532681 0.9381342917296024 }
radiance 27
center -364.99359130859375 0 -100.49034881591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.926527269133137 0.3175424609450437 0.8737012239662576 }
radiance 16
center -449.0173645019531 0 -125.95267486572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8689060454983799 0.4984724522840933 0.8691168841903362 }
radiance 23
center -437.84002685546875 0 -180.50625610351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44364852474415395 0.4154090908426409 }
radiance 28
center -397.218505859375 0 -147.73782348632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3445854154675981 0.8090891238240684 }
radiance 17
center -387.2553405761719 0 -116.83645629882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8156286035457144 0.42261752274089526 0.90217754894965 }
radiance 29
center -460.4563903808594 0 -86.23131561279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8965277398051248 0.32712244552460656 0.9371829195048599 }
radiance 30
center -429.0235595703125 0 -121.63638305664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31639394330913245 0.7608707525812326 }
radiance 24
center -417.8329162597656 0 -98.08106231689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206208763135988 0.40475459482675724 0.9180769248427387 }
radiance 27
center -421.68011474609375 0 -148.15550231933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3697925540013963 0.604558012531716 }
radiance 22
center -416.58978271484375 0 -197.4722137451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41531960863469575 0.4973534168357555 0.9 }
radiance 24
center -404.71063232421875 0 -90.71929931640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8424882623575318 0.4298909194865789 0.9194744144688246 }
radiance 20
center -387.11700439453125 0 -118.99022674560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8928298143338325 0.3625334475464559 0.9987657312174818 }
radiance 19
center -464.3529052734375 0 -78.8895263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9149572352317804 0.3389415488981676 0.8680262627582476 }
radiance 21
center -379.6977844238281 0 -191.2371826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8919541059545653 0.32345315734581176 0.8878545932298096 }
radiance 17
center -386.0725402832031 0 -202.1378173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8787971282049067 0.3219651244342199 0.9706778309226044 }
radiance 16
center -356.1201477050781 0 -173.71807861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.946044088292771 0.47222360890154125 0.8372049849257901 }
radiance 24
center -374.9543762207031 0 -189.29214477539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9833939961565457 0.34759752758398016 0.9608150352545668 }
radiance 26
center -383.891845703125 0 -185.88037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5307903702913483 0.39647869830402305 0.9 }
radiance 30
center -361.9216613769531 0 -157.2572479248047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.918129927878891 0.4694172728994197 0.8482634787043625 }
radiance 19
center -439.3161315917969 0 -145.7719268798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9408285446599877 0.3434400869263168 0.883222559327942 }
radiance 17
center -390.6316833496094 0 -126.73065185546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9350491378503557 0.41015382429143965 0.9130042959879315 }
radiance 27
center -427.0403747558594 0 -170.2115936279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8293210216963105 0.4838123291021811 0.9928569834913 }
radiance 24
center -410.0512390136719 0 -151.4117431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6728750949523156 0.32235364382066334 0.9 }
radiance 29
center -449.529296875 0 -199.10877990722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8534838215164755 0.41960870877333944 0.9439751716755544 }
radiance 24
center -387.9314880371094 0 -77.38302612304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9098520514812005 0.45959439740472097 0.9330186805909297 }
radiance 21
center -463.0099182128906 0 -117.66210174560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8244257648279487 0.46340842616358646 0.9535289114873294 }
radiance 30
center -459.1302185058594 0 -166.62559509277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4173829122980912 0.7533614254487898 }
radiance 30
center -379.3574523925781 0 -167.29127502441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8830935043566768 0.38920065407615767 0.9806727915591155 }
radiance 20
center -376.5445251464844 0 -193.93763732910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8368913416180639 0.35998192016891967 0.8461675139495847 }
radiance 22
center -450.7436218261719 0 -165.75985717773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9321519949294754 0.4658777400746101 0.8538746305672575 }
radiance 31
center -346.8135681152344 0 -131.6188201904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8998227653918691 0.344703772413454 0.8845702336173555 }
radiance 18
center -333.8543395996094 0 -157.88272094726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3442683564986211 0.7166997791271793 }
radiance 27
center -391.9080810546875 0 -128.54278564453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9907337542010085 0.3633218391391574 0.8337395921623356 }
radiance 30
center -422.2330322265625 0 -177.8829345703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8569322089772587 0.4177855043227567 0.9559436914347674 }
radiance 29
center -457.5638427734375 0 -106.93745422363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38524436442721577 0.5555493041093078 }
radiance 22
center -441.61053466796875 0 -209.33819580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33264159349040123 0.6205659633024734 }
radiance 24
center -454.4646301269531 0 -129.76895141601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9128412436176572 0.3567784342077769 0.8176884263604294 }
radiance 23
center -367.43927001953125 0 -191.23666381835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3589808036653268 0.4673195762892368 }
radiance 28
center -416.92852783203125 0 -187.69786071777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9877085115091515 0.3473123934838128 0.9697459801676273 }
radiance 31
center -384.2612609863281 0 -179.54415893554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844031295200917 0.4848100231427368 0.9 }
radiance 20
center -400.1882629394531 0 -205.1670684814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8995218547157721 0.35553677244436593 0.9103532235202036 }
radiance 16
center -377.3994445800781 0 -159.44198608398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9468723634269063 0.3297234690474482 0.9288874922308875 }
radiance 21
center -416.12933349609375 0 -212.5799560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8781520462862016 0.37055336011933393 0.9792201947563413 }
radiance 29
center -345.5615539550781 0 -184.00730895996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7983670548339963 0.3964598159093269 0.9 }
radiance 28
center -403.3000793457031 0 -218.04757690429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8594526199467935 0.3088502724020378 0.9175095137941665 }
radiance 23
center -447.6459045410156 0 -206.2562713623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9112156868597483 0.4858352990254388 0.9728227255066655 }
radiance 28
center -333.0043029785156 0 -114.59593200683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9447298779263466 0.36908583766320113 0.9930053066781992 }
radiance 17
center -391.61956787109375 0 -144.40626525878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9118450010398328 0.3429907369661128 0.8664019066551383 }
radiance 18
center -394.4443054199219 0 -234.6951141357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8884593175512557 0.3271223756045701 0.8039652450406813 }
radiance 19
center -358.2666320800781 0 -197.12747192382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.972527427787606 0.4730550271358549 0.9504859747465332 }
radiance 28
center -323.5146179199219 0 -189.1723175048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.95859023519692 0.4842921675416171 0.9919332827784659 }
radiance 26
center -392.37353515625 0 -190.49057006835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108210675830623 0.32010590401353267 0.8637180023375972 }
radiance 29
center -371.9678649902344 0 -140.322265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8290266046529909 0.4898090510914822 0.8738959414603164 }
radiance 16
center -383.4504089355469 0 -216.3466339111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40978143635748043 0.4060892263516379 0.9 }
radiance 30
center -391.04986572265625 0 -240.32504272460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9650505254026572 0.42151326470027056 0.8687758104778848 }
radiance 17
center -324.5307922363281 0 -189.2659454345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8993854480508822 0.35635864303730114 0.9778416652257776 }
radiance 26
center -346.7223205566406 0 -172.7642059326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9123908845223436 0.49882745663707906 0.9879272814434885 }
radiance 23
center -372.4898986816406 0 -124.7244873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9806568009527642 0.44486666042307216 0.8721931670897483 }
radiance 31
center -348.014892578125 0 -148.23646545410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8389707636115449 0.42356514290505665 0.9806832680736453 }
radiance 26
center -354.54473876953125 0 -151.1371307373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44237180934250275 0.4265881366940993 0.9 }
radiance 20
center -341.4038391113281 0 -140.087646484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8400533937881097 0.4116704885693757 0.9390428934003174 }
radiance 29
center -332.28076171875 0 -143.94818115234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9366972145059173 0.3035676922718421 0.9280007288277393 }
radiance 28
center -434.9764099121094 0 -127.64825439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9183401117952298 0.3535896448359335 0.9511164883011518 }
radiance 23
center -396.3897705078125 0 -134.9582061767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.92477731586872 0.472940395803135 0.8323534080263262 }
radiance 19
center -432.1997375488281 0 -222.56979370117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8993000118808875 0.38382620920040894 0.9607227032444305 }
radiance 22
center -373.315185546875 0 -229.1112060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.951459424016623 0.30304593777060573 0.9911109146316264 }
radiance 22
center -424.04241943359375 0 -234.63890075683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6755274241549807 0.30250961314979646 0.9 }
radiance 24
center -338.4295959472656 0 -204.91683959960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35310273598365316 0.6250486141829154 }
radiance 22
center -348.427490234375 0 -152.2577362060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9065923194407531 0.30281320481851864 0.9586762595620306 }
radiance 16
center -424.0766296386719 0 -242.82069396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8946268623904554 0.47700658535709484 0.84430626140145 }
radiance 28
center -418.79998779296875 0 -239.5064697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9110308455079041 0.49543113829755825 0.9855226397953812 }
radiance 20
center -310.9638366699219 0 -265.5527648925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8793762587698053 0.41752342752310945 0.8449493399965282 }
radiance 24
center -319.3292236328125 0 -182.87709045410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8202759622258214 0.4437001645227174 0.8073736798515546 }
radiance 25
center -310.787109375 0 -192.54396057128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46196397367762654 0.5417656254938367 }
radiance 18
center -416.5771179199219 0 -173.29209899902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8930350449353349 0.36758083964246907 0.926504835817029 }
radiance 22
center -393.8576354980469 0 -250.07479858398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4254285057982931 0.5858428495505068 }
radiance 26
center -397.4643859863281 0 -175.86695861816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8145788477440301 0.4318737303241953 0.9658579078287401 }
radiance 22
center -334.6617431640625 0 -258.795654296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9450264382657594 0.3969774180482393 0.8319349667178442 }
radiance 18
center -349.7049255371094 0 -226.73046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8320395653147988 0.3417670239188276 0.9956930853912557 }
radiance 24
center -334.2586975097656 0 -213.9866943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49174114078134 0.5789457612928327 }
radiance 30
center -398.5824890136719 0 -230.93955993652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9919415879733899 0.4891539217000944 0.9408282320328736 }
radiance 25
center -375.0949401855469 0 -160.6063995361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.815950042504107 0.36564969271589964 0.9 }
radiance 20
center -374.1636962890625 0 -192.5667724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8551383484051492 0.3520689112395012 0.8637701072773832 }
radiance 24
center -397.94818115234375 0 -162.76393127441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.90109364708885 0.4689975401364818 0.9387105133554803 }
radiance 23
center -367.3249816894531 0 -244.97340393066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8325153501332481 0.4643160631178329 0.9441999686434 }
radiance 18
center -319.56396484375 0 -161.24435424804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9366816683497843 0.35532776946727923 0.8017447323654222 }
radiance 30
center -376.81494140625 0 -197.0487060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6624444239984022 0.36735926358661586 0.9 }
radiance 27
center -366.9443664550781 0 -266.4363098144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.957384067534286 0.4365892617607966 0.9471112230546126 }
radiance 20
center -389.5865783691406 0 -232.4601593017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47844725729184656 0.8563445360906972 }
radiance 19
center -304.7607727050781 0 -274.4878234863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9018140471278806 0.3536592712014207 0.837225987008956 }
radiance 18
center -408.4264831542969 0 -170.78514099121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9035818673352733 0.4681923796752525 0.8259407892210615 }
radiance 23
center -315.9563903808594 0 -244.09426879882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3728492520978457 0.735728754716503 }
radiance 22
center -326.4898376464844 0 -163.30154418945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8094026121043978 0.3605558726496486 0.918665255952191 }
radiance 21
center -338.02386474609375 0 -287.66448974609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9940876316214193 0.41594739516304235 0.9223724605168168 }
radiance 29
center -390.3789978027344 0 -181.91110229492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8477862326457843 0.4259623864568687 0.9177827962420715 }
radiance 31
center -336.0091857910156 0 -257.7638854980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9208468194755142 0.32246222290590354 0.8235552688594676 }
radiance 28
center -324.85614013671875 0 -218.86375427246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8936639620104239 0.4332720731405336 0.9132169135038654 }
radiance 19
center -303.8441467285156 0 -195.8284912109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40151946882909506 0.3717940049306011 0.9 }
radiance 31
center -365.320068359375 0 -211.48777770996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9669754808483622 0.3939320021622964 0.9969500924445661 }
radiance 31
center -409.6263732910156 0 -181.42884826660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3809715649098532 0.6640927502013618 }
radiance 23
center -406.0932922363281 0 -219.9945526123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9532946541818519 0.42191844336236706 0.8264378850155786 }
radiance 19
center -366.2723388671875 0 -245.9774627685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3932145272361852 0.6348204173422825 }
radiance 28
center -413.93658447265625 0 -229.3292999267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8179741074041205 0.369959481536809 0.8349352385098157 }
radiance 18
center -329.11053466796875 0 -275.68377685546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9342242699275081 0.4637579715942187 0.8245189884225497 }
radiance 20
center -387.47381591796875 0 -211.22511291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8400478129126917 0.4946028532157992 0.8678485953520301 }
radiance 17
center -345.76318359375 0 -209.20571899414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9699360586444584 0.46381037820210325 0.8475064815709314 }
radiance 18
center -354.451416015625 0 -238.73532104492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8838346537031148 0.364619618856052 0.9871215365175687 }
radiance 27
center -414.9060974121094 0 -220.3290557861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9768843968409551 0.3762873409830465 0.8203389802754802 }
radiance 30
center -354.4905090332031 0 -225.79905700683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5199990476739194 0.45403625410150633 0.9 }
radiance 16
center -349.62384033203125 0 -204.31036376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8380491997166274 0.42259318167442167 0.8979101876345001 }
radiance 22
center -285.2081604003906 0 -255.7715301513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8218079638938891 0.3204471453750352 0.8383506047419588 }
radiance 16
center -349.44354248046875 0 -192.65220642089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8489134488489485 0.3371763471789685 0.9423260627056561 }
radiance 30
center -319.256103515625 0 -247.57667541503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8921142717000933 0.4663764129043174 0.9545447535456056 }
radiance 27
center -398.1351013183594 0 -304.2698669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30422242076489436 0.598818838921774 }
radiance 23
center -383.6872863769531 0 -293.91302490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39615194735366666 0.6826264572953835 }
radiance 27
center -316.98748779296875 0 -210.4966583251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8140872557546666 0.38424768914503293 0.9625999326159947 }
radiance 24
center -397.56817626953125 0 -250.19300842285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5127277045567271 0.337843961153864 0.9 }
radiance 18
center -332.3775939941406 0 -229.4822235107422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49089862765287795 0.6307450518886623 }
radiance 24
center -397.7851867675781 0 -287.9898986816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9869280209696609 0.360493742614151 0.8642502289542858 }
radiance 24
center -399.5479431152344 0 -185.74319458007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9974880338617678 0.482531405730825 0.9184681845575151 }
radiance 27
center -281.66912841796875 0 -303.6873779296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34161019491354555 0.4167871589150569 }
radiance 31
center -297.12255859375 0 -199.89256286621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8453626061112675 0.3190692049723415 0.9792552711126588 }
radiance 23
center -401.6478271484375 0 -280.3478088378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9872946986113829 0.40662851367642705 0.9810352485929867 }
radiance 18
center -392.54656982421875 0 -299.8421325683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9466577706980905 0.3293785936560206 0.9422990844975125 }
radiance 28
center -397.8006286621094 0 -258.1417236328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8093609795088218 0.3139506747933186 0.826651022141113 }
radiance 16
center -321.45538330078125 0 -283.0272521972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9597374417457812 0.49225589895539523 0.9432412940037922 }
radiance 28
center -281.0072021484375 0 -192.0582733154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4403656768333829 0.36948890717630556 0.9 }
radiance 24
center -309.2105712890625 0 -269.67242431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9586366915231267 0.4694463446998245 0.939224449458488 }
radiance 22
center -357.117919921875 0 -286.2987976074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9779986696217388 0.34390132802849127 0.8561298598179191 }
radiance 18
center -302.2599182128906 0 -224.7305908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9158760196982099 0.33206998248573366 0.9186990504395262 }
radiance 17
center -278.94415283203125 0 -224.06324768066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8138159292737879 0.3933691380890191 0.9034134593177656 }
radiance 23
center -264.8570251464844 0 -235.85133361816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9081349704496816 0.42950109270343906 0.9611860101996255 }
radiance 31
center -380.3139343261719 0 -283.5451965332031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42258532997897613 0.795006781530511 }
radiance 30
center -368.48187255859375 0 -227.2419891357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4854881290697004 0.5574960205681968 }
radiance 19
center -268.8180236816406 0 -253.11936950683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8462457930945192 0.4128981540569653 0.8863229064128699 }
radiance 16
center -388.9035949707031 0 -302.7868957519531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9856221934960129 0.38894059010946086 0.9933789857686253 }
radiance 17
center -354.1404724121094 0 -318.0489501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8379552357027465 0.4132729203499987 0.8221648312858666 }
radiance 30
center -320.37835693359375 0 -238.84524536132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9748222173082269 0.40860087355193175 0.8936347304431307 }
radiance 18
center -376.4361267089844 0 -224.3513641357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8184508483775316 0.3030182595163068 0.8100298377774353 }
radiance 25
center -319.9935607910156 0 -291.7532958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8660967275334512 0.3244832139955153 0.8328002302743953 }
radiance 22
center -383.0793151855469 0 -311.59954833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8893486835763844 0.47717888906687456 0.9 }
radiance 27
center -319.5523681640625 0 -209.18556213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8395398911225866 0.30274039578257844 0.8911041820197498 }
radiance 31
center -364.9738464355469 0 -297.3758239746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3898780015806079 0.5348651517165476 }
radiance 19
center -354.7782287597656 0 -198.8426055908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4230188417508415 0.8437357046925195 }
radiance 28
center -295.1164245605469 0 -266.2234802246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.542102727967756 0.4287064621644885 0.9 }
radiance 29
center -299.093017578125 0 -203.0371551513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8331615466343578 0.3919739535127035 0.8655522825117862 }
radiance 19
center -336.0701599121094 0 -293.838134765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8621084032043396 0.3655683945671907 0.9564079338382931 }
radiance 19
center -271.1666259765625 0 -307.4930419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9409033824521418 0.46686856312083236 0.8909712001645105 }
radiance 20
center -346.3393859863281 0 -331.9230651855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9090240047813218 0.3800948977594135 0.8461815203585735 }
radiance 21
center -320.10882568359375 0 -274.8220520019531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9284436452011259 0.38401663013096593 0.8060503901728959 }
radiance 21
center -267.2709045410156 0 -231.29263305664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8797235778964949 0.3812469404447573 0.8425593872178989 }
radiance 16
center -337.0794677734375 0 -223.9720916748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9375947117283432 0.49420696511338535 0.847671149620074 }
radiance 21
center -310.0562438964844 0 -274.46038818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8340402114805293 0.46515675041549803 0.8302118184926638 }
radiance 30
center -349.1950378417969 0 -258.7261962890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9910755487698913 0.45774192538995345 0.8624017588242603 }
radiance 31
center -337.7465515136719 0 -321.6485595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9162051205799855 0.46972337296343225 0.9916605338380352 }
radiance 18
center -363.94256591796875 0 -323.52734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6048968397889763 0.40396380773088014 0.9 }
radiance 27
center -323.9655456542969 0 -259.92254638671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9916932275123697 0.31734843807373764 0.9259046674640168 }
radiance 19
center -328.2207946777344 0 -227.51126098632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603769498447298 0.4955095329480662 0.9259963049231352 }
radiance 21
center -366.2319030761719 0 -323.7127380371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9761734750256393 0.3575775253338474 0.9244933894556581 }
radiance 22
center -264.1951599121094 0 -326.2794189453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8828486729451087 0.4137653643019473 0.8012444770141848 }
radiance 19
center -345.1418762207031 0 -326.71771240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7795830138706409 0.3954487925027565 0.9 }
radiance 28
center -247.96844482421875 0 -271.17962646484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9539770892726591 0.4646729488919023 0.8463075922811015 }
radiance 28
center -365.32244873046875 0 -225.44110107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9300515727019745 0.36917720045451785 0.8550690323034685 }
radiance 24
center -344.96234130859375 0 -307.82373046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49754530414809117 0.4455681698837095 }
radiance 25
center -313.3598937988281 0 -285.5773010253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.884336504818087 0.46687359865742895 0.8014800049083756 }
radiance 27
center -343.77783203125 0 -287.1517639160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8577506270467294 0.3347434278840951 0.8623666858793542 }
radiance 22
center -360.3607177734375 0 -272.50360107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4408942686676848 0.8199790423893365 }
radiance 22
center -306.8526306152344 0 -241.24496459960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992782812718427 0.3462391284653822 0.8708827648583075 }
radiance 28
center -350.8706359863281 0 -273.3475341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8890851952531845 0.3519710181549032 0.8122034000832974 }
radiance 26
center -265.7842102050781 0 -298.99920654296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6090220580222048 0.34049874731866314 0.9 }
radiance 18
center -296.0232238769531 0 -235.1211700439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9007508463599443 0.37360385778152316 0.8283991877774992 }
radiance 16
center -264.15557861328125 0 -308.0220642089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8318579911794843 0.35894447306169436 0.8039113729442241 }
radiance 24
center -301.3260498046875 0 -286.9554748535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.983195843179334 0.4344700758672455 0.8518993259136299 }
radiance 30
center -310.6619567871094 0 -235.72154235839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8494265267730441 0.3740633324781559 0.94707006601614 }
radiance 25
center -349.3741149902344 0 -285.47918701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9622747253048719 0.43630174562152757 0.8039195793535059 }
radiance 30
center -328.4839172363281 0 -280.3403625488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9069317999827228 0.38491623232029604 0.8758404348949494 }
radiance 24
center -291.3525695800781 0 -318.4060363769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6176426274059054 0.4857964714469153 0.9 }
radiance 17
center -240.55784606933594 0 -244.42001342773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8731776459294083 0.4206796703794542 0.9169178393948316 }
radiance 25
center -312.4652404785156 0 -348.72412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9909132116123814 0.34048229727636165 0.8101772240012426 }
radiance 26
center -279.1005554199219 0 -319.7275695800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.985762287708742 0.3609692271304204 0.8679836906432246 }
radiance 28
center -336.1119079589844 0 -353.7347106933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8157698461397896 0.34658076625936646 0.9255348327113159 }
radiance 17
center -237.2361602783203 0 -247.0929412841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9845814529108297 0.48150745121297445 0.8380779440607621 }
radiance 20
center -350.8578186035156 0 -239.71603393554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9371296585036515 0.40020675563287744 0.895894487455859 }
radiance 25
center -243.95559692382812 0 -313.2122497558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.808366549701676 0.3060477900550429 0.8387997562172234 }
radiance 24
center -348.3724365234375 0 -323.0370788574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4818824262126773 0.4579231944398118 }
radiance 31
center -240.5780029296875 0 -274.0765075683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6190665966216776 0.31627210191449234 0.9 }
radiance 29
center -273.7795715332031 0 -264.8988342285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8202491817771305 0.47116648053482846 0.8571303050978181 }
radiance 26
center -337.9573059082031 0 -319.8538513183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8658664237578427 0.30675436944663703 0.9 }
radiance 25
center -280.3072509765625 0 -320.3289794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4747773458474588 0.4080463731667754 }
radiance 29
center -329.2019958496094 0 -312.4049072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.849299792696048 0.3293592972114178 0.8892678117323163 }
radiance 30
center -272.61370849609375 0 -340.7830810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206050419641931 0.4044866002196408 0.9689156311456805 }
radiance 26
center -233.96615600585938 0 -332.0035095214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7164794192296478 0.3054143700963277 0.9 }
radiance 26
center -231.51658630371094 0 -325.47711181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.855970367688905 0.35091688951655603 0.9579021370573669 }
radiance 16
center -242.9714813232422 0 -301.87646484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447234315418514 0.46599066133752987 0.8142473264220809 }
radiance 31
center -224.56625366210938 0 -343.47564697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8543570898271559 0.30015874302543505 0.8504322570650139 }
radiance 18
center -279.1877136230469 0 -320.8800048828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8915325912871288 0.32444957102698574 0.9668039879126671 }
radiance 26
center -240.72247314453125 0 -265.8612976074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.946104302239191 0.49852281221354733 0.8863306000270976 }
radiance 26
center -233.417236328125 0 -276.8875732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8468356508995609 0.3006415191537108 0.8230528994992103 }
radiance 19
center -220.26730346679688 0 -335.0116271972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8733854553106725 0.3479822047222262 0.8934056499727843 }
radiance 18
center -316.0462951660156 0 -332.12744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8332790182365559 0.31186043852758066 0.8790147421160609 }
radiance 28
center -213.63265991210938 0 -252.47836303710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9004398586975941 0.4915752247068671 0.8145900337109687 }
radiance 25
center -327.4427490234375 0 -302.6619873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8964465158702762 0.35317523872971673 0.8065592351480737 }
radiance 17
center -235.42710876464844 0 -273.9515686035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3217179620350966 0.8361782418444359 }
radiance 23
center -302.102294921875 0 -358.35003662109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9800603344501612 0.448342721887262 0.9585556039118884 }
radiance 31
center -289.3879089355469 0 -349.7445983886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9360137264794621 0.430816715823201 0.8206165817624556 }
radiance 24
center -292.04144287109375 0 -264.30096435546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9443162423536132 0.3384334449317505 0.925554271838436 }
radiance 31
center -242.17144775390625 0 -288.2392272949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9572641032175623 0.3621533125109671 0.8456133102673444 }
radiance 16
center -217.42318725585938 0 -286.62786865234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8039751316340784 0.3277208144170245 0.9 }
radiance 21
center -219.69888305664062 0 -283.35980224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308642470820252 0.3511111072620486 0.9220722313833516 }
radiance 25
center -255.5943603515625 0 -278.9973449707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6507957654892303 0.36369458155669876 0.9 }
radiance 31
center -226.91615295410156 0 -355.34222412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9837270414081838 0.49763614297334713 0.9023167506563488 }
radiance 19
center -283.22784423828125 0 -315.3752136230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8452124790196284 0.3760890981539 0.8736579950730073 }
radiance 28
center -311.475830078125 0 -306.28399658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9636091914452307 0.3899608928198429 0.9480435400247756 }
radiance 20
center -217.0777130126953 0 -265.4546813964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8601953797081338 0.3502939284378804 0.9940915336133231 }
radiance 18
center -314.6164245605469 0 -295.80511474609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9111833248666448 0.4508009152299619 0.9528628216297031 }
radiance 21
center -278.8739318847656 0 -319.7245788574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3364184537557113 0.4892873056093372 }
radiance 20
center -273.6638488769531 0 -266.7229919433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42715173309706755 0.4958943310603684 0.9 }
radiance 25
center -223.7495574951172 0 -297.798095703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5660450199432474 0.40730533819668713 0.9 }
radiance 22
center -272.0665283203125 0 -288.73004150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.90767610894345 0.4217314758349451 0.846968377505322 }
radiance 22
center -205.01531982421875 0 -339.0676574707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9987883849807719 0.4782850420802304 0.9988101980863349 }
radiance 24
center -206.8334197998047 0 -361.5467834472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9022971532930546 0.3207860232500917 0.8169028933402642 }
radiance 24
center -280.0713195800781 0 -360.09210205078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4673157674425924 0.4608981026903886 0.9 }
radiance 25
center -250.00241088867188 0 -262.5799865722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.934660811328567 0.4159081946389195 0.8452132418876039 }
radiance 17
center -302.1586608886719 0 -343.3426208496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8242841862269176 0.47776404201161593 0.9124073785236225 }
radiance 27
center -308.6612243652344 0 -308.41180419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.822688895432213 0.3145934956690946 0.8446102447400224 }
radiance 20
center -311.7501525878906 0 -379.6001892089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9660153490608607 0.3930732345713889 0.856399885452275 }
radiance 27
center -233.68893432617188 0 -271.4685974121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9236038236633514 0.32890272085577776 0.8067877409856884 }
radiance 31
center -313.3519287109375 0 -318.74945068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8248606952046194 0.33463598382708454 0.9309712621446666 }
radiance 26
center -204.77777099609375 0 -318.4731750488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4432764904624815 0.37444805664333813 0.9 }
radiance 17
center -265.5634765625 0 -331.1891174316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8886602202102544 0.473723742412692 0.9370212375357027 }
radiance 16
center -223.0741424560547 0 -371.6727600097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8816752438993423 0.412643944270915 0.816164615002785 }
radiance 30
center -181.3513641357422 0 -324.4083557128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9374966969463479 0.4317769442960975 0.9429555239156072 }
radiance 18
center -204.554931640625 0 -362.9223937988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9409834206077587 0.4661462712161829 0.9694579769908916 }
radiance 21
center -196.6199493408203 0 -346.7145080566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4864211949597139 0.8681773018501131 }
radiance 23
center -251.70069885253906 0 -346.76531982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9866591198172174 0.33414433269166227 0.9501114241965055 }
radiance 16
center -206.7959747314453 0 -372.1932678222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8714733607590203 0.41045626730876883 0.8181372484270653 }
radiance 28
center -193.9375 0 -373.7735900878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5957449627842774 0.45338919423264845 0.9 }
radiance 30
center -261.57611083984375 0 -343.102294921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3777525976723547 0.6032842566438631 }
radiance 24
center -176.75453186035156 0 -301.9930114746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5665985518433471 0.37411445992151837 0.9 }
radiance 27
center -190.4463348388672 0 -373.0917663574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9367532115302165 0.429227336343723 0.8689280417116885 }
radiance 16
center -218.5034942626953 0 -318.7520751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9078422353598468 0.32387423861426784 0.9276088429523439 }
radiance 19
center -213.3751220703125 0 -311.4177551269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4911641017574936 0.3982717287782679 0.9 }
radiance 29
center -244.99111938476562 0 -298.1298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9503633859262699 0.4427955126452065 0.8145805081790565 }
radiance 16
center -180.21249389648438 0 -310.89019775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.539382024942832 0.40691056181441754 0.9 }
radiance 19
center -208.2662353515625 0 -285.5597839355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8422206731046513 0.30799585915191297 0.8461061396487328 }
radiance 20
center -251.3178253173828 0 -318.8649597167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8221426448561749 0.4462053493890459 0.96690266703066 }
radiance 18
center -181.81362915039062 0 -295.1687316894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8356769346733186 0.4501698530990245 0.9824866696572245 }
radiance 28
center -240.28968811035156 0 -305.135498046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6545477143085736 0.4527956972020578 0.9 }
radiance 18
center -172.25672912597656 0 -381.6036376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9354869960441433 0.4374219494901292 0.8223971368308909 }
radiance 22
center -164.47108459472656 0 -324.62628173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.889654819096532 0.4378092869367658 0.9101058801082229 }
radiance 16
center -272.6919250488281 0 -370.64068603515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8323576041659435 0.43345062536224377 0.8192880299761245 }
radiance 28
center -260.76922607421875 0 -324.4656677246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9565939630464226 0.3952394314037414 0.8326774490854761 }
radiance 30
center -262.565673828125 0 -347.58819580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9268639970074053 0.41655545905657915 0.8291665563314867 }
radiance 31
center -205.25096130371094 0 -333.13970947265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308436354414028 0.44942884537592076 0.8272906177887666 }
radiance 31
center -186.95924377441406 0 -361.61700439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8060083912351085 0.4525914262516696 0.9779504742074383 }
radiance 17
center -161.66653442382812 0 -317.0750427246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8349385000000685 0.31087806248014604 0.9 }
radiance 23
center -230.6387481689453 0 -300.7662353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8621104780532629 0.40774229117388744 0.9292868748710654 }
radiance 19
center -209.41610717773438 0 -292.5657653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8375964018128776 0.44331240229154456 0.9588648859331371 }
radiance 31
center -215.6155548095703 0 -318.4427185058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.671297792873958 0.3163748925279156 0.9 }
radiance 20
center -185.61819458007812 0 -387.98345947265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4502791907745677 0.6275550633770034 }
radiance 31
center -164.79876708984375 0 -290.79156494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.90145383553674 0.33098993022136086 0.8585463195193519 }
radiance 25
center -158.6870574951172 0 -349.1619873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8907651623429766 0.49040012686464496 0.8972362283923846 }
radiance 17
center -219.92507934570312 0 -289.0385437011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5084737677557577 0.31221897352282 0.9 }
radiance 29
center -183.22996520996094 0 -309.79437255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9794429010304675 0.40835857641080187 0.8499586185284476 }
radiance 23
center -269.70098876953125 0 -344.4723205566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9212300280725048 0.3086114995121406 0.8217378952494434 }
radiance 25
center -217.20553588867188 0 -380.9505310058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46530950057122367 0.3078708658856755 0.9 }
radiance 18
center -262.02935791015625 0 -328.1680603027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9807829192340224 0.498194279731781 0.8384164802421634 }
radiance 23
center -240.05563354492188 0 -303.0116882324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8642490691697059 0.32351946894993966 0.9 }
radiance 20
center -238.595947265625 0 -386.85064697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8512859538706699 0.30775817393888905 0.842921294597601 }
radiance 20
center -179.51072692871094 0 -340.1398620605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8121508882495422 0.3527491624586368 0.965479657030607 }
radiance 26
center -207.95643615722656 0 -318.93609619140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4313843824402683 0.7350360332380872 }
radiance 25
center -152.25807189941406 0 -312.544677734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9575509922295077 0.30654478524255996 0.8987316783081429 }
radiance 24
center -234.86074829101562 0 -356.06793212890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9441697190853416 0.4836916356228316 0.9730890911744627 }
radiance 25
center -160.0330810546875 0 -326.32843017578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35503297641272996 0.6794005231465355 }
radiance 31
center -142.1830291748047 0 -343.38311767578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36285235402951826 0.6648964111687498 }
radiance 22
center -232.1545867919922 0 -383.8946533203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8172825362778333 0.46931592893574176 0.8094442436387561 }
radiance 17
center -189.0408477783203 0 -405.5761413574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6402311377174448 0.4370951217080272 0.9 }
radiance 22
center -170.16465759277344 0 -366.6135559082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9345478875055211 0.43872023070610416 0.8686299990711883 }
radiance 23
center -204.84141540527344 0 -387.4300537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3670260716443534 0.6806788749092657 }
radiance 18
center -139.8762664794922 0 -298.325927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3154543490197899 0.46596141995154594 }
radiance 19
center -220.15077209472656 0 -319.60809326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872082710942612 0.49253813654331946 0.8206071734372853 }
radiance 17
center -178.3472442626953 0 -391.6510009765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212345367207645 0.3553159521198745 0.9986968681295098 }
radiance 21
center -249.35301208496094 0 -354.2645568847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.954083895788782 0.4053070041480504 0.8096563413822331 }
radiance 17
center -200.1627197265625 0 -353.59100341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8497971840758853 0.34917035965886806 0.9697092806989944 }
radiance 26
center -247.75933837890625 0 -315.8145751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131528466235505 0.4517494771584397 0.928867317084527 }
radiance 24
center -155.7720184326172 0 -363.4368591308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8841261540937013 0.4989453599850659 0.8457797134798749 }
radiance 19
center -248.92337036132812 0 -364.3866882324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9856897763810529 0.4300684368702671 0.8895373520147751 }
radiance 29
center -133.6215362548828 0 -395.66729736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9224257445193792 0.42248575006255673 0.919100371308032 }
radiance 25
center -174.12258911132812 0 -396.556396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9984744104235445 0.39167633757332 0.8111767674268373 }
radiance 28
center -146.5869140625 0 -368.8049621582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9285981738176821 0.37534248383880975 0.8180617303200051 }
radiance 25
center -228.79124450683594 0 -320.21209716796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9773479030537988 0.49137631350910993 0.8379790810092773 }
radiance 24
center -189.00466918945312 0 -385.3417663574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9355064559971394 0.3233686990327425 0.8399466330779439 }
radiance 19
center -124.26976776123047 0 -346.00360107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9882967824486514 0.34857611441875724 0.8911522590104438 }
radiance 30
center -157.20962524414062 0 -371.9120178222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8771161828298448 0.43993254938113335 0.8228990962795613 }
radiance 19
center -221.1342010498047 0 -410.0733337402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9698712926827663 0.3722966687912214 0.8817518675968075 }
radiance 29
center -147.43995666503906 0 -363.8915710449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9866183434750432 0.3698832092052202 0.8439532569177409 }
radiance 23
center -114.21786499023438 0 -350.24932861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9830165399595466 0.30565515239785557 0.8799727629523322 }
radiance 29
center -209.0027313232422 0 -308.6731872558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5618973871779394 0.38018102173966584 0.9 }
radiance 26
center -217.26687622070312 0 -401.39215087890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4031023903200982 0.7916928109161516 }
radiance 28
center -190.6440887451172 0 -337.45819091796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8067684983389162 0.40230443929797155 0.8619273000825765 }
radiance 31
center -228.21746826171875 0 -412.3583068847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5275168565082794 0.3468130863015594 0.9 }
radiance 23
center -170.32521057128906 0 -392.7171630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9570157934091387 0.49569573997298966 0.8327217150433072 }
radiance 29
center -175.2357940673828 0 -315.4231262207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9843841550026262 0.3309626798541448 0.8557963615241108 }
radiance 18
center -167.45643615722656 0 -310.5518493652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8608485394519734 0.38054158067748567 0.9636239427025188 }
radiance 30
center -220.78665161132812 0 -405.1360778808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8083723397856672 0.4338990502346888 0.9987592603128264 }
radiance 25
center -140.03775024414062 0 -305.2200012207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9451550156925903 0.47152903737161733 0.9077626917737718 }
radiance 18
center -173.7890167236328 0 -411.92724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8711716134379949 0.34493894596715563 0.9598481791743985 }
radiance 23
center -165.4507293701172 0 -329.5841064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9995980727320014 0.4088687440813541 0.9610561785956409 }
radiance 16
center -148.15682983398438 0 -340.7746887207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9997129809614832 0.3501460645028052 0.8778007000144085 }
radiance 17
center -202.17446899414062 0 -385.28729248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3615872025818998 0.7639518499718676 }
radiance 16
center -185.3507537841797 0 -347.8143310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9964776604438245 0.30101693575030664 0.8469944902065083 }
radiance 26
center -180.47830200195312 0 -313.5462951660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9539115128061117 0.4498930897480431 0.9168550594863639 }
radiance 29
center -110.8752212524414 0 -396.29327392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8177532107817782 0.46150519739821205 0.9 }
radiance 23
center -188.2655487060547 0 -347.4231872558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8277657019176679 0.3102633677365941 0.9461489178193905 }
radiance 19
center -139.5023193359375 0 -414.47393798828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9115505377220331 0.42508736350965437 0.966815464911582 }
radiance 24
center -186.04837036132812 0 -328.99774169921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7837255558160912 0.3611418777035768 0.9 }
radiance 25
center -97.80685424804688 0 -411.4978332519531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9095115469577181 0.31039366466385543 0.9348101536487189 }
radiance 23
center -165.2779541015625 0 -373.9382019042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8275088859927747 0.4331159282909669 0.9 }
radiance 31
center -148.51708984375 0 -360.4346618652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9062888215788985 0.49059427548108075 0.942311805963424 }
radiance 28
center -195.69436645507812 0 -328.5948181152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8342008250075416 0.41005344190400617 0.9158121088652307 }
radiance 30
center -114.04840087890625 0 -391.5699462890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8348069340578558 0.4178708412547165 0.965732464947072 }
radiance 16
center -146.86727905273438 0 -319.9901123046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9552002802700531 0.317391264573548 0.8613955235045951 }
radiance 28
center -201.3440704345703 0 -371.9276123046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6162599892029007 0.4388181203032899 0.9 }
radiance 17
center -137.9680633544922 0 -350.2644348144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.71035065956191 0.41747687540957035 0.9 }
radiance 23
center -118.58688354492188 0 -310.339111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9514827877646131 0.4888951672502527 0.8533453964348774 }
radiance 28
center -150.72023010253906 0 -343.50274658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9297984922090745 0.44100699783949426 0.9447518035309727 }
radiance 17
center -207.07373046875 0 -372.74224853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3274300670552898 0.49316999096436676 }
radiance 22
center -117.70055389404297 0 -305.9859619140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8987260255174769 0.4861753057205369 0.8137814909838931 }
radiance 31
center -126.84588623046875 0 -422.5660400390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49240100366240613 0.547961776370662 }
radiance 30
center -178.46188354492188 0 -381.51202392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9247130127168948 0.449764340715727 0.9301145906506326 }
radiance 19
center -145.3233184814453 0 -377.8548889160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9052242056034445 0.4322509087848806 0.8952376687193796 }
radiance 19
center -117.01838684082031 0 -418.0076599121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.906904641679363 0.338707044255918 0.965227346747843 }
radiance 17
center -136.2095489501953 0 -408.7979736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40339344474793914 0.558034578075082 }
radiance 30
center -157.55780029296875 0 -381.9253845214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47462403564179423 0.5073037816831327 }
radiance 28
center -152.8382110595703 0 -397.83538818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9458279381684231 0.49112173648407914 0.973962952492659 }
radiance 26
center -142.7890167236328 0 -336.6428527832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9715207280800225 0.3767525424162221 0.8952368271247264 }
radiance 21
center -132.5838623046875 0 -358.8185729980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9670388374320277 0.48115127160049476 0.8826830941634081 }
radiance 28
center -111.07210540771484 0 -364.856689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447860083417316 0.33912905788013675 0.8567632035579179 }
radiance 22
center -102.77680206298828 0 -339.46441650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9388426428754686 0.39050968393216223 0.8442144255018356 }
radiance 31
center -120.7276611328125 0 -375.7984313964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3741271726161085 0.7773913948021353 }
radiance 26
center -93.33943939208984 0 -313.0712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8238774712250306 0.4391739035066079 0.9570258413680621 }
radiance 26
center -99.07649230957031 0 -387.1469421386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8520353873284835 0.47832059931141735 0.9984165097447829 }
radiance 30
center -81.02259826660156 0 -358.67388916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9856419893345172 0.35112875664354043 0.8427865530338163 }
radiance 18
center -68.70796966552734 0 -349.9349060058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8710352616092852 0.31997887945992703 0.9 }
radiance 25
center -168.23304748535156 0 -423.2739562988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.832930380243829 0.3487206227472151 0.9691989347453868 }
radiance 21
center -155.84060668945312 0 -350.5471496582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9609988096339174 0.3205152493468955 0.8288762079470908 }
radiance 16
center -145.82911682128906 0 -312.6873474121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8269285167606532 0.33771903779371004 0.8533178425599053 }
radiance 29
center -162.59310913085938 0 -357.1361389160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8564000279316173 0.4606834776532993 0.8838070372728642 }
radiance 30
center -159.74365234375 0 -394.0483703613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9505449477595023 0.35796718682356793 0.821387801914429 }
radiance 29
center -83.10941314697266 0 -422.7287902832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8808327678286151 0.43251463263320433 0.9674612183994531 }
radiance 23
center -118.96502685546875 0 -320.2139892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.327033919992629 0.46609537474637885 }
radiance 16
center -144.4585723876953 0 -347.9708251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8703294814366547 0.42212222411562345 0.9924624612455161 }
radiance 20
center -151.5208282470703 0 -349.5661926269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9380445014889832 0.414157720957711 0.9421494928090661 }
radiance 31
center -161.13890075683594 0 -366.5883483886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.806967411971257 0.416259143312156 0.8804298184300414 }
radiance 16
center -63.47980880737305 0 -373.8883361816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9317966485973743 0.36797263167928984 0.9771864702474327 }
radiance 28
center -122.86569213867188 0 -426.7550354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36654881576825626 0.7183869859511535 }
radiance 29
center -126.54788970947266 0 -408.519287109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4645820064199452 0.4700502524367227 0.9 }
radiance 17
center -124.7914810180664 0 -408.14044189453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9836514458083019 0.45974917813943533 0.8625444092667431 }
radiance 29
center -155.0187530517578 0 -420.556884765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9768540633685842 0.40013767309102927 0.9606105755755736 }
radiance 26
center -53.9710693359375 0 -346.2225341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4423942960576994 0.7596098189964923 }
radiance 21
center -115.57889556884766 0 -400.2443542480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9044351372410963 0.4635918999993668 0.8731843720502226 }
radiance 24
center -47.262962341308594 0 -423.50689697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8677250119854377 0.45853751452153446 0.824683862130273 }
radiance 16
center -97.30951690673828 0 -357.7911071777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6253078648850974 0.32062610845085865 0.9 }
radiance 16
center -149.65313720703125 0 -358.9424133300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4598969555030088 0.851785326525917 }
radiance 17
center -50.751014709472656 0 -311.94451904296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8750990187322679 0.41567432216231626 0.9496332775917298 }
radiance 29
center -117.32064056396484 0 -365.0313415527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9433457732061508 0.4047238221683719 0.9389027543914201 }
radiance 22
center -141.09695434570312 0 -386.7908630371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4099236447690905 0.39665574575959106 0.9 }
radiance 19
center -137.59671020507812 0 -340.8631591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5502450446674939 0.30117156137230455 0.9 }
radiance 29
center -125.68531799316406 0 -327.24456787109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8783128095742874 0.4364652106638609 0.9179597094320873 }
radiance 25
center -95.89444732666016 0 -360.30609130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9443940454804781 0.45730398763208047 0.8306403177292435 }
radiance 21
center -136.4996337890625 0 -385.28717041015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.845995574119671 0.36867066867032294 0.8558710280520345 }
radiance 26
center -108.35629272460938 0 -355.08734130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9337300018888471 0.3963592780035287 0.8720235473233249 }
radiance 19
center -40.35299301147461 0 -375.236083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8427846371049106 0.46268194319334255 0.8099055156056316 }
radiance 18
center -46.1706657409668 0 -326.9880065917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9846918431684422 0.46311464490055376 0.9027308081125722 }
radiance 17
center -68.70374298095703 0 -378.31097412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8804657513893233 0.3696495944307845 0.8878508214947526 }
radiance 30
center -124.12190246582031 0 -353.6731872558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5594857652335681 0.4239119972286556 0.9 }
radiance 31
center -122.8653793334961 0 -386.34808349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8300894252777135 0.42775386789288994 0.9924950247153123 }
radiance 20
center -66.84963989257812 0 -387.6672668457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3521725553177231 0.797899957282741 }
radiance 31
center -40.96029281616211 0 -389.4122009277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8349582761607751 0.4786911916983012 0.845836103780764 }
radiance 27
center -53.9459114074707 0 -346.5837097167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8496861635335685 0.47074956202077856 0.8171590691405413 }
radiance 31
center -49.71753692626953 0 -403.21783447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5089499057270415 0.44939573553355616 0.9 }
radiance 28
center -52.98109436035156 0 -327.4012756347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8505797273154934 0.34566072279936144 0.8663944150127789 }
radiance 29
center -79.76666259765625 0 -424.4531555175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8930874141234407 0.3512019579965549 0.9441183103230509 }
radiance 27
center -101.00431823730469 0 -375.71429443359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5403213252548168 0.33982424184451576 0.9 }
radiance 20
center -106.74199676513672 0 -374.28533935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9716156768714659 0.33821081210289544 0.9131138388361065 }
radiance 28
center -110.29963684082031 0 -361.74237060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9301308139605209 0.317036198714374 0.8533496579377444 }
radiance 19
center -26.095685958862305 0 -323.5534362792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8425190570066946 0.4074323583108326 0.8989797400885798 }
radiance 17
center -94.65148162841797 0 -318.8949279785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3712170243999209 0.8601537857114341 }
radiance 29
center -30.78447151184082 0 -338.60552978515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8663643011836313 0.42814344344779237 0.9616555566337084 }
radiance 27
center -20.97977638244629 0 -381.7119445800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9534157282535997 0.35417838093618964 0.9903377406209873 }
radiance 28
center -75.34228515625 0 -347.9752197265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8523489382866349 0.4920570751325294 0.9300214275606719 }
radiance 19
center -82.19747161865234 0 -408.24932861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30082634826114624 0.8875015563930582 }
radiance 19
center -61.93783187866211 0 -333.9251403808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8853480819518077 0.4371658546932266 0.8454594236978916 }
radiance 26
center -64.38024139404297 0 -421.7765197753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3399854422146726 0.8802939528468924 }
radiance 26
center -109.3135757446289 0 -327.1521911621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.85824350132076 0.44030345912148755 0.9911079042450129 }
radiance 31
center -44.42954635620117 0 -379.52978515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9768368621293774 0.35155956198431315 0.9941106407983387 }
radiance 28
center -33.2440071105957 0 -372.9134216308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8501588367913379 0.49503263623648475 0.8932990377070271 }
radiance 24
center -51.65348815917969 0 -372.0286560058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6396642117625785 0.49318566886730886 0.9 }
radiance 30
center -20.986751556396484 0 -360.9471740722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9824878499162879 0.4224682625169439 0.9908613029058541 }
radiance 20
center -54.837989807128906 0 -377.9450988769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8096908610635206 0.3524380245038104 0.8289766086113527 }
radiance 22
center -80.24354553222656 0 -395.8119201660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8584254611195026 0.34928049612831363 0.9979139679287818 }
radiance 27
center -17.619462966918945 0 -416.459716796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9371148301775407 0.45909899961709366 0.9807219591967914 }
radiance 29
center -91.59973907470703 0 -392.3572998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3313398397899048 0.7086336166452605 }
radiance 28
center -43.4372673034668 0 -363.3628234863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7479585482332035 0.32045853611067987 0.9 }
radiance 30
center -31.901865005493164 0 -359.3645324707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9605794333346555 0.41989045161136074 0.9348007527214496 }
radiance 21
center -41.13649368286133 0 -406.91107177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9643736323274033 0.3834405646198921 0.8502898774856915 }
radiance 20
center -73.44396209716797 0 -336.7157287597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4566969166984082 0.5331091889222784 }
radiance 26
center -50.717079162597656 0 -366.7106018066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9828671890792031 0.35936978056073376 0.9000206501793993 }
radiance 22
center -87.87346649169922 0 -396.2562255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9145013841653681 0.30023816359271005 0.9077991462354917 }
radiance 29
center 14.011462211608887 0 -314.18389892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9891258654719733 0.3448179075998671 0.9405695782388235 }
radiance 23
center -85.03577423095703 0 -391.68170166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9420401440676822 0.4701632917282562 0.9639774273800252 }
radiance 26
center -72.70097351074219 0 -412.2456359863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8619310110127961 0.44134300975548346 0.9 }
radiance 24
center 13.148731231689453 0 -328.4433898925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9930840750740999 0.4802313716528652 0.8743457488213389 }
radiance 20
center -14.892985343933105 0 -316.3970642089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9173852190705375 0.3945474908053598 0.8850115640910978 }
radiance 28
center -12.779153823852539 0 -415.7477722167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9729077832646422 0.4301740044818891 0.8485989228539685 }
radiance 19
center -12.42902946472168 0 -354.9331970214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4132286283359442 0.37909496381227814 0.9 }
radiance 31
center -47.68404006958008 0 -363.82672119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8115309405387041 0.3424339621199608 0.8783410128635448 }
radiance 24
center -19.39189338684082 0 -340.1664733886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6616085539794273 0.4591220105978744 0.9 }
radiance 21
center -0.8051597476005554 0 -347.7218933105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8583019583325265 0.39831020400190636 0.9 }
radiance 22
center -46.915870666503906 0 -380.8470153808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8329134108557011 0.4844786356748406 0.982739797949585 }
radiance 31
center -50.32693099975586 0 -342.6999206542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9088472875217106 0.3126648463616932 0.8552499826683395 }
radiance 27
center -19.936752319335938 0 -378.5159912109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8902975534089327 0.4044052053413024 0.9724301134399455 }
radiance 30
center -23.4939022064209 0 -336.2242431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8362555288492032 0.38731569053445714 0.9964796129225835 }
radiance 29
center -39.78561782836914 0 -383.34771728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8953547370926125 0.38515484292447155 0.9729718728403756 }
radiance 20
center -88.51589965820312 0 -412.609619140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9502975865406673 0.3628904269500359 0.9903453971128691 }
radiance 23
center -34.246665954589844 0 -368.89874267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4503980806422583 0.8977285435374053 }
radiance 22
center -26.05078887939453 0 -424.7528076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8941220883634016 0.39833826222565305 0.9382587720485485 }
radiance 19
center -18.50956916809082 0 -366.2181396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4602391043312082 0.7258176351153205 }
radiance 27
center 10.052703857421875 0 -334.9804992675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.627773491890851 0.397507994558042 0.9 }
radiance 26
center -39.51081085205078 0 -319.9962158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9065280774342821 0.3097654336886014 0.8493233961081055 }
radiance 31
center 36.87748336791992 0 -325.5628662109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7318523552902989 0.4346583821333605 0.9 }
radiance 18
center -26.746164321899414 0 -422.7638244628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9197621863965284 0.36664183950713436 0.8151805595119894 }
radiance 23
center 30.795394897460938 0 -349.13751220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4636187531494539 0.6061482964894616 }
radiance 20
center -52.54088592529297 0 -332.294677734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8103324821802711 0.3769435553207214 0.8252797407490025 }
radiance 22
center -66.24545288085938 0 -320.9264221191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8070062830107683 0.45087276990141967 0.9638688422728682 }
radiance 20
center 32.163818359375 0 -359.27081298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8333238422005591 0.41464581726349803 0.969729743817006 }
radiance 30
center -50.672550201416016 0 -382.7693786621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4192350697183228 0.41078268209426216 }
radiance 31
center 7.729419708251953 0 -417.0464782714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8824594281251087 0.33118038762394725 0.906930668293988 }
radiance 20
center 2.847878932952881 0 -390.2358703613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9626889204937698 0.45221779165135856 0.8442060051167151 }
radiance 26
center -69.70812225341797 0 -366.0858154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7105986409952073 0.4661873330919416 0.9 }
radiance 18
center -6.021285533905029 0 -365.88720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46467953844385623 0.4430157565317956 0.9 }
radiance 21
center -55.72074890136719 0 -321.9584045410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9090131602921511 0.49843025141759195 0.9573604729874787 }
radiance 30
center 4.603592872619629 0 -403.21435546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8501713364932755 0.4546309698701819 0.9944900874480501 }
radiance 23
center -46.999813079833984 0 -405.8717346191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9001014308774917 0.49261860508034927 0.9659344571682016 }
radiance 29
center -67.58185577392578 0 -364.0230407714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8733563494548081 0.3836390151064193 0.9503501730975747 }
radiance 28
center 26.794992446899414 0 -345.93963623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8319017134141934 0.4647163158730847 0.928935907090475 }
radiance 25
center -28.78786277770996 0 -330.1868591308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4203975877016586 0.5158397577941373 }
radiance 23
center -13.970902442932129 0 -347.7320251464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8105929194310973 0.4383321527859038 0.9233164686140609 }
radiance 25
center 0.23296192288398743 0 -407.8711242675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9748166345630344 0.32667791050297634 0.8714094913186782 }
radiance 16
center 16.545730590820312 0 -417.6318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9371633875436303 0.4371586814304229 0.8146434021212019 }
radiance 21
center -26.822742462158203 0 -323.6520690917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8459870082311836 0.34150801870425085 0.8579364340356403 }
radiance 29
center -51.229068756103516 0 -322.9993896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8203272741757027 0.353551034452241 0.8066941763940592 }
radiance 25
center 24.288105010986328 0 -311.7806701660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8171546116201328 0.37030421430847443 0.9697406433654553 }
radiance 18
center 15.685872077941895 0 -342.9682312011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3118899299589493 0.47723957803757155 }
radiance 28
center -32.90354919433594 0 -404.50054931640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.827775492156665 0.4853950895133534 0.9129268815411602 }
radiance 21
center -48.2812385559082 0 -322.121337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.87531000670783 0.481730303583578 0.813074530209341 }
radiance 25
center 26.75589370727539 0 -383.05438232421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8495405637490223 0.4012445938179975 0.9590302336264587 }
radiance 18
center -30.21378517150879 0 -336.0750427246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9025745308136253 0.4574762647758289 0.9314214573843269 }
radiance 17
center -2.1386635303497314 0 -357.388916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9186985851830753 0.4713847772260722 0.9800515598589252 }
radiance 22
center 5.1017866134643555 0 -390.1575927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9956574345023548 0.30987293943985506 0.875388400482002 }
radiance 21
center 56.14187240600586 0 -328.8155212402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9730042252950182 0.4015576536255462 0.9011303442605794 }
radiance 28
center 56.22370529174805 0 -338.31243896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8024178607925294 0.38174250810617316 0.896944382101021 }
radiance 28
center 54.11860275268555 0 -370.7123107910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8130634831788318 0.4178348889620047 0.8951197375400339 }
radiance 27
center 46.23746871948242 0 -314.8000183105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8531592097792229 0.3138891699300416 0.8770183211422066 }
radiance 24
center 53.12522888183594 0 -404.8713684082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8403037328633316 0.39451377574500496 0.9513479589177847 }
radiance 30
center 59.98076248168945 0 -388.6328430175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.990913153540292 0.31020867107668115 0.985493713687422 }
radiance 18
center 47.419090270996094 0 -354.4046325683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8243406517913817 0.49378579314374876 0.8121411021237803 }
radiance 17
center 7.933315277099609 0 -360.0388488769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8312612839076646 0.4053462975947021 0.8123084232417304 }
radiance 27
center 39.068321228027344 0 -372.8421936035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8404222140939559 0.48424548993893 0.934208060480479 }
radiance 22
center 27.966297149658203 0 -343.802001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9497143054482243 0.47031785559729544 0.9727140018122582 }
radiance 30
center -0.6255871057510376 0 -326.0149230957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6431677772400685 0.4195285370926165 0.9 }
radiance 28
center 65.17328643798828 0 -405.2350769042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9670493242806442 0.3218243508227348 0.9323808046449211 }
radiance 23
center -0.8695030212402344 0 -314.4268798828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8775647295574023 0.42625758987628815 0.8655784651827527 }
radiance 20
center -30.832300186157227 0 -380.4296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9001675775360244 0.3434886174400307 0.9424818512403257 }
radiance 28
center -26.058982849121094 0 -312.2982177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8281891154114762 0.3817504527979442 0.9634397635245513 }
radiance 26
center 11.396265983581543 0 -347.7218017578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8302137029355681 0.3814433230654861 0.8123173460308273 }
radiance 22
center 18.55786895751953 0 -398.82537841796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44183537387779015 0.6653638524986717 }
radiance 30
center 45.81772232055664 0 -376.0555419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8675235117579778 0.33538856441212317 0.9 }
radiance 30
center 13.756999969482422 0 -406.4061279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8228540690840631 0.34091208769184794 0.9744024711130499 }
radiance 19
center 79.81243133544922 0 -373.1736755371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9366930281464287 0.4497664013014439 0.8279783232902879 }
radiance 16
center 11.880863189697266 0 -355.6131286621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.862107325976615 0.3936993261288192 0.9549741121242858 }
radiance 31
center 71.99543762207031 0 -413.6902770996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44377486143905 0.6590127762272053 }
radiance 24
center 46.03086853027344 0 -348.3992919921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8536620801343584 0.44588283251110306 0.8729763724336927 }
radiance 19
center 73.96661376953125 0 -391.17138671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8405575218645548 0.4327065414804385 0.8253798386441533 }
radiance 24
center -21.665973663330078 0 -410.6988525390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8475462345452225 0.41986171007500217 0.9903321555848176 }
radiance 25
center -23.54342269897461 0 -373.9383850097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42869335924791496 0.6544288598119579 }
radiance 31
center 25.887983322143555 0 -331.19573974609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3845927147985295 0.439576572983883 }
radiance 30
center -24.178815841674805 0 -360.44488525390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9081141209462491 0.4083469579020313 0.8985808512774409 }
radiance 24
center 2.4177639484405518 0 -388.6943664550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.960775834479198 0.4764722796954364 0.8991079758913781 }
radiance 23
center 77.44633483886719 0 -357.9978942871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7153570204634195 0.3262570494180397 0.9 }
radiance 24
center 95.76651000976562 0 -327.56646728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9457261556864824 0.3400350383731354 0.8453661743489038 }
radiance 29
center -1.6956455707550049 0 -327.7555847167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9723182598717758 0.49109739695102217 0.8054820816251675 }
radiance 31
center 11.477043151855469 0 -299.1427917480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8538267643967921 0.3463320519511945 0.8050242767553161 }
radiance 20
center 39.17681121826172 0 -361.9806213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8316002502201877 0.3895328129573187 0.8035224295519782 }
radiance 24
center 16.463624954223633 0 -358.99542236328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9770169168550841 0.39668742687768355 0.97104560709242 }
radiance 30
center 4.949374198913574 0 -351.2021179199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.348092416849672 0.45237190063784904 }
radiance 29
center 16.544025421142578 0 -355.26678466796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8822760273735752 0.3227853688416563 0.8724622988259845 }
radiance 22
center 61.11101150512695 0 -314.4640808105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8318699488815755 0.31545475169662 0.8349536836480655 }
radiance 28
center 28.35982894897461 0 -390.29791259765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9906642845781111 0.47648831211795595 0.9246994742111434 }
radiance 16
center 23.7254581451416 0 -405.2903747558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8252243779707361 0.3992202148371752 0.9146067552995296 }
radiance 29
center 14.699905395507812 0 -303.4708557128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9830047470086805 0.3395592332748568 0.986945741729491 }
radiance 27
center 53.83501052856445 0 -408.5946960449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8698457029193555 0.41125267217922823 0.9075880654798878 }
radiance 17
center 68.80171203613281 0 -304.0503845214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49315231570331575 0.6670564976329103 }
radiance 31
center 29.473928451538086 0 -407.1628112792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8407505474564607 0.37497377266119253 0.9358340145531889 }
radiance 18
center 24.33430290222168 0 -331.1093444824219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9716386864011219 0.4040001334166616 0.8226007119300345 }
radiance 16
center 84.72509765625 0 -400.8217468261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8196107233874977 0.45141505296597306 0.8177268755743019 }
radiance 29
center 59.016937255859375 0 -316.8880920410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8013160663255647 0.3263209228369666 0.9933416583592566 }
radiance 16
center 13.202631950378418 0 -303.9705505371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8109827366559943 0.33271516106329546 0.9170139902094268 }
radiance 29
center 77.60437774658203 0 -368.07794189453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8056733902877748 0.46456818729006594 0.9 }
radiance 21
center 119.79832458496094 0 -331.76800537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8492304172562797 0.42072865690533 0.9 }
radiance 26
center 52.544471740722656 0 -387.8917236328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8611171802051228 0.3536994029370561 0.899503790797259 }
radiance 27
center 16.64046287536621 0 -295.1584167480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7757281752442476 0.42575933609858485 0.9 }
radiance 31
center 42.9407844543457 0 -361.1335754394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8016509071882275 0.43337322604024714 0.9 }
radiance 29
center 114.78954315185547 0 -360.05291748046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43457678018811585 0.41705925005380784 0.9 }
radiance 22
center 70.22724914550781 0 -340.0401306152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8600315822359434 0.4888304547016524 0.9011270383236276 }
radiance 24
center 52.07515335083008 0 -338.0363464355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3157102017255605 0.6983298733123016 }
radiance 27
center 115.2604751586914 0 -343.8099365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8219706471921142 0.4844456995575097 0.8817347370518464 }
radiance 22
center 30.698095321655273 0 -334.0072937011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9300343098677316 0.36992731019245184 0.9161328583522407 }
radiance 19
center 15.871219635009766 0 -355.2589111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9159996946517968 0.4369812406246474 0.8065788017977399 }
radiance 28
center 71.87678527832031 0 -357.09527587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35851803051342734 0.7290680182182697 }
radiance 25
center 52.11909484863281 0 -299.67926025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9032938716093479 0.45727336046188005 0.9826496040752352 }
radiance 26
center 105.56370544433594 0 -320.34942626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9058046263760768 0.36153140181984045 0.8649341238388641 }
radiance 21
center 117.44556427001953 0 -317.09600830078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9377726594417958 0.4840597201504916 0.9791823162405445 }
radiance 16
center 111.98562622070312 0 -293.7047119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9563203985978751 0.46397603438798607 0.9136863107616802 }
radiance 21
center 18.539072036743164 0 -399.91729736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8270704803819101 0.3709787269760564 0.8026169604982668 }
radiance 19
center 40.8476676940918 0 -386.2384948730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9651774018118007 0.47922392504551387 0.8394302098103457 }
radiance 21
center 66.3370361328125 0 -305.9998474121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448478009022212 0.31614277208935637 0.8535691849003069 }
radiance 25
center 26.988567352294922 0 -356.6778564453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8952192686919801 0.4379864325494581 0.9516218803406921 }
radiance 30
center 120.42610931396484 0 -285.2441711425781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8897363497122093 0.4505303191720127 0.913544207789442 }
radiance 17
center 95.38865661621094 0 -321.422607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9761653795802852 0.36680355826836614 0.9163723085106564 }
radiance 31
center 112.86377716064453 0 -345.81689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4334696345137409 0.4488689305602373 0.9 }
radiance 17
center 117.83226776123047 0 -340.01519775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40040325205911664 0.6329904508301927 }
radiance 22
center 86.88616943359375 0 -324.9162902832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.683780505097268 0.42042132056215586 0.9 }
radiance 26
center 99.0835189819336 0 -352.1829528808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30392065687958214 0.8403475089001099 }
radiance 16
center 32.2318000793457 0 -375.7904968261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8174330123036687 0.3800023056719223 0.9080234009803809 }
radiance 29
center 102.5413818359375 0 -329.53216552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9707332471095236 0.3537713513413601 0.9040890250422838 }
radiance 26
center 64.60154724121094 0 -377.2813415527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9911309301229247 0.495577569806011 0.9927428261059025 }
radiance 19
center 134.9282684326172 0 -328.96051025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8018443835564403 0.48315267116332217 0.9 }
radiance 24
center 117.14579010009766 0 -335.4673767089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8818274191955155 0.46764949856602245 0.8594371231112546 }
radiance 30
center 129.25381469726562 0 -300.88330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9727141922760093 0.4354932856019633 0.9716175558749125 }
radiance 23
center 65.87364196777344 0 -332.10125732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4799389971715251 0.42773589563016434 }
radiance 25
center 110.38047790527344 0 -320.41986083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9216817792211569 0.3145095395846587 0.9967694158863247 }
radiance 17
center 50.811344146728516 0 -291.36126708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8850473768825424 0.4061307597893857 0.942314317039569 }
radiance 21
center 45.040645599365234 0 -291.5777893066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9907094037984621 0.4982542001187039 0.8273785576801184 }
radiance 16
center 40.332977294921875 0 -290.81451416015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8275996321500019 0.3011832825219569 0.9771385428111508 }
radiance 27
center 88.84992218017578 0 -294.1436767578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8523454778310389 0.42950195733068064 0.9606289752290839 }
radiance 19
center 113.70415496826172 0 -389.64788818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9247631214393377 0.30992905569841406 0.8322825468635546 }
radiance 19
center 49.45028305053711 0 -340.4041748046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8743296841800393 0.3276288215701722 0.8926417962588891 }
radiance 16
center 71.99783325195312 0 -334.9248352050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8160484944780115 0.35425090553510985 0.8683301531860935 }
radiance 21
center 146.18417358398438 0 -316.3858337402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5023571954446674 0.4815049765405461 0.9 }
radiance 17
center 90.06403350830078 0 -325.07745361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8388692355406517 0.40887658786879627 0.8825393925358458 }
radiance 16
center 103.73771667480469 0 -359.03692626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8050158164195553 0.49029385332937614 0.9821156743764402 }
radiance 30
center 51.22405242919922 0 -347.46002197265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8549934658598264 0.4750386256177256 0.8957395163951709 }
radiance 31
center 125.90274810791016 0 -358.1988525390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49143440641344727 0.43134495179556936 0.9 }
radiance 30
center 86.78656768798828 0 -299.98370361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8608475245123488 0.42931673364709677 0.9729860194413757 }
radiance 24
center 134.92620849609375 0 -319.79705810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8676464466621427 0.4096172639753119 0.9438467627503564 }
radiance 16
center 112.55477142333984 0 -363.3346252441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9755526885911556 0.31842802546503934 0.8563925938136405 }
radiance 25
center 133.94155883789062 0 -331.158447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9967838673475927 0.4662312501130531 0.954140187646723 }
radiance 22
center 152.4473876953125 0 -353.54400634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9071521400724833 0.47105594267117146 0.8862835011901796 }
radiance 28
center 68.77272033691406 0 -337.01202392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4809586696865992 0.5390154525824348 }
radiance 18
center 88.99269104003906 0 -274.5485534667969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9623631943299727 0.34621857356823843 0.8874823397550933 }
radiance 22
center 132.1806640625 0 -311.42974853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.820838829359277 0.327148451158248 0.8938616885513908 }
radiance 19
center 75.73712921142578 0 -287.16094970703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4888213756428855 0.3486088001907209 0.9 }
radiance 25
center 132.8668975830078 0 -350.82916259765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37833089415272114 0.8707406436700763 }
radiance 29
center 83.75060272216797 0 -344.0475769042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8499439675394033 0.47384119823313936 0.9947406326912844 }
radiance 21
center 118.89079284667969 0 -371.614990234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8696155408361643 0.46923004457253636 0.8004116179321611 }
radiance 31
center 79.18623352050781 0 -308.50836181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8225189669169988 0.44642707573965734 0.9660663656589666 }
radiance 25
center 98.11699676513672 0 -338.5433654785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.59941736569855 0.35897892148946164 0.9 }
radiance 30
center 91.19556427001953 0 -307.28350830078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3153267896481585 0.6353875393722828 }
radiance 29
center 75.0543441772461 0 -348.6001281738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9227784913406849 0.41653776657357516 0.9941688065132097 }
radiance 20
center 101.2095718383789 0 -321.0562744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32726262799275724 0.6870833392420195 }
radiance 31
center 157.7222442626953 0 -340.9400634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6708316032309216 0.44384155515935975 0.9 }
radiance 20
center 112.11990356445312 0 -305.9308166503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.523129350930969 0.3067091099489838 0.9 }
radiance 17
center 155.93055725097656 0 -312.59442138671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8738912732912141 0.33055114784471873 0.9 }
radiance 16
center 139.25045776367188 0 -370.8223876953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6431428893950546 0.47385388945840456 0.9 }
radiance 20
center 144.80445861816406 0 -343.8428955078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9838779160423506 0.31181323632391295 0.8373014944537156 }
radiance 25
center 137.68096923828125 0 -288.0005798339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4903120941916767 0.8953371401472189 }
radiance 23
center 127.18544006347656 0 -266.82696533203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9513262072970174 0.41152995559796846 0.9444083201071568 }
radiance 30
center 142.676025390625 0 -353.20635986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47303787951934073 0.7176095711472916 }
radiance 20
center 124.00235748291016 0 -271.8001708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4783526138357468 0.8397242687313262 }
radiance 19
center 140.53176879882812 0 -359.9953918457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5299081297175601 0.42349428954819096 0.9 }
radiance 20
center 68.66920471191406 0 -342.18731689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7530640169389509 0.4914886001197254 0.9 }
radiance 26
center 119.26707458496094 0 -277.41717529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.811778288333771 0.3934444256173703 0.8448110619905971 }
radiance 22
center 76.93486022949219 0 -323.1795959472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8523756595039107 0.38449962707116925 0.9634539926114188 }
radiance 31
center 165.4844512939453 0 -307.8258972167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49035086604775774 0.6057551340916403 }
radiance 23
center 100.35946655273438 0 -332.908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.964491994042528 0.39895573537254314 0.935043168084674 }
radiance 16
center 146.2689208984375 0 -279.7838439941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8467777929761111 0.4562981518230239 0.9815371806020639 }
radiance 28
center 68.28189849853516 0 -271.8304138183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8938691725696232 0.41634475145315164 0.8103614101513339 }
radiance 26
center 192.02223205566406 0 -264.88323974609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8093233269302059 0.3712396224946637 0.8869006069124984 }
radiance 28
center 152.94859313964844 0 -268.75140380859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.890286525172664 0.46316793796766453 0.9592516001607607 }
radiance 29
center 184.5673370361328 0 -261.7353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4447755186172314 0.6020548502711873 }
radiance 26
center 89.55989074707031 0 -350.96099853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9339683936783154 0.44787440049205807 0.8110198975231184 }
radiance 25
center 139.84771728515625 0 -327.7880554199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9755773307732364 0.4645947832610591 0.9840216883803747 }
radiance 23
center 103.93060302734375 0 -269.5721740722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7695085316855782 0.4365087708459835 0.9 }
radiance 24
center 179.26014709472656 0 -268.0885314941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8920375453328243 0.4759696028816551 0.8727461345137297 }
radiance 17
center 122.75509643554688 0 -320.08551025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40100358410621384 0.4162946279238636 }
radiance 20
center 190.99708557128906 0 -270.8995056152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9831642454861031 0.345282464755961 0.8227721378135933 }
radiance 27
center 99.27745056152344 0 -319.5342712402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9304700087055509 0.4808457824452199 0.9687688376855438 }
radiance 24
center 180.5777587890625 0 -295.6366882324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9095581768167452 0.32058690459876216 0.9476838275414444 }
radiance 25
center 106.25961303710938 0 -316.0700988769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.92995718992239 0.4278039606928763 0.9149549900642251 }
radiance 25
center 178.26885986328125 0 -336.48382568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8725550101182107 0.3905730611308684 0.991363266021778 }
radiance 27
center 84.97639465332031 0 -274.571533203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8638360503271335 0.4913249229263953 0.898242624813532 }
radiance 30
center 94.86888122558594 0 -315.5139465332031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8733109183614243 0.3324120374765211 0.8457424251986628 }
radiance 19
center 139.9609375 0 -312.90374755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9568292012367646 0.45962224920112416 0.945598610618376 }
radiance 25
center 176.59036254882812 0 -286.08465576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8030407943547386 0.32542656450956237 0.9694569168680269 }
radiance 24
center 90.94844055175781 0 -335.88665771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4003792458610178 0.46186109699892003 0.9 }
radiance 29
center 176.34042358398438 0 -324.8559875488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8567982503825535 0.4832034608979279 0.9387126640808643 }
radiance 26
center 189.9935302734375 0 -259.9942321777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8392541950104291 0.33359078109368384 0.8821838505074937 }
radiance 18
center 172.6666259765625 0 -259.7955627441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9904552554118835 0.4882292638210177 0.9832993734105392 }
radiance 27
center 129.28579711914062 0 -308.7650146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8711811169629733 0.4429234821491531 0.9 }
radiance 20
center 137.43222045898438 0 -261.90887451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8247832443265601 0.35123894425950536 0.9361691929519792 }
radiance 30
center 125.08255767822266 0 -302.336669921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8927883675129302 0.4300816439355807 0.9877826035760924 }
radiance 17
center 171.6181640625 0 -304.64532470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9717319184998692 0.4953014291359019 0.9888785885184135 }
radiance 21
center 157.62098693847656 0 -286.04150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6120103065628854 0.3394212620079546 0.9 }
radiance 30
center 157.8367462158203 0 -291.0787048339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.864052102442006 0.42100484617857215 0.8780155809869261 }
radiance 31
center 131.5056915283203 0 -312.2297668457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8637777532039966 0.3756079074846942 0.8362438233552264 }
radiance 23
center 168.89541625976562 0 -266.90850830078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8051884617080257 0.4179412796336137 0.9556942637948713 }
radiance 24
center 183.75474548339844 0 -265.0880432128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9434669736297798 0.39430982997560093 0.8675521931883058 }
radiance 22
center 180.57308959960938 0 -283.1333923339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.904359858991279 0.33292254648014274 0.9983225875133825 }
radiance 25
center 113.11520385742188 0 -346.463623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8831344807186963 0.4304288273786303 0.906903297250326 }
radiance 20
center 171.43380737304688 0 -282.2922058105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8100518706969027 0.36173323603216817 0.9441179406327899 }
radiance 17
center 112.1792221069336 0 -324.958251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7996291819508463 0.43662153989268626 0.9 }
radiance 22
center 203.46786499023438 0 -242.87396240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8553274572815469 0.404751155624943 0.9012539086162211 }
radiance 24
center 197.99119567871094 0 -279.839111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8147638829711664 0.3265900562308589 0.9180671823133392 }
radiance 30
center 188.39048767089844 0 -289.4245910644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8636429574120796 0.47130923389372825 0.8735959486537868 }
radiance 21
center 156.24461364746094 0 -285.3714599609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7661394846613041 0.4780025695047655 0.9 }
radiance 16
center 114.9603271484375 0 -334.4005126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7496467471499931 0.3201014286861193 0.9 }
radiance 22
center 173.40599060058594 0 -332.7093811035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8543881918541969 0.41058095489135504 0.8917057920462766 }
radiance 26
center 158.89366149902344 0 -259.28485107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9857994721115023 0.40246107489381905 0.952880380272858 }
radiance 30
center 190.06410217285156 0 -278.26556396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9110704357384029 0.3237557707796114 0.8201938998099341 }
radiance 26
center 189.06060791015625 0 -273.9458312988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.324177212747995 0.5030140478415184 }
radiance 26
center 149.17662048339844 0 -325.3357849121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9129888355510312 0.47246589324907073 0.8907793485332776 }
radiance 30
center 214.03477478027344 0 -310.7731018066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8568979690708189 0.4724208058136954 0.84719464356228 }
radiance 16
center 127.91478729248047 0 -271.5472717285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9833055847373277 0.31079434409906664 0.8806936196617068 }
radiance 29
center 147.09129333496094 0 -331.1042175292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.81069747122418 0.3119903960341968 0.9258827358467853 }
radiance 16
center 142.92877197265625 0 -229.95265197753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4730128050150803 0.7972571401273829 }
radiance 25
center 167.45884704589844 0 -331.3325500488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.931962281697233 0.3509988101026849 0.8099292881541814 }
radiance 24
center 210.0335235595703 0 -273.48358154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.965925590674612 0.3180940874688352 0.9251981373290409 }
radiance 27
center 145.73672485351562 0 -267.5514831542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9289855395661031 0.3512344158057496 0.8697417436719587 }
radiance 21
center 174.5615692138672 0 -320.77398681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7467622720003392 0.44923476500429405 0.9 }
radiance 31
center 212.33116149902344 0 -231.61866760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5453435114063163 0.34267807563972413 0.9 }
radiance 17
center 125.10411071777344 0 -313.1036071777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8947729499871537 0.34436160353909245 0.8635096768844523 }
radiance 29
center 133.19569396972656 0 -228.9532012939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9159746904123034 0.331210908639094 0.9598665911198062 }
radiance 22
center 163.3527069091797 0 -245.60887145996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8323717816715169 0.353933777645117 0.910697378117274 }
radiance 24
center 219.34878540039062 0 -247.61013793945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7759151378733562 0.3196170300431809 0.9 }
radiance 19
center 144.60528564453125 0 -235.4116973876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3106072645817111 0.7333615980847343 }
radiance 25
center 153.90196228027344 0 -280.4555358886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9740586583353685 0.3583045384298203 0.9484888213269387 }
radiance 20
center 117.75900268554688 0 -240.55941772460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9393896860504204 0.4017104009647683 0.9819699984484682 }
radiance 27
center 202.7836151123047 0 -256.1562805175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8539990890390826 0.3352227668677329 0.9923081587423223 }
radiance 26
center 225.65707397460938 0 -278.3260192871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8747939685202175 0.36804083545854727 0.8720840788943529 }
radiance 26
center 137.68894958496094 0 -259.4529724121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8955738429886341 0.3633496884471882 0.9698581692120379 }
radiance 17
center 206.18106079101562 0 -242.61473083496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42189975408589775 0.5893579858274963 }
radiance 23
center 218.7369384765625 0 -253.65054321289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.581508323602871 0.4888798168115475 0.9 }
radiance 29
center 195.39230346679688 0 -303.6368713378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9075440346170257 0.3905051252239184 0.9257592277616825 }
radiance 18
center 214.66969299316406 0 -232.08682250976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.977999739355508 0.47614487883653717 0.8314554608175931 }
radiance 17
center 153.43759155273438 0 -256.22222900390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8709444031300824 0.3966756965669911 0.8954556382426677 }
radiance 24
center 181.79837036132812 0 -232.62466430664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43367505949013185 0.49405785235381383 0.9 }
radiance 18
center 173.3004913330078 0 -284.4497375488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8947400102198931 0.4055149236665382 0.8044806026160283 }
radiance 19
center 211.26211547851562 0 -317.89447021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8705941519987068 0.3077345921477207 0.8377889039186537 }
radiance 23
center 153.55958557128906 0 -215.73875427246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4241373424258268 0.5297140398644303 }
radiance 17
center 181.62156677246094 0 -315.8120422363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44821726971389664 0.31048028039767867 0.9 }
radiance 22
center 209.75411987304688 0 -262.6583251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9217513376122343 0.337943149143087 0.9767851884981706 }
radiance 31
center 196.17311096191406 0 -279.47735595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8823499461276706 0.4586566133023272 0.9264803949508538 }
radiance 23
center 160.4372100830078 0 -288.2150573730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9358406914896221 0.34507256447915047 0.8501051623829211 }
radiance 30
center 228.197265625 0 -310.0653381347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99072000357488 0.4036135389101236 0.9463465378304787 }
radiance 25
center 194.5289764404297 0 -231.08343505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8217159400909329 0.4351353959098724 0.8843165746267785 }
radiance 18
center 176.7626953125 0 -220.2354736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9519842684137994 0.3542940009254318 0.8994571687411328 }
radiance 28
center 181.01229858398438 0 -289.3614196777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42682366119648896 0.37557115093419013 0.9 }
radiance 24
center 206.32711791992188 0 -292.28570556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9983414864070619 0.4461615959953278 0.8767521721622293 }
radiance 20
center 195.76124572753906 0 -238.92202758789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4209499843144564 0.3943605586333139 0.9 }
radiance 24
center 164.27703857421875 0 -264.6641845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.829000073676537 0.3815903084684188 0.9496916414878687 }
radiance 27
center 224.0664520263672 0 -285.7298889160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8182556108331134 0.3588901607555413 0.8110361728407838 }
radiance 27
center 211.7328338623047 0 -247.73861694335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9597337844227479 0.40429270889332297 0.9691039770441185 }
radiance 28
center 212.91082763671875 0 -296.92437744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9062094894848778 0.36258627161837165 0.821093330370003 }
radiance 19
center 158.16339111328125 0 -231.9147491455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9373736335163663 0.43494206011547865 0.9575721669888717 }
radiance 29
center 210.72885131835938 0 -289.72271728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44872072608789726 0.6470333444745039 }
radiance 20
center 235.5369415283203 0 -246.7782440185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9213004713279018 0.3908352153944007 0.9951236277791828 }
radiance 29
center 155.88629150390625 0 -282.4271240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4492575052062271 0.41229115941736766 0.9 }
radiance 17
center 146.76251220703125 0 -239.43020629882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.991465954884369 0.4767401869488181 0.810245373225741 }
radiance 21
center 224.83181762695312 0 -296.8740539550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4697388654891298 0.3271714646934409 0.9 }
radiance 19
center 230.3330841064453 0 -272.3791198730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.88766455733247 0.4752560821061018 0.8588562221660919 }
radiance 18
center 185.26931762695312 0 -205.5233154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9651543835130181 0.40544059451565445 0.9517016851462266 }
radiance 17
center 237.03054809570312 0 -267.58062744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9769066845315822 0.3354508234551302 0.8610232351809856 }
radiance 26
center 150.7300262451172 0 -203.790771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8221260335637406 0.4065075996899454 0.9 }
radiance 18
center 232.2302703857422 0 -275.8740539550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8947834133517998 0.3877531427813465 0.9026950942892923 }
radiance 16
center 183.4610595703125 0 -260.6463317871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8869365001827378 0.4027953052939112 0.9420053095918567 }
radiance 27
center 226.08566284179688 0 -300.3468322753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9298871718521169 0.32116315624087194 0.9320487509457774 }
radiance 26
center 161.26058959960938 0 -215.60403442382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9063284686868653 0.390556892626717 0.9034415105858731 }
radiance 29
center 244.31910705566406 0 -224.6816864013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5661297149742017 0.4655761544587755 0.9 }
radiance 26
center 160.05604553222656 0 -254.0896453857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9062090374711071 0.4826685589961691 0.8625393229915385 }
radiance 31
center 189.82513427734375 0 -280.7955627441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.757793234232537 0.3682892907784185 0.9 }
radiance 16
center 206.89608764648438 0 -246.9601287841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4241253501590614 0.42626878234398324 0.9 }
radiance 29
center 227.71238708496094 0 -227.68325805664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8160613996925946 0.4847030120133743 0.9153774791402429 }
radiance 27
center 261.1365966796875 0 -266.2346496582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8463393579498424 0.4927392278800815 0.9 }
radiance 23
center 261.4641418457031 0 -280.652587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4899764413243427 0.6328176769023046 }
radiance 25
center 226.37054443359375 0 -242.31314086914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8875589264852347 0.39638737492943354 0.9593452036403363 }
radiance 17
center 167.069580078125 0 -258.6567077636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36060966332233924 0.6348468319831315 }
radiance 17
center 196.62582397460938 0 -242.72337341308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9947586290722953 0.3244009721072649 0.9348070746664867 }
radiance 28
center 213.89881896972656 0 -203.10995483398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9556658291863557 0.3753649873506131 0.999545296502755 }
radiance 22
center 201.50013732910156 0 -267.7414855957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3022783171158089 0.7704960561687271 }
radiance 27
center 166.22476196289062 0 -241.85011291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8122573766618423 0.3298304858819923 0.865982180779537 }
radiance 16
center 158.05320739746094 0 -230.64178466796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8049128186043571 0.41212637597031193 0.8434364483016671 }
radiance 18
center 184.21231079101562 0 -201.23907470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32416994973870833 0.862167943094262 }
radiance 21
center 174.22084045410156 0 -195.9959716796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8854428553862703 0.3029971176892639 0.8971033129448137 }
radiance 23
center 251.32904052734375 0 -242.3847198486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38853690413063835 0.5649457243465099 }
radiance 16
center 159.5070037841797 0 -267.8359680175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8313316992358578 0.4203293177090179 0.9322230860992695 }
radiance 18
center 173.7407684326172 0 -227.0646209716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9383436724637847 0.30571285183353986 0.9741840255141628 }
radiance 18
center 180.76795959472656 0 -217.25357055664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4319611031089116 0.6158044924851254 }
radiance 30
center 215.48934936523438 0 -230.60377502441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9711683916827483 0.4251074028169143 0.9056878078137842 }
radiance 25
center 210.63119506835938 0 -239.59678649902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6651072810136338 0.4122459687145365 0.9 }
radiance 16
center 273.37786865234375 0 -216.5519561767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9275022191182694 0.4704967437764509 0.856600860471497 }
radiance 25
center 202.0493927001953 0 -214.82260131835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9695261484326584 0.4250837746684789 0.8584754340734719 }
radiance 23
center 209.40374755859375 0 -213.29563903808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9637418254703983 0.3433483768848096 0.8860954290549289 }
radiance 30
center 182.0500030517578 0 -260.4122619628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9006048443447142 0.3693229623379395 0.9959137709150758 }
radiance 27
center 183.955078125 0 -211.53414916992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9370635086333727 0.4879518117533973 0.8534000862578739 }
radiance 30
center 172.9775848388672 0 -239.7755126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8656657112736881 0.31666248556244164 0.9485655547264238 }
radiance 25
center 233.96337890625 0 -192.86233520507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9687437145936879 0.4516438387563664 0.9074195468801318 }
radiance 17
center 235.59039306640625 0 -191.05104064941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.854556483601102 0.33968918276783433 0.9465812871508854 }
radiance 28
center 257.48992919921875 0 -169.40650939941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46742753385277336 0.7926425344703639 }
radiance 31
center 252.60142517089844 0 -194.9610137939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8386064629882368 0.47351760929855014 0.9775097916633242 }
radiance 21
center 201.74740600585938 0 -184.94781494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9683192769201557 0.4998467274667998 0.9646488990668698 }
radiance 19
center 237.4085235595703 0 -167.72589111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8273049746296537 0.3137144366163762 0.8038049643995757 }
radiance 23
center 192.41702270507812 0 -243.6591339111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9671975551174432 0.44130736690234007 0.8627029314669624 }
radiance 20
center 253.88465881347656 0 -243.34510803222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.438294281676886 0.3593351134110393 0.9 }
radiance 21
center 227.33990478515625 0 -225.2803497314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9445341767733682 0.33687857976528696 0.8388011390734 }
radiance 27
center 229.55018615722656 0 -202.9962921142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8505868827442566 0.4049309459767436 0.9816832385076821 }
radiance 27
center 211.7793731689453 0 -233.50242614746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8053712825988271 0.4822996502291611 0.9143425903239659 }
radiance 27
center 201.8509063720703 0 -171.07435607910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5886752283330544 0.3853703465244158 0.9 }
radiance 21
center 267.87640380859375 0 -153.1783447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8829002800163628 0.32686463216177586 0.8712835695289534 }
radiance 31
center 238.81997680664062 0 -200.87432861328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8473799939478901 0.39173720851689453 0.8226703911472968 }
radiance 24
center 206.7554473876953 0 -163.40538024902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.883598378852122 0.35753145516267826 0.9 }
radiance 26
center 255.86619567871094 0 -154.67962646484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9829826608228117 0.30147655993902156 0.8775420836843046 }
radiance 24
center 260.9694519042969 0 -194.95480346679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8156295929561037 0.412476402227444 0.9071634284443285 }
radiance 17
center 237.58444213867188 0 -200.45396423339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6885132356167298 0.41897928607804424 0.9 }
radiance 18
center 207.15206909179688 0 -181.12994384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8262765977915656 0.4012809103559618 0.904087298831407 }
radiance 21
center 261.3164367675781 0 -227.41355895996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.878330000222573 0.36629886535297873 0.873337801211637 }
radiance 27
center 245.039794921875 0 -150.77877807617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9828110425878631 0.32195651946740095 0.9682707686764938 }
radiance 29
center 261.4595947265625 0 -216.33152770996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8640717502157754 0.4951762204163105 0.9721286950345183 }
radiance 22
center 274.1822814941406 0 -248.83294677734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8437541754969007 0.33448808590280293 0.8803106406546268 }
radiance 23
center 276.2802429199219 0 -194.84524536132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6033380311502884 0.3631220390876377 0.9 }
radiance 24
center 269.25457763671875 0 -174.9540252685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9550365206386943 0.3123847110372899 0.8970432923031663 }
radiance 16
center 278.6423645019531 0 -202.551025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9133593624287902 0.47269071092720155 0.850843246123615 }
radiance 31
center 202.12693786621094 0 -222.07615661621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8327925435333824 0.39744433096571263 0.9570747752265112 }
radiance 31
center 214.54965209960938 0 -250.6571502685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3840159773623115 0.6792969261370283 }
radiance 25
center 214.33108520507812 0 -227.79751586914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8850385392730914 0.4232112372614698 0.9977096127629986 }
radiance 30
center 275.6538391113281 0 -168.52452087402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33673426378538895 0.6202333929950238 }
radiance 20
center 248.06344604492188 0 -238.6107635498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8012905617910149 0.476880216083967 0.9475523681802098 }
radiance 31
center 184.2046661376953 0 -236.58761596679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9773872970216113 0.48371628319304527 0.8166318816639064 }
radiance 18
center 211.30801391601562 0 -188.31394958496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33758088430335514 0.5214098291267384 }
radiance 21
center 195.30406188964844 0 -152.97686767578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9901541173751877 0.32209778614810525 0.8066198316137032 }
radiance 16
center 190.86993408203125 0 -198.92178344726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9338584557416365 0.40610814304124254 0.9356410578107471 }
radiance 21
center 291.2713928222656 0 -161.36141967773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8013517668788065 0.41098907675338203 0.8928830829027663 }
radiance 31
center 267.50604248046875 0 -167.44357299804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8614221389279891 0.48059518519164 0.870310455769567 }
radiance 21
center 247.7774658203125 0 -146.80616760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9518784394796265 0.3075404351820193 0.9027968343768141 }
radiance 21
center 193.39495849609375 0 -149.12908935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9074400500998183 0.44594937018436676 0.9941877198950019 }
radiance 21
center 259.0516357421875 0 -228.8187255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9933110002499108 0.4116646457741622 0.9752530506005609 }
radiance 22
center 234.35089111328125 0 -233.03271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.544654042393289 0.37096359979604693 0.9 }
radiance 18
center 237.88121032714844 0 -175.09210205078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8989731872712844 0.31826577470930173 0.905295346557417 }
radiance 16
center 222.148193359375 0 -225.7399139404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8582426452782621 0.37462249477116727 0.8789020015893377 }
radiance 25
center 214.47042846679688 0 -230.85040283203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8730537382696784 0.38621654140403455 0.8792236676790042 }
radiance 31
center 256.4351806640625 0 -173.33677673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9071768286598849 0.34579084966438856 0.8070259474292237 }
radiance 29
center 278.5658874511719 0 -188.09024047851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9200034049914875 0.4400853380976896 0.8584492491167782 }
radiance 31
center 197.99916076660156 0 -173.5096893310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8503517179376889 0.3850991184507576 0.9554590559209762 }
radiance 17
center 193.735107421875 0 -135.70657348632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9823579962046125 0.4009293521363849 0.9602504207446294 }
radiance 24
center 269.6989440917969 0 -145.24215698242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8639518366321748 0.4416401360690611 0.9646767177210791 }
radiance 22
center 284.7916259765625 0 -184.1420440673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8535145748267152 0.4021388671399385 0.8038192806561786 }
radiance 31
center 220.5695343017578 0 -165.60494995117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8968234383977374 0.49986594663692857 0.9660413670903787 }
radiance 28
center 273.0462646484375 0 -158.83779907226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8503784774233181 0.4100742477523641 0.8203518166221349 }
radiance 19
center 269.9100036621094 0 -127.13780212402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37810442881436973 0.5082275672955817 }
radiance 30
center 263.9325866699219 0 -118.22660064697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8956654960800546 0.4503329704874708 0.8898613292400687 }
radiance 30
center 252.2239532470703 0 -183.7046661376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.836471303679722 0.36967050860963846 0.9804195456948416 }
radiance 23
center 219.41648864746094 0 -191.96192932128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9928004926713359 0.43282870747365204 0.9485527508081171 }
radiance 19
center 218.96185302734375 0 -120.8534927368164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9527957377523201 0.42913212618623275 0.8010157252140293 }
radiance 22
center 235.91055297851562 0 -169.3313446044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9003977177482121 0.3843646690668081 0.8199851977944594 }
radiance 27
center 244.3173065185547 0 -196.88877868652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.837741953735176 0.49864565188646826 0.8040040677861868 }
radiance 30
center 266.69122314453125 0 -115.39642333984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9636717879427597 0.3184825114838571 0.8739052590539542 }
radiance 29
center 222.6245880126953 0 -124.0698013305664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8998714133343 0.32614183807892044 0.9582821111488404 }
radiance 27
center 218.60873413085938 0 -131.950439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46407379207637245 0.41176680613107125 0.9 }
radiance 28
center 224.92237854003906 0 -212.5271759033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4653793906060262 0.5011164122946234 }
radiance 20
center 263.02191162109375 0 -168.3659210205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9848887709588272 0.3537957080943 0.9837795840243504 }
radiance 28
center 244.3572235107422 0 -193.11488342285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9188563513914292 0.41185916512856946 0.8613823092600866 }
radiance 29
center 212.78988647460938 0 -185.57037353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.816467209255097 0.3395757591478385 0.977410096056673 }
radiance 16
center 268.90838623046875 0 -178.83547973632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9570810397520021 0.48329880826632277 0.9833350664977119 }
radiance 24
center 233.6804656982422 0 -175.41664123535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8145335734547079 0.42956841324935846 0.8842760255793947 }
radiance 22
center 278.4978332519531 0 -117.372802734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9444871247099309 0.43190232918441107 0.8322582775485472 }
radiance 26
center 257.06549072265625 0 -139.31556701660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8396837365799157 0.4504409099805987 0.8453294904913966 }
radiance 18
center 257.3585510253906 0 -114.55990600585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.854230374234149 0.3850268056063125 0.9 }
radiance 31
center 289.2166442871094 0 -207.5057830810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8780438171721382 0.34130250792698635 0.8230097461189061 }
radiance 27
center 211.52166748046875 0 -107.42733001708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.969596649142153 0.46548646912102987 0.9021437761752432 }
radiance 25
center 282.5431213378906 0 -132.20065307617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5360384211144629 0.3565390980186985 0.9 }
radiance 24
center 211.37405395507812 0 -182.03494262695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9291486476550328 0.32134999009669546 0.9189989834915031 }
radiance 29
center 300.46478271484375 0 -145.78187561035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8285078066233222 0.3164616911376748 0.9688793637100253 }
radiance 23
center 288.6118469238281 0 -166.00965881347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9834769041133643 0.38089845154803353 0.934356038483598 }
radiance 21
center 274.6476135253906 0 -128.66156005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.606943571832786 0.31817341804464594 0.9 }
radiance 17
center 209.4623260498047 0 -162.41990661621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45789642355626026 0.7426658359101663 }
radiance 16
center 238.1501922607422 0 -194.17835998535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9599782369478457 0.3906346102167173 0.9022014206005737 }
radiance 24
center 289.18011474609375 0 -177.21592712402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8225071275627168 0.32585099105010956 0.9592058847328797 }
radiance 18
center 258.45831298828125 0 -155.565673828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9046601979260396 0.4064048896405482 0.8851804660599201 }
radiance 24
center 214.85662841796875 0 -182.87576293945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8573991952532672 0.30806627987248875 0.9275549735502588 }
radiance 20
center 259.3948669433594 0 -184.8256378173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8351430181443513 0.3849066681023778 0.8358522642536047 }
radiance 19
center 272.56884765625 0 -117.566162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43512282468195895 0.8742329296786794 }
radiance 19
center 227.3681640625 0 -168.9752960205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8213267321293507 0.4823966186768618 0.8406418716771102 }
radiance 31
center 294.2921142578125 0 -109.18645477294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8825333433897139 0.34543694973201894 0.9 }
radiance 23
center 290.364501953125 0 -186.31695556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.847363500709851 0.31162743786687086 0.8147394477730618 }
radiance 16
center 274.3160705566406 0 -159.60366821289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9345546764740018 0.4095693578023465 0.8055584706928872 }
radiance 30
center 225.3651885986328 0 -154.77554321289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8933401188807361 0.47926901709621694 0.9817926286093848 }
radiance 22
center 227.10617065429688 0 -126.06535339355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6900521392676467 0.43227281812692864 0.9 }
radiance 20
center 253.24786376953125 0 -127.88858795166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8148992403534551 0.4158492510144898 0.9631973103114486 }
radiance 18
center 269.22186279296875 0 -166.96304321289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206722806333418 0.31832546211846735 0.9845868304105428 }
radiance 16
center 254.7708740234375 0 -174.94424438476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.878036236153999 0.4578255826276573 0.821518870159436 }
radiance 23
center 229.8382568359375 0 -78.38190460205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5385225669191145 0.469244818497524 0.9 }
radiance 25
center 298.5719909667969 0 -166.95443725585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3428540975716244 0.8156182677768429 }
radiance 19
center 228.7096405029297 0 -116.5648422241211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6375370518176631 0.3512205953300112 0.9 }
radiance 22
center 244.65631103515625 0 -146.28736877441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42008036658512427 0.6399417010950761 }
radiance 28
center 244.5347442626953 0 -146.2919158935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9173657349433684 0.4689026776762869 0.8240533563177395 }
radiance 26
center 264.0254211425781 0 -157.9226837158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3903448165690797 0.5682763280478995 }
radiance 25
center 216.7183380126953 0 -80.03373718261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.894853516699327 0.34819950883214246 0.8918046873504677 }
radiance 19
center 237.746826171875 0 -84.37188720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9297586246089432 0.40820200004851087 0.8662437781764594 }
radiance 28
center 221.6021728515625 0 -161.07579040527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41220687769563724 0.6615744631227967 }
radiance 19
center 244.1239471435547 0 -110.06815338134766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8633750281697691 0.35053780243617794 0.8401544869961879 }
radiance 30
center 310.6380920410156 0 -137.90646362304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9289578282136093 0.4519783128717981 0.8577117999920583 }
radiance 24
center 275.27020263671875 0 -99.35013580322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9315680764052862 0.3564203694870619 0.9223684067709842 }
radiance 25
center 284.8611145019531 0 -135.6360626220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8679696534528856 0.4979185169268471 0.9553539005141444 }
radiance 20
center 296.2748718261719 0 -106.65150451660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5110626241419726 0.37215258888178715 0.9 }
radiance 30
center 267.328125 0 -141.67581176757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9719241515690796 0.3786779903591698 0.9525858354048 }
radiance 17
center 242.45950317382812 0 -97.50885772705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8077382763866745 0.3504451400949039 0.9782434307615452 }
radiance 18
center 269.3294372558594 0 -100.817626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9886098394454976 0.4642319444375139 0.8503819798570266 }
radiance 24
center 273.7723388671875 0 -77.72510528564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8148854421767169 0.4423882462165021 0.9548089094359142 }
radiance 24
center 290.69769287109375 0 -111.20471954345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3796310131751721 0.8636732598950158 }
radiance 16
center 288.706298828125 0 -88.06181335449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8026573147787301 0.40499180235771987 0.8921080605217458 }
radiance 21
center 265.0052795410156 0 -131.6607208251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9762835176338733 0.42111083216205397 0.8254887918690996 }
radiance 27
center 299.5509338378906 0 -132.87001037597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3539512901022454 0.6231610975222102 }
radiance 17
center 292.95458984375 0 -130.1971893310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9406175502654828 0.4702352173105234 0.8415739045015386 }
radiance 26
center 260.6583557128906 0 -110.45267486572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.900897679489331 0.41975649243826063 0.9831597494253608 }
radiance 17
center 308.81768798828125 0 -61.70917892456055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9410342275661769 0.3456850873046003 0.8885311142105868 }
radiance 19
center 295.424560546875 0 -149.92269897460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8671917833424189 0.35053121611335253 0.9097156498264922 }
radiance 30
center 252.26614379882812 0 -85.3050537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8710530800679999 0.4078275578662115 0.9082430986478285 }
radiance 19
center 226.10342407226562 0 -114.6565170288086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8719927401244605 0.4663170134407632 0.9690365400564642 }
radiance 26
center 299.46282958984375 0 -101.04035949707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4414151573588375 0.6886455878346643 }
radiance 30
center 219.6867218017578 0 -128.0920867919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4869647658888431 0.4377037355669223 0.9 }
radiance 21
center 281.9530334472656 0 -123.5958480834961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5305343953776945 0.46430363884729675 0.9 }
radiance 17
center 276.97784423828125 0 -76.95571899414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9014246725854296 0.4049395664411368 0.9077186458972204 }
radiance 27
center 236.4623260498047 0 -102.88373565673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9723025251342005 0.4693916034251622 0.9481290158515132 }
radiance 25
center 230.85568237304688 0 -102.6998519897461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.989839460086956 0.30287886809386544 0.843416401346806 }
radiance 28
center 253.9675750732422 0 -61.28864669799805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4493073091944191 0.423839312001428 0.9 }
radiance 20
center 238.7785186767578 0 -129.63951110839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8197630727473968 0.48833582037481116 0.8734168168247654 }
radiance 22
center 268.4389343261719 0 -74.49947357177734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7854553381204233 0.33784316461063485 0.9 }
radiance 28
center 311.4251708984375 0 -84.3248519897461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8025262283935105 0.4487543148835542 0.8165104783084758 }
radiance 26
center 295.3320617675781 0 -75.50619506835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8785054072289327 0.3894084246263735 0.9210719371106578 }
radiance 23
center 297.35467529296875 0 -75.8707275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8883375357101433 0.34823627428280673 0.9730672191233943 }
radiance 29
center 246.72216796875 0 -129.54690551757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.858372580175311 0.35407892523071327 0.8308091381674031 }
radiance 16
center 243.92286682128906 0 -60.164093017578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8550660380507307 0.4595053383668057 0.804066717788062 }
radiance 27
center 313.89837646484375 0 -56.909820556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9628017993615697 0.49920121627567215 0.9788473202150945 }
radiance 22
center 302.677734375 0 -100.49281311035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30636109319329025 0.7650992619466648 }
radiance 23
center 279.32305908203125 0 -96.0040512084961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37403600550655186 0.737196301448789 }
radiance 22
center 226.9072723388672 0 -136.3843231201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44016801973225916 0.8885319626427419 }
radiance 28
center 248.58541870117188 0 -58.011295318603516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9606253943488345 0.4971774707864316 0.9182939907193962 }
radiance 23
center 282.73541259765625 0 -80.2197265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39983410924439355 0.6726417798172872 }
radiance 30
center 228.1038055419922 0 -87.71186065673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4337428713551632 0.42910794409902103 0.9 }
radiance 28
center 278.2431335449219 0 -116.29564666748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9935870353994036 0.3769585246572874 0.8758362055944755 }
radiance 31
center 258.54248046875 0 -114.44647216796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8762306245799776 0.46068274901225204 0.84910282269644 }
radiance 21
center 253.73965454101562 0 -41.56312942504883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9390388319240678 0.3022998742962465 0.8687153806326925 }
radiance 27
center 315.6333923339844 0 -42.621803283691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131351652502871 0.31901990384785983 0.8486042342544309 }
radiance 31
center 301.8504943847656 0 -78.4339828491211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8435406917595641 0.32870452541470124 0.9148045207063352 }
radiance 20
center 251.66424560546875 0 -121.189697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9046532050721123 0.33241162295368093 0.97586310521029 }
radiance 19
center 251.32119750976562 0 -63.04062271118164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8498391183812903 0.4186103939564545 0.993654909583586 }
radiance 25
center 281.4156494140625 0 -95.78836822509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9402327627321664 0.49725809317763575 0.9622712010300274 }
radiance 24
center 259.5287170410156 0 -72.322021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.921877312464333 0.39933489991976034 0.8328736716298242 }
radiance 25
center 296.36456298828125 0 -25.17507553100586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.972958924643011 0.4978357207969102 0.9992073808830962 }
radiance 31
center 308.3596496582031 0 -40.97571563720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9490684548409316 0.4008387965731934 0.8100221801276711 }
radiance 26
center 310.65826416015625 0 -75.96714782714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8830801582736133 0.3995859276416657 0.8581232020004605 }
radiance 29
center 273.6656494140625 0 -112.79529571533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412220629793402 0.36660657350635967 0.9424085520773021 }
radiance 17
center 241.0153045654297 0 -120.15022277832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9522758045431916 0.4262055787106527 0.9619919022680268 }
radiance 25
center 293.22857666015625 0 -24.9195613861084
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8938431370545948 0.39818405139321306 0.9664903927959582 }
radiance 30
center 227.61019897460938 0 -46.738121032714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9614776775920518 0.46080231893246815 0.9873527508661367 }
radiance 18
center 287.57366943359375 0 -72.91150665283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3606117126814759 0.716284371213778 }
radiance 26
center 238.802734375 0 -21.71229362487793
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.888618869062426 0.4558249096148379 0.9485070122046867 }
radiance 20
center 279.5264587402344 0 -96.72296905517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8020627022341908 0.4035633829758104 0.8926803104365616 }
radiance 18
center 298.9449157714844 0 -115.07854461669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4385562404014418 0.8622950048439026 }
radiance 27
center 231.16287231445312 0 -103.32231903076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9850657902571158 0.327814490690617 0.8280389295928829 }
radiance 31
center 310.02496337890625 0 -31.2196102142334
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9594588922901675 0.3474228841193507 0.9240043950589418 }
radiance 23
center 265.1512145996094 0 -57.428829193115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9211681762576065 0.3835736707562807 0.8205477060826485 }
radiance 28
center 301.50091552734375 0 -71.71588134765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8641964679977794 0.42747403203496037 0.9988459539770714 }
radiance 25
center 314.665283203125 0 -110.15864562988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4298482083297789 0.3910297316656063 0.9 }
radiance 29
center 258.7995910644531 0 -51.60982894897461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9025258500756206 0.332533019068273 0.9467461837035354 }
radiance 18
center 317.3566589355469 0 -108.77384948730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5814824157552406 0.43445260803046126 0.9 }
radiance 31
center 289.687255859375 0 -91.66702270507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8310126276940241 0.39466827957160333 0.8263199639409253 }
radiance 30
center 224.41795349121094 0 -101.68391418457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9877482582238081 0.361940111272659 0.8862232697017078 }
radiance 23
center 243.22177124023438 0 -15.805055618286133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9748143888644246 0.33908478539946435 0.9055970261379008 }
radiance 30
center 230.54815673828125 0 -95.95123291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8325994226224426 0.4280454792514787 0.9108016537128415 }
radiance 19
center 280.06005859375 0 -68.16839599609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6243261849750771 0.40638675761852405 0.9 }
radiance 18
center 246.29164123535156 0 -94.23320770263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30160602073786097 0.4813347041135446 }
radiance 18
center 318.0976867675781 0 -46.000099182128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8092133694801169 0.35358739839354164 0.9287776031497824 }
radiance 20
center 282.4465637207031 0 -82.49366760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8673241621469996 0.37595913716913254 0.8655178176084269 }
radiance 23
center 285.239990234375 0 -18.720062255859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9648930839019985 0.318884155175678 0.9311736312402887 }
radiance 24
center 299.2084045410156 0 -18.00929069519043
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8552940605531978 0.31783786479257414 0.97830343137823 }
radiance 30
center 280.15753173828125 0 -75.97550964355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9047236123244831 0.4651110819427603 0.8652722129470197 }
radiance 27
center 225.34954833984375 0 -5.8312788009643555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9738926198771439 0.34799429487569206 0.8554021496416495 }
radiance 17
center 280.3609619140625 0 -10.128933906555176
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9019362745730333 0.3501626945232531 0.9834366284989796 }
radiance 20
center 263.98699951171875 0 -62.35568618774414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8536932383287126 0.47411742335378615 0.9 }
radiance 29
center 313.7942199707031 0 -59.94343185424805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8210113888169192 0.4563912075405483 0.9 }
radiance 20
center 265.5710144042969 0 -16.693910598754883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.744508349303306 0.44156905253498957 0.9 }
radiance 18
center 254.8944854736328 0 -30.269649505615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9286789367880391 0.4632249529162293 0.8497377856441186 }
radiance 17
center 246.92994689941406 0 -90.67410278320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8265825106620548 0.3796362683267551 0.9835874718319843 }
radiance 25
center 313.1781005859375 0 -93.39053344726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4287628847152975 0.5517558230587074 }
radiance 18
center 313.8573303222656 0 -84.0655517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8838410727743682 0.36150901466857194 0.8501031666783493 }
radiance 29
center 278.6707458496094 0 -3.4012770652770996
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9021090023883137 0.3703289806227774 0.8513033533080538 }
radiance 21
center 258.50299072265625 0 -66.64917755126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9665449705897825 0.3820362771943643 0.9867173017540334 }
radiance 17
center 247.16201782226562 0 2.7288239002227783
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.800340334350002 0.43009591391410495 0.8729140095492437 }
radiance 21
center 273.6121520996094 0 -65.07665252685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.951296396933498 0.4476236817151402 0.8192295652706174 }
radiance 27
center 307.99371337890625 0 -29.889602661132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8652203367468418 0.4469078664079479 0.9 }
radiance 18
center 261.33734130859375 0 -49.01874923706055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9294213813356897 0.3938620521421418 0.8864147774623312 }
radiance 26
center 259.4389953613281 0 -19.94386100769043
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7331082156447463 0.4502088942560371 0.9 }
radiance 31
center 260.6377258300781 0 -61.712764739990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41402612996436183 0.8303230586917337 }
radiance 18
center 247.3169403076172 0 -17.723011016845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.829637450201341 0.4091444844843207 0.8236960358190877 }
radiance 30
center 286.7274475097656 0 -74.33834075927734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9398666288828917 0.45682295742978396 0.8008532858964845 }
radiance 30
center 308.2232360839844 0 -35.413204193115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.389612831686725 0.5124515689170501 }
radiance 29
center 251.19805908203125 0 -57.22951126098633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9145616684703031 0.3782582543614764 0.8023801198677523 }
radiance 24
center 314.0505676269531 0 -71.01554107666016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8223309434994677 0.3810550930754697 0.8221220715273588 }
radiance 31
center 265.9026184082031 0 -67.29837036132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33396195566205805 0.5012472450184225 }
radiance 23
center 257.9269104003906 0 6.122261047363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9262511642434039 0.46933580182038037 0.9399660226930864 }
radiance 23
center 244.95529174804688 0 -44.54661560058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.93788752235756 0.4718295441057567 0.9577848105371348 }
radiance 19
center 309.4739685058594 0 -34.71245574951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.815798167776385 0.43161006602655805 0.9855681445805087 }
radiance 19
center 233.0990753173828 0 -40.01580810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9254707661043677 0.45125380414284466 0.9166017896145452 }
radiance 29
center 267.51739501953125 0 -81.68745422363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5755076887565436 0.3781360355724178 0.9 }
radiance 26
center 286.5863037109375 0 3.999244451522827
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5035898359092987 0.4769847991081453 0.9 }
radiance 29
center 304.2269287109375 0 5.742678165435791
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8698519243693125 0.3115749920846444 0.9936548179429203 }
radiance 25
center 233.5102081298828 0 13.68056583404541
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.929599581194779 0.4649804407247666 0.9446151120695687 }
radiance 21
center 258.194580078125 0 -46.779056549072266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9627238473340697 0.4290910546919875 0.9861516262686484 }
radiance 20
center 314.6861267089844 0 -22.990201950073242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3782900264104052 0.8624015336325489 }
radiance 24
center 237.47056579589844 0 -9.054463386535645
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42289893004288825 0.7552723547863393 }
radiance 24
center 310.8428039550781 0 21.041805267333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7991514410409479 0.4707300094984154 0.9 }
radiance 21
center 279.82952880859375 0 -20.332365036010742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9240387710331817 0.39267059059200243 0.988821425727209 }
radiance 25
center 227.5030059814453 0 -18.955305099487305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9359126705354389 0.32503526352736295 0.8584098731006267 }
radiance 31
center 291.6645812988281 0 -25.073116302490234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3091477163275636 0.5158492485498266 }
radiance 18
center 243.99505615234375 0 -35.739112854003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9313071297889025 0.36120508196004825 0.8218444691919787 }
radiance 20
center 284.5872497558594 0 9.110538482666016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9179973585603696 0.45188487491987905 0.8525999536846807 }
radiance 23
center 280.005859375 0 -7.867182731628418
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.497018848164443 0.5370428697207057 }
radiance 27
center 245.76771545410156 0 8.583962440490723
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8288433267844697 0.40460134872949505 0.8253051339118496 }
radiance 29
center 305.9353332519531 0 7.496764659881592
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9000821366117009 0.3628812293556336 0.9419840962546043 }
radiance 25
center 228.43551635742188 0 -24.244829177856445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9634363969401083 0.35239763326869694 0.8656882918123545 }
radiance 27
center 275.3359069824219 0 -56.58140182495117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9567686568676483 0.31935590366713124 0.8652643914809919 }
radiance 20
center 285.2209167480469 0 -15.486401557922363
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8252162998437539 0.45002800753049443 0.9037010818017813 }
radiance 29
center 224.16757202148438 0 -48.1043701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9559932594155597 0.4339929826793837 0.9058581029391277 }
radiance 31
center 251.46142578125 0 2.297767400741577
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39221646194490634 0.80026425056827 }
radiance 16
center 310.2220153808594 0 4.155885219573975
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4490173168658569 0.7676355515017735 }
radiance 25
center 286.765380859375 0 32.89923095703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8724782941441194 0.37485749587844486 0.9183975078059341 }
radiance 19
center 286.21771240234375 0 -54.026161193847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8282165043467602 0.33303289885064685 0.9262160907521783 }
radiance 24
center 287.2462158203125 0 49.87351989746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8602517392422724 0.4636584628823254 0.8898031165798306 }
radiance 31
center 304.3499755859375 0 -28.906757354736328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8559415338492925 0.34070196524066026 0.8420284426584855 }
radiance 21
center 241.57769775390625 0 7.515379428863525
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8396394131170597 0.36024656829778673 0.9 }
radiance 20
center 231.96897888183594 0 31.566944122314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.932983009834698 0.4806147552183601 0.9366742481691372 }
radiance 25
center 299.4792785644531 0 37.73601150512695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42793558324809233 0.5582253919450993 }
radiance 21
center 233.57687377929688 0 -32.033119201660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.910463676295961 0.4705109723294267 0.9177256883803658 }
radiance 27
center 222.50253295898438 0 -24.206172943115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.946754118618212 0.379922645505228 0.8814949333734929 }
radiance 22
center 302.6944580078125 0 40.48843765258789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9053008691448522 0.39750996974352326 0.8323813901614388 }
radiance 17
center 230.40261840820312 0 43.03484344482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9105780306603093 0.3364632864975217 0.8497676581987994 }
radiance 22
center 272.3253479003906 0 0.5810940265655518
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31260921822490156 0.44185315968323924 }
radiance 20
center 295.2192077636719 0 -24.575719833374023
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9342021786120812 0.49257127442614856 0.8333821322887933 }
radiance 29
center 250.07330322265625 0 -6.331573963165283
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8444243806874308 0.31429385448991615 0.9821097621275189 }
radiance 30
center 306.9344177246094 0 -40.743961334228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8727985982880162 0.470492734506717 0.9263669640698123 }
radiance 24
center 275.9933166503906 0 -6.872025489807129
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9480481917235257 0.328667356576112 0.823072093450888 }
radiance 27
center 305.986328125 0 34.61663055419922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9768230169162724 0.46551306562290506 0.8669051740258011 }
radiance 25
center 296.5795593261719 0 -35.0173225402832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6939162039151016 0.33588208246994733 0.9 }
radiance 23
center 295.8035888671875 0 -43.17423629760742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5833174441889772 0.44039204646672825 0.9 }
radiance 19
center 307.7148742675781 0 -33.285011291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9421179415847415 0.40726922122966486 0.8285154989264809 }
radiance 16
center 294.5866394042969 0 34.20941162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4845233252990817 0.7199205882122922 }
radiance 30
center 277.5890808105469 0 34.932395935058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8453669458165018 0.48047542944504634 0.9021155049537316 }
radiance 19
center 228.09849548339844 0 61.72188186645508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9306420030947763 0.43056198285496405 0.8763134451433376 }
radiance 24
center 297.6526794433594 0 32.31078338623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7803136020046134 0.34576449873969556 0.9 }
radiance 18
center 286.12139892578125 0 16.39023780822754
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31302019902641476 0.7616386675496312 }
radiance 22
center 228.58248901367188 0 36.568260192871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8941286700666546 0.3814434637933678 0.992482305343447 }
radiance 22
center 270.577392578125 0 -24.98870277404785
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6030637834830859 0.49908837973353515 0.9 }
radiance 21
center 305.51092529296875 0 68.91935729980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9684369297591253 0.35686878081827006 0.8422677706498622 }
radiance 25
center 265.4188232421875 0 3.0482490062713623
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8302949524157445 0.40047708271400595 0.8587074764983714 }
radiance 30
center 257.55645751953125 0 -2.5237882137298584
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8370828147984699 0.48397968526055724 0.8729505687392541 }
radiance 23
center 249.7183837890625 0 17.630443572998047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892765488187284 0.30305208964374347 0.9516588978277903 }
radiance 20
center 253.074462890625 0 26.35086441040039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8159117837868669 0.34503184657291297 0.8699036673040328 }
radiance 23
center 231.94712829589844 0 -18.99260902404785
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4413300025130392 0.7453400830047829 }
radiance 16
center 218.3077850341797 0 51.74072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9513560683438971 0.3173108986967415 0.9617838497085579 }
radiance 23
center 227.72911071777344 0 55.994140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37310993971177736 0.79543699756494 }
radiance 29
center 287.7033386230469 0 -12.827162742614746
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9166742493680753 0.43922414230432627 0.8659060295664396 }
radiance 22
center 305.8323059082031 0 43.510894775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9106733125837416 0.4474639352051176 0.9434293139491654 }
radiance 27
center 261.3438720703125 0 -23.785858154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8290743737925921 0.3693567108873194 0.8945191446261707 }
radiance 18
center 297.98345947265625 0 -21.502790451049805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8439841253991357 0.4301097319356572 0.9520159581279486 }
radiance 16
center 305.46368408203125 0 20.07610511779785
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9892651165381429 0.30562904697964316 0.8380627297473158 }
radiance 29
center 268.760986328125 0 2.904099941253662
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5273689455461782 0.38850817635636425 0.9 }
radiance 16
center 261.3158874511719 0 40.76036834716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7377852065030577 0.49288574128910356 0.9 }
radiance 23
center 290.9530334472656 0 -6.271923542022705
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9579484540288064 0.3832167437480102 0.9334832373417591 }
radiance 31
center 300.1764221191406 0 84.49916076660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8623172441675065 0.42333497617438975 0.8130088504705938 }
radiance 18
center 286.12060546875 0 45.509010314941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8642205984134689 0.4456646747930936 0.9 }
radiance 24
center 281.466552734375 0 57.16745376586914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9702145952808667 0.48284201843979724 0.8840733905794937 }
radiance 30
center 293.9452819824219 0 32.892208099365234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8882721438102364 0.3420664505850557 0.9073353064180775 }
radiance 27
center 293.1700744628906 0 38.311336517333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8095411571424204 0.42783187247849286 0.933672668806919 }
radiance 23
center 290.14300537109375 0 17.948549270629883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6669118905181705 0.418140580531581 0.9 }
radiance 23
center 248.00631713867188 0 4.5444512367248535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8428171326591867 0.39781238440939237 0.818467883935317 }
radiance 19
center 233.9235076904297 0 25.44527816772461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9435760861560912 0.4338737308605587 0.958263014663505 }
radiance 29
center 273.1473693847656 0 33.39142990112305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8797867734202878 0.3729720721641467 0.9101869734750436 }
radiance 20
center 293.7539367675781 0 25.488008499145508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7734966640979419 0.3749953073371356 0.9 }
radiance 29
center 215.98326110839844 0 15.89078140258789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.901244213167043 0.45012302906651364 0.912354771444315 }
radiance 23
center 227.29530334472656 0 11.253670692443848
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46876799292822424 0.8063850302439415 }
radiance 18
center 238.064697265625 0 7.4505534172058105
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8402203398531894 0.3673540515234758 0.8996062657220201 }
radiance 19
center 226.030517578125 0 62.669010162353516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.84835345795796 0.4397557505340083 0.9929160480810781 }
radiance 17
center 221.36402893066406 0 -7.111680030822754
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9685220008973692 0.36054555353269685 0.9459143810169065 }
radiance 31
center 283.8409118652344 0 58.8625373840332
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3848199477425773 0.7806977114824156 }
radiance 19
center 258.3879699707031 0 83.41754150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8160459495708132 0.3104663538261782 0.8094118128194394 }
radiance 26
center 252.7334442138672 0 50.78913879394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9633128214099338 0.47589046786217926 0.9471440938123212 }
radiance 28
center 292.50384521484375 0 43.26755905151367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49796279356816464 0.410259192533868 0.9 }
radiance 19
center 217.0552520751953 0 53.697025299072266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9497887921911059 0.47101518427085226 0.9032779833781948 }
radiance 17
center 264.61920166015625 0 39.34259033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9381572649279311 0.45102950562028793 0.814448357462299 }
radiance 24
center 235.7436065673828 0 84.64022064208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9170856607887983 0.307226776476277 0.9753827677507176 }
radiance 31
center 235.46624755859375 0 56.2191276550293
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.806113952739602 0.43116436414755155 0.9094567038273882 }
radiance 20
center 202.86361694335938 0 90.49402618408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5742941179081279 0.4436046851762748 0.9 }
radiance 26
center 290.6139831542969 0 57.83633041381836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9530720270393116 0.3634835943932677 0.8183727189028686 }
radiance 19
center 227.23626708984375 0 98.47040557861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9642860314670085 0.407326849962678 0.9541219717352931 }
radiance 24
center 205.72569274902344 0 91.15824890136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8188291732381325 0.30423181051920634 0.9 }
radiance 22
center 240.14744567871094 0 70.02354431152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7240910672374081 0.4828404272405919 0.9 }
radiance 17
center 275.17010498046875 0 14.664266586303711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7581529225049395 0.3035075395417317 0.9 }
radiance 18
center 202.99166870117188 0 90.55378723144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8762611939129576 0.37287148514020807 0.8748800604104412 }
radiance 25
center 255.05252075195312 0 73.74356079101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6123190307097459 0.4058699875435342 0.9 }
radiance 23
center 229.6842041015625 0 61.764827728271484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7143829862576737 0.43729420565994465 0.9 }
radiance 30
center 282.8314208984375 0 94.64932250976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5174987021238517 0.46446802860437486 0.9 }
radiance 31
center 297.3270568847656 0 44.018333435058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3699430380982779 0.5494665188039118 }
radiance 24
center 236.4475860595703 0 75.06385040283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9255874675445974 0.35357757175779014 0.9100708609358489 }
radiance 18
center 290.6792907714844 0 78.86524963378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9419644406699061 0.3629441430591478 0.865030914937399 }
radiance 23
center 243.87232971191406 0 26.285539627075195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9122499798398873 0.44304383583952633 0.9773612437697616 }
radiance 29
center 286.7539978027344 0 100.4027328491211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9621041937821846 0.46247927329366023 0.8342102941284372 }
radiance 27
center 246.61923217773438 0 45.390655517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8680634072313358 0.4450162285605328 0.9 }
radiance 25
center 223.46266174316406 0 27.56885528564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8325889941351723 0.3158959394621425 0.9633662795767081 }
radiance 19
center 236.5515594482422 0 87.8839340209961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9385969958598853 0.4474549503391254 0.9704609676501399 }
radiance 17
center 260.0658874511719 0 61.267295837402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4748848105587 0.8187587003971869 }
radiance 31
center 216.52999877929688 0 31.56765365600586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40002495248175995 0.8569741255370552 }
radiance 19
center 230.74391174316406 0 53.177146911621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31326179220000033 0.4862243768174449 }
radiance 20
center 281.9584655761719 0 39.824737548828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9878343428913783 0.47417504362932084 0.8668646233247026 }
radiance 27
center 283.0522766113281 0 47.304847717285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8542075582067188 0.47541406540524966 0.917328286758752 }
radiance 24
center 207.54603576660156 0 86.773681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9057204273686646 0.3771354878986606 0.8074862280261872 }
radiance 23
center 205.47947692871094 0 81.94258117675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8499066626323071 0.3077421616755224 0.8241181036215522 }
radiance 22
center 271.1317443847656 0 46.147682189941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9027197494656313 0.33874255409818793 0.8250063803442361 }
radiance 16
center 221.91510009765625 0 41.44880676269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9539784771660375 0.4163028699001722 0.9274616496514342 }
radiance 19
center 235.34954833984375 0 118.38505554199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8008966618629131 0.39585878957374127 0.8267415835870496 }
radiance 21
center 202.84609985351562 0 59.07114791870117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8829695349728499 0.4510255742071637 0.9903728463066548 }
radiance 29
center 227.7545928955078 0 109.97998809814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717391514760302 0.4979883745359227 0.9347445478577929 }
radiance 19
center 258.2873229980469 0 85.03933715820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3723133963078586 0.7130143325688935 }
radiance 31
center 272.9329833984375 0 26.17472267150879
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6642686509568255 0.44598763097327887 0.9 }
radiance 16
center 280.4115295410156 0 38.6795539855957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.889522154814953 0.35058026680846704 0.8839829905214066 }
radiance 25
center 216.50341796875 0 72.96206665039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9376395287810803 0.43589431083844554 0.9677698922781793 }
radiance 24
center 270.2619934082031 0 103.1932373046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8283479068156443 0.39364779908558456 0.9037204938707448 }
radiance 28
center 236.6845245361328 0 108.81475830078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9587335824471687 0.49500019745798174 0.8502668375125899 }
radiance 24
center 224.7667999267578 0 49.607177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3135000312600296 0.6361563678959282 }
radiance 28
center 200.64093017578125 0 64.72122192382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9547217839364998 0.4986503789718681 0.9159344591047652 }
radiance 23
center 276.0027770996094 0 131.11947631835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7647385219392252 0.40832524468066655 0.9 }
radiance 25
center 200.0015869140625 0 134.1418914794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38976989814757546 0.4056343582367058 }
radiance 17
center 188.55618286132812 0 71.0952377319336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4450698350717143 0.40487689339623834 }
radiance 17
center 202.4577178955078 0 66.72030639648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9487922410296141 0.39512319511061256 0.9120105075172775 }
radiance 22
center 229.6219024658203 0 116.99857330322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9849914742955729 0.45589384226086593 0.8163631018792677 }
radiance 30
center 206.81849670410156 0 63.85045623779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46253360091932394 0.5153377806952821 }
radiance 19
center 268.62286376953125 0 42.515052795410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4364208934014599 0.7095933293953225 }
radiance 22
center 197.2476348876953 0 62.2420654296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8970885651837427 0.3376122196875147 0.9598884620911023 }
radiance 20
center 188.4788818359375 0 117.93612670898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46262192858184503 0.5374368985597243 }
radiance 19
center 203.21446228027344 0 62.561458587646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8906381159281728 0.41106354965179626 0.9479403306105698 }
radiance 22
center 209.82034301757812 0 85.44059753417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9963119813823649 0.39217003247853344 0.9576033041635844 }
radiance 31
center 274.7098083496094 0 74.97136688232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8981563795775142 0.35713662305262756 0.9527610536996272 }
radiance 27
center 240.98341369628906 0 119.57747650146484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9656733901797028 0.408446184068145 0.9229955904431566 }
radiance 25
center 192.9945831298828 0 119.84095764160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8010458457354296 0.4892269046218627 0.853201456503502 }
radiance 31
center 202.38302612304688 0 129.6650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9707351078838788 0.31671335512848686 0.9000108307542444 }
radiance 26
center 279.9295349121094 0 59.95111083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33048508905918206 0.7155105432673715 }
radiance 18
center 253.5136260986328 0 73.38617706298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.832138854469899 0.3385423800779255 0.9021519278794669 }
radiance 27
center 249.96702575683594 0 123.98287200927734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.935226227235416 0.3163352423839529 0.8983419464870955 }
radiance 26
center 229.2086181640625 0 62.121681213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9263368584927829 0.43476955502390136 0.9685261566173173 }
radiance 30
center 186.5322265625 0 92.26641845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9309717425481048 0.3298863662512382 0.9840090610055384 }
radiance 25
center 211.5410614013672 0 106.47663879394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9112642043406786 0.4481588261904905 0.9919870322410578 }
radiance 30
center 191.41697692871094 0 63.70613098144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9590845653119426 0.4550360902591686 0.8960372329791247 }
radiance 26
center 223.2177734375 0 133.39938354492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8434105228874893 0.4711201574905991 0.869904357064563 }
radiance 26
center 185.21978759765625 0 81.48657989501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4918600210535332 0.3122918511875042 0.9 }
radiance 17
center 207.72052001953125 0 135.00445556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205128397568388 0.31403706039268886 0.9262249273163902 }
radiance 22
center 246.05194091796875 0 128.74850463867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9351029979943285 0.43586519927417167 0.8318025875028132 }
radiance 16
center 235.9295654296875 0 88.35275268554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4550583794507367 0.6016353297582743 }
radiance 16
center 181.8817596435547 0 66.17998504638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5694669116828601 0.30830696568400545 0.9 }
radiance 21
center 211.5836639404297 0 122.81100463867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5347956162958356 0.312160869921657 0.9 }
radiance 23
center 234.95069885253906 0 102.44120788574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9193553991727067 0.3327092334517463 0.9261491522449841 }
radiance 16
center 205.5583953857422 0 144.8022918701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8538841686692196 0.40620298319380355 0.8990153852530061 }
radiance 28
center 265.7471008300781 0 142.1129608154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7659123627234725 0.3467559868333044 0.9 }
radiance 28
center 237.4319305419922 0 94.37203979492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6296313143587448 0.3016995038329971 0.9 }
radiance 20
center 203.39492797851562 0 76.88729858398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.858838639737641 0.4663826152378711 0.9317888526585565 }
radiance 24
center 235.52305603027344 0 77.81812286376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7804062947202347 0.4789320986685954 0.9 }
radiance 29
center 227.8409423828125 0 86.05004119873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.840619789894902 0.36048202593800344 0.8811895412144752 }
radiance 20
center 215.12667846679688 0 99.93212890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9401791142987138 0.32576467653380153 0.841784070575533 }
radiance 23
center 241.2848663330078 0 131.50213623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9716158565842195 0.30283387157752795 0.8999622265467524 }
radiance 17
center 238.09071350097656 0 148.38037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8588833093464165 0.4002560983095124 0.8233648322331175 }
radiance 30
center 254.2411346435547 0 126.6910400390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9827897854732528 0.3082255433848568 0.9075890982528241 }
radiance 30
center 189.59286499023438 0 78.57606506347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8317565213858146 0.3005202148509454 0.9971873673400931 }
radiance 26
center 209.87643432617188 0 126.34487915039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9924936505321026 0.41001668119990475 0.8412607036914992 }
radiance 22
center 257.8451843261719 0 82.14525604248047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7337088320883024 0.40432735394544506 0.9 }
radiance 22
center 240.6982421875 0 94.22705841064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9853111817904352 0.4919177720376039 0.894807229419513 }
radiance 21
center 230.06216430664062 0 122.19775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8548414988762965 0.4557460004036861 0.9883191005566974 }
radiance 31
center 208.22946166992188 0 156.94993591308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4258598200620671 0.5926343912659525 }
radiance 24
center 184.1984100341797 0 120.3566665649414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9916893034826577 0.3546915405619779 0.8353896050055831 }
radiance 30
center 255.45301818847656 0 93.5352783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8695797402717655 0.35695935089966363 0.924768607378288 }
radiance 30
center 262.2442626953125 0 120.14132690429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9021399014503311 0.3239399910831888 0.8115739424068077 }
radiance 20
center 244.71800231933594 0 80.87413787841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9033239177074076 0.3129580866819335 0.9811293273166163 }
radiance 16
center 227.86204528808594 0 84.76058197021484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9012771925296672 0.41816205460495326 0.9818436649046833 }
radiance 31
center 197.45826721191406 0 161.15150451660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3386218597031535 0.43345491006154735 }
radiance 16
center 224.73880004882812 0 135.22409057617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9931920421353496 0.3899358042866685 0.8511427199473042 }
radiance 23
center 229.9876708984375 0 142.4363555908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40553610493188236 0.7956044988524049 }
radiance 30
center 236.34286499023438 0 162.686767578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9386100851576402 0.3496442270551804 0.9698598456066965 }
radiance 27
center 248.95166015625 0 138.8511199951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8829925435833674 0.4476965322039805 0.8365460791918716 }
radiance 16
center 206.6718292236328 0 104.45416259765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.999060679465167 0.4927248710369071 0.8867910052926156 }
radiance 24
center 203.4700164794922 0 134.88340759277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8393723834500773 0.3187634747321001 0.9949939627358794 }
radiance 31
center 194.8599395751953 0 88.2008056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8890893025673503 0.4749480263525867 0.95223765886252 }
radiance 22
center 225.80348205566406 0 129.0513153076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8675793071892963 0.38149758753737184 0.941313210827128 }
radiance 28
center 240.29873657226562 0 92.05795288085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6977028274646558 0.4066756103675543 0.9 }
radiance 23
center 185.80029296875 0 106.55854797363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8613586946055881 0.4334413144283542 0.9828138418289523 }
radiance 17
center 179.93731689453125 0 135.4132080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9716134222618357 0.47553852563515225 0.9528837862702628 }
radiance 25
center 241.57412719726562 0 118.1224136352539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8262047845257838 0.30767362735180365 0.9195814238980198 }
radiance 16
center 166.7755126953125 0 127.5243148803711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.463426056776967 0.3394800177916733 0.9 }
radiance 28
center 212.39805603027344 0 107.14232635498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6570051842632937 0.40742867657150583 0.9 }
radiance 29
center 175.87403869628906 0 136.21240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.950851873439567 0.37111033569171015 0.9490047203097949 }
radiance 30
center 222.7664337158203 0 126.1035385131836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8627814553252484 0.38029633827509335 0.9250966351628553 }
radiance 20
center 223.91995239257812 0 144.3858184814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.742605609594445 0.47886382837705055 0.9 }
radiance 26
center 209.53701782226562 0 174.2304229736328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8731304645867839 0.34150308130118173 0.845415607003127 }
radiance 22
center 224.0020294189453 0 160.7305145263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9347307516888469 0.3480317396206615 0.8596268114142682 }
radiance 25
center 240.74636840820312 0 97.60631561279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8755322824817549 0.31030502556693085 0.9821005762868789 }
radiance 24
center 205.85411071777344 0 138.13656616210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8848988957685302 0.4593786791066049 0.9 }
radiance 27
center 187.05812072753906 0 118.90922546386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8211467105626233 0.4636710040076454 0.9349935312399883 }
radiance 27
center 233.74070739746094 0 172.52243041992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3951903652630182 0.5205122293935303 }
radiance 29
center 208.81227111816406 0 94.36865997314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8406423911692066 0.3232566713420771 0.9709990992686967 }
radiance 18
center 239.4213409423828 0 165.8499298095703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.316440388740112 0.6280421119503582 }
radiance 23
center 176.48361206054688 0 103.22242736816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8595731349527079 0.30337643991928215 0.8762827313804789 }
radiance 20
center 229.87075805664062 0 117.290771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9756861834635363 0.3958884453138808 0.8853626295004539 }
radiance 19
center 199.60653686523438 0 164.75503540039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9920951022545604 0.33891795077011555 0.9710940570855483 }
radiance 21
center 192.97088623046875 0 123.09368133544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7266257195571445 0.44245588011450726 0.9 }
radiance 17
center 222.9108123779297 0 168.0498504638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9010347552900405 0.47700953379356925 0.8977882644576799 }
radiance 29
center 239.8530731201172 0 134.400146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4975613725327269 0.44777391325301785 0.9 }
radiance 25
center 166.34646606445312 0 177.59922790527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46860150099787024 0.5899835682360814 }
radiance 25
center 178.09805297851562 0 105.8683853149414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9815186846477674 0.499832126464853 0.8879977860829341 }
radiance 19
center 191.20892333984375 0 153.2861785888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8647043093921584 0.4183223123654055 0.9 }
radiance 31
center 154.07168579101562 0 108.35125732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7235694197991294 0.35457142159120303 0.9 }
radiance 17
center 220.4829559326172 0 147.23788452148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9139345653499191 0.3078432834195989 0.8565582233854141 }
radiance 28
center 202.1097412109375 0 149.9959259033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8441310140905578 0.4989379863493997 0.9773516387101813 }
radiance 30
center 177.4845733642578 0 124.26776885986328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4206772097101896 0.45368031845483536 }
radiance 22
center 236.79388427734375 0 164.35928344726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.616208003244521 0.3580527633041533 0.9 }
radiance 29
center 163.7671661376953 0 169.18397521972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9921853367180942 0.46162556336863403 0.9411814183980516 }
radiance 30
center 173.2891387939453 0 149.9539031982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8330540616294072 0.32898967682902097 0.8580657346981801 }
radiance 26
center 183.98866271972656 0 141.47457885742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8246703022135938 0.4850936438320762 0.987931413682811 }
radiance 31
center 189.21267700195312 0 178.12322998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45615847754815164 0.40386084529822686 }
radiance 29
center 188.2193603515625 0 162.53860473632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9793131934638166 0.30165178203313087 0.991471651950611 }
radiance 31
center 194.64083862304688 0 141.95596313476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9333195831000818 0.3158640377829032 0.8535656171706923 }
radiance 18
center 165.29263305664062 0 141.38970947265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9202196217032917 0.39790308756128456 0.8108586986781234 }
radiance 31
center 158.18923950195312 0 152.07052612304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8621382533930274 0.4567561361944107 0.9028466195764147 }
radiance 17
center 191.89015197753906 0 132.84532165527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9949825810878163 0.3552219757031559 0.8067554176439451 }
radiance 31
center 156.9564971923828 0 113.44393920898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4019137744381319 0.8794248709711485 }
radiance 16
center 211.93499755859375 0 170.73922729492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7042066643540569 0.31832493216843943 0.9 }
radiance 23
center 196.13583374023438 0 123.15049743652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9554689688975251 0.40079286503156597 0.9501882548480481 }
radiance 31
center 194.12710571289062 0 137.72317504882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8322402105208554 0.4464362202213727 0.8457659919241896 }
radiance 22
center 186.2088165283203 0 179.06028747558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9120193157311044 0.4750815173617828 0.9107554376024399 }
radiance 20
center 209.21392822265625 0 161.12106323242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6619366848174545 0.3628140562252469 0.9 }
radiance 19
center 190.060791015625 0 202.15890502929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9781249154634319 0.37843709134918013 0.8614737252600858 }
radiance 23
center 227.57240295410156 0 143.12246704101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9421878522441289 0.4175701686896792 0.8954439307690515 }
radiance 30
center 146.44271850585938 0 138.5661163330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9609301935302766 0.4915744269127126 0.8471015890701995 }
radiance 20
center 205.9412078857422 0 147.52755737304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8570767926879611 0.4956000056482628 0.9165563134339175 }
radiance 17
center 203.9232177734375 0 186.93490600585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8661064451136717 0.3695995185454847 0.997663735924821 }
radiance 26
center 169.6830291748047 0 148.56353759765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.705139240653395 0.4394319762395635 0.9 }
radiance 21
center 219.37826538085938 0 177.25233459472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5462964294377262 0.31804422370315494 0.9 }
radiance 19
center 161.6864013671875 0 164.06137084960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8283848151184876 0.3316163854285483 0.9412674979013634 }
radiance 21
center 188.04795837402344 0 172.66455078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46610206738829646 0.8114354200337102 }
radiance 30
center 224.23080444335938 0 151.0012664794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8998463887207986 0.4013373057522561 0.9 }
radiance 28
center 199.9298858642578 0 189.97610473632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9645429338097773 0.4185767345451069 0.8968249757648095 }
radiance 28
center 144.59103393554688 0 125.90694427490234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8565513041057786 0.4164052239491767 0.9514231333347601 }
radiance 30
center 152.4490203857422 0 136.2174530029297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8566130330187189 0.45154061572402704 0.8842641813594037 }
radiance 30
center 155.58270263671875 0 210.92066955566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8504911725183799 0.35531965313164565 0.8236442781147812 }
radiance 25
center 152.64996337890625 0 167.01620483398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9252306041789959 0.3553432504602961 0.8792402203394966 }
radiance 31
center 163.34478759765625 0 147.1208038330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8247075264369916 0.44991810397815535 0.8255972741318789 }
radiance 17
center 213.35824584960938 0 205.4173583984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9183606948991176 0.39346258627751396 0.8428913678426674 }
radiance 22
center 205.9562530517578 0 125.65007781982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9323098658567148 0.33932700896835516 0.8609414959276153 }
radiance 23
center 139.0540313720703 0 152.3943328857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9393345189983 0.44794610828825676 0.9887079455553236 }
radiance 28
center 173.9891357421875 0 198.4593048095703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4000536828321569 0.8455281937204544 }
radiance 29
center 160.55838012695312 0 202.6853485107422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.873828790318701 0.45591129534029146 0.9129990550081071 }
radiance 16
center 194.25241088867188 0 163.16543579101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9787219030743486 0.4674112952180285 0.8295049484749168 }
radiance 16
center 196.35232543945312 0 176.5686492919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6385473685612008 0.4959575235394155 0.9 }
radiance 29
center 196.6238250732422 0 200.08090209960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9522162934525817 0.30673856523942894 0.8045091213636336 }
radiance 22
center 149.99147033691406 0 170.14544677734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8503216043409573 0.4310389608262267 0.9821604131940058 }
radiance 22
center 210.68487548828125 0 201.8903045654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4572551915208677 0.4901679186380341 0.9 }
radiance 28
center 158.92373657226562 0 206.79202270507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7966490535470838 0.4427940122061093 0.9 }
radiance 27
center 187.65872192382812 0 162.0230712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9680009027358754 0.4185670536118974 0.9487216707174592 }
radiance 18
center 148.40802001953125 0 128.93515014648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.336961496370729 0.4107468783174947 }
radiance 16
center 196.568603515625 0 184.4835662841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8890687852741734 0.3494881799683382 0.9429172538951699 }
radiance 28
center 182.88340759277344 0 172.52220153808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7444589205669061 0.44187840758131536 0.9 }
radiance 16
center 143.08453369140625 0 173.40713500976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8818055190916205 0.42290174028723404 0.9 }
radiance 21
center 134.5550994873047 0 185.46376037597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8537315589530865 0.46695809081828865 0.9640875157774813 }
radiance 30
center 188.40452575683594 0 174.30471801757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40277222359884723 0.49399178494744234 0.9 }
radiance 20
center 135.49285888671875 0 153.64901733398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9316710720109306 0.31438265936759086 0.9159945270342762 }
radiance 20
center 120.86241149902344 0 180.51947021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.957394784978032 0.40995805306009503 0.9197701264895388 }
radiance 30
center 120.05138397216797 0 135.87350463867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9858315186069889 0.48911079881052144 0.8624430318201708 }
radiance 26
center 133.04298400878906 0 169.05538940429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8104120222469512 0.37689121039171725 0.8363866064927288 }
radiance 27
center 119.70315551757812 0 172.7115478515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5572303915864015 0.4978927476539292 0.9 }
radiance 19
center 154.4142303466797 0 149.71829223632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9552219778773756 0.4645609872834665 0.9525976589057873 }
radiance 18
center 142.04449462890625 0 212.9827423095703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8056922638198801 0.3639218008330408 0.9312499709996213 }
radiance 24
center 200.51400756835938 0 186.7373504638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8908098092621962 0.48302328558450036 0.9852910619894429 }
radiance 30
center 190.03221130371094 0 220.07998657226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9933718126296707 0.3221450902920924 0.8166700855231194 }
radiance 19
center 191.600341796875 0 206.21302795410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8728313646683584 0.34743776093156364 0.9681688561030373 }
radiance 23
center 162.04034423828125 0 193.0669708251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9282977365851066 0.4207958981299475 0.87155979568756 }
radiance 29
center 184.82901000976562 0 143.23226928710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8576370934971305 0.4736169761557272 0.9576453764124205 }
radiance 20
center 200.80262756347656 0 166.55613708496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5258558175394968 0.4392041738971808 0.9 }
radiance 23
center 197.57177734375 0 203.4751434326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998226191976071 0.3817133193778023 0.8863505841865092 }
radiance 23
center 116.24354553222656 0 168.46934509277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9259842389958257 0.39834616139967394 0.8706838005533014 }
radiance 18
center 198.4017791748047 0 191.341552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6268916603045737 0.4241174674211143 0.9 }
radiance 21
center 194.7779083251953 0 207.32867431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8125504749669611 0.3740242722433058 0.8368385284892849 }
radiance 20
center 188.08956909179688 0 141.60989379882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8400653684601023 0.48012201354020456 0.9770030151641179 }
radiance 20
center 167.95022583007812 0 192.59031677246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47764588729536883 0.4613722665566645 0.9 }
radiance 23
center 103.81718444824219 0 159.7339324951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9016213736425375 0.34091615786867197 0.8834197689357248 }
radiance 21
center 138.84181213378906 0 159.53636169433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4708065730067664 0.4362175601182664 0.9 }
radiance 19
center 183.30740356445312 0 212.00404357910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8510386018568595 0.340493755716941 0.985145569128592 }
radiance 26
center 123.17862701416016 0 156.01840209960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8476205142174236 0.4595709932261023 0.8259961946064004 }
radiance 22
center 130.74343872070312 0 213.17564392089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8542859021028799 0.4863427015157833 0.8303840986015503 }
radiance 18
center 185.1370849609375 0 159.29495239257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6509278685207582 0.3329585443700099 0.9 }
radiance 21
center 125.11089324951172 0 226.83871459960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8852101171984919 0.4376159099076842 0.9683864008388599 }
radiance 29
center 108.56253814697266 0 224.72206115722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9400258337568066 0.4752842331865903 0.8305683865533584 }
radiance 31
center 125.61184692382812 0 202.00840759277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.943392571567655 0.3282969895271049 0.9425957787099795 }
radiance 31
center 112.80184936523438 0 198.17498779296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7291333709737222 0.31715571291557226 0.9 }
radiance 28
center 135.28024291992188 0 228.09837341308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31474795204470035 0.486319503449104 }
radiance 19
center 175.2871551513672 0 225.1298370361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8989162086124319 0.4675100668641956 0.865310188561423 }
radiance 20
center 166.2353515625 0 157.322021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8833508103912686 0.3813172467109318 0.8600680232129871 }
radiance 24
center 145.05763244628906 0 214.1846466064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.840115483067726 0.43883649189089746 0.8150871834256177 }
radiance 27
center 164.18605041503906 0 212.56690979003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9172679856994462 0.4487844550424178 0.9993708295803094 }
radiance 19
center 170.58912658691406 0 185.3433837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8107877258109768 0.35541039771116695 0.8733703344142696 }
radiance 17
center 127.19666290283203 0 148.47633361816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7142479664890131 0.4119909731705648 0.9 }
radiance 22
center 142.36720275878906 0 184.35946655273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9881461604347554 0.31467533799724084 0.9751048622558909 }
radiance 23
center 143.23326110839844 0 179.77871704101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45101947449014945 0.4918712406924901 }
radiance 28
center 105.76729583740234 0 160.89495849609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9259632969012526 0.4437762295839047 0.8404197091445983 }
radiance 30
center 131.328369140625 0 212.6529998779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6044658961614879 0.44465599338745754 0.9 }
radiance 21
center 120.10969543457031 0 221.99969482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9855160578595431 0.3925169079338282 0.8638804029378891 }
radiance 28
center 164.4805908203125 0 229.29318237304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8198971956289199 0.3362664566048018 0.9525319092356017 }
radiance 23
center 164.62452697753906 0 188.1963653564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31658740905854577 0.8446427665250553 }
radiance 16
center 129.24505615234375 0 166.80111694335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8166672173773069 0.4217008663298366 0.8684347434519641 }
radiance 26
center 130.3440399169922 0 200.27920532226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3199059781721771 0.49397355874206217 }
radiance 23
center 128.47906494140625 0 229.43862915039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8225629217129644 0.37406265389195525 0.944762385453943 }
radiance 26
center 99.27539825439453 0 208.3386688232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5302586572427628 0.30659123366632807 0.9 }
radiance 19
center 127.1995620727539 0 218.9998321533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4068515635802301 0.5608670594129891 }
radiance 29
center 150.372314453125 0 195.42469787597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8387457092827917 0.3932387443059663 0.8003606135885626 }
radiance 23
center 148.9329833984375 0 196.17788696289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9389976375896212 0.46920212557138713 0.801126357753434 }
radiance 23
center 129.573486328125 0 232.3435516357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9104708299152705 0.4384169487400901 0.9596992210775679 }
radiance 16
center 165.7989501953125 0 209.78758239746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8337582005671563 0.31463806539377737 0.9 }
radiance 16
center 84.26730346679688 0 203.34561157226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5834394845210419 0.4766543087206192 0.9 }
radiance 21
center 147.15310668945312 0 189.6056671142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5843839275249959 0.32320042196678955 0.9 }
radiance 19
center 96.44023895263672 0 210.20297241210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8968773181880553 0.444369119178296 0.8231716180640307 }
radiance 28
center 151.62962341308594 0 164.9370574951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8311748695605315 0.4437062430297431 0.804452454762711 }
radiance 30
center 108.19355773925781 0 226.29495239257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9856102272910626 0.35842634852202127 0.831391473374973 }
radiance 28
center 167.7718048095703 0 187.40936279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3410074198752436 0.787879584053161 }
radiance 26
center 137.96266174316406 0 175.94874572753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9028155246809033 0.3750610516457797 0.9816808454895124 }
radiance 16
center 156.54507446289062 0 174.64474487304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9598049992497046 0.4839781535906661 0.9806382367498037 }
radiance 26
center 104.94002532958984 0 239.1476593017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8354918324022184 0.31134566783232326 0.966115836463737 }
radiance 28
center 106.61737060546875 0 170.2138214111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9929325011635761 0.44977405216866834 0.8968189188894582 }
radiance 22
center 70.6151351928711 0 231.17625427246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8242300300634902 0.31206943055864417 0.8101380076037541 }
radiance 18
center 94.39774322509766 0 211.01995849609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8994353824795153 0.3310455078100014 0.8211359338992535 }
radiance 24
center 111.93326568603516 0 219.14349365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9052977285643218 0.36922831667281286 0.8562389490118039 }
radiance 31
center 155.3824005126953 0 162.25669860839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.800964893743119 0.39722290480871736 0.8416451287072438 }
radiance 27
center 92.4447250366211 0 236.98666381835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37592182811466646 0.4887269730899265 }
radiance 30
center 94.66509246826172 0 180.48545837402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6093000722831794 0.45626346455018874 0.9 }
radiance 23
center 150.57041931152344 0 220.73948669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8635072532752468 0.3317962813977923 0.8687925458664258 }
radiance 30
center 106.12873840332031 0 190.1696014404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4537765558361365 0.5100255555069063 }
radiance 20
center 96.46038818359375 0 187.43052673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4050357843068732 0.547499453667483 }
radiance 30
center 136.36097717285156 0 236.62933349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46809303505012523 0.47893072124527536 }
radiance 24
center 83.03709411621094 0 161.74826049804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8267272415247471 0.4832949222436924 0.8667305828776708 }
radiance 31
center 114.98455810546875 0 172.64791870117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.907362162302564 0.3797540301107558 0.8371236309114816 }
radiance 21
center 118.68701171875 0 215.30551147460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8676122901711971 0.4656951411142844 0.9816007409724133 }
radiance 16
center 101.64679718017578 0 186.73898315429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8905180234794638 0.3782981804882745 0.9119680311261241 }
radiance 27
center 129.9832000732422 0 228.83135986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9011165446657702 0.4483115022930406 0.8361459273043637 }
radiance 17
center 147.12490844726562 0 164.7342071533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8849848795279432 0.3277140145203611 0.9 }
radiance 22
center 125.5932388305664 0 181.07632446289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8975258400202343 0.389977978864145 0.8172504930353948 }
radiance 18
center 120.80724334716797 0 252.599853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32608723110358767 0.7558208024013013 }
radiance 21
center 104.28466033935547 0 230.9415740966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6824095265717762 0.4310363289806899 0.9 }
radiance 29
center 109.07749938964844 0 209.82296752929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8927689787347846 0.3166103463698052 0.8525396196457047 }
radiance 21
center 90.781982421875 0 245.1457061767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9131574676673874 0.4803978376188371 0.9196630829452964 }
radiance 26
center 129.24850463867188 0 191.4859619140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9089172131868427 0.43878942793266795 0.9084324735792051 }
radiance 26
center 84.93476867675781 0 227.0282440185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9496475848387218 0.302310853831875 0.9489669920866034 }
radiance 29
center 136.96539306640625 0 184.6902313232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8091981036102295 0.3290732544431393 0.954988474927407 }
radiance 27
center 107.669189453125 0 211.39105224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33198672008869257 0.8990312530897775 }
radiance 21
center 111.67501068115234 0 225.12403869628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9885935030321185 0.39742479983226703 0.9596313176892405 }
radiance 28
center 138.69290161132812 0 186.9228057861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9340102002472858 0.4933918812412539 0.9515902888532891 }
radiance 17
center 71.47626495361328 0 188.7372589111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9905691289417132 0.4090929064041421 0.9193810219935388 }
radiance 21
center 118.26792907714844 0 247.2025146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42030298493208496 0.3966398654383583 0.9 }
radiance 29
center 138.097900390625 0 210.28929138183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5924944861790608 0.3512856629976386 0.9 }
radiance 21
center 58.58336639404297 0 222.46688842773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32920216458461404 0.6065397594208427 }
radiance 21
center 130.35142517089844 0 229.67303466796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.999637250469881 0.3497789929317624 0.8877595021938898 }
radiance 25
center 76.46178436279297 0 225.5361785888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8813805551965244 0.38494347751640423 0.8629597742129436 }
radiance 26
center 134.1540985107422 0 253.9168243408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32505809960659593 0.5503580298851264 }
radiance 28
center 101.27395629882812 0 238.39744567871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3495766844354343 0.4879718764061963 }
radiance 17
center 117.36689758300781 0 228.17623901367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9719935194968019 0.3548574825483611 0.9126206196639699 }
radiance 27
center 91.088623046875 0 254.36148071289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6946541016323083 0.34511541474960633 0.9 }
radiance 22
center 86.89054107666016 0 224.03689575195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8051593822179741 0.3339056116771527 0.8789554190761409 }
radiance 27
center 62.62529373168945 0 232.26034545898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9404512604224532 0.4436203713290843 0.8640180414121905 }
radiance 25
center 101.42413330078125 0 184.9648895263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8657490330473476 0.40575495398443395 0.9284125696784373 }
radiance 24
center 114.38632202148438 0 192.84625244140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8409927707589664 0.3488160911046586 0.9940581338165354 }
radiance 22
center 118.68502807617188 0 256.8288269042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5805723247635629 0.48271034628935794 0.9 }
radiance 17
center 39.874977111816406 0 248.03929138183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.826478091447556 0.309787107817141 0.985830142892395 }
radiance 21
center 123.45305633544922 0 196.28501892089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5719083231300093 0.326227034792231 0.9 }
radiance 17
center 117.12405395507812 0 192.117919921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6810996232806538 0.30396211577498344 0.9 }
radiance 22
center 90.87198638916016 0 175.0750274658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8377436994024832 0.45781370887523165 0.8543351939201262 }
radiance 24
center 71.303466796875 0 217.84385681152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9159786286234844 0.43274048427742673 0.8604444435420149 }
radiance 17
center 54.94078063964844 0 197.1995849609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31811180704116293 0.7448390710297299 }
radiance 27
center 120.10404968261719 0 199.3875274658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38110563584140933 0.6918378781620113 }
radiance 21
center 59.95735549926758 0 239.04119873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9168654058721218 0.3561032610309544 0.9267792447462514 }
radiance 19
center 70.13946533203125 0 258.0826110839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.875530652259827 0.48470656329006445 0.9550309960104513 }
radiance 27
center 71.28177642822266 0 216.1962432861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8519592678326458 0.4039746637558057 0.9464467384296585 }
radiance 26
center 69.2066650390625 0 230.28663635253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9612858938929147 0.4910743541860535 0.8557601898884956 }
radiance 30
center 58.15979766845703 0 196.11009216308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47154420556706156 0.41483636251059186 0.9 }
radiance 16
center 114.87554168701172 0 202.7140655517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8963241605826981 0.4757494921802913 0.840199975667878 }
radiance 20
center 96.06729125976562 0 186.9774627685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9264919180194519 0.4374223816080859 0.8819488614193176 }
radiance 27
center 73.76585388183594 0 223.5919647216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4522945788739047 0.8038459979178911 }
radiance 16
center 39.6920166015625 0 224.2585906982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9508140353346255 0.421707808409556 0.9899187320291698 }
radiance 30
center 98.68955993652344 0 239.27671813964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8150891898317791 0.481654987454605 0.9 }
radiance 19
center 43.669960021972656 0 259.7393493652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9235508114506589 0.30570904914997094 0.8697202457608225 }
radiance 27
center 46.56785583496094 0 235.1322784423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8630027274201292 0.31293546709435965 0.9711432255798932 }
radiance 30
center 103.84556579589844 0 241.80633544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3827729774610357 0.5667117863177953 }
radiance 26
center 28.791200637817383 0 255.88226318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49322002247332586 0.4027409867010281 }
radiance 20
center 101.96312713623047 0 207.8900604248047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8962958867609849 0.4922781344705271 0.8277268241934556 }
radiance 28
center 37.053890228271484 0 218.61143493652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412066327147627 0.4431712591673688 0.9272559380906015 }
radiance 25
center 30.179006576538086 0 221.72186279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6313401838955084 0.4987439090490645 0.9 }
radiance 25
center 66.76771545410156 0 213.33116149902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8136885654561725 0.460412875100066 0.8368136561383457 }
radiance 25
center 80.19110107421875 0 244.8310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9666144948900564 0.3421817427638502 0.8894063074245899 }
radiance 22
center 80.8246841430664 0 233.555419921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8121160097536123 0.3471906762058253 0.8862758454034498 }
radiance 29
center 83.65503692626953 0 203.89279174804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9726938522502593 0.3267976979167067 0.9213113413028721 }
radiance 31
center 93.10916137695312 0 244.674072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8639628630955013 0.44463819637934376 0.9831973906587705 }
radiance 20
center 91.28670501708984 0 229.2041473388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7004753198848107 0.30996583014157114 0.9 }
radiance 26
center 69.52561950683594 0 248.62123107910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9502202036303751 0.31556231345380376 0.9119521531584763 }
radiance 23
center 41.08537673950195 0 214.20909118652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8300846340997964 0.43810875752531964 0.93079743625645 }
radiance 19
center 73.19246673583984 0 216.6643524169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8027277261848074 0.4968390811324496 0.9453966441057194 }
radiance 18
center 95.28726196289062 0 238.3121337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.340366258909593 0.8367759155704906 }
radiance 21
center 11.563504219055176 0 210.83131408691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5436008147983764 0.3452746451130074 0.9 }
radiance 19
center 57.62436294555664 0 197.2893829345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8314389755202884 0.4144440303709277 0.8349419415798085 }
radiance 19
center 61.622657775878906 0 226.94212341308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9583137537956555 0.37174703241720464 0.9196344770459284 }
radiance 25
center 59.77169418334961 0 190.31271362304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45848699657568104 0.6586658465231039 }
radiance 31
center 9.879435539245605 0 239.814453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.998253881948518 0.30893508766674543 0.9298551198609518 }
radiance 22
center 15.38258171081543 0 232.5529022216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8002829214246455 0.4379648766383184 0.8478450413214264 }
radiance 27
center 57.669795989990234 0 237.69491577148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.915982893534014 0.45116863789191464 0.8366571898657514 }
radiance 28
center 65.91729736328125 0 192.16407775878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9624805430997136 0.31767286518911825 0.9165559247921462 }
radiance 26
center 27.58036231994629 0 263.44549560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8536431888305291 0.36605839846286903 0.9 }
radiance 21
center 11.570981979370117 0 193.41073608398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6142131310459537 0.4275127649208069 0.9 }
radiance 26
center 19.524335861206055 0 229.22491455078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49833880645473316 0.44954076074440896 }
radiance 16
center 76.20335388183594 0 257.40771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47710456317821137 0.3329437510560844 0.9 }
radiance 30
center 53.95033264160156 0 215.25289916992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9982648458189184 0.32591200612979354 0.9617659278316883 }
radiance 16
center 19.42108726501465 0 193.71250915527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.910010010693006 0.4258687349376533 0.9200678945448529 }
radiance 21
center 21.203166961669922 0 227.36293029785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8929266466717733 0.3766088359242844 0.9310573511104879 }
radiance 29
center 20.891279220581055 0 237.7630615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8251236354655102 0.35818665775327313 0.9592844108327528 }
radiance 16
center 29.576133728027344 0 255.44358825683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.953921861724674 0.47165535562516425 0.9297611580594326 }
radiance 29
center 75.61378479003906 0 260.91815185546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30661185254021056 0.7072362787701453 }
radiance 24
center 45.50496292114258 0 186.1495819091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8662946636588608 0.4078243663110772 0.8351647374855163 }
radiance 28
center 93.59259033203125 0 247.80694580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43821423168123586 0.3412707122608786 0.9 }
radiance 29
center 44.09581756591797 0 207.6619415283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6078935810154564 0.47023062590003595 0.9 }
radiance 29
center 62.930076599121094 0 192.4436492919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4802408493105731 0.39984664173233786 0.9 }
radiance 31
center -4.613155841827393 0 224.45091247558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4275418473186501 0.5143077933712733 }
radiance 18
center 25.48581314086914 0 235.45022583007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992343316101384 0.4960716328757031 0.872959844094911 }
radiance 18
center 52.24627685546875 0 189.58624267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9804972566024635 0.3481267354391511 0.9247808030719061 }
radiance 26
center -5.372360706329346 0 259.75970458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4507185124802585 0.6054012350555622 }
radiance 18
center 38.76011276245117 0 240.68394470214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9769406342297398 0.35510297344950187 0.9924498664059931 }
radiance 23
center 19.537925720214844 0 215.61788940429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9189062281775288 0.44699550245292197 0.8153997908380614 }
radiance 24
center 14.118352890014648 0 239.47543334960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8060749852610545 0.4976088231903446 0.8223560538157921 }
radiance 30
center 65.60530853271484 0 253.4865264892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9410269249371036 0.4501292516954429 0.8554846357783144 }
radiance 20
center 51.152252197265625 0 233.986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9953762975578929 0.3775715237196888 0.9705595090752552 }
radiance 29
center 39.76154708862305 0 239.3367156982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9269761088959866 0.46915926370225786 0.9856100577745368 }
radiance 24
center 25.816349029541016 0 245.68203735351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9363647967393323 0.48747757943788705 0.9001158179186963 }
radiance 29
center 19.992225646972656 0 237.0787353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8718997699439975 0.464970952103235 0.8845773678918416 }
radiance 20
center 51.00857162475586 0 269.822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8102328146373456 0.36977697443753244 0.9645831951955679 }
radiance 18
center 15.089577674865723 0 244.31292724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.48862004399646064 0.3475710126080222 0.9 }
radiance 22
center 67.46424865722656 0 189.49237060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9389651025954344 0.43384425955097294 0.8969343777216131 }
radiance 24
center -0.9502872824668884 0 264.2284851074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9351183190937338 0.46648975488193506 0.9112975693623617 }
radiance 28
center 70.41156768798828 0 188.25050354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8303303833356163 0.4503617750605218 0.9686608374884293 }
radiance 31
center 28.65285301208496 0 245.67897033691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4473093961139787 0.8629787749761884 }
radiance 25
center 27.491798400878906 0 257.07232666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411354436537933 0.4900232989625165 0.9 }
radiance 29
center 27.61858558654785 0 242.45823669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308939248992357 0.4622628708507954 0.8365927122895223 }
radiance 30
center 44.567283630371094 0 243.73031616210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8062045345339542 0.4658412193604282 0.8643937253839353 }
radiance 16
center 15.273157119750977 0 221.36683654785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9893595599323048 0.4787257359362119 0.8919020289923818 }
radiance 21
center 55.12331771850586 0 259.0860900878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9294625217970058 0.49580677392245565 0.9674930935926955 }
radiance 17
center 5.11799955368042 0 218.28616333007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8188698380759315 0.38141050073061517 0.8981576193294573 }
radiance 18
center 14.256501197814941 0 269.28924560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9194599943634811 0.33728867438971255 0.8106359819322005 }
radiance 30
center 45.04238510131836 0 238.217529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8947692841268617 0.31122479879061427 0.827364839939706 }
radiance 30
center 50.01240539550781 0 209.7845458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9338854614687162 0.34753080936542574 0.9421504228555695 }
radiance 27
center 3.5511138439178467 0 230.60348510742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9909243700855564 0.3506713768678318 0.9022893015652457 }
radiance 25
center 32.287269592285156 0 195.64804077148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8241776411943095 0.4751136004998295 0.8732556493825807 }
radiance 24
center 55.39643096923828 0 247.5065155029297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8579564167264195 0.34268977675423745 0.9 }
radiance 26
center 46.84824752807617 0 203.20664978027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9984325014803325 0.46656902048847604 0.9151939775936984 }
radiance 26
center 57.292327880859375 0 224.3804931640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9406744033817174 0.316497780588917 0.8871015323400305 }
radiance 25
center 33.80556869506836 0 250.94691467285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9873678653666336 0.3997026625068274 0.9026829205422379 }
radiance 17
center -14.151620864868164 0 251.4578094482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9877894844763038 0.37060246519844753 0.8667130635792304 }
radiance 28
center 3.3805837631225586 0 267.12078857421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99207729724005 0.3820537303905326 0.8469049611808028 }
radiance 26
center -1.1088893413543701 0 207.98895263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9797677374078083 0.3249524109431729 0.967169800521432 }
radiance 22
center 57.287559509277344 0 199.85267639160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38415947273633777 0.6205547082606042 }
radiance 20
center 30.949758529663086 0 256.6863098144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6760800333014882 0.45098988869200907 0.9 }
radiance 20
center -19.424463272094727 0 262.6275939941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5036338990675157 0.3877212279605251 0.9 }
radiance 29
center -15.549193382263184 0 247.22142028808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9559054019611206 0.3258841404161744 0.8304699357491027 }
radiance 31
center 17.873851776123047 0 189.28802490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8049615793854332 0.43429959188068856 0.9466600813476532 }
radiance 25
center -14.575222969055176 0 251.1502685546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9166306156785528 0.3363095298316373 0.8115331777220705 }
radiance 18
center 43.500396728515625 0 189.03814697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8425207673107611 0.4615926805625822 0.9393774301291005 }
radiance 27
center 16.615955352783203 0 233.24781799316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8043838294539815 0.4030199020520211 0.8119600155802746 }
radiance 31
center -26.523557662963867 0 230.71405029296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9258702395161922 0.3329263597706343 0.856082481574857 }
radiance 30
center 28.932771682739258 0 215.48855590820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9341917868912191 0.39424965189947553 0.9776073342739554 }
radiance 27
center 13.669565200805664 0 191.06484985351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9016082063267431 0.3976480083674848 0.9798161763153831 }
radiance 20
center -10.066791534423828 0 206.01878356933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8280204258008558 0.35825013426940705 0.801710793464316 }
radiance 28
center 19.955289840698242 0 242.4631805419922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.801699912651929 0.48368448712919143 0.8864495883431885 }
radiance 17
center 3.7064855098724365 0 191.32704162597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3208041851554973 0.4856266028410654 }
radiance 22
center 36.9595947265625 0 231.30931091308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7176887823302607 0.4635955062293972 0.9 }
radiance 20
center 27.81361961364746 0 251.0860137939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6487195748773813 0.4519485931653534 0.9 }
radiance 29
center -1.1179040670394897 0 266.0680847167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9691767537406493 0.47395306473810017 0.9665053352398771 }
radiance 29
center 3.479802370071411 0 196.92445373535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8839084383196623 0.42566293492303253 0.8926561181334862 }
radiance 26
center 7.21373987197876 0 191.82223510742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4148398580719849 0.7161082836478109 }
radiance 29
center -11.008886337280273 0 263.4755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8365824921642222 0.35096312394830936 0.9266198978353728 }
radiance 29
center 38.51148223876953 0 265.74822998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9553612516858999 0.46306121824556357 0.9478208697910901 }
radiance 24
center -16.143449783325195 0 245.3037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8827109800414213 0.3001187664231175 0.8816841647451308 }
radiance 29
center 2.087921142578125 0 203.6893310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8763789935083737 0.43417347811160345 0.8340694340508652 }
radiance 28
center -27.3262996673584 0 265.141845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8181399883459071 0.47370283308556815 0.9 }
radiance 19
center 9.795169830322266 0 261.5498962402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8598552734425601 0.4888386207087122 0.8505061249756394 }
radiance 22
center 16.920690536499023 0 202.5252227783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9955974731496029 0.3707771909243891 0.8384250682672221 }
radiance 26
center -25.322620391845703 0 224.8642120361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4276246054049234 0.3294392537125938 0.9 }
radiance 16
center -5.70427131652832 0 244.59762573242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4629671796268017 0.4321526656527055 }
radiance 27
center 23.42893409729004 0 244.33726501464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9543104872750133 0.3701901759449123 0.9460425877464953 }
radiance 25
center -39.890445709228516 0 217.29441833496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.556738983282834 0.4618693882031333 0.9 }
radiance 22
center 1.0669758319854736 0 228.235595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9351388511651337 0.45153829203664586 0.8247454749085986 }
radiance 18
center -7.619442462921143 0 239.4945068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5284298689697543 0.36746783440050446 0.9 }
radiance 17
center -47.78929138183594 0 192.8185272216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8258629527633226 0.4089445996721748 0.98103820123507 }
radiance 26
center -35.21553039550781 0 266.031982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8386090201878691 0.46990281054848015 0.8722211972842028 }
radiance 26
center 15.4854154586792 0 203.12757873535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6252117495532368 0.4541491455312936 0.9 }
radiance 29
center -6.037314414978027 0 226.4869384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8071741463103781 0.48121308899064225 0.8687771279921852 }
radiance 19
center -45.48453140258789 0 241.4661865234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4173279079763509 0.48265568255284663 }
radiance 20
center 14.768773078918457 0 231.986572265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9669465432227798 0.33482419615600734 0.8707745314231781 }
radiance 19
center 5.832478046417236 0 249.53590393066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3895737749861875 0.472789634585721 }
radiance 22
center 29.510406494140625 0 218.9154510498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9082159177463734 0.40131970438988784 0.9624556807725173 }
radiance 27
center 20.09294319152832 0 256.28826904296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5255622044966989 0.48468667327350556 0.9 }
radiance 27
center 18.248226165771484 0 261.8166198730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3504700678069096 0.723720057392328 }
radiance 26
center -29.546878814697266 0 229.88113403320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8560084622104603 0.3569828956960824 0.8366159064067419 }
radiance 28
center 13.383201599121094 0 239.97799682617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6383570938631192 0.4629028300718713 0.9 }
radiance 27
center -31.683210372924805 0 253.97705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9675467756762375 0.43012044938540084 0.918468481938456 }
radiance 22
center -27.78008270263672 0 248.75650024414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9939317626396893 0.4850455968774025 0.9955702306209782 }
radiance 24
center 7.467683792114258 0 196.40545654296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9636532111367863 0.3443819747624591 0.9449487005766595 }
radiance 18
center -67.57329559326172 0 204.22608947753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8287548223622901 0.47680912499383565 0.8870421301893695 }
radiance 30
center -39.786231994628906 0 226.26211547851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8730271774649858 0.4862686109791609 0.9493627355278781 }
radiance 17
center -33.31367874145508 0 209.630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.915206202964606 0.3856350694620045 0.9205627978894928 }
radiance 20
center -20.0925235748291 0 234.79661560058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8702905599706477 0.42778873781235327 0.893808301015585 }
radiance 28
center -48.860374450683594 0 204.239501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9008776179094039 0.41212192995951974 0.8899751327739381 }
radiance 20
center -1.4777748584747314 0 233.96292114257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3864733758904497 0.6580958642490932 }
radiance 25
center 7.047203540802002 0 187.32835388183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4629176507475469 0.6797706270176679 }
radiance 21
center -53.65412521362305 0 194.4077911376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49569107187619543 0.48701812333601024 }
radiance 27
center 2.7402803897857666 0 228.39744567871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9760578110806658 0.33709584068964654 0.9181057741539564 }
radiance 28
center 3.607091188430786 0 251.6998748779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3479111424581803 0.8647621885445682 }
radiance 17
center -27.13223648071289 0 215.9424285888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9213306517526734 0.3422377117729326 0.9640893546495863 }
radiance 17
center -54.953243255615234 0 204.1125030517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.916814998910538 0.3674617440198815 0.9097494169652404 }
radiance 21
center 11.26245403289795 0 194.35873413085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3641824660582862 0.4233268712584277 }
radiance 23
center -48.1181640625 0 263.845947265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8146804961911801 0.31908855945590314 0.8206415191561817 }
radiance 29
center -55.10226821899414 0 217.7809295654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8219752645657059 0.34846670857958834 0.9121102592901074 }
radiance 29
center -51.26833724975586 0 253.97848510742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8547331453791671 0.34278818365152125 0.9388376414349624 }
radiance 23
center -20.439924240112305 0 186.55331420898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8151814992306992 0.34348884666417845 0.8292496683084325 }
radiance 27
center -14.6098051071167 0 195.42813110351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46097220244362797 0.47420857523002247 }
radiance 19
center -21.746837615966797 0 225.1239013671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9261582199445493 0.4104764270845872 0.922947780646249 }
radiance 26
center -29.890127182006836 0 232.31239318847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9257468378027145 0.341990106949371 0.8888554741692569 }
radiance 29
center -11.954429626464844 0 242.5184783935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9996360365536435 0.4180365408961323 0.8408620623678951 }
radiance 26
center -11.631552696228027 0 238.34463500976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9756337898512074 0.3702355899077333 0.9549894405021074 }
radiance 27
center -33.41912078857422 0 217.00511169433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9180524832099914 0.4571487916915592 0.8068062238725957 }
radiance 26
center -83.13973236083984 0 257.4629821777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9215529820779208 0.41131783545542094 0.9239041610798621 }
radiance 27
center -71.80635070800781 0 203.35560607910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9329033559991207 0.3810698122032545 0.9645065053221062 }
radiance 16
center -81.75140380859375 0 225.4573516845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7722899544847415 0.3792258394060075 0.9 }
radiance 25
center -51.00841522216797 0 190.77114868164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8221461963600468 0.3621285093945763 0.9996641888507909 }
radiance 25
center -60.33922576904297 0 238.11392211914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.908901912113235 0.33537692971436806 0.9981756060902474 }
radiance 31
center -47.92152404785156 0 246.39547729492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9775879835524464 0.4263519841745196 0.8366755614005922 }
radiance 20
center -76.72685241699219 0 192.65550231933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8148726002928519 0.45445796751648715 0.8602455950918322 }
radiance 26
center -15.736857414245605 0 209.37625122070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9655151567523971 0.41511030685021677 0.8495920777687536 }
radiance 19
center -12.884706497192383 0 214.83221435546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9953376766476505 0.3711363164925618 0.8753083233501817 }
radiance 26
center -72.5987319946289 0 251.01939392089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3938164760761481 0.7728142288680703 }
radiance 31
center -26.516332626342773 0 245.43411254882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8193900768443826 0.39391092271662587 0.8430817415723815 }
radiance 20
center -2.3128550052642822 0 255.5255584716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9643278314284428 0.36368663020604874 0.8219161477635002 }
radiance 28
center -77.54157257080078 0 216.27369689941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30101444890724666 0.6587082170661841 }
radiance 21
center -62.4364013671875 0 259.07452392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9529024125948997 0.3212799578146156 0.9969575674805027 }
radiance 28
center -88.42668151855469 0 242.1990203857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36675856365454085 0.47384221259537185 }
radiance 20
center -89.7848129272461 0 185.0629119873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9804092393129172 0.35042449153572786 0.8826107714924263 }
radiance 29
center -25.0403995513916 0 194.04989624023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8743633645673319 0.4140241356432284 0.8140011637131406 }
radiance 26
center -76.94042205810547 0 248.29942321777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8102925560643086 0.34958169588826343 0.9225134275083091 }
radiance 26
center -43.30546951293945 0 245.88307189941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9060360446663577 0.4458748047601728 0.8048774907749704 }
radiance 21
center -19.027015686035156 0 226.14370727539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9484512045160536 0.47629070820248715 0.8345480914323793 }
radiance 30
center -21.810405731201172 0 182.6236572265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9932392182497068 0.37252085269794644 0.949699602059418 }
radiance 16
center -78.15154266357422 0 182.7954864501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.701849667710386 0.30035691457085 0.9 }
radiance 26
center -37.38263702392578 0 194.7012939453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8875761705631471 0.47036926710688687 0.8543931622444548 }
radiance 25
center -83.71659088134766 0 255.53118896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8826923123486952 0.3645099634356702 0.971603105771882 }
radiance 19
center -19.078155517578125 0 184.78599548339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6099912674388877 0.392196872331701 0.9 }
radiance 19
center -67.30838012695312 0 182.81455993652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8104692907534654 0.3765586507523786 0.9457919208683634 }
radiance 27
center -19.027132034301758 0 189.83627319335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7942206935382544 0.3922859535719445 0.9 }
radiance 16
center -94.58084869384766 0 253.6610565185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9572708935294514 0.4386613175631104 0.8050683765641278 }
radiance 23
center -96.58113098144531 0 198.46234130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892081849907069 0.4535515414708684 0.9448150074998989 }
radiance 18
center -66.92023468017578 0 212.97552490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6767860401185617 0.46446712156571357 0.9 }
radiance 30
center -95.87342071533203 0 219.19464111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9086540625148233 0.4285513112352921 0.8649745515897129 }
radiance 25
center -27.758852005004883 0 218.77537536621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4471383756685664 0.8618781277743165 }
radiance 30
center -45.550235748291016 0 258.33746337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8803443687499333 0.4672893191623295 0.8893411641960922 }
radiance 31
center -61.6776237487793 0 220.72964477539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8621156982564566 0.3817180582900127 0.8312310203869604 }
radiance 16
center -64.73295593261719 0 254.35049438476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9271984331723312 0.42916537806192934 0.8678869165803494 }
radiance 20
center -106.67705535888672 0 251.8440399169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3474010375577831 0.49439227993132906 }
radiance 20
center -101.87886047363281 0 227.6454315185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9023084319039038 0.36256854764458696 0.8866195171006817 }
radiance 25
center -55.29743576049805 0 252.34716796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8102585700400791 0.34239824828180243 0.9684459876439963 }
radiance 30
center -84.11604309082031 0 239.60662841796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9293449386116468 0.49480717008030184 0.9990705825438726 }
radiance 16
center -38.038116455078125 0 245.71878051757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.371811520019641 0.8850575023040821 }
radiance 21
center -81.8250503540039 0 200.484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3097975604046313 0.8148300701452639 }
radiance 22
center -46.838382720947266 0 177.66909790039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47750920946883424 0.44140566257750397 0.9 }
radiance 29
center -66.79615020751953 0 248.31748962402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.891069938255849 0.4143381970392256 0.9 }
radiance 26
center -45.96533203125 0 219.63717651367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4236281073958148 0.6301905709884209 }
radiance 24
center -41.71586990356445 0 198.7013702392578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5906646381692228 0.4468202130050409 0.9 }
radiance 23
center -81.66085052490234 0 196.48728942871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9877080224423487 0.4984203235047956 0.8206498129105269 }
radiance 27
center -81.39100646972656 0 219.0839385986328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8531822172091885 0.45579952295027903 0.8077969440905608 }
radiance 24
center -90.10541534423828 0 190.76248168945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45559789392276107 0.48477517711859575 0.9 }
radiance 18
center -78.33991241455078 0 191.1917266845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8853970903420916 0.40344055177665716 0.8294718490402992 }
}
