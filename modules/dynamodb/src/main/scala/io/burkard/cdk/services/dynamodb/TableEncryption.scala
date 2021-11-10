package io.burkard.cdk.services.dynamodb


sealed abstract class TableEncryption(val underlying: software.amazon.awscdk.services.dynamodb.TableEncryption)
  extends Product
    with Serializable


object TableEncryption {
  implicit def toAws(value: TableEncryption): software.amazon.awscdk.services.dynamodb.TableEncryption =
    Option(value).map(_.underlying).orNull

  case object Default
    extends TableEncryption(software.amazon.awscdk.services.dynamodb.TableEncryption.DEFAULT)

  case object CustomerManaged
    extends TableEncryption(software.amazon.awscdk.services.dynamodb.TableEncryption.CUSTOMER_MANAGED)

  case object AwsManaged
    extends TableEncryption(software.amazon.awscdk.services.dynamodb.TableEncryption.AWS_MANAGED)
}
