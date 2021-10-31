package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AutomaticInputFailoverSettingsProperty {

  def apply(
    failoverConditions: Option[List[_]] = None,
    secondaryInputId: Option[String] = None,
    inputPreference: Option[String] = None,
    errorClearTimeMsec: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty.Builder)
      .failoverConditions(failoverConditions.map(_.asJava).orNull)
      .secondaryInputId(secondaryInputId.orNull)
      .inputPreference(inputPreference.orNull)
      .errorClearTimeMsec(errorClearTimeMsec.orNull)
      .build()
}
