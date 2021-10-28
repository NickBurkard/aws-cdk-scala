package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyLookupOptions {

  def apply(
    aliasName: Option[String] = None
  ): software.amazon.awscdk.services.kms.KeyLookupOptions =
    (new software.amazon.awscdk.services.kms.KeyLookupOptions.Builder)
      .aliasName(aliasName.orNull)
      .build()
}
