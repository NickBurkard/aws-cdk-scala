package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaInvokeAction {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    userParametersString: Option[String] = None,
    lambda: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    outputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    variablesNamespace: Option[String] = None,
    inputs: Option[List[_ <: software.amazon.awscdk.services.codepipeline.Artifact]] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    userParameters: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction =
    software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction.Builder
      .create()
      .role(role.orNull)
      .userParametersString(userParametersString.orNull)
      .lambda(lambda.orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .inputs(inputs.map(_.asJava).orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .userParameters(userParameters.map(_.asJava).orNull)
      .build()
}
