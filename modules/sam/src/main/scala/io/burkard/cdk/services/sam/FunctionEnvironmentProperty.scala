package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionEnvironmentProperty {

  def apply(
    variables: Map[String, String]
  ): software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder)
      .variables(variables.asJava)
      .build()
}
