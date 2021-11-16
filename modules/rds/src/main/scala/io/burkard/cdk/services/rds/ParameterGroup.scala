package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterGroup {

  def apply(
    internalResourceId: String,
    engine: software.amazon.awscdk.services.rds.IEngine,
    description: Option[String] = None,
    parameters: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.ParameterGroup =
    software.amazon.awscdk.services.rds.ParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .engine(engine)
      .description(description.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
