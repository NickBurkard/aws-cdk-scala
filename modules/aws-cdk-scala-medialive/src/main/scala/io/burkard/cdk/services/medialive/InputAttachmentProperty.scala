package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputAttachmentProperty {

  def apply(
    automaticInputFailoverSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AutomaticInputFailoverSettingsProperty] = None,
    inputAttachmentName: Option[String] = None,
    inputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty] = None,
    inputId: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputAttachmentProperty.Builder)
      .automaticInputFailoverSettings(automaticInputFailoverSettings.orNull)
      .inputAttachmentName(inputAttachmentName.orNull)
      .inputSettings(inputSettings.orNull)
      .inputId(inputId.orNull)
      .build()
}
