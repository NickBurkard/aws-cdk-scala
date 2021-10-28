package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StringParameterAttributes {

  def apply(
    simpleName: Option[Boolean] = None,
    version: Option[Number] = None,
    parameterName: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.ssm.ParameterType] = None
  ): software.amazon.awscdk.services.ssm.StringParameterAttributes =
    (new software.amazon.awscdk.services.ssm.StringParameterAttributes.Builder)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .parameterName(parameterName.orNull)
      .`type`(`type`.orNull)
      .build()
}
