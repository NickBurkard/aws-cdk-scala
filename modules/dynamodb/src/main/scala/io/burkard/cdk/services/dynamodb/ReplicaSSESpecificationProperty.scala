package io.burkard.cdk.services.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicaSSESpecificationProperty {

  def apply(
    kmsMasterKeyId: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ReplicaSSESpecificationProperty.Builder)
      .kmsMasterKeyId(kmsMasterKeyId.orNull)
      .build()
}
