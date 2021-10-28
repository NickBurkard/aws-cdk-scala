package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StandardAttribute {

  def apply(
    mutable: Option[Boolean] = None,
    required: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.StandardAttribute =
    (new software.amazon.awscdk.services.cognito.StandardAttribute.Builder)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .required(required.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
