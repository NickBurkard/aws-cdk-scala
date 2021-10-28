package io.burkard.cdk.services.sdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomain {

  def apply(
    internalResourceId: String,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sdb.CfnDomain =
    software.amazon.awscdk.services.sdb.CfnDomain.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .build()
}
