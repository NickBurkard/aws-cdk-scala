package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterGroupProps {

  def apply(
    description: Option[String] = None,
    parameters: Option[Map[String, String]] = None,
    engine: Option[software.amazon.awscdk.services.rds.IEngine] = None
  ): software.amazon.awscdk.services.rds.ParameterGroupProps =
    (new software.amazon.awscdk.services.rds.ParameterGroupProps.Builder)
      .description(description.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}
