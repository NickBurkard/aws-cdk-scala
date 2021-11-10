package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InvokeFunction {

  def apply(
    lambdaFunction: software.amazon.awscdk.services.lambda.IFunction,
    payload: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.InvokeFunction =
    software.amazon.awscdk.services.stepfunctions.tasks.InvokeFunction.Builder
      .create(lambdaFunction)
      .payload(payload.map(_.asJava).orNull)
      .build()
}
