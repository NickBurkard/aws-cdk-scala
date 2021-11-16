package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggingConfigurationProps {

  def apply(
    resourceArn: String,
    logDestinationConfigs: List[String],
    redactedFields: Option[List[_]] = None,
    loggingFilter: Option[AnyRef] = None
  ): software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps =
    (new software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps.Builder)
      .resourceArn(resourceArn)
      .logDestinationConfigs(logDestinationConfigs.asJava)
      .redactedFields(redactedFields.map(_.asJava).orNull)
      .loggingFilter(loggingFilter.orNull)
      .build()
}
