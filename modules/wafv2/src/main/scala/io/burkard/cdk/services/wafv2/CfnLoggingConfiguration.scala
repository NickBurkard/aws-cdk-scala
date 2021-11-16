package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggingConfiguration {

  def apply(
    internalResourceId: String,
    resourceArn: String,
    logDestinationConfigs: List[String],
    redactedFields: Option[List[_]] = None,
    loggingFilter: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration =
    software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .resourceArn(resourceArn)
      .logDestinationConfigs(logDestinationConfigs.asJava)
      .redactedFields(redactedFields.map(_.asJava).orNull)
      .loggingFilter(loggingFilter.orNull)
      .build()
}
