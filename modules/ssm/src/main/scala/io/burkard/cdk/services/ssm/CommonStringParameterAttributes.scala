package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonStringParameterAttributes {

  def apply(
    simpleName: Option[Boolean] = None,
    parameterName: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CommonStringParameterAttributes =
    (new software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.Builder)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterName(parameterName.orNull)
      .build()
}
