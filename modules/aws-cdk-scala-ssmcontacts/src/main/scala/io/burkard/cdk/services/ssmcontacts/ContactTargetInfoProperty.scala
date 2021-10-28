package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContactTargetInfoProperty {

  def apply(
    contactId: Option[String] = None,
    isEssential: Option[Boolean] = None
  ): software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty.Builder)
      .contactId(contactId.orNull)
      .isEssential(isEssential.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
