package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterGroup {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    parameters: Option[Map[String, String]] = None,
    engine: Option[software.amazon.awscdk.services.rds.IEngine] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.ParameterGroup =
    software.amazon.awscdk.services.rds.ParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}
