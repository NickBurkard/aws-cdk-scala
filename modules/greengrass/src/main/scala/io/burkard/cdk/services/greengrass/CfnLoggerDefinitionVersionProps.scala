package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggerDefinitionVersionProps {

  def apply(
    loggers: List[_],
    loggerDefinitionId: String
  ): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps.Builder)
      .loggers(loggers.asJava)
      .loggerDefinitionId(loggerDefinitionId)
      .build()
}
