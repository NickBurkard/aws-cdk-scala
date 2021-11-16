package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonStringParameterAttributes {

  def apply(
    parameterName: String,
    simpleName: Option[Boolean] = None
  ): software.amazon.awscdk.services.ssm.CommonStringParameterAttributes =
    (new software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.Builder)
      .parameterName(parameterName)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
