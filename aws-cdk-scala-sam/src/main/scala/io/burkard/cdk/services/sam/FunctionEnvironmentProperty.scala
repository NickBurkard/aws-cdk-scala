package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FunctionEnvironmentProperty {

  def apply(
    variables: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder)
      .variables(variables.map(_.asJava).orNull)
      .build()
}
