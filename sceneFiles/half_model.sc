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
color { "sRGB nonlinear" 0.9129097768938074 0.48364146970329536 0.8523283670134745 }
radiance 26
center 495.51361083984375 0 35.189422607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7196494259053673 0.38849197492632825 0.9 }
radiance 19
center 496.0916442871094 0 17.664888381958008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8739816920566558 0.395577415322951 0.8172204282694443 }
radiance 17
center 443.356201171875 0 92.95746612548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8090743296381488 0.4596371684673951 0.9460409414287814 }
radiance 16
center 464.02349853515625 0 48.740257263183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.628814468709635 0.30121215095095777 0.9 }
radiance 16
center 387.1302185058594 0 97.44780731201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9432414257426438 0.38167954231394974 0.929379938176693 }
radiance 19
center 442.7320861816406 0 7.772178649902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9610821913028083 0.3052600762766667 0.9326970233421104 }
radiance 16
center 411.9922790527344 0 34.42012405395508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9255942793520887 0.3244758601015191 0.9536771348687292 }
radiance 23
center 365.8827209472656 0 5.0692243576049805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8870322197433347 0.3441487309280791 0.9 }
radiance 21
center 405.8682556152344 0 33.99991989135742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9708819440949774 0.3330052275454461 0.965977228229752 }
radiance 28
center 388.74755859375 0 44.465576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7047973777403449 0.34275185704617894 0.9 }
radiance 31
center 368.9573974609375 0 137.62631225585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8966513023308718 0.4701389441307797 0.8397051918090928 }
radiance 24
center 364.9758605957031 0 141.23764038085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.95077479869294 0.3320610922783962 0.8493137546114589 }
radiance 16
center 472.9857177734375 0 106.78368377685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8606286379265713 0.3963689668225606 0.9714635444157471 }
radiance 30
center 395.9853515625 0 136.34259033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9496893916148639 0.3372793864505136 0.8187649007533646 }
radiance 21
center 480.3104248046875 0 51.20647048950195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.74491692395555 0.34660509945189943 0.9 }
radiance 21
center 415.7734375 0 112.84672546386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9803345457157998 0.4544413451730953 0.918851213632059 }
radiance 29
center 438.88958740234375 0 86.44198608398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.696550461024031 0.4373149857230143 0.9 }
radiance 21
center 389.1135559082031 0 83.90799713134766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3104545979571192 0.558312066605413 }
radiance 25
center 420.6211853027344 0 124.27811431884766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7823014187163768 0.44676484296121205 0.9 }
radiance 16
center 353.99102783203125 0 64.99799346923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3556177068029401 0.8937411143650005 }
radiance 28
center 345.63153076171875 0 187.65211486816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9819217370405161 0.3556641161267356 0.8433180826235944 }
radiance 25
center 402.33221435546875 0 88.05902099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9391022897882336 0.454353320026857 0.8636782222943535 }
radiance 16
center 361.5965576171875 0 169.96865844726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5569955111778435 0.422880771630311 0.9 }
radiance 28
center 434.8112487792969 0 204.79800415039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8153137136046574 0.4929808125352949 0.9973918429906028 }
radiance 28
center 354.44696044921875 0 173.78060913085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44747013134527025 0.441629268189878 }
radiance 17
center 357.6307678222656 0 142.26722717285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3010905103773624 0.5752316802960517 }
radiance 21
center 457.5859375 0 115.75191497802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9181429976404737 0.360860148578672 0.9103924219052894 }
radiance 29
center 380.0810241699219 0 196.90206909179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9207695696909362 0.36264820630717043 0.8386070605311038 }
radiance 17
center 335.9810485839844 0 118.23008728027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4346489375696543 0.6520595320172977 }
radiance 20
center 399.353271484375 0 212.82528686523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9566695263350032 0.46589831340841437 0.8111952544809058 }
radiance 23
center 359.599853515625 0 230.64697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9571924580209613 0.30561981358234136 0.8726232736086345 }
radiance 25
center 423.0563049316406 0 124.3575668334961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8154150071726317 0.30448258489993124 0.9789791357919192 }
radiance 29
center 440.8464050292969 0 136.83900451660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8347387023587485 0.47659287361062486 0.9574735066465009 }
radiance 29
center 347.0359191894531 0 193.05821228027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9464312746797795 0.4574964890227775 0.9430689667592561 }
radiance 18
center 401.6167907714844 0 240.92257690429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4331642945529132 0.581948998993039 }
radiance 17
center 338.4430847167969 0 144.5555877685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3135421349555128 0.4885266753342029 }
radiance 22
center 415.09893798828125 0 184.87643432617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8602538016985776 0.4652950789643041 0.8701735562365377 }
radiance 22
center 368.4378662109375 0 236.76840209960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9023821263338617 0.37675456031012355 0.9922484622900146 }
radiance 29
center 424.2792053222656 0 177.9473876953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9535463596280809 0.447584165028003 0.9622097185397303 }
radiance 24
center 397.5945739746094 0 185.70729064941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8689309369326249 0.39934741564910736 0.9 }
radiance 31
center 364.0868835449219 0 207.03872680664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9298033871702347 0.4231005795994094 0.8601194956450011 }
radiance 31
center 400.7251892089844 0 256.0885314941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9378249625206789 0.36216920127655944 0.9349500672232879 }
radiance 18
center 370.96661376953125 0 173.0838165283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49383280973601207 0.4695177930902028 }
radiance 22
center 387.00250244140625 0 191.51991271972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8625763228710304 0.3259488914296507 0.9380498857404501 }
radiance 29
center 413.1744384765625 0 283.10723876953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.885067537749791 0.42744823439241525 0.9363869073388952 }
radiance 30
center 377.2614440917969 0 293.375732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8497071181636765 0.4112679752372653 0.9280435692358587 }
radiance 26
center 328.5333557128906 0 224.42127990722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4983675787996683 0.47288878797275924 0.9 }
radiance 31
center 374.9891357421875 0 187.4496612548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8182428906849979 0.4161168072420769 0.9288633131100774 }
radiance 28
center 292.16845703125 0 201.71006774902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3712426721497758 0.6953755870735393 }
radiance 19
center 384.87005615234375 0 187.37982177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9978105624946465 0.3553918911624978 0.8724570639939846 }
radiance 19
center 317.24993896484375 0 290.3168029785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8592471250943198 0.35340333237109095 0.9 }
radiance 18
center 366.55029296875 0 238.47787475585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9096053768187286 0.38081955453742766 0.9415976740991849 }
radiance 20
center 272.2289733886719 0 253.75164794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8177215268491325 0.38538260495273946 0.9596676911634152 }
radiance 21
center 375.4527587890625 0 232.63990783691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9083664205546789 0.44153027894572805 0.8152497523322755 }
radiance 22
center 336.7355651855469 0 316.6844787597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.981975941476493 0.3488242826166696 0.8073790616123533 }
radiance 21
center 319.2384338378906 0 334.12451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9961321356178253 0.3423037872113741 0.9000232045599942 }
radiance 27
center 363.01947021484375 0 254.75331115722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9281408023938835 0.45063084982112284 0.8615014273735783 }
radiance 19
center 309.329345703125 0 303.4811096191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9749952067017891 0.47506351367752797 0.8235469484985282 }
radiance 22
center 271.05535888671875 0 255.79290771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8968162227552524 0.3734015945212864 0.8927067914503704 }
radiance 28
center 370.4621276855469 0 297.6301574707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9027272612966653 0.36883532955089143 0.9159183085609319 }
radiance 20
center 341.98193359375 0 274.6358337402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45540395095977604 0.47518758054041166 }
radiance 19
center 304.7961120605469 0 245.87188720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9776610180702678 0.3911225292612567 0.8053503864615694 }
radiance 20
center 261.5265197753906 0 303.9998474121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9648355486484104 0.3354355807886115 0.8482856942246576 }
radiance 28
center 338.4584655761719 0 341.7568054199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4310227558472327 0.5619457681795588 }
radiance 27
center 261.22015380859375 0 293.5223388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8885771509934 0.3230708911436154 0.8163564825540225 }
radiance 21
center 251.6130828857422 0 261.56658935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9647338313979448 0.3357118828368171 0.8516156685355126 }
radiance 21
center 297.13372802734375 0 321.37921142578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9746798819628401 0.30846516116189343 0.850324412652277 }
radiance 24
center 274.1379089355469 0 328.4141540527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9122273830382344 0.4277995229390703 0.9875709501771373 }
radiance 25
center 331.030029296875 0 346.5211486816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9599387371561519 0.3145793212058375 0.8270977564664352 }
radiance 27
center 269.2699279785156 0 255.09947204589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8663138363905261 0.3027048667835105 0.8114080160641154 }
radiance 25
center 261.5855712890625 0 289.0133056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9181375957147582 0.4287852818430884 0.9993107810953349 }
radiance 30
center 310.4579772949219 0 329.6199645996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7776989638080208 0.49147454363810716 0.9 }
radiance 19
center 272.03125 0 360.17047119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9315090780647994 0.45070274396826016 0.8341479515762975 }
radiance 19
center 216.545654296875 0 376.40081787109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8692997738512998 0.42201387328953677 0.8348772722144906 }
radiance 17
center 300.83880615234375 0 301.9757385253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8760358197567867 0.4715211282476821 0.8454547942325965 }
radiance 30
center 247.7635955810547 0 287.9248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.706162555023014 0.3126724924113366 0.9 }
radiance 21
center 289.84185791015625 0 273.4143981933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9626628605225821 0.4017385903005727 0.9905206134480057 }
radiance 30
center 204.08457946777344 0 312.9888916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4091031693566398 0.521456170530169 }
radiance 30
center 207.1641082763672 0 381.9393310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9699927963169563 0.47815283779220097 0.9218259498640343 }
radiance 16
center 238.8514404296875 0 348.23358154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9168127072977559 0.37412373608624705 0.8166703326722368 }
radiance 28
center 249.60494995117188 0 335.3726806640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9932479035802098 0.4229656178653872 0.9397845399981245 }
radiance 30
center 160.75144958496094 0 343.90045166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9417644663673554 0.3201152785072713 0.9467020367500483 }
radiance 16
center 246.95663452148438 0 317.446044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38438876976894937 0.5472124095993588 }
radiance 29
center 201.6415252685547 0 350.84674072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8323436812791525 0.42011719054016694 0.9452747380892924 }
radiance 29
center 214.79953002929688 0 312.27410888671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5975251087362207 0.39387867120444253 0.9 }
radiance 20
center 197.9790496826172 0 376.9528503417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9719374654982939 0.36029563407497683 0.9454821309598237 }
radiance 29
center 154.47691345214844 0 336.0680236816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9284295062480001 0.31425947410559757 0.8283168943799077 }
radiance 17
center 175.86875915527344 0 322.6298522949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4974989392086039 0.6554803203555553 }
radiance 20
center 225.06292724609375 0 317.0079040527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206307690752106 0.4542783639506427 0.8064354942722067 }
radiance 26
center 202.14535522460938 0 310.1895446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8277794306721102 0.44247403482461545 0.8128628637712947 }
radiance 28
center 208.93099975585938 0 324.7008056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9761897954325842 0.4007408363045959 0.8005140690944004 }
radiance 20
center 113.7311782836914 0 320.3387756347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.989868406014545 0.454390363061729 0.8486849443338695 }
radiance 25
center 176.04238891601562 0 388.2403259277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8933065693238915 0.3668897603279241 0.8753678442900913 }
radiance 18
center 149.17445373535156 0 355.36669921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9307178958783836 0.39800646524194583 0.8359131968174203 }
radiance 24
center 196.80322265625 0 340.6165466308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9567306705626896 0.484596309766655 0.9389968293091726 }
radiance 23
center 122.07386016845703 0 358.8458557128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5256310414214557 0.45397358378271896 0.9 }
radiance 31
center 116.98961639404297 0 312.11181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4986581075977049 0.6785513719733479 }
radiance 31
center 141.95272827148438 0 343.2688293457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8276312448705363 0.48143366006370225 0.8709025424466086 }
radiance 22
center 146.90797424316406 0 398.0020446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8156176248167494 0.3783606680377758 0.839289733521317 }
radiance 17
center 197.7753143310547 0 364.030517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8640749228262983 0.46401875082702115 0.9331535650157431 }
radiance 26
center 79.47917938232422 0 325.8453674316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8697744773261937 0.466261736760051 0.9542880089728054 }
radiance 25
center 69.98995971679688 0 392.94171142578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8857402049757991 0.3620572229893706 0.8876414135093212 }
radiance 17
center 114.89612579345703 0 342.14825439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9382290219207374 0.3317135529371729 0.8703237264261632 }
radiance 23
center 158.8357391357422 0 351.17620849609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8637972058057819 0.31180872389791076 0.9765996246282328 }
radiance 27
center 91.78430938720703 0 412.6134033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5490466778933598 0.33365398754424314 0.9 }
radiance 25
center 65.71873474121094 0 415.5303039550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9110561597215027 0.3048483956719397 0.8424689354802708 }
radiance 18
center 149.50503540039062 0 355.0121765136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3569219474073488 0.8456989130555288 }
radiance 27
center 94.8748779296875 0 389.5241394042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8964794947554136 0.4342200593789052 0.9572015729338472 }
radiance 22
center 106.33732604980469 0 416.00982666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9050932612297691 0.49306360436109087 0.8419396700592673 }
radiance 19
center 62.531593322753906 0 316.7680969238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.912385374293625 0.37918198728818864 0.9306574799098595 }
radiance 26
center 36.12991714477539 0 388.656982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.938891197135011 0.31088799844229387 0.9817510741327947 }
radiance 19
center 104.49358367919922 0 400.19512939453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8878676609852842 0.3359898742543378 0.9569566241165166 }
radiance 19
center 79.37547302246094 0 383.10888671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8317479610519587 0.375209201507644 0.9048960308614288 }
radiance 25
center 105.76539611816406 0 343.942138671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9045806531274128 0.3107865306371516 0.8890571131295013 }
radiance 28
center 47.24477005004883 0 323.6672058105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9736687602481688 0.46784227373156173 0.9775049904717333 }
radiance 16
center 11.808671951293945 0 412.20556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7807272676937889 0.43316525184302945 0.9 }
radiance 26
center 81.59184265136719 0 379.77764892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8628607214254749 0.4707713318672899 0.9165370935992357 }
radiance 16
center 108.54769134521484 0 390.0080261230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42536414825282587 0.6462393004310748 }
radiance 20
center 50.636314392089844 0 395.070556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8568425577970068 0.3544279676778208 0.9589788632326764 }
radiance 26
center 91.08894348144531 0 365.96441650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39391695968615925 0.8365697868033862 }
radiance 20
center 14.469793319702148 0 394.2706298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8962841571639928 0.3014836428064744 0.909580373470191 }
radiance 23
center 72.61885833740234 0 316.0298156738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9659260465421147 0.48083501547144913 0.9209697852155581 }
radiance 22
center 86.53231811523438 0 367.285888671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9612029772578684 0.379281350656871 0.8749084511572625 }
radiance 30
center 23.27536964416504 0 337.4446716308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4159498091691351 0.7711822402968106 }
radiance 25
center 82.79817199707031 0 353.84747314453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3421974222533411 0.5330689535564981 }
radiance 24
center 48.63373947143555 0 314.7657775878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3686639760223084 0.5830880648034484 }
radiance 31
center 29.224445343017578 0 405.5800476074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8408878091758661 0.4304281386959189 0.9161934892507154 }
radiance 29
center 68.83302307128906 0 372.5713195800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9012140067595222 0.38180114289375977 0.8353644439910439 }
radiance 29
center -29.43784523010254 0 371.23150634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8160037878818891 0.4541581601161965 0.8218904411183693 }
radiance 17
center 64.9922866821289 0 358.7915954589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9936822777952753 0.34980073310728976 0.9680338130240672 }
radiance 31
center -48.10216522216797 0 356.157958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8848121453586746 0.3298112936265115 0.9331801011359595 }
radiance 20
center 11.642547607421875 0 421.10211181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9252226803047998 0.39803047611084774 0.9256082832536645 }
radiance 25
center 41.17677688598633 0 355.16412353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8836155141334027 0.420943208282896 0.9348319651753438 }
radiance 28
center -13.208972930908203 0 309.5456848144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9803553259653106 0.3234549123690185 0.9826754052787727 }
radiance 17
center 24.59556770324707 0 364.1073913574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4659640772872683 0.5959985167756878 }
radiance 24
center 1.9451221227645874 0 385.6642150878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8111448654235851 0.43537036853003663 0.9063608638862528 }
radiance 28
center -75.95500183105469 0 308.0133972167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99054730298265 0.44378898452560034 0.9321555765100158 }
radiance 28
center -19.7147274017334 0 349.96954345703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.806899937102871 0.44205785903398775 0.8071265310614351 }
radiance 22
center -52.92863082885742 0 328.876708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9506417517652397 0.46689689797734646 0.9018001696646301 }
radiance 31
center -8.72724723815918 0 381.4718322753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412462711657386 0.3762532441807322 0.8825440949823071 }
radiance 18
center -25.890522003173828 0 383.0741271972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603042669976895 0.3595010363792304 0.9080185245958355 }
radiance 27
center -71.73322296142578 0 362.1836242675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8443159713624585 0.4957842410717842 0.8625684813808439 }
radiance 26
center 2.1384501457214355 0 407.22271728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8296172067403278 0.4590611724340885 0.8183992287076317 }
radiance 26
center -51.845130920410156 0 390.078857421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9477761448813128 0.36791434695368985 0.9266554814501642 }
radiance 22
center -1.3269739151000977 0 354.29339599609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9571239912056348 0.3414863310143774 0.8707782491957554 }
radiance 21
center -100.10924530029297 0 382.4414367675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47307004516013457 0.5589568793802973 }
radiance 16
center -68.37744903564453 0 385.6966857910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3794697626058241 0.7470809822455804 }
radiance 28
center -16.549457550048828 0 381.0887756347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8528365300330137 0.3886111748439437 0.9530392067262897 }
radiance 31
center -50.425262451171875 0 309.8681335449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9677766136800954 0.41381888199400474 0.8798131162887716 }
radiance 24
center -90.96855926513672 0 307.6002502441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38681101775099846 0.5794636863352248 }
radiance 28
center -37.29926300048828 0 355.35809326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47144726275150156 0.4458053386215517 }
radiance 30
center -100.4283447265625 0 357.12066650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8672274994561588 0.3572489861998776 0.9302266768564647 }
radiance 31
center -86.66339111328125 0 322.4421081542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9971444446116228 0.40687491358530903 0.987431940323909 }
radiance 18
center -37.70021057128906 0 389.5011291503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47118110772561217 0.71716398841583 }
radiance 17
center -128.49649047851562 0 307.4407043457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8893403589995917 0.45742084053891435 0.8807749978903983 }
radiance 25
center -89.7937240600586 0 290.148681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3128522098306128 0.48502733744940374 }
radiance 29
center -91.86802673339844 0 345.4013671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.916029833574704 0.325889277626484 0.8503403496092102 }
radiance 18
center -155.6719207763672 0 372.99212646484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8875068104385233 0.3919276898551915 0.8195406922007674 }
radiance 16
center -131.8831329345703 0 354.53375244140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8016699243010811 0.3980126216848532 0.9189294608720995 }
radiance 28
center -55.697837829589844 0 342.079833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108153938803351 0.4092107725703287 0.8502238692467984 }
radiance 18
center -84.17345428466797 0 278.7554626464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9885924044222553 0.4694651304090398 0.847528214542026 }
radiance 17
center -70.72454071044922 0 296.8510437011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36398722055883387 0.87000506732186 }
radiance 19
center -140.09835815429688 0 350.34246826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9674291266841778 0.42381065249190863 0.9602951286694045 }
radiance 22
center -169.0568084716797 0 292.8565368652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.954193613238486 0.35928794355809457 0.9550825893668895 }
radiance 28
center -159.15261840820312 0 298.3939514160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9138408599009132 0.42636177652338825 0.9957105860004056 }
radiance 28
center -132.21578979492188 0 318.7337951660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9842100585849661 0.35920437369970554 0.9572300588169101 }
radiance 23
center -108.29173278808594 0 262.242431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8139807249906499 0.3152241879415821 0.8494411063574708 }
radiance 27
center -132.50668334960938 0 291.8551025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4120173754734443 0.5893287396075786 }
radiance 16
center -156.3380126953125 0 313.733642578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8497406018660383 0.32209206641886295 0.9785230150551412 }
radiance 27
center -94.00804138183594 0 348.9371643066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9226897646569254 0.3329238345744529 0.8143524774958534 }
radiance 18
center -154.45960998535156 0 248.38882446289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9600927414517202 0.3967368981420679 0.9204902178501907 }
radiance 27
center -108.50104522705078 0 326.6648254394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9456289554788545 0.4607457513624393 0.8400706380265962 }
radiance 31
center -159.02896118164062 0 283.69769287109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9700111289233708 0.31564004760846404 0.9824227732380075 }
radiance 17
center -187.7856903076172 0 262.1974182128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8667677857296874 0.36207827328591297 0.8947708250112227 }
radiance 30
center -188.69345092773438 0 334.9799499511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8781424682625232 0.3077339465909564 0.8047050086436583 }
radiance 26
center -191.08465576171875 0 329.6831970214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8120117066295001 0.4594822867208017 0.9540803418549818 }
radiance 25
center -221.60183715820312 0 319.74102783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9043864752736336 0.3677975735025154 0.9886253862540252 }
radiance 16
center -119.91365051269531 0 281.5264892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36904961843793216 0.8774300189284273 }
radiance 19
center -169.86668395996094 0 266.0581970214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8794814806247019 0.3557335566010585 0.9186275167940928 }
radiance 18
center -178.9575653076172 0 263.5435791015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.897766812824182 0.34825486206156914 0.9526667595795294 }
radiance 25
center -202.35934448242188 0 241.22381591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9973653650739874 0.4277902673900279 0.8574666054850664 }
radiance 23
center -160.76625061035156 0 284.1023254394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8964886572747232 0.3189158910881523 0.8928482735106371 }
radiance 27
center -144.29991149902344 0 279.033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.969107958236867 0.36395170240558194 0.8293622662414215 }
radiance 19
center -134.87608337402344 0 296.1568298339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131684732143916 0.40029264927654284 0.8569216528999125 }
radiance 27
center -166.625244140625 0 222.51573181152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7773295712331638 0.3841683504235029 0.9 }
radiance 27
center -210.5969696044922 0 291.777099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9922537819624145 0.34057260654693544 0.8135075588739253 }
radiance 28
center -213.44467163085938 0 249.9982147216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3500986833995951 0.500362100521208 }
radiance 22
center -203.6885528564453 0 296.2710876464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9003868642363777 0.41635808298722676 0.9105646013530658 }
radiance 22
center -179.03094482421875 0 204.60841369628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42600771381607694 0.45195106942018337 }
radiance 31
center -216.19546508789062 0 296.7253112792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.670035548103014 0.423399743309248 0.9 }
radiance 21
center -227.44015502929688 0 282.59088134765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4290370496120305 0.5650942390108824 }
radiance 22
center -206.1275177001953 0 210.23965454101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4168169988665397 0.5318370975694047 }
radiance 26
center -177.0070037841797 0 247.44683837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46203285465270005 0.8406905772275675 }
radiance 30
center -167.11962890625 0 242.24075317382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39809082361084513 0.47355973687765973 }
radiance 26
center -184.89894104003906 0 274.70294189453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8461460507571207 0.34081285251328247 0.9 }
radiance 16
center -176.74227905273438 0 228.93360900878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9820762363956259 0.3067524383574047 0.8870149535491733 }
radiance 31
center -198.88294982910156 0 205.34048461914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9548218270790835 0.3745861112197315 0.9133029701310695 }
radiance 21
center -196.93484497070312 0 264.33270263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9138228214833126 0.3338030202218086 0.955744733814559 }
radiance 18
center -268.303466796875 0 213.4470977783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8241999387982805 0.39148276122919734 0.95380915562882 }
radiance 20
center -250.64781188964844 0 243.11181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9036335827520028 0.35424194217612354 0.9287951987552007 }
radiance 27
center -216.02882385253906 0 152.5226287841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.433153740402725 0.6357797473619143 }
radiance 18
center -231.05714416503906 0 165.94627380371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9827491836212167 0.463300572639633 0.8552574066103881 }
radiance 27
center -235.45620727539062 0 197.85934448242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9808434373155148 0.4987919382369419 0.9337327344516919 }
radiance 25
center -206.1168975830078 0 199.1904296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9445044805042888 0.37045709797129744 0.8172639260297879 }
radiance 17
center -240.62924194335938 0 176.90048217773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8305176287525345 0.47967772980655166 0.9816735428145817 }
radiance 22
center -189.85693359375 0 209.72706604003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38484340022812724 0.6615865503421506 }
radiance 27
center -224.93475341796875 0 205.91664123535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8926845434019295 0.3357876688052229 0.8363249562390925 }
radiance 18
center -281.5963134765625 0 162.47036743164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131699829738387 0.34305306167126454 0.9328200694487356 }
radiance 22
center -227.23805236816406 0 171.48361206054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9799723451874784 0.32856002516495236 0.8104844526241467 }
radiance 31
center -236.3660125732422 0 160.48451232910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.975510421531232 0.3480541207342425 0.9622008579915132 }
radiance 25
center -269.9482421875 0 154.05865478515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9300408210712917 0.31933803597488236 0.9367944669237617 }
radiance 20
center -232.4425811767578 0 125.27127838134766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8586229103144264 0.3899638354516557 0.983905845713091 }
radiance 20
center -247.86265563964844 0 195.71107482910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9587119436023215 0.47000790530424597 0.9387425987758464 }
radiance 23
center -296.1477966308594 0 161.3925018310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8078871751219721 0.49017282935267115 0.849248020144573 }
radiance 26
center -226.21791076660156 0 194.3089599609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9135673176399157 0.4256347482487436 0.8851275291188523 }
radiance 28
center -268.7104187011719 0 156.48655700683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8905983188510015 0.4526447145314626 0.8782615654086378 }
radiance 28
center -243.89857482910156 0 124.83328247070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39363974902780663 0.4471447494205335 }
radiance 21
center -230.78646850585938 0 124.00823211669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8555795460984504 0.44118005377991104 0.8180805624966812 }
radiance 19
center -260.63336181640625 0 123.23857116699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41273223823006444 0.30930667427459274 0.9 }
radiance 18
center -241.17506408691406 0 194.5677032470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5332743333252319 0.30282697423308647 0.9 }
radiance 25
center -221.4867706298828 0 117.09846496582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9582801531681521 0.45602231574823515 0.8475497666395284 }
radiance 29
center -283.4732971191406 0 96.43962097167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8688807707083793 0.44992339168577294 0.8037936069307263 }
radiance 23
center -242.91578674316406 0 116.24851989746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9440963591905182 0.30244371594392466 0.8018635102016525 }
radiance 28
center -238.38075256347656 0 100.1220474243164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8553206227570774 0.32484588520326313 0.9258790249219736 }
radiance 22
center -251.5607147216797 0 133.3593292236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8056505218756164 0.31321638539732005 0.8732314411678398 }
radiance 28
center -270.0750427246094 0 144.24441528320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8150939357270455 0.31811096407863 0.8123500832844524 }
radiance 16
center -213.69696044921875 0 126.00457000732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.979525278805701 0.43850144285755704 0.8186758098866106 }
radiance 26
center -238.31297302246094 0 75.50055694580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9073235806364746 0.4693238325682271 0.9176758358119886 }
radiance 31
center -218.13540649414062 0 68.06747436523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4413499315452928 0.3429849134968293 0.9 }
radiance 18
center -229.330078125 0 77.5816421508789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9767418311783006 0.43593385711843147 0.8663867380553562 }
radiance 17
center -292.8954162597656 0 48.68145751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3442180474081329 0.5156309853223268 }
radiance 16
center -235.49746704101562 0 54.4898681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8742123936432475 0.3771869105165384 0.9729977335730335 }
radiance 26
center -268.1981506347656 0 138.59356689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8914627805225254 0.3881774457872278 0.8152905238813934 }
radiance 27
center -253.76144409179688 0 42.32556915283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9112457997932033 0.31131386359450236 0.8722725116732201 }
radiance 26
center -266.7545471191406 0 46.92438507080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9423912588370759 0.4648206294253837 0.9067312319547224 }
radiance 26
center -302.2282409667969 0 101.92684936523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31781947379542874 0.6735507075102383 }
radiance 16
center -268.82373046875 0 43.92243957519531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42476273167725576 0.6923606565532917 }
radiance 23
center -295.61328125 0 25.81597328186035
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8578658092387637 0.46159054578378983 0.9 }
radiance 29
center -274.1287536621094 0 80.2417221069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8139421490399021 0.4310745144322572 0.8599908290665028 }
radiance 28
center -279.7628173828125 0 44.80741500854492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8478074667685482 0.40735358237533703 0.9633532882082336 }
radiance 26
center -230.88543701171875 0 81.00338745117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8799219393302982 0.43687184531009543 0.9848428212337248 }
radiance 19
center -308.0313720703125 0 90.67823028564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9627205369591263 0.42834953119670205 0.8857197377346623 }
radiance 31
center -250.47296142578125 0 76.99656677246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8117986584932393 0.4786714038242239 0.9 }
radiance 29
center -259.6094970703125 0 86.89173889160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9998070115866897 0.389452939222209 0.975048129168394 }
radiance 18
center -235.24502563476562 0 67.86815643310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41879792893997475 0.7172982923997283 }
radiance 20
center -292.6163635253906 0 59.00780487060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8684909195885239 0.3747438919570757 0.9927250660268452 }
radiance 30
center -246.48829650878906 0 7.116616725921631
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8789879329713491 0.32973015542448036 0.819636980395739 }
radiance 30
center -289.2080078125 0 52.71932601928711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9797842234624646 0.3979952629925333 0.837595591577403 }
radiance 26
center -252.31228637695312 0 4.818011283874512
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7732946706690318 0.41151302999304906 0.9 }
radiance 30
center -272.2166442871094 0 30.036026000976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9755665649866498 0.3583763976772996 0.9084277598447329 }
radiance 21
center -230.87796020507812 0 9.328267097473145
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8076554525375292 0.4503314520415499 0.8827150061963369 }
radiance 20
center -299.6405334472656 0 9.747634887695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4549856699997681 0.8294492609797879 }
radiance 24
center -233.55477905273438 0 30.34844398498535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8520926164215521 0.4810545170582621 0.8475261113186965 }
radiance 28
center -292.9571533203125 0 13.638360023498535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.849664009369199 0.45148485748274747 0.9845339194099296 }
radiance 27
center -281.2823181152344 0 12.32014274597168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9490981670432468 0.4469112617050468 0.8665534816428825 }
radiance 22
center -260.91497802734375 0 -44.00060272216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9463454235589974 0.474534874682218 0.959986966925381 }
radiance 29
center -285.1790771484375 0 -16.45707130432129
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8653159252243849 0.4118310914444664 0.8401005749314424 }
radiance 27
center -294.9353942871094 0 -0.7577409148216248
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9024444339292113 0.46274848905036037 0.9154055290259603 }
radiance 18
center -233.13230895996094 0 34.1932373046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9263915386323653 0.38469759063336156 0.9726476496336368 }
radiance 30
center -301.41558837890625 0 -47.28321075439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.498760892028954 0.8290115959681301 }
radiance 16
center -234.5855712890625 0 -15.571329116821289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8414805725345885 0.36842946086588996 0.9511873930812037 }
radiance 26
center -243.10215759277344 0 -34.86683654785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9465918340317997 0.36484291688734205 0.9803459835931615 }
radiance 24
center -233.7723388671875 0 -68.46815490722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.888907546536934 0.3396825312558565 0.9795657186321302 }
radiance 26
center -241.4480743408203 0 -36.1821174621582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9336620864350883 0.34675008281400843 0.8691533734333735 }
radiance 31
center -280.9130554199219 0 -12.444991111755371
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.913610598066332 0.34657213820615984 0.9310971494266841 }
radiance 26
center -206.7046661376953 0 -73.6695327758789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9594643200578749 0.40313394570102223 0.8374342787416225 }
radiance 31
center -297.86224365234375 0 4.2163543701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3366040152967525 0.5281486737174153 }
radiance 21
center -226.3616485595703 0 -64.0985336303711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46956420676637123 0.6187470498750968 }
radiance 31
center -277.43511962890625 0 -25.62999153137207
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9415259517793088 0.3645443501392882 0.8780382913180145 }
radiance 30
center -244.36553955078125 0 -15.79117488861084
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9116915549482061 0.31381389315955294 0.8814878193359185 }
radiance 25
center -264.5244140625 0 -65.35559844970703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8632430105070835 0.48720285704590693 0.9950098904747177 }
radiance 17
center -227.89364624023438 0 -35.61857223510742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8905174249429139 0.44326236394972435 0.9 }
radiance 25
center -255.5050048828125 0 -49.017398834228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8761461059875931 0.34225828103103506 0.897718085998798 }
radiance 21
center -286.95501708984375 0 -66.80596160888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8892658027515292 0.46459889343915894 0.8617192252436913 }
radiance 25
center -203.3065948486328 0 -9.746138572692871
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9087258675941234 0.30131020462124575 0.801343499805732 }
radiance 23
center -207.04592895507812 0 -70.8559799194336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.91919703239726 0.3623035645292714 0.8868850177730506 }
radiance 20
center -219.86265563964844 0 -106.96289825439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9063353690587665 0.4728622717259665 0.8382442328886794 }
radiance 16
center -259.9273376464844 0 -68.3338623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.848449160242513 0.45262422316769746 0.8933089514259578 }
radiance 27
center -234.45614624023438 0 -67.07231140136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.864393786518135 0.3632106854537136 0.8078146829818331 }
radiance 22
center -283.1761169433594 0 -61.88031005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9441155672763465 0.32477985745656074 0.9900389308028928 }
radiance 21
center -234.2762908935547 0 -110.38347625732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6986867066748276 0.42412996393259694 0.9 }
radiance 29
center -227.0492706298828 0 -130.63592529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5981706889792009 0.35902654213764146 0.9 }
radiance 27
center -244.61732482910156 0 -120.67535400390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8716902972236011 0.46011210737480446 0.8800072652353262 }
radiance 29
center -242.73037719726562 0 -83.87158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8206672884414739 0.4892739530491249 0.8150321184028857 }
radiance 28
center -226.6738739013672 0 -106.7242202758789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5801048287109373 0.41222915629195755 0.9 }
radiance 24
center -191.52059936523438 0 -57.11680221557617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7790269812945492 0.46571790517288436 0.9 }
radiance 22
center -236.39588928222656 0 -144.07818603515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8834078206627267 0.30262707900708846 0.9368026461823113 }
radiance 22
center -269.52105712890625 0 -145.09332275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8391138051650491 0.4998200529908613 0.8502546912482448 }
radiance 19
center -228.3597869873047 0 -111.8537368774414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7407319836232767 0.4982680826105776 0.9 }
radiance 28
center -239.69125366210938 0 -123.39734649658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3469799773410671 0.5012820943341864 }
radiance 24
center -257.9776916503906 0 -151.99169921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8251430536385045 0.4019628551546472 0.8425035986654559 }
radiance 19
center -241.29786682128906 0 -109.7634506225586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9764293007383316 0.3205702814654898 0.9572158676098194 }
radiance 29
center -212.63516235351562 0 -142.0373992919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8323402554526729 0.3042031941580533 0.8675348421564427 }
radiance 18
center -217.16050720214844 0 -154.46702575683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39121936799158225 0.5106560590523986 }
radiance 21
center -211.90306091308594 0 -156.61849975585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.912805268484999 0.40573934567637027 0.9020092620551585 }
radiance 17
center -163.7765350341797 0 -126.68170928955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5555427433830551 0.39804789063631685 0.9 }
radiance 24
center -184.92457580566406 0 -153.9651336669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9288572461009517 0.4802349887880031 0.9068976710511 }
radiance 19
center -211.31344604492188 0 -166.29302978515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5717301437546646 0.4038797857798544 0.9 }
radiance 31
center -167.12928771972656 0 -143.0769805908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8110998933964244 0.49998766515308823 0.9 }
radiance 23
center -226.68801879882812 0 -167.9055938720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7193660756124766 0.4113643089371978 0.9 }
radiance 16
center -213.29893493652344 0 -166.3524169921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.811850283740038 0.48828473289779517 0.9981649903920533 }
radiance 18
center -207.29342651367188 0 -177.4142608642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8826145923000617 0.3254809155832562 0.9851351205532174 }
radiance 20
center -197.5139617919922 0 -164.7080535888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.87279048350339 0.47345447143618624 0.8503346864764476 }
radiance 18
center -147.884765625 0 -113.35610961914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45601179826783245 0.8417631579249587 }
radiance 28
center -166.86241149902344 0 -154.48497009277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38943052910444526 0.6927208594575504 }
radiance 17
center -173.58966064453125 0 -154.2294921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8020696813830236 0.48408073855150907 0.86561849782955 }
radiance 28
center -160.82293701171875 0 -190.73587036132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8997656838346717 0.3886973966955804 0.9540004806602057 }
radiance 29
center -148.55026245117188 0 -195.03501892089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130645798789119 0.34377174148344586 0.9780748184456226 }
radiance 19
center -184.7700958251953 0 -123.43045806884766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49476330845235883 0.7645652168517567 }
radiance 23
center -143.88284301757812 0 -191.33460998535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8788960776566065 0.4783558324744327 0.8247102882384266 }
radiance 28
center -145.09463500976562 0 -126.57482147216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9965963072661564 0.44038144721023176 0.8302921139159036 }
radiance 18
center -136.05101013183594 0 -131.1085968017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8461260299328071 0.45862836754864855 0.8843084886723372 }
radiance 18
center -171.72625732421875 0 -212.92091369628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8902472387843381 0.37820780439293644 0.8291975935519178 }
radiance 16
center -156.22653198242188 0 -146.98672485351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8773016151055791 0.36886348455968554 0.9 }
radiance 18
center -140.27496337890625 0 -185.2705535888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9021936627870197 0.3140670097919861 0.9381892413515064 }
radiance 30
center -151.23837280273438 0 -215.33572387695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.949436278506959 0.476295221259166 0.9962110498544992 }
radiance 17
center -116.84696197509766 0 -181.4011993408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447497304060587 0.4175632854107787 0.9 }
radiance 25
center -147.9621124267578 0 -190.40069580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834662527505543 0.39999317387834166 0.8672809363790335 }
radiance 16
center -192.34788513183594 0 -216.32730102539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6014098746915454 0.49972309891139677 0.9 }
radiance 17
center -160.665771484375 0 -146.98126220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9072352137263624 0.4363771059966477 0.8491340788087374 }
radiance 20
center -148.01072692871094 0 -202.38058471679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9090281123241059 0.3020044577461989 0.820172246732199 }
radiance 29
center -165.0753936767578 0 -203.5805206298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9171683799420656 0.40592764493044386 0.8399424493104588 }
radiance 21
center -98.90861511230469 0 -208.85177612304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4826018284640773 0.4699780812897542 0.9 }
radiance 29
center -155.75433349609375 0 -207.08001708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.941392854377701 0.402615518887545 0.8622267360671502 }
radiance 27
center -146.9665985107422 0 -146.3687286376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.824302946609895 0.49275923967439267 0.9004653500778217 }
radiance 20
center -140.1607666015625 0 -220.54461669921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6449327370609295 0.3329862958116214 0.9 }
radiance 23
center -165.31063842773438 0 -212.02366638183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.825085555732709 0.4164334409920398 0.8858984685530694 }
radiance 20
center -165.12155151367188 0 -169.775634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9770625616745516 0.44755947824339115 0.9423782619378361 }
radiance 31
center -102.72196960449219 0 -231.80165100097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9509226208676309 0.44161470574702844 0.83420883049833 }
radiance 31
center -133.02142333984375 0 -226.15524291992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9089801361284319 0.3759664472655732 0.9493154485162688 }
radiance 24
center -93.39649963378906 0 -220.94216918945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9614683098360747 0.43625737492194805 0.9391606784024883 }
radiance 22
center -94.22801208496094 0 -220.136962890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9715217201264872 0.4860543434184958 0.8757124028836981 }
radiance 24
center -116.29369354248047 0 -206.0217742919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9209409816191485 0.3773528383735847 0.946806000258176 }
radiance 16
center -139.2926788330078 0 -236.9943084716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.949585646275717 0.301488392460856 0.9486312276099118 }
radiance 28
center -139.7781982421875 0 -213.6250762939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8723683283438485 0.4060899353997115 0.9809519368373579 }
radiance 21
center -109.99795532226562 0 -253.73764038085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.883267264004878 0.44688857976300245 0.9916236239077697 }
radiance 31
center -124.59578704833984 0 -254.06930541992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9805530453884391 0.42921739407870263 0.9761110574418933 }
radiance 26
center -58.463623046875 0 -232.29751586914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3073391970306876 0.7030221165121288 }
radiance 20
center -125.75480651855469 0 -241.89561462402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9696390496973566 0.4482723584608296 0.8809174887677014 }
radiance 17
center -74.67713928222656 0 -187.4759521484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9498419048991114 0.48979464020667784 0.8304601212286984 }
radiance 18
center -105.56597137451172 0 -242.86904907226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5611010506286903 0.41124435874951065 0.9 }
radiance 23
center -49.591094970703125 0 -180.42987060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32179822178998074 0.6737045808209376 }
radiance 23
center -122.65664672851562 0 -214.28659057617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9340758317356341 0.45008445172484646 0.8860400352690891 }
radiance 21
center -40.95683288574219 0 -197.624267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9016758869076652 0.348108552183812 0.9296305574190042 }
radiance 20
center -60.65200424194336 0 -209.0133056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4436857497837018 0.5073367370563038 }
radiance 30
center -73.22384643554688 0 -190.43576049804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8186996550633371 0.4668852400202237 0.989854664339004 }
radiance 25
center -46.7203254699707 0 -183.44046020507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8759326111713823 0.44108498526942796 0.8445577580445682 }
radiance 24
center -24.7002010345459 0 -219.9624481201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9268613709657286 0.49273715190980516 0.8923339579682183 }
radiance 26
center -100.12162780761719 0 -247.27066040039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8735234458204896 0.40225140550947236 0.8480957959963892 }
radiance 23
center -83.08428192138672 0 -219.0961151123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8457141851885448 0.3147411604920017 0.8494333843379662 }
radiance 20
center -38.41338348388672 0 -204.392822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36904345495618085 0.8187652980016862 }
radiance 21
center -41.154441833496094 0 -238.51980590820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9100618309654298 0.49556568789692446 0.9305549565950234 }
radiance 16
center -31.146621704101562 0 -182.52944946289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32320429536898676 0.684819672271918 }
radiance 17
center -47.03776550292969 0 -222.41307067871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8827084565964423 0.47164498248588127 0.9567572439008449 }
radiance 22
center -54.5273323059082 0 -185.75428771972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8845044943073715 0.42641401425585157 0.8263700929966783 }
radiance 22
center -49.39814376831055 0 -260.78179931640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8555399156270779 0.3078751223602712 0.970082639736211 }
radiance 21
center -24.429948806762695 0 -269.9344177246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9199806781343813 0.43170300436530623 0.9166715029697972 }
radiance 25
center -12.877500534057617 0 -237.3870086669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9827342786211006 0.42723104789879146 0.8211947411215557 }
radiance 19
center 7.651002883911133 0 -253.98623657226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46722690865097993 0.37809028524144617 0.9 }
radiance 30
center -8.03947925567627 0 -261.2118225097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8836754351223541 0.37127733524300655 0.9276473213606012 }
radiance 30
center -53.145694732666016 0 -239.8833770751953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37049304745110967 0.599418724824511 }
radiance 26
center -11.521159172058105 0 -256.48126220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.566555718119723 0.49501858629840334 0.9 }
radiance 24
center -42.2486457824707 0 -236.33453369140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8031669756351272 0.4137246180422036 0.9452854559382298 }
radiance 21
center -7.087017059326172 0 -269.50811767578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.820060990657931 0.3642277207708328 0.899406998502389 }
radiance 25
center -30.16025733947754 0 -270.3306884765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44171149283791666 0.5575637183093185 }
radiance 19
center 5.367595672607422 0 -220.4278106689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4878126412682322 0.4008139469757345 0.9 }
radiance 31
center 20.673561096191406 0 -231.69712829589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31353323095292374 0.5623919115070082 }
radiance 30
center -8.142766952514648 0 -202.52243041992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8962973355014375 0.33792872365001475 0.9970268571618017 }
radiance 30
center 12.853043556213379 0 -268.87762451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8026655620118553 0.46488261211902837 0.8528016431006588 }
radiance 31
center 8.484257698059082 0 -260.26898193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9870906526169261 0.3567790341030596 0.9283591102896499 }
radiance 29
center -22.597858428955078 0 -208.7898406982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9436840278053172 0.36721446542218306 0.8950745853746022 }
radiance 30
center 18.262596130371094 0 -243.09918212890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.969077133252066 0.40418060633338654 0.8472456083395707 }
radiance 31
center -3.4590327739715576 0 -267.0273742675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9578924470132956 0.4726382086775516 0.9008768278096124 }
radiance 28
center -11.139810562133789 0 -232.08609008789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8436778854651773 0.466693955431501 0.9579464740034218 }
radiance 29
center 32.09328079223633 0 -228.00076293945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49419022042203375 0.729442941959948 }
radiance 23
center 3.465902805328369 0 -239.8623809814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47539155215625595 0.4060918604766599 0.9 }
radiance 20
center 26.675981521606445 0 -239.43719482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9545869247124219 0.40827635573449605 0.8765462064752931 }
radiance 26
center 37.10845947265625 0 -237.0615997314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9667271981046633 0.39392164840864596 0.9678186153622493 }
radiance 16
center 12.605265617370605 0 -242.56552124023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834582174032861 0.3445571358715658 0.9207230226828407 }
radiance 26
center 50.4779052734375 0 -266.9716491699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.836757667655326 0.48318238827502413 0.9 }
radiance 23
center 15.592697143554688 0 -256.46173095703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9882948694196457 0.40409272289446774 0.8416885946789074 }
radiance 23
center 47.24964141845703 0 -209.71034240722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.803053087915202 0.4939897147625364 0.9606615864854453 }
radiance 28
center 28.161008834838867 0 -217.07635498046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9304317627089236 0.32163969334352377 0.8742289875274645 }
radiance 24
center 25.426204681396484 0 -254.1291961669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44146062797368546 0.3841494096734101 0.9 }
radiance 17
center 36.44282531738281 0 -254.11741638183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9617793745954424 0.3293571849167687 0.9221821136040642 }
radiance 20
center 22.36119270324707 0 -194.15670776367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.649694707727923 0.4126985350975493 0.9 }
radiance 19
center 83.7467041015625 0 -225.1695556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7351144898948136 0.31402376316680436 0.9 }
radiance 18
center 45.57806396484375 0 -240.6902618408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4421531462689924 0.8695372775187374 }
radiance 21
center 50.58381271362305 0 -262.0271911621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8824473242782567 0.48559498156778313 0.9140620014695693 }
radiance 19
center 57.87955093383789 0 -217.6444091796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8552140802652335 0.3878041628622475 0.8237746520877982 }
radiance 21
center 57.599891662597656 0 -182.9254150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.981856572037757 0.42246333087743404 0.8697262913626852 }
radiance 31
center 80.87360382080078 0 -227.09642028808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8696043563166743 0.4877668154853547 0.8141724914986468 }
radiance 28
center 105.42279815673828 0 -209.99819946289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8348575273510132 0.3076284475527062 0.9940766373372223 }
radiance 18
center 74.71460723876953 0 -187.70152282714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9246111959514882 0.46413437586905604 0.834587455154921 }
radiance 28
center 57.42604064941406 0 -249.38894653320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8873400655805415 0.31063448636208685 0.8035361462515983 }
radiance 25
center 112.07268524169922 0 -206.572998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.889208515658155 0.33370600526208666 0.8336206984272796 }
radiance 28
center 57.77442169189453 0 -212.2764892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9640505337505264 0.3526322511365374 0.9579383170047393 }
radiance 20
center 94.61724090576172 0 -185.80442810058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7948429393726975 0.31474783624655567 0.9 }
radiance 17
center 124.18136596679688 0 -191.7926483154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8456072034238494 0.4301050268088151 0.9630940759091412 }
radiance 29
center 110.43216705322266 0 -220.76768493652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44705898496060326 0.4521660297094331 0.9 }
radiance 22
center 130.41561889648438 0 -225.47824096679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9955964039099662 0.3527137783882058 0.8984524560439722 }
radiance 22
center 78.77819061279297 0 -169.57656860351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9680270396129769 0.3682801884485334 0.958448128520326 }
radiance 18
center 74.19625091552734 0 -184.2564697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445512151549928 0.47223732782839967 0.9141759171147027 }
radiance 29
center 114.27703094482422 0 -206.25527954101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8526540636941469 0.4571826130075748 0.9 }
radiance 26
center 101.15499877929688 0 -182.82821655273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8683075574716326 0.3409067103753455 0.9619161136551834 }
radiance 31
center 99.99283599853516 0 -183.50881958007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4356940081859042 0.7100148327779167 }
radiance 24
center 80.46918487548828 0 -201.23841857910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7456428350404847 0.374447500429275 0.9 }
radiance 28
center 107.46510314941406 0 -234.8639373779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8885056260423198 0.3407606044698665 0.9583051674202738 }
radiance 26
center 126.3246841430664 0 -228.02490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9402397829762981 0.49596832898560134 0.9420501366756221 }
radiance 26
center 118.69725036621094 0 -234.64498901367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9569355313300217 0.36756274813957024 0.9701825300395285 }
radiance 18
center 94.14787292480469 0 -155.58163452148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8832871935870434 0.3724037288542926 0.9440514972416628 }
radiance 27
center 153.2869415283203 0 -203.92942810058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3404510739598777 0.4758996392921735 }
radiance 19
center 90.65259552001953 0 -182.0908966064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9462128475218259 0.3944988254653247 0.8452257749253916 }
radiance 19
center 146.5302276611328 0 -186.05450439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8982673846279576 0.40333846599872647 0.8053048133767954 }
radiance 20
center 98.4456558227539 0 -230.0342254638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8805132370239228 0.3192106737595195 0.8065962875151208 }
radiance 28
center 148.18646240234375 0 -188.19117736816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7864124897943257 0.3600242920825761 0.9 }
radiance 17
center 109.83346557617188 0 -176.78909301757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3128330871825512 0.8439731987025475 }
radiance 16
center 107.8480453491211 0 -145.8091583251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40770683810786074 0.6987130837453768 }
radiance 16
center 162.39285278320312 0 -173.1385498046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8749362353197179 0.3993656227987474 0.9 }
radiance 16
center 167.33290100097656 0 -189.77548217773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8432064670587828 0.4627307125284116 0.8682040274598631 }
radiance 21
center 150.9029083251953 0 -207.16453552246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9803302455304443 0.4228466220812508 0.8452551421505217 }
radiance 18
center 115.14179992675781 0 -196.0665740966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9694919291470032 0.4819076144165747 0.9976056308846307 }
radiance 17
center 182.54940795898438 0 -166.3457489013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34364227319152835 0.5099041085072231 }
radiance 17
center 154.0015411376953 0 -137.60020446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8812627774020181 0.44255861179588185 0.8136810716317323 }
radiance 16
center 164.19236755371094 0 -168.2933807373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206791048408615 0.4244487732646065 0.8117371312319428 }
radiance 31
center 173.9467315673828 0 -166.18600463867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40130780877157946 0.47581140823738266 }
radiance 28
center 133.1378173828125 0 -198.68014526367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3951490098371585 0.503035524872582 }
radiance 20
center 189.4578399658203 0 -201.10977172851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4522313616679502 0.8828674709008351 }
radiance 28
center 184.40869140625 0 -180.6124267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4097964978695229 0.39625486797049236 0.9 }
radiance 31
center 177.136474609375 0 -174.08563232421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8909614408308945 0.40739022857647034 0.8003495687674301 }
radiance 30
center 202.9228973388672 0 -138.19412231445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9513861500241079 0.3763466353698396 0.885575463242559 }
radiance 18
center 154.50611877441406 0 -116.800537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9083584407303179 0.35640165620167613 0.922982708330212 }
radiance 31
center 171.31678771972656 0 -136.2177276611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8210518123087127 0.4070607055218125 0.8861749883979297 }
radiance 24
center 194.96205139160156 0 -131.54469299316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8459743561792346 0.4430243136612182 0.9146583284315594 }
radiance 28
center 186.31373596191406 0 -154.50831604003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8733887797322545 0.3957564536446577 0.9 }
radiance 19
center 163.15065002441406 0 -121.66401672363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9085039300775907 0.4464209849638272 0.9770030895739761 }
radiance 17
center 204.28492736816406 0 -141.59425354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3547690505209166 0.4109113270216582 }
radiance 18
center 194.27085876464844 0 -107.9505615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9158670548009618 0.4336890588718638 0.8742735938815591 }
radiance 27
center 165.9208526611328 0 -176.6039581298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8010031213886499 0.4400781869370353 0.8114305585623367 }
radiance 17
center 220.70143127441406 0 -151.09495544433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6280538739714816 0.36021545722994036 0.9 }
radiance 24
center 182.59725952148438 0 -143.38287353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4277260105601084 0.8526754671451754 }
radiance 17
center 229.3983154296875 0 -160.2347869873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9370356911189246 0.3980036516682714 0.970279501040356 }
radiance 31
center 184.7237548828125 0 -94.77486419677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.964086130445603 0.43005484257633875 0.8994396547564193 }
radiance 27
center 194.443359375 0 -170.18670654296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9294257596613988 0.33788038696938255 0.9983809598222335 }
radiance 29
center 201.62193298339844 0 -109.24143981933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8428513623103118 0.3991060346101605 0.8541836496156362 }
radiance 25
center 204.69544982910156 0 -129.19471740722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8623850963660905 0.37112863791191386 0.9917386276648962 }
radiance 17
center 187.2369842529297 0 -128.11827087402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8142824020644056 0.323814138637164 0.9492605817873712 }
radiance 21
center 221.58895874023438 0 -137.82518005371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3403181883850454 0.5061815609586465 }
radiance 29
center 225.4090118408203 0 -124.08940887451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8320656149801012 0.3825163036850031 0.824671700971315 }
radiance 25
center 226.56715393066406 0 -89.49742126464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3956215844933132 0.7777480600459938 }
radiance 24
center 233.25897216796875 0 -143.86439514160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8779605732662709 0.46228050165085477 0.9 }
radiance 30
center 197.91912841796875 0 -145.52560424804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9550081044541612 0.36238257114673394 0.9759035440653762 }
radiance 16
center 209.1240234375 0 -120.70637512207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9371522028148975 0.31106057968530454 0.9964284567301501 }
radiance 29
center 205.265625 0 -133.08226013183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4381503248305132 0.47100381220946586 }
radiance 31
center 175.21214294433594 0 -114.5978775024414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4511442125305034 0.5405422384448609 }
radiance 31
center 206.33827209472656 0 -104.57840728759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8456940490509929 0.4898442568532857 0.8903938805100687 }
radiance 27
center 215.2008056640625 0 -125.46855926513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8728466658992086 0.458339756516159 0.8249680804126521 }
radiance 31
center 250.57363891601562 0 -129.0524139404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39929825241610606 0.5485419412947516 }
radiance 30
center 231.83111572265625 0 -101.41931915283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8967616161543046 0.42231422930764195 0.9771970567883784 }
radiance 21
center 228.5203399658203 0 -130.3589630126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9452224874143791 0.42371318014963255 0.887284331806678 }
radiance 25
center 197.6559295654297 0 -103.24114227294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9348814953815076 0.48050886330069853 0.8684482604816575 }
radiance 19
center 248.3469696044922 0 -80.95013427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9179041249166358 0.4871888035033186 0.8716466662693891 }
radiance 19
center 235.51596069335938 0 -94.0636215209961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8303201640778028 0.384392063026236 0.966726998845408 }
radiance 27
center 199.6297607421875 0 -81.16989135742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9327838088082072 0.4170197707891121 0.9742562731102533 }
radiance 16
center 233.0417022705078 0 -116.08772277832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448998476307739 0.44265665636549867 0.8036531561973472 }
radiance 28
center 229.69561767578125 0 -80.99970245361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4823826975242982 0.7054950674703124 }
radiance 27
center 220.64883422851562 0 -72.23357391357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.584966744132599 0.37602679021756336 0.9 }
radiance 31
center 229.52830505371094 0 -65.51200866699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48113677417956446 0.5432309333190098 }
radiance 28
center 235.85232543945312 0 -85.42674255371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8156899811522099 0.3666679749002888 0.8704647802995022 }
radiance 20
center 254.84384155273438 0 -64.78802490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9660931547994227 0.3671380374372534 0.9363938347583609 }
radiance 20
center 228.43934631347656 0 -21.496784210205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45925926933896843 0.5955628138948309 }
radiance 29
center 252.87789916992188 0 -74.66835021972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8426404025751021 0.47464288723535186 0.9338790893509042 }
radiance 27
center 254.74156188964844 0 -23.149259567260742
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.801553021811259 0.33417846138029755 0.9867325471561113 }
radiance 17
center 263.94537353515625 0 -42.43653106689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4704584611327942 0.7929681187156097 }
radiance 28
center 203.98614501953125 0 -48.25848388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.497518281373595 0.32116760583712256 0.9 }
radiance 19
center 267.0643615722656 0 -27.682388305664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47144202127572965 0.5558121864218993 }
radiance 27
center 208.21804809570312 0 -42.69767761230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43043080757569896 0.5624081319353811 }
radiance 30
center 202.1343994140625 0 -61.06806182861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3370215823046208 0.8877957585947623 }
radiance 16
center 194.52154541015625 0 -9.047325134277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40966204098210746 0.464697831419258 }
radiance 17
center 197.36106872558594 0 -16.783222198486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9572413429701674 0.4487334435861236 0.9608582296344832 }
radiance 24
center 264.31640625 0 -49.18569564819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8527162480958173 0.3429661866382969 0.8967471248533893 }
radiance 27
center 224.68777465820312 0 -51.03328323364258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872599187980633 0.4820462220145153 0.8834116728396947 }
radiance 23
center 237.11569213867188 0 2.0553951263427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8267706657881443 0.4949625474676995 0.9349977927380457 }
radiance 18
center 256.667236328125 0 0.15719236433506012
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8940641726878549 0.32387863155298807 0.8987049792820572 }
radiance 31
center 257.87176513671875 0 -5.39933967590332
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9961439513638246 0.3121340843990639 0.990976813686008 }
radiance 16
center 217.6711883544922 0 -2.6116647720336914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9674011138169607 0.4028778822807806 0.8938606791103592 }
radiance 24
center 244.0570068359375 0 -11.402031898498535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4244463125392042 0.5289460945740369 }
radiance 31
center 247.63381958007812 0 -47.96946716308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.952091299852569 0.33128378114702983 0.9022976658460953 }
radiance 20
center 257.1187438964844 0 -46.08961486816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9040091974845692 0.48773314010064894 0.9978358101293621 }
radiance 28
center 208.63235473632812 0 -32.36349105834961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.860133291320187 0.4383103307561631 0.8637164816305107 }
radiance 16
center 259.8770751953125 0 -24.708581924438477
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7657186598329385 0.3460294545174528 0.9 }
radiance 26
center 264.574462890625 0 13.05536937713623
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8521966569591054 0.34255473956338256 0.8767871412824891 }
radiance 29
center 225.15902709960938 0 -9.135973930358887
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7402328342255551 0.420284961481506 0.9 }
radiance 20
center 233.42420959472656 0 -21.472991943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8291601570216287 0.4158723494134459 0.9 }
radiance 19
center 217.9767608642578 0 -35.18437576293945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8985384975025645 0.48636432880126546 0.8866277690961804 }
radiance 23
center 262.9730224609375 0 -12.869832038879395
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9145709151247162 0.37106176256547996 0.9210073684073813 }
radiance 28
center 248.12535095214844 0 -24.007400512695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4935897547627161 0.6828586413867369 }
radiance 30
center 202.37037658691406 0 28.064714431762695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8629418428636051 0.3557734836825253 0.861720999632241 }
radiance 22
center 201.90663146972656 0 42.55096435546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6387609042219721 0.4874026733293775 0.9 }
radiance 18
center 202.09141540527344 0 20.050642013549805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.857442562803824 0.4195025239559268 0.923818318604939 }
radiance 24
center 263.75799560546875 0 29.378938674926758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9445366513503952 0.3436378305126313 0.9753006906134404 }
radiance 19
center 223.9263458251953 0 40.264442443847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8133598242985446 0.4935117941887367 0.8265502416115063 }
radiance 31
center 240.38731384277344 0 46.28878402709961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9300487288693187 0.3088836911362229 0.9139809809599168 }
radiance 16
center 267.5368957519531 0 49.21556854248047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8589414103582373 0.4691050308791572 0.8165878183956051 }
radiance 22
center 254.70599365234375 0 21.056623458862305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533457793854665 0.37318770805492946 0.8368008032064992 }
radiance 23
center 218.55209350585938 0 23.83689308166504
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4068350306643965 0.8703822541421968 }
radiance 17
center 265.30633544921875 0 67.09131622314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9855938667044432 0.4582790113703572 0.9183389745687892 }
radiance 23
center 212.6745147705078 0 5.169021129608154
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.449358473752941 0.3825037974781037 0.9 }
radiance 28
center 206.56118774414062 0 66.22636413574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7623403132007408 0.4335579324796292 0.9 }
radiance 19
center 256.5818176269531 0 61.7706298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.849317786609275 0.36240689082638017 0.9 }
radiance 27
center 193.59329223632812 0 54.478492736816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9597923274476198 0.3961801813466196 0.8784022403688521 }
radiance 26
center 209.35385131835938 0 37.621829986572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.686277861941218 0.39425581207642135 0.9 }
radiance 20
center 210.0336456298828 0 49.09315490722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8271735228331787 0.43066713661705325 0.8858307798264546 }
radiance 23
center 207.0315399169922 0 50.46976852416992
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5119233412564111 0.3749855435554543 0.9 }
radiance 29
center 233.75247192382812 0 74.95734405517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.971150469171394 0.3436329105976507 0.9517590648899448 }
radiance 21
center 197.93978881835938 0 77.50724792480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.894811330900644 0.4399280431029473 0.9237369022551382 }
radiance 28
center 214.372314453125 0 43.502838134765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30752391891665687 0.5261694329901643 }
radiance 25
center 209.51425170898438 0 79.74781036376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5561749715619233 0.44588072550995494 0.9 }
radiance 28
center 252.9818115234375 0 75.13318634033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9222025931798395 0.36909358134804127 0.9448252915462814 }
radiance 30
center 200.96975708007812 0 71.80670928955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9503976252610641 0.4172854936403 0.8599397304473859 }
radiance 17
center 187.0235595703125 0 65.37129211425781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9996568520287603 0.430189960518565 0.9611466355939559 }
radiance 24
center 223.2831268310547 0 57.342018127441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8214626162542638 0.4447470750388684 0.8618218951161075 }
radiance 29
center 192.67654418945312 0 78.52879333496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9196429705264639 0.37725285033251243 0.9214581712312968 }
radiance 21
center 210.51116943359375 0 84.37619018554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4214642907323102 0.6164772599273115 }
radiance 30
center 192.2774658203125 0 64.3365478515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6637960191717007 0.4107906858887974 0.9 }
radiance 23
center 200.51397705078125 0 115.26841735839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9466775132125629 0.3522751648690852 0.8636874355594599 }
radiance 20
center 221.99974060058594 0 53.03350067138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9393923896432629 0.45089050518536844 0.8851809651958087 }
radiance 23
center 195.5003662109375 0 85.10311889648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3570603187674111 0.7514099123568319 }
radiance 23
center 206.46656799316406 0 97.54948425292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8523425985456093 0.4365660787104321 0.8787446236912739 }
radiance 29
center 212.10328674316406 0 109.44449615478516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8411423536193816 0.47445668882724856 0.8129620155352915 }
radiance 28
center 209.90467834472656 0 120.36067962646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8726614181514631 0.42943645821795967 0.9697753056648847 }
radiance 19
center 217.81089782714844 0 129.42031860351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48305549326359465 0.6744807197506693 }
radiance 21
center 207.5603485107422 0 72.06058502197266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8013290777330131 0.4062210904150791 0.8935755028715735 }
radiance 29
center 216.11732482910156 0 98.35318756103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.915865700653428 0.42843002181971024 0.8023182384308064 }
radiance 28
center 220.16229248046875 0 93.21654510498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8251252586301546 0.31000504850645944 0.8624403093299015 }
radiance 31
center 189.4537353515625 0 97.74990844726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3330620455255346 0.6973538706044984 }
radiance 23
center 219.417236328125 0 128.50433349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8937764948120335 0.45449828449061136 0.8279112511042888 }
radiance 18
center 232.1317596435547 0 78.81529998779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9224201290879979 0.30490615392058723 0.8540315655881826 }
radiance 30
center 225.84059143066406 0 119.39854431152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9190272481880606 0.394596774243566 0.8550728447546773 }
radiance 19
center 171.44691467285156 0 76.06402587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8598237523622235 0.4835439850391746 0.8228529575977007 }
radiance 23
center 191.3940887451172 0 129.21128845214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8485268880886372 0.3413153427150067 0.801214839651671 }
radiance 19
center 183.385009765625 0 118.8158950805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9912309428475885 0.31545629991023594 0.9388582835525664 }
radiance 17
center 182.03929138183594 0 130.72509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3966777423024094 0.889449950025242 }
radiance 30
center 200.14739990234375 0 151.62384033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8425404887203511 0.4353592787327696 0.8050450844375051 }
radiance 25
center 167.69552612304688 0 132.50852966308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8895933877579443 0.36462721809648824 0.9436948243537718 }
radiance 25
center 197.08963012695312 0 118.97933197021484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44808785118300615 0.49930560689294556 }
radiance 26
center 205.13462829589844 0 160.57540893554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8470734455220826 0.37421869297893684 0.9190849371495128 }
radiance 20
center 173.66368103027344 0 149.0174560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4202769791337684 0.4574994981098691 }
radiance 23
center 166.7490234375 0 113.52644348144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9815561550556188 0.3825680726594901 0.8290474260760609 }
radiance 29
center 154.7682647705078 0 98.505126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3162842275492814 0.5811377713250019 }
radiance 16
center 180.21388244628906 0 141.6340789794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9741938715889251 0.4183222734333576 0.9440926554424662 }
radiance 28
center 148.62042236328125 0 129.9664764404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9789822112706112 0.30564756790746217 0.8688096713558453 }
radiance 26
center 168.1109161376953 0 171.8623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8893487812565041 0.4591363647489965 0.8648734072195773 }
radiance 30
center 182.8295440673828 0 160.79502868652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9245987874282504 0.4474753530968415 0.826914573365931 }
radiance 27
center 146.12619018554688 0 142.4006805419922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4700205176113339 0.899494266505044 }
radiance 25
center 175.5874481201172 0 115.38539123535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9537359493883109 0.4711303095298444 0.9641432458142327 }
radiance 16
center 199.17031860351562 0 167.6373291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4747472382762956 0.49480845058810063 0.9 }
radiance 28
center 173.80029296875 0 137.47044372558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8302072947587593 0.38724011208691395 0.9865893390203033 }
radiance 20
center 187.82315063476562 0 123.93331909179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4726425231548983 0.42600736290345953 }
radiance 17
center 166.22476196289062 0 140.87521362304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35929045033297835 0.7019662023051273 }
radiance 19
center 138.4181365966797 0 144.76356506347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5703500592968306 0.49248976206848816 0.9 }
radiance 26
center 122.98272705078125 0 138.74668884277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6306292212278665 0.40281370523440224 0.9 }
radiance 26
center 149.54930114746094 0 131.75050354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8260138640160556 0.4284032483981117 0.908308696649641 }
radiance 31
center 166.18646240234375 0 136.36732482910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9460742438409758 0.4467068326608536 0.8959087970082468 }
radiance 19
center 168.35108947753906 0 133.19778442382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.976356403146234 0.345429908319612 0.860632037168725 }
radiance 24
center 161.0841522216797 0 174.16024780273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6730056217678193 0.30147358808339614 0.9 }
radiance 21
center 121.1119384765625 0 188.68295288085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4458248349450611 0.8547036461949044 }
radiance 24
center 164.77919006347656 0 202.5264892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3056412114038613 0.7167077017200456 }
radiance 19
center 105.59207916259766 0 189.14059448242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8759395904868114 0.40641468742332765 0.9113240879650033 }
radiance 28
center 119.2857437133789 0 173.00759887695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4711259209819356 0.3618532146915876 0.9 }
radiance 18
center 107.8036880493164 0 189.05445861816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3718754079494608 0.5327877580591889 }
radiance 16
center 100.7764663696289 0 173.50157165527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.928066841048935 0.41499083135846526 0.8979007315408885 }
radiance 26
center 130.99951171875 0 170.8260955810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4780031721458913 0.5854294754703835 }
radiance 22
center 104.9269790649414 0 206.58387756347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9033632661207267 0.3127186805482231 0.8306372499747045 }
radiance 19
center 101.44661712646484 0 174.35516357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8986322451683548 0.3001258653669237 0.9 }
radiance 31
center 109.05309295654297 0 201.76092529296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8288125645243536 0.44617068274925953 0.9133475680926633 }
radiance 31
center 74.97337341308594 0 209.74302673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8034604156068146 0.3624453897489269 0.995230929998197 }
radiance 28
center 122.52769470214844 0 210.4539031982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9249972184660505 0.3007523454834126 0.8097711872811323 }
radiance 31
center 88.94374084472656 0 165.25390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8657782748698402 0.333701201248368 0.8668805808975633 }
radiance 17
center 125.0416259765625 0 161.90982055664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9819008799765234 0.4046964034745647 0.9118526233720424 }
radiance 30
center 116.52647399902344 0 195.15969848632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8741734294687309 0.483385838746108 0.9470396325416083 }
radiance 27
center 92.59910583496094 0 165.88986206054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8655493356228562 0.4848549447993329 0.8079976305734577 }
radiance 29
center 57.54129409790039 0 164.3551483154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8399134338014766 0.4350266349554006 0.8878938891426825 }
radiance 21
center 74.60466003417969 0 180.61544799804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8628017612999361 0.41155481240144154 0.8334805774769282 }
radiance 24
center 116.45381164550781 0 164.02110290527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9840211831404806 0.4450583854781013 0.8181666650233006 }
radiance 30
center 80.33281707763672 0 215.5185089111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9476292074095517 0.3410171230205666 0.9342881719769057 }
radiance 22
center 57.39490509033203 0 183.91912841796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9484577522236455 0.49152864652879125 0.9942835035760401 }
radiance 31
center 86.80648040771484 0 185.7835235595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6289698434923235 0.4218552819472978 0.9 }
radiance 23
center 40.638675689697266 0 178.5035858154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9642893847303124 0.33478571573054433 0.9293633185068986 }
radiance 21
center 74.03277587890625 0 224.3101043701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9372335532767904 0.4108086836951651 0.9920689233028285 }
radiance 17
center 48.27722930908203 0 215.9468231201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.962668462266093 0.3006761719910243 0.959601100582642 }
radiance 31
center 64.91564178466797 0 181.77740478515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9071642263487201 0.4489115829311051 0.9120227490872534 }
radiance 30
center 47.03266906738281 0 184.17196655273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9750760003266312 0.38238516258624045 0.9436546758648258 }
radiance 30
center 39.02339553833008 0 178.2205810546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8770551742518069 0.4225159000671478 0.901334315060208 }
radiance 18
center 50.43899154663086 0 209.97323608398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46551158284859173 0.5260240697332181 }
radiance 23
center 35.50140380859375 0 198.6510467529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9762930789988624 0.42104277063567713 0.9531665072295641 }
radiance 23
center 37.885013580322266 0 176.1128387451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8380973450281779 0.3217737216782605 0.9085964591708401 }
radiance 17
center 65.7921371459961 0 176.96311950683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9096525052632968 0.47257346298408875 0.9945796391759968 }
radiance 22
center 56.40850830078125 0 203.33839416503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9834975761607354 0.47978786248626015 0.8464901864592467 }
radiance 17
center 8.764638900756836 0 204.61782836914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9207403768561837 0.3288522341208909 0.8103003140959777 }
radiance 18
center 26.720417022705078 0 212.43453979492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8757355946047186 0.4462763769970383 0.906603702098584 }
radiance 25
center 43.5366096496582 0 186.69383239746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533494251113781 0.38764448773155413 0.9765712239807313 }
radiance 22
center 24.385740280151367 0 192.72718811035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8724642605882563 0.33922548878940895 0.873984350858026 }
radiance 26
center -11.015743255615234 0 212.09173583984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9870051142587439 0.386693903528686 0.875237205680345 }
radiance 28
center 4.395425319671631 0 225.4253387451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7159790822668816 0.4221237952545069 0.9 }
radiance 16
center 21.167112350463867 0 187.7553253173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.914601137182514 0.4222651192911803 0.8583697077839074 }
radiance 22
center -8.164773941040039 0 215.2242889404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4812194016419071 0.784760972382058 }
radiance 18
center -25.94403076171875 0 211.0546417236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4047330838097395 0.696207729349819 }
radiance 19
center 15.639689445495605 0 218.80685424804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9343038273416501 0.4243058348687898 0.8061247570993365 }
radiance 22
center -9.673346519470215 0 192.72557067871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.882052814042652 0.30740470580308726 0.9152671808991366 }
radiance 25
center -35.094417572021484 0 213.24871826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.965104476422794 0.4807804206202375 0.8712856466636522 }
radiance 26
center -11.28955364227295 0 211.74440002441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4327730804999085 0.7072658577428164 }
radiance 24
center 8.310848236083984 0 170.05337524414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8891390887989694 0.47091746456233574 0.9031538519707616 }
radiance 19
center 13.351192474365234 0 209.47386169433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34672531011014307 0.46791249839614935 }
radiance 25
center -31.516305923461914 0 192.84292602539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9004462969132119 0.386610674489058 0.823778884569675 }
radiance 24
center -11.191268920898438 0 201.56484985351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45082265234775554 0.4125903103925841 }
radiance 19
center -16.12394905090332 0 187.4923553466797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4448006624523768 0.8587087239562456 }
radiance 22
center -24.085485458374023 0 159.46363830566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9625933824548801 0.34884413379567203 0.9953720533476804 }
radiance 27
center -5.401635646820068 0 180.63059997558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5930692366112261 0.32076672186120087 0.9 }
radiance 17
center -33.215362548828125 0 163.827392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8840335827253023 0.37578826974269386 0.940506869910109 }
radiance 24
center -76.6551513671875 0 179.512451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8480458654682611 0.36785572688698975 0.9846231455234448 }
radiance 21
center -24.260517120361328 0 178.78846740722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.918915028508451 0.34510969834413935 0.9911188868268725 }
radiance 25
center -52.32771682739258 0 158.9230499267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6925508707064164 0.3048088975462768 0.9 }
radiance 28
center -63.73670196533203 0 171.07472229003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8495251163802899 0.326435735278236 0.8126184201840813 }
radiance 22
center -20.3985538482666 0 190.4000701904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4475002613076554 0.6597260746766901 }
radiance 31
center -57.8424186706543 0 194.4142608642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8762506276565262 0.48239737852192305 0.9532764729892735 }
radiance 16
center -77.96057891845703 0 159.3072509765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.854342340220997 0.3072641110339651 0.9379949313276263 }
radiance 18
center -89.28731536865234 0 142.0602569580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8191927856585849 0.47995494622763013 0.9435157754751149 }
radiance 24
center -38.12094497680664 0 142.8402099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4276039700656593 0.4348520141652511 0.9 }
radiance 26
center -67.30459594726562 0 170.14920043945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6202180424544951 0.4571969046845762 0.9 }
radiance 24
center -96.1314926147461 0 133.55596923828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4308350208253817 0.44683803372925046 0.9 }
radiance 16
center -101.69564819335938 0 149.5449676513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8924233741211223 0.31301393988213716 0.8495561928822023 }
radiance 19
center -102.62337493896484 0 181.4744873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9109460728296718 0.37166451459177896 0.8118086396951787 }
radiance 25
center -88.24497985839844 0 171.54380798339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31232045046879436 0.6089255293009864 }
radiance 30
center -92.21228790283203 0 153.183349609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9056158230560201 0.36508936690369137 0.9015450369029488 }
radiance 27
center -105.73689270019531 0 159.97900390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8340014517462998 0.4971412097018293 0.8610406276648362 }
radiance 26
center -72.20343017578125 0 164.53927612304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8009603494627149 0.4881947390455993 0.9652317752735676 }
radiance 23
center -111.05357360839844 0 177.40769958496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9069907890965199 0.37037520769730614 0.8754433057190225 }
radiance 24
center -73.05339050292969 0 151.6496124267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3530505858342239 0.46373159364584415 }
radiance 24
center -66.65961456298828 0 173.40350341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8168213615650045 0.49344975326370577 0.9804466494486632 }
radiance 19
center -123.44602966308594 0 109.91983795166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4132041247883919 0.5357936297923099 }
radiance 29
center -84.08248138427734 0 128.6167755126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8821337766536296 0.3991742820715527 0.88685044351258 }
radiance 21
center -85.24060821533203 0 133.9033966064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45014698344821036 0.5601199192600756 }
radiance 21
center -118.54508972167969 0 152.52609252929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.48916172070181674 0.4258744887387994 0.9 }
radiance 18
center -91.53274536132812 0 159.78794860839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.869396566765307 0.3912794218799587 0.9027764963358493 }
radiance 31
center -84.01517486572266 0 151.4880828857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3825917635468532 0.6892864898205302 }
radiance 16
center -90.35125732421875 0 136.12692260742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8958725510082749 0.4400441516530642 0.8276043181209314 }
radiance 26
center -106.49027252197266 0 122.20433807373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9530749717633272 0.3464040341699571 0.8769594443472758 }
radiance 23
center -128.16757202148438 0 136.53428649902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9754037406358776 0.4848287975073302 0.8819414047492438 }
radiance 29
center -125.70374298095703 0 127.41543579101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9912516904241492 0.465680503655339 0.9187423040471339 }
radiance 19
center -127.61447143554688 0 96.03176879882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37642211198822867 0.5222591837405746 }
radiance 19
center -126.88799285888672 0 99.3875732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.394203240621258 0.5625134461409157 }
radiance 22
center -118.74261474609375 0 122.68690490722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.848782254829208 0.45490482825889633 0.8890778527947326 }
radiance 19
center -97.7054443359375 0 132.89108276367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7161038116667963 0.3740420466410057 0.9 }
radiance 23
center -122.14765930175781 0 123.42716979980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9613013948946395 0.38204428619416286 0.9256063229495157 }
radiance 20
center -113.82760620117188 0 100.64651489257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9098625118488984 0.3152618644880325 0.9922346273442537 }
radiance 24
center -114.60968017578125 0 75.24939727783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4848535635743365 0.3200888434782492 0.9 }
radiance 21
center -101.18415069580078 0 74.61420440673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9264036082301157 0.30501632451580846 0.9965492599421665 }
radiance 25
center -105.36273956298828 0 88.95845794677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6320221763798999 0.33534351720529537 0.9 }
radiance 18
center -142.48703002929688 0 71.10340881347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9371150294103741 0.49680683647804025 0.9254932085584314 }
radiance 27
center -127.95000457763672 0 107.0565414428711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9615044366872201 0.3667778770539953 0.9293634268899473 }
radiance 28
center -137.65499877929688 0 86.56755828857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6245826460968883 0.4168413896633285 0.9 }
radiance 23
center -125.6376724243164 0 83.2715835571289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.882657987940189 0.3878136188939949 0.9781897515203786 }
radiance 19
center -157.97337341308594 0 75.0020523071289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3878741811218279 0.8580019964930461 }
radiance 26
center -113.63320922851562 0 64.32247161865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205808808596316 0.3013848314478484 0.9525992550050202 }
radiance 17
center -112.78411865234375 0 47.751102447509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8021470618371569 0.48253704700206035 0.947361739252161 }
radiance 24
center -120.64665222167969 0 73.96638488769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8928101626434106 0.3613031508806868 0.9485428805976726 }
radiance 30
center -150.0990753173828 0 58.56005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8375250638128493 0.33258272733049027 0.9229619471813355 }
radiance 22
center -140.36709594726562 0 79.23617553710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.996270657840943 0.35945292392917466 0.9518216953921947 }
radiance 26
center -114.58399963378906 0 52.92084884643555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8590082970608433 0.33130000558800043 0.9412634580067362 }
radiance 21
center -145.6820831298828 0 28.059192657470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3524456575638556 0.6383725281911369 }
radiance 31
center -113.11799621582031 0 44.2208137512207
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5390357880802986 0.40224134017834334 0.9 }
radiance 21
center -118.7685775756836 0 47.1759147644043
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8989690509811287 0.4602153897458028 0.9464265208881233 }
radiance 29
center -153.51502990722656 0 69.5352783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9669714608101077 0.3083200635338118 0.9300676459344268 }
radiance 27
center -143.45448303222656 0 38.343692779541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9206168691176205 0.4351439113859023 0.976362116996838 }
radiance 21
center -133.6016387939453 0 60.001922607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5113482562079633 0.4317678504613511 0.9 }
radiance 27
center -126.78179168701172 0 45.83198165893555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9937841701444656 0.42828608147964115 0.9899008339310548 }
radiance 17
center -128.977783203125 0 25.372577667236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8492635898277932 0.4923155210649046 0.86072462749761 }
radiance 29
center -128.6063232421875 0 14.024773597717285
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4536698668797736 0.5749129055367739 }
radiance 19
center -164.43629455566406 0 21.996278762817383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4093616215556079 0.6717547336270672 }
radiance 18
center -119.32246398925781 0 44.61703109741211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49537202750319675 0.5305720656675671 }
radiance 24
center -118.62841033935547 0 2.418884754180908
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8525958961026949 0.314999252017832 0.9040298507198244 }
radiance 31
center -152.00547790527344 0 14.496504783630371
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8391051855573135 0.3002148456132728 0.972299479207815 }
radiance 28
center -121.37150573730469 0 5.672854900360107
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8170776040291159 0.41117532193351247 0.8263296986765233 }
radiance 28
center -153.8445281982422 0 38.798160552978516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9670129542272554 0.44587044731852105 0.9467693783348762 }
radiance 18
center -161.4380645751953 0 28.192371368408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8645665443222036 0.469644395942021 0.802481397263208 }
radiance 30
center -130.93487548828125 0 31.88563346862793
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8422676046754545 0.39756411102866007 0.9799717511281387 }
radiance 31
center -157.81655883789062 0 30.480810165405273
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.907829747733783 0.38246684329411934 0.8868855344931734 }
radiance 24
center -153.86532592773438 0 -8.331392288208008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9541898303130885 0.43619391124171536 0.8829231148003325 }
radiance 17
center -150.7567901611328 0 -10.905041694641113
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9051103550941854 0.3790013227885448 0.9186883986997588 }
radiance 24
center -126.28800201416016 0 -24.222702026367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5125178954987295 0.45474531913577576 0.9 }
radiance 21
center -121.51243591308594 0 -30.771743774414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9907305785144772 0.35223959401591654 0.8811174613961459 }
radiance 21
center -127.78015899658203 0 -31.022838592529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9141589423930194 0.46015135627344617 0.8408567907644257 }
radiance 21
center -156.11793518066406 0 -15.057870864868164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5942082088872569 0.4377404686439258 0.9 }
radiance 24
center -149.72438049316406 0 -12.775973320007324
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.934069063741896 0.32978786124095755 0.9288679077928359 }
radiance 17
center -157.38552856445312 0 3.030864715576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.903485207401696 0.32345314472042325 0.8709727399117968 }
radiance 20
center -155.3770751953125 0 -9.967991828918457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41108183804169 0.6117147925798035 }
radiance 20
center -148.1447296142578 0 -32.91023254394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8720427936947426 0.32589671127274034 0.8682478934650544 }
radiance 21
center -110.33180236816406 0 -40.0776252746582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9990883616235227 0.37724433155943926 0.8198081208365131 }
radiance 25
center -154.89405822753906 0 -25.897340774536133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9999512991633139 0.30528924218851905 0.9980456818669441 }
radiance 23
center -108.19182586669922 0 -27.3820743560791
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.837999185693275 0.4050696702252698 0.8700619463522417 }
radiance 20
center -119.34054565429688 0 -40.14283752441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8405930997433009 0.4122546640513528 0.8576680711798548 }
radiance 28
center -140.35308837890625 0 -50.89176559448242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866858956483631 0.4779099511179358 0.9611393593542313 }
radiance 30
center -123.09038543701172 0 -58.320396423339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.868067831944512 0.3460907855022253 0.9142089084669789 }
radiance 27
center -150.83323669433594 0 -41.60226058959961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9238931787125025 0.41337646168716197 0.9465670849565369 }
radiance 16
center -112.20983123779297 0 -58.3310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9454105011221215 0.49748103368985047 0.8666157459499537 }
radiance 25
center -138.60739135742188 0 -48.77705764770508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8645646536881519 0.48576975148770785 0.8967696871593278 }
radiance 16
center -135.58656311035156 0 -36.583717346191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9853138586030801 0.39856789298268985 0.9304272633250288 }
radiance 28
center -131.08009338378906 0 -52.140586853027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6988066488063317 0.43718767871443864 0.9 }
radiance 24
center -107.24047088623047 0 -35.960880279541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35242329584221743 0.781996254461963 }
radiance 30
center -135.15707397460938 0 -66.26569366455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9333162083101841 0.45230645742895037 0.8878487671572383 }
radiance 26
center -90.8974380493164 0 -68.30435180664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4093090015128975 0.7653749744065856 }
radiance 27
center -130.21298217773438 0 -37.49688720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42945856371727453 0.41200839976967996 0.9 }
radiance 22
center -122.2903060913086 0 -77.2633285522461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9474116849281028 0.33371336154459436 0.9841653228378979 }
radiance 24
center -106.0761489868164 0 -79.44784545898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.858500733629789 0.34161823692800497 0.829951738377687 }
radiance 17
center -81.9521484375 0 -81.34876251220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8844376099125397 0.3082046280232036 0.9271227108973387 }
radiance 20
center -117.25359344482422 0 -65.14412689208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7815386451416139 0.39872385210912603 0.9 }
radiance 22
center -109.96500396728516 0 -52.60760498046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8293779589050763 0.3329365379869272 0.9423808616110876 }
radiance 26
center -82.69645690917969 0 -90.91847229003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9298120073512723 0.47837008975158724 0.9082604096457575 }
radiance 30
center -95.74880981445312 0 -61.803157806396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8382027519462346 0.47178576540799033 0.9172921144597509 }
radiance 20
center -76.90845489501953 0 -67.17149353027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.836036301477973 0.46168329869902736 0.8908506350380316 }
radiance 29
center -100.87274932861328 0 -91.28510284423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9350349685790237 0.352482582884521 0.9878095227681631 }
radiance 22
center -95.21981048583984 0 -101.95856475830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8697086588204501 0.31023493766868415 0.8722976023683285 }
radiance 27
center -107.24022674560547 0 -77.5734634399414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3203627849575282 0.7569477955797369 }
radiance 16
center -104.1929702758789 0 -62.55060958862305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48054370774528077 0.7047671325216223 }
radiance 25
center -84.40211486816406 0 -90.13316345214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9876204670934561 0.44748820789106136 0.8453885898488217 }
radiance 16
center -70.5953598022461 0 -96.78652954101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.865956796157997 0.3421371177042437 0.8194623522863584 }
radiance 27
center -78.89376068115234 0 -108.77618408203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8382146002729858 0.482982330743247 0.8444885853546747 }
radiance 27
center -90.7093276977539 0 -89.44344329833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8947307723045139 0.3435701393186999 0.9 }
radiance 20
center -99.1849136352539 0 -95.01380157470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8471111819609315 0.45628693477098137 0.8043246860091093 }
radiance 19
center -70.6471939086914 0 -78.10843658447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8861444335786693 0.4033401677145138 0.891887847067907 }
radiance 28
center -89.65586853027344 0 -110.39083862304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8117207908533957 0.39428034730789685 0.9 }
radiance 22
center -66.62057495117188 0 -106.36384582519531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4086840385946572 0.6885140770064809 }
radiance 31
center -61.307044982910156 0 -97.75677490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.83255679696361 0.4329889937979512 0.8214856711325892 }
radiance 27
center -98.9408950805664 0 -93.8134536743164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45011976970477785 0.680598444722521 }
radiance 28
center -45.11173629760742 0 -123.39497375488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9323681925453222 0.42577922326488493 0.8052893564125772 }
radiance 23
center -76.52455139160156 0 -122.36774444580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4967565079578047 0.37029614471849737 0.9 }
radiance 24
center -74.9494857788086 0 -85.58911895751953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4887981545105302 0.4748320091032129 }
radiance 26
center -59.91294860839844 0 -96.64927673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308941037659661 0.47139097340223124 0.8121328330457807 }
radiance 27
center -48.86967849731445 0 -89.34488677978516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9174214103039934 0.3673448334024931 0.9903282691319909 }
radiance 30
center -44.475547790527344 0 -118.8148422241211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9407004404634199 0.35567228772984066 0.998822645362324 }
radiance 21
center -64.23613739013672 0 -119.21061706542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8813715589124727 0.4741878545380058 0.9889962793408605 }
radiance 16
center -54.90461349487305 0 -90.7906494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3039149772148907 0.7386509096225714 }
radiance 24
center -65.44725036621094 0 -125.95661163330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5867395530475334 0.46319029495733227 0.9 }
radiance 26
center -54.063453674316406 0 -116.74954986572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43906978295271293 0.4422869847376252 0.9 }
radiance 18
center -52.98511505126953 0 -93.39070129394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8737206216870476 0.3311778169980222 0.8566510083821819 }
radiance 21
center -18.958398818969727 0 -121.66808319091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9671656392138865 0.3267842652839824 0.884723695824575 }
radiance 16
center -20.09781265258789 0 -104.73631286621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9680802267312372 0.36370742472928586 0.964264377724883 }
radiance 20
center -29.319290161132812 0 -98.33522033691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8699119851732361 0.466614122469161 0.8535923911249914 }
radiance 27
center -43.99481201171875 0 -121.49320983886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4675573217925125 0.5512551491138766 }
radiance 26
center -28.509246826171875 0 -138.49862670898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9047149636065739 0.4971403700157543 0.8214830186122156 }
radiance 24
center -9.377596855163574 0 -118.05747985839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5422137024122836 0.41317619940492967 0.9 }
radiance 28
center -22.68610954284668 0 -111.38684844970703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9802010047570993 0.4377244450967772 0.8248121183836605 }
radiance 24
center -50.20734786987305 0 -105.43926239013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8353550519762649 0.37360602097161055 0.9237356764748856 }
radiance 23
center -45.427921295166016 0 -110.27542114257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9539781025442595 0.3081162721115199 0.879531547830335 }
radiance 19
center 3.2681896686553955 0 -100.81672668457031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9770398536281054 0.43372087651840013 0.8181797966361055 }
radiance 29
center -29.223543167114258 0 -103.7789077758789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7059584361646544 0.3024691853956301 0.9 }
radiance 20
center -23.681354522705078 0 -139.02508544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.856084902546605 0.4936977314644182 0.8990237908700144 }
radiance 20
center -10.864986419677734 0 -101.58238220214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8742353544949503 0.4829424552209031 0.960459524594639 }
radiance 25
center -29.137493133544922 0 -102.84513854980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8457227802714737 0.4808589917746062 0.8613947777431386 }
radiance 16
center 11.182412147521973 0 -113.71348571777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8099400752003125 0.45068690739603234 0.9481506829786126 }
radiance 19
center -6.059659004211426 0 -118.66853332519531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42212953284985444 0.8814605561581513 }
radiance 30
center -20.222984313964844 0 -142.0877227783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8969550954695472 0.46994019488341604 0.9672724119508356 }
radiance 27
center -3.582103967666626 0 -142.36439514160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.925083238189594 0.32665736983927346 0.8228575600512159 }
radiance 27
center 15.168211936950684 0 -101.02599334716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8648822510676792 0.3703419588840161 0.8060368299355026 }
radiance 22
center -0.6809953451156616 0 -102.57817077636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5271865137712013 0.4609889304127788 0.9 }
radiance 30
center 0.6461331248283386 0 -123.87736511230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9032959749160564 0.4301005250093697 0.9949828917379322 }
radiance 20
center 10.916709899902344 0 -138.63636779785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8306687596514819 0.4599304497920839 0.9 }
radiance 21
center 10.450119018554688 0 -133.02719116210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9587784496162677 0.3048568781925436 0.9216365245530328 }
radiance 16
center 27.839107513427734 0 -132.06019592285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8521832813521159 0.49025613999004614 0.9 }
radiance 21
center 8.227317810058594 0 -134.85301208496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.924373997436782 0.4934310738959543 0.8479401865038609 }
radiance 21
center 9.470453262329102 0 -114.86532592773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9241914493870114 0.49183732008577163 0.8161691840623437 }
radiance 23
center 16.538145065307617 0 -121.6883316040039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8452018359721544 0.39874156672012473 0.9026889264157891 }
radiance 24
center 2.79022479057312 0 -102.36141204833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.473423397964589 0.552740602641889 }
radiance 28
center 23.5946044921875 0 -128.87139892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41928507828826866 0.3640018460839137 0.9 }
radiance 31
center 21.61553192138672 0 -136.1375274658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5360049508720262 0.3496124327027865 0.9 }
radiance 22
center 57.40025329589844 0 -104.53805541992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8955686698318701 0.38249713825538423 0.8710405005464377 }
radiance 27
center 44.72307586669922 0 -103.59544372558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9788243987934799 0.4207754713619826 0.9498268833939811 }
radiance 31
center 26.376543045043945 0 -103.25677490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8709116452714554 0.4896291695942967 0.9551343005196408 }
radiance 24
center 48.950042724609375 0 -109.58915710449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8997852870199492 0.49683240033292797 0.9212092665005733 }
radiance 29
center 38.39238739013672 0 -115.51090240478516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7117786342263955 0.4550112492003235 0.9 }
radiance 19
center 34.98152160644531 0 -128.11810302734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3809625590719782 0.6589259739107853 }
radiance 23
center 39.2935676574707 0 -129.26026916503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8271635843651857 0.35792402573886517 0.8734692150883732 }
radiance 19
center 55.72488784790039 0 -125.45210266113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8418051242821538 0.43204268506866883 0.9643876582500467 }
radiance 17
center 67.17655181884766 0 -127.31665802001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.916689898674018 0.434651556400744 0.8927905166073744 }
radiance 17
center 62.5850715637207 0 -118.46082305908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7527568846938647 0.3312009677579141 0.9 }
radiance 25
center 88.90435028076172 0 -110.39932250976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8781914438822485 0.33098125715533017 0.8435583939527835 }
radiance 26
center 63.59538650512695 0 -99.74324798583984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9952465943411574 0.42517802688051365 0.9829439352009395 }
radiance 18
center 59.62801742553711 0 -111.44696044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8375760726398576 0.3960819251955924 0.8898494400846639 }
radiance 20
center 73.04281616210938 0 -86.28762817382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8289541730369984 0.47240495301295937 0.923116824293827 }
radiance 16
center 100.50791931152344 0 -94.38851165771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9852215222053471 0.30957198597825347 0.81721403522934 }
radiance 27
center 91.6942367553711 0 -79.30770874023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4933185523118251 0.5923225303821568 }
radiance 18
center 70.08975982666016 0 -108.79888153076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44354975136308766 0.7751751217010692 }
radiance 16
center 93.88703155517578 0 -104.32587432861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8598687401368383 0.38118120622713264 0.9 }
radiance 30
center 62.96070098876953 0 -82.51058959960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9477389010362358 0.4194619996041108 0.9696048022106798 }
radiance 20
center 90.80805206298828 0 -93.34622955322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7426518861218232 0.4540719795946352 0.9 }
radiance 16
center 75.62992095947266 0 -88.31080627441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4726867671099393 0.8352465299970577 }
radiance 16
center 81.80899047851562 0 -73.38641357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6274622819031587 0.40171225743491756 0.9 }
radiance 16
center 84.31755828857422 0 -73.09818267822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.868237159562417 0.42767359018977386 0.855496025294707 }
radiance 19
center 92.7884750366211 0 -88.60208892822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8744247587393652 0.4796889149386804 0.9921547785057117 }
radiance 22
center 90.84369659423828 0 -83.92070007324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9292432274402413 0.3744865615084744 0.8529602874518362 }
radiance 17
center 114.26023864746094 0 -53.49641799926758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9127724178620003 0.30641144761104966 0.8535434526799658 }
radiance 30
center 87.97808074951172 0 -61.68833923339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8593748580554066 0.4339452417352109 0.8911889177181928 }
radiance 17
center 84.90897369384766 0 -83.04460144042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5693322160492533 0.47759898593598005 0.9 }
radiance 29
center 106.00701904296875 0 -56.69584655761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9311834017921986 0.4350906212543538 0.8843012594320057 }
radiance 26
center 122.02440643310547 0 -78.95765686035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8308977801038292 0.3769211010384863 0.9270739217952978 }
radiance 17
center 130.52487182617188 0 -56.98506546020508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9313634788517902 0.3638525880555422 0.810022535818205 }
radiance 21
center 104.0366439819336 0 -50.784969329833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8066566027212895 0.38514696371397883 0.858077308651923 }
radiance 20
center 102.21163940429688 0 -42.73842239379883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8565540736375866 0.441132303426663 0.904792453576324 }
radiance 18
center 109.0360107421875 0 -49.024959564208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9425317470374744 0.33692376335439617 0.9141409008183807 }
radiance 31
center 132.48297119140625 0 -45.65532684326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8869165180477799 0.41862605786965584 0.9654963117790308 }
radiance 23
center 127.31741333007812 0 -44.86778259277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.901178544853682 0.49257980045451943 0.9635117461961644 }
radiance 30
center 131.21060180664062 0 -51.81348419189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6862565626360615 0.39784244938459146 0.9 }
radiance 30
center 108.33519744873047 0 -28.49445343017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9932849055160411 0.3202652109761122 0.8539750374903778 }
radiance 22
center 127.86141967773438 0 -43.595359802246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9981157371662731 0.49347523104644697 0.829334900738303 }
radiance 22
center 104.18140411376953 0 -29.191572189331055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.951935214847172 0.4127651995688423 0.9260842514185975 }
radiance 23
center 120.74506378173828 0 -33.711814880371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6501894418923083 0.46612813227075994 0.9 }
radiance 16
center 120.55704498291016 0 -46.846092224121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9685898493517098 0.37905956262037344 0.9630155022144838 }
radiance 21
center 128.3307647705078 0 -40.307926177978516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9586181684805493 0.38427052602608297 0.9975874573070229 }
radiance 19
center 125.19175720214844 0 -46.87326431274414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9061910775316029 0.4446045929635756 0.961104330991722 }
radiance 17
center 137.60568237304688 0 -20.55763816833496
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.434642068584006 0.37027082360221425 0.9 }
radiance 24
center 134.06056213378906 0 -23.00493621826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8854252138232618 0.30532280767867565 0.9313864245225596 }
radiance 20
center 132.3147735595703 0 -7.934024333953857
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4935452270130498 0.8973063412290806 }
radiance 19
center 125.74225616455078 0 -4.61082649230957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4542472838327648 0.8301084302951259 }
radiance 26
center 116.52488708496094 0 -0.4257359206676483
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8387486853290711 0.336870564902289 0.814717051699284 }
radiance 23
center 115.05414581298828 0 7.679797172546387
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4502891504793602 0.8442748396362457 }
radiance 27
center 132.24697875976562 0 -0.6815788149833679
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8446240052841175 0.37429136108923566 0.9054694860578801 }
radiance 19
center 113.73077392578125 0 -14.486985206604004
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8954102664907224 0.32368777097150986 0.9 }
radiance 16
center 119.27999877929688 0 -10.621037483215332
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.572320282262601 0.3298480913727709 0.9 }
radiance 21
center 113.04711151123047 0 9.234527587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8488185785089019 0.4241797196231383 0.9361042131552207 }
radiance 17
center 136.4817657470703 0 26.29070472717285
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9332997721224618 0.3104458944751713 0.8700944292848942 }
radiance 30
center 109.57299041748047 0 2.662513494491577
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8700639881510965 0.30048788485169337 0.9 }
radiance 26
center 114.787109375 0 26.263057708740234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.895501138413592 0.4396568905927195 0.8007198043697387 }
radiance 26
center 113.45367431640625 0 -3.5160186290740967
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5832464497155924 0.3905424310892436 0.9 }
radiance 21
center 126.20759582519531 0 -5.202666759490967
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8528154339603473 0.425121393205135 0.8483373850137687 }
radiance 30
center 120.45632934570312 0 6.8412322998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8916026629199436 0.41003643236278714 0.9836470620638964 }
radiance 26
center 127.14752960205078 0 39.51120376586914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8846090774352205 0.46972371751698877 0.9522341123486157 }
radiance 31
center 138.9299774169922 0 22.16024398803711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448114747213731 0.4343965081591271 0.999494777217317 }
radiance 20
center 133.1531982421875 0 8.262435913085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6946087333468179 0.43674020212790043 0.9 }
radiance 17
center 127.4135971069336 0 10.361034393310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9490450441554341 0.3637572377656239 0.9630527320848221 }
radiance 24
center 109.78204345703125 0 36.01631164550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7164260103975341 0.3471504291938537 0.9 }
radiance 26
center 134.11952209472656 0 42.14527893066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7212661481158185 0.4209784637774364 0.9 }
radiance 23
center 107.90271759033203 0 40.4862060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9398287425195793 0.3607793381516214 0.8172513185473277 }
radiance 25
center 118.35436248779297 0 28.279176712036133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9743730723881519 0.3631768612709262 0.8134599594842602 }
radiance 26
center 138.26934814453125 0 42.59667205810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8581136424131882 0.30876812975091267 0.8039775906151566 }
radiance 25
center 101.61432647705078 0 66.14891815185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7757499818304208 0.433242699150717 0.9 }
radiance 23
center 119.62506866455078 0 46.48418426513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4233563944142832 0.6193006442391847 }
radiance 19
center 106.47323608398438 0 51.14928436279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8202105062159187 0.39634981747606773 0.9369601175772133 }
radiance 26
center 109.02820587158203 0 58.664119720458984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9352690173919416 0.39457454441644624 0.9138127627425061 }
radiance 25
center 117.11431884765625 0 62.72563171386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8071918882320501 0.4198154990426472 0.9192723995213001 }
radiance 31
center 93.00628662109375 0 75.69235229492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8539059949239289 0.4110924919049385 0.8193513678893266 }
radiance 27
center 99.26847839355469 0 45.43167495727539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9398601543760172 0.309485000481562 0.8027863333577978 }
radiance 24
center 104.70068359375 0 44.234764099121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9686783142068323 0.41237876561620207 0.8747856789762386 }
radiance 26
center 123.81009674072266 0 46.66806411743164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9527857306656595 0.3792824756270227 0.9071546052299841 }
radiance 16
center 96.80653381347656 0 67.34766387939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.804423638942561 0.44905498310060227 0.8676429002066095 }
radiance 22
center 89.00843048095703 0 66.6741943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38417102832395333 0.6282425039331591 }
radiance 31
center 109.87026977539062 0 75.99993896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9116276949666786 0.3007266012712711 0.9257058098502837 }
radiance 21
center 100.67546844482422 0 69.52200317382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8009653087146786 0.4217800162319624 0.9948410134022175 }
radiance 21
center 91.91483306884766 0 62.683433532714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9473104110837942 0.47475189923967565 0.9644013481293554 }
radiance 29
center 86.70821380615234 0 84.12422943115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4648238373690962 0.8831342633782008 }
radiance 30
center 84.02716064453125 0 84.93881225585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8523497955395392 0.3380181757607859 0.87394641531846 }
radiance 16
center 83.62028503417969 0 94.4520492553711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3196622110965381 0.5311701333774561 }
radiance 22
center 78.589111328125 0 98.25653839111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412405492714645 0.43438963998844293 0.8114517498740879 }
radiance 29
center 95.35157012939453 0 90.00940704345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38581580060270226 0.5421725789828714 }
radiance 25
center 105.89649963378906 0 66.42742156982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8540705714907199 0.4049051066782938 0.8845438276396838 }
radiance 21
center 62.82759094238281 0 79.08055114746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212134599402134 0.36234367796150035 0.9132134743876216 }
radiance 21
center 65.68639373779297 0 98.11180114746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.901935254399108 0.38226987948172264 0.8982013839265932 }
radiance 24
center 74.92127227783203 0 93.45288848876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8198372253962803 0.3247870487872206 0.987995382675626 }
radiance 30
center 66.7427749633789 0 83.04679107666016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9963581507195315 0.31791776628064955 0.9668483903067698 }
radiance 29
center 85.11677551269531 0 100.85397338867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47911320470958985 0.4801351196203698 }
radiance 25
center 74.31591796875 0 112.58004760742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9199048941103298 0.4004017753855009 0.9681476844527478 }
radiance 21
center 72.6226577758789 0 85.84688568115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9278546389332717 0.4099705511426047 0.8040003209443295 }
radiance 18
center 80.59359741210938 0 88.79747772216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8761890173510619 0.35020132847473073 0.8582387223979302 }
radiance 17
center 64.87007904052734 0 103.0206527709961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9322110850841533 0.4040268058654337 0.8595053330068279 }
radiance 29
center 72.93413543701172 0 94.29295349121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8492232412325242 0.4041398726241211 0.9451940669155291 }
radiance 18
center 51.02566146850586 0 102.57584381103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47976501315837405 0.49218282971744454 }
radiance 27
center 47.347965240478516 0 91.34777069091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9570071573285243 0.4746774451105533 0.967647915495197 }
radiance 28
center 71.68157196044922 0 108.54866790771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5763090606298922 0.3692421861410384 0.9 }
radiance 26
center 66.62442016601562 0 86.34556579589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9390927601263165 0.3943944767059001 0.9272137195805464 }
radiance 16
center 41.478057861328125 0 86.55935668945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8141710313187108 0.3641495565815009 0.8141442251196662 }
radiance 16
center 35.26692199707031 0 120.09100341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8051352724427159 0.4863741874877976 0.8169370160829267 }
radiance 25
center 31.217872619628906 0 88.85041046142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9198048488189151 0.42664728836438126 0.8816054790635639 }
radiance 23
center 32.75749206542969 0 96.04774475097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842981518107274 0.4812047918722676 0.9054003824971011 }
radiance 17
center 57.41342544555664 0 96.89697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9883460951643773 0.3112848676012082 0.9922272465931532 }
radiance 16
center 32.273719787597656 0 95.81680297851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4723641142377572 0.6690305489538354 }
radiance 31
center 25.677316665649414 0 109.469970703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8376210100703858 0.4477747021408566 0.815963684691662 }
radiance 30
center 21.8876953125 0 101.5088882446289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8049674498768017 0.4244833378568773 0.8538954696342498 }
radiance 29
center 18.118932723999023 0 110.8655014038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5155659495330828 0.4054735668133673 0.9 }
radiance 27
center 34.96336364746094 0 106.77141571044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.903576237606489 0.39048048249643197 0.9174916336850181 }
radiance 18
center 30.702253341674805 0 105.30143737792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9877491746702672 0.46552688715749724 0.9324420278649096 }
radiance 25
center 22.531658172607422 0 101.43610382080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31672174303224226 0.43900659991993085 }
radiance 19
center 1.0886166095733643 0 102.48085021972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9770905951854896 0.4013715549188354 0.8697156008854977 }
radiance 26
center 23.313268661499023 0 102.39987182617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8546600460620735 0.3068111864241562 0.8438079967508204 }
radiance 22
center 4.174789905548096 0 119.36637878417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8692561279669988 0.38147314821665756 0.8493793205113711 }
radiance 28
center 30.53109359741211 0 101.46678924560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8716802400079233 0.47886688633270297 0.9978133812848706 }
radiance 19
center -9.96289348602295 0 103.97081756591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.928353505795936 0.37342809800167565 0.8919246494179169 }
radiance 24
center 7.15247106552124 0 117.70134735107422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8561313454483246 0.38285275445696576 0.9888113123273599 }
radiance 16
center -9.638023376464844 0 103.3232650756836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8067660097886133 0.4845411326325282 0.966062642956429 }
radiance 25
center -1.510030746459961 0 104.06555938720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8312808942972345 0.35839047735530943 0.8690982867145176 }
radiance 18
center 15.95504093170166 0 111.15857696533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.816480961444588 0.31037435072846703 0.9597587158469214 }
radiance 24
center -5.827320575714111 0 111.59550476074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8767121692332054 0.47670838625987344 0.9694349137264507 }
radiance 30
center -10.595178604125977 0 100.28063201904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9915989764131471 0.4831484514002451 0.9857967830035586 }
radiance 17
center -19.25688362121582 0 100.83231353759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8660111758263596 0.36648029624924017 0.9064120166432774 }
radiance 22
center 0.41486912965774536 0 93.18222045898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4802350856213945 0.6850604476169087 }
radiance 22
center -23.004169464111328 0 96.4022216796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3650371847210089 0.8801112928682756 }
radiance 26
center -20.713369369506836 0 90.93926239013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8229892096662066 0.43826720919882267 0.8234404228802923 }
radiance 20
center -40.9802131652832 0 103.95887756347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9652257548957095 0.38757963892495473 0.9925951077119147 }
radiance 27
center -32.38230895996094 0 101.19912719726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8723958895550825 0.4118200021545818 0.888876503784917 }
radiance 17
center -22.94701385498047 0 99.83964538574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33707048238325743 0.6072614005329793 }
radiance 31
center -23.424575805664062 0 77.28182983398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8901785833930748 0.3133813348504498 0.9736029561475482 }
radiance 18
center -41.33729553222656 0 69.66895294189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42994711183167444 0.6215059005048027 }
radiance 27
center -29.217594146728516 0 82.63432312011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8941214101096976 0.321944048822319 0.8069784739495686 }
radiance 18
center -48.60418701171875 0 87.10459899902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9093106500284177 0.3219545054918039 0.9374104167052728 }
radiance 29
center -33.63478469848633 0 71.08486938476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9598583446721163 0.47790650671749435 0.9208512462570977 }
radiance 20
center -48.61048889160156 0 80.3570556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9831873656344496 0.3625517513126427 0.8405899695261062 }
radiance 16
center -42.1084098815918 0 73.39257049560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8185775172195462 0.3053898705110859 0.9965486770207412 }
radiance 31
center -54.035438537597656 0 60.13574981689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533578201707368 0.47771214870872447 0.941684280526711 }
radiance 31
center -58.66352844238281 0 87.0851058959961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9064231328299289 0.4461774768909277 0.9221753489519394 }
radiance 30
center -40.0458869934082 0 71.90362548828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3923770034254216 0.7156673643500762 }
radiance 17
center -54.303070068359375 0 76.69288635253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40203636667961706 0.45023447147710466 0.9 }
radiance 27
center -60.273841857910156 0 49.56357955932617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9901304234831141 0.4673505434972208 0.8351775958727775 }
radiance 25
center -46.60160827636719 0 52.66062545776367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4658652883489217 0.8391615965020911 }
radiance 22
center -43.1961784362793 0 76.3461685180664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46401795832603165 0.658307414599049 }
radiance 23
center -60.24696731567383 0 75.25859069824219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9580091533974441 0.4364968924020629 0.8850453753696705 }
radiance 21
center -47.59421157836914 0 55.92795944213867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.840437004684443 0.45620597896073856 0.8126250080922027 }
radiance 18
center -62.79038619995117 0 61.820213317871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9900465624371383 0.41050932435956006 0.8553361496429371 }
radiance 22
center -56.07489013671875 0 38.63630294799805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8339652360173373 0.49954179251833963 0.9 }
radiance 18
center -58.42279052734375 0 58.18281173706055
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7352275481672165 0.39042383722606455 0.9 }
radiance 17
center -73.2380599975586 0 37.58071517944336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8602925855320274 0.37811109686338107 0.8122460129982676 }
radiance 23
center -62.995147705078125 0 56.87383270263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9141959569503997 0.4723598056178574 0.845496841032736 }
radiance 28
center -59.679473876953125 0 40.257545471191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867103740244313 0.4278452255897306 0.88280262076228 }
radiance 16
center -57.28209686279297 0 22.810382843017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8874511114504835 0.39321663098641724 0.9582839069899279 }
radiance 27
center -58.001075744628906 0 33.807430267333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9313436556712109 0.4287208347493142 0.9277884876177067 }
radiance 21
center -60.188072204589844 0 30.40095329284668
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4161730987890274 0.6456958924751679 }
radiance 18
center -67.91261291503906 0 22.366069793701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8104363492724811 0.43389898210744277 0.9 }
radiance 17
center -73.20841217041016 0 23.569398880004883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4547177158022892 0.6036217208830242 }
radiance 20
center -74.89012908935547 0 15.362890243530273
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8946498698930934 0.40940015540238517 0.8997782374639389 }
radiance 24
center -85.1976318359375 0 27.512720108032227
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9947568208982759 0.3088384284711395 0.9195751257301847 }
radiance 18
center -74.02603149414062 0 26.64847183227539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9805868883905803 0.49734245080458594 0.9902074839891064 }
radiance 21
center -63.206424713134766 0 34.53489303588867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8758707464081248 0.4219418654626488 0.9 }
radiance 24
center -70.27784729003906 0 8.997758865356445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30629221410239565 0.5136245096176827 }
radiance 23
center -80.4581298828125 0 1.2195805311203003
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8628337467036398 0.36240752644264884 0.9817407600783687 }
radiance 26
center -59.585853576660156 0 -0.8037054538726807
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445173171195306 0.44137003501634997 0.8649755198865516 }
radiance 25
center -79.88160705566406 0 10.607476234436035
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.410563598881303 0.4060036813746539 0.9 }
radiance 16
center -72.60325622558594 0 -2.2119393348693848
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9138053040985559 0.45500207786208036 0.9848892858320946 }
radiance 16
center -371.64190673828125 0 -21.89015769958496
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5042585016992737 0.3023360137010998 0.9 }
radiance 18
center -451.6939697265625 0 -2.26930570602417
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4642929946693517 0.3257491567327527 0.9 }
radiance 26
center -425.0542907714844 0 -62.081668853759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9210065796588539 0.3264844379427266 0.9644823363289098 }
radiance 24
center -481.7294616699219 0 -62.503047943115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8953204569644131 0.3700357410908263 0.9843553585529888 }
radiance 19
center -444.4967346191406 0 -103.7232666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.435870402332984 0.30128157647420506 0.9 }
radiance 27
center -468.4432373046875 0 -124.0732650756836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5391346606856667 0.4830143608414206 0.9 }
radiance 30
center -455.2062072753906 0 -121.07080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8460599228666461 0.4761636513711398 0.9563572553185082 }
radiance 19
center -487.2975769042969 0 -112.07273864746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8094513124526301 0.3153242324337689 0.8372495567962462 }
radiance 16
center -453.86883544921875 0 -58.047325134277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3308382103559723 0.8857660885230872 }
radiance 31
center -451.6186828613281 0 -55.20859146118164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8597062861755282 0.466445702034042 0.9788143962612843 }
radiance 16
center -390.1377868652344 0 -154.0769500732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9113312118212554 0.4029304757695099 0.9746975208867136 }
radiance 21
center -419.0937805175781 0 -66.32010650634766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3162596106693784 0.7915427542897616 }
radiance 31
center -443.69659423828125 0 -125.19792938232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8939699210749635 0.3411982845164652 0.9962723071719783 }
radiance 26
center -375.4623718261719 0 -101.10518646240234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32712772580227234 0.7304485388203792 }
radiance 29
center -373.5083923339844 0 -101.29289245605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5282732652913582 0.4512952362438084 0.9 }
radiance 16
center -419.947265625 0 -89.36090850830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9268561359250922 0.3573241408840877 0.9430455404292168 }
radiance 19
center -431.8778991699219 0 -97.92955780029297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.889759712478778 0.47596216395246554 0.8546228873386094 }
radiance 21
center -398.5715026855469 0 -137.9091033935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8439398444898181 0.42914442700773414 0.8274348905182876 }
radiance 25
center -390.8104553222656 0 -149.20614624023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9681625430433205 0.36664831295256906 0.957181866488931 }
radiance 18
center -477.33416748046875 0 -98.81295013427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9343910576734423 0.30136173838509206 0.8434283760054719 }
radiance 17
center -376.69976806640625 0 -180.7562713623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37828496489377 0.8257121900076767 }
radiance 20
center -469.1990051269531 0 -139.57052612304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9976561058033409 0.4427176191865566 0.8677655653020745 }
radiance 16
center -438.23333740234375 0 -190.52743530273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9788159191465774 0.467726352783671 0.9647084443967125 }
radiance 18
center -467.16424560546875 0 -151.722900390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8398717149011866 0.30013024920686654 0.8893529257423929 }
radiance 18
center -345.5636291503906 0 -122.2084732055664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9449212910014236 0.40472239002160476 0.8084284959979455 }
radiance 28
center -442.60943603515625 0 -174.2001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9010973679710729 0.33847842162902536 0.9484626543492409 }
radiance 17
center -451.2779846191406 0 -210.79818725585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9492141513106773 0.3219133762121793 0.9930672800656086 }
radiance 22
center -362.6429748535156 0 -210.9134521484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9882181806677812 0.35856789307511155 0.9161242300694061 }
radiance 18
center -341.6302795410156 0 -125.9890365600586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8243368341963928 0.4094077284231691 0.9292529535990398 }
radiance 26
center -421.6542053222656 0 -190.80223083496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9061502257691523 0.437890714776219 0.9423692296357433 }
radiance 24
center -382.9968566894531 0 -163.29647827148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9052380678012797 0.4559061603358743 0.9275449543865204 }
radiance 23
center -389.95379638671875 0 -121.8931655883789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8830268342983962 0.436740913162902 0.8128551500649516 }
radiance 26
center -352.9777526855469 0 -208.58303833007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867559348642552 0.3649000919415075 0.9231766493315103 }
radiance 17
center -419.9724426269531 0 -157.4757537841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6997612876316035 0.49125116289488496 0.9 }
radiance 21
center -442.368408203125 0 -127.38521575927734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9475520953090165 0.40606847241190247 0.9975250646367608 }
radiance 20
center -393.08551025390625 0 -190.8336639404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9094746610888957 0.4597057471796925 0.9010542689790129 }
radiance 26
center -412.3707275390625 0 -190.4462432861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8879620749973834 0.36093232841963185 0.9 }
radiance 22
center -361.1577453613281 0 -219.65316772460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8435393815296437 0.32920295059542526 0.9527658150802092 }
radiance 27
center -335.775634765625 0 -259.4978332519531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9806596561621761 0.46601200416625654 0.9127438635696721 }
radiance 21
center -337.994873046875 0 -219.5475311279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9348570464846842 0.4084959848195182 0.8337748120694572 }
radiance 29
center -365.9300842285156 0 -183.38250732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9073956431614046 0.4107364205543966 0.9414770999067679 }
radiance 22
center -299.5691223144531 0 -199.82611083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9876106448147565 0.3469754618315553 0.9655080431075144 }
radiance 19
center -377.2737121582031 0 -262.9503173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8715738466365776 0.3818236175123282 0.993899008875062 }
radiance 31
center -412.927001953125 0 -234.2232666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6226576078514244 0.4562413720018216 0.9 }
radiance 31
center -327.61956787109375 0 -231.0596160888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9641528045632455 0.43530252678582826 0.9576220734192601 }
radiance 17
center -371.4340515136719 0 -291.1739501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9214706622334402 0.367675322098461 0.8643769167572148 }
radiance 16
center -388.3912658691406 0 -255.81838989257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9681451665072213 0.4086245280021672 0.8269126874950183 }
radiance 21
center -295.7696228027344 0 -201.7169189453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44812610185560975 0.8543911782777249 }
radiance 26
center -365.86767578125 0 -191.78451538085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9165893801706642 0.39590960317329804 0.8033586712298829 }
radiance 29
center -347.9731750488281 0 -298.891357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8480958427591317 0.3284064838758534 0.8788596751468303 }
radiance 20
center -322.0389099121094 0 -230.92446899414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8718754329564733 0.4051629635133216 0.8974002047137856 }
radiance 31
center -266.1226806640625 0 -318.3750305175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5208107780806766 0.38990266102422527 0.9 }
radiance 16
center -338.0323181152344 0 -211.6875762939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8463316785846293 0.4349523262906375 0.985656202066536 }
radiance 18
center -266.0766296386719 0 -224.13290405273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6193788695229431 0.3057568459030529 0.9 }
radiance 16
center -275.6302490234375 0 -311.10626220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8774627281930824 0.36039935327414546 0.9806967734242176 }
radiance 21
center -261.0307922363281 0 -332.17047119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8696825152738314 0.44035457331760997 0.926533862170793 }
radiance 22
center -252.71485900878906 0 -250.072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4454612246420421 0.3625258411171883 0.9 }
radiance 29
center -366.6571044921875 0 -222.43955993652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8257241861737508 0.3832496586407058 0.8954237145240198 }
radiance 16
center -248.09608459472656 0 -221.028076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4072898975064174 0.3445651311436469 0.9 }
radiance 26
center -301.84912109375 0 -232.84176635742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9390869905400568 0.37216512409350017 0.9486068061236448 }
radiance 22
center -328.1250305175781 0 -258.1332092285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47039724251171233 0.8219818474979045 }
radiance 16
center -270.9547424316406 0 -233.3014678955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8907313362860388 0.4894294026478796 0.8846890440856979 }
radiance 17
center -332.3619384765625 0 -327.3021545410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8010281502684171 0.33689094720361784 0.8758202301134065 }
radiance 28
center -286.7323303222656 0 -280.50274658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3515231640111832 0.8181304266714731 }
radiance 22
center -274.26654052734375 0 -278.5457763671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8625351483925097 0.4284276236514874 0.9898137481408713 }
radiance 29
center -318.1077880859375 0 -249.06410217285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5285355796371608 0.32914433154589423 0.9 }
radiance 30
center -213.7610626220703 0 -257.202880859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6154406019263039 0.3705987148934201 0.9 }
radiance 27
center -307.7991027832031 0 -264.7982482910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9605422316515707 0.3536331892161274 0.923098403319281 }
radiance 28
center -232.2409210205078 0 -329.39727783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892990521822476 0.34026963825378537 0.8642141481224527 }
radiance 16
center -213.76573181152344 0 -360.65496826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8974888008494752 0.41723254313684527 0.9916230275449986 }
radiance 24
center -233.40130615234375 0 -299.01666259765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7440136242557704 0.46778884002538906 0.9 }
radiance 27
center -310.5765075683594 0 -370.4637145996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9635029658784524 0.393989583475178 0.9054469196029201 }
radiance 20
center -220.7304229736328 0 -286.824951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8010612706447058 0.4236043506287252 0.917314029751167 }
radiance 17
center -210.9244842529297 0 -273.9887390136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.504386954912113 0.4721374630271111 0.9 }
radiance 30
center -251.32833862304688 0 -279.04351806640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5477377232232526 0.33067059283832223 0.9 }
radiance 18
center -185.8749542236328 0 -372.32257080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8607937789877064 0.37070682538542477 0.970677946573944 }
radiance 22
center -275.9028015136719 0 -338.59991455078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9580949776173866 0.3411804739624094 0.8880465344263835 }
radiance 25
center -213.59048461914062 0 -305.934326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892704165300005 0.3453336089036778 0.9004281579986514 }
radiance 18
center -228.755126953125 0 -301.7733154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.479249260015177 0.7126375851372206 }
radiance 28
center -215.39845275878906 0 -362.5006408691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4795103148376525 0.6286970934335838 }
radiance 25
center -192.0668182373047 0 -336.02801513671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9933216102276099 0.4516354997700589 0.9637468805691196 }
radiance 28
center -237.1451873779297 0 -377.5675048828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.419755661418753 0.7050078380264554 }
radiance 20
center -215.57998657226562 0 -388.1675109863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8047989939366909 0.3401561599130963 0.851450230878021 }
radiance 25
center -177.61973571777344 0 -310.23046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.861316334925336 0.4090168078908656 0.8080958174011987 }
radiance 21
center -183.37889099121094 0 -300.814453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9658390650732759 0.44105349762768553 0.9587711790113268 }
radiance 27
center -178.10891723632812 0 -341.1997985839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33213312645457344 0.7982996092910221 }
radiance 16
center -201.73443603515625 0 -329.6131591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844158866368727 0.44609257782464995 0.9764887959274134 }
radiance 18
center -144.0296630859375 0 -312.0780334472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8723692732177847 0.4191166275357431 0.9 }
radiance 21
center -189.4292755126953 0 -370.9069519042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8889700736836086 0.3298598204836943 0.9571737789213961 }
radiance 25
center -150.7467041015625 0 -351.50567626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5797558230023765 0.33089241253649265 0.9 }
radiance 22
center -149.7906494140625 0 -318.9024963378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9976563445997482 0.48603869572065517 0.800154448978964 }
radiance 22
center -116.38206481933594 0 -297.2374267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8425522438533086 0.49320150918430794 0.8940936378743081 }
radiance 17
center -196.83384704589844 0 -398.7653503417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37162142979139123 0.7374077214827512 }
radiance 21
center -221.9446563720703 0 -404.0203552246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5555368371469638 0.41542844762774633 0.9 }
radiance 26
center -170.20266723632812 0 -407.98974609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4711446782344262 0.575726079225795 }
radiance 21
center -156.5098876953125 0 -388.1265869140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9510823789234245 0.3087561158404933 0.928587277723822 }
radiance 29
center -98.26921081542969 0 -311.6792907714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33708751534137776 0.8744446559067864 }
radiance 27
center -131.7097625732422 0 -311.02215576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8766162361683291 0.411297234507938 0.9 }
radiance 16
center -94.19966888427734 0 -313.5509338378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8035251225473912 0.4853560303351085 0.8186002660615948 }
radiance 26
center -169.80270385742188 0 -333.4004821777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8488424432152275 0.4120860009465863 0.8911590032331578 }
radiance 27
center -86.31494140625 0 -419.2290344238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8760010745556791 0.3547210170253598 0.8475365600187421 }
radiance 30
center -139.02549743652344 0 -401.2207336425781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.610675691333451 0.4116482372145315 0.9 }
radiance 21
center -145.16134643554688 0 -415.5888977050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8505379938904902 0.45902061137588857 0.9504462280266712 }
radiance 17
center -151.69427490234375 0 -417.0937805175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.660017266155942 0.3466169486316312 0.9 }
radiance 26
center -123.2989730834961 0 -335.70343017578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8851558051668216 0.47968046862498354 0.9306218457828463 }
radiance 28
center -141.50479125976562 0 -346.3831787109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3097318205612775 0.7040268106529342 }
radiance 28
center -104.6407241821289 0 -374.2016296386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9020709923384111 0.4555094880179996 0.8246969067330581 }
radiance 25
center -156.10598754882812 0 -399.0921325683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8912389652684877 0.4965548649668048 0.9408463376288766 }
radiance 28
center -132.4829559326172 0 -321.4370422363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8237223131235487 0.4203081302893322 0.8244182260878961 }
radiance 23
center -143.68765258789062 0 -355.74200439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8157379839257609 0.4537765044560128 0.9886708315490469 }
radiance 28
center -127.01591491699219 0 -331.73712158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9456204655860394 0.3758118004643533 0.9418451532645916 }
radiance 21
center -125.0352554321289 0 -358.9272766113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9159006691235281 0.34759100142937704 0.9324200394465247 }
radiance 29
center -25.04286766052246 0 -342.2564392089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8452323620727351 0.4390446690669161 0.9845468509175954 }
radiance 31
center -139.36041259765625 0 -359.1268005371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4412484212994686 0.8269405003719882 }
radiance 23
center -67.36756896972656 0 -398.3148498535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9308157524508258 0.3332063586204764 0.9640450455664573 }
radiance 25
center -25.627389907836914 0 -425.8332214355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8125336694372239 0.4327982949671424 0.8773985256248413 }
radiance 23
center -102.24699401855469 0 -381.94708251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.844907202713878 0.46865407744100807 0.827107442227999 }
radiance 30
center -88.78083038330078 0 -429.0452880859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.919084879600853 0.48907519592246496 0.8413665316323289 }
radiance 31
center -95.23020935058594 0 -416.3993835449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9990460734055963 0.3155860278354208 0.8964987844358896 }
radiance 23
center -7.728515148162842 0 -395.562744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8586022978753799 0.460468620189178 0.8455877705588519 }
radiance 29
center -35.70383071899414 0 -413.0304870605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8393781541831283 0.31987550785422153 0.8366292422108091 }
radiance 26
center -78.4596176147461 0 -330.3641662597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8665520094051875 0.3256209866314236 0.8055041976289787 }
radiance 31
center 14.380074501037598 0 -344.0752868652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9936163292027753 0.415756266723206 0.8202107787395705 }
radiance 19
center -86.77901458740234 0 -419.79095458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46543333474972404 0.5357209903123524 }
radiance 21
center -57.31221389770508 0 -421.587158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8522915575916042 0.32761534763337413 0.8258407417468654 }
radiance 21
center -5.128239154815674 0 -319.0240173339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.423839654715888 0.6568702529686349 }
radiance 17
center -41.59037780761719 0 -330.49969482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9851938629332277 0.3307408905239295 0.9081048864431351 }
radiance 28
center 5.432226657867432 0 -342.4247741699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8342848235807212 0.39382734437694966 0.8630512001782675 }
radiance 25
center 3.8290395736694336 0 -322.36700439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4645145540530644 0.7608407475008964 }
radiance 21
center -15.886981964111328 0 -334.4770202636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8092354044194702 0.32012747590115226 0.9216659675178887 }
radiance 22
center 24.10003662109375 0 -323.0245666503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42394855339112353 0.8666923724184631 }
radiance 22
center -9.235068321228027 0 -342.13177490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8590645914157838 0.3155289424325396 0.8409847391886575 }
radiance 27
center 16.47067642211914 0 -360.9306945800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8470482958316858 0.3320984402072999 0.9196918519430024 }
radiance 19
center 40.50211715698242 0 -400.0950927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5612248241851333 0.3956319520184445 0.9 }
radiance 26
center 60.34226608276367 0 -409.58538818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8277855588704596 0.4369339655394058 0.8177396729374776 }
radiance 29
center 66.08089447021484 0 -313.36114501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9064572314437896 0.42819470217811106 0.831166533769349 }
radiance 31
center 53.41676330566406 0 -401.26556396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9671540878911282 0.31168974940712274 0.8349195760696726 }
radiance 27
center 2.794966220855713 0 -367.9298400878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32180802624136645 0.4807952261102675 }
radiance 17
center 40.80772018432617 0 -404.9344787597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9324335725067416 0.44049991233690444 0.9023437153361535 }
radiance 24
center 36.0222282409668 0 -389.8105773925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8817507572949492 0.4519973765829819 0.912394387630908 }
radiance 17
center 49.41730499267578 0 -408.61663818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9192407588736412 0.3226164785330962 0.9693383421133294 }
radiance 22
center 7.70484733581543 0 -320.3158874511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8718998558277989 0.31105363698320027 0.9062981675012607 }
radiance 30
center 81.6566390991211 0 -353.9273986816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9030310614714265 0.33475262910149045 0.9000246954068161 }
radiance 22
center 83.78644561767578 0 -317.13934326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8331077074985372 0.3226696127076073 0.8990497466099914 }
radiance 25
center 1.4680746793746948 0 -367.2275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9860008128861325 0.39165089655270935 0.953031797319653 }
radiance 26
center 76.83607482910156 0 -299.0426330566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9828349253671512 0.37644328082180695 0.9085670728769931 }
radiance 29
center 73.03556823730469 0 -300.2138366699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8600074628169945 0.3066586028393333 0.9887448244234746 }
radiance 29
center 32.75708770751953 0 -311.89190673828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8863609076461223 0.3589695239108379 0.9 }
radiance 24
center 41.8047981262207 0 -329.13275146484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9214902092124687 0.49532773829343685 0.8379315147873717 }
radiance 31
center 108.84931182861328 0 -319.52838134765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8385565904294253 0.3756287692632273 0.9838225303959062 }
radiance 19
center 98.36260223388672 0 -359.8434143066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32196263013323667 0.7310912780328516 }
radiance 16
center 130.80899047851562 0 -367.76220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8862151954320597 0.4440382153649688 0.9418020146977022 }
radiance 20
center 70.42379760742188 0 -340.6673278808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9218355462426109 0.35424974338358084 0.9113183980279301 }
radiance 29
center 130.1504364013672 0 -298.0740966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45779260991784354 0.8768940783081504 }
radiance 24
center 70.77667236328125 0 -311.5401916503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9471775001874193 0.4902579833751872 0.900517075881646 }
radiance 18
center 52.83769226074219 0 -281.10357666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9718618773683507 0.38386240217043344 0.9070197832650801 }
radiance 17
center 121.20033264160156 0 -285.41534423828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42465269667146466 0.3511053780387137 0.9 }
radiance 29
center 117.5378646850586 0 -284.16070556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.853413151762509 0.37936592566746175 0.8371573667939357 }
radiance 25
center 73.63713073730469 0 -276.5164489746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9119930235271642 0.4740882534299077 0.896533729305575 }
radiance 24
center 60.19302749633789 0 -306.66314697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9942043114009307 0.34183310989943566 0.9141087575678155 }
radiance 17
center 118.970947265625 0 -264.2381591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.411517956656972 0.38906318570260967 0.9 }
radiance 20
center 88.80795288085938 0 -347.0729675292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5607312396139016 0.35349971637922906 0.9 }
radiance 19
center 77.09468078613281 0 -367.6376647949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9413965582477672 0.3688077185341503 0.9108806319760407 }
radiance 30
center 107.3381118774414 0 -269.064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8046785060557402 0.3752200463360882 0.8730161181460101 }
radiance 21
center 130.7183380126953 0 -265.7751770019531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9317383343737198 0.42604410085919986 0.8882109053254521 }
radiance 27
center 142.70465087890625 0 -276.1495361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4160790681886367 0.38430997924106647 0.9 }
radiance 29
center 102.55205535888672 0 -349.144775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4206584302585352 0.43979038195227305 0.9 }
radiance 19
center 169.45425415039062 0 -263.0401916503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8530307764412148 0.332469657314309 0.8298701590773385 }
radiance 27
center 176.4257354736328 0 -252.5223846435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8582811015471012 0.4747859213839244 0.9366344911478143 }
radiance 20
center 118.17845916748047 0 -350.2147216796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9292956136377292 0.36149511976801624 0.9533683309798499 }
radiance 31
center 183.26031494140625 0 -290.3773193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603711475203221 0.4241407425965249 0.9307446997041694 }
radiance 27
center 207.5382537841797 0 -309.1996765136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8359632856351012 0.36268787779596456 0.9260749913792179 }
radiance 25
center 161.44805908203125 0 -329.4213562011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.870419855186822 0.48048538264919705 0.8887713645024948 }
radiance 27
center 190.9148406982422 0 -339.7335205078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9457403015751119 0.358106988305707 0.9449848925766313 }
radiance 21
center 108.58760070800781 0 -253.87754821777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9237885404137632 0.3632336384710282 0.9580983194743398 }
radiance 26
center 127.62217712402344 0 -264.7265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9916093117377571 0.38605124111769984 0.9722055289098939 }
radiance 24
center 182.85760498046875 0 -279.4294738769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9001455162816717 0.4368775184528829 0.9351677540884935 }
radiance 17
center 134.25758361816406 0 -283.35784912109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9909944673278842 0.3327279932241856 0.8681469112871549 }
radiance 29
center 141.22093200683594 0 -301.7072448730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47200809901600393 0.31387931595261215 0.9 }
radiance 29
center 138.9228515625 0 -264.9205017089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6423202737165582 0.35772207788310423 0.9 }
radiance 16
center 207.87025451660156 0 -288.5668029785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8188537564134246 0.48713536012140235 0.8305802298848293 }
radiance 28
center 140.2779541015625 0 -236.4257049560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8072779800477428 0.4139633883458726 0.8203547849907953 }
radiance 19
center 207.793212890625 0 -219.70269775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9556283708142468 0.4505380128622394 0.9428115792356194 }
radiance 25
center 198.09414672851562 0 -276.42730712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9716454892765469 0.3458353063326007 0.8682756660292952 }
radiance 20
center 189.60255432128906 0 -258.86468505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.801223685294555 0.40830171955136135 0.9901461758757633 }
radiance 30
center 196.45208740234375 0 -299.227783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48264180389908473 0.7260623180433211 }
radiance 26
center 166.1605987548828 0 -295.0087585449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9804815134727123 0.42198789526185254 0.8186124770561242 }
radiance 20
center 165.54025268554688 0 -242.01747131347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8802365255582141 0.34714684202823426 0.962331224461148 }
radiance 20
center 227.41563415527344 0 -228.8760223388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9549145011611688 0.4449281234778172 0.9606143744127743 }
radiance 19
center 153.52651977539062 0 -294.91278076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8387558946269653 0.38818513291895557 0.9222853990448459 }
radiance 27
center 210.96420288085938 0 -215.60882568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.975802266340612 0.3089326791657951 0.8083485394285533 }
radiance 26
center 178.11009216308594 0 -266.0887451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5384223294892072 0.30685445186937904 0.9 }
radiance 19
center 163.0814666748047 0 -212.741455078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.850873765828452 0.42166901871187124 0.8973448419299848 }
radiance 30
center 254.1451873779297 0 -280.87054443359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8885579834659255 0.48930451814892983 0.9249763940661777 }
radiance 22
center 241.34730529785156 0 -185.4765167236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9598041006684387 0.4113828381195702 0.8895971818359345 }
radiance 30
center 230.32830810546875 0 -225.12493896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8592786509417552 0.369873223780321 0.9750588940992537 }
radiance 19
center 252.7873077392578 0 -267.2234191894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9916342716123797 0.48797823555086084 0.8447074350333285 }
radiance 21
center 176.71560668945312 0 -269.29150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3870989355534057 0.6036218124699659 }
radiance 29
center 190.48878479003906 0 -239.0411834716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8237529137690054 0.3640881017086979 0.9364675633882743 }
radiance 22
center 235.82960510253906 0 -204.45773315429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.875105244693489 0.3404192895264154 0.820434182050934 }
radiance 22
center 186.03977966308594 0 -173.47821044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8678617420511677 0.4978988439611438 0.8399266823080163 }
radiance 31
center 266.2542419433594 0 -215.42247009277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8643173797480107 0.4471025942249647 0.8314181748642193 }
radiance 20
center 200.51544189453125 0 -246.17626953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8007639345907309 0.49278813470013916 0.8208690860323322 }
radiance 21
center 255.425537109375 0 -176.2445068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8399965405127316 0.37201125212914476 0.8604488633291563 }
radiance 26
center 198.31417846679688 0 -194.04917907714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8983466927820132 0.3294399006240419 0.8193688031987135 }
radiance 22
center 270.7495422363281 0 -187.64540100097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9691358146683755 0.37891237993547655 0.8289648080939893 }
radiance 21
center 191.21286010742188 0 -171.4995574951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8010317109327313 0.3381423540971502 0.9525385756028742 }
radiance 27
center 246.72421264648438 0 -208.49142456054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9736465833047175 0.3204993594153778 0.8106121167680189 }
radiance 18
center 287.5015563964844 0 -158.20594787597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8147084241160436 0.34356932753482866 0.9082026280745947 }
radiance 20
center 221.16258239746094 0 -195.14974975585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4142233647223203 0.6477044388162031 }
radiance 23
center 252.7855987548828 0 -187.79859924316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.516100732560966 0.43536597072004823 0.9 }
radiance 17
center 219.1689453125 0 -154.7999725341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834894027710179 0.43487885748036126 0.9927293871464679 }
radiance 20
center 275.7459716796875 0 -203.1718292236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.985539522827285 0.3822966014265101 0.920965185263094 }
radiance 21
center 275.27178955078125 0 -139.28822326660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9867738896252488 0.31541805300723375 0.8920504461922198 }
radiance 19
center 271.94708251953125 0 -213.2501983642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8383683023238744 0.4573911858806438 0.8718922549265482 }
radiance 25
center 269.14532470703125 0 -97.62001037597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9164928964083549 0.35438321663688455 0.9837028802589212 }
radiance 20
center 285.9223327636719 0 -159.3194122314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8095299685376731 0.42676789787661873 0.8164602399695863 }
radiance 28
center 227.63546752929688 0 -120.1846694946289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30551269186874813 0.8207849915308058 }
radiance 17
center 229.5508270263672 0 -168.14820861816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8249670979021844 0.48733985759190157 0.9198767137994827 }
radiance 30
center 261.4886474609375 0 -106.83100128173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9845506134339582 0.39781642440134013 0.9274583807534046 }
radiance 25
center 288.851806640625 0 -172.21832275390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.924335226398084 0.43711953520361835 0.9676289284204939 }
radiance 22
center 222.33319091796875 0 -159.5226287841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46389915339543 0.5699219641562039 }
radiance 16
center 261.9826354980469 0 -164.94337463378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8344190128747151 0.39216715715234185 0.9440568103242891 }
radiance 19
center 273.2403564453125 0 -147.06613159179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9236856843332286 0.39893094136688745 0.9930201273892372 }
radiance 27
center 216.9066619873047 0 -123.42160034179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.907689588869222 0.31393247960544196 0.8664054954949183 }
radiance 18
center 293.8416442871094 0 -114.4342269897461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8635079351155357 0.4181428680452872 0.898547687414984 }
radiance 20
center 221.39959716796875 0 -104.40081024169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30932372361056254 0.5227278005105949 }
radiance 19
center 305.65185546875 0 -71.1218490600586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8376902816416144 0.4537850611573385 0.9032159099968913 }
radiance 23
center 236.94851684570312 0 -98.6299057006836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3079629559965398 0.8294307377761885 }
radiance 16
center 242.7698974609375 0 -117.47254180908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4785180513456554 0.8961731425791188 }
radiance 24
center 219.66226196289062 0 -136.6329803466797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9383664527097164 0.4480657090754768 0.8677377985281094 }
radiance 21
center 296.19158935546875 0 -135.32176208496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8734672855086367 0.3461911054210594 0.9128097008436402 }
radiance 21
center 312.6078796386719 0 -73.59375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9133515498075535 0.4614226865560706 0.9147432639483584 }
radiance 20
center 236.02651977539062 0 -105.04747772216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8895862360831834 0.46570317595557853 0.9403078993073888 }
radiance 30
center 279.59869384765625 0 -64.2029800415039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9318806713952741 0.44424220115534574 0.9137592669706707 }
radiance 21
center 289.8638000488281 0 -91.82131958007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9055014723817838 0.42679487614538936 0.9462119256211617 }
radiance 19
center 316.38385009765625 0 -86.31173706054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130401716508686 0.4507038775698202 0.9824229906193649 }
radiance 31
center 317.0736999511719 0 -57.706912994384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9240919121849677 0.36908674126448804 0.9205443353901654 }
radiance 30
center 256.1857604980469 0 -115.28031921386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4473330919433982 0.8921626319180178 }
radiance 21
center 286.91192626953125 0 -70.8958740234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47252084537698064 0.6626516471905927 }
radiance 16
center 252.74679565429688 0 -40.962677001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8055179014110411 0.31845093640266686 0.8301874902819972 }
radiance 20
center 267.38812255859375 0 -35.39125061035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8477352586772097 0.4038158601664248 0.907421104376104 }
radiance 31
center 312.6549987792969 0 -71.1531982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9340801101620023 0.47783843033269935 0.9690196369739499 }
radiance 26
center 282.0209655761719 0 -49.41576385498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9402730641092027 0.3215253461280152 0.9727144608457794 }
radiance 21
center 298.2401428222656 0 -22.47271156311035
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4951689127254184 0.8226814649855047 }
radiance 26
center 247.0864715576172 0 -60.164955139160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9933412541550051 0.36148099881595513 0.8150305454007594 }
radiance 31
center 227.71096801757812 0 -61.3086051940918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8606995599708901 0.30382787444881115 0.8444376363293864 }
radiance 23
center 266.2147521972656 0 -0.7676358222961426
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7034687135297745 0.345758428798986 0.9 }
radiance 20
center 312.92156982421875 0 -22.68717384338379
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.887284200984186 0.32170187993822136 0.9082828485387047 }
radiance 23
center 239.15234375 0 -10.341543197631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9092680883847369 0.32810690744339366 0.8058421925045055 }
radiance 23
center 289.19573974609375 0 13.391427040100098
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8937021940331418 0.3849376811602533 0.8648140819885246 }
radiance 16
center 254.632080078125 0 -6.302696704864502
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.318123988298315 0.7412929487286564 }
radiance 21
center 222.48876953125 0 -42.88288879394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8679332630476112 0.38188933041190587 0.8682706063010746 }
radiance 16
center 291.14154052734375 0 22.5908145904541
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43534004028130446 0.8485980926104575 }
radiance 29
center 268.25396728515625 0 -37.26786422729492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43396271582726537 0.6095373186899737 }
radiance 21
center 229.06773376464844 0 3.7260687351226807
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8573092841115788 0.46594886094655275 0.9254158437586135 }
radiance 18
center 251.44407653808594 0 -26.810386657714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9411644544760165 0.34053314295288206 0.9462473194520418 }
radiance 27
center 244.41268920898438 0 20.843971252441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8944778533418665 0.31466019065124656 0.9156394237722503 }
radiance 19
center 222.6376953125 0 -34.70160675048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8704625191362989 0.4297250720477576 0.8059599066995629 }
radiance 18
center 312.927978515625 0 31.598024368286133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.999714951327775 0.4516581429193608 0.9582127559762808 }
radiance 29
center 225.63719177246094 0 60.034568786621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603321062657766 0.4432860002451996 0.9550974995062504 }
radiance 28
center 306.0230407714844 0 17.483558654785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8310791671126261 0.44370815193133073 0.8716713228391675 }
radiance 20
center 214.65896606445312 0 66.83676147460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9984900927850324 0.4471383788121742 0.9779505097316704 }
radiance 17
center 217.15774536132812 0 -7.199464321136475
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45192476086558864 0.5760083697802336 }
radiance 21
center 223.4968719482422 0 52.225154876708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.971666846961902 0.4476466286096217 0.8641030447899902 }
radiance 21
center 219.90965270996094 0 79.3474349975586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8810185702816674 0.4637706496915531 0.8394814898345087 }
radiance 27
center 216.44094848632812 0 -1.9801548719406128
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5902828341476783 0.35940514830749026 0.9 }
radiance 25
center 284.6229248046875 0 59.310611724853516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9593571016373377 0.36935620377813394 0.9551972442865617 }
radiance 24
center 302.49700927734375 0 22.348876953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39676725749910147 0.7105332773981912 }
radiance 30
center 279.769775390625 0 -0.5175435543060303
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4247018133807745 0.7845996986310954 }
radiance 23
center 238.3441162109375 0 77.08785247802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9104489050828709 0.458571543676519 0.8405011161400444 }
radiance 29
center 212.51052856445312 0 67.83550262451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6817040484048301 0.3370058365197766 0.9 }
radiance 25
center 283.2939758300781 0 67.31046295166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9460832749813737 0.4256722250576199 0.8984817659397255 }
radiance 26
center 276.73394775390625 0 99.1108169555664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9152842546121616 0.41415504130516057 0.9599759660934838 }
radiance 28
center 272.84515380859375 0 30.014589309692383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130011720460883 0.36457457803035975 0.9586953409481818 }
radiance 18
center 237.92803955078125 0 54.63705825805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9737669811131688 0.4634791021899849 0.8775655609846194 }
radiance 28
center 229.25369262695312 0 71.03355407714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8205160921363392 0.3281204155174276 0.8392156674155766 }
radiance 19
center 275.2192077636719 0 65.88214111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8250109446961047 0.3888708087211006 0.8975705349902511 }
radiance 16
center 242.6029510498047 0 33.9407958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8963661549957322 0.417989298797534 0.8908766856691895 }
radiance 23
center 270.0052490234375 0 94.43572998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9307187196991367 0.4434448860407516 0.916223942998407 }
radiance 23
center 227.27696228027344 0 72.84143829345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41693715018373667 0.38868818833013985 0.9 }
radiance 30
center 237.69644165039062 0 130.61622619628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7961705366203068 0.3297115069262942 0.9 }
radiance 19
center 242.04173278808594 0 123.33590698242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6773571610631618 0.37044743660133905 0.9 }
radiance 18
center 280.2136535644531 0 94.17047119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9115901577056102 0.31428676967111474 0.990833035759233 }
radiance 19
center 252.97900390625 0 83.18817901611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32074271739976984 0.7094254428562986 }
radiance 23
center 183.30250549316406 0 147.74038696289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.932813178092292 0.4077023852569349 0.9975028010748973 }
radiance 31
center 227.60525512695312 0 144.12130737304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8347743756132393 0.43089396304916655 0.8001607548019192 }
radiance 22
center 264.538818359375 0 107.43599700927734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.895101032889495 0.32234632211876996 0.9656750992067078 }
radiance 16
center 255.06210327148438 0 82.74073791503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8165856497711941 0.3732950790990649 0.8269056055035888 }
radiance 21
center 250.77627563476562 0 78.86336517333984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9419457559561579 0.4783018755560721 0.9980697590970418 }
radiance 19
center 201.3408966064453 0 157.42567443847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8742242628585996 0.30845169816923096 0.8380954628656341 }
radiance 28
center 228.28665161132812 0 151.2470245361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9328243081741476 0.3452082339612765 0.8448062604721969 }
radiance 21
center 235.2272186279297 0 73.08125305175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8345190613923954 0.3551535421519174 0.9216568349121186 }
radiance 25
center 181.94528198242188 0 84.12214660644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9321593124488324 0.3328267350291535 0.9049163345743048 }
radiance 25
center 201.74920654296875 0 142.8915557861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9862344448873779 0.4314652398583606 0.9476269457566127 }
radiance 20
center 229.6431884765625 0 164.77134704589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8298955278105864 0.33494313243862367 0.949014417007991 }
radiance 20
center 164.91807556152344 0 154.69764709472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8691162547432605 0.48677277889905674 0.8155930170626485 }
radiance 24
center 237.68060302734375 0 172.4192657470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3277056754804797 0.851314765170331 }
radiance 28
center 201.73684692382812 0 129.65008544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8379624145266269 0.42481862776402907 0.8015774645819749 }
radiance 19
center 206.12258911132812 0 123.15753936767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8319179794567539 0.3857078738031626 0.837573788900866 }
radiance 24
center 203.090087890625 0 185.2091827392578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.829568401551566 0.33233871851095703 0.9496241739842102 }
radiance 20
center 167.843994140625 0 120.04570007324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8841119399145516 0.3747845795690483 0.9058215413213442 }
radiance 24
center 229.7565460205078 0 107.77250671386719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9922238678466275 0.3098040200414823 0.8702681664055727 }
radiance 20
center 191.0763702392578 0 109.21722412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8545562277929184 0.3424586277649369 0.9547683674709534 }
radiance 21
center 162.4596405029297 0 176.62913513183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6538726985118032 0.4163808364268784 0.9 }
radiance 22
center 171.36990356445312 0 138.36439514160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9876093910138222 0.380336484427304 0.8781140337891935 }
radiance 22
center 154.58541870117188 0 155.9228515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8476547106043264 0.4664017130570397 0.9061591250110357 }
radiance 20
center 177.20596313476562 0 126.5706558227539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6437720020054672 0.30803373592387356 0.9 }
radiance 26
center 145.13433837890625 0 130.36314392089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9162094553844419 0.35364552000296584 0.8096596025702099 }
radiance 28
center 207.4293212890625 0 181.9687957763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8761830373063034 0.4267198349927269 0.8612505486903991 }
radiance 27
center 196.25741577148438 0 133.66822814941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9291370723453297 0.45369173144711816 0.9571609002643474 }
radiance 20
center 126.1716537475586 0 165.4832000732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130741019356876 0.40774242512420145 0.9601661768883093 }
radiance 28
center 149.22003173828125 0 181.32273864746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8069298250040664 0.33984066359754156 0.9242151621274397 }
radiance 17
center 167.96803283691406 0 196.37503051757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9370028537592349 0.3982295182183192 0.9595291618194197 }
radiance 27
center 207.0305938720703 0 186.27894592285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7942243913183735 0.31943905567869424 0.9 }
radiance 22
center 150.49142456054688 0 152.44813537597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.925367394218806 0.492357531594224 0.8047785145785951 }
radiance 26
center 183.94366455078125 0 147.8767852783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9373799810914697 0.4173263827038176 0.9206133942999952 }
radiance 30
center 187.66908264160156 0 152.24581909179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9398735023705589 0.41704481541759986 0.9063275683062101 }
radiance 20
center 192.17828369140625 0 143.36520385742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45645313040872104 0.5288897664222072 }
radiance 28
center 159.69281005859375 0 176.7336883544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40174273582056785 0.7891708364236286 }
radiance 30
center 110.09249877929688 0 221.5515899658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8570132216218929 0.40568564566235965 0.9696086793367827 }
radiance 30
center 186.3102264404297 0 161.60768127441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9819571497202161 0.32358767610266 0.9134181476111864 }
radiance 23
center 141.04893493652344 0 149.12857055664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8540143864862322 0.498089149830655 0.9084698953410035 }
radiance 17
center 183.0486297607422 0 180.0393524169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7794329411089808 0.3409639681515883 0.9 }
radiance 16
center 118.28772735595703 0 213.016845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8111754579427322 0.36495391090887974 0.9166611269152872 }
radiance 31
center 138.03237915039062 0 220.4207305908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47919874377355454 0.6042479211102003 }
radiance 31
center 171.1663360595703 0 234.74981689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39624212744483944 0.759377138138755 }
radiance 24
center 130.0381622314453 0 214.02439880371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.912377192468119 0.41922877076777465 0.9080726261152106 }
radiance 21
center 118.41080474853516 0 198.70596313476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8214824089749023 0.39048999213598556 0.8921879866153091 }
radiance 29
center 98.1839599609375 0 210.70172119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.855007922761559 0.3781053966401454 0.8853346388000342 }
radiance 29
center 115.72997283935547 0 222.42156982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9391933967864632 0.3233426734380003 0.9947396151539734 }
radiance 27
center 90.62061309814453 0 174.498291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8326073525914351 0.3237913673490369 0.8065934203929328 }
radiance 22
center 104.23750305175781 0 173.27029418945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9183196945818669 0.48655758261979065 0.9677744506887751 }
radiance 29
center 143.9415740966797 0 208.7521514892578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.895243452634387 0.4579784533259148 0.990767225823375 }
radiance 24
center 89.62126159667969 0 168.93914794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.911114545491556 0.36725921814219775 0.9945173076286663 }
radiance 17
center 127.1277847290039 0 241.25741577148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301978148765771 0.40041760937266113 0.9932139010186469 }
radiance 30
center 113.9498062133789 0 216.5655059814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44563323762558005 0.7346298728918195 }
radiance 20
center 96.34841918945312 0 244.15625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35826658345078277 0.7682869481724264 }
radiance 29
center 88.03363800048828 0 239.75331115722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8785038047393505 0.33344069014590755 0.8696196661737643 }
radiance 24
center 140.00608825683594 0 175.46910095214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9732369196154795 0.4400591207733504 0.9816958653103509 }
radiance 30
center 103.48463439941406 0 230.17005920410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9608979080401789 0.4814353106332815 0.8179233078337373 }
radiance 31
center 112.7389144897461 0 242.234619140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4519640278376571 0.6404935837863086 }
radiance 17
center 58.1781005859375 0 209.9378662109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9897347165113045 0.460691879681312 0.8421452074043319 }
radiance 24
center 56.56854248046875 0 255.6827392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9369762888516944 0.38065955156777614 0.9337459795166858 }
radiance 25
center 123.18251037597656 0 214.34837341308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4602200176429141 0.7978700095889155 }
radiance 27
center 91.80543518066406 0 254.2215576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8794169612103816 0.3546253528702813 0.9693174864512284 }
radiance 21
center 62.13842010498047 0 204.54783630371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8635184889349108 0.4431562999764675 0.8751963609771756 }
radiance 22
center 84.25202941894531 0 200.56993103027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9832783748300055 0.36430825224988456 0.8639499837091982 }
radiance 20
center 40.66310119628906 0 209.29934692382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5281799499764165 0.32196581113320044 0.9 }
radiance 28
center 42.415748596191406 0 221.41616821289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9232817641095903 0.3983784314419851 0.871341050102533 }
radiance 16
center 51.93476867675781 0 211.615966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9290768196932767 0.42935392544134077 0.9403279198454928 }
radiance 29
center 78.22012329101562 0 229.5496368408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8920507922716061 0.4891911858786936 0.9698147387085504 }
radiance 31
center 91.41743469238281 0 237.9315948486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4881511746250873 0.3525860745798094 0.9 }
radiance 31
center 55.6142578125 0 218.7349853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9703266536734212 0.4222145742816573 0.8658058567976457 }
radiance 28
center 12.656076431274414 0 264.13720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872257732424111 0.3572346197843131 0.9346948034225964 }
radiance 18
center 23.361106872558594 0 248.2519989013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5126627462316616 0.46884234409879805 0.9 }
radiance 18
center 49.25081253051758 0 207.41416931152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8812573506533986 0.45527559909114 0.9215935756564826 }
radiance 18
center 52.82109451293945 0 259.0136413574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8691106537178609 0.3142951098505154 0.9690386561216121 }
radiance 31
center 32.59611129760742 0 219.73728942871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9211678535943301 0.42713197974358896 0.8487192937403646 }
radiance 25
center 10.140192985534668 0 200.57391357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3227802974210382 0.6979947851196768 }
radiance 25
center 36.308509826660156 0 232.83184814453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.974048863953642 0.3597455981883096 0.8167049491385399 }
radiance 31
center -3.030651092529297 0 196.54391479492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9016723585003767 0.4130794701753231 0.8055652370815474 }
radiance 20
center 9.17777156829834 0 228.0469207763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9528356680562549 0.3777751517889218 0.8465367474158471 }
radiance 27
center -12.727640151977539 0 216.8104248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9511736024236153 0.41683055506564104 0.9835342892100771 }
radiance 17
center 39.530357360839844 0 268.6552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4731764074463518 0.6948570294667625 }
radiance 24
center 36.48242950439453 0 243.91558837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9055785633188718 0.36364585800362187 0.8546156529797126 }
radiance 24
center -19.948387145996094 0 253.40573120117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32960737801537165 0.6210409499462585 }
radiance 25
center 40.24898147583008 0 205.35604858398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9056780488384409 0.47468322120583517 0.8596842948596526 }
radiance 29
center 36.862709045410156 0 198.0897216796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7444067438840447 0.45578175327158854 0.9 }
radiance 17
center -12.51986312866211 0 254.0965576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8360536290288084 0.36728471547753594 0.8530467239188693 }
radiance 28
center -39.565284729003906 0 218.4680633544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8774911959386411 0.3807135448696709 0.934910864295395 }
radiance 25
center -26.311689376831055 0 230.4324493408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.565857808315366 0.4306958899260791 0.9 }
radiance 22
center -46.23286056518555 0 217.11361694335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39902953958719567 0.40511136389009195 }
radiance 29
center -36.47565841674805 0 258.91107177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8118875800508157 0.3039077715853993 0.9 }
radiance 26
center -38.10508346557617 0 206.4845733642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8712928231078498 0.49473533209789944 0.8493147939046459 }
radiance 26
center -4.224154472351074 0 244.2037353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8451232802888116 0.3904745285883248 0.9029944343578398 }
radiance 21
center 8.077245712280273 0 263.1451721191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7453394015084744 0.4556234868996344 0.9 }
radiance 28
center 3.91871976852417 0 244.58921813964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8152331185028078 0.3750433005551873 0.9828511576452841 }
radiance 28
center -0.35994675755500793 0 192.0677490234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9458601404860474 0.3442475713711858 0.8748839233581237 }
radiance 28
center -56.73387908935547 0 232.33770751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8315549699993394 0.3850943194829468 0.82483088486463 }
radiance 23
center -78.75792694091797 0 186.226318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33947356545940754 0.5491321092311444 }
radiance 29
center -75.3550796508789 0 234.57057189941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8904483004349583 0.3917042070489546 0.9 }
radiance 27
center -26.975908279418945 0 203.6949005126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34012801468530596 0.8645663840939674 }
radiance 17
center -81.23240661621094 0 231.248291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9495888351000064 0.3620435509631196 0.9186178467072933 }
radiance 16
center -33.99752426147461 0 243.4334259033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3098850230798209 0.6758028796957612 }
radiance 25
center -95.63239288330078 0 240.08677673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8796935071668871 0.39090764257756916 0.8125740525522385 }
radiance 26
center -89.10993194580078 0 257.75042724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.990481798969926 0.3102450914255768 0.9072354416596076 }
radiance 23
center -70.82389068603516 0 215.82455444335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8875789702437455 0.333072910238412 0.9549630411643089 }
radiance 19
center -87.22259521484375 0 208.36802673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8510301454688125 0.35512908740221355 0.895396243756703 }
radiance 16
center -96.29582214355469 0 246.52980041503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9680719507992364 0.4223043280682225 0.8289847460303518 }
radiance 25
center -102.98348999023438 0 229.91004943847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44356054207824613 0.504967898215019 }
radiance 21
center -69.56861877441406 0 237.64012145996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9898196462034257 0.3585375672955788 0.9917458500344986 }
radiance 30
center -53.53311538696289 0 228.918701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9748519255545678 0.3973562186082775 0.9999218139490749 }
radiance 23
center -66.59077453613281 0 232.65493774414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5577776121874235 0.4540877779212221 0.9 }
radiance 17
center -73.64722442626953 0 250.95101928710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8693772163489748 0.42476667428833603 0.8827602232064575 }
radiance 29
center -78.87297821044922 0 182.91812133789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8921609535422497 0.43745355230031924 0.88850112314075 }
radiance 28
center -74.46604919433594 0 233.9704132080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8186077754817086 0.3408697933728354 0.9932313165702115 }
radiance 25
center -78.34719848632812 0 202.6781768798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8442550831586277 0.47976138402578145 0.9035176976694983 }
radiance 26
center -65.9549560546875 0 223.35562133789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48901712302179096 0.6153948118809359 }
radiance 17
center -121.28746795654297 0 201.91282653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.929452341145632 0.36764491331647825 0.8998111320908362 }
radiance 19
center -92.55382537841797 0 235.92982482910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8665369953473052 0.32505622506209586 0.9121078063977385 }
radiance 16
center -63.77717590332031 0 217.99095153808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9383922882475668 0.41524200161670016 0.8692058531571548 }
radiance 21
center -71.41487884521484 0 171.4821014404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3748427709624723 0.6625314094583546 }
radiance 25
center -62.25311279296875 0 190.01551818847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8433744270908943 0.45811817008424416 0.9 }
radiance 24
center -80.46730041503906 0 241.1472625732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.853816758826071 0.3477305691251938 0.9955728520514128 }
radiance 24
center -90.07576751708984 0 199.92149353027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8888035072636531 0.4053889779607953 0.8384500047199571 }
radiance 18
center -78.41106414794922 0 186.33941650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8743682234208745 0.483338934920723 0.97196492753236 }
radiance 31
center -147.85508728027344 0 212.0580291748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.48442499766037994 0.34942004054624093 0.9 }
radiance 17
center -153.03196716308594 0 193.58428955078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30423232232459646 0.8230607885054854 }
radiance 31
center -146.2043914794922 0 230.42770385742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9822805541201671 0.39236912896564524 0.9032525293865646 }
radiance 19
center -91.810302734375 0 158.24652099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4111160740264759 0.37695533482563204 0.9 }
radiance 19
center -104.25310516357422 0 191.201171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3134824203390312 0.8250951593226966 }
radiance 30
center -98.38895416259766 0 227.70562744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9757472555884656 0.43905247556627125 0.9471752343054953 }
radiance 17
center -165.84109497070312 0 172.82220458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8667937924343765 0.4430674917157479 0.854568645992983 }
radiance 24
center -91.1014633178711 0 154.45533752441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9596400097489053 0.3898570585839698 0.8271898860339227 }
radiance 29
center -175.62860107421875 0 218.10194396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9954144589312052 0.3109165566911045 0.9139198673514689 }
radiance 26
center -160.8795623779297 0 153.74862670898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8811409894535677 0.3366947878388185 0.8262605141407093 }
radiance 23
center -151.8513641357422 0 204.7644805908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9722009497907843 0.3963028012373606 0.9656781151390204 }
radiance 24
center -140.5545196533203 0 148.54849243164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9300770162080316 0.3113325791802889 0.842433591049445 }
radiance 19
center -151.21182250976562 0 189.91737365722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33163453433719237 0.6724456631759298 }
radiance 28
center -123.91193389892578 0 161.81240844726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9909810684997341 0.3920489142284176 0.9507362784653354 }
radiance 21
center -173.5551300048828 0 185.69955444335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8881502096572608 0.3718470567076586 0.9848318820161451 }
radiance 24
center -176.97911071777344 0 159.83143615722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9160076962239069 0.4993930823994612 0.9100871772107441 }
radiance 20
center -111.49639892578125 0 212.4633026123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.866459002651041 0.3713126599908176 0.9981635830454019 }
radiance 17
center -147.072265625 0 184.22531127929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3044539990408849 0.478800739517696 }
radiance 27
center -173.51400756835938 0 191.24923706054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8328751484991719 0.4806057437603769 0.9 }
radiance 17
center -198.01812744140625 0 159.84271240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7643081216322419 0.3872595407001204 0.9 }
radiance 29
center -134.4368896484375 0 150.89991760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6603763891534236 0.3648600696191588 0.9 }
radiance 20
center -164.82675170898438 0 147.3427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7148745214287722 0.3672606116232972 0.9 }
radiance 19
center -127.37468719482422 0 146.78489685058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6220417799211128 0.4319236064448372 0.9 }
radiance 18
center -156.72653198242188 0 133.9636993408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9085411251433545 0.3344175226455535 0.8046868586867493 }
radiance 16
center -190.90074157714844 0 149.61524963378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9301722074560717 0.3829485068736953 0.8796469722157765 }
radiance 23
center -169.42300415039062 0 171.85641479492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9404186454191191 0.3575278778345618 0.8566397508442727 }
radiance 25
center -195.88229370117188 0 157.58114624023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8210125808804736 0.4271566077244109 0.806218731444736 }
radiance 18
center -169.39532470703125 0 193.2996826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9365237786362463 0.3204227578604267 0.8619329663768711 }
radiance 19
center -168.90968322753906 0 172.2177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8237847239420901 0.36426350432661325 0.9313174562500277 }
radiance 19
center -178.45877075195312 0 140.75672912597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9605599996016447 0.31388874298973685 0.9517088290720893 }
radiance 29
center -148.77713012695312 0 119.1899185180664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9111851689016093 0.3286424160387308 0.8869917834446007 }
radiance 16
center -200.44512939453125 0 172.3608856201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9323474023923579 0.4113655316338347 0.9003328409917043 }
radiance 28
center -156.05857849121094 0 173.05020141601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9772230431647801 0.4994870412387987 0.8402784326090166 }
radiance 22
center -182.20509338378906 0 125.27828979492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.841515957689846 0.45426433927139953 0.9366262404885908 }
radiance 22
center -200.57203674316406 0 146.58480834960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9744444144300735 0.46787459635717465 0.8318691297664733 }
radiance 18
center -171.64682006835938 0 117.74626922607422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5259423950470837 0.4045525762073927 0.9 }
radiance 26
center -218.8485565185547 0 101.89140319824219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8161780697295844 0.45101358949337333 0.8274904502443724 }
radiance 29
center -164.74940490722656 0 120.458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9744991626342379 0.4928718351478829 0.8909022481508284 }
radiance 22
center -183.79299926757812 0 140.49749755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4739367428846063 0.8451972847742003 }
radiance 25
center -190.03237915039062 0 144.2411346435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9373998225961223 0.44709275125261433 0.9972138542768402 }
radiance 30
center -176.72647094726562 0 103.2545166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6708637273644918 0.3450610737978758 0.9 }
radiance 22
center -207.29635620117188 0 111.65625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9866091249463018 0.45605823461226186 0.9549210570678467 }
radiance 24
center -211.88253784179688 0 141.8749542236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32912810549172333 0.8756184694306989 }
radiance 16
center -181.36610412597656 0 136.83816528320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.816926922764295 0.4620953977185013 0.8071238775774162 }
radiance 24
center -180.4988250732422 0 103.77197265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9322890054843904 0.3215009193594954 0.8827265019265462 }
radiance 20
center -184.08087158203125 0 79.69147491455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8346976021230318 0.3653764892628464 0.9506844910882122 }
radiance 23
center -181.24398803710938 0 137.98680114746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9083338570499423 0.4590715908813304 0.9384235781947527 }
radiance 17
center -200.11920166015625 0 140.0528564453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9283168171377689 0.4446209713569111 0.9935998002147598 }
radiance 19
center -239.805908203125 0 96.28266143798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8168395080855054 0.3487834768281664 0.9255232685113522 }
radiance 20
center -183.53805541992188 0 65.9452133178711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8893287991954492 0.4868763216488885 0.8082328398384466 }
radiance 31
center -218.7825164794922 0 126.50833892822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4321061070279175 0.5132231038632814 }
radiance 30
center -202.5740966796875 0 100.92144012451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8343902341947143 0.32164628267151657 0.9847318171499051 }
radiance 18
center -179.20204162597656 0 125.8991470336914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9546156825696631 0.39408558430874824 0.8288889516923932 }
radiance 22
center -201.9398956298828 0 75.69359588623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8706566163944599 0.4698842254865758 0.891021738626806 }
radiance 19
center -236.32220458984375 0 48.246585845947266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9357020044310774 0.40778070322692994 0.9562022236234116 }
radiance 20
center -198.92095947265625 0 61.286163330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8608604440511961 0.3382138600135972 0.8571447153354954 }
radiance 17
center -245.99093627929688 0 66.94000244140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8840098930346302 0.47986033371619485 0.8444825944967137 }
radiance 31
center -179.46986389160156 0 90.27224731445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8531954701531052 0.4305925828226821 0.9722788203357275 }
radiance 19
center -204.04544067382812 0 81.88737487792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.845985168902163 0.34121150498752617 0.9289497677870601 }
radiance 26
center -228.12335205078125 0 64.43003845214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9125186543919923 0.48154704811661186 0.8474158262738989 }
radiance 20
center -201.5299530029297 0 84.82471466064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9844379781447867 0.420025810611919 0.9158726080601154 }
radiance 25
center -208.23220825195312 0 97.20303344726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8506240414059643 0.31525277111678535 0.8814130147896672 }
radiance 29
center -197.88235473632812 0 101.55638122558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4734453505727081 0.4632831938389431 }
radiance 21
center -223.9535369873047 0 37.76318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34624922723651913 0.8324471601671807 }
radiance 16
center -194.44700622558594 0 92.09813690185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4338771548463113 0.3628279224571475 0.9 }
radiance 29
center -220.9966278076172 0 23.14893913269043
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8727997434715843 0.47346298046507024 0.8464621247814956 }
radiance 28
center -211.79214477539062 0 61.336463928222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8633668665597409 0.41363240204124047 0.9 }
radiance 29
center -231.40301513671875 0 57.76729202270508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9523847953524938 0.4079813493991229 0.8743288183094234 }
radiance 29
center -210.64881896972656 0 59.053062438964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3403189440657682 0.8814492657876775 }
radiance 17
center -247.23304748535156 0 12.15798568725586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48343448104983133 0.49819398262294656 }
radiance 17
center -224.6096649169922 0 11.742400169372559
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5362886357211946 0.48410183598275713 0.9 }
radiance 27
center -259.02655029296875 0 39.78571701049805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8419202840635052 0.39247050950336904 0.933835641445972 }
radiance 17
center -238.42849731445312 0 32.834075927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8701044994998157 0.42086159012093294 0.8364333618465412 }
radiance 21
center -216.41075134277344 0 54.374603271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8771235778097994 0.42336371641929693 0.8002243571904748 }
radiance 20
center -204.24551391601562 0 26.932411193847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45687163289191757 0.6359488805443217 }
radiance 25
center -226.5072784423828 0 32.26308822631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9335210596830326 0.4619222122911897 0.8307708738595024 }
radiance 31
center -242.96701049804688 0 16.53521728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.95519324137941 0.3006755914597432 0.8649874182150372 }
radiance 28
center -234.42225646972656 0 64.17325592041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9427935173072625 0.40563420961090846 0.9565051068485252 }
radiance 19
center -257.53204345703125 0 16.368206024169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9538246949377458 0.4680163564368993 0.9670746246084607 }
radiance 29
center -248.90444946289062 0 25.817899703979492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9645748054763325 0.3770205449185088 0.9458435993011342 }
radiance 29
center -255.11717224121094 0 42.4441032409668
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4995019203829284 0.6434262955282939 }
radiance 17
center -228.99147033691406 0 36.69868469238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8949668768448913 0.3705968184747902 0.9 }
radiance 16
center -226.5583038330078 0 8.246173858642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.870277377249091 0.4266693039512128 0.9168303536227244 }
radiance 30
center -266.2834777832031 0 -26.049318313598633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9576294036033826 0.3942123885971515 0.8228842604273992 }
radiance 25
center -197.59495544433594 0 0.6257160902023315
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9108780908470924 0.3873203118177835 0.8319015167860632 }
radiance 18
center -194.70169067382812 0 7.694512367248535
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9414425913785676 0.30253488963813363 0.8503880981392599 }
radiance 23
center -241.14247131347656 0 32.583492279052734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8444971306892753 0.4608132832809516 0.8664937679945992 }
radiance 23
center -225.5112762451172 0 -8.711974143981934
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8139514446950832 0.44446034887302566 0.9915146475410535 }
radiance 29
center -246.98727416992188 0 -22.294422149658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842554430248031 0.34105566105379986 0.8340990350651245 }
radiance 17
center -203.71754455566406 0 -43.17160415649414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8142083874778273 0.4810436026157868 0.8219619343538682 }
radiance 29
center -227.39772033691406 0 -8.392086029052734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9634281405491103 0.4761882717872216 0.9262146101832781 }
radiance 30
center -205.36221313476562 0 -37.02632522583008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.982106294438273 0.32602523223320273 0.9268590291517963 }
radiance 25
center -227.17263793945312 0 -44.69281005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8703187124374101 0.3718582295838265 0.9621818525301837 }
radiance 31
center -196.60714721679688 0 0.16245128214359283
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8435741329054002 0.33312545170189173 0.9 }
radiance 27
center -214.1101531982422 0 -24.821897506713867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.95615769189822 0.3429891802588661 0.8375721156760378 }
radiance 21
center -249.09129333496094 0 -25.902616500854492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8468671342699556 0.3267737367611787 0.9 }
radiance 19
center -238.79019165039062 0 -56.75161361694336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9494610519696542 0.42782683336149807 0.9613209919278912 }
radiance 24
center -219.2584686279297 0 -32.18117904663086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9491877135262403 0.4920643982052578 0.9333966872150894 }
radiance 29
center -214.53688049316406 0 -8.899669647216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.921485395442383 0.4726904756514967 0.9570989065902425 }
radiance 20
center -254.56951904296875 0 -63.89852523803711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8959475139878349 0.4527811654164189 0.8787198627729438 }
radiance 23
center -253.09046936035156 0 -48.42873764038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8513742977834191 0.48628782645035273 0.9948061873013783 }
radiance 18
center -230.44973754882812 0 -60.213218688964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9984012933078031 0.4664473436103038 0.872266996846317 }
radiance 21
center -243.29891967773438 0 -31.753393173217773
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9989525463560665 0.3030323729583157 0.9524306114078228 }
radiance 28
center -251.93865966796875 0 -54.07563400268555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9152601408558246 0.3196275192950208 0.8797614064531878 }
radiance 25
center -215.5059814453125 0 -62.839908599853516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6290975014102598 0.3742130207337031 0.9 }
radiance 29
center -213.8180389404297 0 -35.09606170654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.802003567395202 0.3746520753872429 0.9925240440713695 }
radiance 27
center -239.13124084472656 0 -43.400447845458984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8909147520020553 0.3163831870695963 0.8422304997295131 }
radiance 20
center -195.7693634033203 0 -35.03401565551758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3680113851014146 0.6349308151666894 }
radiance 20
center -219.78663635253906 0 -53.50972366333008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9616243098887648 0.42888316601152054 0.8250027159403921 }
radiance 22
center -242.9329376220703 0 -59.34290313720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8415775081001765 0.37199246154473 0.9561740073643156 }
radiance 26
center -239.66258239746094 0 -66.97471618652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8659827187879896 0.46408874819801327 0.910884906662967 }
radiance 17
center -196.57383728027344 0 -85.9146499633789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9359794882831145 0.3030939826108686 0.8679898499894559 }
radiance 28
center -235.502197265625 0 -64.96556854248047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.878647457636531 0.39972771903501414 0.9353667836923991 }
radiance 18
center -181.43260192871094 0 -51.81167221069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8610553813205866 0.35512903065740287 0.9864941825828244 }
radiance 31
center -213.1373748779297 0 -52.77095413208008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8628618409881667 0.4399974673297271 0.9 }
radiance 27
center -248.07032775878906 0 -99.59192657470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8767047134881387 0.4145719716712425 0.8951649743324241 }
radiance 16
center -216.015380859375 0 -83.71969604492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8566485244128726 0.38250017994581076 0.9 }
radiance 27
center -195.6043701171875 0 -62.128387451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9720329279595398 0.38084751633037056 0.8464282082728334 }
radiance 17
center -204.78070068359375 0 -68.31373596191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9694322216368025 0.3034124756014375 0.9875181979905064 }
radiance 16
center -196.9981231689453 0 -75.24853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9336306030508335 0.4015523470569171 0.9389496124815888 }
radiance 19
center -186.91885375976562 0 -75.23893737792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.962345063249753 0.36237051482056054 0.8176190415887149 }
radiance 24
center -217.67918395996094 0 -87.33363342285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9259406736385546 0.4452785618346814 0.9406999684414162 }
radiance 30
center -220.45130920410156 0 -74.64969635009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8105602907829882 0.4818263893799821 0.8277702752455584 }
radiance 31
center -181.27554321289062 0 -96.79084777832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8332802067590145 0.42095035304718964 0.921351719883358 }
radiance 28
center -225.1151885986328 0 -129.0499267578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33206868267494827 0.4269700926069012 }
radiance 31
center -191.82725524902344 0 -93.19354248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8389209137146019 0.34044195889985535 0.9501685327450378 }
radiance 26
center -173.15892028808594 0 -129.58651733398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8067649644425634 0.3782542758498906 0.8404031611949236 }
radiance 22
center -176.31504821777344 0 -82.57927703857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8386558391193293 0.49347123647050506 0.8849179361831765 }
radiance 18
center -184.36427307128906 0 -87.64276123046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8319473475022042 0.43345710758823514 0.8046405200262121 }
radiance 27
center -165.48321533203125 0 -106.9499740600586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8338034829334162 0.4336276923610493 0.8811445929459741 }
radiance 28
center -169.0367431640625 0 -102.75453186035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7658249483731076 0.4761622697194407 0.9 }
radiance 21
center -210.67535400390625 0 -139.94601440429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9964877916835873 0.44534321296463475 0.9404088836843428 }
radiance 20
center -184.12039184570312 0 -131.49618530273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9876772960084907 0.4184136626171764 0.8064019537281448 }
radiance 30
center -160.547607421875 0 -89.22769165039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9816067528625254 0.3898324896925476 0.8971676864675981 }
radiance 16
center -187.82579040527344 0 -135.61830139160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5487473542087455 0.3639594106103492 0.9 }
radiance 19
center -202.70794677734375 0 -140.47088623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8860325072246157 0.3445143639600288 0.8322435471643759 }
radiance 25
center -155.2509765625 0 -119.46468353271484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45666252441408905 0.616551571621242 }
radiance 17
center -221.22354125976562 0 -107.8360366821289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9421701490045336 0.45938879030556024 0.8597561051198916 }
radiance 23
center -179.12554931640625 0 -141.26649475097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37673659053557185 0.8389863178661672 }
radiance 23
center -203.98721313476562 0 -147.26382446289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9224022200934515 0.47875513190308594 0.8697968943872458 }
radiance 26
center -152.47189331054688 0 -109.39679718017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6820729730570987 0.4597325349257233 0.9 }
radiance 24
center -149.915283203125 0 -130.19696044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9494720214105592 0.4532892030495066 0.9459517173715164 }
radiance 29
center -157.22695922851562 0 -158.14956665039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8281825941248175 0.4301639641853575 0.8748371207682207 }
radiance 19
center -148.32479858398438 0 -142.5117950439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8170638830251601 0.30546935471337383 0.9894787071866732 }
radiance 30
center -168.63876342773438 0 -112.9897689819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9876161156882104 0.47273923157733844 0.8690916673392891 }
radiance 19
center -183.36155700683594 0 -131.1291961669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.810899473839419 0.46463275552233896 0.882684901376161 }
radiance 27
center -162.14866638183594 0 -106.88700866699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866719502216297 0.44035645731133805 0.868007900011168 }
radiance 20
center -145.03013610839844 0 -155.07069396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8561271794486705 0.37710319463742986 0.8816076440539241 }
radiance 17
center -170.48121643066406 0 -127.82894134521484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9444033068400323 0.3080062563231742 0.9057516987555395 }
radiance 27
center -176.93087768554688 0 -137.5249786376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8514414023368775 0.32066459563083927 0.8864192327086802 }
radiance 16
center -178.41456604003906 0 -132.3446807861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9354600044227301 0.4530884291624764 0.8243853787733302 }
radiance 21
center -184.9861297607422 0 -161.92372131347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.850240857952576 0.41859555479461164 0.9340230157266388 }
radiance 29
center -156.7012939453125 0 -165.57568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.62632303662952 0.4111537439855066 0.9 }
radiance 17
center -137.56802368164062 0 -134.32835388183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.461342787063514 0.8954420873023545 }
radiance 27
center -169.89447021484375 0 -139.5587921142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9473087978015637 0.3624745058445972 0.9206526357488014 }
radiance 22
center -164.71047973632812 0 -154.1640167236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9477191401903031 0.46331718976873526 0.9125620463420248 }
radiance 24
center -119.64527130126953 0 -184.9990234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8291805509633824 0.49802552553645896 0.9918937914007873 }
radiance 16
center -166.45274353027344 0 -174.19590759277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8114733864882351 0.436734425223435 0.9 }
radiance 20
center -114.07701110839844 0 -185.84437561035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40400838419968743 0.431835521305155 0.9 }
radiance 27
center -136.71812438964844 0 -172.49258422851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8762145395388785 0.3524981475922033 0.9719199666226933 }
radiance 25
center -116.38968658447266 0 -138.85125732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9217417434499635 0.3578075334354266 0.8745244695465995 }
radiance 23
center -108.98978424072266 0 -169.33921813964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8068735691284764 0.33544270633169254 0.8265851975545312 }
radiance 23
center -111.33250427246094 0 -164.6797332763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.77678977888369 0.306289210282828 0.9 }
radiance 25
center -148.854736328125 0 -168.95924377441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9734491376092428 0.4711196026157767 0.9576103106326828 }
radiance 31
center -143.75979614257812 0 -193.11807250976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8137770592611854 0.48488647848243444 0.9713373903728721 }
radiance 18
center -119.94397735595703 0 -162.90127563476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4608413730149037 0.6386224549429476 }
radiance 23
center -107.86466217041016 0 -157.41297912597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.930614277290922 0.41273922825944576 0.8392074045902238 }
radiance 20
center -147.67172241210938 0 -202.75791931152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35255507498589356 0.7624007502033624 }
radiance 18
center -118.12550354003906 0 -160.14161682128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9888749456467462 0.3115136709965682 0.8575781871626886 }
radiance 19
center -83.51596069335938 0 -164.1575927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42423768118594474 0.6190496490719688 }
radiance 22
center -89.55000305175781 0 -167.22474670410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7489251355894346 0.36032055162680976 0.9 }
radiance 28
center -91.20932006835938 0 -212.18331909179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7987979745780548 0.4723889439980031 0.9 }
radiance 23
center -93.7811279296875 0 -162.21493530273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8385856411753008 0.4355993769515807 0.8915315636599916 }
radiance 17
center -87.46104431152344 0 -213.05979919433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8748626567482385 0.46760120769933206 0.925649114043655 }
radiance 26
center -71.6730728149414 0 -196.05349731445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8294505533633809 0.30693550322845536 0.8516355658827885 }
radiance 17
center -82.54576110839844 0 -190.75094604492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9275819854328734 0.456372767425236 0.8089123705430301 }
radiance 29
center -99.94757843017578 0 -220.2563934326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9105158387163037 0.31879258684707545 0.9157988324213375 }
radiance 28
center -70.44895935058594 0 -166.3740997314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9055819580347213 0.44887979717237636 0.8282798072525249 }
radiance 16
center -39.23151397705078 0 -186.7777099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8740852860411495 0.43306738091766434 0.8640552545045798 }
radiance 30
center -44.95799255371094 0 -226.31573486328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5776577397891376 0.3357557665862968 0.9 }
radiance 25
center -89.49897003173828 0 -211.83792114257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.979243515216916 0.3761055941255901 0.828952363852333 }
radiance 20
center -45.983367919921875 0 -196.5360107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9880839635265521 0.32119024517588196 0.957071045448229 }
radiance 23
center -47.47604751586914 0 -204.09503173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9529377488558175 0.42401016775707867 0.9622934114530385 }
radiance 18
center -60.130523681640625 0 -188.32672119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9997742427103876 0.3708135689177332 0.8421872354436781 }
radiance 18
center -36.13924026489258 0 -220.78746032714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9207712167788331 0.327475714631505 0.8606274779472156 }
radiance 24
center -46.80241012573242 0 -194.58323669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8542336355682798 0.3718034676802292 0.8269128092662704 }
radiance 18
center -42.16773223876953 0 -179.89547729492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8406955818598305 0.46485109774375566 0.9470582758471408 }
radiance 20
center -53.7419319152832 0 -185.8297119140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867725585099154 0.45828139786041966 0.9098025343647841 }
radiance 19
center -46.813602447509766 0 -188.51925659179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9566602197652315 0.31242319106419253 0.9534021497532493 }
radiance 25
center -53.58753204345703 0 -190.39324951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6353888828101454 0.3095441027840367 0.9 }
radiance 27
center -33.15821838378906 0 -211.24490356445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3443938729612138 0.8431788864970917 }
radiance 27
center -9.488192558288574 0 -202.10455322265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8009101095906801 0.3018401741166407 0.9967885742825544 }
radiance 31
center -52.303504943847656 0 -217.73744201660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9214763966073833 0.32346750924370593 0.9896169082071626 }
radiance 20
center -27.6314640045166 0 -175.639892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9623252549639804 0.4233771050062244 0.8104968487395641 }
radiance 27
center -4.175699234008789 0 -186.94615173339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.597561625338972 0.46993914216050403 0.9 }
radiance 22
center -25.78606414794922 0 -179.7711639404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8293435205971339 0.4324317329342981 0.9245453145243578 }
radiance 31
center 10.874104499816895 0 -191.339111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8047110086403018 0.4540825684999902 0.8334152319130107 }
radiance 25
center 11.088906288146973 0 -176.0069580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9354318443707864 0.4264596875733179 0.8713141238346125 }
radiance 26
center -23.674278259277344 0 -169.86907958984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8220768769709675 0.4725124623106465 0.9024160321625236 }
radiance 25
center -3.0170700550079346 0 -217.889892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9529713322923008 0.3814983310424933 0.9200187496661898 }
radiance 23
center -21.320842742919922 0 -181.70433044433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8380577518730631 0.41181060586742735 0.9 }
radiance 19
center -13.22296142578125 0 -199.66891479492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9266026819409273 0.35239002363459354 0.8655350881335624 }
radiance 31
center 18.848703384399414 0 -205.54713439941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9083399544731268 0.34713773112434615 0.87381453130976 }
radiance 31
center 19.585237503051758 0 -167.29087829589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8716049582055906 0.33329502310972847 0.8681944022646991 }
radiance 23
center 34.081974029541016 0 -168.9921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9640882902166602 0.35455371214642395 0.8015609870730065 }
radiance 22
center -7.598257541656494 0 -192.73196411132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8430546476060639 0.4067807694427349 0.9804725308804039 }
radiance 24
center 30.874692916870117 0 -196.67855834960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9849826656642094 0.4978694355426302 0.8519138050283058 }
radiance 24
center 6.008492946624756 0 -187.9129180908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8625614034044569 0.4238793640398738 0.8376176805051726 }
radiance 25
center 31.507545471191406 0 -197.6214141845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9861648996378239 0.46218333444207155 0.9709645755839664 }
radiance 26
center 34.073307037353516 0 -193.47972106933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8423443338615428 0.4633452264410328 0.8934896907291128 }
radiance 19
center 10.811264991760254 0 -208.03851318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9800895787928978 0.32194865528416955 0.9742180491006702 }
radiance 18
center 31.049306869506836 0 -205.7725830078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6468356612503863 0.4456321974227073 0.9 }
radiance 23
center 8.310933113098145 0 -185.06825256347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9106327460142235 0.41429566856482636 0.9836219121793415 }
radiance 18
center 77.13086700439453 0 -200.41357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8962106096167537 0.36828694402839324 0.9249023507602604 }
radiance 22
center 81.70150756835938 0 -199.47837829589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8785341084355758 0.4226755199455897 0.9745892917032308 }
radiance 29
center 79.70083618164062 0 -164.31028747558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9649083244706661 0.37178637873607 0.9575258314156081 }
radiance 28
center 46.80153274536133 0 -158.29275512695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9426843661545155 0.3850692005801436 0.850283874667802 }
radiance 21
center 52.30033874511719 0 -149.5968475341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8542696151528365 0.3955473317822946 0.9549753800335585 }
radiance 21
center 83.0085678100586 0 -148.4049530029297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.937152778921133 0.4813949067884084 0.821102855367078 }
radiance 20
center 42.50493240356445 0 -197.783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9042230958832265 0.4651511292271674 0.9382182699600572 }
radiance 28
center 70.54894256591797 0 -196.8553924560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8684745136448659 0.30097084527173706 0.9876798802919009 }
radiance 18
center 53.06282424926758 0 -166.86041259765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39643488482126965 0.7081210872388551 }
radiance 26
center 77.94111633300781 0 -154.59144592285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3529397249943882 0.7527892332492497 }
radiance 30
center 102.28044891357422 0 -142.2310333251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49672184337020253 0.3184484423098764 0.9 }
radiance 17
center 75.17082977294922 0 -165.7899169921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8242391276300002 0.37607566703216266 0.9444681062157447 }
radiance 23
center 58.83403778076172 0 -142.50982666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9463595299851328 0.35986262186693574 0.9903088679561313 }
radiance 18
center 93.25757598876953 0 -178.04617309570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8654650580223577 0.3275536532165102 0.9642993443014939 }
radiance 22
center 80.49717712402344 0 -151.90528869628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9851021788566766 0.31523835359331015 0.8504289816941544 }
radiance 25
center 115.41571807861328 0 -142.48056030273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8896301562063076 0.3941331805728068 0.818971819961905 }
radiance 17
center 78.37220001220703 0 -170.82540893554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.950971803545684 0.33207667663007445 0.8592156854092678 }
radiance 30
center 88.30421447753906 0 -173.93150329589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8030949455219807 0.30643795801989704 0.8540690363783252 }
radiance 19
center 83.29385375976562 0 -147.2093963623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4731921901053411 0.5009783587006417 }
radiance 22
center 77.48175048828125 0 -159.7120819091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8974535622111081 0.4652004091530554 0.9 }
radiance 29
center 95.0381851196289 0 -119.34364318847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8970335513046729 0.3537530841677141 0.9397298020274367 }
radiance 27
center 123.34735107421875 0 -125.36588287353516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9466197792833918 0.4764641448116004 0.8714988473887564 }
radiance 25
center 126.01985931396484 0 -124.40771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8782951209440103 0.3853612760722449 0.8656734172822799 }
radiance 19
center 124.95600891113281 0 -137.7168426513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9655911105703398 0.4381177961981675 0.8826123619967368 }
radiance 18
center 120.03754425048828 0 -154.79598999023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9599109285811025 0.3751649531479744 0.9714315228200129 }
radiance 21
center 93.5167236328125 0 -148.3205108642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9268902504696818 0.36217967863400524 0.8134943748123666 }
radiance 29
center 127.44835662841797 0 -127.75615692138672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8173584073212681 0.3482610854003769 0.8384700544143912 }
radiance 24
center 133.3478240966797 0 -97.94245147705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866133773040021 0.3985299679962431 0.9472639875709934 }
radiance 18
center 141.8157501220703 0 -100.19445037841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37442136820634175 0.47129172812036635 }
radiance 23
center 128.5011444091797 0 -124.66303253173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3273924408545351 0.46328230369332346 }
radiance 28
center 138.53114318847656 0 -138.63848876953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9140544547458477 0.4043863014040108 0.900989256894109 }
radiance 21
center 98.48694610595703 0 -95.0699691772461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8600960377195899 0.3822887973217167 0.9097141607363346 }
radiance 16
center 128.46401977539062 0 -106.95220184326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.859918004895962 0.4383195974746463 0.9 }
radiance 29
center 145.83030700683594 0 -129.4048309326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.911508713750393 0.3595929407883128 0.825469377448875 }
radiance 30
center 108.40707397460938 0 -128.5266571044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8297805464095901 0.41691974348852645 0.8859760999803776 }
radiance 17
center 145.36700439453125 0 -87.28435516357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9110156447470675 0.4411982709142985 0.8006527392904398 }
radiance 19
center 135.45094299316406 0 -75.58841705322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.970601005451947 0.42327911756264447 0.9460387707406513 }
radiance 25
center 134.52757263183594 0 -94.37850952148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4998472737910437 0.8373870017711113 }
radiance 21
center 156.50462341308594 0 -94.66206359863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39285543139580403 0.4198799142092382 }
radiance 27
center 154.85302734375 0 -78.5450210571289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9978369849658701 0.35883309899846233 0.9498418796458068 }
radiance 17
center 142.78561401367188 0 -103.3837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37856260470308023 0.7403103090478035 }
radiance 23
center 140.70068359375 0 -61.497703552246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8400170682636084 0.4381687098294351 0.9383246707812728 }
radiance 21
center 119.69892120361328 0 -81.82816314697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8246168937278237 0.40474984668205555 0.8543818506654408 }
radiance 23
center 129.67303466796875 0 -85.7054214477539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9957227927993322 0.46231176009020214 0.8670624613264915 }
radiance 26
center 153.41464233398438 0 -59.334659576416016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9364477345852859 0.33756273651870516 0.9345907024241005 }
radiance 24
center 129.05764770507812 0 -55.53879928588867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9556270006357397 0.4831885679852229 0.9552135557806382 }
radiance 23
center 160.18231201171875 0 -70.19410705566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9940011470668504 0.3307123933029242 0.925013879819199 }
radiance 30
center 146.42576599121094 0 -61.91653060913086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7468287447877784 0.41337973414925455 0.9 }
radiance 21
center 126.33509826660156 0 -59.48516845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8789165100219893 0.4522387463267932 0.941684003536643 }
radiance 26
center 147.92318725585938 0 -81.70840454101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9307250250144964 0.4749651957661611 0.9923795591146379 }
radiance 28
center 142.66302490234375 0 -76.17230224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9423043539901546 0.42422536283532 0.8680236951319046 }
radiance 20
center 163.36070251464844 0 -74.08255004882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.876797620785192 0.48335950268567107 0.8790078704052725 }
radiance 26
center 146.52593994140625 0 -28.50035285949707
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.834942949854045 0.3994116769889826 0.9 }
radiance 22
center 164.874755859375 0 -54.779178619384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4440550374995244 0.6161364798450516 }
radiance 21
center 155.38816833496094 0 -55.950233459472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.701203506092355 0.45386452424150425 0.9 }
radiance 24
center 151.78738403320312 0 -27.766958236694336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8750236110114125 0.3918878173329846 0.9838775679534197 }
radiance 16
center 151.23342895507812 0 -18.16653823852539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3987442116781539 0.7826199637502779 }
radiance 25
center 159.53408813476562 0 -46.94479751586914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4244042588607849 0.6774276047111544 }
radiance 27
center 141.7356719970703 0 -31.474224090576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9768992268532722 0.3625136882559904 0.8571732736407043 }
radiance 20
center 142.96458435058594 0 -39.05855941772461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8310837762865338 0.4595932159850355 0.88626322035554 }
radiance 24
center 146.86456298828125 0 -37.29751968383789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8169703074936002 0.4273030603272955 0.9262156287086564 }
radiance 18
center 141.56887817382812 0 -3.691150665283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9229525453675783 0.4854999247072278 0.8345459011529821 }
radiance 30
center 133.5157012939453 0 -16.583589553833008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9880833771175499 0.403087859801899 0.9236262326073804 }
radiance 22
center 171.4610595703125 0 -23.129179000854492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9780160189286536 0.47073455196996383 0.8455583381589591 }
radiance 24
center 159.26321411132812 0 -24.40308952331543
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9028614521405731 0.42647704839677436 0.8986018988886537 }
radiance 17
center 145.209228515625 0 -6.455939769744873
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9987122373144716 0.30903605196032724 0.8810985247828256 }
radiance 28
center 136.2526397705078 0 0.8422344326972961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9637688349052349 0.47386046548716765 0.9841993545888386 }
radiance 27
center 164.6522216796875 0 -16.95220375061035
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8484520508431109 0.4945984632743441 0.9540891420879741 }
radiance 27
center 170.92526245117188 0 -29.72652244567871
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9572248305345582 0.32650316891409686 0.8545235596267016 }
radiance 26
center 142.77182006835938 0 -5.946525573730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8498822741928623 0.38612697566071547 0.8271313170059915 }
radiance 31
center 147.59286499023438 0 3.9491724967956543
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3787367281999874 0.5912046288920012 }
radiance 28
center 142.4726104736328 0 21.88112449645996
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8739236875495028 0.35639701150157044 0.9946413831025821 }
radiance 30
center 158.65408325195312 0 11.968987464904785
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.885800460010171 0.399800939022808 0.9790645645586241 }
radiance 16
center 166.85389709472656 0 -13.373457908630371
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8264618117310277 0.37313941350059915 0.9 }
radiance 19
center 136.1538848876953 0 12.376860618591309
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4819954079564779 0.454134021951182 0.9 }
radiance 23
center 159.82449340820312 0 22.228647232055664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9779842912537691 0.34928895842810964 0.8754200780130935 }
radiance 19
center 144.28306579589844 0 34.017662048339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8465883296560922 0.3433200648662241 0.8578132945359049 }
radiance 16
center 145.57080078125 0 1.8752394914627075
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9281977100480711 0.3207833445063711 0.9688065917858882 }
radiance 16
center 118.63333892822266 0 -0.3046155273914337
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8905219043409786 0.3694828871152239 0.8210312063566327 }
radiance 18
center 136.86875915527344 0 20.23695182800293
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43920003553021125 0.35528111485326463 0.9 }
radiance 30
center 130.9457244873047 0 23.793039321899414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8888007098103835 0.45697011823685996 0.8707167861384187 }
radiance 24
center 125.12747955322266 0 27.622982025146484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9144861435026862 0.4554319067171008 0.9056825434252436 }
radiance 18
center 135.96058654785156 0 46.92391586303711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4804040768664096 0.3861850275843405 0.9 }
radiance 28
center 157.2764129638672 0 41.09279251098633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8530776144835326 0.3696948914421724 0.8423694879454604 }
radiance 25
center 151.20108032226562 0 29.80251693725586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6644777429146125 0.47729882830598336 0.9 }
radiance 17
center 136.1342010498047 0 30.754358291625977
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8492072647842497 0.4481550184684566 0.9808558838548387 }
radiance 31
center 148.09335327148438 0 25.77398681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8989392349965286 0.4984328816290881 0.9626751825880988 }
radiance 28
center 107.35920715332031 0 39.904754638671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9208411160435944 0.39077280822374383 0.8255808058562533 }
radiance 30
center 145.55120849609375 0 42.11213684082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9776895554721992 0.4959792744403507 0.9432611078791329 }
radiance 24
center 111.16791534423828 0 41.498050689697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8362914000147321 0.4310514705423919 0.9150512242871522 }
radiance 18
center 97.41145324707031 0 64.19282531738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9795801817450883 0.4783116764977261 0.8023791085484733 }
radiance 25
center 102.04596710205078 0 67.22205352783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6313215889731603 0.35686722537520216 0.9 }
radiance 27
center 105.96163940429688 0 57.80255126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8502775184028365 0.3555596927358663 0.8387311078089642 }
radiance 31
center 123.27315521240234 0 48.06226348876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8687369617396914 0.38927132322134583 0.8806617179606265 }
radiance 22
center 131.00021362304688 0 83.14633178710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8294823896712973 0.4757539292509919 0.9964736996428237 }
radiance 21
center 106.62982940673828 0 55.70227813720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9993795731415982 0.3257216845328917 0.9359152667384592 }
radiance 18
center 119.61741638183594 0 62.485389709472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8468250130837639 0.40467118127374424 0.8001056268372142 }
radiance 23
center 93.85155487060547 0 68.20120239257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7998776909698068 0.3689771259061764 0.9 }
radiance 23
center 101.60738372802734 0 69.5028076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8923438610108184 0.3185656820030499 0.9 }
radiance 26
center 134.7877197265625 0 61.60273742675781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8852074051225103 0.3164351173451197 0.8697380379265953 }
radiance 22
center 111.25699615478516 0 74.97449493408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8018724813047537 0.365952364249594 0.9076462552254122 }
radiance 18
center 80.24187469482422 0 79.0009765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30044860655293176 0.8250599924000668 }
radiance 17
center 120.62175750732422 0 65.90196228027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8798053555255079 0.4632442501292326 0.8170204569260245 }
radiance 29
center 121.41458129882812 0 102.08345031738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8129767267579415 0.37395445980060077 0.8691466857476364 }
radiance 23
center 118.29450988769531 0 60.18959426879883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9781026550507546 0.4593993075060582 0.9301980674719369 }
radiance 19
center 79.66158294677734 0 110.91687774658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8133278787304872 0.44009924672599554 0.8446605646393607 }
radiance 16
center 101.69094848632812 0 86.4860610961914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8980403318511578 0.4590659106102486 0.8370041161667797 }
radiance 28
center 69.28150177001953 0 91.08943176269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8920042779960871 0.34978446691639525 0.9742804512338932 }
radiance 26
center 76.33889770507812 0 93.0708236694336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8315315438613713 0.48729835181403625 0.8299759959801346 }
radiance 28
center 92.63704681396484 0 78.72615051269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8532379721437275 0.3117335978976209 0.9447728380864557 }
radiance 21
center 94.81127166748047 0 99.4422607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8311628135063522 0.48554803755374887 0.9396897117333026 }
radiance 25
center 98.31938171386719 0 80.2119369506836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8150451883889349 0.41366801116925944 0.889941382939056 }
radiance 16
center 103.08366394042969 0 100.03367614746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8608710839457583 0.3939074221976433 0.8889263813872116 }
radiance 21
center 87.82816314697266 0 75.6585693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8370508779771408 0.4915811313992463 0.8711995430638444 }
radiance 30
center 79.49118041992188 0 97.76274871826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9758552540365176 0.48176944859960336 0.8496715149663233 }
radiance 19
center 71.80611419677734 0 92.00202178955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3374767227174165 0.7849978783005982 }
radiance 30
center 75.64122009277344 0 109.58503723144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9601383824361324 0.32300352049148234 0.8430435666409226 }
radiance 20
center 86.84107971191406 0 82.4161605834961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.443691562237991 0.3456865272441031 0.9 }
radiance 31
center 60.44462585449219 0 100.38553619384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8834601109766849 0.4976071070346667 0.8300977078006887 }
radiance 22
center 48.8114013671875 0 108.71280670166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8431216660693238 0.48054547458665575 0.8153178068795917 }
radiance 22
center 71.32200622558594 0 112.62059020996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9002744996698935 0.462970379027169 0.9778240041115107 }
radiance 20
center 41.52834701538086 0 118.0205307006836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9267616368386129 0.4453286439211691 0.8319021714284466 }
radiance 28
center 62.64959716796875 0 105.26692962646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46480063366161417 0.39743527883289154 0.9 }
radiance 24
center 61.902496337890625 0 119.33429718017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4700198048100007 0.5003751905588234 }
radiance 26
center 71.43446350097656 0 116.53177642822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46488138108346055 0.46243780778848653 0.9 }
radiance 29
center 27.387229919433594 0 109.92015838623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.962127141108472 0.37340838084962635 0.9352974441289134 }
radiance 30
center 53.0494270324707 0 94.14128112792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842132623726161 0.4453074736641458 0.9500292855884463 }
radiance 19
center 63.023277282714844 0 98.02191162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8229799911799734 0.461590245684255 0.8714433165073077 }
radiance 30
center 55.81299591064453 0 112.86884307861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6243632909544412 0.326489103732099 0.9 }
radiance 21
center 30.754825592041016 0 98.50704956054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8751443289153368 0.33122053198056484 0.9320154160946024 }
radiance 29
center 12.765430450439453 0 119.63409423828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5866572789849714 0.434196662802241 0.9 }
radiance 25
center 23.156917572021484 0 117.01835632324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8883991418237644 0.41890153151260334 0.8925779213792311 }
radiance 28
center 56.74598693847656 0 121.7415771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4545573273667407 0.3336233705371286 0.9 }
radiance 18
center 22.237424850463867 0 139.60595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9743388738005696 0.392044223792812 0.9784832552479905 }
radiance 19
center 22.36444664001465 0 97.42084503173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8530894043756252 0.40255431574579215 0.9163923417406161 }
radiance 27
center 26.86152458190918 0 102.54239654541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9341116643949614 0.43193436688726083 0.975568246203822 }
radiance 18
center 1.596940040588379 0 127.40083312988281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8087939314184671 0.37935455078831337 0.931137831125062 }
radiance 16
center 9.021955490112305 0 112.30424499511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8516671688789289 0.356034166764831 0.8550909105733341 }
radiance 22
center 39.80394744873047 0 104.85049438476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8199243500626473 0.3976404367271763 0.9630403176110487 }
radiance 25
center 12.710880279541016 0 140.1644287109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8632533331622141 0.3817218407130975 0.9323080138321703 }
radiance 16
center 21.72890281677246 0 108.69815063476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8820191044604877 0.47225455098196245 0.8610952312318232 }
radiance 31
center 13.328871726989746 0 109.16444396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.314760836366746 0.4092131748003597 }
radiance 23
center 21.577184677124023 0 118.39376068115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4292931721006652 0.7657178288062795 }
radiance 17
center 11.457472801208496 0 122.41376495361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.860748483145623 0.30953521981411863 0.8374202605549828 }
radiance 22
center 1.3760958909988403 0 140.08204650878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9078793457630717 0.4266188350623059 0.9869684061580446 }
radiance 30
center 12.675589561462402 0 115.18228149414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9344138447077569 0.48672546158302477 0.9541219825004503 }
radiance 17
center 9.731902122497559 0 135.1388702392578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5205424287941985 0.41608652904245247 0.9 }
radiance 29
center -13.402876853942871 0 115.21633911132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44173768629837257 0.895008722994672 }
radiance 25
center 6.851707935333252 0 107.12918090820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9606012360703196 0.43145211460544014 0.8614115826538397 }
radiance 22
center 7.678271293640137 0 119.83516693115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4553955215412764 0.4250809598549439 0.9 }
radiance 25
center -11.093335151672363 0 109.7721939086914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8322664156104347 0.45229153721395754 0.9770787169632056 }
radiance 29
center 5.039900302886963 0 119.01354217529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9915730436306339 0.32551829255971976 0.8961118623579726 }
radiance 22
center -18.282705307006836 0 121.56293487548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8733409922135368 0.43763494135620584 0.8726464759866014 }
radiance 21
center -27.584583282470703 0 108.17378234863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42469547659729523 0.4368600273295568 0.9 }
radiance 25
center -2.1193952560424805 0 133.38499450683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8914613212224378 0.3575282667181789 0.8167290987293242 }
radiance 23
center -21.27235984802246 0 103.86168670654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33301690199658746 0.5047484251555094 }
radiance 23
center -36.28643798828125 0 112.94075012207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8028646566159925 0.430821757702219 0.9714911152663451 }
radiance 29
center -38.016605377197266 0 135.40713500976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8000351586852318 0.3877615700178109 0.8286565165046159 }
radiance 26
center -38.82211685180664 0 111.13396453857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9525856348200596 0.4321039774808821 0.8825560689371065 }
radiance 21
center -10.157463073730469 0 126.44659423828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8903735231524645 0.4643116149001213 0.9483340116978604 }
radiance 26
center -61.28567886352539 0 126.41720581054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8647134393205863 0.3923879702132386 0.9 }
radiance 20
center -54.671661376953125 0 123.5323486328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8861857936124767 0.4435863508115715 0.9542705229513838 }
radiance 26
center -63.48454284667969 0 120.23426818847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9378057514600976 0.48176441570018946 0.977283490674412 }
radiance 21
center -27.924461364746094 0 129.22145080566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8859252371193048 0.3692788760723371 0.816224439383715 }
radiance 30
center -66.43111419677734 0 105.41780853271484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8756026270885178 0.40414344861354085 0.9 }
radiance 27
center -75.25788879394531 0 101.512451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8943435492109646 0.4721585302721296 0.9910714779981782 }
radiance 25
center -81.74312591552734 0 86.97454833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9979205426365281 0.3956485532558255 0.871271779851701 }
radiance 28
center -73.38615417480469 0 92.8974838256836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34966321386057403 0.5391019857604219 }
radiance 24
center -70.90825653076172 0 83.83271789550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8081187889273663 0.3212369038644578 0.8025061857942857 }
radiance 19
center -64.21601867675781 0 118.17356872558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8940536014573659 0.47419266792692627 0.8583740748115368 }
radiance 30
center -59.67538070678711 0 107.26033020019531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3583960016311865 0.8301753388483232 }
radiance 17
center -88.74739837646484 0 92.76826477050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8485948404977871 0.4031969458767537 0.8520744322233096 }
radiance 21
center -73.84654998779297 0 97.87155151367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8598127079787806 0.4753685792350627 0.9497184779633203 }
radiance 26
center -72.52099609375 0 95.46482849121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9198884919074846 0.33299872859352436 0.9659453689057185 }
radiance 31
center -81.22420501708984 0 110.61320495605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43639604475782867 0.7630113568935551 }
radiance 17
center -101.05169677734375 0 78.47528076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.822574355206017 0.3716291032652673 0.8238404959513356 }
radiance 26
center -86.31177520751953 0 79.06611633300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4695109155412519 0.46547132598675267 }
radiance 30
center -73.70730590820312 0 98.75271606445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.689390990446804 0.3346286405667535 0.9 }
radiance 23
center -96.63316345214844 0 68.14497375488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3710966650864033 0.797437906553952 }
radiance 31
center -97.65509796142578 0 66.35216522216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9043640985559951 0.3511664848895194 0.8978924937012649 }
radiance 20
center -111.89009857177734 0 83.33760833740234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8183283098939109 0.48304786627917384 0.9701987417782518 }
radiance 22
center -97.0904312133789 0 90.54911804199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8649383167865011 0.45586008017558544 0.983501603273979 }
radiance 30
center -98.93549346923828 0 64.64398956298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9948836896924931 0.4891244337118311 0.8093248318114385 }
radiance 16
center -97.50605010986328 0 75.74081420898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8337654314036116 0.43880165869184196 0.8613911337077995 }
radiance 29
center -96.13154602050781 0 72.78726959228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.889777002430353 0.3419795365030606 0.8688508134968328 }
radiance 16
center -115.1536636352539 0 42.34127426147461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8461416529592307 0.3307759164958353 0.8397526333533272 }
radiance 18
center -101.07089233398438 0 56.810951232910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8330081497603157 0.32086154066205486 0.8926325922147438 }
radiance 17
center -85.26463317871094 0 41.205562591552734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.870504252470379 0.4152419113614545 0.8584474578144552 }
radiance 27
center -96.78129577636719 0 73.14319610595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8995911825104109 0.3682199963399761 0.9030837941014622 }
radiance 25
center -115.83757019042969 0 42.43898010253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41517477809076614 0.5026708139775341 }
radiance 27
center -110.03282165527344 0 42.308231353759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9301934430760593 0.34400830541852573 0.9277906678918085 }
radiance 27
center -103.75302124023438 0 38.8021125793457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.907297721762928 0.43268467913706793 0.973859816756363 }
radiance 25
center -113.8541488647461 0 63.4283332824707
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9853950777037805 0.4205277724661559 0.8675917467481028 }
radiance 24
center -101.09844970703125 0 55.09680938720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8484505717536629 0.3568189329348405 0.9807224053548205 }
radiance 30
center -114.8812484741211 0 48.954742431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9548620314299793 0.31690677770212655 0.9362034176071675 }
radiance 28
center -132.6093292236328 0 45.12678146362305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5227069038650431 0.3921593677216627 0.9 }
radiance 18
center -108.67839813232422 0 52.83723449707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8557742228949068 0.4042571448912519 0.969035851100476 }
radiance 19
center -115.66634368896484 0 25.550573348999023
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30801388563676785 0.6987840482284617 }
radiance 20
center -104.7099609375 0 51.48423767089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8027081908114676 0.3709848558324247 0.8395800882769584 }
radiance 28
center -101.0655288696289 0 29.274993896484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9721856550929753 0.4519573899610202 0.8499055302480129 }
radiance 18
center -126.40968322753906 0 38.50681686401367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9518259918630371 0.3520660643800557 0.9848083515045736 }
radiance 18
center -106.99585723876953 0 32.47685241699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212490594270994 0.3303946045767776 0.9551883280067823 }
radiance 27
center -102.21512603759766 0 30.021526336669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8055354768259435 0.49277628618804975 0.9105600686780828 }
radiance 18
center -121.20051574707031 0 12.339421272277832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9581422955858808 0.3572414175428609 0.8489917697774148 }
radiance 16
center -114.1111068725586 0 6.136502265930176
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867185312745658 0.3693579341081722 0.9562195518635178 }
radiance 24
center -112.87641143798828 0 23.9173641204834
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9657407256593802 0.3369969799793807 0.9224086104887228 }
radiance 21
center -101.01436614990234 0 -7.15399169921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8948752174151912 0.46269477979413276 0.9980380914814001 }
radiance 23
center -132.4600372314453 0 13.264582633972168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8672666904056997 0.3483148406273078 0.9876667248977751 }
radiance 24
center -137.1493377685547 0 -4.045502662658691
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3256355890571399 0.6031339769780396 }
radiance 28
center -131.31399536132812 0 6.938441276550293
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9813298788552985 0.4469069388374012 0.84227043135603 }
radiance 25
center -130.01138305664062 0 -0.7832876443862915
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8100014675923479 0.43292530925848544 0.9 }
radiance 21
center -132.43968200683594 0 9.243861198425293
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9197129599263025 0.30298023873758895 0.903176734511075 }
radiance 23
center -101.28770446777344 0 2.2012200355529785
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8024724436287151 0.4308055097036452 0.8418939372890053 }
radiance 23
center -108.15640258789062 0 -20.779165267944336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8538974914934461 0.3734197795881659 0.8599158958355981 }
radiance 17
center -125.77605438232422 0 -18.607454299926758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9397389723431461 0.34152587943702833 0.987614630757215 }
radiance 21
center -107.4040298461914 0 -35.19612121582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8391338838247291 0.4281091682185997 0.9972004785462453 }
radiance 31
center -98.62532806396484 0 -21.114566802978516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40749678824435254 0.4679889318291874 0.9 }
radiance 17
center -105.14859008789062 0 -18.45449447631836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.98944822612599 0.331362512140184 0.8210977025973074 }
radiance 21
center -118.494873046875 0 -19.19967269897461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40995995929263185 0.8265447089043674 }
radiance 28
center -129.4226531982422 0 -19.33942413330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8682632007007203 0.47027731254873184 0.8381185697818223 }
radiance 21
center -100.17062377929688 0 -33.84717559814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9278038819386644 0.39554411214812857 0.9056294069389965 }
radiance 18
center -128.19395446777344 0 -47.2165412902832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39998186168715566 0.4150373347382298 }
radiance 20
center -122.6872329711914 0 -42.584407806396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8461267469788956 0.3998032509030193 0.804896455761712 }
radiance 22
center -104.65465545654297 0 -49.088035583496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9273710977707803 0.39941167753881446 0.9407282624886074 }
radiance 18
center -103.54525756835938 0 -50.70663833618164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8937425489372969 0.37773761615160084 0.8150144478968591 }
radiance 31
center -110.64856719970703 0 -58.30186080932617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8903400323047646 0.3350696845442688 0.9952868760513552 }
radiance 27
center -124.53321075439453 0 -57.75251770019531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8122895103523803 0.4276646837975395 0.8120578644989084 }
radiance 19
center -94.31550598144531 0 -36.199764251708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8546061570415246 0.4122675539560001 0.8827973814963803 }
radiance 25
center -106.37859344482422 0 -56.02876663208008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8004351013213429 0.46110921313371844 0.9097058478579458 }
radiance 29
center -94.85877227783203 0 -58.727813720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9678552776525007 0.3044218876679095 0.9740707322633511 }
radiance 21
center -108.95333862304688 0 -59.56090545654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9599535515878913 0.37134179900472475 0.9389045268272325 }
radiance 21
center -104.80706787109375 0 -53.99851608276367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8304479511600754 0.32094620004968366 0.8885788796274802 }
radiance 21
center -111.11029815673828 0 -56.42376708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.762975753822162 0.3863644279719143 0.9 }
radiance 23
center -110.03436279296875 0 -53.299922943115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8633272279825482 0.4351904776598592 0.9465320853229211 }
radiance 20
center -94.0222396850586 0 -77.60720825195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8258825229543137 0.4042430880179372 0.9227884952362182 }
radiance 20
center -108.69913482666016 0 -75.19501495361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9108898124484932 0.46247039591585415 0.8810734235060613 }
radiance 28
center -89.23501586914062 0 -77.11459350585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.955272637875864 0.4597484580686575 0.8487021409468425 }
radiance 20
center -74.37785339355469 0 -60.156341552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.82249791253406 0.4495411714584061 0.9157166013310761 }
radiance 18
center -103.06971740722656 0 -86.41233825683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.418518454609484 0.3380277635583865 0.9 }
radiance 21
center -82.4145278930664 0 -85.27981567382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43716384222750737 0.39859015664951264 0.9 }
radiance 17
center -81.1495590209961 0 -80.87420654296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3946949052676979 0.6097023211374292 }
radiance 22
center -71.86972045898438 0 -95.43580627441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8137058316763116 0.3908017994903483 0.9089892171251331 }
radiance 19
center -92.249267578125 0 -66.7078857421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46945061393434473 0.7135552008012216 }
radiance 25
center -76.90069580078125 0 -82.33573913574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8738811847425788 0.40497387078219127 0.9973212526667716 }
radiance 18
center -68.3933334350586 0 -77.3258056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8863992745492024 0.4715718329216425 0.8503625021871006 }
radiance 22
center -86.04389190673828 0 -85.2333755493164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9605802635185048 0.42355294534845844 0.9110374744221358 }
radiance 29
center -85.064208984375 0 -106.36117553710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8027385103895042 0.42996613887063834 0.9373969772498851 }
radiance 27
center -58.626609802246094 0 -73.22279357910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9734482297768499 0.41132565123891063 0.836262833765365 }
radiance 20
center -75.06170654296875 0 -73.7959976196289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8876192660797257 0.4743653836886067 0.9033875991144439 }
radiance 21
center -66.16744232177734 0 -90.52059173583984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9215326418266463 0.31030570771500443 0.9551178405357685 }
radiance 28
center -60.79629135131836 0 -95.0224380493164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3035974308112899 0.8256032736298756 }
radiance 25
center -75.11085510253906 0 -94.19181060791016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9593111445190221 0.4342469681652742 0.8707090225962563 }
radiance 19
center -54.308040618896484 0 -98.27865600585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9669391701542083 0.3367456982358637 0.9129831499472654 }
radiance 24
center -46.657081604003906 0 -104.74479675292969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7962220245158163 0.4179584414054775 0.9 }
radiance 20
center -62.291221618652344 0 -95.77738952636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.879897554133795 0.38140809529828845 0.8027681114997185 }
radiance 17
center -47.203426361083984 0 -83.66951751708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8163254016970218 0.48419737842799265 0.8663886189301472 }
radiance 30
center -64.29093933105469 0 -116.0088119506836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.865735792401624 0.3964610440128799 0.9425463987745619 }
radiance 31
center -57.57968521118164 0 -91.31863403320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7219293714792291 0.47474286561512313 0.9 }
radiance 16
center -54.78680419921875 0 -104.74507141113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9120582351975913 0.4214451507449988 0.81981449603565 }
radiance 16
center -40.587242126464844 0 -104.3369140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8118998022796591 0.49065322966115366 0.9882553773721358 }
radiance 28
center -43.435951232910156 0 -99.72952270507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9738885502035998 0.38226875967615265 0.9793363417153863 }
radiance 23
center -18.365737915039062 0 -89.7919692993164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4050906508715022 0.3849362838058078 0.9 }
radiance 24
center -35.72059631347656 0 -105.04388427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8281060510846273 0.4527317524452542 0.8989230781094387 }
radiance 28
center -47.375301361083984 0 -112.23936462402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8765590106918291 0.4890238455589888 0.946125488040389 }
radiance 26
center -38.27083206176758 0 -116.1159896850586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.98552387254939 0.31381283900559864 0.997712376581028 }
radiance 25
center -6.286332130432129 0 -109.758056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8979436508556289 0.4505563041224402 0.8695482713801634 }
radiance 16
center -20.525798797607422 0 -113.99805450439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9799679003375723 0.32176848560065774 0.848317836953732 }
radiance 22
center -27.24154281616211 0 -107.20528411865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9583657936094125 0.31740711967431295 0.8914288713264895 }
radiance 22
center -19.461681365966797 0 -89.19709777832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9939707828839275 0.4649829848720839 0.8880823739708633 }
radiance 28
center -30.659582138061523 0 -100.06044006347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5332822566092963 0.4690019749046803 0.9 }
radiance 24
center 4.407142639160156 0 -120.6524658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9342646797854609 0.481340463976871 0.8676972115418733 }
radiance 24
center 2.154726505279541 0 -119.74270629882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8369347862166039 0.32738726441135296 0.9237066126312505 }
radiance 20
center 0.24775923788547516 0 -118.52470397949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9652729126379599 0.3119685129079375 0.9385864858145553 }
radiance 25
center -16.11921501159668 0 -101.45800018310547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9687027939394901 0.4410369728635672 0.9106839105162696 }
radiance 17
center 3.5178096294403076 0 -115.42015075683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33935889179316564 0.4879982198094347 }
radiance 28
center -1.6802335977554321 0 -117.07544708251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.90366224868201 0.46719226575725303 0.857051992062103 }
radiance 28
center 8.506937980651855 0 -110.95188903808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9165719035563014 0.3534166138812803 0.9356893533972851 }
radiance 29
center 8.728829383850098 0 -103.5234603881836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8671110427684663 0.40504800368455407 0.8076392447697524 }
radiance 19
center 4.293249607086182 0 -98.76548767089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8684559835939661 0.4693682648493791 0.9301682266709658 }
radiance 30
center 21.463912963867188 0 -101.01175689697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872685029840267 0.4520299184332132 0.8847432353603307 }
radiance 16
center 25.449954986572266 0 -86.82954406738281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8012279173628639 0.4130773025685356 0.9080600483456162 }
radiance 24
center 21.036893844604492 0 -85.57117462158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8732502595536894 0.32224482716320085 0.994939405044181 }
radiance 28
center 15.370699882507324 0 -101.4216537475586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8431704917327603 0.4949459509806352 0.9027625027400433 }
radiance 24
center 29.06757926940918 0 -95.78622436523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4195623600191576 0.5288204555630006 }
radiance 30
center 27.077085494995117 0 -83.84095001220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9882666070653023 0.34760338964822873 0.9741167650495766 }
radiance 24
center 46.297603607177734 0 -99.94883728027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8458954133943044 0.36100439786540317 0.9955383931726365 }
radiance 17
center 21.970733642578125 0 -105.73146057128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.947310504359919 0.369544788916189 0.8391178265155446 }
radiance 28
center 45.362083435058594 0 -105.44820404052734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44998695746840867 0.3976252010141612 0.9 }
radiance 19
center 27.28362274169922 0 -95.91191864013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603698794432395 0.35669835238313297 0.890686332590013 }
radiance 28
center 51.06374740600586 0 -79.00060272216797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8450466310243336 0.37810562971511463 0.916476305755226 }
radiance 26
center 34.65610122680664 0 -86.64116668701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9209741763153338 0.3876921147849206 0.8747630969063015 }
radiance 28
center 38.46989059448242 0 -79.931640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9214601931062084 0.4741514899301067 0.8400632634202724 }
radiance 30
center 56.51544189453125 0 -82.10126495361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9330811058641035 0.4522251244128237 0.9899738936339368 }
radiance 28
center 45.93871307373047 0 -81.55517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9070007886487449 0.4428250873923226 0.8330806959510408 }
radiance 16
center 41.82281494140625 0 -81.95545196533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9803999799699605 0.40954356538397296 0.8078289184370439 }
radiance 30
center 66.84805297851562 0 -86.14933013916016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6366495025063873 0.3922848041689012 0.9 }
radiance 24
center 46.233436584472656 0 -83.87047576904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9789760679406355 0.3574927704563395 0.8098695010323735 }
radiance 28
center 57.83940505981445 0 -63.1024055480957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9012617021864496 0.46119154855900096 0.8676780961969139 }
radiance 20
center 57.599327087402344 0 -84.4632339477539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7761664803746429 0.40080710765508365 0.9 }
radiance 17
center 69.4779281616211 0 -65.88509368896484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9086746542794999 0.44350580749399854 0.9276224482399471 }
radiance 27
center 62.643463134765625 0 -58.82837677001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9679342532082884 0.3298317428329998 0.9042366221462769 }
radiance 23
center 69.36949920654297 0 -55.858123779296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4788012418602272 0.5242832431458939 }
radiance 24
center 82.13350677490234 0 -71.4236831665039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9766467527306296 0.3163061742088783 0.9923803627448478 }
radiance 16
center 55.136783599853516 0 -64.01097106933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9767195920151934 0.45516631790457013 0.8396484777655522 }
radiance 21
center 61.203704833984375 0 -70.48838806152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8072175031014877 0.4299285904063924 0.978700374847551 }
radiance 21
center 60.69786071777344 0 -41.02302932739258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9185791447859389 0.4256296699680908 0.8653298484342412 }
radiance 22
center 69.61410522460938 0 -60.11433792114258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9979597648145344 0.3741666642239303 0.9412086527138641 }
radiance 23
center 80.44612121582031 0 -40.5473518371582
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8386357174802019 0.45102467043394767 0.9260209314338304 }
radiance 31
center 65.54153442382812 0 -53.0621337890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8856458998103641 0.4495203168571551 0.8382782371434443 }
radiance 24
center 86.93246459960938 0 -39.1839599609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8770942340995022 0.4423192015022962 0.9932195827153457 }
radiance 30
center 81.2499008178711 0 -24.086711883544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8274768742937739 0.45001113356212397 0.8062535066841922 }
radiance 21
center 84.8226318359375 0 -40.14020538330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8662967457759937 0.3648533640499556 0.9618167146884525 }
radiance 22
center 78.60737609863281 0 -38.497711181640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9246292701850938 0.32724139555856 0.832106365470324 }
radiance 25
center 67.12010192871094 0 -47.195030212402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4069096008783437 0.48512090887540316 0.9 }
radiance 19
center 92.92015838623047 0 -38.796199798583984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8275236628585404 0.46728116899026007 0.9575832384449555 }
radiance 30
center 81.84251403808594 0 -32.02457809448242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8072471297333996 0.31711426958886346 0.9033053028916243 }
radiance 17
center 94.86865234375 0 -27.76349449157715
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8166138795008442 0.30571833594746206 0.8257057351173855 }
radiance 29
center 84.02271270751953 0 -29.519607543945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9319211254419262 0.4000457519137469 0.9268626502929695 }
radiance 22
center 83.72388458251953 0 -12.074071884155273
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.975169789484516 0.43683662915921845 0.811606222365883 }
radiance 31
center 72.3595962524414 0 -27.73695945739746
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4401787915426997 0.35088951581801797 0.9 }
radiance 27
center 95.19706726074219 0 -18.116769790649414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3525497229230552 0.832554216440136 }
radiance 19
center 75.684814453125 0 3.444277763366699
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8958184204621691 0.42745977358941256 0.8648273726145053 }
radiance 16
center 80.60386657714844 0 -21.98037338256836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8938187829981727 0.302947989396754 0.8229749364606008 }
radiance 24
center 67.978759765625 0 -3.2925329208374023
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992336114990882 0.41942790335605673 0.9945698651871716 }
radiance 26
center 76.58092498779297 0 -17.431886672973633
radius 1
samples 1
}
