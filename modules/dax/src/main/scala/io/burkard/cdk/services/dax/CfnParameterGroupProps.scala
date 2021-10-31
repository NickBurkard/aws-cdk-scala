package io.burkard.cdk.services.dax

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParameterGroupProps {

  def apply(
    description: Option[String] = None,
    parameterNameValues: Option[AnyRef] = None,
    parameterGroupName: Option[String] = None
  ): software.amazon.awscdk.services.dax.CfnParameterGroupProps =
    (new software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder)
      .description(description.orNull)
      .parameterNameValues(parameterNameValues.orNull)
      .parameterGroupName(parameterGroupName.orNull)
      .build()
}
