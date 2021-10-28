package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatastorePartitionProperty {

  def apply(
    partition: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty] = None,
    timestampPartition: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty.Builder)
      .partition(partition.orNull)
      .timestampPartition(timestampPartition.orNull)
      .build()
}
