package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoggerDefinitionVersionProperty {

  def apply(
    loggers: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder)
      .loggers(loggers.map(_.asJava).orNull)
      .build()
}
