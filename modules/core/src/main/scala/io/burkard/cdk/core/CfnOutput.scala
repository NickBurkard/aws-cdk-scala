package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOutput {

  def apply(
    internalResourceId: String,
    value: String,
    description: Option[String] = None,
    condition: Option[software.amazon.awscdk.CfnCondition] = None,
    exportName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnOutput =
    software.amazon.awscdk.CfnOutput.Builder
      .create(stackCtx, internalResourceId)
      .value(value)
      .description(description.orNull)
      .condition(condition.orNull)
      .exportName(exportName.orNull)
      .build()
}
