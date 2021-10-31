package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonTokenTypeConfigurationProperty {

  def apply(
    groupAttributeField: Option[String] = None,
    userNameAttributeField: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty.Builder)
      .groupAttributeField(groupAttributeField.orNull)
      .userNameAttributeField(userNameAttributeField.orNull)
      .build()
}
