package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EBSOptionsProperty {

  def apply(
    volumeType: Option[String] = None,
    ebsEnabled: Option[Boolean] = None,
    iops: Option[Number] = None,
    volumeSize: Option[Number] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty.Builder)
      .volumeType(volumeType.orNull)
      .ebsEnabled(ebsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .volumeSize(volumeSize.orNull)
      .build()
}
