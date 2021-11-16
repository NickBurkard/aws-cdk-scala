package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterGroupProps {

  def apply(
    engine: software.amazon.awscdk.services.rds.IEngine,
    description: Option[String] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.rds.ParameterGroupProps =
    (new software.amazon.awscdk.services.rds.ParameterGroupProps.Builder)
      .engine(engine)
      .description(description.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
