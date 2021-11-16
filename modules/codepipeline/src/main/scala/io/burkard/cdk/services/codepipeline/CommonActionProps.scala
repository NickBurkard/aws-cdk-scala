package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonActionProps {

  def apply(
    actionName: String,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None
  ): software.amazon.awscdk.services.codepipeline.CommonActionProps =
    (new software.amazon.awscdk.services.codepipeline.CommonActionProps.Builder)
      .actionName(actionName)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .build()
}
