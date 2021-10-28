package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpApiAuthProperty {

  def apply(
    defaultAuthorizer: Option[String] = None,
    authorizers: Option[AnyRef] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty.Builder)
      .defaultAuthorizer(defaultAuthorizer.orNull)
      .authorizers(authorizers.orNull)
      .build()
}
