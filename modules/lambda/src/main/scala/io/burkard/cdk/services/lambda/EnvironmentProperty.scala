package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentProperty {

  def apply(
    variables: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty =
    (new software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder)
      .variables(variables.map(_.asJava).orNull)
      .build()
}
