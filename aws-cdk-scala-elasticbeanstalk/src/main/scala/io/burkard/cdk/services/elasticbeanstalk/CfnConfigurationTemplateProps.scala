package io.burkard.cdk.services.elasticbeanstalk

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationTemplateProps {

  def apply(
    platformArn: Option[String] = None,
    description: Option[String] = None,
    applicationName: Option[String] = None,
    solutionStackName: Option[String] = None,
    optionSettings: Option[List[_]] = None,
    environmentId: Option[String] = None,
    sourceConfiguration: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate.SourceConfigurationProperty] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps.Builder)
      .platformArn(platformArn.orNull)
      .description(description.orNull)
      .applicationName(applicationName.orNull)
      .solutionStackName(solutionStackName.orNull)
      .optionSettings(optionSettings.map(_.asJava).orNull)
      .environmentId(environmentId.orNull)
      .sourceConfiguration(sourceConfiguration.orNull)
      .build()
}
