package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyLookupOptions {

  def apply(
    aliasName: String
  ): software.amazon.awscdk.services.kms.KeyLookupOptions =
    (new software.amazon.awscdk.services.kms.KeyLookupOptions.Builder)
      .aliasName(aliasName)
      .build()
}
