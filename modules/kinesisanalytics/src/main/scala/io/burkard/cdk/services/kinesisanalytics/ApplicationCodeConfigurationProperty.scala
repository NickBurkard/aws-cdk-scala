package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationCodeConfigurationProperty {

  def apply(
    codeContent: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty,
    codeContentType: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder)
      .codeContent(codeContent)
      .codeContentType(codeContentType)
      .build()
}
