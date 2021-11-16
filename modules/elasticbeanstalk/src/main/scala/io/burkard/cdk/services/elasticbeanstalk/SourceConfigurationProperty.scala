package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfigurationProperty {

  def apply(
    applicationName: String,
    templateName: String
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty.Builder)
      .applicationName(applicationName)
      .templateName(templateName)
      .build()
}
