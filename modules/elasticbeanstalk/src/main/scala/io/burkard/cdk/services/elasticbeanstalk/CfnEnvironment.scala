package io.burkard.cdk.services.elasticbeanstalk

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnvironment {

  def apply(
    internalResourceId: String,
    environmentName: Option[String] = None,
    platformArn: Option[String] = None,
    tier: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty] = None,
    operationsRole: Option[String] = None,
    applicationName: Option[String] = None,
    templateName: Option[String] = None,
    solutionStackName: Option[String] = None,
    cnamePrefix: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    optionSettings: Option[List[_]] = None,
    versionLabel: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment =
    software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.Builder
      .create(stackCtx, internalResourceId)
      .environmentName(environmentName.orNull)
      .platformArn(platformArn.orNull)
      .tier(tier.orNull)
      .operationsRole(operationsRole.orNull)
      .applicationName(applicationName.orNull)
      .templateName(templateName.orNull)
      .solutionStackName(solutionStackName.orNull)
      .cnamePrefix(cnamePrefix.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .optionSettings(optionSettings.map(_.asJava).orNull)
      .versionLabel(versionLabel.orNull)
      .build()
}
