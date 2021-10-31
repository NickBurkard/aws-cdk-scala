package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfigurationProperty {

  def apply(
    applicationName: Option[String] = None,
    templateName: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder)
      .applicationName(applicationName.orNull)
      .templateName(templateName.orNull)
      .build()
}
