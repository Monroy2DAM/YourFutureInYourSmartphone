package com.erasmusplus.practica.json_handlers;

import java.util.List;

/**
 * Personas.
 */
public class Handler_Personas {
    /**
     * yf_CONTACTPERSON : [{"ID":"19","EMAIL":"orlandosol@gmail.com","NAME":"Orlando","LASTNAME":"Sol","CONFIRMEMAIL":"1","CONFIRMEMAILINST":"1","AREA":"1","PASSWORD":"$2y$10$ZCa2a4CXP4pKpLvskZGh1.kQqQ1xOFSFXpkbGHu3GxpNLS2zNCcfy","IDINST":"15"},{"ID":"20","EMAIL":"","NAME":"","LASTNAME":"","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$5dza3LLV5ZrO/HpBapZQGecscJoC4C20257euZk9slvGamUshhohW","IDINST":"16"},{"ID":"21","EMAIL":"angmatalv@gmail.com","NAME":"Angel","LASTNAME":"Mate Alvarez","CONFIRMEMAIL":"1","CONFIRMEMAILINST":"1","AREA":"4","PASSWORD":"$2y$10$nnhV9CLTdQJd6tv9jbVPP.IWXWJGc4IDwGjgyRq6etFFvETONyLti","IDINST":"17"},{"ID":"22","EMAIL":"ggg","NAME":"ggg","LASTNAME":"ggg","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$tbD9VXzDDViLMxxLANyIuuZQyc8bvvAxDCN3otTX5RxRU1s9ABh0i","IDINST":"54"},{"ID":"23","EMAIL":"leon@leon ","NAME":"joss","LASTNAME":"leon","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$N2gZrKCEGO44zHpdGeA5/.FJj/UDdtJBUc8z6Wt2s0aVvCK35TIYa","IDINST":"55"},{"ID":"24","EMAIL":"escri@escri.es","NAME":"loli","LASTNAME":"escribano","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"3","PASSWORD":"$2y$10$praiG4v/XLfo9z.HMF.H4uOi4OE8hbnxcQWhSnXMLap/O84RLlmMy","IDINST":"56"},{"ID":"25","EMAIL":"dolo@dolo.es","NAME":"dolores","LASTNAME":"escribano","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$jZp07emtN5uNyB5ReLBtu.qOTNyChE2suxOALXaJt9vs1buRFP7DC","IDINST":"57"},{"ID":"26","EMAIL":"uuuu","NAME":"uuuuuuu","LASTNAME":"uuuuuu","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$jjgPUjQto0xDPv85pA8glOAng6eYESl/gPwgFgEvj4OEhYhPq4Mma","IDINST":"58"},{"ID":"27","EMAIL":"dddddddfffff","NAME":"ddddd","LASTNAME":"ddddd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$ihTPZeJt6aIZo3/BtNowc.C9qZ8S2CqU118PFMOTVv0iy3UCFR5h2","IDINST":"59"},{"ID":"28","EMAIL":"dddddddfffff","NAME":"ddddd","LASTNAME":"ddddd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$9nM7NgxQUt42XJBpbnN6MetKh0KcoQY4o7hl97CRhhSaElLnOmMAy","IDINST":"59"},{"ID":"29","EMAIL":"dddddddfffff","NAME":"ddddd","LASTNAME":"ddddd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$K/rhnZI/yUNtfEq0NiWVzul3YafQSCto9NA4NT5VqAH0dSutSm0Uy","IDINST":"59"},{"ID":"30","EMAIL":"dddddddfffff","NAME":"ddddd","LASTNAME":"ddddd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$wPC7VIOV18UhZoisNT38B.WEVIolYV17En4ByU91gA2UzIcRVxx9S","IDINST":"59"},{"ID":"31","EMAIL":"angel@albero.es","NAME":"Angel","LASTNAME":"Albero","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$79QOM9fJiPcWKs6QTHIxbeE2YGZY9R5Xu6SRMuSlb7DCEoE5ejFgW","IDINST":"63"},{"ID":"32","EMAIL":"email1@email.com","NAME":"nombre1","LASTNAME":"apellido1","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$ayad5xrEraZwJ5BnukELTeVcwSuEKnUXk7iI.Cf2cnjdedkl.siE.","IDINST":"64"},{"ID":"33","EMAIL":"email1@email.com","NAME":"nombre1","LASTNAME":"apellido1","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$GgyClHPfuIhXnT.b3F.vWepXUM//RwR6qfhRjnMOTV6F8er7dFTHq","IDINST":"64"},{"ID":"34","EMAIL":"mmm","NAME":"mmm","LASTNAME":"mmm","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$GODeGVfviegwpdm855IFluqD5L9GOT8SuKliU0EWHmSXFmNZRZ5Ui","IDINST":"66"},{"ID":"35","EMAIL":"email2","NAME":"nombre2","LASTNAME":"apellido2","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$Ln108i4qzvUQQTXnnMLA7uf.viP2um/6XFb8tCQg0ytdvNc5IFhQm","IDINST":"67"},{"ID":"36","EMAIL":"tuyo@tuyo.es","NAME":"yo","LASTNAME":"mio","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$FLYWTxxUPwHGuLtg4/ywouR0.ncejIRkQU6Mx09W7NUTV814f21nq","IDINST":"68"},{"ID":"37","EMAIL":"matelab@gmail.com","NAME":"AngelLab","LASTNAME":"MateLab","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$WfSX9D2xuqW9XmX4397zTeopSFZjBJ7Y4znZu7pcXlbpewry3RbCS","IDINST":"69"},{"ID":"38","EMAIL":"eeee","NAME":"www","LASTNAME":"www","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$TDqyNkbcQJOhsdRBTK2AJ.wvCLzI1vC7bq3ITt3zZai34hDs8WWrS","IDINST":"70"},{"ID":"39","EMAIL":"experimento@mate.es","NAME":"AngelExperimento","LASTNAME":"MateExperimento","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$SviEHvmpKerNDML8zt2rzultTjOb7RHxDrYROioyfpiUXz7DOVvBm","IDINST":"71"},{"ID":"40","EMAIL":"iii","NAME":"iii","LASTNAME":"iii","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$PD4F63tqAdj7r3sams/u2eQmlVPij1aW0NhC8jtzRjUNstZg4nQLW","IDINST":"72"},{"ID":"41","EMAIL":"gmail@gmail.clm","NAME":"angel","LASTNAME":"mate","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"5","PASSWORD":"$2y$10$0LGkivv4j4Lnz61qPkBKweSdMXizK8tbSPPnoAhrG0AZEJeoYdKFi","IDINST":"73"},{"ID":"42","EMAIL":"rr","NAME":"rrrr","LASTNAME":"rrrr","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$kpu1zYofsLnscHDL6qSPb.gH87a4V92/Ziz820WJrFC.Hrz4D83Ei","IDINST":"74"},{"ID":"43","EMAIL":"zz","NAME":"zz","LASTNAME":"zz","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$KTHdhSubUmd21jwlb.qOzuAVYrfi5pCHm3jlK/a3hC4GuchJfxVFq","IDINST":"75"},{"ID":"44","EMAIL":"leojo@gmail.com","NAME":"Josue","LASTNAME":"Leon","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$HoFxzD./wN0kDFJBPqgZaey8cnznmfj3lcUe0pSdwwFlXlaSqt8y6","IDINST":"76"},{"ID":"45","EMAIL":"lek","NAME":"jok","LASTNAME":"lek","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$GWiuFDbBsw51KN7bZpdKXefsWieSSZ8OJ6HnwMBeRd5cjr2W84zt2","IDINST":"77"},{"ID":"46","EMAIL":"ebema1989@gmail.com","NAME":"eli","LASTNAME":"b","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"2","PASSWORD":"$2y$10$s0uGQvBhL/DeDOcTkxWUMuaJLoXN3U.YT5SodBKSI9J5aSaGMK9O.","IDINST":"78"},{"ID":"47","EMAIL":"mata@gmail.com","NAME":"mata","LASTNAME":"mata","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$ELCHbLy.iQ2wz4oCSJkaquC.GPU9WynKF9kDP4BvJdWUtW/9Pr9wK","IDINST":"80"},{"ID":"48","EMAIL":"mata@gmail.com","NAME":"mata","LASTNAME":"mata","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$WzXrnXR7oKJE4Ix2fYVxueUvv5AwkU7E6xJXi7HdPVyISinni1cY2","IDINST":"80"},{"ID":"49","EMAIL":"mata@gmail.com","NAME":"mata","LASTNAME":"mata","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$qMUjz0hLsgnMPa8DkOd2xeF/7sL.lN7v5mPi5zemjvWAvArXwMACO","IDINST":"85"},{"ID":"50","EMAIL":"a@gmail.com","NAME":"a","LASTNAME":"a","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$UlGxmDogF7y.4yWVGzFqlOZ9p8dugJMIW7FL3TzNkFJzTX6395LEu","IDINST":"85"},{"ID":"51","EMAIL":"m","NAME":"m","LASTNAME":"m","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$ja5NvRxpycLeVRZJ7XO10eT3mN8ppduI8gIl16imPbJ3LNQBJBDjK","IDINST":"88"},{"ID":"52","EMAIL":"m","NAME":"m","LASTNAME":"m","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$DTEfE9k/ftbrVbdN9nErauoInYx7gLOFhCojGX9SA268TFl9Wd4qq","IDINST":"88"},{"ID":"53","EMAIL":"jossezeq@gmail.com","NAME":"Josue","LASTNAME":"Leon","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$/H5PQvvCkLafdp5u9jTpI./O2IP0yjYGWAWZObCAK6mKLUp0szkRS","IDINST":"91"},{"ID":"54","EMAIL":"1@1.com","NAME":"1","LASTNAME":"1","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$E6m3IZI2BD2jt6kWtSf3tOYrtvrAqG6CkqjioFEEkED/o9yKHKtty","IDINST":"92"},{"ID":"55","EMAIL":"pepito@gg.com","NAME":"pepito","LASTNAME":"de los robles","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$VjAsjXEjVixgQu5h/7Ac6eJQ0FnN2a64d.sFsmi4MgWR/e1jFz22a","IDINST":"98"},{"ID":"56","EMAIL":"blabla@gmail.com","NAME":"bla","LASTNAME":"bla","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$iaujz9GJz1w7Mx8qCRZOGu1vBKgaCbbuteM9QPANNa0Vg/8d2zyqC","IDINST":"99"},{"ID":"57","EMAIL":"2@2.com","NAME":"2","LASTNAME":"2","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$hOuP4QUd9ttnxuyvc9xqz.7H4092a/AtSxWSUPUPRuYOy/NMoTWN.","IDINST":"101"},{"ID":"58","EMAIL":"juansanchez@gmail.com","NAME":"juan","LASTNAME":"sanchez","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$Zo4M.FIh7QQmArZ5hLDw2uf3Gf6pyGJTnFB8kaSrFMDBvCmDp.eki","IDINST":"103"},{"ID":"59","EMAIL":"3","NAME":"3","LASTNAME":"3","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$qA3U19sZn/p8MVbLiFUNr.TAf/tGGFljA0s7U25rEtFzMQy1aoa/a","IDINST":"108"},{"ID":"60","EMAIL":"ebema198914@gmail.com","NAME":"eli","LASTNAME":"benitez","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$02PKbyZap7NyN4hD2/YmtulieKw0ledkv54YsxHb6hOiD0/wTLMXm","IDINST":"109"},{"ID":"61","EMAIL":"srk@hotmail.com","NAME":"juan","LASTNAME":"sanche","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$r2F3P./z5gK3N2BkvbvS0.z3RE4ul38hSYmkGuOkY8z4ya6Uicnsm","IDINST":"110"},{"ID":"62","EMAIL":"srk@gmail.com","NAME":"hshshd","LASTNAME":"bdbdbd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$3cPSA/LltPxL2BOtRKAyfOXlK3LiYtn53U5bG.Sk1dVKgPgdiz3KG","IDINST":"111"},{"ID":"63","EMAIL":"srk@gmail.com","NAME":"hshshd","LASTNAME":"bdbdbd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$S9dS9WAzEfMd0Mh2sDxl9eMTV8AYlUylMSqaGd2Ex1zqlZXxq8JwO","IDINST":"111"},{"ID":"64","EMAIL":"juan.jose@gmail.com","NAME":"hshshd","LASTNAME":"bdbdbd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$tDI08DDXBElsj4fzPfWDZeRzARc/wXTb8yxUprKoLKn4IcAMzPJwW","IDINST":"111"},{"ID":"65","EMAIL":"cr@cr.com","NAME":"cristian","LASTNAME":"cristian","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$wxtt6N0Xj0NGnTnT1WTeVOtGat98YLegUaQeJUSMcLGScNImnQ4Ru","IDINST":"114"},{"ID":"66","EMAIL":"paco@paco.net","NAME":"paco","LASTNAME":"paco","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"5","PASSWORD":"$2y$10$mm6dVgXA1TLtDZoYuaIgneX.ZHX8gWQjI2/7xfJqgjSKdXrp2m4CC","IDINST":"115"},{"ID":"67","EMAIL":"ebema198914@gmail.com","NAME":"hh","LASTNAME":"hh","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"5","PASSWORD":"$2y$10$WNmXAYrsZKFrgxqBvX2RAuy/bMBG.sQT.zMqHOZCn0hC4vXnKqH0i","IDINST":"116"},{"ID":"68","EMAIL":"mata@mata.net","NAME":"mata","LASTNAME":"mata","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$FvIymxrp9azpcFL6mQVnTuw71aoo32njiJY81YHacdOaN7ubqRr5S","IDINST":"117"},{"ID":"69","EMAIL":"iescristobaldemonroy.net","NAME":"paco","LASTNAME":"paco","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$LEwR6CeNuvtluioGPnG/quD2SITsyVK2BQ4oky0t1myJzjqLPofg2","IDINST":"118"},{"ID":"70","EMAIL":"francisco.marquez@iescristobaldemonroy.net","NAME":"paco2","LASTNAME":"paci2","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$UKdjsDAOFN8m6YJYhnfYwu6vTLizkeBV7.XhO1L7s6U6apx/DRe22","IDINST":"118"},{"ID":"71","EMAIL":"kerosenodev@hi2.in","NAME":"Keroseno","LASTNAME":"Dev","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$Vpr/QzzvvrcInCjNZtjHEuHBjgC/75ZkAWInc5TjntpJynOh/7rGC","IDINST":"120"},{"ID":"72","EMAIL":"jdvsjhs","NAME":"jdbdbd","LASTNAME":"jskdk","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$bMZBou8y5.2wPJxobIp3vuKSXmMrIqQQJB2pNbh9eYn9UkW3gQw4S","IDINST":"168"},{"ID":"73","EMAIL":"jdvsjhs","NAME":"jdbdbd","LASTNAME":"jskdk","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$DuLwZ98mx2OY8I2ztN2EyuTiK6ZrzFuXhkkmOG3Cs17Ne2yPTDoku","IDINST":"168"},{"ID":"74","EMAIL":"juanAfganistan@gmail.com","NAME":"Juan","LASTNAME":"Sanchez","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"3","PASSWORD":"$2y$10$/ISMu6cTf9RunNVPCz6vBeGypdzoxqzpaNfREX2qakiBnP5WgKiCm","IDINST":"170"},{"ID":"75","EMAIL":"bdbdbd","NAME":"bdbdbd","LASTNAME":"bdhdhd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$ZJ6CWnRBvPuYDVmZGRzhv.yb0OkICQIerGefEgtnnCCe2g4dC0aAW","IDINST":"97"},{"ID":"76","EMAIL":"afganoMail@mail.com","NAME":"juan","LASTNAME":"sanche","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"3","PASSWORD":"$2y$10$0vv11gmyOZ.cOPIgOOHje.fkCb9NZ/3hDdWMyXlt2Fw2Rbi5vJA8S","IDINST":"172"},{"ID":"77","EMAIL":"elAfgano@gmail.prg","NAME":"juan","LASTNAME":"afgano","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$3EFwFjzx5Rn9UVTofFjC6eVeYRZt8/vSyHvavrYh89WNPtS17hN0.","IDINST":"174"},{"ID":"78","EMAIL":"","NAME":"","LASTNAME":"","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$rGpG/VCtkIFgFw7uFF3LyuLH2H2uvAWuOz9RADDRevFnFBdfRw3tu","IDINST":"16"},{"ID":"79","EMAIL":"reymisterio","NAME":"rey","LASTNAME":"misterio","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$t7QKtGFt7aLhN4GcoJPr7O/Xd34EX2t2lNlAoYfwJyr/R6k8UBNAi","IDINST":"183"},{"ID":"80","EMAIL":"hdhd","NAME":"fran","LASTNAME":"hdjdjd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$hbeSkx6CtsyqTZamz3ID2O/kRgd1s2MdWzCTTCbUqUbVgxiLwm5DK","IDINST":"184"},{"ID":"81","EMAIL":"aa","NAME":"aa","LASTNAME":"aa","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$sgDC1iGzzSP0zzKan323.euGJhWZbH51zEl4D6r29Rx/vTizXdEQ.","IDINST":"185"},{"ID":"82","EMAIL":"aa","NAME":"aa","LASTNAME":"aa","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$o0QSS8wTwSvgEMiQMmT1butc7jh0hr1dcZXIagEqJ2UWBylxBybFO","IDINST":"185"},{"ID":"83","EMAIL":"a","NAME":"a","LASTNAME":"aa","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$fTE0xQMTmd.IbOw5BddzD.tUWcpu8nTCUICg4LMmyT5e/et.WZapi","IDINST":"176"},{"ID":"84","EMAIL":"gg","NAME":"gg","LASTNAME":"gg","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$n8MYk8hqPypYlubc55wDcOZGVigBhB8Obo99461ZUEKVSF5n54Ysm","IDINST":"193"},{"ID":"85","EMAIL":"gg","NAME":"gg","LASTNAME":"gg","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$zeaBuutA87Edm7kcEgI2.uXgqOR1nW5gBLiSHO3hqaQjCq1m5LWHG","IDINST":"193"},{"ID":"86","EMAIL":"ltkokosmash@gmail.com","NAME":"Juan José","LASTNAME":"Sánchez","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$7X.odt2G/MPiG3zKLVY.juWWF2r9ttq9juXoAxPTgM3yZnz.o8rzm","IDINST":"195"},{"ID":"87","EMAIL":"gg","NAME":"gg","LASTNAME":"gg","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$4PhvTkPhmo4IVi2iZt10VOgsi50jlMEF2YdbvLafzSHGhIugmPY9O","IDINST":"193"},{"ID":"88","EMAIL":"test","NAME":"test","LASTNAME":"test","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$5BY2wkMqHjhToegan/jtiOhnj.4SgtYI38SC1wHD6u7jY2TOJcZlW","IDINST":"197"},{"ID":"89","EMAIL":"test1","NAME":"test1","LASTNAME":"test1","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$ZQjo35ZQkJy/gjDvxzEdi.KGnkwoMM5nmT22gTVs5qVLIe5jUK3ES","IDINST":"200"},{"ID":"90","EMAIL":"ltkokosmash@gmail.com","NAME":"juan","LASTNAME":"Sánchez","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"4","PASSWORD":"$2y$10$3D64GsJsDoGIAuh2gzMWS.t4qvVeXo.82Nb8Zm6Yd4O7m6Boyq8eW","IDINST":"206"},{"ID":"91","EMAIL":"test6","NAME":"test6","LASTNAME":"test6","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$y9dL1u8Jjtoi0LgC2hDrk.r4duCq/Oc4KkxVNMJa5T2RJyemnhcAe","IDINST":"207"},{"ID":"92","EMAIL":"alex","NAME":"alex","LASTNAME":"alex","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$gIALVgQ3v08XFbIwBBYpbO6JjFiSSv64DewF7HX/KSr1ZdZtm3S/2","IDINST":"208"},{"ID":"93","EMAIL":"ismael.nunez@iescristobaldemonroy.net","NAME":"Ismaa","LASTNAME":"Ndndd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$PXgJLyIp.vfv/oLkoO8nquhA9Jk1vecZ3eViFYE8q2GNZBn1VAoHS","IDINST":"209"},{"ID":"94","EMAIL":"fran","NAME":"bfkxk","LASTNAME":"hdkfjd","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$Lv91zaO6SVkI6MgDAqNEHOPaOgPUFafFJtXwieJTcBaS6A4ix9kOe","IDINST":"210"},{"ID":"95","EMAIL":"a","NAME":"a","LASTNAME":"a","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$ZYCmgd0mVGTb6An4glVMauY/EtGz2eqohcXBnzh36cmjHMnNI5OKC","IDINST":"178"},{"ID":"96","EMAIL":"email","NAME":"email","LASTNAME":"email","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$WfUmFYMkBaGmGkVsotr.B.FEOMn8DjAgtWq3Pv1rcnZskiQEAAJ8O","IDINST":"212"},{"ID":"97","EMAIL":"a","NAME":"a","LASTNAME":"a","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$.AM2p0d.4uRhyrq.41e.xeeakPA9qVnfZBkTAnRCTCLBbQPED.YVy","IDINST":"178"},{"ID":"98","EMAIL":"a","NAME":"a","LASTNAME":"a","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$Ox/t.Ks7T2u8IXzq/vL2ROZiF4FoyHmfD/tBurhTX/F8N9qSfh//y","IDINST":"178"},{"ID":"99","EMAIL":"email","NAME":"aa","LASTNAME":"aa","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"0","PASSWORD":"$2y$10$uUH6JciguNgieaB1B3xdM.RxOvoH83TxsXfUsuARqhJp0Va.NdRJq","IDINST":"176"},{"ID":"100","EMAIL":"fuyi","NAME":"fuyi","LASTNAME":"fjj","CONFIRMEMAIL":"0","CONFIRMEMAILINST":"0","AREA":"1","PASSWORD":"$2y$10$7wYTFCIUQ4zk2vYtMVy59uGbiYKNsWPMx317ZNLMHAgIM4mX3J7nW","IDINST":"216"}]
     * success : 1
     */

    private int success;
    private List<YfCONTACTPERSONBean> yf_CONTACTPERSON;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<YfCONTACTPERSONBean> getYf_CONTACTPERSON() {
        return yf_CONTACTPERSON;
    }

    public void setYf_CONTACTPERSON(List<YfCONTACTPERSONBean> yf_CONTACTPERSON) {
        this.yf_CONTACTPERSON = yf_CONTACTPERSON;
    }

    public static class YfCONTACTPERSONBean {
        /**
         * ID : 19
         * EMAIL : orlandosol@gmail.com
         * NAME : Orlando
         * LASTNAME : Sol
         * CONFIRMEMAIL : 1
         * CONFIRMEMAILINST : 1
         * AREA : 1
         * PASSWORD : $2y$10$ZCa2a4CXP4pKpLvskZGh1.kQqQ1xOFSFXpkbGHu3GxpNLS2zNCcfy
         * IDINST : 15
         */

        private String ID;
        private String EMAIL;
        private String NAME;
        private String LASTNAME;
        private String CONFIRMEMAIL;
        private String CONFIRMEMAILINST;
        private String AREA;
        private String PASSWORD;
        private String IDINST;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEMAIL() {
            return EMAIL;
        }

        public void setEMAIL(String EMAIL) {
            this.EMAIL = EMAIL;
        }

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }

        public String getLASTNAME() {
            return LASTNAME;
        }

        public void setLASTNAME(String LASTNAME) {
            this.LASTNAME = LASTNAME;
        }

        public String getCONFIRMEMAIL() {
            return CONFIRMEMAIL;
        }

        public void setCONFIRMEMAIL(String CONFIRMEMAIL) {
            this.CONFIRMEMAIL = CONFIRMEMAIL;
        }

        public String getCONFIRMEMAILINST() {
            return CONFIRMEMAILINST;
        }

        public void setCONFIRMEMAILINST(String CONFIRMEMAILINST) {
            this.CONFIRMEMAILINST = CONFIRMEMAILINST;
        }

        public String getAREA() {
            return AREA;
        }

        public void setAREA(String AREA) {
            this.AREA = AREA;
        }

        public String getPASSWORD() {
            return PASSWORD;
        }

        public void setPASSWORD(String PASSWORD) {
            this.PASSWORD = PASSWORD;
        }

        public String getIDINST() {
            return IDINST;
        }

        public void setIDINST(String IDINST) {
            this.IDINST = IDINST;
        }
    }
}