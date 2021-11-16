package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonTokenTypeConfigurationProperty {

  def apply(
    groupAttributeField: String,
    userNameAttributeField: String
  ): software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty.Builder)
      .groupAttributeField(groupAttributeField)
      .userNameAttributeField(userNameAttributeField)
      .build()
}
