package io.burkard.cdk.services.elasticbeanstalk

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationTemplate {

  def apply(
    internalResourceId: String,
    platformArn: Option[String] = None,
    description: Option[String] = None,
    applicationName: Option[String] = None,
    solutionStackName: Option[String] = None,
    optionSettings: Option[List[_]] = None,
    environmentId: Option[String] = None,
    sourceConfiguration: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate =
    software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.Builder
      .create(stackCtx, internalResourceId)
      .platformArn(platformArn.orNull)
      .description(description.orNull)
      .applicationName(applicationName.orNull)
      .solutionStackName(solutionStackName.orNull)
      .optionSettings(optionSettings.map(_.asJava).orNull)
      .environmentId(environmentId.orNull)
      .sourceConfiguration(sourceConfiguration.orNull)
      .build()
}
