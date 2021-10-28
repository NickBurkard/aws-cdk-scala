package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EnvironmentProperty {

  def apply(
    variables: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty =
    (new software.amazon.awscdk.services.lambda.CfnFunction.EnvironmentProperty.Builder)
      .variables(variables.map(_.asJava).orNull)
      .build()
}
