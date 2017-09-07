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
color { "sRGB nonlinear" 0.8609728664998308 0.3411761706243244 0.8535698325526291 }
radiance 31
center 330.8661804199219 0 4.91991662979126
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9020521785668011 0.4621185212303979 0.9044633429594997 }
radiance 17
center 378.60089111328125 0 34.825687408447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.814385889108999 0.41191986216116994 0.994669688098751 }
radiance 19
center 444.5074157714844 0 20.800718307495117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7867435027963109 0.3257182344263072 0.9 }
radiance 29
center 440.61773681640625 0 -17.25735855102539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9323713138426566 0.3920375933233622 0.9161975910598656 }
radiance 22
center 373.6621398925781 0 36.35023498535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9096668401909302 0.4541938126468667 0.9876658375607912 }
radiance 24
center 358.1726989746094 0 -21.742937088012695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9218694204765625 0.3138090645140012 0.8482430720907478 }
radiance 26
center 348.6597595214844 0 43.769710540771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.999766273397844 0.47998835273777285 0.9241815146262646 }
radiance 25
center 428.4565734863281 0 4.2230095863342285
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4299640827976644 0.4059756871222592 }
radiance 31
center 382.29608154296875 0 61.29405975341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8519391490789081 0.4724422681425391 0.9673457327119492 }
radiance 20
center 427.6893310546875 0 -27.908008575439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9152029565377449 0.3972314189478203 0.8009639961471614 }
radiance 27
center 452.2033996582031 0 -14.430490493774414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8967711143821845 0.41419286375374254 0.987316415531623 }
radiance 20
center 441.6701354980469 0 32.56404113769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9918495919452368 0.3022811547866079 0.868181769418063 }
radiance 28
center 403.5771789550781 0 59.13521957397461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9028231623508 0.33576409953462444 0.8530694037134585 }
radiance 23
center 426.19342041015625 0 -20.1783390045166
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8542000122250115 0.3508363254520162 0.9505248001008414 }
radiance 31
center 376.9060363769531 0 39.936683654785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9739197866398925 0.4812848673214458 0.8006241547597401 }
radiance 26
center 431.8719482421875 0 57.955047607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.498559826855299 0.603080858574895 }
radiance 17
center 388.13140869140625 0 95.54946899414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301778771535852 0.49556634007885325 0.996809931927791 }
radiance 20
center 415.0780944824219 0 20.0493106842041
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9139334176129532 0.4003458518121521 0.8894288844418693 }
radiance 29
center 387.66650390625 0 67.05027770996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8170459384861957 0.4965708623086559 0.9034937467655236 }
radiance 31
center 401.31500244140625 0 80.31991577148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9270050174155954 0.48103460218438493 0.9897410012147979 }
radiance 25
center 428.2611389160156 0 48.21902084350586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8755819504770886 0.4655273827913997 0.9536419047625568 }
radiance 31
center 366.530029296875 0 87.87960815429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9619019823009167 0.34012345291632023 0.8689465305518049 }
radiance 18
center 345.70458984375 0 92.03431701660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9593579969931478 0.3444015568315101 0.9733112109526869 }
radiance 30
center 376.9379577636719 0 120.32052612304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9154126834992207 0.49764760532507 0.9778008843029194 }
radiance 27
center 377.5740051269531 0 79.52274322509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9905787553108998 0.3617312840873364 0.9383314287076221 }
radiance 17
center 420.280517578125 0 100.40692138671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9331963653240103 0.31194544241041794 0.9041990247747309 }
radiance 23
center 363.1638488769531 0 -2.867133617401123
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866438478701766 0.498751446820832 0.9177736040272434 }
radiance 29
center 414.1412658691406 0 108.17076873779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32292513909797993 0.8549868824789523 }
radiance 27
center 384.59454345703125 0 102.07552337646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43831404892187276 0.43175975806370104 }
radiance 23
center 393.63055419921875 0 48.73622512817383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8695100130892601 0.4799555930308562 0.9956848042725422 }
radiance 24
center 445.6794128417969 0 29.605998992919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9278581123882271 0.4785025271071712 0.8393416119373078 }
radiance 27
center 344.6297607421875 0 27.64254379272461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5728450189678684 0.4354869384638904 0.9 }
radiance 19
center 439.770751953125 0 84.89805603027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9027020326049331 0.3886657421260987 0.8300014003284495 }
radiance 16
center 327.5801696777344 0 29.668893814086914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4906443589349991 0.863084450442267 }
radiance 20
center 341.9762878417969 0 122.08943176269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8037837053056546 0.3425263050460303 0.8670516080431488 }
radiance 16
center 433.3534240722656 0 135.2032470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.887165731223142 0.30941848260762034 0.8359348159899391 }
radiance 21
center 415.9361877441406 0 128.269775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4708262145958253 0.8280203025597271 }
radiance 24
center 344.018798828125 0 105.30745697021484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.877891129524235 0.33437721898791073 0.9029838018470371 }
radiance 30
center 368.5914001464844 0 108.26551055908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.856725429341451 0.49408718109959765 0.9607433049035976 }
radiance 22
center 402.3973693847656 0 120.1719741821289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8716318029747429 0.32565355216764297 0.8038332164597116 }
radiance 31
center 359.1209411621094 0 138.47654724121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47821061467638043 0.5455834926733141 }
radiance 23
center 347.7150573730469 0 104.19854736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8303473517940279 0.45980185266803375 0.8181509303262385 }
radiance 20
center 316.9453430175781 0 94.76014709472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8076679642161377 0.42250417247844585 0.9810797058458405 }
radiance 29
center 401.0461120605469 0 161.7645263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9359894388482536 0.4160106403202159 0.8017697252129716 }
radiance 22
center 341.69610595703125 0 125.27295684814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35388646736505713 0.5616760503514926 }
radiance 28
center 355.71722412109375 0 82.97441864013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8970117118491145 0.410330571442578 0.9504287169734147 }
radiance 31
center 408.8646545410156 0 155.6988067626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9455942265396861 0.39898895346491303 0.877899798374986 }
radiance 22
center 422.6727600097656 0 158.24148559570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8284210113191868 0.3510495369796545 0.9615688998728166 }
radiance 16
center 409.1709899902344 0 170.12921142578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9741388383449823 0.33004983392267523 0.8299726095083584 }
radiance 19
center 334.8404846191406 0 59.86198806762695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8087170888399244 0.30029381376611536 0.9155289733061378 }
radiance 18
center 340.80877685546875 0 182.8352813720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9037475649668701 0.3174757007110696 0.8422107137888288 }
radiance 23
center 311.99176025390625 0 149.72662353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8561470371470817 0.4967314458280658 0.9273468504130283 }
radiance 23
center 351.0850830078125 0 142.0780487060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8727341135132332 0.3730090300983845 0.9505558672106964 }
radiance 25
center 419.8599548339844 0 126.7436752319336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5246651951728746 0.40061340365748677 0.9 }
radiance 21
center 353.5739440917969 0 146.01617431640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9334546087283911 0.3416587588323735 0.9955514362301752 }
radiance 18
center 403.13690185546875 0 167.61045837402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48418895557802966 0.6912738673153872 }
radiance 28
center 357.3011779785156 0 176.73118591308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45778885404194203 0.46676809133900954 0.9 }
radiance 28
center 347.82904052734375 0 171.81007385253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6148383011236412 0.4831048427934953 0.9 }
radiance 23
center 300.2109375 0 113.0712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9635519895638446 0.4432483196508413 0.8578882257747539 }
radiance 25
center 338.5905456542969 0 71.65592956542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7196400487104441 0.4253510043801929 0.9 }
radiance 30
center 301.7210693359375 0 197.91864013671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9012271789608072 0.3793314713884494 0.978164958604195 }
radiance 31
center 297.37579345703125 0 126.71448516845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4651095019139535 0.3494323455942418 0.9 }
radiance 16
center 415.11541748046875 0 163.62518310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9089511749425209 0.46501025318480294 0.8622505664113785 }
radiance 16
center 386.11285400390625 0 185.9383087158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9124384945731147 0.3628910315009458 0.9730672844939241 }
radiance 16
center 306.6707763671875 0 190.3812713623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8626715223465002 0.40810178871964375 0.8733387179226388 }
radiance 24
center 372.598388671875 0 153.5455322265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8987723223083312 0.4992717721593584 0.9816447879286024 }
radiance 18
center 399.4756774902344 0 123.4757308959961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7710568749866263 0.3856956856795202 0.9 }
radiance 22
center 348.5792541503906 0 171.3912353515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842006663894158 0.41718948935257494 0.9800111688700425 }
radiance 25
center 340.91241455078125 0 175.15965270996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9444372701882068 0.3534566170970257 0.9530845472948892 }
radiance 16
center 306.8031921386719 0 151.11422729492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6760190443950156 0.4924696723065325 0.9 }
radiance 30
center 393.3775329589844 0 155.71925354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9901353497428595 0.33981601106831066 0.8999846274118546 }
radiance 29
center 278.1591796875 0 181.81703186035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36658073156215554 0.6056556409591963 }
radiance 25
center 301.14971923828125 0 160.2939453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9834574928963349 0.4858347243851302 0.8221165868273047 }
radiance 23
center 379.25384521484375 0 201.97801208496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9878910919173148 0.3223007906035052 0.9016041868229674 }
radiance 19
center 297.70257568359375 0 120.57002258300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6643532975286595 0.35503150020064395 0.9 }
radiance 28
center 402.168212890625 0 169.568115234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8261477884051316 0.4679605410890513 0.8399784923260921 }
radiance 30
center 305.0565185546875 0 233.116455078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9887224267999043 0.37736932696417014 0.9826712913124054 }
radiance 27
center 318.75653076171875 0 144.65562438964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9304885395038593 0.47629646490733213 0.8620209505381962 }
radiance 30
center 402.8139953613281 0 183.78829956054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9591660530333355 0.4516563474813321 0.9929777135494143 }
radiance 31
center 342.8377380371094 0 130.1761932373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45619033115897123 0.4383423124295125 }
radiance 18
center 267.5775451660156 0 244.33641052246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9484365925622746 0.38516416955519833 0.9276234621290821 }
radiance 20
center 269.80413818359375 0 219.3929901123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6036328425901357 0.43412537697425363 0.9 }
radiance 25
center 351.1448974609375 0 140.72657775878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8524401529903824 0.33909519543791494 0.8876907707345764 }
radiance 18
center 372.1870422363281 0 176.08058166503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8594333080513702 0.398265272360132 0.8508806240369701 }
radiance 25
center 270.26446533203125 0 131.2488250732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4273224177301739 0.76136680657496 }
radiance 17
center 275.6854553222656 0 230.07235717773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8469858198537125 0.45639378921087814 0.9815852908034767 }
radiance 26
center 346.17529296875 0 155.58062744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8677402632205434 0.3176480758098571 0.8294348633972487 }
radiance 30
center 382.2254333496094 0 221.4119415283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8840646251770422 0.47142423234969233 0.873957826415977 }
radiance 16
center 312.0498352050781 0 181.46029663085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38692723076760427 0.7735048018168139 }
radiance 26
center 295.4828796386719 0 201.04190063476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8687191134678519 0.30179188611025975 0.9445949307452159 }
radiance 28
center 262.121826171875 0 168.49850463867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8175522809872028 0.39572492775282175 0.8487433753580101 }
radiance 23
center 259.3183898925781 0 221.1175537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8060113541659786 0.45997550147538935 0.8392358651431164 }
radiance 18
center 354.8052062988281 0 163.0205535888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7054800038231505 0.41931595552314394 0.9 }
radiance 18
center 348.12225341796875 0 230.5359649658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9711598951390654 0.4199720943665167 0.8169191700057336 }
radiance 19
center 323.4300537109375 0 213.9831085205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9076642731205826 0.45951927280336824 0.9225928096275005 }
radiance 16
center 357.7906799316406 0 158.45130920410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9229602686030423 0.4082985865928357 0.993429733155598 }
radiance 27
center 312.72271728515625 0 154.46241760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8740826288907124 0.42356507848004465 0.8877603842672097 }
radiance 20
center 311.1543884277344 0 267.4757385253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8708395971362658 0.42021723833285085 0.9064825694775815 }
radiance 31
center 351.75469970703125 0 152.07363891601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9765467328397134 0.4342653208317596 0.8418986424409276 }
radiance 23
center 363.6935729980469 0 260.74609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8018794014927311 0.4690815082669766 0.9378963677277374 }
radiance 21
center 356.94293212890625 0 223.48631286621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46792645381862974 0.48816986498279813 0.9 }
radiance 22
center 337.6924133300781 0 228.76158142089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9144948134385212 0.38750116450649263 0.9467013092780543 }
radiance 16
center 302.33734130859375 0 230.03970336914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9694683670159198 0.46584399575806174 0.8870309514707138 }
radiance 21
center 335.13470458984375 0 269.3171691894531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35793851088330436 0.6033232647859716 }
radiance 30
center 268.5411071777344 0 228.007568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35574638480233245 0.8733776373535297 }
radiance 30
center 299.17010498046875 0 265.6835632324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8123103360251247 0.3008363724406676 0.9798738489564628 }
radiance 25
center 338.9589538574219 0 272.69110107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4882216000603376 0.5443549276353171 }
radiance 23
center 248.6138916015625 0 198.9144744873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9219391337892872 0.30605198800259115 0.8474542456973775 }
radiance 30
center 244.84661865234375 0 206.45379638671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9571867620832739 0.47659376203019477 0.9670763908994314 }
radiance 20
center 354.8850402832031 0 278.7808532714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8615485312088318 0.3035986560595339 0.8562363478624602 }
radiance 28
center 246.5321807861328 0 186.55052185058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43892346213863837 0.8772418245067278 }
radiance 22
center 226.90042114257812 0 254.7069854736328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.888633804196477 0.3599047700580276 0.8096454307375022 }
radiance 22
center 242.55303955078125 0 286.8099365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.870840380557911 0.42062839342365577 0.9211310952569476 }
radiance 25
center 338.2221984863281 0 190.84603881835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9200235900916003 0.4667725638014554 0.9376932284668987 }
radiance 23
center 277.6512756347656 0 261.1533508300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9510018377028355 0.4411346548049585 0.87479621037412 }
radiance 20
center 252.2060089111328 0 274.21600341796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7318662431792265 0.4658028604719876 0.9 }
radiance 31
center 231.22903442382812 0 232.4569549560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9839739632974875 0.3848972885890922 0.8833345149254732 }
radiance 30
center 304.5080261230469 0 263.8774108886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5490489540866175 0.388512054781433 0.9 }
radiance 26
center 263.802734375 0 291.0424499511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9830765973175054 0.44291974621481217 0.9754954566171496 }
radiance 25
center 233.43833923339844 0 293.3223571777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.493968328949123 0.8165665061386052 }
radiance 26
center 311.0224914550781 0 202.51878356933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8027787891710083 0.40019271256655364 0.9298942001661215 }
radiance 16
center 286.0906982421875 0 232.1966552734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9663399385631177 0.33799188238373595 0.8833734530677657 }
radiance 23
center 303.3486633300781 0 232.36756896972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.946297097585608 0.4776071092756612 0.8539167909645299 }
radiance 27
center 302.7976989746094 0 211.6295623779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9990177184976388 0.3613856457956317 0.9899765344526288 }
radiance 27
center 292.2380065917969 0 211.71157836914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.960856291964997 0.4974209856279799 0.8460419164648915 }
radiance 17
center 314.1126403808594 0 300.29248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8628009503261076 0.3062674930892318 0.8470043549730559 }
radiance 25
center 249.4051971435547 0 221.31988525390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8232104928440412 0.47435078316942925 0.8700406587307838 }
radiance 23
center 262.03033447265625 0 301.2895202636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8358741624854427 0.3342351696044817 0.809739941623477 }
radiance 29
center 245.43775939941406 0 204.87403869628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.96163691801937 0.4141903845473627 0.9951131016919139 }
radiance 22
center 314.957763671875 0 291.94464111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47581389859888285 0.8535508066170993 }
radiance 25
center 238.6697540283203 0 308.7045593261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8031493676519159 0.43570265169338895 0.9582908778956051 }
radiance 20
center 231.29873657226562 0 252.5989227294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.933907360181861 0.46922691081855705 0.8266874539177007 }
radiance 29
center 223.7554168701172 0 228.9984588623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9693244349731518 0.48550154487526814 0.9537626306404827 }
radiance 17
center 201.70274353027344 0 307.764404296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8360184080291493 0.4447078277323264 0.9334719389595292 }
radiance 21
center 285.52777099609375 0 320.3160400390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9123955430296983 0.30137240008726857 0.9615126932503661 }
radiance 26
center 281.2298583984375 0 230.84841918945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8292906470638302 0.478640289332402 0.9520689495342967 }
radiance 23
center 253.5729217529297 0 233.28256225585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8644410796563888 0.3645662448488861 0.8585228761439901 }
radiance 28
center 275.79913330078125 0 245.27182006835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533624197507474 0.39018247020307734 0.9159435007820658 }
radiance 23
center 292.238037109375 0 316.4940490722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8852048001591714 0.3225667152002621 0.8434903038294388 }
radiance 21
center 188.49903869628906 0 234.59104919433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4000371209609529 0.5604742555409401 }
radiance 21
center 278.9710693359375 0 284.94976806640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9776093241012593 0.32372535499145216 0.9051604913376378 }
radiance 18
center 216.17112731933594 0 229.759033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.831136455071989 0.3555333312969263 0.954389235768621 }
radiance 17
center 250.3378143310547 0 316.55438232421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.916959823717303 0.3214494603716589 0.8327322387200775 }
radiance 24
center 172.39743041992188 0 314.3020324707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5725569027793166 0.4267453706011415 0.9 }
radiance 21
center 283.2778625488281 0 336.3744812011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.909014144753921 0.3110491774921161 0.9808685471155523 }
radiance 19
center 206.71986389160156 0 294.48358154296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.321247231552986 0.516280256315786 }
radiance 30
center 243.17242431640625 0 236.33143615722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.875505755873574 0.3996697862105061 0.9043322462925828 }
radiance 25
center 241.19578552246094 0 294.50347900390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30593556446951137 0.8824370832940596 }
radiance 22
center 232.61300659179688 0 244.56686401367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8573220195349429 0.4844663447627351 0.9942420443376585 }
radiance 16
center 240.41586303710938 0 279.58868408203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36438576293307373 0.8207605405628859 }
radiance 21
center 246.8837127685547 0 331.0855407714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8900759399255826 0.35711422263383474 0.9612088676179545 }
radiance 23
center 247.21139526367188 0 306.709716796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8190029851235013 0.39898202370943237 0.9232943721295098 }
radiance 31
center 202.44046020507812 0 336.2471618652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.379953490303088 0.4625276583532226 }
radiance 29
center 178.39793395996094 0 340.8331604003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8041620789291446 0.35707629008316155 0.8770995703557978 }
radiance 30
center 245.55970764160156 0 275.56500244140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8608904176121652 0.4397307100631994 0.8532579150918165 }
radiance 19
center 231.7891845703125 0 359.15289306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3078925061070922 0.6575992616416169 }
radiance 19
center 221.64952087402344 0 311.1071472167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8966749679941319 0.3104358626772053 0.9967297907554057 }
radiance 22
center 250.61160278320312 0 337.017822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8292466417139264 0.32319020937807313 0.8373538916126291 }
radiance 20
center 246.8061981201172 0 328.4189758300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8876646969307791 0.4649578677601107 0.9 }
radiance 23
center 191.5216064453125 0 251.74093627929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9563700722170372 0.4351781807418484 0.873245968541881 }
radiance 17
center 197.20123291015625 0 261.5662536621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8546809368705947 0.3618757238632775 0.8950813403842812 }
radiance 26
center 191.835693359375 0 343.1395263671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9524419613732558 0.3711683325549455 0.8903616304346723 }
radiance 17
center 156.77899169921875 0 291.7872619628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8484322330515026 0.47592589657645124 0.9433141740879298 }
radiance 19
center 147.2530059814453 0 338.91162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3778658094340266 0.5574667061369849 }
radiance 23
center 153.34649658203125 0 317.48211669921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7662861344296564 0.3291913367476283 0.9 }
radiance 16
center 153.13601684570312 0 279.49169921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9540211127853866 0.41091215908904166 0.8093387310249605 }
radiance 19
center 190.58436584472656 0 271.6214294433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7758845412711682 0.345520167229636 0.9 }
radiance 31
center 198.66940307617188 0 265.888916015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9613192017474538 0.4779233210195241 0.979799659636929 }
radiance 16
center 209.1994171142578 0 356.1972961425781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46725940533594457 0.4905147410421796 0.9 }
radiance 30
center 243.36935424804688 0 347.01953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8230711446061367 0.31100053728452076 0.8464636219906282 }
radiance 19
center 175.65428161621094 0 288.85357666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9033450003777737 0.4230966015115124 0.9701465429464521 }
radiance 26
center 129.33741760253906 0 344.8970642089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8074432453645668 0.3064942341529749 0.8173740141221992 }
radiance 29
center 113.09009552001953 0 285.301025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8689433223398542 0.4845010652738987 0.8496369740141327 }
radiance 18
center 113.90599822998047 0 351.5087585449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8990338751043738 0.38650797910126555 0.9656774364453374 }
radiance 21
center 214.13377380371094 0 298.4243469238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7859609544646983 0.4392947144290539 0.9 }
radiance 22
center 207.58038330078125 0 346.2608642578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8460019867091991 0.4148986892868878 0.9091185555955023 }
radiance 29
center 136.33261108398438 0 334.38555908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9375897428070193 0.4539490346954129 0.8134238238821506 }
radiance 27
center 121.51605987548828 0 324.428466796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8475434022249488 0.3125189783029115 0.9492817860217388 }
radiance 18
center 130.2709503173828 0 325.3741760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9689093564850603 0.31710843644746495 0.8466478336760319 }
radiance 22
center 215.99769592285156 0 320.4451904296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7122954164759323 0.49398684650500346 0.9 }
radiance 26
center 118.18013000488281 0 270.064697265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7903352105362506 0.3226515918109039 0.9 }
radiance 29
center 139.72447204589844 0 270.503662109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9782446756199072 0.48263630168081706 0.9936465966094625 }
radiance 17
center 171.0368194580078 0 308.04876708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3109405949497289 0.8556349990233456 }
radiance 17
center 150.9712371826172 0 347.7357177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30919149613665603 0.5026890289228907 }
radiance 27
center 200.01922607421875 0 275.66534423828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8911255960135737 0.4775090716313992 0.9932739143263215 }
radiance 31
center 109.72296142578125 0 347.1739196777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4016723419281186 0.3219343945562092 0.9 }
radiance 19
center 143.0708770751953 0 330.96697998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6099423782033593 0.31216015893321974 0.9 }
radiance 25
center 195.63775634765625 0 362.70245361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8825524716426221 0.349566006893901 0.890733191443535 }
radiance 27
center 182.30633544921875 0 362.19158935546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9876672854423204 0.3521684334344158 0.8176823793168523 }
radiance 25
center 120.71684265136719 0 376.86114501953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8706311763795626 0.399641543138032 0.9137201923146514 }
radiance 25
center 177.2067108154297 0 379.59405517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43744900651357865 0.42206345960095437 0.9 }
radiance 19
center 162.92105102539062 0 300.3685302734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8816076521973685 0.3451130495278824 0.9034161496115214 }
radiance 26
center 147.13351440429688 0 323.31549072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3172087938751398 0.8675553387831112 }
radiance 25
center 174.780517578125 0 364.703369140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9167531017775952 0.33846059193784594 0.9374166193225236 }
radiance 16
center 78.88809204101562 0 331.25848388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9967338265051351 0.46964845370517017 0.9796819017406451 }
radiance 16
center 132.9715118408203 0 290.2948913574219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9687983012787702 0.32486250099054625 0.9677134856823291 }
radiance 18
center 96.19705963134766 0 306.4854431152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9556946957517618 0.3297951361718821 0.9584006917542653 }
radiance 22
center 179.1741180419922 0 339.921630859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8415520804827777 0.4656062416275952 0.8184207557727012 }
radiance 29
center 152.6685791015625 0 308.7852478027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7658199448554996 0.34874488513841323 0.9 }
radiance 30
center 147.41482543945312 0 318.88800048828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31875436077140434 0.5967216382451476 }
radiance 28
center 75.0660400390625 0 279.6056213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9308612670324481 0.319256388992274 0.8822062724031607 }
radiance 31
center 142.82827758789062 0 300.9156188964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6998888305616938 0.3870316589364865 0.9 }
radiance 31
center 149.2246856689453 0 349.8961486816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9823770455051255 0.3945322324184878 0.8683651487531732 }
radiance 21
center 139.56614685058594 0 387.8545227050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9787732803975462 0.38906335955675203 0.9262071391161689 }
radiance 20
center 116.00028228759766 0 372.53741455078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5969189771579654 0.45054054673690347 0.9 }
radiance 31
center 145.35435485839844 0 355.3724060058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8199748217404974 0.39405075145871543 0.9616726856015604 }
radiance 16
center 73.07579040527344 0 317.1372985839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3395777665205513 0.5225919834947331 }
radiance 31
center 128.1274871826172 0 367.2591857910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8003330380442522 0.47741958616505986 0.9294666117620746 }
radiance 24
center 135.928466796875 0 289.0008239746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8195549230367878 0.48184831932990946 0.9845954350330852 }
radiance 24
center 58.488037109375 0 338.1224670410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8392535065002985 0.3009648535991436 0.9993334964667726 }
radiance 16
center 119.13314819335938 0 344.4161376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8433631477057182 0.4932965580500228 0.9850910346227932 }
radiance 28
center 127.39592742919922 0 357.0393981933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9776256755066013 0.3939591205683495 0.8668069178308007 }
radiance 19
center 105.1035385131836 0 308.40838623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8796300646548699 0.4151934666972781 0.9098874477071704 }
radiance 25
center 38.311275482177734 0 363.4243469238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9203578787209282 0.31083400190444344 0.8689890411860748 }
radiance 21
center 83.11754608154297 0 296.1383361816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9512696850021536 0.37208374205577666 0.9432674442892279 }
radiance 30
center 101.666748046875 0 290.0299072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9770868738624472 0.38589571328558003 0.8584388798554641 }
radiance 20
center 61.23101043701172 0 395.8353271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9634616031325071 0.35434229472663864 0.8489454904900675 }
radiance 23
center 68.63771057128906 0 305.7843933105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3380597664249993 0.5556706075149881 }
radiance 30
center 88.19944763183594 0 330.50390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8378381969663253 0.43290356678649766 0.802858316377972 }
radiance 28
center 122.6916275024414 0 305.4679260253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9030494615779128 0.466350524029424 0.8772798528506156 }
radiance 26
center 101.82638549804688 0 297.5120849609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8686452979286514 0.43924150163142567 0.924717315063418 }
radiance 20
center 0.8976978659629822 0 286.9848327636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9898328457277797 0.3882948496179919 0.8726965691827726 }
radiance 26
center 69.58287811279297 0 375.010986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9863279657848918 0.4482124127787763 0.8713477484691828 }
radiance 20
center 47.583011627197266 0 297.1473693847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46731428635809985 0.5577614189012815 }
radiance 28
center 75.38872528076172 0 300.74786376953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.42271002363037047 0.3100602461025196 0.9 }
radiance 28
center 77.42550659179688 0 346.3039855957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8928144226050407 0.49895979678151314 0.9722025076998688 }
radiance 28
center 111.26454162597656 0 383.62005615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4194206443772597 0.331035353915385 0.9 }
radiance 16
center 50.62448501586914 0 301.89483642578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8924006250569801 0.47993317399244184 0.9588071551517904 }
radiance 30
center 102.29379272460938 0 308.9180908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8017654100493208 0.41834549488655903 0.9380590105115213 }
radiance 24
center 22.235450744628906 0 307.8197021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9669879789462903 0.3191717992294674 0.9201340280954663 }
radiance 26
center -3.072068214416504 0 317.5419006347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9555368178583576 0.4119363372582158 0.9498346065074261 }
radiance 25
center 46.886600494384766 0 396.59527587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8389022489669569 0.36351837481011734 0.8064797096899857 }
radiance 24
center 25.523963928222656 0 347.3559265136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4753510832253339 0.8613159205752954 }
radiance 21
center 69.53270721435547 0 301.73681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9047252811734814 0.4170489414932318 0.8096560713696839 }
radiance 27
center -24.456560134887695 0 297.2222900390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43308412172087707 0.7689948145192114 }
radiance 26
center 1.4764149188995361 0 349.3000183105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8741341947377254 0.4232755781602907 0.9 }
radiance 18
center 8.062891960144043 0 299.5020751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.802105421693649 0.3154593399394468 0.9762335404533454 }
radiance 21
center 1.5034111738204956 0 386.0248718261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9260278434305901 0.32057128453906414 0.9499551476985799 }
radiance 27
center -19.49345588684082 0 289.26776123046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8091752125304827 0.3869651213544897 0.877509498759157 }
radiance 28
center -10.980545997619629 0 394.479248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3929954929077957 0.6823132825431975 }
radiance 25
center -10.607023239135742 0 301.2944030761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8650240217526629 0.3706111439160238 0.9509894073286314 }
radiance 26
center -5.75843620300293 0 330.5218811035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9413449112250176 0.3671148491217676 0.9626241549395536 }
radiance 28
center 39.662899017333984 0 371.9878234863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8005910193697858 0.45270855656953235 0.939944828919611 }
radiance 23
center 23.629846572875977 0 393.16070556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9341573472240179 0.4437236600982668 0.8476801708201943 }
radiance 16
center -14.25001049041748 0 387.123291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8552688280286045 0.39204245151444467 0.968448654873627 }
radiance 20
center 39.98267364501953 0 308.31170654296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8431513274918438 0.4734460886664024 0.8737389275994442 }
radiance 21
center -5.033022403717041 0 331.5176696777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5145872833546508 0.47824001429158314 0.9 }
radiance 21
center 34.0479850769043 0 345.3184509277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9778212578696931 0.3727550658712112 0.8766307796197608 }
radiance 29
center 66.87622833251953 0 299.66571044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.863969731418228 0.433603253630665 0.9104814584686196 }
radiance 23
center 48.49473571777344 0 331.0912170410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8356032192760228 0.4627574934387104 0.887468892995142 }
radiance 19
center 19.493501663208008 0 391.80072021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9320074057187837 0.4508132058781093 0.8205307716467679 }
radiance 19
center 23.838247299194336 0 384.69793701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.903493390572189 0.3899632133691071 0.8135299868854979 }
radiance 20
center -59.98945999145508 0 344.5426330566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4198283885596883 0.6776642062747394 }
radiance 21
center -35.46950149536133 0 291.31146240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9080476177503765 0.34169329989548497 0.8422899375861488 }
radiance 27
center 30.602481842041016 0 356.6057434082031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9813113710070779 0.4408341068370907 0.9676754946000744 }
radiance 31
center 18.077117919921875 0 353.9977722167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8509500388337157 0.3014171028813763 0.8987783018577903 }
radiance 26
center -28.651779174804688 0 343.9257507324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49660705011196316 0.38091521329203215 0.9 }
radiance 18
center 21.733142852783203 0 337.0232849121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.993147746525769 0.4764102893670856 0.9462095219569864 }
radiance 16
center 22.994050979614258 0 380.9778747558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.916115423473751 0.3559624684492167 0.8928689007249707 }
radiance 18
center 43.872642517089844 0 387.4934997558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41836898069897344 0.7745272036780864 }
radiance 26
center -18.624595642089844 0 335.2992248535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9589912223869804 0.42879136154640984 0.9425292225683776 }
radiance 21
center -64.93985748291016 0 343.5833740234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.986916249046726 0.47133072403047244 0.8909911754814156 }
radiance 28
center -27.585664749145508 0 287.4389953613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9758916806007465 0.4047728007615359 0.800523146884204 }
radiance 27
center -24.73347282409668 0 332.5777587890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.98748152041026 0.31149135938717276 0.8508381549619819 }
radiance 31
center -70.27674865722656 0 307.34637451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9673462779396083 0.38363839958972323 0.9595839081052546 }
radiance 30
center -19.329849243164062 0 387.8914794921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9662295893014649 0.36031667531936795 0.9526306230387326 }
radiance 21
center 5.417995929718018 0 308.36163330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9596705615032518 0.42853100807840117 0.8946240333830514 }
radiance 21
center -83.1322021484375 0 289.1996154785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5587670185684872 0.46025665412943984 0.9 }
radiance 19
center -28.210826873779297 0 383.66571044921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8464808219744322 0.43096250564555855 0.8582415548569209 }
radiance 22
center -53.159446716308594 0 305.7519226074219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8256766079930454 0.42323276925660214 0.9243843828155234 }
radiance 17
center -68.22756958007812 0 308.74127197265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8498407155661787 0.34391602473137267 0.9182383987446239 }
radiance 23
center -83.82185363769531 0 280.0042419433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7147264519394773 0.44068856101829906 0.9 }
radiance 27
center -92.17194366455078 0 315.9374694824219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5464069598869361 0.32373675810688435 0.9 }
radiance 20
center -86.50128936767578 0 386.6775817871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8799195811510735 0.47357167848106185 0.916988160969131 }
radiance 31
center 2.419811964035034 0 328.5939636230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8602349515537251 0.33304530841569374 0.9482059277337086 }
radiance 25
center -91.24888610839844 0 300.1103210449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8674375221874925 0.46609638181884006 0.9 }
radiance 30
center -36.9473762512207 0 321.4757995605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8432778215299082 0.37870909896387167 0.9896192962344017 }
radiance 23
center -90.11766052246094 0 363.89404296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8806916279004438 0.47594144063113414 0.9558057176802326 }
radiance 17
center -84.79365539550781 0 305.34954833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9313110650600698 0.33317234209420105 0.8419255665390831 }
radiance 19
center -36.105281829833984 0 328.02349853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9223174147797665 0.47721056630085834 0.8844309472832228 }
radiance 19
center -124.43965911865234 0 378.9291687011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9926044992224023 0.30411132557038123 0.8495949222454706 }
radiance 17
center -40.34959030151367 0 339.4762268066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9810153385164258 0.3234781665681344 0.9941958967125981 }
radiance 29
center -16.657608032226562 0 299.81793212890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9850890541564408 0.3075276969232802 0.9845016523972521 }
radiance 20
center -34.40324401855469 0 291.2373962402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8256856220405862 0.3053220627865701 0.8694266066498673 }
radiance 21
center -38.55157470703125 0 342.7218933105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8929536954701903 0.39662959896556543 0.9051103711521847 }
radiance 22
center -17.26798439025879 0 303.5111389160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9788713480991016 0.4378379900896523 0.8309649772825176 }
radiance 16
center -126.84883117675781 0 325.5138244628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8179135749590755 0.3348274647545261 0.9097258199260388 }
radiance 31
center -63.901824951171875 0 349.9637451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3134572009679575 0.5068626563167125 }
radiance 16
center -54.25850296020508 0 374.49359130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8119450077504633 0.30325477197790773 0.9369526739155537 }
radiance 28
center -125.89995574951172 0 272.15313720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.906711250434764 0.4339180280341721 0.9496991729243417 }
radiance 23
center -64.04029846191406 0 335.1896667480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9220178184505877 0.4308059595002176 0.8794983461187006 }
radiance 22
center -127.78362274169922 0 302.24359130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8363351827805579 0.33950919109902106 0.9832039230160582 }
radiance 30
center -54.780235290527344 0 310.1699523925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8090571107385013 0.38112490207719096 0.8608607160452549 }
radiance 27
center -84.40174102783203 0 344.7482604980469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8888660874196523 0.3417351977221396 0.8510845306339282 }
radiance 30
center -92.06403350830078 0 358.95843505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8368906263215725 0.48686675501958254 0.8412765161857473 }
radiance 19
center -99.3276138305664 0 321.1307373046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41170786820739347 0.38362314228613237 0.9 }
radiance 24
center -123.6480712890625 0 296.6617736816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36557731177882385 0.6450024973829265 }
radiance 18
center -61.47898864746094 0 342.0494384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8228102001742716 0.3075269559299126 0.9562552720517036 }
radiance 17
center -88.2720718383789 0 304.8715515136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9524412710197698 0.33460363263217346 0.8389502502444794 }
radiance 22
center -70.5990982055664 0 318.82623291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6023775581851327 0.33526101668187885 0.9 }
radiance 28
center -141.57101440429688 0 301.83673095703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9520803738953793 0.3303729375538425 0.8954428431302851 }
radiance 28
center -80.93556213378906 0 268.0501708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.823745219388911 0.36221990819509203 0.9684627618885204 }
radiance 18
center -129.20452880859375 0 257.83343505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8668911448458627 0.32656168332466706 0.8743116070229927 }
radiance 26
center -102.1662368774414 0 341.1911926269531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9896549447267794 0.42034251625026403 0.9111422574146566 }
radiance 17
center -128.43235778808594 0 295.4433898925781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8839829653000036 0.4503853428687715 0.8312213103952396 }
radiance 31
center -94.53772735595703 0 302.104736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.336020058426173 0.4595741744760691 }
radiance 31
center -148.67901611328125 0 363.6298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8956101125391074 0.3212917246912063 0.8035392889670266 }
radiance 31
center -64.18277740478516 0 289.293701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8085704228937869 0.4139483501467818 0.8315917643777451 }
radiance 17
center -95.70072937011719 0 263.0215759277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.875523749330077 0.39694986604129623 0.9766748022997842 }
radiance 19
center -161.79742431640625 0 261.1279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3303816435774087 0.7201428581054001 }
radiance 25
center -138.4781951904297 0 268.0335693359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8559598139112082 0.3355272450427796 0.8021513974052663 }
radiance 18
center -141.8263397216797 0 351.5581359863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8500617956067651 0.3013850449039243 0.8671086164072773 }
radiance 28
center -178.69784545898438 0 280.3839416503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5530653432359751 0.3551142984961562 0.9 }
radiance 29
center -135.8207244873047 0 256.52935791015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45537192084410205 0.7651447992283491 }
radiance 22
center -152.7789764404297 0 327.7740478515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.858910887381878 0.3845688519231746 0.952967509605203 }
radiance 28
center -164.96722412109375 0 279.6468505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9451755330285655 0.3693610451898135 0.9119002123530776 }
radiance 16
center -96.6518783569336 0 332.6568908691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8278096923234262 0.39303800353968676 0.9630300636342439 }
radiance 30
center -101.66996765136719 0 327.454833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4601876290740571 0.4672360329425277 }
radiance 20
center -177.66091918945312 0 272.3872375488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5284109268054319 0.4414705478286046 0.9 }
radiance 25
center -75.54499816894531 0 293.4366149902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8486780553249642 0.4222978991852355 0.9 }
radiance 28
center -136.81153869628906 0 274.8009033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4354148784570361 0.5489970982664492 }
radiance 26
center -168.5072784423828 0 283.13494873046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9639920069110335 0.33202949684091054 0.9289084361308377 }
radiance 22
center -116.02587127685547 0 262.2228698730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842838298847866 0.4187563042678212 0.9373639301552839 }
radiance 18
center -139.77842712402344 0 240.42315673828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8477201934025397 0.48707613787200565 0.8101262995269473 }
radiance 27
center -173.33062744140625 0 300.0043029785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8287425682631923 0.38424976257267834 0.9 }
radiance 22
center -156.34829711914062 0 251.94789123535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8924454939241075 0.4105637957462692 0.9 }
radiance 18
center -175.5978546142578 0 285.12335205078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9896692265633088 0.41447999984518996 0.8771216456772546 }
radiance 17
center -192.62452697753906 0 282.58282470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9932195192823312 0.380375420784684 0.9248940870575227 }
radiance 22
center -124.44408416748047 0 263.67718505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5909186246177465 0.3541692908457009 0.9 }
radiance 31
center -134.42428588867188 0 332.08734130859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8080548482534324 0.37318500746907457 0.9 }
radiance 21
center -155.00088500976562 0 293.48382568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9959880413913238 0.32005929329733157 0.8593715564140536 }
radiance 16
center -188.14732360839844 0 260.3708190917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6337451491992832 0.33877345387676755 0.9 }
radiance 27
center -177.3990020751953 0 250.63096618652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4408815282325679 0.6622287763964717 }
radiance 22
center -122.2783203125 0 270.5146179199219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8511780009187092 0.30691478528948535 0.9052229702722261 }
radiance 24
center -125.9406967163086 0 272.4188537597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.536071382679671 0.37690395360280904 0.9 }
radiance 20
center -209.1858673095703 0 251.8644561767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9464716129991871 0.3658105391596558 0.855548111611517 }
radiance 27
center -139.2219696044922 0 331.5718994140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8335085295347084 0.41117590997851283 0.9646799905897597 }
radiance 28
center -197.42510986328125 0 297.79327392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8819519158472081 0.3864780234608224 0.8217805071302878 }
radiance 24
center -206.9627685546875 0 310.1986999511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8847839615717625 0.3817343717410894 0.9624885007969661 }
radiance 28
center -179.21543884277344 0 277.5334777832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9267054084974513 0.3735738544911653 0.909041993225215 }
radiance 29
center -218.9969482421875 0 300.1038513183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8107290866946713 0.32836228597088196 0.9349761567867513 }
radiance 16
center -132.60890197753906 0 275.04083251953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6420372812560479 0.4339031951107851 0.9 }
radiance 26
center -132.31805419921875 0 230.1671142578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9895432849369743 0.4383064947401087 0.9999025996493709 }
radiance 18
center -134.45814514160156 0 224.05369567871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47507589036666154 0.4106748708560526 0.9 }
radiance 17
center -208.2315673828125 0 219.87596130371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9265971607340907 0.39537080067347474 0.9807358874798291 }
radiance 22
center -192.95372009277344 0 231.387451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.963222576348988 0.34848899025937424 0.811758860623509 }
radiance 21
center -146.61862182617188 0 225.5051727294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31860321570556827 0.42838063782923885 }
radiance 25
center -196.48757934570312 0 310.9936218261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9682407381483847 0.40533781385207257 0.9946126649411737 }
radiance 28
center -216.4310302734375 0 247.77383422851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8110001534359237 0.43002678765632796 0.9062288305687863 }
radiance 20
center -130.6941375732422 0 251.38949584960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34362820226705604 0.8485459197872569 }
radiance 17
center -202.93377685546875 0 206.9286346435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9511536515804042 0.34961659981988874 0.9368483380228332 }
radiance 16
center -158.43743896484375 0 268.92279052734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49352154889959277 0.5046019076444336 }
radiance 16
center -181.81471252441406 0 208.12075805664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131721486746448 0.4231552038080647 0.9340520658495197 }
radiance 31
center -172.62652587890625 0 238.6220245361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9982148308668644 0.4455560862521992 0.9609122022418254 }
radiance 28
center -145.50389099121094 0 244.7261199951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30277882412675533 0.41218605365958516 }
radiance 21
center -219.31285095214844 0 295.29266357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8531396025674113 0.3346966750760621 0.919884737039939 }
radiance 16
center -212.0706024169922 0 298.34918212890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8559230421046717 0.44559284911924113 0.8139470606399739 }
radiance 25
center -229.41879272460938 0 305.547607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3997535164869891 0.5143820853490647 }
radiance 17
center -177.82858276367188 0 202.70751953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8138955126477145 0.3579238606118446 0.978583345808338 }
radiance 18
center -156.55755615234375 0 255.81854248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9646276573251166 0.36954173383505284 0.8239838291851372 }
radiance 31
center -251.44403076171875 0 285.5247497558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8480787840887114 0.38368154693924816 0.8175259793113159 }
radiance 16
center -236.2006378173828 0 196.82553100585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3408980797526798 0.7609606307331863 }
radiance 22
center -257.10015869140625 0 211.580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4226337919100289 0.8319372643102538 }
radiance 20
center -192.2846221923828 0 239.95741271972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38840448675857026 0.7524606971181698 }
radiance 20
center -233.8431396484375 0 239.96365356445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9449558875478616 0.48455651213727025 0.967462120097524 }
radiance 17
center -203.65830993652344 0 270.3706970214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43028921839239387 0.7753558212215875 }
radiance 21
center -227.72793579101562 0 202.6892852783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.960289531670771 0.387632703675294 0.9549092937828165 }
radiance 24
center -165.69732666015625 0 216.1554412841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8489228325590167 0.44275349215412974 0.816247996306954 }
radiance 31
center -214.92807006835938 0 243.7307586669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9235424354728617 0.3722755246688769 0.9859987986475054 }
radiance 22
center -254.7620849609375 0 270.6454772949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9473307857449671 0.460076806214505 0.9967488511667453 }
radiance 17
center -213.88241577148438 0 214.60682678222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7270374487061696 0.45015681141798314 0.9 }
radiance 26
center -179.7271728515625 0 244.63059997558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9244294052022763 0.4861475092575162 0.9631333946200954 }
radiance 30
center -205.0986785888672 0 254.8382568359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3389357967345617 0.814821120899556 }
radiance 19
center -269.4664611816406 0 261.47857666015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.835536236422791 0.413833628818416 0.9449360525531121 }
radiance 29
center -185.29864501953125 0 207.7998046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8490411560112338 0.33036454595449893 0.9938516633425938 }
radiance 31
center -177.43922424316406 0 204.38430786132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8352927777788682 0.39066537450493466 0.9 }
radiance 28
center -195.55995178222656 0 183.38197326660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8923036554422414 0.3923297797259959 0.9855890291903129 }
radiance 19
center -270.4030456542969 0 190.7900848388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9235593420747072 0.3333535692399798 0.9634040775810693 }
radiance 23
center -247.37571716308594 0 258.3016662597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9468272464831596 0.3568261668925229 0.9976848823656097 }
radiance 16
center -239.17196655273438 0 268.972412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9660641492907355 0.40027730025017333 0.9631483289695406 }
radiance 16
center -228.5153045654297 0 189.6052703857422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8859957347130106 0.47456995722716855 0.9889770630854717 }
radiance 30
center -250.8338623046875 0 213.65870666503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39865686064078765 0.5649539576998355 }
radiance 24
center -246.19839477539062 0 185.47882080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9258374031045723 0.3392993453379228 0.8470933366753062 }
radiance 16
center -255.7281494140625 0 182.38079833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9386967782303248 0.37618997479853566 0.814460727234932 }
radiance 19
center -194.06288146972656 0 248.87974548339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9867178369588027 0.4406269536487033 0.8732469934163493 }
radiance 22
center -285.7145690917969 0 227.5694122314453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8037396533418169 0.3646293534631986 0.8115804136404199 }
radiance 16
center -209.4307403564453 0 231.2079620361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8624799928918996 0.47225047742989923 0.990082367728507 }
radiance 28
center -273.4106140136719 0 170.5265350341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8293755325503003 0.44501179654587275 0.9 }
radiance 31
center -202.84185791015625 0 175.7774200439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9936995376420419 0.4291506455859262 0.8886333884837536 }
radiance 22
center -227.6849365234375 0 183.26162719726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8285666195985804 0.35828048476635066 0.8545856449673583 }
radiance 25
center -266.453369140625 0 188.9154510498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8188121329461162 0.46464769839092435 0.9128771970267517 }
radiance 21
center -293.4654846191406 0 151.36563110351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8168520754477478 0.30214197828483436 0.956346349041732 }
radiance 25
center -207.7691192626953 0 139.5319061279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8727289649356231 0.3409306722262094 0.9722116013412162 }
radiance 17
center -290.4869689941406 0 159.57144165039062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8874174509167227 0.3599132233492333 0.8916873420577258 }
radiance 24
center -199.84205627441406 0 194.34854125976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3099848838073985 0.6018672620660516 }
radiance 20
center -282.70318603515625 0 169.761962890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7733086726757906 0.4976584906983152 0.9 }
radiance 21
center -240.03919982910156 0 163.37496948242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9604970883373601 0.3643494678888457 0.8994836307962208 }
radiance 24
center -200.0138397216797 0 141.52127075195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8158785259240577 0.4451602515716585 0.8881626502047406 }
radiance 26
center -295.665283203125 0 184.91148376464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4971106394967806 0.710530635328184 }
radiance 29
center -199.59999084472656 0 237.48008728027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9779412515535567 0.3305625873247629 0.8351708744000348 }
radiance 29
center -209.6248779296875 0 195.79898071289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8534227128659317 0.3417849527672314 0.9922564755489975 }
radiance 18
center -306.54669189453125 0 197.49363708496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4724994795033648 0.769322130111323 }
radiance 26
center -261.5583801269531 0 198.63751220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49350962077444505 0.6536834763431107 }
radiance 20
center -290.2604064941406 0 162.26605224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9103486592910717 0.34770671357515975 0.8469269153278001 }
radiance 24
center -246.6538848876953 0 201.56655883789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5209332946332456 0.345427006607074 0.9 }
radiance 16
center -300.28546142578125 0 197.67237854003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9493257582407547 0.40800453880992904 0.9521377082166473 }
radiance 28
center -277.1650085449219 0 136.51861572265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8699411858663528 0.3884627609928177 0.9560401250313066 }
radiance 22
center -286.054443359375 0 133.80215454101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8162036399413651 0.4689873297192809 0.8260171263832018 }
radiance 31
center -221.8272247314453 0 188.10595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9452699789368939 0.48192731354060514 0.9412797342586984 }
radiance 20
center -218.1547088623047 0 212.9249725341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9454678955011424 0.47090877174100476 0.918661724630137 }
radiance 23
center -313.83441162109375 0 157.55397033691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47992347628035004 0.8528657756017294 }
radiance 26
center -293.74517822265625 0 195.1505126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7108027263835659 0.39017012566980624 0.9 }
radiance 16
center -222.5260467529297 0 134.26165771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.912219796603165 0.41124984494134253 0.8131499777675033 }
radiance 28
center -256.52960205078125 0 113.80659484863281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8517974342914992 0.33012235071890483 0.8493363478145284 }
radiance 28
center -297.6253967285156 0 185.10662841796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7951963321512051 0.4103668195643305 0.9 }
radiance 21
center -267.2908020019531 0 157.01531982421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8938895437900943 0.3285684161080663 0.9588359621438804 }
radiance 20
center -281.1285400390625 0 180.158447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8663850696410018 0.43841298859123434 0.9 }
radiance 17
center -282.6000671386719 0 176.98248291015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8293219868440936 0.31507646263262656 0.8482907877996482 }
radiance 26
center -238.76974487304688 0 168.92649841308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4520245858251585 0.8081032016841632 }
radiance 30
center -252.71400451660156 0 143.95010375976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3616743977666627 0.7318547393033576 }
radiance 19
center -286.871337890625 0 138.00296020507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5109304199483028 0.36356651590318456 0.9 }
radiance 23
center -314.0216979980469 0 125.43954467773438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8793906895515269 0.3276279913235072 0.9104010566764246 }
radiance 26
center -315.91888427734375 0 141.6654510498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9268109170217665 0.44161556338229024 0.9044326888820877 }
radiance 30
center -317.445556640625 0 174.04718017578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47471276534727547 0.3471353493582257 0.9 }
radiance 21
center -308.7268371582031 0 155.47158813476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9708203585225146 0.4465219116022664 0.9482546116976418 }
radiance 24
center -227.45269775390625 0 188.56646728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6521771897369097 0.47056989224411583 0.9 }
radiance 18
center -317.9950866699219 0 134.04852294921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4347362248122679 0.6864988307796512 }
radiance 27
center -273.6317443847656 0 154.76071166992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9681148359274976 0.42901375548696463 0.8703650603784435 }
radiance 25
center -320.82379150390625 0 146.36083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8209802650676994 0.4438752217615568 0.957065336057802 }
radiance 18
center -248.1893768310547 0 95.66361999511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6266414225458613 0.37792520990570333 0.9 }
radiance 31
center -305.1390380859375 0 88.63479614257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8461388153698712 0.379602571130071 0.9088616100270647 }
radiance 30
center -322.86474609375 0 164.8201446533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4348352889267141 0.4474844794367321 0.9 }
radiance 26
center -235.39710998535156 0 116.91586303710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9729727241248155 0.4060826942253837 0.9366123437116285 }
radiance 25
center -307.0494689941406 0 123.3138198852539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9126675985028696 0.3106056236041157 0.8380955327047741 }
radiance 22
center -233.2585906982422 0 97.9196548461914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8672935127086259 0.41657134274231894 0.8984247499529553 }
radiance 21
center -274.3692626953125 0 84.24307250976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8668200569756321 0.4160369929427245 0.9553060177605531 }
radiance 29
center -256.1425476074219 0 129.51263427734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3147951407810534 0.5334418678279352 }
radiance 20
center -249.09202575683594 0 155.59242248535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8935612926839722 0.3150530039405913 0.8865086607445218 }
radiance 28
center -269.7646789550781 0 72.7789535522461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3324571385626721 0.5665258542896467 }
radiance 25
center -268.8525085449219 0 74.26104736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9891527411455395 0.3369868224048234 0.8834307475837536 }
radiance 22
center -280.50836181640625 0 59.734256744384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301280149616586 0.4772568881724472 0.886450912233505 }
radiance 22
center -276.666259765625 0 141.49734497070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8427319864752261 0.4812633246856485 0.8861494362267472 }
radiance 26
center -274.2579650878906 0 93.52481842041016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8083783121524961 0.3062563822838558 0.9436403120223839 }
radiance 30
center -240.55322265625 0 150.6732940673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8698752363602453 0.35735373938004195 0.8807518133126094 }
radiance 19
center -288.1260986328125 0 90.5816421508789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8750255090779172 0.42496105026471664 0.8465914732226447 }
radiance 18
center -287.08233642578125 0 73.54234313964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5375771499809371 0.33808385785299194 0.9 }
radiance 29
center -296.23736572265625 0 86.83576202392578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.841423413542728 0.3732155187495466 0.9 }
radiance 25
center -320.1324768066406 0 120.93177032470703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4164833262128107 0.8068907960260412 }
radiance 17
center -274.1108703613281 0 115.0560073852539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8550391714871219 0.40140623481048276 0.8991413774813408 }
radiance 16
center -265.6922912597656 0 135.37936401367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8158633119305749 0.4918356079627162 0.9056625701183731 }
radiance 30
center -242.58018493652344 0 77.31409454345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9089118258225373 0.49264814907747423 0.9828276281400536 }
radiance 21
center -333.9873352050781 0 45.561649322509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9964367606660194 0.35748892919730624 0.9398674842267584 }
radiance 25
center -288.6410217285156 0 110.90597534179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.852950448632872 0.31110332303833776 0.9369984412167832 }
radiance 29
center -270.02545166015625 0 84.3186264038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9968597270877402 0.4946526684601046 0.9567665882653016 }
radiance 24
center -321.11505126953125 0 46.01974868774414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3181031367744965 0.6718471660321894 }
radiance 23
center -311.67926025390625 0 115.35689544677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.963697494943019 0.4755069909945859 0.9102202301380256 }
radiance 24
center -336.650390625 0 86.90361785888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.862300630581899 0.3779825832700862 0.879975400349513 }
radiance 22
center -274.1759948730469 0 43.03996276855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9236317310718604 0.39764372592789665 0.9273529584148443 }
radiance 26
center -318.8304443359375 0 51.607120513916016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8607342050959633 0.383080309855505 0.8299154768762262 }
radiance 31
center -264.10272216796875 0 54.015403747558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6235423788271016 0.3362002040231615 0.9 }
radiance 25
center -245.5855712890625 0 18.802162170410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8440469934958963 0.4475725857803464 0.8927755827104726 }
radiance 21
center -327.1190490722656 0 35.9614372253418
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9864397626555617 0.424623469490216 0.9354366534393241 }
radiance 22
center -315.3431701660156 0 110.13436889648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9044020855493967 0.38492395232098453 0.9901635901296801 }
radiance 16
center -253.1865997314453 0 112.44789123535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4875591982041185 0.36264659876645905 0.9 }
radiance 19
center -332.5296325683594 0 27.317018508911133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9113086242220925 0.4379035060936729 0.8450176155166269 }
radiance 29
center -293.97296142578125 0 34.83382034301758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.969244006876615 0.483670641358036 0.9485894480224564 }
radiance 26
center -280.1961364746094 0 64.24544525146484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8271980350362229 0.4288069544276618 0.8214193981348608 }
radiance 23
center -326.10150146484375 0 81.78267669677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4048125855293253 0.46437603446315723 0.9 }
radiance 18
center -329.0605773925781 0 76.89596557617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3403397203003742 0.7522491538656872 }
radiance 30
center -290.3354797363281 0 43.39236068725586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6378229077409232 0.4266530995313699 0.9 }
radiance 26
center -300.1005859375 0 88.28034973144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8371427240486604 0.43919567580931795 0.8446562445291353 }
radiance 20
center -294.20770263671875 0 95.68147277832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9103385852050683 0.3633929004728983 0.9397789703156113 }
radiance 25
center -273.4281311035156 0 33.12895965576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8456207211521354 0.4944986310438001 0.9 }
radiance 18
center -314.0048522949219 0 37.695587158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7126211765708331 0.4969200033116345 0.9 }
radiance 18
center -290.52496337890625 0 30.527610778808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4320940308385902 0.4826761756202262 0.9 }
radiance 26
center -313.0463562011719 0 -2.201735258102417
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4651928215341936 0.4122324693387318 0.9 }
radiance 21
center -341.4122619628906 0 70.38858795166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8361106127025912 0.44339305424053255 0.825210490242866 }
radiance 19
center -281.9212646484375 0 67.91761779785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.442590193122506 0.5669062065310376 }
radiance 26
center -289.18701171875 0 52.54037094116211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7052186641664948 0.4359367172694393 0.9 }
radiance 24
center -326.6328430175781 0 24.580224990844727
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9159671902747175 0.4603690795271355 0.8346734298526588 }
radiance 17
center -293.56854248046875 0 17.597105026245117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9343907724011895 0.3909357831620216 0.8593276619270026 }
radiance 24
center -253.9066925048828 0 20.83662223815918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8118910110530924 0.3983440440727535 0.8354075491933336 }
radiance 24
center -278.9560241699219 0 -18.422325134277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8297054336832469 0.44540268103738095 0.9457459994867708 }
radiance 19
center -287.4870300292969 0 60.01584243774414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.809474512467259 0.4600212663101362 0.9286160669741104 }
radiance 29
center -280.9412841796875 0 66.08332061767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8243891846926962 0.39910416345842153 0.9477882771170761 }
radiance 27
center -299.6540222167969 0 59.0984001159668
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8132823913278217 0.33620790971210035 0.9787468368807064 }
radiance 16
center -261.77923583984375 0 5.637046813964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9899512021262599 0.3196228901364349 0.9651805772730039 }
radiance 22
center -284.25616455078125 0 43.62306213378906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8994263310695618 0.4191339115418148 0.8299891662113306 }
radiance 23
center -302.0460510253906 0 16.938499450683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9477419859330867 0.4689713284762719 0.8208606961442169 }
radiance 27
center -309.3843994140625 0 36.613319396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8845910509921485 0.3660279770657639 0.9325248657019385 }
radiance 29
center -339.40045166015625 0 -18.725658416748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8165143622740343 0.42777751308405576 0.9410417839140381 }
radiance 23
center -273.2242736816406 0 -32.20458984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9298485290832105 0.3840258331582248 0.8559321757225652 }
radiance 21
center -248.38314819335938 0 44.25593185424805
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.742960167590328 0.41172427616709883 0.9 }
radiance 25
center -300.14947509765625 0 27.894126892089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8077921892145841 0.4134350332684815 0.9392701550741811 }
radiance 25
center -318.17218017578125 0 11.579710006713867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8066207025035428 0.4939699427550841 0.8687690115450805 }
radiance 17
center -335.9378356933594 0 48.67886734008789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9641999688221006 0.4317698967252922 0.9018377489726257 }
radiance 18
center -322.68011474609375 0 48.913333892822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9753762013218203 0.4642866846498861 0.9426968984993587 }
radiance 24
center -260.3256530761719 0 -39.521400451660156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8501730798261611 0.4159799079968618 0.8215516036134258 }
radiance 16
center -274.6609802246094 0 56.797386169433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8666337278592098 0.388625179939866 0.8101912007338046 }
radiance 17
center -263.1275329589844 0 -8.81943130493164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33709288989426417 0.4290295934688704 }
radiance 30
center -320.26837158203125 0 -55.345298767089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8447581820570275 0.4860279369250904 0.8847792217768404 }
radiance 22
center -282.6769714355469 0 -20.92618751525879
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8241827268841008 0.3587845187318974 0.9570829042460584 }
radiance 27
center -258.876220703125 0 -50.60361862182617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8596689077186768 0.3192303528591896 0.9783488093314902 }
radiance 22
center -306.7940673828125 0 23.05047607421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8963034778662597 0.3955339079119041 0.8279025706882686 }
radiance 29
center -248.39552307128906 0 -40.981449127197266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9333265662770657 0.37213948292816146 0.9062277043577303 }
radiance 16
center -277.1546325683594 0 -50.55632400512695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39615191092548796 0.8073474243950809 }
radiance 16
center -317.790771484375 0 15.884902954101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6293680729009903 0.3424836471404815 0.9 }
radiance 26
center -329.6990051269531 0 -40.06121826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.683229835553613 0.49896811882618086 0.9 }
radiance 22
center -241.93531799316406 0 -44.807735443115234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8335865317917674 0.39197242554412526 0.82641840507937 }
radiance 16
center -305.3584899902344 0 5.750274181365967
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8843457738101603 0.3326615653212875 0.8260453430228827 }
radiance 23
center -324.88543701171875 0 3.583709478378296
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8896850406047483 0.35451504807435624 0.9 }
radiance 19
center -278.13055419921875 0 -7.998626232147217
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9352164953111173 0.4164034853739713 0.9440254465497878 }
radiance 24
center -239.80897521972656 0 -2.7943172454833984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37454223815340204 0.6498993962363754 }
radiance 29
center -263.38677978515625 0 -2.838613986968994
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3969192892677862 0.8641018864196973 }
radiance 31
center -274.70294189453125 0 -45.56123352050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35753678923610716 0.43512805227892504 }
radiance 25
center -299.962646484375 0 19.226383209228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.810145767184302 0.3894490587863456 0.9472866842980161 }
radiance 31
center -289.0973205566406 0 -34.38102722167969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8919590514687925 0.35563642668359047 0.9599493031857047 }
radiance 19
center -301.0736389160156 0 -31.791906356811523
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4453109040348291 0.5458444322055412 }
radiance 21
center -302.4156494140625 0 17.627248764038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8288044770763011 0.3346288994912019 0.954022574025619 }
radiance 28
center -302.9024963378906 0 -72.6856689453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40339574230385766 0.6800001498361903 }
radiance 20
center -316.6071472167969 0 -75.04981994628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9996566611345558 0.3634742323536828 0.886137613365575 }
radiance 20
center -271.790771484375 0 -54.16859817504883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9343686755694882 0.43665594078845626 0.9440200050171477 }
radiance 24
center -240.74871826171875 0 -47.64167785644531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9968564889043267 0.3132203070318779 0.853532294573337 }
radiance 16
center -260.0485534667969 0 -20.909996032714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9373345025293698 0.4376012265610565 0.9031866186929502 }
radiance 18
center -257.3421630859375 0 -57.6243782043457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9162296389281417 0.35077322624707796 0.8625273432301256 }
radiance 30
center -268.1829528808594 0 -43.28315353393555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47381463098597254 0.48048026688934253 }
radiance 21
center -322.5101623535156 0 -66.349853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4942582929913162 0.5727653931824431 }
radiance 25
center -260.7937927246094 0 -49.786319732666016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37612779217663306 0.7257485802127392 }
radiance 25
center -289.22308349609375 0 -37.29002380371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9386296750068307 0.462142434993177 0.811833809159233 }
radiance 29
center -293.58880615234375 0 -48.946556091308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6716129931055154 0.48158473680051095 0.9 }
radiance 27
center -292.4134216308594 0 -108.28477478027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8902700401615433 0.40766793989987327 0.9571302959711782 }
radiance 27
center -323.5020751953125 0 -39.04534149169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8162207035748963 0.48635765791499946 0.8356684066597219 }
radiance 17
center -324.14239501953125 0 -28.011003494262695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9357807283860368 0.4444980879407005 0.8316346618791955 }
radiance 25
center -246.88999938964844 0 -23.147497177124023
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9002551181686348 0.32929958845975915 0.8353965410213624 }
radiance 31
center -299.15570068359375 0 -37.68161392211914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.934679185000395 0.4369333794637914 0.8325484783281414 }
radiance 23
center -256.01934814453125 0 -20.048240661621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9446908748550851 0.34122123593300313 0.8407747676886564 }
radiance 31
center -309.4404296875 0 -45.494014739990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8693975955089479 0.30943231875151916 0.9720664430847622 }
radiance 21
center -263.9637756347656 0 -26.493032455444336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8649017138000573 0.4012755225396968 0.8856089289251756 }
radiance 24
center -323.3761291503906 0 -90.92240905761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48099371206184255 0.7135666317460682 }
radiance 30
center -258.50506591796875 0 -51.825504302978516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448192326719657 0.38589733632065826 0.9167413202402511 }
radiance 20
center -299.105712890625 0 -81.89676666259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9857380241167338 0.4215813246083958 0.8793974804651183 }
radiance 28
center -243.70082092285156 0 -73.6383056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8714936779903182 0.44002780870854935 0.8190813841653218 }
radiance 20
center -299.88519287109375 0 -120.31214904785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4666604264139613 0.4561227038610668 }
radiance 20
center -272.84423828125 0 -37.768611907958984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8587633365929995 0.40279437330173185 0.89019506888688 }
radiance 26
center -264.253173828125 0 -97.94136047363281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8521153137714934 0.3632390803849824 0.8453480444204945 }
radiance 27
center -250.57374572753906 0 -117.96662902832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9241818480671188 0.42366572477552483 0.8775657984444221 }
radiance 19
center -284.6155700683594 0 -92.91776275634766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3921356957760842 0.5618693485612125 }
radiance 26
center -307.9429931640625 0 -96.64141082763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9987728163067726 0.4117567541500411 0.9373300823036267 }
radiance 20
center -258.1551208496094 0 -105.728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9532124962414013 0.40441556112793664 0.8662400384210756 }
radiance 28
center -278.6881103515625 0 -80.28475952148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7982376947729696 0.47415609647320756 0.9 }
radiance 30
center -252.3951416015625 0 -50.479915618896484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3404418392747119 0.7096591895367453 }
radiance 16
center -308.180908203125 0 -123.40996551513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8693980682552784 0.3383382550005665 0.9 }
radiance 21
center -264.3953857421875 0 -53.748531341552734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892230335012689 0.4246052425879849 0.9229278209424816 }
radiance 20
center -262.22821044921875 0 -81.98707580566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8673250083679154 0.49731632560441075 0.8901621148900813 }
radiance 31
center -258.0712890625 0 -108.92080688476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4239075607394064 0.8249514441936242 }
radiance 22
center -267.6086120605469 0 -100.92474365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37024703892204525 0.7036096328777731 }
radiance 22
center -261.4393615722656 0 -65.66316223144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43720211722387836 0.7104687981267857 }
radiance 20
center -281.50982666015625 0 -136.86773681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.809267055068617 0.462797716324405 0.9 }
radiance 31
center -258.6286926269531 0 -85.91149139404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8492888701619903 0.37010003637877054 0.9607714972044876 }
radiance 26
center -246.7432098388672 0 -118.09037017822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8288642712065085 0.401803318903666 0.8315019672254517 }
radiance 18
center -257.7433166503906 0 -144.84051513671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.48681597839172075 0.3254729855846981 0.9 }
radiance 26
center -280.79119873046875 0 -95.46800231933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9508552979568338 0.401613797888666 0.9577011099395498 }
radiance 23
center -273.264404296875 0 -140.21141052246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33174382267018704 0.548293446326288 }
radiance 25
center -270.3851013183594 0 -122.88175964355469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8051572087022064 0.3488703999173663 0.8875950879614944 }
radiance 16
center -211.06910705566406 0 -121.23193359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8214920635168284 0.42602331196387383 0.9160362053952693 }
radiance 18
center -209.7827606201172 0 -130.27491760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9999857222717524 0.3922439207274999 0.8972771407523246 }
radiance 29
center -255.18655395507812 0 -80.65655517578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43149715950329165 0.5501722641231702 }
radiance 21
center -261.3822326660156 0 -145.2862548828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4369366326629929 0.3659480575507452 0.9 }
radiance 20
center -249.36854553222656 0 -92.9202651977539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8494363100154563 0.42051245588689645 0.9989091552482456 }
radiance 17
center -280.84954833984375 0 -132.6601104736328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45335321932401607 0.5566325728117729 }
radiance 24
center -223.9597930908203 0 -95.3222427368164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8709660625009493 0.4356065118186227 0.9299733116823603 }
radiance 31
center -202.0404815673828 0 -172.10850524902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45676181312538144 0.3481893756045068 0.9 }
radiance 19
center -216.53553771972656 0 -136.2472381591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8456243759979147 0.4011672434553914 0.9590750582734797 }
radiance 25
center -244.95956420898438 0 -140.9540252685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9839743937945287 0.3796536529964917 0.963430347021362 }
radiance 25
center -223.69143676757812 0 -118.01734161376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44085852358611344 0.8036767231332006 }
radiance 23
center -281.273681640625 0 -93.55426788330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9836401740912957 0.40630281278708796 0.9118070140482962 }
radiance 28
center -217.94699096679688 0 -106.97528076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8436869870820303 0.4944816635160856 0.9774911847361528 }
radiance 23
center -226.8677978515625 0 -89.28033447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.690886834386064 0.475716018339862 0.9 }
radiance 16
center -234.37681579589844 0 -137.1889190673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3553350424873328 0.8793987855449036 }
radiance 21
center -250.03375244140625 0 -141.72300720214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9449745836260659 0.38879384976606823 0.9184628691707671 }
radiance 31
center -263.29473876953125 0 -118.73463439941406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46385882850447546 0.6651321773244833 }
radiance 19
center -238.9969024658203 0 -117.88135528564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8085447555151062 0.4770441503384165 0.9608293300561672 }
radiance 30
center -231.11041259765625 0 -173.406005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5417180035766983 0.3530590705249111 0.9 }
radiance 22
center -232.88900756835938 0 -105.23767852783203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9629392420739079 0.34928935848897047 0.9790619736486388 }
radiance 25
center -216.78297424316406 0 -171.0264434814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9794459979629564 0.43851220579272576 0.8452927054428615 }
radiance 30
center -262.4560546875 0 -107.95317840576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9092370116668284 0.37014851429897533 0.9953342273383996 }
radiance 21
center -276.8734436035156 0 -150.06846618652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9521354389318724 0.33481482413358277 0.8362687770291272 }
radiance 24
center -198.6573486328125 0 -163.67958068847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8439953586071175 0.48377643391493014 0.941290355946 }
radiance 19
center -223.00343322753906 0 -119.2345199584961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9444672079083514 0.487083534988326 0.8882121626412176 }
radiance 30
center -197.8108367919922 0 -128.1673583984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9816436577075476 0.3471384772966115 0.9573533900661708 }
radiance 28
center -211.304931640625 0 -195.70965576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9155170374115351 0.45315145699813975 0.9091740938948983 }
radiance 26
center -187.22280883789062 0 -134.86802673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8816445053049174 0.4856946437765852 0.8675046162604745 }
radiance 25
center -212.12269592285156 0 -197.56179809570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9817048391175938 0.4865806983971858 0.8535191720144861 }
radiance 23
center -260.3025817871094 0 -167.21664428710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9811495772638212 0.3258819602583029 0.9347580323885051 }
radiance 27
center -211.92481994628906 0 -187.16156005859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8018404593483286 0.43377232658524134 0.9249089709021943 }
radiance 23
center -210.61338806152344 0 -146.3195037841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9337325881868002 0.3306721433401368 0.9559904884870672 }
radiance 29
center -231.00315856933594 0 -190.28724670410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3251010414598066 0.7839367419828981 }
radiance 21
center -230.60691833496094 0 -195.3262939453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8974092359764403 0.3387766273031685 0.8023267111171449 }
radiance 30
center -233.33299255371094 0 -112.1079330444336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9030766034617601 0.3400430631256385 0.8675531962416692 }
radiance 25
center -209.09788513183594 0 -151.4792022705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8751625423435391 0.4672579973654842 0.8727731205062905 }
radiance 22
center -244.43295288085938 0 -141.59976196289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8001944588347323 0.32119515582534613 0.8568723840758329 }
radiance 26
center -198.37353515625 0 -178.89797973632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9888144565350125 0.46914990387948297 0.8951789034898668 }
radiance 18
center -248.31968688964844 0 -206.22897338867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8309530637242597 0.43133757299224906 0.8845447019268584 }
radiance 28
center -221.40789794921875 0 -132.80239868164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7339755483208616 0.3339432066417375 0.9 }
radiance 24
center -215.28013610839844 0 -166.1610107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8575632142888967 0.31841961508884 0.9805996854187382 }
radiance 19
center -188.18011474609375 0 -185.78395080566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9024926549503589 0.4384457255434168 0.9116792527404645 }
radiance 19
center -218.4517059326172 0 -198.58837890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8131496679616467 0.3598173993047787 0.8225651170693028 }
radiance 31
center -221.0672607421875 0 -123.05863189697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8388059524958476 0.4512289001352491 0.8231714349149519 }
radiance 23
center -253.4718780517578 0 -175.46133422851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8775439669762773 0.4515492308018557 0.8079028797329254 }
radiance 31
center -182.22369384765625 0 -202.20968627929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9004807693299908 0.3421430292314652 0.9666236568069094 }
radiance 31
center -187.5731658935547 0 -179.92613220214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.962347971647302 0.4642641848788171 0.8946104689690229 }
radiance 21
center -195.907958984375 0 -181.19601440429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43552722789117626 0.45666335916869805 }
radiance 23
center -239.86651611328125 0 -209.36123657226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.522380196618497 0.371521786385146 0.9 }
radiance 20
center -169.61746215820312 0 -140.34324645996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9573567344210178 0.39691541423977306 0.9706085889241594 }
radiance 20
center -209.19485473632812 0 -135.1565399169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.321997917329922 0.4563346367876213 }
radiance 27
center -213.34059143066406 0 -157.79043579101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4794792000950018 0.6920846587943221 }
radiance 19
center -238.0026397705078 0 -223.44110107421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35816723250114035 0.6678575122623952 }
radiance 25
center -193.4580841064453 0 -190.85458374023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8816189378719783 0.40342729555842627 0.8114403496218577 }
radiance 31
center -185.4707794189453 0 -149.29315185546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8756525810303105 0.4796993923361787 0.9 }
radiance 16
center -169.7436981201172 0 -211.75460815429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9545127460948954 0.34699457877006 0.8289429622441539 }
radiance 20
center -197.66419982910156 0 -205.76998901367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8138155284546502 0.3255821859388993 0.8325881034594571 }
radiance 27
center -166.23451232910156 0 -186.42919921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.955780927293545 0.3257026080857246 0.9391857255328953 }
radiance 17
center -167.0509033203125 0 -206.47540283203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.864489356209375 0.45736596765083226 0.9595744036005799 }
radiance 21
center -209.24855041503906 0 -169.8936309814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8831829109886382 0.31635597960684575 0.8680636211083856 }
radiance 24
center -227.13485717773438 0 -181.13165283203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3851554149260783 0.48663846829800605 }
radiance 16
center -181.8658447265625 0 -189.43905639648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8735136636628549 0.46736217523075996 0.9755634401754337 }
radiance 23
center -231.626220703125 0 -223.07098388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8820992609644138 0.4154486832504233 0.851606872594618 }
radiance 25
center -181.5101776123047 0 -182.2993927001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8808316830827412 0.3004640858268551 0.8926035689228491 }
radiance 20
center -228.6626434326172 0 -227.08470153808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9366132810273654 0.3961057479502551 0.8750733000352334 }
radiance 19
center -191.085693359375 0 -208.0749053955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9879233719536152 0.37069194213982903 0.994157089401343 }
radiance 21
center -139.2476043701172 0 -232.80662536621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8550565222444537 0.3477065514675723 0.8737285759043938 }
radiance 18
center -147.0360870361328 0 -197.22940063476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8169957547889128 0.4187659268411106 0.8302134904938017 }
radiance 29
center -193.7721710205078 0 -185.04364013671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4894462113316501 0.3413819741281501 0.9 }
radiance 31
center -191.34178161621094 0 -187.90493774414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4331184424294911 0.8047993495204464 }
radiance 23
center -173.11962890625 0 -186.333984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9951393181618012 0.3263457206424111 0.9246225238105971 }
radiance 29
center -167.07135009765625 0 -187.0738983154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9151800913748128 0.41386056789348313 0.9266769262004916 }
radiance 18
center -203.88999938964844 0 -242.49563598632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8526200051322185 0.4693460818332601 0.9168085810555574 }
radiance 25
center -203.45680236816406 0 -221.04522705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8560253123635487 0.4163468222332217 0.8869369776515859 }
radiance 23
center -208.11561584472656 0 -162.33714294433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9820915709065094 0.33940731579677635 0.9327050477689398 }
radiance 24
center -164.01702880859375 0 -217.37271118164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8486146793743816 0.3421388202745563 0.8999342806563243 }
radiance 17
center -189.76124572753906 0 -198.54513549804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9050754831272849 0.3321890267393684 0.9049496138909852 }
radiance 27
center -133.11962890625 0 -240.18460083007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9830524952398576 0.3518690209648365 0.849574111285225 }
radiance 18
center -127.02345275878906 0 -224.51824951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4354966845283891 0.49620077984337874 0.9 }
radiance 20
center -149.6727294921875 0 -198.03146362304688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8776925114280705 0.3701108036489038 0.824397613749663 }
radiance 23
center -133.3366241455078 0 -253.2986297607422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842481373760648 0.4396287385443204 0.9332596469816572 }
radiance 27
center -182.41676330566406 0 -233.45669555664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9247242946720905 0.45879115343238364 0.8058236901500062 }
radiance 25
center -145.76974487304688 0 -201.29246520996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4863625224200372 0.37298984561993515 0.9 }
radiance 21
center -197.23524475097656 0 -229.81442260742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8835478201916871 0.3816135792870957 0.8817896946268852 }
radiance 24
center -193.80328369140625 0 -250.01824951171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46530813369302837 0.8987464656294158 }
radiance 24
center -154.4046173095703 0 -216.95199584960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34143767862629537 0.6081371170751253 }
radiance 20
center -165.16702270507812 0 -236.494384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7663618683360908 0.44295824904798586 0.9 }
radiance 30
center -149.63504028320312 0 -229.6811981201172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8977079010752678 0.3147796239486562 0.9729022453842389 }
radiance 30
center -170.20816040039062 0 -223.11471557617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4611604145326236 0.4952895415530403 }
radiance 17
center -138.13111877441406 0 -178.65370178222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.924602327879111 0.45387903585312617 0.8065878895981711 }
radiance 16
center -154.81512451171875 0 -234.78875732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9210435858934729 0.47034657872533925 0.8187712634860811 }
radiance 28
center -158.94747924804688 0 -188.6239471435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7263078523512315 0.31197999826424044 0.9 }
radiance 17
center -175.9027862548828 0 -243.92276000976562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8933127204668736 0.4123266296493475 0.8497768364833627 }
radiance 31
center -121.03072357177734 0 -247.8673095703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35475944467403386 0.5285735312965013 }
radiance 20
center -159.1873016357422 0 -199.76734924316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9741939016482872 0.4582406565396845 0.8528130785729692 }
radiance 22
center -170.7257537841797 0 -220.63824462890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6303969375337457 0.3577568184229832 0.9 }
radiance 29
center -129.5645751953125 0 -190.07435607910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9195850617519518 0.42340356868361784 0.8423775418907242 }
radiance 29
center -107.0364761352539 0 -261.43988037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4856933034528901 0.4876102117422896 0.9 }
radiance 21
center -144.16488647460938 0 -222.64590454101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3691274951860338 0.8178979338080808 }
radiance 26
center -138.2662811279297 0 -196.99118041992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45919661998614003 0.7701101134376109 }
radiance 18
center -171.05638122558594 0 -188.99664306640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8510624070383009 0.46948033234355546 0.8950339762932813 }
radiance 31
center -94.2451171875 0 -207.4809112548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.40210101263148135 0.31772792406709355 0.9 }
radiance 16
center -174.6309051513672 0 -234.6749725341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8895821922782369 0.4251782618174302 0.914176686452019 }
radiance 28
center -110.07577514648438 0 -226.33901977539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39680332363801096 0.6789155829205721 }
radiance 25
center -106.46690368652344 0 -250.7099609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9078747872805055 0.4464075536114715 0.9070449020322247 }
radiance 27
center -166.49343872070312 0 -232.2841339111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41251181794921066 0.8537635152695929 }
radiance 19
center -96.8382568359375 0 -203.6985626220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9066739633992734 0.32263722932688976 0.9012420433516257 }
radiance 24
center -145.1748046875 0 -250.89402770996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8142508571688678 0.48311424630957833 0.9737150705923393 }
radiance 25
center -99.75960540771484 0 -252.86614990234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33413579009724154 0.6555282513509311 }
radiance 24
center -86.90193939208984 0 -229.25604248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8369039276498225 0.4139977447121056 0.8664200824604819 }
radiance 29
center -123.9120101928711 0 -254.47674560546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8830557710061877 0.3485536069601978 0.9 }
radiance 29
center -152.72879028320312 0 -252.27488708496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9671830192350976 0.4250505453260202 0.8422079455284097 }
radiance 25
center -154.59556579589844 0 -201.46253967285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9110766393968454 0.3479435221691104 0.8784124574879277 }
radiance 17
center -94.88461303710938 0 -251.49777221679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.44576406023047754 0.3307363795641472 0.9 }
radiance 26
center -159.75909423828125 0 -218.28817749023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8147115339378751 0.32259248985103267 0.8787631122786115 }
radiance 25
center -103.80139923095703 0 -216.77804565429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8095061090880972 0.4417629504277535 0.9684235500094858 }
radiance 18
center -75.78739929199219 0 -211.09767150878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4671985534807872 0.561188387135634 }
radiance 30
center -130.3162841796875 0 -237.78582763671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.881298734007327 0.4004223686656865 0.9859650884529703 }
radiance 22
center -133.6056671142578 0 -271.2256164550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9226404428512059 0.45260293675232866 0.9522733659552863 }
radiance 24
center -106.51034545898438 0 -251.5444793701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9887199569862134 0.47274954417456316 0.8220436473419435 }
radiance 27
center -126.53064727783203 0 -267.61163330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8157437686163372 0.3046117745463794 0.931372956519543 }
radiance 25
center -85.40364837646484 0 -223.9903106689453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8041236546476375 0.3274264235177693 0.8017661533588858 }
radiance 23
center -107.60282897949219 0 -235.66986083984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9932114818237471 0.4744527895596846 0.88054448309196 }
radiance 22
center -133.17784118652344 0 -199.16368103027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8380670952765525 0.35097700406739235 0.8724545875793464 }
radiance 21
center -123.60958099365234 0 -248.22705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8183221714676572 0.318310665473397 0.875868072678125 }
radiance 25
center -73.19217681884766 0 -201.64244079589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9268804450136805 0.42564557958035565 0.9263983353495016 }
radiance 21
center -69.61885070800781 0 -245.6903533935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5812331650419079 0.44569404226123965 0.9 }
radiance 25
center -116.01815032958984 0 -259.4332580566406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9779626073815562 0.42118489283991556 0.9613215436136393 }
radiance 29
center -113.2259521484375 0 -214.03314208984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8306847828327254 0.4613930975213426 0.9470710524127467 }
radiance 23
center -85.49160766601562 0 -231.4477081298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8922345436971474 0.4995529311455049 0.812199746852881 }
radiance 27
center -63.48899841308594 0 -201.81881713867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9283341880388275 0.439513811831232 0.9208961865141243 }
radiance 28
center -77.01837158203125 0 -255.1562957763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8094217430506884 0.4125911683589647 0.8533263858951428 }
radiance 28
center -113.75984954833984 0 -247.29132080078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.983224090898352 0.35556357897536295 0.9476897507288156 }
radiance 30
center -100.95085906982422 0 -270.9246520996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9026180579193596 0.4546199188467823 0.8936582278790417 }
radiance 19
center -91.18789672851562 0 -278.6693115234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9931080311775422 0.37972236782777163 0.8648293292826602 }
radiance 22
center -113.55957794189453 0 -200.73712158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8075341901032367 0.456441197187076 0.9979062738033745 }
radiance 30
center -78.95359802246094 0 -223.1094207763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3634566621272514 0.6552094995849321 }
radiance 22
center -80.76538848876953 0 -269.3621826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49096082513004696 0.8041658142851084 }
radiance 18
center -100.06307983398438 0 -250.29278564453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41011598683828304 0.6293447330578967 }
radiance 30
center -104.35334777832031 0 -254.3500518798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5536732218617664 0.3244291903499735 0.9 }
radiance 17
center -97.38648986816406 0 -244.92625427246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3281500298066773 0.6860118988384794 }
radiance 24
center -88.92127990722656 0 -251.04925537109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8741461591596835 0.4064109169577687 0.9217610255189616 }
radiance 29
center -35.06221389770508 0 -217.51116943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4714969938803998 0.5779390284097401 }
radiance 23
center -49.46969985961914 0 -238.47618103027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9748372181311912 0.346816864371955 0.8722758294202492 }
radiance 25
center -31.064029693603516 0 -205.143798828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.943402933035004 0.3135303187816969 0.8495241369099846 }
radiance 24
center -63.59940719604492 0 -241.57138061523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7055905786438312 0.43251285419035573 0.9 }
radiance 21
center -24.034040451049805 0 -239.0273895263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.896265046768775 0.3317839412933729 0.8957681127627319 }
radiance 29
center -78.43734741210938 0 -286.2450866699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8429013373269242 0.42610056609644664 0.8542494277209313 }
radiance 29
center -57.424652099609375 0 -256.4598693847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8253349717098744 0.48780167245617323 0.843045055230419 }
radiance 27
center -16.13728141784668 0 -213.04530334472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8925694449512959 0.44546974626427416 0.9356574556457811 }
radiance 25
center -50.920494079589844 0 -282.2969665527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8451650046188733 0.4435462866832536 0.8088852772362999 }
radiance 24
center -58.44222640991211 0 -228.25282287597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9467345518618595 0.31793753140449843 0.9763187055575866 }
radiance 17
center -27.11414909362793 0 -219.4644317626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8738542061953494 0.3240134329894087 0.9495372299198801 }
radiance 19
center -12.448481559753418 0 -228.7453155517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8022540757568195 0.4498507555529979 0.8089781806707648 }
radiance 22
center -93.92633819580078 0 -228.59542846679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9183321489835912 0.35975025678260525 0.8519868510733488 }
radiance 29
center -47.96791458129883 0 -233.75340270996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8424358596864926 0.31155955792093987 0.9 }
radiance 20
center -39.06468200683594 0 -272.3804626464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9773676893212038 0.3785814344716535 0.9029929159321054 }
radiance 29
center -19.709426879882812 0 -215.39317321777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8552493637306029 0.38667770353593117 0.8003919104531415 }
radiance 21
center -38.80322265625 0 -279.9875183105469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9438264586195889 0.4594677734766358 0.9818155014033265 }
radiance 31
center -0.35001492500305176 0 -253.01287841796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8084150444495829 0.4472470940850781 0.9337132447102942 }
radiance 19
center -12.297037124633789 0 -228.7576141357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5675030709337305 0.40766899411666147 0.9 }
radiance 19
center -65.8685302734375 0 -232.3426055908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8344971904104269 0.39778489216100754 0.8651188375458382 }
radiance 24
center -36.43407440185547 0 -278.0372009277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8613109348103116 0.39610693289183996 0.9168396631966779 }
radiance 19
center 1.8081167936325073 0 -234.08973693847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.889415866273736 0.47766081826962153 0.8510680606348562 }
radiance 27
center -12.200604438781738 0 -275.3787536621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9006097078373428 0.43126520296460114 0.8462372211131068 }
radiance 25
center -2.046898126602173 0 -237.02493286132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9817510608232716 0.4678942541411749 0.9059590676291696 }
radiance 20
center -35.02770233154297 0 -214.4559326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9840232544295575 0.3601607323950547 0.8096306716562125 }
radiance 20
center -37.236083984375 0 -228.42919921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8901890940392937 0.4813032395861216 0.9414504473397729 }
radiance 27
center -29.627662658691406 0 -257.0647277832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8470547847806503 0.32480698215037235 0.9269641931768547 }
radiance 23
center 6.147884845733643 0 -246.33804321289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108747704381071 0.35554335633741707 0.9199721429608871 }
radiance 31
center 15.207011222839355 0 -261.181396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8360976053390908 0.4929413160089708 0.8521704817659105 }
radiance 25
center -57.1706657409668 0 -256.2315368652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7005936915720029 0.48927063689351924 0.9 }
radiance 27
center -62.98884201049805 0 -279.4986572265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9270710734446757 0.46458236716022266 0.8722578448393551 }
radiance 27
center 10.61526870727539 0 -265.0511474609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.868549064301195 0.38771745563263604 0.8737371770022916 }
radiance 18
center 13.307903289794922 0 -257.1524658203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45972952923210264 0.7517652528964488 }
radiance 20
center 3.9900174140930176 0 -239.3817596435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9471638539560117 0.4976306477570424 0.8085065167931625 }
radiance 21
center -10.410609245300293 0 -262.5669860839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9049746414476733 0.35404197637278134 0.9261611605066339 }
radiance 17
center -23.03780174255371 0 -270.1260986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9060177925900417 0.3584936883219683 0.9843491189062118 }
radiance 19
center -1.0993770360946655 0 -212.0308074951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8621835193751541 0.4153418678403271 0.9 }
radiance 25
center -30.868915557861328 0 -244.0254364013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.930486135055578 0.38055233184021764 0.8016037522624733 }
radiance 29
center -46.91915512084961 0 -216.42361450195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9637342804693284 0.38328242436351373 0.9578794643484 }
radiance 31
center -11.307719230651855 0 -255.87071228027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.48745977021170606 0.49086238098425555 0.9 }
radiance 25
center 0.7062439322471619 0 -241.2296905517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8917628236879019 0.4789027288751846 0.9766932862400943 }
radiance 21
center -10.43610954284668 0 -223.2191162109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3068345439485932 0.6569426070291284 }
radiance 21
center -47.274208068847656 0 -249.1082000732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9191251844878219 0.35166023609460756 0.9989985625840436 }
radiance 18
center 35.13285446166992 0 -280.3023681640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9420087758518222 0.3394598199070354 0.8243875710841094 }
radiance 27
center -25.29085350036621 0 -216.70309448242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8490916710777963 0.33710660782844737 0.9337483106366213 }
radiance 28
center -7.326488494873047 0 -209.97232055664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4015847525994345 0.6388990620711577 }
radiance 27
center 27.460590362548828 0 -213.88772583007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4944370343252939 0.5310425873827328 }
radiance 26
center 18.895536422729492 0 -260.0790710449219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.945714831564657 0.3066243986891855 0.9710969334386643 }
radiance 25
center 9.825069427490234 0 -283.5473327636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8577948626216936 0.39640529739723274 0.8527987489690798 }
radiance 24
center -10.262275695800781 0 -272.8692321777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8561467585220648 0.3963154443962604 0.8691260550943656 }
radiance 28
center 31.850942611694336 0 -240.91949462890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8291932051360371 0.4782142844873453 0.9812067702353118 }
radiance 25
center 41.8751220703125 0 -266.522216796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8170193010812326 0.4883651694505867 0.9921736039757638 }
radiance 26
center 14.826478958129883 0 -284.9817199707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9752996147680432 0.43237625856797113 0.9826874767634912 }
radiance 23
center -13.9909086227417 0 -266.93988037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33453837053275964 0.44514794514080214 }
radiance 20
center 36.995765686035156 0 -264.51788330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8254454633360854 0.4844048575866283 0.9026391601840784 }
radiance 20
center 33.405799865722656 0 -222.2030792236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8720727921027699 0.44337704115688004 0.9012589548545213 }
radiance 17
center 35.16249084472656 0 -254.09950256347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8395377911021673 0.46416834131228474 0.8208044149112441 }
radiance 25
center 1.0988560914993286 0 -211.63853454589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8989747429158443 0.3069075295168236 0.9829925919042635 }
radiance 16
center 41.29970932006836 0 -250.0055694580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.903095065920624 0.4837360284879373 0.962840861579028 }
radiance 31
center 7.0001420974731445 0 -224.31126403808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9446613305194284 0.38723569035868866 0.9565813557732505 }
radiance 30
center 20.80414581298828 0 -260.4892578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9359902720824183 0.4308581866079928 0.8125769403621569 }
radiance 30
center -5.20139217376709 0 -286.3303527832031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4131391249431575 0.8738469671012911 }
radiance 26
center 42.048770904541016 0 -227.73626708984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8333756768660133 0.34228225311334964 0.8063066245460279 }
radiance 23
center 1.1673132181167603 0 -283.46502685546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8138409682713402 0.44938812351539936 0.8095102934398147 }
radiance 22
center 46.8715705871582 0 -281.6794128417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9151845416334516 0.40620605766410545 0.860682340068946 }
radiance 27
center 79.35559844970703 0 -281.0050354003906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9032299437182529 0.46692795740790505 0.9586227525938467 }
radiance 28
center 39.8877067565918 0 -280.1136779785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8682623468712511 0.32221331067519354 0.812518244391363 }
radiance 20
center 40.83513641357422 0 -207.27537536621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8848629756399987 0.4682364136734015 0.8001608918354501 }
radiance 31
center 6.504903316497803 0 -241.14105224609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3643984695459682 0.7530265012199602 }
radiance 29
center 51.034725189208984 0 -237.18055725097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.887439133674048 0.39991860950237207 0.8146336546397603 }
radiance 26
center 39.641700744628906 0 -216.55030822753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9370879182121852 0.44489594439204816 0.9952726497654378 }
radiance 30
center 62.27341079711914 0 -253.05198669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8678557568137933 0.4895155551507593 0.8719035202701881 }
radiance 23
center 78.60215759277344 0 -245.3959197998047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9892553561678272 0.4578899512886593 0.824934427591973 }
radiance 20
center 43.92344665527344 0 -232.97463989257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6701059004015203 0.38131905631320734 0.9 }
radiance 17
center 32.559410095214844 0 -264.8763122558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9691741209542845 0.46411174497763585 0.9020766835202354 }
radiance 18
center 84.4927978515625 0 -209.71881103515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3492618967087709 0.6914409806390556 }
radiance 29
center 18.299144744873047 0 -250.40316772460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7954514033621313 0.35274823289149687 0.9 }
radiance 18
center 81.12847137451172 0 -270.5724792480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30410239163653296 0.8024386600542601 }
radiance 31
center 60.008358001708984 0 -259.9497375488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8258400326600475 0.41438946680048544 0.9688760960083002 }
radiance 24
center 46.11083221435547 0 -202.3175048828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9097777567504947 0.3600031653918722 0.8356297650324687 }
radiance 25
center 73.70022583007812 0 -262.6770935058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8823920438596301 0.3936180529263946 0.9823238873205652 }
radiance 28
center 56.03380584716797 0 -224.53778076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9388721473410736 0.4400310865252115 0.8414725108415351 }
radiance 22
center 21.589879989624023 0 -211.0831756591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9198628041139617 0.38272310045056507 0.9711913710381908 }
radiance 23
center 34.380271911621094 0 -233.2219696044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8671230969101055 0.453815101439788 0.8487590006449002 }
radiance 20
center 43.135765075683594 0 -198.0757598876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8563150209114382 0.32657776728904303 0.8066155747171949 }
radiance 18
center 63.2833251953125 0 -231.36209106445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9451586842812659 0.4458049399626648 0.8573190497687273 }
radiance 24
center 101.98150634765625 0 -248.22332763671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4046737448249247 0.7610395094624476 }
radiance 26
center 76.71880340576172 0 -260.4372863769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9633212334523833 0.3450678701379291 0.9331749741717063 }
radiance 28
center 67.17837524414062 0 -237.02700805664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.803653077459821 0.3234388901542234 0.8868164637991112 }
radiance 29
center 79.49779510498047 0 -239.89744567871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9821580912622924 0.35492527441185817 0.9095557047887102 }
radiance 23
center 70.24512481689453 0 -254.08827209472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9137904978793377 0.476085686662324 0.9688416348967248 }
radiance 23
center 70.36516571044922 0 -271.2455749511719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.856430763845786 0.4389992506282825 0.8357080395015863 }
radiance 24
center 51.07033920288086 0 -193.69223022460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8719718558197743 0.32833156490396687 0.9 }
radiance 24
center 48.9338264465332 0 -228.17112731933594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8026409552302922 0.3285286105554673 0.9293231132871662 }
radiance 23
center 85.59698486328125 0 -224.28274536132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8696598431744472 0.49992471044400516 0.9209573288684221 }
radiance 18
center 56.05376434326172 0 -263.3096008300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9250807814162847 0.3429410125752933 0.8348804464583897 }
radiance 17
center 87.33998107910156 0 -202.86302185058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9004242387268118 0.46762559514811763 0.9161000434755473 }
radiance 31
center 68.09027099609375 0 -225.9012451171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8900493212104164 0.3654990659194008 0.9879885209058655 }
radiance 16
center 82.96282196044922 0 -229.3159637451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8184100104316985 0.4886475011045107 0.9791926817106259 }
radiance 27
center 77.34736633300781 0 -252.04934692382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8539272710037675 0.3079312646999646 0.9813680376066817 }
radiance 29
center 84.75037384033203 0 -247.77239990234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8789921766224734 0.4210418669990239 0.815011767923419 }
radiance 31
center 121.62578582763672 0 -221.46755981445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8127718335150207 0.46131405327927466 0.8166817971824314 }
radiance 21
center 77.2158432006836 0 -206.63536071777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8758469313828783 0.3853181507759804 0.9069504619160154 }
radiance 17
center 57.13146209716797 0 -242.2423858642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9807387492902198 0.46123625038542904 0.9487599927949921 }
radiance 25
center 124.05786895751953 0 -216.3798370361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.957199214996031 0.3692110004192979 0.9063587179997653 }
radiance 23
center 95.908203125 0 -203.60707092285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8782316339539178 0.3833473574618148 0.9193737159689876 }
radiance 22
center 84.29450225830078 0 -191.60020446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9600334432961057 0.4315942755670188 0.8706519716922116 }
radiance 20
center 99.79483032226562 0 -244.0417022705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7695393325192069 0.3372799928266215 0.9 }
radiance 29
center 116.07125854492188 0 -194.19422912597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8704895362375502 0.4514487511423878 0.8751444588729357 }
radiance 23
center 104.88525390625 0 -224.37158203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.922465777006811 0.4550241209675484 0.9339952106689757 }
radiance 18
center 81.94503784179688 0 -239.94776916503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45805923826505 0.8029463646846523 }
radiance 31
center 122.14105987548828 0 -202.4850311279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8296925285742872 0.44640068104139197 0.8012168545648616 }
radiance 21
center 74.9867935180664 0 -214.18328857421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.820875951259876 0.30224770381354094 0.9300427499366553 }
radiance 22
center 92.07057189941406 0 -246.70758056640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8474380630675067 0.3089656526223942 0.810197728503448 }
radiance 28
center 143.30123901367188 0 -241.84060668945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9802143340531797 0.44549876722555054 0.9133406102516486 }
radiance 28
center 74.10904693603516 0 -197.69583129882812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3288150018819419 0.6689329998564262 }
radiance 20
center 72.35523223876953 0 -185.1070098876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8449607152603503 0.47157417732128026 0.8905248128618503 }
radiance 20
center 130.34458923339844 0 -187.8791046142578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9272190749369928 0.38278117239997295 0.9912263671337546 }
radiance 23
center 141.63174438476562 0 -196.57159423828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.905147637875942 0.43113383138207645 0.812165473135013 }
radiance 25
center 78.40511322021484 0 -177.7737579345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4847930536313622 0.7802920718711802 }
radiance 30
center 144.9166717529297 0 -235.634765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9447790214273946 0.4991148808780034 0.901722020142598 }
radiance 30
center 77.4271240234375 0 -187.56646728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9989068436916816 0.48828129550804433 0.9408612905108487 }
radiance 22
center 102.93362426757812 0 -188.239013671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.854190412338962 0.3710768965418267 0.8624519884648736 }
radiance 29
center 112.64356994628906 0 -233.1618194580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9291611074465935 0.3597964927252972 0.9116321081504181 }
radiance 19
center 147.54443359375 0 -223.2276153564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9188043651251008 0.45083193100382823 0.9087629585326791 }
radiance 22
center 128.65029907226562 0 -172.49093627929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8175851166035623 0.4073002373178254 0.869238761093348 }
radiance 25
center 140.78175354003906 0 -168.26181030273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9982228014563261 0.3556191056447212 0.8856480190494691 }
radiance 17
center 145.1580047607422 0 -209.99757385253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8848026404166047 0.3572268494267608 0.9 }
radiance 24
center 145.8698272705078 0 -171.8069610595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8583101659077235 0.36610301716588545 0.8886261799778579 }
radiance 22
center 114.42585754394531 0 -242.56858825683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9776320272238543 0.47286877617967993 0.9758539894968546 }
radiance 20
center 113.25593566894531 0 -178.02322387695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9326743165502203 0.3795568023480147 0.8892493066961901 }
radiance 28
center 106.808349609375 0 -165.11599731445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9044980454571139 0.4610404157744259 0.8104628502597611 }
radiance 31
center 107.63317108154297 0 -199.55126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9230099440102276 0.4256517805315968 0.8350346756751974 }
radiance 30
center 112.55355834960938 0 -202.88247680664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9992197939328629 0.49779848640820956 0.8764761365564334 }
radiance 24
center 150.3521728515625 0 -227.96017456054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9801257427934646 0.359453153788152 0.9747842909346363 }
radiance 28
center 118.6496810913086 0 -162.13690185546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3746402461470264 0.5571610740557801 }
radiance 26
center 149.97555541992188 0 -232.4399871826172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6491238226551125 0.41127627206937434 0.9 }
radiance 19
center 134.74696350097656 0 -155.83169555664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9891785056076094 0.4264299376665378 0.8574584818744888 }
radiance 31
center 165.3131103515625 0 -172.67984008789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9950820402329326 0.4669945721470269 0.8544940109611457 }
radiance 30
center 136.4585418701172 0 -190.6650848388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.968766011081351 0.3360835107317287 0.8680374141744293 }
radiance 21
center 125.01518249511719 0 -212.8557586669922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9383985952016954 0.30428799265354584 0.9239807777978049 }
radiance 29
center 117.34528350830078 0 -168.95315551757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8152100668072492 0.4603019529028335 0.8933191351115162 }
radiance 31
center 112.12730407714844 0 -230.01162719726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4815619731732323 0.7287810785608461 }
radiance 25
center 147.0326385498047 0 -155.37893676757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.817365517634618 0.4488121487302443 0.9377142419954279 }
radiance 22
center 166.51539611816406 0 -193.40345764160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8851320142985869 0.45535475612479825 0.8610577336439825 }
radiance 27
center 118.28153228759766 0 -177.5605926513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8637677922361616 0.42161026912729693 0.9229297839942894 }
radiance 21
center 116.6824951171875 0 -182.8038330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9935135911447396 0.41526240960025584 0.811917961427141 }
radiance 28
center 125.83216857910156 0 -212.80184936523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42658397033640094 0.693707375255637 }
radiance 30
center 133.04176330566406 0 -204.87741088867188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6593096979935962 0.30659727412539034 0.9 }
radiance 20
center 168.3924102783203 0 -167.00912475585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49553022062362007 0.8777869645297427 }
radiance 25
center 115.62210083007812 0 -183.67572021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34761248031029907 0.5207504306457958 }
radiance 25
center 165.9506072998047 0 -204.0980682373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5163288826288448 0.4248017978664883 0.9 }
radiance 22
center 163.88229370117188 0 -159.6378173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4068374641726109 0.774535186267672 }
radiance 26
center 171.24488830566406 0 -215.77987670898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3335432242507469 0.5717861913782816 }
radiance 24
center 168.8899383544922 0 -188.06895446777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8035845175688457 0.3605645570833355 0.8727016438848522 }
radiance 26
center 122.01068115234375 0 -174.64846801757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.809954210242977 0.411373925638754 0.9372155651672696 }
radiance 21
center 156.96267700195312 0 -166.6725616455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9294645900854859 0.4828778904846086 0.9708576137376962 }
radiance 20
center 118.01554870605469 0 -192.57142639160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8291065822047773 0.44180715537812 0.8441623155321683 }
radiance 28
center 188.93260192871094 0 -158.47665405273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9325459523246739 0.36575251043617313 0.8455895084773263 }
radiance 21
center 157.91786193847656 0 -138.4445343017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8450602669363926 0.4387133803073133 0.9815487491579798 }
radiance 21
center 172.71035766601562 0 -183.3929901123047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9404694745846638 0.48801134416967096 0.9526130785191769 }
radiance 21
center 186.18356323242188 0 -182.1586456298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8603619642484369 0.34202964952438336 0.802041890482591 }
radiance 20
center 184.70401000976562 0 -165.79006958007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7117296307585517 0.447780654390701 0.9 }
radiance 25
center 155.09034729003906 0 -152.16485595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8361741413525103 0.46271812857862793 0.954397674911611 }
radiance 22
center 161.4898223876953 0 -165.62791442871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4563626715774758 0.8755724175152941 }
radiance 30
center 142.9243927001953 0 -183.5045166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6736516461801013 0.45013027026683167 0.9 }
radiance 31
center 135.8431396484375 0 -175.89447021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5006828632653579 0.3765736115017868 0.9 }
radiance 28
center 170.65774536132812 0 -138.77297973632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9924379708958274 0.4961780726106466 0.8167230589667361 }
radiance 29
center 181.3876495361328 0 -162.49636840820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3180923009595813 0.4194905048311539 }
radiance 26
center 177.1241455078125 0 -165.63816833496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8299611209535454 0.3748780139926243 0.8468103885104497 }
radiance 24
center 169.92556762695312 0 -158.76576232910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9906198115766555 0.4462566647154 0.8123917993607164 }
radiance 17
center 148.2913055419922 0 -179.6167449951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7949876587703565 0.3095281117178126 0.9 }
radiance 31
center 152.64414978027344 0 -148.31739807128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5649236245188356 0.40857455617011773 0.9 }
radiance 16
center 142.7563934326172 0 -152.31539916992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.736020590881153 0.4484447668123172 0.9 }
radiance 17
center 159.44155883789062 0 -136.0127716064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448972587596656 0.43161917027362773 0.885090065299807 }
radiance 21
center 148.92059326171875 0 -154.14991760253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8305614265620505 0.30963687468941375 0.878464948983404 }
radiance 27
center 180.2035369873047 0 -126.94459533691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8419672773844866 0.4547679014568006 0.9773208555307 }
radiance 26
center 148.30018615722656 0 -180.49949645996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7853614683694944 0.4749614241100495 0.9 }
radiance 28
center 195.16624450683594 0 -124.56414031982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9045584289445667 0.41836501956125427 0.8308616840254137 }
radiance 30
center 154.85523986816406 0 -131.5074462890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3057295084115277 0.7446329600022566 }
radiance 31
center 201.4865264892578 0 -162.551025390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8538712740868999 0.3998867160270164 0.9978674707217219 }
radiance 23
center 152.91314697265625 0 -184.77085876464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8556394471987677 0.4682705818627335 0.881039008101455 }
radiance 17
center 143.4518280029297 0 -142.52728271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6056504355668498 0.39345255217160013 0.9 }
radiance 17
center 153.5144805908203 0 -177.03268432617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5403363700349229 0.4500449955033512 0.9 }
radiance 29
center 195.17379760742188 0 -171.62889099121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8936716331019501 0.30833386879604174 0.8919906116360745 }
radiance 20
center 204.7547607421875 0 -132.1721649169922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3831066187832911 0.6027167700087417 }
radiance 20
center 194.27401733398438 0 -117.01771545410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9965373435290912 0.40538699345175966 0.8650452203606376 }
radiance 30
center 151.88470458984375 0 -137.68746948242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.928558640639261 0.48384264582224934 0.9746403116256989 }
radiance 29
center 207.94712829589844 0 -163.60626220703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9001781447398274 0.456884897364629 0.8673980810991837 }
radiance 23
center 165.3660430908203 0 -168.0286102294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8904771505893363 0.4054383651815687 0.8521156352685286 }
radiance 21
center 198.82276916503906 0 -149.75669860839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9292840100638254 0.3789831906885114 0.9247093409460971 }
radiance 17
center 216.186767578125 0 -145.79135131835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4366028304450912 0.35330107070097266 0.9 }
radiance 18
center 189.65188598632812 0 -127.3006362915039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9666762184811909 0.4478155098787917 0.887645805486291 }
radiance 27
center 161.49505615234375 0 -145.69517517089844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7325443384111024 0.46047305756314366 0.9 }
radiance 27
center 204.5997314453125 0 -122.4030990600586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9279019627770829 0.34450337684972177 0.8179834014624331 }
radiance 28
center 159.64720153808594 0 -100.74590301513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8062334424441958 0.4641220526548613 0.9 }
radiance 16
center 197.7633056640625 0 -122.66439819335938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9314497413126285 0.47833071398675864 0.984754819644763 }
radiance 26
center 199.1233367919922 0 -116.68879699707031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8593146484814199 0.3419697333170293 0.9255551273654802 }
radiance 19
center 175.76199340820312 0 -147.54681396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8868227779028401 0.4262900275699184 0.8419595243068354 }
radiance 30
center 211.20330810546875 0 -98.9654312133789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9155262638888243 0.3706930203084659 0.8066551856755682 }
radiance 20
center 201.5639190673828 0 -144.14878845214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9732444250757143 0.38937658453663115 0.9463522884799651 }
radiance 27
center 191.10740661621094 0 -161.24818420410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9390592841479831 0.3747142963764153 0.8479188066430912 }
radiance 24
center 225.38563537597656 0 -123.1585922241211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9966322930417185 0.3177239540564961 0.8016205765543898 }
radiance 31
center 164.7909393310547 0 -111.07089233398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8011395291359286 0.4417541419276289 0.9039028604093017 }
radiance 28
center 219.1294403076172 0 -95.9576416015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8921473839398096 0.48881221542566045 0.9 }
radiance 29
center 205.1880340576172 0 -139.08526611328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6403445782942238 0.4004483747534334 0.9 }
radiance 27
center 183.1033477783203 0 -90.14459228515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8809996748539431 0.314764584654786 0.8781395964386081 }
radiance 30
center 177.1550750732422 0 -112.0128173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8062559979059715 0.46170281850222294 0.9736456906986655 }
radiance 26
center 225.86891174316406 0 -118.94574737548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.854240905171045 0.32805359199612616 0.943697806241529 }
radiance 20
center 223.69717407226562 0 -105.26844787597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.842975894231222 0.47092826643455743 0.8452306661208496 }
radiance 26
center 194.2842559814453 0 -96.46031951904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9360596106930876 0.4619234251914481 0.8461138014464218 }
radiance 18
center 168.5785369873047 0 -115.89205169677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8228066942933339 0.4223726177284519 0.953979652426244 }
radiance 17
center 219.3154296875 0 -93.39847564697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9783411769201305 0.3837509139410753 0.8422336148317233 }
radiance 31
center 164.68714904785156 0 -124.35194396972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9518135310641138 0.3371087883527388 0.8644833119604475 }
radiance 31
center 168.07810974121094 0 -80.50658416748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8617651387727411 0.3528686752411813 0.8751300470577039 }
radiance 25
center 224.76089477539062 0 -103.31316375732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.824449095637418 0.46835346047098947 0.9851417314829435 }
radiance 30
center 192.39617919921875 0 -93.83470916748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46160516540868657 0.4671094492846783 0.9 }
radiance 25
center 180.42453002929688 0 -108.93280792236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8753188728734683 0.3521287891736398 0.9905881154448253 }
radiance 16
center 165.004150390625 0 -84.23001861572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9103621225399134 0.32512859867852706 0.9795186856316116 }
radiance 28
center 205.05422973632812 0 -120.04051208496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8238563332544633 0.420987069413289 0.9666909317723247 }
radiance 26
center 222.423095703125 0 -77.75613403320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8956274663426704 0.4961378198665025 0.8925782210662146 }
radiance 19
center 182.9936981201172 0 -100.12430572509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9130218214504183 0.4035756380261869 0.9539835742291987 }
radiance 16
center 229.16355895996094 0 -135.79002380371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8350085281985824 0.36594315810118094 0.8416485546174814 }
radiance 27
center 214.57395935058594 0 -116.82736206054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5802415091470979 0.3616255583414892 0.9 }
radiance 27
center 217.70266723632812 0 -121.45178985595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5719676338142378 0.3954777981855668 0.9 }
radiance 30
center 208.68460083007812 0 -80.86431884765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9008678952941729 0.48390074842746256 0.9335887252663015 }
radiance 29
center 183.65911865234375 0 -113.17520141601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9533614195220483 0.37919612174387884 0.9861038145308791 }
radiance 22
center 202.55380249023438 0 -105.82650756835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.472500761379357 0.6155000902379867 }
radiance 27
center 200.4696807861328 0 -83.56285858154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8544369161958498 0.4372721147843719 0.8998365653244632 }
radiance 21
center 170.43572998046875 0 -76.54012298583984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9555220446603367 0.3078088693777317 0.9624565474707643 }
radiance 29
center 210.69569396972656 0 -102.03453826904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9366081436458271 0.4655638438162803 0.8155359702807754 }
radiance 27
center 235.9658966064453 0 -101.35967254638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8042304637237846 0.49961153894048244 0.9978417877215724 }
radiance 28
center 175.41488647460938 0 -72.01175689697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8742421975981499 0.3723017004148508 0.8671918484672329 }
radiance 28
center 224.15823364257812 0 -90.42155456542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9329511039559746 0.40654496439859855 0.8286364953211085 }
radiance 27
center 232.66651916503906 0 -89.52274322509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8793730373802806 0.36039928891268125 0.8309375821243246 }
radiance 16
center 201.5889434814453 0 -60.16640853881836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.845207088903972 0.40099755926187375 0.8175115061637708 }
radiance 22
center 202.0736083984375 0 -79.07842254638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8725689051556003 0.3444718383330891 0.8686369903330906 }
radiance 22
center 192.4608612060547 0 -110.98274230957031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9208281032654162 0.43996798094645206 0.8186472894187062 }
radiance 27
center 203.09915161132812 0 -79.22684478759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8863447948959543 0.31446354627462225 0.9063734086575165 }
radiance 25
center 185.98794555664062 0 -50.275115966796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9280564281110268 0.38911336162304144 0.8850453711418323 }
radiance 28
center 209.35055541992188 0 -105.88124084472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9565595284268911 0.30211740209888 0.8692670075385803 }
radiance 16
center 224.1162872314453 0 -89.2485580444336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8316113835703309 0.3830139645635118 0.8223811450808698 }
radiance 18
center 234.9358673095703 0 -109.86109161376953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9414226732107702 0.47339259467912087 0.9558674959950769 }
radiance 23
center 196.60850524902344 0 -100.96412658691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5135883436156413 0.36616707255360714 0.9 }
radiance 29
center 213.45455932617188 0 -36.116756439208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9173355068819189 0.405772562776327 0.9494984020050071 }
radiance 21
center 217.6414031982422 0 -30.417510986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9681484420803694 0.3572334707832928 0.956525473509872 }
radiance 31
center 228.9976043701172 0 -34.81719970703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8014756281450728 0.49464000175033596 0.9260953823791425 }
radiance 16
center 244.2205047607422 0 -76.2285385131836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4994618399542665 0.7370362137932781 }
radiance 21
center 203.6713409423828 0 -55.760284423828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45646095181594526 0.3457869338191874 0.9 }
radiance 25
center 209.9177703857422 0 -49.85947036743164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8639960431245135 0.49409757503464924 0.9011869987528026 }
radiance 19
center 241.1706085205078 0 -78.5086669921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9652042947789945 0.4374419817641103 0.895754125425207 }
radiance 17
center 233.25729370117188 0 -97.07438659667969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9153591996204827 0.3551769431958286 0.822555414365488 }
radiance 18
center 200.45130920410156 0 -96.76038360595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9144839953241738 0.37400778602742935 0.9619395971723479 }
radiance 20
center 213.07534790039062 0 -79.13448333740234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.911712539288577 0.3621248952734218 0.8985204894043122 }
radiance 29
center 239.1183319091797 0 -26.839664459228516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9510944329905099 0.4069867916702478 0.8679664955302689 }
radiance 30
center 192.35867309570312 0 -52.23998260498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8301306186289445 0.41711390107537627 0.9394059597313973 }
radiance 23
center 229.8466339111328 0 -68.86925506591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8917528742609547 0.42484744936273733 0.8575557448364314 }
radiance 23
center 240.78399658203125 0 -78.3379135131836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8518827252160014 0.35449424735821816 0.8712482723806795 }
radiance 23
center 235.3689422607422 0 -60.191734313964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9615036814456362 0.33028437553292483 0.934690923464379 }
radiance 26
center 211.45628356933594 0 -14.156779289245605
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9568003837889401 0.4741770076186287 0.8090146292681447 }
radiance 25
center 232.88079833984375 0 -56.94989776611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9435086511485995 0.4847696021986081 0.8870985694457199 }
radiance 16
center 208.29478454589844 0 -61.08574676513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8168188084047627 0.4058486079036163 0.9007487519379553 }
radiance 22
center 204.5779571533203 0 -11.849474906921387
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9576744274754349 0.3614242180383541 0.8462252224903861 }
radiance 25
center 192.8026123046875 0 -82.65867614746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3181740450846116 0.7578604161004306 }
radiance 26
center 233.02581787109375 0 -40.66626739501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8440201695992251 0.42440677880634714 0.9157197848270331 }
radiance 27
center 222.31103515625 0 -18.271324157714844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4734371450567012 0.6970165031003255 }
radiance 25
center 213.14341735839844 0 -19.566408157348633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7564618803923404 0.44361574230870093 0.9 }
radiance 28
center 214.2324981689453 0 -69.02001953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9668167463285531 0.4247820337466781 0.98213010109243 }
radiance 27
center 211.75025939941406 0 -9.240594863891602
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39971445645999093 0.5058199645038237 }
radiance 19
center 213.1972198486328 0 -22.977426528930664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8013189946479611 0.45844704097056044 0.8273651919881935 }
radiance 29
center 206.04080200195312 0 -55.034114837646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8431495839250264 0.4682280784368045 0.9815318642256657 }
radiance 30
center 220.7884521484375 0 -1.2407578229904175
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5517966587119518 0.4667856519212904 0.9 }
radiance 17
center 200.82029724121094 0 -69.64616394042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.934703677199609 0.4540986915690469 0.9243612624501241 }
radiance 20
center 215.53001403808594 0 -54.74361801147461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.413458698432167 0.3314660092776407 0.9 }
radiance 23
center 251.00962829589844 0 -12.66601848602295
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9811126006825701 0.3444272831442092 0.9257817548518936 }
radiance 31
center 201.73634338378906 0 -17.7032413482666
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8564426879058679 0.3886310935092211 0.8241649649613731 }
radiance 24
center 200.7307586669922 0 -9.831465721130371
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8261133128915655 0.3519622200797701 0.9129653821376414 }
radiance 19
center 202.8736114501953 0 -41.562713623046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8988098184145689 0.3257640085779822 0.9104026337484362 }
radiance 29
center 244.08895874023438 0 0.2363368421792984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9875242163141095 0.4347449729265285 0.9241658900869738 }
radiance 28
center 211.47401428222656 0 -49.9564208984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8682776320481373 0.3383495801632905 0.9 }
radiance 27
center 233.68063354492188 0 -32.2906379699707
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41370300341645816 0.5421347312360011 }
radiance 27
center 227.06192016601562 0 13.958799362182617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8397700860455111 0.49437293274056543 0.9 }
radiance 25
center 249.80157470703125 0 -43.80916976928711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42301175050697537 0.5894264552436679 }
radiance 26
center 243.3651123046875 0 -33.79153823852539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9519735496614024 0.46820472815722014 0.8144121885443676 }
radiance 25
center 228.67568969726562 0 22.189470291137695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9289472608084207 0.4430969590622886 0.8041146987480832 }
radiance 29
center 208.9935302734375 0 2.8105404376983643
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40817607860239524 0.7589941082747746 }
radiance 25
center 236.79026794433594 0 6.238616466522217
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44884358689613013 0.6555101421243344 }
radiance 20
center 190.41664123535156 0 -22.292491912841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8479127398753317 0.4803191721695804 0.8730288381510831 }
radiance 29
center 227.6503448486328 0 -20.1334228515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8160307742227904 0.34458488666014925 0.8827131567727919 }
radiance 25
center 231.7807159423828 0 -34.899940490722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9583672724902506 0.4911503582996527 0.9353118068543547 }
radiance 31
center 219.9917449951172 0 -13.151372909545898
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9191522240773775 0.4174278521583416 0.859562021870094 }
radiance 25
center 247.9139862060547 0 -0.8288623690605164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8022595443791679 0.44213518903933 0.9679874279072779 }
radiance 29
center 208.32615661621094 0 -34.033897399902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9251763954287402 0.30310796945462365 0.9207858030769694 }
radiance 30
center 243.9875946044922 0 11.754223823547363
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8339199310474461 0.3211571218518003 0.9245263890144209 }
radiance 30
center 197.54510498046875 0 -23.76141357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9371061411093443 0.359370775696495 0.9288476486894114 }
radiance 16
center 227.1243133544922 0 1.5012277364730835
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9296666332793793 0.46092521184186935 0.9442783572363813 }
radiance 29
center 231.57147216796875 0 -25.200286865234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7551552443944647 0.46303770979600034 0.9 }
radiance 26
center 221.05508422851562 0 33.134403228759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.828696399856602 0.4948365211023204 0.952790905178033 }
radiance 29
center 231.4469757080078 0 30.52750015258789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8759788818702774 0.49869151490872576 0.9476522416615885 }
radiance 18
center 226.0267791748047 0 -11.975055694580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9725487306742536 0.36638532627240294 0.8404004743471356 }
radiance 31
center 242.7805938720703 0 11.159141540527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42865743071127516 0.5800260347487696 }
radiance 16
center 247.82925415039062 0 -25.564537048339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8412538827680236 0.374638380934761 0.8970897124380309 }
radiance 29
center 179.703857421875 0 -28.109424591064453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9949589141546398 0.4972999731099662 0.8559998448610017 }
radiance 20
center 243.3268585205078 0 10.619194030761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9044081287743433 0.34817479206845064 0.8955842909769446 }
radiance 24
center 195.4430694580078 0 44.77845001220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8839126845994922 0.33094058652051145 0.9922860431398474 }
radiance 23
center 194.7154083251953 0 1.7485939264297485
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8127243669978108 0.48305141893078374 0.8949364689839807 }
radiance 26
center 216.30615234375 0 36.112918853759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9078491511467801 0.4772526981933073 0.9024414315030673 }
radiance 28
center 245.1073455810547 0 38.42264175415039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9354381980401418 0.3860111579877087 0.8037512958409219 }
radiance 28
center 181.10791015625 0 39.11496353149414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9589956543350325 0.42225094486481574 0.9172419136371188 }
radiance 27
center 238.82333374023438 0 5.611177444458008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3838320019739147 0.7250147748666294 }
radiance 23
center 223.12069702148438 0 -12.172800064086914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4282639403636752 0.8561925542512889 }
radiance 30
center 209.21841430664062 0 39.27031326293945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4192523020536093 0.4135456940340431 0.9 }
radiance 27
center 182.5584259033203 0 0.8823482990264893
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.875668110952786 0.36178742652738755 0.9790063590786139 }
radiance 31
center 187.0857696533203 0 23.60584831237793
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8574750187561782 0.34134154093622315 0.94850352510481 }
radiance 25
center 198.0999298095703 0 6.905406475067139
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8917928184464106 0.436681594589593 0.9846043510734857 }
radiance 26
center 202.01934814453125 0 13.531652450561523
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.935938363928236 0.3392316964880921 0.847958939426522 }
radiance 29
center 224.12216186523438 0 3.6383774280548096
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9612353699927704 0.4251466536640012 0.876240841947807 }
radiance 18
center 175.97213745117188 0 36.50086212158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.49884976622154487 0.48173295514151304 0.9 }
radiance 21
center 232.04547119140625 0 47.331016540527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6131950353096313 0.33356720380585003 0.9 }
radiance 29
center 233.8388671875 0 20.785160064697266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8867656474756929 0.39951469056184585 0.9774103921620498 }
radiance 20
center 221.88885498046875 0 40.301185607910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.806130313701918 0.3533328655921671 0.9003424336794007 }
radiance 31
center 185.61126708984375 0 4.896896839141846
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8440867091510056 0.3585608779790687 0.8834386547025056 }
radiance 30
center 196.8013916015625 0 38.70442581176758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8026304942334009 0.44960146180945537 0.8123760499729559 }
radiance 20
center 175.49624633789062 0 14.187735557556152
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9442985312088643 0.39706485193751473 0.8124373850076723 }
radiance 25
center 175.9008331298828 0 18.68886375427246
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7319083182224209 0.4610644799604142 0.9 }
radiance 30
center 234.32066345214844 0 73.39936828613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8968816908254108 0.3664163128265183 0.8478428323676392 }
radiance 18
center 199.38824462890625 0 59.00934600830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9590042252547389 0.3076656693594453 0.8724371905270661 }
radiance 29
center 178.97633361816406 0 12.49051570892334
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8851869875976558 0.3315094173454722 0.9283838282093061 }
radiance 20
center 186.47764587402344 0 15.0072603225708
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9536419304382517 0.48385878740133925 0.8006800966743584 }
radiance 16
center 178.38729858398438 0 41.84410095214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.628353542828664 0.4646911103369997 0.9 }
radiance 30
center 216.69520568847656 0 40.72825241088867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9760969241753917 0.45010389118010596 0.8500386863639338 }
radiance 30
center 199.9886016845703 0 28.69136619567871
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9035318546004656 0.3560941349670692 0.8597590571361404 }
radiance 27
center 224.72109985351562 0 41.14133834838867
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8615144644700501 0.37458365606980876 0.9140779849574923 }
radiance 28
center 188.27664184570312 0 40.05971145629883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8231244636648607 0.44336481807480904 0.8122040887060108 }
radiance 24
center 186.53244018554688 0 36.912254333496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8073137829319426 0.42592249904989615 0.9049709812703091 }
radiance 17
center 229.92576599121094 0 29.94367027282715
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8371504273152353 0.3281105017610756 0.991592645656995 }
radiance 24
center 167.465087890625 0 71.1266098022461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8011838875645878 0.45854166891242865 0.9568094972813996 }
radiance 24
center 167.172119140625 0 59.382572174072266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9616768869294421 0.4122611809149825 0.8309000424061085 }
radiance 23
center 188.15530395507812 0 69.93748474121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8270635552852376 0.34387382326622956 0.9787344614399283 }
radiance 28
center 194.753173828125 0 49.93406677246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9639988365333267 0.4236773406453375 0.9676162492777576 }
radiance 18
center 213.3634796142578 0 77.81827545166016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.822990850120631 0.31020457633261295 0.9736884814900684 }
radiance 27
center 173.59507751464844 0 41.03373336791992
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9250379729775808 0.34073548947168303 0.8121158721710069 }
radiance 21
center 214.31170654296875 0 90.06147003173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3876541119232021 0.662071914108365 }
radiance 21
center 189.256103515625 0 36.61206817626953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9346050420259069 0.31664252567554385 0.8812028884633529 }
radiance 26
center 218.98153686523438 0 92.83618927001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9421288041052762 0.41202259194698576 0.9085726601374462 }
radiance 21
center 168.17535400390625 0 51.453060150146484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4567830734295859 0.7264933104629523 }
radiance 17
center 213.8794708251953 0 35.684165954589844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9508278421740685 0.40197958059769545 0.9530310633299357 }
radiance 16
center 192.16012573242188 0 43.980438232421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.921584550803266 0.43742433269376313 0.8024035434907222 }
radiance 28
center 220.03341674804688 0 39.186485290527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9240235046382531 0.4816510773819723 0.8829058077788384 }
radiance 24
center 229.16925048828125 0 65.73046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8794663756685984 0.4941792936651221 0.9789956041948292 }
radiance 18
center 174.82810974121094 0 88.0998764038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9306297485562509 0.3196253181159873 0.8317746931890819 }
radiance 17
center 176.6375274658203 0 87.44657135009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.35721367604950205 0.8047252251667992 }
radiance 31
center 165.3430633544922 0 80.33223724365234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8658659796496767 0.42750541215201965 0.9286801680313825 }
radiance 19
center 216.55593872070312 0 52.93231201171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9003813625504093 0.3004898864982302 0.9622945472678703 }
radiance 27
center 179.17628479003906 0 53.92197799682617
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9462422660917843 0.3071341167597746 0.9035718646064924 }
radiance 19
center 176.87979125976562 0 115.43203735351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9124132601156346 0.3441277006693971 0.9998217160557633 }
radiance 23
center 189.44357299804688 0 57.4949836730957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.801939818618377 0.3906722579031367 0.8898238652356242 }
radiance 22
center 163.227294921875 0 98.8846206665039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9731862864556455 0.3399668244781217 0.9839047561412756 }
radiance 24
center 167.3440704345703 0 102.581298828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.924089134313175 0.43397518738307317 0.8977593767173074 }
radiance 18
center 196.43446350097656 0 102.9021987915039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9241978773320141 0.35825788981222817 0.9287303898726984 }
radiance 19
center 212.37423706054688 0 100.07965087890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9090024053098779 0.3296312655115078 0.8279311765938034 }
radiance 17
center 173.4080047607422 0 94.55425262451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8669874658764722 0.3428988470435876 0.9289423647549518 }
radiance 19
center 213.68209838867188 0 93.38444519042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9192084756273168 0.3604846937985353 0.8165528447685004 }
radiance 29
center 221.42799377441406 0 56.08816909790039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9321288082456813 0.4094060516766942 0.8673775536747343 }
radiance 19
center 197.13731384277344 0 98.69246673583984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9584570280230654 0.43338774273199365 0.982737381073011 }
radiance 25
center 186.0680389404297 0 112.69609832763672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6107098520885903 0.4248851580545258 0.9 }
radiance 20
center 179.91981506347656 0 99.4737319946289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9989815871405219 0.3210229349480735 0.9088543312017787 }
radiance 29
center 204.86566162109375 0 108.02696990966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.47110054593921447 0.3310927457659722 0.9 }
radiance 19
center 212.49990844726562 0 116.89216613769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5953215232114747 0.4079950744222411 0.9 }
radiance 21
center 188.5702667236328 0 77.87683868408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8088387189774646 0.3558433492344266 0.994725149581337 }
radiance 24
center 203.7821807861328 0 109.21100616455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9755396914381457 0.4254716968592671 0.989665980281801 }
radiance 23
center 187.02978515625 0 101.9310531616211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7627959710724532 0.39119046542948865 0.9 }
radiance 20
center 163.22879028320312 0 90.40042114257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8971226981738587 0.356082179771516 0.8408761301498759 }
radiance 26
center 204.871337890625 0 111.50694274902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.952518180852985 0.3724959346074248 0.8507559456668786 }
radiance 16
center 175.95834350585938 0 84.87518310546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9172881348108314 0.480676494354231 0.881206990228337 }
radiance 28
center 143.42698669433594 0 136.33055114746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8611585448762189 0.3825636515674973 0.8650581531896384 }
radiance 20
center 190.48870849609375 0 93.10869598388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205237803720837 0.49788970829021206 0.9984814505820296 }
radiance 30
center 188.55796813964844 0 126.95977783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9539363064092264 0.386824873388607 0.8229813495000787 }
radiance 19
center 155.40673828125 0 97.07832336425781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.872663138840917 0.47371807017062284 0.9078261602290187 }
radiance 19
center 194.225341796875 0 75.71529388427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9632623093119859 0.413145957200073 0.8172200623952841 }
radiance 21
center 199.76333618164062 0 133.89051818847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9241940545965569 0.4771811212445385 0.9731162823716142 }
radiance 23
center 148.44570922851562 0 81.45113372802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6755707247383193 0.3273107363124275 0.9 }
radiance 24
center 195.318603515625 0 74.9365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8597153321297587 0.32219506993487756 0.9265053729575804 }
radiance 25
center 170.1640625 0 134.4770050048828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8389645547314385 0.48443541885967795 0.9930398883137883 }
radiance 23
center 163.28900146484375 0 138.75637817382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4838764853629536 0.4245794307263282 0.9 }
radiance 24
center 149.50189208984375 0 127.81261444091797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5814812089976092 0.3308524008832715 0.9 }
radiance 21
center 160.9679412841797 0 137.07154846191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8629888516842199 0.36320769472621967 0.9600138858640738 }
radiance 31
center 201.10174560546875 0 84.13385772705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9843903133859875 0.4155565046299603 0.8064407878390649 }
radiance 19
center 142.84934997558594 0 116.79662322998047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9257544215117433 0.38849821101179105 0.9528770968910508 }
radiance 26
center 158.75807189941406 0 99.37956237792969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8667501422114772 0.3541017311624854 0.9255926089939979 }
radiance 16
center 142.09303283691406 0 138.9331512451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4237861137832172 0.5607644383259448 }
radiance 27
center 196.83059692382812 0 132.48446655273438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8444172964923695 0.3479509924576848 0.990115906169351 }
radiance 23
center 181.4499969482422 0 86.08283996582031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8064009994854405 0.38105264925223037 0.8542082408508755 }
radiance 19
center 176.78297424316406 0 129.48281860351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43023698152828294 0.6056558531746751 }
radiance 16
center 134.709228515625 0 137.8429718017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8348469577321098 0.40407383489944904 0.9562097920695778 }
radiance 18
center 170.82647705078125 0 155.43624877929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9164924273870614 0.3756588722501656 0.9736190541526341 }
radiance 29
center 148.74598693847656 0 117.84839630126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8233668325197225 0.4620685523387472 0.9 }
radiance 29
center 177.4563751220703 0 102.5137710571289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9659729035709101 0.39349469955058447 0.993619837696349 }
radiance 19
center 168.95277404785156 0 147.9230499267578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9117219005959749 0.3212847640171434 0.9980570632085981 }
radiance 26
center 141.46192932128906 0 91.5970230102539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3102293301867097 0.5784623113741187 }
radiance 17
center 150.9028778076172 0 142.80853271484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8669060458759572 0.41097813579345677 0.8788919988292723 }
radiance 21
center 140.15550231933594 0 151.56356811523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8763667309498401 0.3206039584106926 0.9250762964242065 }
radiance 21
center 168.62515258789062 0 100.4971694946289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.332827081055793 0.5079167740234374 }
radiance 31
center 181.64056396484375 0 125.85588073730469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445983289551866 0.3707167074595429 0.8404449746457383 }
radiance 29
center 158.68064880371094 0 124.04068756103516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8148256414053481 0.4402285005561596 0.8170484180554063 }
radiance 16
center 141.39820861816406 0 134.8067169189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8565348143304832 0.4243755656562538 0.8639180182878695 }
radiance 27
center 122.05643463134766 0 116.55014038085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9619784175836515 0.34297387395701856 0.9790387755261664 }
radiance 22
center 123.45256042480469 0 148.62777709960938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.986626855576189 0.44255687053791326 0.9385330949159763 }
radiance 19
center 142.21102905273438 0 124.21975708007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.892311683987984 0.39990694048004877 0.8514052101802848 }
radiance 28
center 118.81709289550781 0 102.10363006591797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8147285263140035 0.36519028535505205 0.833446258006254 }
radiance 29
center 135.52926635742188 0 104.63542938232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8022401043894942 0.4360664304994889 0.8522895241926687 }
radiance 25
center 138.4974822998047 0 114.69412231445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8359919876633597 0.44926609182623045 0.8831412231537787 }
radiance 20
center 136.93984985351562 0 129.13343811035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8665851881757527 0.4235749409593542 0.9 }
radiance 31
center 151.5737762451172 0 143.1746063232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34094209124576036 0.8931923925338637 }
radiance 28
center 141.26780700683594 0 166.12799072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6927305019342657 0.48760895599680165 0.9 }
radiance 19
center 139.17340087890625 0 146.36776733398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3392829512276419 0.7727107931502675 }
radiance 26
center 119.68971252441406 0 162.032470703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9985745155128354 0.38902533167187636 0.9953009746888613 }
radiance 31
center 163.61032104492188 0 156.92919921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9757222582810408 0.4848602663063135 0.9423578644754723 }
radiance 22
center 154.72506713867188 0 164.20738220214844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8150607691544991 0.31363359759685616 0.9651365081170571 }
radiance 30
center 153.88450622558594 0 161.9423370361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.428504194956168 0.4188349137788443 }
radiance 25
center 117.60653686523438 0 141.16574096679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.841632623612489 0.46987681993377634 0.9188659262346394 }
radiance 21
center 117.01618957519531 0 153.68096923828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8699186780360074 0.4780903115629106 0.9389887831378929 }
radiance 27
center 167.08460998535156 0 122.915771484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9000962157577219 0.43841588895399697 0.9907696931945725 }
radiance 29
center 127.5987548828125 0 115.72236633300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8648401241116601 0.4283208641222931 0.9178926164519805 }
radiance 24
center 113.14777374267578 0 145.9178466796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3768282609921253 0.6281921483882393 }
radiance 29
center 137.24920654296875 0 174.10934448242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9040373631516885 0.4412534804371554 0.9043213628377982 }
radiance 22
center 102.08789825439453 0 185.6504364013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6014883714884796 0.4398611519431912 0.9 }
radiance 29
center 93.84886932373047 0 168.6913299560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3332468394319819 0.7270414297737237 }
radiance 31
center 89.84412384033203 0 183.8372039794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38625160438428935 0.6065014908560475 }
radiance 25
center 127.28242492675781 0 141.48980712890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4400818443754092 0.7215557101945533 }
radiance 18
center 132.38803100585938 0 154.06008911132812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6957360169803288 0.4266862367607988 0.9 }
radiance 16
center 145.26901245117188 0 175.76834106445312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.493931268844231 0.8028264334523515 }
radiance 29
center 105.83978271484375 0 125.90604400634766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5697910025080687 0.49421220901380536 0.9 }
radiance 30
center 133.9325408935547 0 154.820068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.82385461451099 0.32804217679339664 0.9473194894345234 }
radiance 26
center 111.65901947021484 0 146.365234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9342831442731019 0.4279775291614746 0.9083948723089427 }
radiance 26
center 91.90357971191406 0 146.046142578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9073637380971205 0.3379414975817146 0.8946764660861052 }
radiance 31
center 118.46666717529297 0 148.95166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9952373659105437 0.30888039241727533 0.9410387131832706 }
radiance 30
center 85.61248016357422 0 176.5128173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9536031329713096 0.42284813666247445 0.8512327994197589 }
radiance 24
center 109.47319793701172 0 148.37484741210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9566605316619831 0.3063716291824266 0.9849233489580704 }
radiance 16
center 126.10274505615234 0 189.00343322753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47040024172969486 0.7747050718844514 }
radiance 25
center 107.72530364990234 0 168.9067840576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9788953141651275 0.38234846785629495 0.862086419403276 }
radiance 24
center 80.45576477050781 0 177.22055053710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8406942534667892 0.31099403283569943 0.9622427228946784 }
radiance 30
center 86.71928405761719 0 140.0447540283203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9692651893269456 0.38026434724573566 0.9805191186727211 }
radiance 24
center 91.16488647460938 0 143.3346710205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7781935284131002 0.3843404908909196 0.9 }
radiance 19
center 118.54730224609375 0 150.1943359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.93147668506382 0.40721597984698493 0.9252139869105922 }
radiance 30
center 86.3236083984375 0 197.1767120361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9110262811579011 0.34810510603584294 0.890799647052385 }
radiance 22
center 82.88890075683594 0 182.20465087890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9448404777584025 0.44463096197612695 0.9549936958676177 }
radiance 29
center 67.11912536621094 0 168.47140502929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9968630808728771 0.35082626659894023 0.9746286358324457 }
radiance 17
center 119.07062530517578 0 138.62181091308594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9023974904544231 0.3040417410550393 0.8220116711969503 }
radiance 17
center 118.0860595703125 0 152.1810302734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9577007206528538 0.32007897314630424 0.9634444114023387 }
radiance 19
center 105.64436340332031 0 182.28048706054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9986653254513255 0.35154000871663293 0.8773465603530067 }
radiance 17
center 119.33653259277344 0 172.36123657226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8816607260206801 0.45624655058688374 0.9 }
radiance 29
center 73.7728042602539 0 190.39955139160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.366192227272226 0.8995497667406247 }
radiance 29
center 71.41552734375 0 179.76351928710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7849851433630425 0.3466201138089336 0.9 }
radiance 19
center 92.54690551757812 0 182.69277954101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9843108955493985 0.4081078671652456 0.8085571927691908 }
radiance 29
center 40.94966506958008 0 201.7383270263672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8590946096373742 0.31431408652611853 0.8697538273938897 }
radiance 25
center 66.37080383300781 0 167.2379608154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4770392916163174 0.36803553079196094 0.9 }
radiance 27
center 92.69628143310547 0 151.70175170898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.958226893776795 0.446992427160515 0.9765175116281598 }
radiance 18
center 41.1405029296875 0 159.19815063476562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8583881331851083 0.31493549374646707 0.9 }
radiance 16
center 76.99259185791016 0 201.61460876464844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6819147483610999 0.4775908015942273 0.9 }
radiance 22
center 100.16946411132812 0 180.2633514404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9147973892359439 0.3169359450346537 0.9109411965635711 }
radiance 19
center 94.31700897216797 0 203.4788055419922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212475590833939 0.30139614722769853 0.8971699383665592 }
radiance 20
center 90.19210815429688 0 150.30450439453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8273906175682497 0.34352764516398687 0.8980535638588836 }
radiance 16
center 99.91973114013672 0 190.60028076171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.850983778925712 0.33568866255439866 0.8101279226571637 }
radiance 16
center 66.61418914794922 0 205.4713897705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7112875785615692 0.4888041933318696 0.9 }
radiance 22
center 33.95397186279297 0 204.0301513671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.857304898530963 0.4127629710418721 0.8958760424482108 }
radiance 28
center 79.71381378173828 0 209.79273986816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9232026959552802 0.4833940130135338 0.8297143978656667 }
radiance 16
center 25.70042610168457 0 149.21507263183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8249534681796693 0.3198523757505875 0.8520338164653293 }
radiance 23
center 34.76371383666992 0 151.5918426513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9742035906845387 0.4958150074724317 0.8367650260353853 }
radiance 29
center 52.22280502319336 0 174.04148864746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7496019056747852 0.4497803636613573 0.9 }
radiance 27
center 25.53487777709961 0 179.2710418701172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9524454324370775 0.42344697861146363 0.8658936864693029 }
radiance 20
center 71.82579040527344 0 192.74789428710938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9873098546981546 0.3380640910586208 0.8094100766592758 }
radiance 29
center 76.1241226196289 0 180.30615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3603807134052221 0.5070481482280474 }
radiance 25
center 75.37385559082031 0 150.00108337402344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8331956270300078 0.4474137501024372 0.9399555771919843 }
radiance 18
center 55.799442291259766 0 186.74102783203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8997647059657754 0.42100070279276147 0.9445773392520249 }
radiance 30
center 66.41470336914062 0 199.46153259277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.644064550200876 0.4929195324261362 0.9 }
radiance 22
center 12.530240058898926 0 183.65872192382812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9387877606738904 0.4399363179404129 0.8738860572345883 }
radiance 27
center 7.669497013092041 0 173.64944458007812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8996692079263306 0.49443797713331206 0.8750039378938346 }
radiance 20
center 51.30118179321289 0 184.1112060546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9174828153727361 0.34587778783825224 0.9386427383688077 }
radiance 22
center 55.321746826171875 0 153.3236541748047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45824872874312983 0.7345209257335595 }
radiance 24
center 47.560874938964844 0 206.65103149414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46547390322986204 0.8862512298164351 }
radiance 20
center 8.928505897521973 0 181.86305236816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8235644664247509 0.31511455771844604 0.9810531624386313 }
radiance 25
center 25.398557662963867 0 184.0732879638672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9774549409218484 0.34119990194894345 0.9763798371387746 }
radiance 20
center 47.569862365722656 0 173.45286560058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38124820484228483 0.7904921543156261 }
radiance 18
center 16.144166946411133 0 207.13961791992188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8419028808395003 0.4176844222332471 0.8210633087541355 }
radiance 27
center 1.1585055589675903 0 199.85804748535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8606261405972221 0.3222725438415179 0.9103462283909864 }
radiance 19
center 5.544519424438477 0 207.0658721923828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3827603636711965 0.8392904846030972 }
radiance 18
center 34.873809814453125 0 194.2310791015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9762037236504202 0.30946485277865804 0.9708425442500999 }
radiance 30
center 6.9795918464660645 0 156.03099060058594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.839217038305731 0.3144111918424311 0.9451244631986147 }
radiance 24
center -4.398431777954102 0 177.95089721679688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3246612366563762 0.45162726914136464 }
radiance 28
center 30.629985809326172 0 186.56332397460938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8123981496945771 0.3980701563343971 0.9346656499814737 }
radiance 29
center 47.86043167114258 0 178.34979248046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9351347632014495 0.34481985359286155 0.8585193575374226 }
radiance 23
center 34.45684814453125 0 160.68479919433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5533972028611439 0.45225210552708617 0.9 }
radiance 24
center 1.724612832069397 0 159.82974243164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9870230784925531 0.41701146167890507 0.8032227427308083 }
radiance 24
center 8.048117637634277 0 180.96568298339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8240215726559541 0.4792188973080803 0.8435183688463128 }
radiance 29
center 23.32246971130371 0 165.16827392578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6079963984828575 0.3938465816132911 0.9 }
radiance 31
center 10.468035697937012 0 172.01890563964844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5895406769448928 0.4384733219064596 0.9 }
radiance 24
center 20.650630950927734 0 152.54090881347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5828177033025479 0.3122347701286459 0.9 }
radiance 24
center -21.002227783203125 0 179.86187744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9728575813486718 0.44432344807340635 0.8324002193226203 }
radiance 27
center 19.16825294494629 0 183.8255615234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5632732889561847 0.4178800608592836 0.9 }
radiance 23
center -16.601425170898438 0 173.6007537841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.893687673641666 0.41850043940735426 0.9 }
radiance 21
center -4.125213146209717 0 175.92176818847656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42040677071876886 0.4027757577222906 }
radiance 25
center -1.2897051572799683 0 152.80662536621094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8884921638908075 0.44658030086872724 0.8816873756104967 }
radiance 31
center 14.7551851272583 0 172.80140686035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.987629587757941 0.32220160760940125 0.8589128048926058 }
radiance 30
center 7.147464752197266 0 185.5421142578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.908668961863542 0.47027542143984413 0.8269166688151742 }
radiance 21
center -1.8982124328613281 0 155.33314514160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8742434599531161 0.3132997760866074 0.9898064318214048 }
radiance 21
center 3.638965606689453 0 162.39576721191406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3696387711923954 0.8858056022577773 }
radiance 29
center -26.655710220336914 0 195.86241149902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8227880771852888 0.48202619045962525 0.9 }
radiance 29
center -36.33038330078125 0 185.99136352539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8770702372521476 0.3987438362566752 0.8354367477567557 }
radiance 25
center -14.771665573120117 0 174.40216064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9633753262580356 0.34879018459506994 0.9758763443259256 }
radiance 31
center -19.39904022216797 0 198.945068359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4062986754847545 0.8008710853793316 }
radiance 21
center -3.1586265563964844 0 166.719482421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8338705490281059 0.42316218805493233 0.8723654109255617 }
radiance 20
center 13.457358360290527 0 168.19296264648438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8781625695707369 0.3275885512100726 0.980197724381848 }
radiance 20
center 3.5033979415893555 0 172.313720703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9137257482013855 0.3748134504546975 0.9047357214819731 }
radiance 17
center -10.654770851135254 0 146.75741577148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8624645768780813 0.3234295237377343 0.9324327327447012 }
radiance 28
center -54.145206451416016 0 158.22787475585938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8264462138216571 0.3286252604278485 0.8936523626421291 }
radiance 30
center -51.978816986083984 0 190.50210571289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9850062546199897 0.4164860175541184 0.8460137737849065 }
radiance 20
center -45.221839904785156 0 149.41873168945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.961746793172592 0.4227498716587118 0.9704207237652935 }
radiance 23
center -55.39965057373047 0 167.6217498779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8415353414677843 0.44276506177955144 0.9587612572229564 }
radiance 25
center -34.39247131347656 0 164.35406494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9548777654614459 0.38715539493432904 0.8277567268839372 }
radiance 22
center -14.593563079833984 0 183.47854614257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8789522582153906 0.3030932826709077 0.9721113177434709 }
radiance 30
center -15.708415031433105 0 184.05819702148438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6283255652545804 0.47351775029289844 0.9 }
radiance 25
center -12.034017562866211 0 147.7282257080078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.977097347444424 0.41103988102910083 0.9840856254129928 }
radiance 21
center -37.54299545288086 0 155.9281463623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8113424053504357 0.45798374000672876 0.947510766901183 }
radiance 30
center -17.957551956176758 0 198.5354766845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9927176354313534 0.3135412831168292 0.9067928901020792 }
radiance 23
center -35.653778076171875 0 163.7744903564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9930003311918635 0.4791857290429486 0.8625585884319152 }
radiance 24
center -46.37164306640625 0 172.40994262695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8551678986122786 0.41682465038275074 0.8044127633059239 }
radiance 26
center -66.89289855957031 0 171.23805236816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3069026196371721 0.874655407457314 }
radiance 27
center -18.686580657958984 0 163.4853515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3598289495033639 0.763476158463845 }
radiance 25
center -55.555084228515625 0 147.62452697753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8445711903189228 0.36439977377849764 0.8253339788598656 }
radiance 30
center -36.22956085205078 0 149.46771240234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9243907681650663 0.42513877233227904 0.841581648891879 }
radiance 27
center -73.4747314453125 0 170.98683166503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8509947973015679 0.3769986806429663 0.9 }
radiance 29
center -40.70053482055664 0 157.01780700683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8575991743993016 0.4649363560255245 0.9053972483473456 }
radiance 29
center -66.43329620361328 0 152.06993103027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8922845820867074 0.3597624859946294 0.9140058378013138 }
radiance 20
center -46.2883415222168 0 173.23602294921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9880277069048585 0.33373383538884577 0.8440121884968285 }
radiance 25
center -73.85189819335938 0 180.06472778320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5230635266293604 0.32074086429143633 0.9 }
radiance 28
center -35.935428619384766 0 182.1265869140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6143198491011619 0.34882503087131017 0.9 }
radiance 17
center -73.29592895507812 0 172.34617614746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9393144641851011 0.46569018727365225 0.9766705812505283 }
radiance 16
center -42.13892364501953 0 144.752197265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4966661220173013 0.4470290008883266 0.9 }
radiance 27
center -44.69609069824219 0 143.26519775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45596043911681905 0.3633049942844803 0.9 }
radiance 19
center -40.64968490600586 0 157.35479736328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8983516860217527 0.39863519595255414 0.8183531026778542 }
radiance 16
center -61.7545051574707 0 146.5465087890625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8577289069388659 0.42084180687479167 0.8263088657701292 }
radiance 21
center -60.772056579589844 0 162.9515838623047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7085160097765095 0.341261687249243 0.9 }
radiance 28
center -57.57175827026367 0 183.0688018798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4971090359474659 0.8794529093326389 }
radiance 30
center -59.06125259399414 0 151.48683166503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8109843640772834 0.33083380301684556 0.9324704784150271 }
radiance 20
center -80.04817962646484 0 137.7320556640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3458146950490016 0.6387427867641474 }
radiance 31
center -60.347679138183594 0 175.6739959716797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4896851075441746 0.41417479065251805 0.9 }
radiance 18
center -96.95635986328125 0 181.64207458496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8340460565213549 0.3547320065055635 0.8728161082726299 }
radiance 27
center -92.14571380615234 0 137.95457458496094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4627172622557624 0.8688645659391886 }
radiance 16
center -100.90536499023438 0 152.10592651367188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5691034173898399 0.31879011525217554 0.9 }
radiance 30
center -48.89777755737305 0 136.56671142578125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9555575564339789 0.38837356232159337 0.9390304821459645 }
radiance 27
center -104.20231628417969 0 140.8751983642578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8130868455603341 0.3531487768361577 0.8087964927449842 }
radiance 27
center -53.8084602355957 0 133.85772705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5996796017387971 0.3315012770030275 0.9 }
radiance 22
center -92.89509582519531 0 154.076416015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6403553892376451 0.3435019378268414 0.9 }
radiance 18
center -84.15664672851562 0 151.88783264160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.830743666832216 0.3079864255062493 0.9553487097478524 }
radiance 23
center -94.2867202758789 0 157.73915100097656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8460687278352459 0.47579810250310195 0.9 }
radiance 18
center -75.83409881591797 0 116.83538818359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8480066273149496 0.34471548285036185 0.8934172758988106 }
radiance 30
center -86.73465728759766 0 171.22451782226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.791612528182398 0.4853051511834674 0.9 }
radiance 20
center -81.9656982421875 0 119.32976531982422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9629087146167499 0.47220519953006523 0.9554968957958396 }
radiance 31
center -70.87771606445312 0 140.65066528320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8955146010642496 0.31953884474952315 0.8614313047550799 }
radiance 31
center -77.1741714477539 0 120.47936248779297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8505271622987167 0.49091953701386387 0.9702683189732734 }
radiance 28
center -85.59269714355469 0 123.04235076904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3591195112858512 0.6561380457672551 }
radiance 28
center -65.26241302490234 0 161.36709594726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.561638456920953 0.4979027862304554 0.9 }
radiance 20
center -65.76172637939453 0 166.1413116455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49191877460447264 0.5480232979641515 }
radiance 23
center -79.53324890136719 0 157.21490478515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9488995548734696 0.43031020927176544 0.8543081126583625 }
radiance 20
center -110.90180969238281 0 117.68997955322266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.93704758836539 0.3991120654358964 0.8688284505113967 }
radiance 26
center -106.66470336914062 0 120.68387603759766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8235008827270143 0.33078547416578885 0.8090962410546031 }
radiance 17
center -102.22420501708984 0 151.05813598632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8959511140573995 0.3670693134828509 0.9847046598822263 }
radiance 19
center -88.26599884033203 0 109.51941680908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9112857555660109 0.43518098187838694 0.9546803866662132 }
radiance 27
center -77.46785736083984 0 124.97653198242188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41207381943901056 0.5618529129145071 }
radiance 19
center -85.6263427734375 0 161.3341064453125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36439024191289143 0.8295376868783865 }
radiance 24
center -93.40703582763672 0 111.98038482666016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9047666712962535 0.3688392835916858 0.9248815722401847 }
radiance 18
center -124.71105194091797 0 154.21104431152344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.935334028450642 0.3263471028398234 0.8211098586644556 }
radiance 16
center -79.80538177490234 0 125.98905944824219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8751399616385735 0.3716205500175076 0.8500371990381222 }
radiance 24
center -106.354248046875 0 138.37596130371094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46452257261409835 0.41481881293514367 0.9 }
radiance 31
center -138.9055938720703 0 115.38432312011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8591525484300675 0.36762552415073374 0.8494394169554484 }
radiance 27
center -133.84844970703125 0 122.22457122802734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3958743994103957 0.7429770998990809 }
radiance 26
center -94.2015380859375 0 115.093994140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9458499587577953 0.44957267801968026 0.9017157674497767 }
radiance 30
center -121.84742736816406 0 133.56915283203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8605392922458284 0.4059899006540253 0.9951446593556041 }
radiance 24
center -95.83965301513672 0 107.57682037353516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4821969380052055 0.7310847637189087 }
radiance 20
center -105.4477767944336 0 134.91470336914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9253072819115751 0.4248120243221005 0.9827243878906413 }
radiance 24
center -104.99015045166016 0 129.541748046875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8797539283312232 0.44049460403115254 0.9237040111338048 }
radiance 20
center -93.3402099609375 0 142.95701599121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9654562769294788 0.42752390332846113 0.9630365612437216 }
radiance 25
center -118.51162719726562 0 120.22357177734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5580557760976494 0.38060494959501057 0.9 }
radiance 30
center -105.55644226074219 0 91.80065155029297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.843143625797874 0.3863476837063917 0.9899007380777971 }
radiance 23
center -101.38309478759766 0 127.4598388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8662686281984112 0.48670973551475133 0.8524442110271467 }
radiance 28
center -110.87384033203125 0 121.93679809570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8420473927652781 0.40651733239717236 0.8758754475922894 }
radiance 27
center -98.97343444824219 0 123.3267822265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8786386743485226 0.4380685707528704 0.9919119092254925 }
radiance 29
center -137.1470184326172 0 130.9610595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9210404939786621 0.38458372289286297 0.8289712591341603 }
radiance 20
center -132.92645263671875 0 82.92757415771484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8057696809867233 0.4246351262722077 0.9525822293933457 }
radiance 21
center -143.41383361816406 0 109.41751861572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9590586292333376 0.35568556848721566 0.9870186918734061 }
radiance 26
center -150.685546875 0 112.09809112548828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8139800876305925 0.41352567316938416 0.9466859165123304 }
radiance 30
center -138.95623779296875 0 129.5281219482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8874486047344805 0.39051014404673035 0.8091354627408976 }
radiance 25
center -120.20983123779297 0 124.32481384277344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4736661332348617 0.7021687048400443 }
radiance 19
center -123.11903381347656 0 113.77176666259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8153097309797749 0.39134191011545183 0.906328465362898 }
radiance 30
center -118.73344421386719 0 112.29106903076172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38083957230940485 0.5035224313353196 }
radiance 25
center -125.06263732910156 0 75.72571563720703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9559316056841662 0.3121691004097571 0.9036700794315404 }
radiance 26
center -137.4921875 0 97.17696380615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8609225854012226 0.4524378712344092 0.931436522225074 }
radiance 19
center -155.66189575195312 0 75.1930923461914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6656440074371928 0.43773622453456545 0.9 }
radiance 27
center -149.62840270996094 0 74.53308868408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9069490249170598 0.30377113905298286 0.8674384670965157 }
radiance 20
center -151.0851593017578 0 116.52059936523438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8840319514559962 0.4989392820025202 0.9969612740368198 }
radiance 23
center -151.48841857910156 0 112.25751495361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6600764464034946 0.4039857817040852 0.9 }
radiance 18
center -152.30630493164062 0 81.90525817871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4556135601306073 0.49826307448293294 }
radiance 28
center -120.95944213867188 0 80.87666320800781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3775185746861764 0.42314170616116487 }
radiance 23
center -164.8189697265625 0 97.3384780883789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.860914410911493 0.3506217086118473 0.8370467721979855 }
radiance 21
center -152.9569091796875 0 82.28439331054688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8821916969688967 0.4139370282399555 0.8020279010295864 }
radiance 23
center -140.42605590820312 0 67.04569244384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9973400769441492 0.43464523719106074 0.9654402065977037 }
radiance 27
center -161.64988708496094 0 57.3753547668457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8999516633517136 0.3781693935830528 0.9081653919283639 }
radiance 20
center -146.2090606689453 0 60.050209045410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6579613973621281 0.39001102989901004 0.9 }
radiance 17
center -136.96353149414062 0 69.76859283447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.41372095572178835 0.4303735667942667 0.9 }
radiance 30
center -127.13194274902344 0 69.44483184814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8376771160681233 0.31880761359552107 0.8886351242511125 }
radiance 17
center -114.78921508789062 0 90.21707153320312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8686271614726488 0.3170273749952568 0.9605463279743569 }
radiance 30
center -137.39193725585938 0 92.03421020507812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9972741911429568 0.35279710441587997 0.8953099079104061 }
radiance 17
center -122.98898315429688 0 56.44060516357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9205175663261878 0.30307986594405834 0.8355071337854494 }
radiance 21
center -165.76513671875 0 55.92722702026367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8587701233848258 0.40979811302761926 0.9 }
radiance 21
center -128.0140380859375 0 83.74573516845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9985334720281794 0.41924021589169713 0.8565264508994731 }
radiance 21
center -133.47320556640625 0 55.0860481262207
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9253699196059245 0.33702856628512223 0.9948002856817877 }
radiance 17
center -170.27149963378906 0 64.53421783447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8341173443464112 0.3136135123752421 0.8803614497026906 }
radiance 26
center -117.60369873046875 0 76.03243255615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5274759211407551 0.39511465856534544 0.9 }
radiance 22
center -159.3208770751953 0 60.16325759887695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.38174385836651925 0.7812381790277267 }
radiance 22
center -127.26107788085938 0 91.21880340576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9129518241076263 0.37922432349797797 0.8725243216072635 }
radiance 24
center -133.6045684814453 0 54.97636032104492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9774700233077365 0.4450457838521279 0.9925812099278746 }
radiance 18
center -155.83424377441406 0 58.81269073486328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8334433012751578 0.3349043385593576 0.861698694447975 }
radiance 29
center -162.49288940429688 0 44.17232131958008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6733785436920415 0.3131849599632302 0.9 }
radiance 24
center -157.31076049804688 0 39.94266891479492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3755815764048933 0.6282393086955157 }
radiance 22
center -152.83204650878906 0 80.6891098022461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6991952429487053 0.4805613192802795 0.9 }
radiance 26
center -156.72181701660156 0 59.974090576171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8100187393892915 0.41910999179014613 0.9643520775211549 }
radiance 18
center -157.67208862304688 0 44.11595153808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4342746956332728 0.8536524555937494 }
radiance 27
center -147.9276885986328 0 47.36933135986328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.977256726717038 0.33980210390305726 0.9298622047003505 }
radiance 20
center -154.90455627441406 0 61.115318298339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3607217126147659 0.8332095082097053 }
radiance 19
center -157.9924774169922 0 74.06371307373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.520027882445102 0.33346345157091545 0.9 }
radiance 25
center -158.42445373535156 0 37.8850212097168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8148068432720061 0.474269505374191 0.9555587526498932 }
radiance 25
center -165.1875762939453 0 78.08920288085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5636217010099915 0.3629407443661794 0.9 }
radiance 21
center -160.91551208496094 0 77.38888549804688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3994715757021636 0.6088748333931654 }
radiance 26
center -133.4365997314453 0 65.62047576904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8858721585519767 0.49792637194732164 0.813239228368738 }
radiance 31
center -153.26617431640625 0 39.89625549316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9726403678117663 0.3186952218897035 0.996928304347233 }
radiance 18
center -134.48562622070312 0 48.98027801513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8481633627058497 0.3813596276421067 0.9839470331637099 }
radiance 27
center -166.94041442871094 0 59.20620346069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6985364307363273 0.46162145193073306 0.9 }
radiance 23
center -153.21458435058594 0 32.11560821533203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9486761587466161 0.4894061024313514 0.8313735252668574 }
radiance 23
center -149.964111328125 0 15.22033977508545
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9301362302789526 0.375965022944916 0.8676970102350761 }
radiance 30
center -131.1516876220703 0 56.67936325073242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9116061424675522 0.35354017771984664 0.8026752759709248 }
radiance 28
center -128.96217346191406 0 26.718223571777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39577652870490543 0.8744255046246036 }
radiance 24
center -160.03292846679688 0 17.363759994506836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45513049141518214 0.6293507685354272 }
radiance 22
center -144.2988739013672 0 39.67648696899414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9081476863281841 0.4986224939375319 0.9720379735795309 }
radiance 29
center -172.55999755859375 0 42.54502868652344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.81902690514385 0.3463988027720149 0.912809553219591 }
radiance 29
center -142.46609497070312 0 43.54780578613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9191980111696777 0.4709758904850813 0.8424615614150136 }
radiance 28
center -178.25729370117188 0 32.59379959106445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.986326031633185 0.3821720328122252 0.8328134931953821 }
radiance 16
center -128.87229919433594 0 38.02662658691406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8891244908373971 0.3216262611257526 0.9 }
radiance 28
center -154.6197509765625 0 17.948413848876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5935426876889234 0.3098316102606116 0.9 }
radiance 23
center -170.4967803955078 0 13.944687843322754
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8212380353424096 0.33767553726758776 0.9582367129532335 }
radiance 27
center -137.4164581298828 0 33.37544631958008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8873723402061636 0.331885116696735 0.896401125893262 }
radiance 22
center -169.3015899658203 0 10.789379119873047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9050869801558127 0.3550040018897265 0.9928103049181323 }
radiance 26
center -135.81378173828125 0 28.800676345825195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9893542547475854 0.49824269830333745 0.8208952652260755 }
radiance 31
center -163.6481170654297 0 26.167997360229492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.450213765852679 0.3159782943652458 0.9 }
radiance 22
center -164.63417053222656 0 22.546279907226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9691545792739035 0.30076350584938194 0.9180208106702473 }
radiance 16
center -162.49989318847656 0 -15.61325740814209
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8680643754254402 0.49374111038706364 0.9 }
radiance 29
center -146.0511016845703 0 -7.259180068969727
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.876572634678749 0.43506964327651954 0.946998010967295 }
radiance 24
center -137.53622436523438 0 15.20686149597168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9735986016150339 0.4916483313534217 0.9901272114228783 }
radiance 23
center -139.6686553955078 0 6.669936180114746
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8913720013870952 0.3084835743642725 0.8226126066893185 }
radiance 31
center -141.63792419433594 0 20.3634033203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8262862783254039 0.4841693206536108 0.8253935644194057 }
radiance 25
center -165.12339782714844 0 34.906864166259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9558014592164591 0.40478730897948056 0.890577261487522 }
radiance 29
center -173.716064453125 0 31.70871353149414
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45984856568957366 0.6899919413372753 }
radiance 20
center -137.12002563476562 0 2.325730562210083
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8221755826541226 0.46226901720914315 0.9969318678030213 }
radiance 17
center -135.78639221191406 0 -3.728461503982544
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8606593553388501 0.4382003211667823 0.8526693314245872 }
radiance 28
center -169.74600219726562 0 5.800163269042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9032974295389669 0.36659912359372837 0.8316880797596302 }
radiance 22
center -146.4477996826172 0 -0.006089549511671066
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9119572037946805 0.40715812617005714 0.902888070645354 }
radiance 19
center -128.80772399902344 0 -28.74921989440918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8262905340903167 0.40270927182379057 0.8896381362930703 }
radiance 23
center -129.33665466308594 0 5.879575729370117
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.343598826775309 0.6734702993346828 }
radiance 21
center -172.7592010498047 0 -0.3087117671966553
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42086594348820616 0.5327524489327763 }
radiance 20
center -167.81871032714844 0 -0.921125590801239
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8123820821408727 0.47636913731257835 0.9478524222161211 }
radiance 26
center -156.2411346435547 0 -3.8058900833129883
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9577638736214557 0.4465295550702059 0.8365370100260753 }
radiance 29
center -145.4810333251953 0 2.122131824493408
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.845889313061765 0.3259411657730645 0.940808843982672 }
radiance 31
center -164.21263122558594 0 18.278406143188477
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9424154844431942 0.47097959859379623 0.9984302955688431 }
radiance 19
center -143.9951171875 0 -30.486682891845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.828344461381879 0.3080296013571045 0.9830972800018771 }
radiance 24
center -133.28492736816406 0 -35.13329315185547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9358002958444493 0.4594209953985332 0.9337335468175069 }
radiance 26
center -150.61355590820312 0 -11.44617748260498
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9766524523570883 0.3371637869536382 0.9066431339397915 }
radiance 16
center -131.79136657714844 0 -17.483022689819336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.899179632645738 0.48339637455372453 0.8336995296995664 }
radiance 25
center -126.57799530029297 0 -38.57162857055664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8728704959563466 0.41486626773118784 0.9 }
radiance 29
center -129.98983764648438 0 -26.26199722290039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8418773171282665 0.408711711301893 0.9780458552951437 }
radiance 22
center -138.95130920410156 0 -31.96424674987793
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8726321502716383 0.39347289984142153 0.9912596431855212 }
radiance 26
center -163.0796661376953 0 -4.387938976287842
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4472368600985185 0.6589653910943594 }
radiance 29
center -129.51632690429688 0 -30.435205459594727
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8254488109358131 0.33809845987491954 0.9880042464315928 }
radiance 22
center -143.09596252441406 0 -9.537422180175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8358590587990589 0.4669481030517493 0.9435017867562663 }
radiance 29
center -167.12823486328125 0 -36.31377410888672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9466470649307923 0.4238033576451407 0.8834710234647885 }
radiance 23
center -158.45285034179688 0 -48.1092414855957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9128464877948497 0.3426119788355169 0.8120258126560649 }
radiance 17
center -135.69003295898438 0 -46.54584884643555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9553153930674925 0.4742375064704644 0.8509375592815827 }
radiance 21
center -151.64697265625 0 -18.478553771972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8581016068925658 0.48668964293904793 0.8022797053308314 }
radiance 16
center -138.601806640625 0 -42.53286361694336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9022138919461016 0.36933774986260604 0.8599382992932598 }
radiance 16
center -124.81866455078125 0 -12.544477462768555
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9712298824229637 0.32040657549228824 0.9274736792271928 }
radiance 31
center -164.59744262695312 0 -58.56730651855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6524154657607625 0.44612114456075047 0.9 }
radiance 18
center -120.65438842773438 0 -40.068702697753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.695592841826405 0.3655898905826151 0.9 }
radiance 27
center -152.86502075195312 0 -14.149797439575195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9991943902660252 0.3913077957017439 0.8435141148391649 }
radiance 16
center -153.15478515625 0 -51.566871643066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6904409641765397 0.3920464322266938 0.9 }
radiance 16
center -156.9414520263672 0 -45.012718200683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8426674174260905 0.3341754279945596 0.8018287902179566 }
radiance 19
center -117.3194580078125 0 -69.38424682617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8966583267563727 0.48516974149463277 0.9149413615619263 }
radiance 21
center -160.5886688232422 0 -54.611263275146484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8003705093253268 0.48539947340798206 0.8787777549957666 }
radiance 28
center -147.98597717285156 0 -33.14125061035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8969129011370586 0.48345123722101535 0.8277377438920168 }
radiance 17
center -155.1497039794922 0 -54.724361419677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8128498465346998 0.3753861025741538 0.8363796688959217 }
radiance 17
center -122.10275268554688 0 -38.73751449584961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49207031296728 0.8979788657825347 }
radiance 24
center -142.31944274902344 0 -23.65421485900879
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9099202829391538 0.3048767395619583 0.8672520912313613 }
radiance 19
center -135.74790954589844 0 -25.67317008972168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.826798863402906 0.45996264919910523 0.8462578871268338 }
radiance 22
center -118.79763793945312 0 -70.51737213134766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8718484767103999 0.4194720347442604 0.8823590442695641 }
radiance 17
center -152.75448608398438 0 -45.587791442871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9080045706332558 0.3717236165717108 0.9502953725586128 }
radiance 24
center -134.19174194335938 0 -39.47828674316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.352441694935144 0.5457315682893971 }
radiance 25
center -149.17564392089844 0 -67.97208404541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4661253573000973 0.5338646044893229 }
radiance 16
center -116.29609680175781 0 -51.464447021484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9650988229194696 0.426858278547382 0.8795645268716469 }
radiance 30
center -139.4101104736328 0 -37.49399185180664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8967305435532704 0.4138237572050458 0.8180851934511194 }
radiance 22
center -142.47125244140625 0 -51.49460220336914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9230360305448244 0.49774588830416266 0.9427034530391387 }
radiance 20
center -150.7820587158203 0 -75.67664337158203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9117087813858378 0.3250268161348105 0.8030471218966422 }
radiance 18
center -137.9549560546875 0 -39.56932830810547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8240305143127784 0.3859368460938859 0.9545613174779471 }
radiance 17
center -122.658447265625 0 -75.85092163085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9818865091299204 0.331948641467178 0.8243319719988189 }
radiance 28
center -140.51519775390625 0 -80.60630798339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32604975545385845 0.7563036811625529 }
radiance 29
center -130.3523712158203 0 -77.9871597290039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8986668373308634 0.3587753061244841 0.9856122294616888 }
radiance 17
center -126.96576690673828 0 -62.6539192199707
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3376646599849049 0.4809138285636235 }
radiance 25
center -104.87155151367188 0 -76.86111450195312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48222811485307016 0.7939520839409278 }
radiance 29
center -120.40260314941406 0 -81.76325988769531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9050908132304649 0.4011623113668813 0.9148049928284957 }
radiance 20
center -131.42613220214844 0 -76.4529037475586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5721890034057969 0.39860788229687705 0.9 }
radiance 29
center -131.0286407470703 0 -64.97740936279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.932383680955217 0.3181194271996751 0.8901825897899792 }
radiance 19
center -129.48008728027344 0 -47.611759185791016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8112712289926776 0.37291178590005547 0.9522542606743489 }
radiance 27
center -121.94807434082031 0 -82.34193420410156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4829197230503883 0.7029752658177022 }
radiance 22
center -150.84320068359375 0 -54.05046844482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8677042363723183 0.4432062853831633 0.8461709516024665 }
radiance 18
center -127.63587188720703 0 -72.77880096435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8579084535080157 0.43345331130307907 0.8649563263183879 }
radiance 23
center -127.18179321289062 0 -68.11498260498047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9573354788248865 0.3521462074553963 0.9417939483604492 }
radiance 20
center -145.86212158203125 0 -69.34371185302734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3628587343951958 0.6640559767647375 }
radiance 29
center -135.34169006347656 0 -104.88214111328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8815967298486227 0.3315173134250743 0.9754023823894744 }
radiance 19
center -128.8124237060547 0 -103.57015228271484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8103837665364948 0.3218086192014728 0.8778555555750255 }
radiance 26
center -127.67974853515625 0 -80.54671478271484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8572914227752102 0.3751786277740573 0.8392737664235541 }
radiance 29
center -125.7398452758789 0 -93.44844055175781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9778070767904947 0.4822597309114642 0.9340561426550759 }
radiance 17
center -127.00807189941406 0 -83.32814025878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7860818356253413 0.3244328337551406 0.9 }
radiance 25
center -96.1196060180664 0 -85.60711669921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9041690930452886 0.47281251036476835 0.9707708716491653 }
radiance 24
center -141.85983276367188 0 -87.34713745117188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4547642543830003 0.4746470346442516 0.9 }
radiance 22
center -115.42723083496094 0 -92.32416534423828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8478498337455742 0.33776332019116534 0.9832358130952448 }
radiance 30
center -94.23626708984375 0 -63.85792922973633
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8567539051996613 0.4842577529989729 0.9770729717149087 }
radiance 19
center -128.5260009765625 0 -83.11856079101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8724556341690085 0.307212672721191 0.9 }
radiance 22
center -121.83625793457031 0 -87.5464096069336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6497353153989472 0.3420048831563295 0.9 }
radiance 17
center -99.67928314208984 0 -116.29039764404297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9687659017035781 0.33178725417255467 0.9219899732589588 }
radiance 26
center -106.66053771972656 0 -105.99444580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4755365143085494 0.7435958660366315 }
radiance 20
center -98.73783874511719 0 -107.99373626708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9926880573463064 0.3175138134113023 0.8186484090582254 }
radiance 19
center -120.25318145751953 0 -99.96001434326172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9781868743538379 0.48622161724708407 0.9803094125139887 }
radiance 22
center -114.6506118774414 0 -83.5712661743164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8924656696843942 0.48607812668349626 0.8152758269420047 }
radiance 31
center -102.23637390136719 0 -111.01943969726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.37881012952528215 0.8793758687342196 }
radiance 28
center -113.06658935546875 0 -109.34226989746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5714611832665834 0.4469416904882101 0.9 }
radiance 17
center -107.86915588378906 0 -85.272705078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7066567199775075 0.3177235083888852 0.9 }
radiance 16
center -99.1623764038086 0 -111.8304672241211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8286558735141356 0.370958341072322 0.8554050484193906 }
radiance 21
center -76.1880111694336 0 -80.02529907226562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7580637394296823 0.4107580659900771 0.9 }
radiance 22
center -96.98150634765625 0 -78.76204681396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8970782309270028 0.4058168159579986 0.9127161864621713 }
radiance 21
center -107.2754898071289 0 -84.06318664550781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9944927731382363 0.4892629023401635 0.9511987859207633 }
radiance 25
center -97.87445068359375 0 -108.31403350830078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9965292894231275 0.43033137524348075 0.9449737802927822 }
radiance 19
center -84.46894073486328 0 -89.72811126708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4188555377226052 0.3530044322684 0.9 }
radiance 18
center -97.30916595458984 0 -111.6311264038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8474273658396267 0.40126430695092574 0.9206274438402844 }
radiance 29
center -78.49586486816406 0 -120.13856506347656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8730571533467606 0.49678414488566613 0.9135179293783421 }
radiance 22
center -111.09260559082031 0 -93.4112319946289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8617768110385122 0.40780271070112856 0.8140311290587717 }
radiance 16
center -98.14662170410156 0 -104.87786865234375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8429310053953167 0.3977495343115428 0.8745580457794988 }
radiance 19
center -108.70265197753906 0 -81.8997802734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9700378772613462 0.4893166080167153 0.9455090549346286 }
radiance 29
center -96.62616729736328 0 -88.3961410522461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.83078149639132 0.33915809395374485 0.8656292964344777 }
radiance 31
center -99.62101745605469 0 -116.24755859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8896580047279379 0.3370312929753864 0.9720712629611081 }
radiance 26
center -83.8165283203125 0 -110.9566650390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9480719330285615 0.43102143162701123 0.8328407350929015 }
radiance 24
center -94.54309844970703 0 -117.628173828125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9087949883981572 0.4356612125450174 0.8086503483593344 }
radiance 22
center -84.425537109375 0 -94.42446899414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8190211315981695 0.453353884441412 0.8664788398864474 }
radiance 20
center -109.124267578125 0 -91.45650482177734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8715965129098961 0.4055434401793877 0.8947166192297303 }
radiance 27
center -64.92231750488281 0 -110.51426696777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.828306431610365 0.42858643822898923 0.8860159239455995 }
radiance 16
center -106.47273254394531 0 -128.21836853027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8422286389220597 0.4367688219865564 0.8032657279087716 }
radiance 29
center -87.7180404663086 0 -125.7744140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8315010499165342 0.33996313108059667 0.914663325690136 }
radiance 26
center -84.10956573486328 0 -87.81756591796875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9846899937964315 0.4621612785492544 0.9808996455133223 }
radiance 20
center -99.57439422607422 0 -133.20327758789062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8602615190641121 0.43909374326962936 0.8068240193748442 }
radiance 24
center -73.9880142211914 0 -108.8428726196289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39019768738947946 0.4162468363746199 }
radiance 24
center -84.84359741210938 0 -113.9766845703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7158893430756545 0.42081918020764175 0.9 }
radiance 25
center -84.61871337890625 0 -131.94384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9565202634252219 0.31183023952447364 0.8914643036674851 }
radiance 20
center -64.15795135498047 0 -99.9100570678711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4422630101179778 0.41906003771264944 }
radiance 18
center -77.80165100097656 0 -105.32231140136719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.418918032925676 0.8971910217177431 }
radiance 16
center -94.5777359008789 0 -94.11027526855469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3636005122657251 0.7344084182947203 }
radiance 31
center -95.76406860351562 0 -104.70851135253906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9450441498720931 0.41729149744787497 0.9563509649831379 }
radiance 19
center -79.46144104003906 0 -95.5223388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8586846553988245 0.4007586859751491 0.8145469697758623 }
radiance 31
center -57.143943786621094 0 -107.31147766113281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8486204803091331 0.3837820485387642 0.968109981105796 }
radiance 24
center -85.13863372802734 0 -116.37861633300781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8165210766049266 0.3131107982112541 0.917697681358442 }
radiance 17
center -47.17723083496094 0 -100.38790893554688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.960122723045145 0.3189211930720648 0.9380615809435803 }
radiance 16
center -73.11083984375 0 -145.05299377441406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8019001138191237 0.48604317202819713 0.9 }
radiance 23
center -80.27626037597656 0 -127.42662811279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32033272935453955 0.4904387263691108 }
radiance 17
center -49.920440673828125 0 -121.89497375488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9546187994221209 0.47567785082650665 0.9645629351454561 }
radiance 27
center -42.586788177490234 0 -109.25418090820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9746942779243007 0.35917908539366855 0.9940303226471376 }
radiance 21
center -63.242122650146484 0 -108.50122833251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8282219446629275 0.33108858654825574 0.9 }
radiance 17
center -70.83870697021484 0 -125.97113037109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7802421599570422 0.39570018018093855 0.9 }
radiance 29
center -85.1487045288086 0 -136.78651428222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36759666047652073 0.8585750983746124 }
radiance 28
center -70.33273315429688 0 -138.31549072265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8074561886185395 0.32787508205439203 0.8768120822121735 }
radiance 28
center -67.86460876464844 0 -126.37808227539062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9379060820959778 0.35279577538691825 0.8992996943682964 }
radiance 24
center -39.10652160644531 0 -104.54454040527344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8120771680941791 0.35613165371771444 0.9 }
radiance 25
center -72.31144714355469 0 -110.78585815429688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8737160196388718 0.3306437588672786 0.9164037474183653 }
radiance 26
center -70.46013641357422 0 -114.34465789794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9430105379965937 0.47127959081986126 0.9836573813263426 }
radiance 24
center -62.73954772949219 0 -148.2588653564453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42770503606453425 0.5973347446721059 }
radiance 18
center -41.14780807495117 0 -118.10140991210938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8531514218347616 0.36369057435132823 0.8367383746516652 }
radiance 19
center -52.38782501220703 0 -125.86811065673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9252022467772245 0.4029151801632335 0.9237983767884851 }
radiance 26
center -59.967529296875 0 -129.22866821289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8826647492324468 0.3770368632281951 0.9 }
radiance 30
center -42.30051803588867 0 -127.64067840576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.910474487884368 0.3666730350686783 0.9436141742135662 }
radiance 23
center -67.83160400390625 0 -150.2372283935547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8644822866850852 0.488492220540489 0.8112637742072297 }
radiance 19
center -23.277503967285156 0 -114.22624206542969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5393710824266689 0.3919494020455844 0.9 }
radiance 16
center -46.99660110473633 0 -144.11497497558594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9411732332536408 0.497490084288131 0.947423208838117 }
radiance 20
center -53.13569259643555 0 -145.07713317871094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.855953339249373 0.455290143099091 0.8598333285590548 }
radiance 28
center -47.41090393066406 0 -129.84779357910156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9832136092421206 0.4160498402059568 0.8748347335954358 }
radiance 19
center -56.79643630981445 0 -116.3734359741211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9324098379620329 0.40114714764555076 0.887670240553236 }
radiance 29
center -58.969112396240234 0 -116.627197265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4620867293935843 0.4151769578734762 }
radiance 27
center -45.02537155151367 0 -110.24044036865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9506421642313561 0.31448403681956544 0.8512308109845488 }
radiance 22
center -40.17383575439453 0 -137.096435546875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8227362602763876 0.3402842950089936 0.9635641521550753 }
radiance 17
center -57.30219268798828 0 -123.29949188232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9651327949498792 0.4085447635418725 0.8292579990841651 }
radiance 23
center -59.92267990112305 0 -122.19947052001953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8532247325413566 0.3030114311737848 0.8464330802203035 }
radiance 25
center -30.976905822753906 0 -134.8089141845703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.47742656841712894 0.8197279032987705 }
radiance 31
center -36.69473648071289 0 -152.26953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.845428729662416 0.4339862982500382 0.9 }
radiance 22
center -16.28042984008789 0 -114.59767150878906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8833025499948015 0.41193583555025304 0.8981695832696162 }
radiance 21
center -6.7840800285339355 0 -132.98948669433594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8601596701933875 0.32821660042130946 0.9020382292443839 }
radiance 25
center -19.691328048706055 0 -149.8726806640625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7498843032281863 0.33820278782389124 0.9 }
radiance 27
center -46.12068176269531 0 -146.9771728515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.381860085841527 0.5675479295241556 }
radiance 22
center -44.90768051147461 0 -132.7234649658203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41800301205028645 0.6283228210639773 }
radiance 25
center -24.504732131958008 0 -127.1559829711914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.48035251073117247 0.8685115801866183 }
radiance 24
center -27.622028350830078 0 -123.03981018066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.986612047513688 0.47529399255863236 0.9356109200525375 }
radiance 19
center -30.26621437072754 0 -128.0544891357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46631118433840524 0.5226909578143253 }
radiance 27
center 3.7760441303253174 0 -117.76360321044922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9933705061463125 0.4995343576330047 0.9366648277579658 }
radiance 17
center 5.2386956214904785 0 -143.36148071289062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9610346992121321 0.4862331359197719 0.9255750776160421 }
radiance 24
center -12.619660377502441 0 -153.89382934570312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8958579737665858 0.30497866244471533 0.980168523264893 }
radiance 18
center -8.015226364135742 0 -144.11622619628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.940354311240254 0.3281379180920861 0.9171807090168531 }
radiance 28
center -1.2911778688430786 0 -118.90739440917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8856595367658376 0.48914092140639975 0.9 }
radiance 21
center 2.1658873558044434 0 -116.58137512207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8920785732169668 0.42067332091052245 0.9 }
radiance 30
center 6.697109699249268 0 -137.62794494628906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9173430896896673 0.35531171054793825 0.9980879587846456 }
radiance 20
center -33.787845611572266 0 -137.93875122070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.32609638457936274 0.5755656695889452 }
radiance 22
center 1.716343879699707 0 -112.0548324584961
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8334087269261656 0.32984771820738623 0.9983856438625948 }
radiance 23
center 4.759369373321533 0 -116.77169036865234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9870560204110244 0.4788135411184741 0.9016200880775231 }
radiance 30
center -17.303987503051758 0 -124.92450714111328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9553261653545505 0.30964857064146356 0.9628074515616464 }
radiance 25
center -19.3685359954834 0 -121.23100280761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8215093021940398 0.35548970002116287 0.9307070619016111 }
radiance 18
center 20.611347198486328 0 -132.2186279296875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.811904700878556 0.31598053904557 0.8658827386403369 }
radiance 31
center -17.075258255004883 0 -134.94776916503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5193754032801837 0.42145491503455423 0.9 }
radiance 25
center 14.82543659210205 0 -121.23892211914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3952124332580734 0.6309314044156351 }
radiance 28
center -22.883956909179688 0 -121.62338256835938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9925367425399002 0.35252070742310415 0.8977249664379221 }
radiance 31
center -13.186346054077148 0 -147.6113739013672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9670083140739221 0.49517734963689697 0.8974384214975911 }
radiance 26
center -20.689115524291992 0 -112.87202453613281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9503996869738676 0.3936575226583324 0.865917287901919 }
radiance 24
center -1.0775424242019653 0 -125.30506896972656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9959279307364639 0.33367689536631123 0.8145246258951239 }
radiance 25
center 11.888399124145508 0 -137.3164825439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7165550808183005 0.46589477517221994 0.9 }
radiance 16
center 7.266804218292236 0 -141.76174926757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8624006989223372 0.4420118293192174 0.8290478885800746 }
radiance 30
center -5.592034816741943 0 -114.25421905517578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8719589264925037 0.37171772868734343 0.9943777272693203 }
radiance 20
center 13.952714920043945 0 -113.18970489501953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8764188873085644 0.432837973094091 0.9703758636803904 }
radiance 26
center 25.98797607421875 0 -144.4442596435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.509619084802447 0.3069970339881877 0.9 }
radiance 29
center 30.289583206176758 0 -125.90988159179688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8095057361538337 0.33101131644933834 0.9563539096257196 }
radiance 18
center 24.55122184753418 0 -120.82429504394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8594491530815026 0.39901093443887103 0.8066563650147092 }
radiance 20
center 31.707611083984375 0 -133.99154663085938
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5876286806321899 0.34847894052149425 0.9 }
radiance 16
center 24.03071403503418 0 -135.8753204345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9433449938863248 0.4186122028607275 0.89215258496222 }
radiance 30
center -2.0343432426452637 0 -124.15708923339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8730253515482505 0.40049025017618056 0.9421137904288207 }
radiance 23
center 13.239607810974121 0 -149.26438903808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4723027102498311 0.8074391069929382 }
radiance 16
center 24.366825103759766 0 -115.5737075805664
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.49096276822392027 0.4290899930708253 }
radiance 29
center 29.962120056152344 0 -140.6917724609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8788460698573547 0.36370522473087463 0.9 }
radiance 24
center 45.46083450317383 0 -108.31717681884766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8167589776021925 0.46328315117007846 0.8424239991095144 }
radiance 29
center 30.469120025634766 0 -128.4750518798828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8834780655077284 0.41529704595660916 0.9180291071400196 }
radiance 30
center 37.68222427368164 0 -136.50234985351562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6071639613470717 0.47664679982238795 0.9 }
radiance 24
center 16.310909271240234 0 -117.25126647949219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5702791204563353 0.3769009055888244 0.9 }
radiance 28
center 15.968666076660156 0 -140.98390197753906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4701582490649493 0.4179094146746739 }
radiance 30
center 46.45939254760742 0 -107.78858184814453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8176306820310495 0.3124588391814246 0.8039706954927214 }
radiance 29
center 24.74351692199707 0 -121.79817962646484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.807144082365584 0.35108707789644916 0.8438771487821687 }
radiance 19
center 18.853540420532227 0 -142.57449340820312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9674344613207291 0.4013435385018329 0.9013030165463086 }
radiance 21
center 24.524995803833008 0 -110.55722045898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8022204603132104 0.41400899926609547 0.9231973901072064 }
radiance 30
center 61.0911750793457 0 -101.2994613647461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8107143762528883 0.3847047628226521 0.9367402355237848 }
radiance 31
center 26.7203369140625 0 -131.08848571777344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.891369592081996 0.48593062204008364 0.819627419058949 }
radiance 22
center 53.36931228637695 0 -121.1384048461914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9635999404566942 0.40726735565642647 0.9359567900695935 }
radiance 29
center 28.289505004882812 0 -139.9649200439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8805813275526354 0.40554369783186395 0.8105510726740749 }
radiance 18
center 43.0150260925293 0 -114.79601287841797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4312843367821757 0.5799359752614449 }
radiance 30
center 36.72979736328125 0 -110.03055572509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7021709205795174 0.41381596223359696 0.9 }
radiance 19
center 45.94203567504883 0 -127.39383697509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8299599152540899 0.3706661407650733 0.9208797819239801 }
radiance 20
center 38.874977111816406 0 -128.51174926757812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9390278747381329 0.3782900095918963 0.9078476452405329 }
radiance 18
center 30.29572296142578 0 -104.55805969238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.46171040089081056 0.5771583824653798 }
radiance 20
center 72.47119140625 0 -118.96643829345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8343008987574094 0.35510976032515745 0.9115141980245045 }
radiance 20
center 77.36189270019531 0 -114.34320831298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9897966222554906 0.4895399198514216 0.9525147983847173 }
radiance 20
center 39.600215911865234 0 -111.57414245605469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.920730345286022 0.3108031418513854 0.9314040169627219 }
radiance 23
center 76.85126495361328 0 -127.01760864257812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3967212703694417 0.5633897020832509 }
radiance 26
center 63.71479034423828 0 -122.20438385009766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8987864712572973 0.34084735503928865 0.9572761308761571 }
radiance 21
center 65.45616149902344 0 -126.11878204345703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8026352945233814 0.4958438740821171 0.8877031946231647 }
radiance 17
center 39.18993377685547 0 -108.14276885986328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9374877042117271 0.4512126937989054 0.9715713669823209 }
radiance 20
center 77.30681610107422 0 -105.97157287597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9332087085023635 0.4956842051853384 0.812445550996958 }
radiance 30
center 51.02138137817383 0 -99.61761474609375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6680042938071908 0.40303261932776335 0.9 }
radiance 16
center 77.03497314453125 0 -121.27290344238281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9924420134344731 0.32458908826908717 0.8327394252173291 }
radiance 18
center 76.62484741210938 0 -106.53607940673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9841367743311031 0.4455393878613808 0.9785365803944588 }
radiance 30
center 74.90266418457031 0 -100.92040252685547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8615657545823032 0.4218093504471233 0.8888280185160463 }
radiance 29
center 84.7390365600586 0 -88.70005798339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3189513700614742 0.4246604742014888 }
radiance 24
center 65.58248901367188 0 -123.3550033569336
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.45767654959778103 0.4819668887502122 0.9 }
radiance 23
center 54.620201110839844 0 -100.57341766357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.43048763879271446 0.5841083554247558 }
radiance 23
center 83.64220428466797 0 -120.5357437133789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.408230450888567 0.46998654909760795 }
radiance 25
center 89.71281433105469 0 -104.13133239746094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.991719538885983 0.4897938764237019 0.8569668940226227 }
radiance 24
center 88.36985778808594 0 -113.45561218261719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8034569529225756 0.35938487787051104 0.9502913821358064 }
radiance 21
center 71.07305145263672 0 -122.10506439208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9396673523302081 0.46661585025328356 0.9490370161202606 }
radiance 27
center 83.63924407958984 0 -103.51527404785156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9061337699008654 0.3215566450901681 0.9423840732920681 }
radiance 17
center 91.35240936279297 0 -100.1187973022461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9374065506456158 0.45948224444157043 0.9341116083248475 }
radiance 27
center 83.48274993896484 0 -94.33795928955078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3894047184047881 0.7165001626756935 }
radiance 18
center 82.85934448242188 0 -102.83069610595703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9065236642811613 0.3763602140557296 0.9861850895544549 }
radiance 28
center 93.36968231201172 0 -102.66166687011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.871784537863246 0.3204378863056928 0.9622537391431072 }
radiance 23
center 89.3940658569336 0 -98.7419204711914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9582353774764705 0.35875204822729295 0.8853648818767191 }
radiance 29
center 94.5895767211914 0 -107.03959655761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9184626170501726 0.35008739769862657 0.8162939203816528 }
radiance 17
center 74.46563720703125 0 -77.41119384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9138578278393708 0.4040951465567688 0.8653496413851086 }
radiance 20
center 91.39444732666016 0 -82.86489868164062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6428512538632323 0.3343189368609893 0.9 }
radiance 25
center 102.22140502929688 0 -104.79515075683594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8505910808594512 0.3365841964747021 0.8375648551821642 }
radiance 20
center 79.11608123779297 0 -91.64613342285156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6676370854788715 0.35536955609496707 0.9 }
radiance 31
center 105.34297180175781 0 -79.2780532836914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5683193149389392 0.49380342182697856 0.9 }
radiance 29
center 101.36119079589844 0 -86.81192016601562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7697607105600073 0.48896917046621824 0.9 }
radiance 30
center 79.7491683959961 0 -76.16832733154297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8915673579455093 0.46465190382543947 0.9872914898678663 }
radiance 19
center 83.35362243652344 0 -71.98983001708984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8996681436627714 0.32297660699204633 0.9060631474463077 }
radiance 17
center 88.60734558105469 0 -81.85508728027344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8349984752061883 0.4413530747149032 0.9458157027235373 }
radiance 29
center 84.87985229492188 0 -72.0202865600586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6131298510361458 0.3100646672130192 0.9 }
radiance 23
center 98.88402557373047 0 -67.07752990722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3063282375218838 0.7516532568974907 }
radiance 18
center 78.26504516601562 0 -83.79808807373047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9267049651426205 0.3566493511236158 0.8723707487636827 }
radiance 21
center 75.06546020507812 0 -92.35591888427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9192805271627341 0.37166807840636856 0.950818778213099 }
radiance 25
center 104.86565399169922 0 -95.37030792236328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6102225577453253 0.48415154760024376 0.9 }
radiance 23
center 90.0230941772461 0 -56.79918670654297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8425995668636665 0.4284732452752169 0.909120200050749 }
radiance 24
center 103.30083465576172 0 -54.37084197998047
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3306075399801363 0.5337693502155959 }
radiance 29
center 113.17691802978516 0 -62.93144607543945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8567924697819218 0.4644410810312861 0.9466813252859255 }
radiance 22
center 97.20028686523438 0 -52.167510986328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9697285315500878 0.44703583152122406 0.8770828839630068 }
radiance 28
center 83.67481231689453 0 -90.58157348632812
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8353086679012129 0.4956273039943433 0.8743877665911406 }
radiance 21
center 88.76741027832031 0 -87.09380340576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7415632639531574 0.3593079232887603 0.9 }
radiance 24
center 88.874267578125 0 -64.17413330078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9260923399972539 0.37959696516292696 0.9804912297020771 }
radiance 19
center 113.34404754638672 0 -53.25586700439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9222324538920589 0.492971060431973 0.8879323922036348 }
radiance 16
center 105.18326568603516 0 -87.45247650146484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.942323031973963 0.46607772716691853 0.9375946411135128 }
radiance 17
center 112.85952758789062 0 -59.584266662597656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8391698368029541 0.48300384063971424 0.9315096839998557 }
radiance 27
center 106.25845336914062 0 -75.8377456665039
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6720560708517493 0.3109907441611122 0.9 }
radiance 25
center 106.52056121826172 0 -51.17155075073242
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9539746219522907 0.48633782248063245 0.8848730142766217 }
radiance 23
center 122.37435150146484 0 -42.41316223144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.481312408104769 0.6621285664160861 }
radiance 21
center 90.18904876708984 0 -76.84342193603516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.922551982185624 0.441976557105643 0.8523399105778642 }
radiance 18
center 91.44776153564453 0 -40.17167282104492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8388475710658284 0.3732793265493535 0.9411612857865936 }
radiance 22
center 92.38589477539062 0 -44.14992904663086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8748281763603744 0.43938528036387214 0.9 }
radiance 24
center 103.43352508544922 0 -48.15044021606445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4159936437439301 0.6145902864541133 }
radiance 20
center 109.80300903320312 0 -61.81694030761719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36620962056865736 0.713523424320988 }
radiance 29
center 99.44062805175781 0 -41.97512435913086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4055558600754785 0.6457465551277728 }
radiance 27
center 98.29747009277344 0 -64.77005767822266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8139338332047747 0.3231169743956661 0.8723412740596422 }
radiance 29
center 129.5996551513672 0 -45.98016357421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8886066199275703 0.36249580817440047 0.8908713230822114 }
radiance 18
center 115.46581268310547 0 -25.007038116455078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8614853374779046 0.44484868669079103 0.8219624203832495 }
radiance 29
center 126.96927642822266 0 -60.40605545043945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8673192009050656 0.31578333182144824 0.8571467992193401 }
radiance 16
center 106.02611541748047 0 -29.474695205688477
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9591482523561571 0.46993421818682884 0.9829294048012985 }
radiance 25
center 127.84101867675781 0 -48.20755386352539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.891139624951319 0.45996690565988485 0.9 }
radiance 29
center 123.26017761230469 0 -43.772010803222656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.41496263674468914 0.7670553468789661 }
radiance 21
center 97.22001647949219 0 -58.84916687011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9321543066061373 0.36399305339438 0.9305885546635047 }
radiance 18
center 113.40462493896484 0 -55.442718505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8519380800791742 0.32920945257711776 0.8698435918118089 }
radiance 28
center 131.1314697265625 0 -25.44207000732422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8352996717010247 0.41981509933221334 0.9 }
radiance 26
center 132.00242614746094 0 -48.89686584472656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9501276695638139 0.45190527941312286 0.8709037705874136 }
radiance 29
center 133.01858520507812 0 -13.793052673339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4276044939879068 0.7929229949770196 }
radiance 28
center 136.07150268554688 0 -26.53168296813965
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8968797498324627 0.3906200539675576 0.9820354922231169 }
radiance 18
center 112.73310089111328 0 -47.601680755615234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9973809172806902 0.36698203539583196 0.8406559795289504 }
radiance 28
center 114.01480102539062 0 -13.092999458312988
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.42943169342404386 0.4014843774240445 }
radiance 25
center 101.5843276977539 0 -12.061137199401855
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4313574596108274 0.6787289720344564 }
radiance 16
center 108.78821563720703 0 -38.18587112426758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8408503677098693 0.4720640586414109 0.8844321778729214 }
radiance 22
center 117.54359436035156 0 -31.255701065063477
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9609151173188093 0.3345961037648882 0.95907031125354 }
radiance 29
center 117.08606719970703 0 -17.3057918548584
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867212450676984 0.4422449096975687 0.8303900394514147 }
radiance 26
center 135.0126495361328 0 -33.41204833984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5398895573014053 0.3098253369531756 0.9 }
radiance 22
center 133.39547729492188 0 -25.489547729492188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8738781596995115 0.33252970777934127 0.8363740421150152 }
radiance 26
center 112.97087860107422 0 -11.089763641357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9854052797143625 0.3976665761927184 0.8387033544861111 }
radiance 16
center 118.39073944091797 0 -31.32790184020996
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8983202614767342 0.31921603053966263 0.8917333688049982 }
radiance 27
center 108.574462890625 0 -10.919367790222168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.458119413557712 0.4914043342984983 0.9 }
radiance 20
center 128.78700256347656 0 -7.563329696655273
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8478279996831972 0.43707832058379414 0.8209439143162822 }
radiance 16
center 104.44990539550781 0 -2.7618825435638428
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9773869436897937 0.35298501304748015 0.8637468354636197 }
radiance 18
center 114.14856719970703 0 -19.54231834411621
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9075438496902966 0.34343272784499096 0.9514097710162261 }
radiance 28
center 110.25775909423828 0 -26.31432342529297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8062490138210102 0.4097101203750356 0.9564350541702842 }
radiance 24
center 136.05709838867188 0 4.368138313293457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8799520672480762 0.400528375537416 0.8115841165700178 }
radiance 30
center 113.33245086669922 0 -2.3138794898986816
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.908654943124709 0.4847535047585332 0.8946225634355203 }
radiance 23
center 124.32379913330078 0 -28.63792610168457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8619319796109133 0.4996623276648519 0.8876937926235546 }
radiance 30
center 112.40086364746094 0 10.929709434509277
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8260917438520129 0.41446196369257915 0.8195774132938812 }
radiance 19
center 118.20294189453125 0 -3.599928617477417
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866530228862668 0.3648478163065888 0.9471163965243491 }
radiance 26
center 119.07408142089844 0 2.6073946952819824
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8345687590603251 0.3192502626793636 0.8752937281170162 }
radiance 24
center 131.1100616455078 0 -14.100316047668457
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8614357104048778 0.3737758011315494 0.8551184842095421 }
radiance 29
center 133.9676055908203 0 -3.921841859817505
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8174667989995401 0.3774138526975376 0.984958109321737 }
radiance 30
center 117.48062896728516 0 -2.3555076122283936
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.896405766928124 0.45002839915636395 0.906234858882001 }
radiance 29
center 128.79266357421875 0 -0.6202133893966675
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4312794650150099 0.3264677838091106 0.9 }
radiance 28
center 134.8158721923828 0 -15.08570384979248
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8133514590032763 0.4041293260197071 0.984102712977809 }
radiance 26
center 135.0867156982422 0 2.551337957382202
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7523819644110928 0.3905344355862372 0.9 }
radiance 20
center 102.89219665527344 0 -16.96662712097168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34757613103949087 0.7283167529020589 }
radiance 21
center 97.3801498413086 0 -0.2629204988479614
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9063739209572446 0.38259519652216534 0.9949131544293038 }
radiance 20
center 125.68806457519531 0 25.615097045898438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.779529007907756 0.48359265284829167 0.9 }
radiance 27
center 126.60565948486328 0 25.629791259765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4733576209593996 0.781416061049972 }
radiance 21
center 115.09397888183594 0 23.053478240966797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8369351579539324 0.41779738916737064 0.9621093710813975 }
radiance 28
center 105.28343200683594 0 19.63756561279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8145285704303233 0.4963698835559182 0.8401689365138754 }
radiance 22
center 106.53784942626953 0 23.219072341918945
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9298110444368554 0.31880470946614614 0.961266771237823 }
radiance 16
center 124.78968811035156 0 16.607398986816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9267144870499473 0.4202851416966735 0.9603286020748134 }
radiance 21
center 128.5482177734375 0 -2.579702138900757
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8027134257827322 0.3344741500945928 0.9066929195011222 }
radiance 23
center 111.71731567382812 0 26.58424186706543
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9536146224861932 0.4352055039612055 0.8091785280696071 }
radiance 23
center 130.19485473632812 0 14.275988578796387
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7107085382250327 0.3230108063045978 0.9 }
radiance 20
center 115.67414855957031 0 32.25139236450195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6197756863185174 0.46214139871431825 0.9 }
radiance 27
center 119.5292739868164 0 16.41668701171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8306310218510153 0.43024335904669797 0.9 }
radiance 16
center 109.94950103759766 0 9.408465385437012
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.46856779152025096 0.4410990826444904 0.9 }
radiance 18
center 115.3243408203125 0 14.499773025512695
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7351586966089154 0.39039117104807086 0.9 }
radiance 22
center 112.07404327392578 0 15.400727272033691
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.981054594574617 0.4868239271421261 0.9702721365961486 }
radiance 27
center 115.00570678710938 0 14.97322940826416
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9904682854606062 0.3950369838130398 0.9309413109593482 }
radiance 27
center 127.15538787841797 0 37.16707229614258
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9389996825220963 0.49942171315350237 0.8771428806414707 }
radiance 18
center 115.365478515625 0 13.33281135559082
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9653960340947598 0.326349520539777 0.835769889204148 }
radiance 22
center 116.84266662597656 0 44.972312927246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9678280646249784 0.38460977135311775 0.9818442179860984 }
radiance 26
center 93.48082733154297 0 23.870389938354492
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9841215361191837 0.46069817646778377 0.9259954869698369 }
radiance 16
center 108.64884948730469 0 24.147785186767578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4705489304153314 0.36878850421225373 0.9 }
radiance 16
center 123.50436401367188 0 28.757204055786133
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8576348105453437 0.41859183321777615 0.8930894861563132 }
radiance 21
center 109.87996673583984 0 50.31960678100586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.460972263468877 0.6347721605189339 }
radiance 26
center 123.21556854248047 0 58.45940017700195
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8267310625465625 0.3445284881950518 0.9 }
radiance 30
center 88.85172271728516 0 22.27630043029785
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8360018386540823 0.3638432620844937 0.8246015546271536 }
radiance 27
center 115.59523010253906 0 36.27146530151367
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6443650667482905 0.33936513806111895 0.9 }
radiance 23
center 97.49842071533203 0 54.79146194458008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8904067222150892 0.44910628837979505 0.9463753716586374 }
radiance 21
center 98.60012817382812 0 54.206703186035156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43758654858428736 0.36738085982502633 0.9 }
radiance 19
center 120.02862548828125 0 43.937355041503906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9657279106437878 0.354841206039112 0.8924235586510804 }
radiance 19
center 99.67852020263672 0 29.773521423339844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8133901392029553 0.3142893507846845 0.861281319552497 }
radiance 20
center 104.21070098876953 0 62.223079681396484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8116889406199197 0.4409392444435263 0.9192106495414228 }
radiance 17
center 113.45697784423828 0 56.24871826171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4638053916023601 0.8313902897587431 }
radiance 24
center 112.21524810791016 0 40.032955169677734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8164735566861422 0.46541141996380486 0.821513349909347 }
radiance 30
center 93.73640441894531 0 42.950828552246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.957489624051398 0.4087401340154163 0.9739338427134968 }
radiance 16
center 113.76118469238281 0 55.60403823852539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.864175666736862 0.463065132863414 0.8925655762371463 }
radiance 24
center 111.70382690429688 0 67.45386505126953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6280970367698785 0.39489370179099503 0.9 }
radiance 22
center 114.84339904785156 0 58.10263442993164
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9101641356908278 0.3754165069905579 0.8827779208966458 }
radiance 17
center 92.21238708496094 0 49.093658447265625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8543838032702245 0.3933798893864859 0.8096847003922024 }
radiance 24
center 95.49987030029297 0 59.666316986083984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8866574741527693 0.4848001781751802 0.9795416898189382 }
radiance 17
center 90.4930648803711 0 48.0430908203125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.45382468168412315 0.7319973158925149 }
radiance 28
center 79.22107696533203 0 67.65122985839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.480258571727753 0.4568079329936502 0.9 }
radiance 31
center 85.67915344238281 0 47.1113166809082
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44222213534630883 0.5242938148708415 }
radiance 24
center 101.51639556884766 0 69.0152816772461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9153859760505598 0.41658789562213866 0.8659237815359186 }
radiance 29
center 75.77654266357422 0 68.7745361328125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9795536839266876 0.3444391386949401 0.8375814763202742 }
radiance 22
center 106.2457504272461 0 76.44841003417969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.44763694344119076 0.5650009214242729 }
radiance 19
center 75.76055145263672 0 51.35844802856445
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8375559206615482 0.3159142798602228 0.9 }
radiance 22
center 80.46414947509766 0 49.47723388671875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8809125196565983 0.37272931454988767 0.987416958701334 }
radiance 22
center 100.70283508300781 0 70.86396026611328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8824788763953633 0.4286395977764703 0.8185784547677186 }
radiance 30
center 90.97154235839844 0 49.251976013183594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.846624023041932 0.49505170360953915 0.9748112646719759 }
radiance 28
center 88.54544067382812 0 79.06937408447266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8493869301350772 0.4681358943811491 0.9072054176257444 }
radiance 27
center 67.13758087158203 0 59.97850799560547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9657960536300374 0.4222261386365442 0.8373296180138706 }
radiance 25
center 93.28021240234375 0 75.9600830078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8310857343681042 0.429922537515466 0.8248459011642757 }
radiance 30
center 90.09529113769531 0 66.37055206298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8665694928626384 0.46646353576278443 0.9863250150014863 }
radiance 22
center 64.5623779296875 0 56.82181167602539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9870203281757453 0.4119111602277743 0.9890127372456926 }
radiance 28
center 98.22098541259766 0 61.25568771362305
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9802591119061542 0.3036431627966015 0.8305887229057767 }
radiance 22
center 91.67049407958984 0 88.86659240722656
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9831123845435037 0.3212654240240484 0.9486229223430296 }
radiance 19
center 69.80367279052734 0 75.93631744384766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8248490878196664 0.3867232465078986 0.9103061141929174 }
radiance 22
center 85.58600616455078 0 80.6661148071289
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9519092782430956 0.36637112420689744 0.8669143254648237 }
radiance 29
center 72.28419494628906 0 70.11283111572266
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.43925482454650533 0.3992821538205572 0.9 }
radiance 28
center 86.20012664794922 0 84.20693969726562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31874213153992803 0.6100372135357067 }
radiance 16
center 69.11612701416016 0 96.54141998291016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8378827320893377 0.4185050687398293 0.9582156994865973 }
radiance 19
center 80.72772216796875 0 77.51459503173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.861986392585749 0.4714605068256129 0.9928965182804714 }
radiance 18
center 73.9778823852539 0 66.2984848022461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9316146820251805 0.3284417207511488 0.9256176790510432 }
radiance 27
center 54.548851013183594 0 84.0633544921875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5951356289798798 0.4663923283880279 0.9 }
radiance 28
center 77.39987182617188 0 74.86295318603516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8201403926922154 0.3766949552242258 0.8687781790697424 }
radiance 21
center 55.58949279785156 0 80.73104858398438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7035245337536732 0.34500032756188453 0.9 }
radiance 30
center 83.21285247802734 0 94.58631134033203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.30477094711408015 0.6693607626583769 }
radiance 26
center 76.06717681884766 0 89.54129791259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8000123841637214 0.44453497315072465 0.8502417929409207 }
radiance 19
center 54.077308654785156 0 68.92232513427734
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8108287386697496 0.44411699036804575 0.919205296600848 }
radiance 23
center 83.97720336914062 0 66.08460998535156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8183676687990283 0.4289147066516141 0.8234116954770163 }
radiance 22
center 46.80711364746094 0 91.23346710205078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.99933541031354 0.3344195476915462 0.8433688056448156 }
radiance 27
center 49.168609619140625 0 83.06354522705078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9868465621459357 0.49363161532482647 0.893968261750699 }
radiance 22
center 46.130245208740234 0 102.18709564208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3373651550429285 0.4690471613571139 }
radiance 27
center 57.933074951171875 0 71.95061492919922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.802624309178707 0.44064343207424617 0.9847976752146514 }
radiance 26
center 46.18759536743164 0 71.78699493408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8280235677004253 0.3853239968124966 0.8553608894236648 }
radiance 24
center 47.9024772644043 0 74.27037811279297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9843273219023878 0.3322789959534987 0.9051696239634154 }
radiance 26
center 71.28685760498047 0 93.93794250488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9010747307297313 0.38607967827305284 0.827540418866717 }
radiance 23
center 58.00872039794922 0 75.72071075439453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8675634024725999 0.37714833843979134 0.9344489189101642 }
radiance 16
center 55.526344299316406 0 76.08301544189453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.34806229270945127 0.8230213461922008 }
radiance 23
center 67.78604125976562 0 79.394775390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4661200368186237 0.8061638034538045 }
radiance 16
center 53.22738265991211 0 90.75927734375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.36808944761993634 0.4374999739272505 }
radiance 23
center 59.42555618286133 0 101.36298370361328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8252419786835138 0.49184167534284473 0.9 }
radiance 24
center 51.63990783691406 0 84.4468765258789
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.40885967806458245 0.8643577757679148 }
radiance 21
center 35.30509567260742 0 82.11685180664062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8242145504686564 0.46035888580078155 0.9219918744636244 }
radiance 19
center 47.10015106201172 0 75.4082260131836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6900824577798017 0.44975819914532167 0.9 }
radiance 26
center 57.556251525878906 0 107.88150024414062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9129049065154927 0.320996576182308 0.8594076695802708 }
radiance 29
center 42.1738166809082 0 92.24943542480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8394676325394699 0.44050035121808573 0.9361848196761703 }
radiance 19
center 52.6281852722168 0 99.27176666259766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3866977297524543 0.84684622968705 }
radiance 16
center 41.14444351196289 0 107.27899932861328
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9496477322761635 0.46114004895508076 0.9593105015233501 }
radiance 31
center 55.08310317993164 0 102.65933990478516
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8186924917900479 0.34039434691199894 0.9 }
radiance 21
center 41.082664489746094 0 107.07292938232422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8072084967259483 0.4434155388120926 0.9810629834015614 }
radiance 16
center 51.79848861694336 0 107.66797637939453
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9723453136943283 0.3684788877307633 0.9757916547440157 }
radiance 24
center 40.912986755371094 0 110.91569519042969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8180317654962423 0.4737772681898552 0.9887019407562864 }
radiance 23
center 32.31462860107422 0 92.95423126220703
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8693345848326056 0.38522687190728855 0.8114654754731898 }
radiance 21
center 36.65188980102539 0 87.75860595703125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8283446791836278 0.4332065111385965 0.908469509934203 }
radiance 20
center 27.987632751464844 0 110.13628387451172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9467539486976098 0.4670803690590796 0.8853930190026623 }
radiance 23
center 39.106689453125 0 110.67510223388672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8628659708482544 0.4323924342068636 0.9260350288640546 }
radiance 23
center 50.72577667236328 0 100.66020202636719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8722328836760274 0.49601581549992346 0.9450509756466194 }
radiance 22
center 49.3460807800293 0 87.15242004394531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.39143154681537506 0.403261308271452 }
radiance 18
center 23.96763038635254 0 87.24555206298828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8077856575971857 0.3409895478549306 0.8846037445200936 }
radiance 22
center 10.91434097290039 0 81.72532653808594
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9885210709236915 0.32336534355080665 0.943986784136594 }
radiance 26
center 30.065439224243164 0 98.5218734741211
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8030180396588106 0.3768932626503957 0.8002266313027492 }
radiance 22
center 28.873165130615234 0 82.70591735839844
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.861814719625775 0.4280147349005598 0.9000701229602128 }
radiance 20
center 37.49702072143555 0 100.5413589477539
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8976860823349789 0.44001640629827177 0.9603682154758761 }
radiance 24
center 11.911948204040527 0 86.42070007324219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9077137844201969 0.3961513652042493 0.8072020493998738 }
radiance 24
center 14.044086456298828 0 97.47140502929688
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8768423190038662 0.36192320361690494 0.8844793889717966 }
radiance 19
center 15.650920867919922 0 101.79645538330078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8999929046175474 0.41300058129308015 0.8420423915957169 }
radiance 28
center 10.208929061889648 0 104.32788848876953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9067184988206507 0.3106890944321757 0.8566104957160449 }
radiance 30
center 20.300750732421875 0 88.29656219482422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.4887493308049642 0.31224464653550427 0.9 }
radiance 29
center 37.6226806640625 0 113.5154037475586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8836161293710794 0.46964571618377393 0.9780264274445903 }
radiance 29
center 22.93101692199707 0 85.52825164794922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9407365577759824 0.4509099331654516 0.8547534767477989 }
radiance 26
center 6.164772987365723 0 87.05720520019531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9399180400393385 0.3562463759750897 0.8896222380211823 }
radiance 30
center -0.755832850933075 0 88.28752136230469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7608160692418707 0.46830969090483426 0.9 }
radiance 28
center 21.696243286132812 0 110.07818603515625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9398793692472609 0.4082802068380741 0.8822795880880612 }
radiance 31
center 17.80961799621582 0 107.19900512695312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8002659535379523 0.39356986052306053 0.9815484388980507 }
radiance 26
center -5.611355781555176 0 89.25880432128906
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9037230601339696 0.3896498333863063 0.9596493455418212 }
radiance 22
center 9.787799835205078 0 82.13700866699219
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9622657086829189 0.46663778486271423 0.8224420316472242 }
radiance 16
center -3.3729681968688965 0 110.59547424316406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8567659577454692 0.46392496171533226 0.9 }
radiance 28
center -7.832450866699219 0 92.0416488647461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9603351486668688 0.35326506235821664 0.8172668135025829 }
radiance 26
center 9.43879222869873 0 106.68364715576172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8406423661031326 0.4196208635607738 0.8922932128874522 }
radiance 29
center 2.7044990062713623 0 99.49927520751953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9183057223002877 0.4906467528900317 0.9969364249560282 }
radiance 28
center -20.931901931762695 0 92.21919250488281
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8265938839121175 0.4253648572520641 0.8210752640339775 }
radiance 18
center 1.0179826021194458 0 103.74943542480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9734275262925255 0.3836847061710421 0.8554223128870461 }
radiance 26
center 3.2968218326568604 0 97.30754852294922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9074573476426666 0.42201187811467034 0.899845256638486 }
radiance 25
center 6.78381872177124 0 102.57756042480469
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.841731126383554 0.490077820835576 0.8809908199626155 }
radiance 25
center -19.385828018188477 0 83.80223846435547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7327741973563143 0.3121834350574189 0.9 }
radiance 21
center 5.231753349304199 0 98.0418930053711
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9131602478086587 0.39040441343680954 0.822117442595506 }
radiance 29
center 5.776889801025391 0 79.5744857788086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9850607850665671 0.4813800858242547 0.8814945076618774 }
radiance 23
center -7.052680969238281 0 110.421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9285793438393216 0.3623085797303965 0.9552836754328257 }
radiance 27
center 0.12051568180322647 0 103.84677124023438
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9818020588061125 0.35343120096778874 0.8887648595501333 }
radiance 23
center -27.611047744750977 0 77.77998352050781
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8040330320678601 0.4950423621016426 0.9 }
radiance 27
center -10.306416511535645 0 105.21394348144531
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.31634757054698776 0.8663981385413689 }
radiance 25
center -32.193058013916016 0 100.84326171875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.858301698136079 0.42677323285984825 0.8828600870453402 }
radiance 27
center -31.167179107666016 0 93.36012268066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4570413330153415 0.7424547767300732 }
radiance 23
center -34.272132873535156 0 101.47793579101562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9295817569864764 0.41215317251614003 0.8855635281245369 }
radiance 16
center -14.434864044189453 0 94.32410430908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5293091184069818 0.48370042136312663 0.9 }
radiance 21
center -21.74637222290039 0 78.3531494140625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9550874413582764 0.4682267449145703 0.9700593597495089 }
radiance 29
center -6.7764892578125 0 83.05261993408203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8448157252484596 0.3222739975094184 0.9976214667863778 }
radiance 18
center -26.733278274536133 0 97.60094451904297
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.903780896884485 0.45571193021988665 0.8595758919738326 }
radiance 29
center -29.816120147705078 0 98.74370574951172
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8420695968778471 0.39933097198601164 0.9432277580768152 }
radiance 28
center -30.52706527709961 0 68.7412109375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4566670006850394 0.768511398141337 }
radiance 25
center -46.534576416015625 0 87.88015747070312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8656798188526351 0.3690666686958203 0.9 }
radiance 16
center -33.42803955078125 0 73.5817642211914
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9161648196003928 0.4170469577303002 0.937636153000633 }
radiance 29
center -47.430816650390625 0 73.06352233886719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.808101825454901 0.3125940006715505 0.8893286328507133 }
radiance 26
center -35.05948257446289 0 90.3343505859375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8831690563713406 0.42572135049463256 0.9619512160917785 }
radiance 24
center -48.89350509643555 0 85.99999237060547
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9216539742560319 0.39356776434240537 0.9519900594219293 }
radiance 27
center -38.19771194458008 0 98.81832885742188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8562682073625826 0.36797379493493365 0.8559180085070215 }
radiance 28
center -49.044776916503906 0 79.43502807617188
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.7591800288826877 0.3498100614044115 0.9 }
radiance 21
center -35.29502487182617 0 75.36060333251953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8250637165947865 0.3837806078552088 0.9047696578229896 }
radiance 30
center -45.914695739746094 0 94.39824676513672
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8960208690924822 0.3839483419093358 0.8448291966807056 }
radiance 16
center -42.380455017089844 0 76.34854888916016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6763714701228521 0.3474288858691244 0.9 }
radiance 18
center -54.90557098388672 0 70.11782836914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.372114456660383 0.7770123650009194 }
radiance 21
center -32.358360290527344 0 87.18611907958984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8348925137018612 0.4567765000801065 0.9138098887267 }
radiance 24
center -57.61723327636719 0 65.97767639160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6344246654292413 0.45001449427645235 0.9 }
radiance 26
center -48.021644592285156 0 89.35232543945312
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9965114637846695 0.42306143136004637 0.8608648620451472 }
radiance 16
center -38.02463150024414 0 70.37493133544922
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9759029982028824 0.35713773846952385 0.8570281538083798 }
radiance 27
center -59.177490234375 0 76.7906723022461
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4685445393511478 0.5729505337461822 }
radiance 17
center -34.73255920410156 0 86.11214447021484
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8786786138205871 0.44090575013673616 0.86375687286615 }
radiance 30
center -60.50919723510742 0 79.56961822509766
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.85728901038454 0.48805082686442514 0.9330498207859107 }
radiance 27
center -51.8412971496582 0 73.94476318359375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9797743010055915 0.36283190499427687 0.925252217921715 }
radiance 22
center -60.57550048828125 0 51.751609802246094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717787050827619 0.3469141360635272 0.9677845466604211 }
radiance 21
center -54.158836364746094 0 72.17251586914062
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33916610249114293 0.8010583367239028 }
radiance 18
center -63.31443786621094 0 77.69196319580078
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8623682706354345 0.3260540695129586 0.9781921542953735 }
radiance 30
center -48.24520492553711 0 55.29951858520508
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.5461852502424743 0.37895773727810184 0.9 }
radiance 28
center -55.825828552246094 0 79.86653137207031
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8439760179258574 0.3703210159893191 0.9 }
radiance 28
center -61.60926818847656 0 78.84095764160156
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8251158330768142 0.38169075106155925 0.9200011300281018 }
radiance 21
center -64.73453521728516 0 59.257789611816406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9029369802875858 0.33362121274930673 0.9859697721997946 }
radiance 26
center -69.33723449707031 0 55.23867416381836
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8746312583260066 0.48867722096247007 0.9 }
radiance 18
center -48.79935836791992 0 77.96914672851562
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8629945884105845 0.4627466803855338 0.8986339336918231 }
radiance 18
center -64.29684448242188 0 65.93119812011719
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.4577244282298112 0.7756593729124371 }
radiance 27
center -58.519962310791016 0 46.572731018066406
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9248976278137544 0.45760070320612634 0.9922578351117641 }
radiance 17
center -59.33988952636719 0 50.8984375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.6598816219721094 0.4764767845655202 0.9 }
radiance 24
center -51.083683013916016 0 59.552303314208984
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8340470546329739 0.4529078182313541 0.8557272751211378 }
radiance 20
center -63.22344207763672 0 66.77045440673828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.33072522834450335 0.48619146825261206 }
radiance 17
center -69.39551544189453 0 52.456905364990234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3797803854427798 0.6527695478094666 }
radiance 30
center -69.08906555175781 0 56.78351593017578
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8492865709799977 0.46926294863644136 0.9902498772512109 }
radiance 31
center -76.53980255126953 0 56.722625732421875
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8717182587421366 0.3237888603027173 0.8688372531299275 }
radiance 18
center -75.80723571777344 0 58.342803955078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9729901671432764 0.4911123180159306 0.8848371914023011 }
radiance 22
center -74.30968475341797 0 64.17566680908203
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.833628307181408 0.3892898428463445 0.9341384321843962 }
radiance 21
center -58.819515228271484 0 57.080020904541016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8265688195735623 0.32324553936557926 0.8160121250509639 }
radiance 31
center -79.1868896484375 0 27.74138641357422
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9871436193573198 0.3016442870033213 0.9751014281416233 }
radiance 31
center -74.46359252929688 0 43.9238395690918
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9004564314973218 0.42280951154754753 0.9065481271728971 }
radiance 29
center -76.70423126220703 0 51.74751663208008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9811621888841451 0.4843452587645058 0.9195911549418756 }
radiance 23
center -66.85844421386719 0 49.7545166015625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8139881873983428 0.46313293862721844 0.8609101549483772 }
radiance 26
center -76.98174285888672 0 38.67811965942383
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8134701870859001 0.3780121550053819 0.8976213235220828 }
radiance 29
center -72.63253784179688 0 55.613975524902344
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8927811393749835 0.3778557491483964 0.8580051395054694 }
radiance 31
center -61.5501823425293 0 46.829681396484375
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9045595500352117 0.39866187122658836 0.9250511008387445 }
radiance 25
center -72.66045379638672 0 41.844879150390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3738973533446206 0.7071164282074863 }
radiance 28
center -67.80394744873047 0 39.01286315917969
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8872868805248838 0.30303497127762596 0.8220102406789349 }
radiance 23
center -59.599063873291016 0 51.063350677490234
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.555269677405351 0.389623497581823 0.9 }
radiance 30
center -62.38911437988281 0 41.792137145996094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.985829966604213 0.4508890633480677 0.8742499933087247 }
radiance 25
center -86.80807495117188 0 16.680694580078125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8349394388727166 0.4207927586767226 0.9755868571934526 }
radiance 21
center -75.54742431640625 0 23.18286895751953
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.607991487248105 0.4008842921304996 0.9 }
radiance 25
center -89.93280792236328 0 27.381744384765625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9345845516096065 0.330724376924913 0.8255189387149358 }
radiance 24
center -70.63367462158203 0 21.01780128479004
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.961435573214707 0.422784017410885 0.9558134075390027 }
radiance 17
center -69.66752624511719 0 38.76008987426758
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.867666676811814 0.4656824135340337 0.8706829934493584 }
radiance 26
center -68.74275970458984 0 43.28023147583008
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.845308163957819 0.48976735821862477 0.9 }
radiance 29
center -73.95342254638672 0 32.33881378173828
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8195272146856948 0.3429635600403835 0.9322142732430079 }
radiance 18
center -70.47071075439453 0 36.23826599121094
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9806423666931812 0.3599962368149849 0.9691386806201321 }
radiance 26
center -62.32506561279297 0 37.980255126953125
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9672247680914696 0.3075516866674191 0.8472402835314949 }
radiance 29
center -71.31999206542969 0 15.456781387329102
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9745930154861512 0.39704454509425324 0.8934982579255203 }
radiance 24
center -72.89867401123047 0 29.553234100341797
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9489189780056404 0.45248121764846216 0.9728934557260337 }
radiance 23
center -81.61308288574219 0 4.195152759552002
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9431253711232372 0.30102070922880125 0.8172278683931742 }
radiance 18
center -92.18800354003906 0 26.548526763916016
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9 0.3559511830925869 0.4739469979648455 }
radiance 23
center -80.156982421875 0 2.1647634506225586
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8407482966812563 0.33689217854393033 0.9326057361242804 }
radiance 19
center -77.7772445678711 0 17.06936264038086
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9188906813598555 0.4270802381030202 0.8567581953430048 }
radiance 28
center -64.93241882324219 0 5.285120010375977
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8644170155730622 0.3781933267692909 0.9499796289414917 }
radiance 30
center -74.14433288574219 0 9.108824729919434
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8589203592065595 0.3309319760200759 0.955270765417369 }
radiance 31
center -90.06092834472656 0 25.93864631652832
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9396018865266882 0.48138956545578226 0.8138735973521232 }
radiance 16
center -74.01240539550781 0 2.0786285400390625
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9552278658716056 0.4742389277624133 0.9784449267550346 }
radiance 26
center -67.93218994140625 0 9.135350227355957
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8151598427558256 0.3303787432966894 0.9 }
radiance 22
center -81.42318725585938 0 -0.7283221483230591
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.973374448265294 0.35423810936151257 0.9581429369364981 }
radiance 31
center -70.14740753173828 0 6.705520153045654
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.868399530792338 0.4222132879117809 0.9023442924196603 }
radiance 22
center -72.54376220703125 0 -9.57893180847168
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9504021759664432 0.42102378655199146 0.9205420917148497 }
radiance 22
center -89.54102325439453 0 2.1560187339782715
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8518809835876068 0.43206799155877973 0.9376336006034252 }
radiance 18
center -91.57318115234375 0 -1.7025972604751587
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8507055614122712 0.4911932715988522 0.9047126131413453 }
radiance 16
center -79.99574279785156 0 6.6194586753845215
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9110902907663478 0.3478191901700532 0.8605684130534179 }
radiance 16
center -72.68093872070312 0 9.728344917297363
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.9469253485175604 0.33570234924306874 0.8446698854003256 }
radiance 21
center -77.95222473144531 0 -7.115912914276123
radius 1
samples 1
}

light {
type spherical
color { "sRGB nonlinear" 0.8363585000687708 0.40007340077523534 0.8684131150457544 }
radiance 19
center -91.66010284423828 0 11.685158729553223
radius 1
samples 1
}
