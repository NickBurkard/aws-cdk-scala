package io.burkard.cdk.services.elasticbeanstalk

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationTemplate {

  def apply(
    internalResourceId: String,
    applicationName: String,
    platformArn: Option[String] = None,
    description: Option[String] = None,
    solutionStackName: Option[String] = None,
    optionSettings: Option[List[_]] = None,
    environmentId: Option[String] = None,
    sourceConfiguration: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate =
    software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName)
      .platformArn(platformArn.orNull)
      .description(description.orNull)
      .solutionStackName(solutionStackName.orNull)
      .optionSettings(optionSettings.map(_.asJava).orNull)
      .environmentId(environmentId.orNull)
      .sourceConfiguration(sourceConfiguration.orNull)
      .build()
}
