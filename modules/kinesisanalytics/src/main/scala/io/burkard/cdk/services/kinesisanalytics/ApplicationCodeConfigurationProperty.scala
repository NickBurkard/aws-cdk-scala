package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationCodeConfigurationProperty {

  def apply(
    codeContent: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty] = None,
    codeContentType: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder)
      .codeContent(codeContent.orNull)
      .codeContentType(codeContentType.orNull)
      .build()
}
