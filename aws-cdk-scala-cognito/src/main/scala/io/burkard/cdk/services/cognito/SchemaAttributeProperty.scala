package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SchemaAttributeProperty {

  def apply(
    stringAttributeConstraints: Option[software.amazon.awscdk.services.cognito.CfnUserPool.StringAttributeConstraintsProperty] = None,
    developerOnlyAttribute: Option[Boolean] = None,
    required: Option[Boolean] = None,
    attributeDataType: Option[String] = None,
    numberAttributeConstraints: Option[software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty] = None,
    name: Option[String] = None,
    mutable: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.SchemaAttributeProperty.Builder)
      .stringAttributeConstraints(stringAttributeConstraints.orNull)
      .developerOnlyAttribute(developerOnlyAttribute.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .required(required.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .attributeDataType(attributeDataType.orNull)
      .numberAttributeConstraints(numberAttributeConstraints.orNull)
      .name(name.orNull)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
