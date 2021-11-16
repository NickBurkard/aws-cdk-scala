package io.burkard.cdk.services.ssmcontacts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContactTargetInfoProperty {

  def apply(
    contactId: String,
    isEssential: Boolean
  ): software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty =
    (new software.amazon.awscdk.services.ssmcontacts.CfnContact.ContactTargetInfoProperty.Builder)
      .contactId(contactId)
      .isEssential(isEssential)
      .build()
}
