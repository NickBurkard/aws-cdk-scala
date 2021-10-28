package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLoggerDefinitionVersion {

  def apply(
    internalResourceId: String,
    loggers: Option[List[_]] = None,
    loggerDefinitionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .loggers(loggers.map(_.asJava).orNull)
      .loggerDefinitionId(loggerDefinitionId.orNull)
      .build()
}
