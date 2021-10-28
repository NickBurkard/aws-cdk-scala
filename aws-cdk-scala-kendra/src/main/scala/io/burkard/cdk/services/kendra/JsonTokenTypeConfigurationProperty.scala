package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
