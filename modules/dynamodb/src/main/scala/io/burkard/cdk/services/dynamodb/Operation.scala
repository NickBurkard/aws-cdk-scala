package io.burkard.cdk.services.dynamodb

sealed abstract class Operation(val underlying: software.amazon.awscdk.services.dynamodb.Operation)
  extends Product
    with Serializable

object Operation {
  implicit def toAws(value: Operation): software.amazon.awscdk.services.dynamodb.Operation =
    Option(value).map(_.underlying).orNull

  case object BatchExecuteStatement
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.BATCH_EXECUTE_STATEMENT)

  case object BatchGetItem
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.BATCH_GET_ITEM)

  case object BatchWriteItem
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.BATCH_WRITE_ITEM)

  case object DeleteItem
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.DELETE_ITEM)

  case object ExecuteStatement
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.EXECUTE_STATEMENT)

  case object ExecuteTransaction
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.EXECUTE_TRANSACTION)

  case object GetItem
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.GET_ITEM)

  case object GetRecords
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.GET_RECORDS)

  case object PutItem
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.PUT_ITEM)

  case object Query
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.QUERY)

  case object Scan
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.SCAN)

  case object TransactGetItems
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.TRANSACT_GET_ITEMS)

  case object TransactWriteItems
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.TRANSACT_WRITE_ITEMS)

  case object UpdateItem
    extends Operation(software.amazon.awscdk.services.dynamodb.Operation.UPDATE_ITEM)
}
