package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLoggerDefinitionVersionProps {

  def apply(
    loggers: Option[List[_]] = None,
    loggerDefinitionId: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps.Builder)
      .loggers(loggers.map(_.asJava).orNull)
      .loggerDefinitionId(loggerDefinitionId.orNull)
      .build()
}
