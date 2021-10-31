package io.burkard.cdk.services.dax

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParameterGroup {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    parameterNameValues: Option[AnyRef] = None,
    parameterGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dax.CfnParameterGroup =
    software.amazon.awscdk.services.dax.CfnParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .parameterNameValues(parameterNameValues.orNull)
      .parameterGroupName(parameterGroupName.orNull)
      .build()
}
