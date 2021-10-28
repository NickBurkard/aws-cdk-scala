package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EbuTtDDestinationSettingsProperty {

  def apply(
    fillLineGap: Option[String] = None,
    styleControl: Option[String] = None,
    fontFamily: Option[String] = None,
    copyrightHolder: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty.Builder)
      .fillLineGap(fillLineGap.orNull)
      .styleControl(styleControl.orNull)
      .fontFamily(fontFamily.orNull)
      .copyrightHolder(copyrightHolder.orNull)
      .build()
}
