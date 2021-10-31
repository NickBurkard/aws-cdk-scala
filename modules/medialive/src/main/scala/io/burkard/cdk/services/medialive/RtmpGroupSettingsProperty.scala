package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RtmpGroupSettingsProperty {

  def apply(
    cacheFullBehavior: Option[String] = None,
    adMarkers: Option[List[String]] = None,
    captionData: Option[String] = None,
    inputLossAction: Option[String] = None,
    authenticationScheme: Option[String] = None,
    cacheLength: Option[Number] = None,
    restartDelay: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.RtmpGroupSettingsProperty.Builder)
      .cacheFullBehavior(cacheFullBehavior.orNull)
      .adMarkers(adMarkers.map(_.asJava).orNull)
      .captionData(captionData.orNull)
      .inputLossAction(inputLossAction.orNull)
      .authenticationScheme(authenticationScheme.orNull)
      .cacheLength(cacheLength.orNull)
      .restartDelay(restartDelay.orNull)
      .build()
}
