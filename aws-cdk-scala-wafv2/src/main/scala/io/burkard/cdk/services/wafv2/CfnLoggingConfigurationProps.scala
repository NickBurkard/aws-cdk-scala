package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLoggingConfigurationProps {

  def apply(
    resourceArn: Option[String] = None,
    redactedFields: Option[List[_]] = None,
    logDestinationConfigs: Option[List[String]] = None,
    loggingFilter: Option[AnyRef] = None
  ): software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps =
    (new software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps.Builder)
      .resourceArn(resourceArn.orNull)
      .redactedFields(redactedFields.map(_.asJava).orNull)
      .logDestinationConfigs(logDestinationConfigs.map(_.asJava).orNull)
      .loggingFilter(loggingFilter.orNull)
      .build()
}
